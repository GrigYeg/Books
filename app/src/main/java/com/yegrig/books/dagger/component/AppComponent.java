package com.yegrig.books.dagger.component;

import com.yegrig.books.book.BookAdapter;
import com.yegrig.books.book.BookRepository;
import com.yegrig.books.dagger.module.NetworkModule;
import com.yegrig.books.dagger.module.StorageModule;
import com.yegrig.books.fragment.BookDetailsFragment;
import com.yegrig.books.fragment.BookFragment;

import dagger.Component;

@Component(modules = {StorageModule.class, NetworkModule.class}, dependencies = {BookRepository.class, BookAdapter.class})
public interface AppComponent {
    void injectsBookAdapter(BookAdapter bookAdapter);
    void injectsBookFragment(BookFragment bookFragment);
    void injectsBookDetailsFragment(BookDetailsFragment bookDetailsFragment);
}
