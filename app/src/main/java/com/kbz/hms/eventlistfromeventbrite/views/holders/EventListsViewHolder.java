package com.kbz.hms.eventlistfromeventbrite.views.holders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.kbz.hms.eventlistfromeventbrite.delegates.EventItemDelegate;

public class EventListsViewHolder extends RecyclerView.ViewHolder {

    public EventItemDelegate mDelegate;




    public EventListsViewHolder(@NonNull View itemView, @NonNull EventItemDelegate eventItemDelegate) {
        super(itemView);
        mDelegate = eventItemDelegate;
    }
}
