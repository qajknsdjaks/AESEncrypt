package com.kldbj.ajks.home.mvp.ui.activity;

import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.kldbj.ajks.home.mvp.bean.MVideo;
import com.kldbj.ajks.R;
import com.kldbj.ajks.home.mvp.bean.MVideo;

public class MVlistAdapter extends BaseQuickAdapter<MVideo, BaseViewHolder> {

    public MVlistAdapter(int layoutResId) {
        super(layoutResId);
    }
    @Override
    protected void convert(BaseViewHolder helper, MVideo item) {
        helper.setText(R.id.title ,item.getTitle() );

        ImageView imageView = helper.getView(R.id.img);

        Glide.with(imageView).load(item.getThumb_cover()).transition(new DrawableTransitionOptions().crossFade(300)).into(imageView);


    }
}