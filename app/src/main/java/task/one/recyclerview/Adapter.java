package task.one.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends  RecyclerView.Adapter<Adapter.ProductViewHolder> {

    private Context mCtx;
    private List<Desc>descList;

    public Adapter(Context mCtx, List<Desc> descList) {
        this.mCtx = mCtx;
        this.descList = descList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_layout, null);
        ProductViewHolder holder = new ProductViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {

        Desc desc = descList.get(position);

        holder.textViewTitle.setText(desc.getTitle());
        holder.textViewDesc.setText(desc.getShortdesc());
        holder.textViewRating.setText(String.valueOf(desc.getRating()));
        holder.textViewPrice.setText(String.valueOf(desc.getPrice()));

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(desc.getImage()));

    }

    @Override
    public int getItemCount() {
        return descList.size();
    }

    class  ProductViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textViewTitle, textViewDesc, textViewRating, textViewPrice;

        public ProductViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
        }
    }
}
