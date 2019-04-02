package com.qodeigence.prakash.ecommerce.ViewHolder;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.qodeigence.prakash.ecommerce.Interface.ItemClickListener;
import com.qodeigence.prakash.ecommerce.R;

@TargetApi(Build.VERSION_CODES.M)
public class OrderViewHolder extends RecyclerView.ViewHolder implements View.OnContextClickListener {

    public TextView txtOrderId;
    public TextView txtOrderStatus;
    public TextView txtOrderPhone;
    public TextView txtOrderAddress;

    private ItemClickListener itemClickListener;

    public OrderViewHolder(View itemView) {
        super(itemView);
        txtOrderAddress = (TextView)itemView.findViewById(R.id.order_address);
        txtOrderPhone = (TextView)itemView.findViewById(R.id.order_phone);
        txtOrderStatus = (TextView)itemView.findViewById(R.id.order_status);
        txtOrderId = (TextView)itemView.findViewById(R.id.order_id);

        //  itemView.setOnClickListener((View.OnClickListener) OrderViewHolder.this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public boolean onContextClick(View view) {
        itemClickListener.onClick(view,getAdapterPosition(),false);
        return false;
    }
}
