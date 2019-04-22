package com.qodeigence.prakash.ecommerce.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.qodeigence.prakash.ecommerce.Interface.ItemClickListener;
import com.qodeigence.prakash.ecommerce.R;

public class OrderViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txtOrderId, txtOrderStatus, txtOrderPhone, txtOrderAddres;

    private ItemClickListener itemClickListener;

    public OrderViewHolder(View itemView) {
        super(itemView);

        txtOrderAddres = itemView.findViewById(R.id.order_addres);
        txtOrderId = itemView.findViewById(R.id.order_id);
        txtOrderStatus = itemView.findViewById(R.id.order_status);
        txtOrderPhone = itemView.findViewById(R.id.order_phone);

        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v, getAdapterPosition(),false);
    }
}
