package com.kldbj.ajks.home.mvp.ui.activity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;

import com.kldbj.ajks.R;
import com.kldbj.ajks.app.bean.JsonNanguaList;
import com.kldbj.ajks.home.mvp.bean.MVideo;
import com.kldbj.ajks.home.mvp.contract.MainContract;
import com.kldbj.ajks.home.mvp.presenter.MainPresenter;
import com.kldbj.ajks.player.mvp.ui.activity.PlayVideoActivity;
import com.kldbj.ajks.home.di.component.DaggerMainComponent;
import com.kldbj.ajks.home.mvp.bean.MVideo;
import com.kldbj.ajks.home.mvp.contract.MainContract;
import com.kldbj.ajks.home.mvp.presenter.MainPresenter;

import com.kldbj.ajks.player.mvp.ui.activity.PlayVideoActivity;
import com.tbruyelle.rxpermissions2.RxPermissions;


import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

import static com.jess.arms.utils.Preconditions.checkNotNull;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 07/24/2020 10:10
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View  , SwipeRefreshLayout.OnRefreshListener{

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerMainComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .view(this)
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_main; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }
    @BindView(R.id.contentView)
    SwipeRefreshLayout mSwipeRefreshLayout;

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @BindView(R.id.toolbar_back)
    View toolbar_back;

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        toolbar_back.setVisibility(View.INVISIBLE);
        final RxPermissions rxPermissions = new RxPermissions(this);
        rxPermissions
                .requestEachCombined(Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        Manifest.permission.READ_EXTERNAL_STORAGE)
                .subscribe(permission -> { // will emit 1 Permission object
                    if (permission.granted) {
                        mPresenter.getIndexList();
                        mPresenter.getUserInfo();
                    } else if (permission.shouldShowRequestPermissionRationale) {

                    } else {

                    }
                });

        mSwipeRefreshLayout.setOnRefreshListener(this);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter = new MVlistAdapter(R.layout.item_mvlist_video));
        adapter.setOnItemClickListener((adapter, view, position) -> {
            Intent intent = new Intent(MainActivity.this , PlayVideoActivity.class);
            intent.putExtra("data" ,(MVideo) adapter.getData().get(position));
            launchActivity(intent);
        });

        adapter.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() {
            @Override
            public void onLoadMoreRequested() {


            }
        }, recyclerView);
    }

    @Override
    public void showLoading(String key) {
        mSwipeRefreshLayout.setRefreshing(true);
    }

    @Override
    public void hideLoading() {
        mSwipeRefreshLayout.setRefreshing(false);
        adapter.loadMoreComplete();
    }
    @Override
    public void onRefresh() {

    }
    @Override
    public boolean isCancel() {
        return false;
    }

    @Override
    public void showMessage(@NonNull String message) {
        checkNotNull(message);
        ArmsUtils.snackbarText(message);
    }

    @Override
    public void launchActivity(@NonNull Intent intent) {
        checkNotNull(intent);
        ArmsUtils.startActivity(intent);
    }

    @Override
    public void killMyself() {
        finish();
    }

    @Override
    public void showToken(String token) {

    }
    MVlistAdapter adapter;
    @Override
    public void showMVListRecomm(List<MVideo> videoList) {

    }

    @Override
    public void showMoreMVListRecomm(List<MVideo> list) {

    }

    @Override
    public void showNanguaList(List<JsonNanguaList.ListBeanX> list) {
            List<JsonNanguaList.ListBeanX.ListBean> listBeans = new ArrayList<>();
            for (JsonNanguaList.ListBeanX lx: list){
                listBeans.addAll(lx.getList());
            }
            adapter.addData(listBeans);
    }


    @OnClick({R.id.button   })
    public void onViewClicked(View view) {
       // mPresenter.getPlayUrl();
        startActivity(new Intent(this,PlayVideoActivity.class));
    }


}
