package com.kbz.hms.eventlistfromeventbrite.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kbz.hms.eventlistfromeventbrite.R;
import com.kbz.hms.eventlistfromeventbrite.delegates.EventItemDelegate;
import com.kbz.hms.eventlistfromeventbrite.views.holders.EventListsViewHolder;

public class EventListAdapter extends RecyclerView.Adapter {

    private EventItemDelegate meventItemDelegate;

    public EventListAdapter(EventItemDelegate eventItemDelegate){
        meventItemDelegate = eventItemDelegate;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.view_item_event_lists, viewGroup, false);
        return new EventListsViewHolder(itemView, meventItemDelegate);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }
}
