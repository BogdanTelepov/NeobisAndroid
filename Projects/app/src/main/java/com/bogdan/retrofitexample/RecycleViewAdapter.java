package com.bogdan.retrofitexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;


import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bogdan.retrofitexample.Book;
import com.bogdan.retrofitexample.MainActivity;
import com.bogdan.retrofitexample.R;
import com.bumptech.glide.Glide;


import java.util.ArrayList;
import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {

    ArrayList<Book> mBook;
    private static OnItemClickListener mListener;
    MainActivity mContext;

    public interface OnItemClickListener {
        void onItemClick(Book book);
    }

    public RecycleViewAdapter(MainActivity context, ArrayList<Book> book, OnItemClickListener listener) {
        mContext = context;
        mBook = book;
        mListener = listener;
    }

    @NonNull
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Book book = mBook.get(position);

        holder.bookTitleTextView.setText(book.getTitle());
        holder.bookAuthorTextView.setText((CharSequence) book.getAuthors());
        holder.bookPublisherTextView.setText(book.getPublishedDate());

        Glide.with(mContext).load(book.getSmallThumbnail()).into(holder.bookThumbnailImageView);

        holder.bind(mBook.get(position), mListener);
    }

    @Override
    public int getItemCount() {
        return mBook.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView bookThumbnailImageView;
        TextView bookTitleTextView;
        TextView bookAuthorTextView;
        TextView bookPublisherTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            bookThumbnailImageView = itemView.findViewById(R.id.cover_book_image_view);
            bookTitleTextView = itemView.findViewById(R.id.book_title_text_view);
            bookAuthorTextView = itemView.findViewById(R.id.book_author_text_view);
            bookPublisherTextView = itemView.findViewById(R.id.book_date_text_view);
        }

        public void bind(final Book book, final OnItemClickListener listener) {
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(book);
                }
            });
        }
    }

    public void clear() {
        mBook.clear();
        notifyDataSetChanged();
    }

    public void addAll(List<Book> book) {
        mBook.addAll(book);
        notifyDataSetChanged();
    }

}
