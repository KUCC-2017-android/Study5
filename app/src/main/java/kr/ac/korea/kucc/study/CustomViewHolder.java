package kr.ac.korea.kucc.study;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by ffaass on 2017-08-07.
 */

public class CustomViewHolder  extends RecyclerView.ViewHolder {
    public TextView memoView;
    public TextView dateView;
    public CustomViewHolder(View itemView) {
        super(itemView);
        memoView = (TextView) itemView.findViewById(R.id.item_memo);
        dateView = (TextView) itemView.findViewById(R.id.item_date);
    }
}
