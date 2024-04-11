package com.example.fixify.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fixify.Objects.CardObject;
import com.example.fixify.Payment.PaymentActivity;
import com.example.fixify.R;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {

    private List<CardObject> itemArrayList;
    private Context context;

    public CardAdapter(List<CardObject> itemArrayList, Context context) {
        this.itemArrayList = itemArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        return new ViewHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CardObject card = itemArrayList.get(position);
        holder.mName.setText(card.getName());
        holder.mNumber.setText("**** **** **** " + card.getLastDigits());
        holder.mDate.setText(card.getExpMonth() + "/" + card.getExpYear());

        int cardImageResource = R.drawable.ic_credit_card_black_24dp;
        switch (card.getBrand()) {
            case "visa":
                cardImageResource = R.drawable.ic_visa;
                break;
            case "American Express":
                cardImageResource = R.drawable.ic_visa;
                break;
            case "mastercard":
                cardImageResource = R.drawable.ic_visa;
                break;
            case "discover":
                cardImageResource = R.drawable.ic_visa;
                break;
            case "jcb":
                cardImageResource = R.drawable.ic_visa;
                break;
        }
        holder.mCard.setImageResource(cardImageResource);

        holder.mDefault.setVisibility(card.getDefaultCard() ? View.VISIBLE : View.INVISIBLE);

        holder.mLayout.setOnClickListener(v -> {
            if (context instanceof PaymentActivity) {
                ((PaymentActivity) context).initializeBottomSheetDialog(card);
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemArrayList != null ? itemArrayList.size() : 0;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView mName, mNumber, mDate;
        ImageView mCard, mDefault;
        LinearLayout mLayout;

        ViewHolder(View itemView) {
            super(itemView);
            mCard = itemView.findViewById(R.id.card_image);
            mNumber = itemView.findViewById(R.id.number_text);
            mName = itemView.findViewById(R.id.name_text);
            mDate = itemView.findViewById(R.id.date_text);
            mLayout = itemView.findViewById(R.id.card_layout);
            mDefault = itemView.findViewById(R.id.default_image);
        }
    }
}
