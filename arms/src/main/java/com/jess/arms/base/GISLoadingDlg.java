package com.jess.arms.base;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;

import java.util.HashMap;

/**
 * Created by weiyongzhi on 2017/4/27.
 */

public class GISLoadingDlg extends ProgressDialog {


    private   String key = null;
    private    HashMap<String , Boolean> task = new HashMap<>();

    public GISLoadingDlg(Context context) {
        super(context);

    }
    public void setLoadingMessage(String msg) {
        setMessage(msg);
        setOnCancelListener(new OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialog) {
                task.remove(key);
            }
        });
    }
    
    public void show(String net) {
        super.show();
        key = net ;
        task.put(net , true);
    }
    @Override
    public void dismiss() {
        super.dismiss();
        task.remove(key);
    }

    public boolean isCancel(String key){
        if (task.get(key) != null){
            return false;
        }
        return true;
    }


}
