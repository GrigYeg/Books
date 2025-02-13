package com.yegrig.books.book;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yegrig.books.MainActivity;
import com.yegrig.books.R;

import javax.inject.Inject;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {

    @Inject
    BookRepository bookRepository;
    private final LayoutInflater inflater;

    public BookAdapter(Context context)
    {
        this.inflater = LayoutInflater.from(context);
    }

    public static class BookViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView one;
        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.text_view_title);
            one = itemView.findViewById(R.id.text_view_one);
        }
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.book_view, parent, false);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        Book book = bookRepository.getBooks().get(position);
        holder.one.setText(book.getTitle());
        holder.itemView.setOnClickListener(view -> MainActivity.openDetails(position));
    }

    @Override
    public int getItemCount() {
        return bookRepository.getBooks().size();
    }
}
