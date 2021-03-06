package com.example.guru.bookingku.Activity.History;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.example.guru.bookingku.R;
import com.github.vipulasri.timelineview.TimelineView;

/**
 * Created by HP-HP on 05-12-2015.
 */
public class TimeLineViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.text_timeline_date)
    TextView mDate;
    @BindView(R.id.text_timeline_title)
    TextView mMessage;

    public TimeLineViewHolder(View itemView, int viewType) {
        super(itemView);

        ButterKnife.bind(this, itemView);
    }
}
