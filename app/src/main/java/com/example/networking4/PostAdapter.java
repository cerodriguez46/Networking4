package com.example.networking4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {

    private Context mContext;
    ArrayList<PostModel> postModelArrayList = new ArrayList<PostModel>();

    public PostAdapter(Context mContext, ArrayList<PostModel> postModelArrayList) {
        this.mContext = mContext;
        this.postModelArrayList = postModelArrayList;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_item, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
PostModel postModel = postModelArrayList.get(position);
holder.tv1.setText(postModel.getId());
        holder.tv2.setText(postModel.getUrl());
        holder.tv3.setText(postModel.getComments());
        holder.tv4.setText(postModel.getTitle());
        holder.tv5.setText(postModel.getSlug());
        holder.tv6.setText(postModel.getImage());
        holder.tv7.setText(postModel.getBody());
        holder.tv8.setText(postModel.getCreated());
        holder.tv9.setText(postModel.getUpdated());

        holder.data1.setText(postModel.getDataId());
        holder.dataUrl.setText(postModel.getDataUrl());
        holder.dataEmail.setText(postModel.getDataEmail());
        holder.dataEmailVerification.setText(postModel.getDataEmailVerif());
        holder.dataCreated.setText(postModel.getDataCreate());
        holder.dataUpdated.setText(postModel.getDataUpdate());

        holder.total.setText(postModel.getTotal());
        holder.count.setText(postModel.getCount());
        holder.perPage.setText(postModel.getPerPage());
        holder.currentPage.setText(postModel.getCurrentPage());
        holder.totalPages.setText(postModel.getTotalPage());
        holder.nextLink.setText(postModel.getNext());
    }

    @Override
    public int getItemCount() {
        return postModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv1;
        TextView tv2;
        TextView tv3;
        TextView tv4;
        TextView tv5;
        TextView tv6;
        TextView tv7;
        TextView tv8;
        TextView tv9;

        TextView data1;
        TextView dataUrl;
        TextView dataName;
        TextView dataEmail;
        TextView dataEmailVerification;
        TextView dataCreated;
        TextView dataUpdated;

        TextView total;
        TextView count;
        TextView perPage;
        TextView currentPage;
        TextView totalPages;
        TextView nextLink;

        public ViewHolder(View itemView) {
            super(itemView);
            tv1 = itemView.findViewById(R.id.textView);
            tv2 = itemView.findViewById(R.id.textView2);
            tv3 = itemView.findViewById(R.id.textView3);
            tv4 = itemView.findViewById(R.id.textView4);
            tv5 = itemView.findViewById(R.id.textView5);
            tv6 = itemView.findViewById(R.id.textView6);
            tv7 = itemView.findViewById(R.id.textView7);
            tv8 = itemView.findViewById(R.id.textView8);
            tv9 = itemView.findViewById(R.id.textView9);

            data1 = itemView.findViewById(R.id.textView10);
            dataUrl = itemView.findViewById(R.id.textView11);
            dataName = itemView.findViewById(R.id.textView12);
            dataEmail = itemView.findViewById(R.id.textView13);
            dataEmailVerification = itemView.findViewById(R.id.textView14);
            dataCreated = itemView.findViewById(R.id.textView15);
            dataUpdated = itemView.findViewById(R.id.textView16);

            total = itemView.findViewById(R.id.textView17);
            count = itemView.findViewById(R.id.textView18);
            perPage = itemView.findViewById(R.id.textView19);
            currentPage = itemView.findViewById(R.id.textView20);
            totalPages = itemView.findViewById(R.id.textView21);
            nextLink = itemView.findViewById(R.id.textView22);
        }
    }
}
