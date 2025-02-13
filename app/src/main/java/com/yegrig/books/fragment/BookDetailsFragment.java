package com.yegrig.books.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.yegrig.books.App;
import com.yegrig.books.R;
import com.yegrig.books.book.Book;
import com.yegrig.books.book.BookRepository;

import javax.inject.Inject;

public class BookDetailsFragment extends Fragment {

    @Inject
    BookRepository bookRepository;
    Book displayedBook;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        App.getComponent().injectsBookDetailsFragment(this);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.book_details_fragment, container, false);
        if(getArguments() != null)
        {
            displayedBook = bookRepository.getBookById(getArguments().getInt("position"));

            TextView title = view.findViewById(R.id.title_text_view);
            title.setText(displayedBook.getTitle());

            TextView author = view.findViewById(R.id.author_text_view);
            author.setText(displayedBook.getAuthor());

            TextView desc = view.findViewById(R.id.desc_text_view);
            desc.setText(displayedBook.getDesc());
        }

        return view;
    }
}
