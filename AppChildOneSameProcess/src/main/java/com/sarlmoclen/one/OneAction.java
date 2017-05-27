package com.sarlmoclen.one;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.sarlmoclen.router.SAction;

import java.util.HashMap;

/**
 * Created by sarlmoclen on 2017/5/25.
 */

public class OneAction extends SAction{

    @Override
    public Object invoke(Context context, HashMap<String, Object> requestData) {
        if(context instanceof Activity){
            Intent i = new Intent(context, ChildActivity.class);
            i.putExtra("from",requestData.get("from").toString());
            context.startActivity(i);
        }else{
            Intent i = new Intent(context, ChildActivity.class);
            i.putExtra("from",requestData.get("from").toString());
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);
        }
        return "arrive one success!";
    }

}
