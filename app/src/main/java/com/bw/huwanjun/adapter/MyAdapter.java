package com.bw.huwanjun.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bw.huwanjun.R;
import com.bw.huwanjun.bean.GoodsBean;
import com.bw.huwanjun.net.ApiService;
import com.bw.huwanjun.net.RetrofitUtil;

import java.util.List;

/**
 * author: 斛万珺
 * data: 2020/3/17 10:10:55
 * function:
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<GoodsBean.DataBean> data;

    public MyAdapter(List<GoodsBean.DataBean> data) {

        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//绑定布局
        View inflate = View.inflate(parent, R.layout.item_layout, null);
        return new MyViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
//绑定数据
        List<GoodsBean.DataBean.ShopsBean> shops = data.get(position).getShops();
        String name = shops.get(position).getName();
        String imageUrl = shops.get(position).getImageUrl();

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
//找控件
        ImageView img;
        TextView text_name;
        public MyViewHolder(View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.img);
            text_name= itemView.findViewById(R.id.text_name)
        }
    }
}
