package com.panghaha.it.fileuploaddemo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;


import java.util.List;

/**
 * Created by pang on 2017/4/10.
 *  listview复用适配器 待办任务
 */
public class myAdapter extends BaseAdapter {

    private String userid,taskid;
    private int iszhiding;
    private List<Data_huoqurenwuxiangqing.ListAccBean> list2;

    private Data_huoqurenwuxiangqing.ListAccBean data;

    private Context context;

    public myAdapter(Context context, List<Data_huoqurenwuxiangqing.ListAccBean> list2) {
        this.context = context;
        this.list2 = list2;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public List<Data_huoqurenwuxiangqing.ListAccBean> getList2() {
        return list2;
    }

    public void setList2(List<Data_huoqurenwuxiangqing.ListAccBean> list2) {
        this.list2 = list2;
    }

    @Override
    public int getCount() {
        if (list2!=null&&list2.size()>0){
            return list2.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return list2.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder = new ViewHolder();
        if (convertView == null) {
            convertView = View.inflate(context,R.layout.item, null);

           holder.fujiantext = (TextView) convertView.findViewById(R.id.fujiantext);
            holder.layout = (RelativeLayout) convertView.findViewById(R.id.layout);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();

        }
        data = list2.get(position);

        holder.fujiantext.setText(data.getFileName());
        final String url = data.getFileaddressdown();
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent();
                intent.setAction("android.intent.action.VIEW");
                Uri content_url = Uri.parse(url);
                intent.setData(content_url);
                context.startActivity(intent);
            }
        });

        return convertView;
    }


    static class ViewHolder {
        //listview参数
        public TextView fujiantext;//任务名
        public RelativeLayout layout;
    }

}
