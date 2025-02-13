package com.yegrig.books;

import android.app.Application;

import com.yegrig.books.book.BookAdapter;
import com.yegrig.books.book.BookRepository;
import com.yegrig.books.book.BookRepositoryImpl;
import com.yegrig.books.dagger.component.AppComponent;
import com.yegrig.books.dagger.component.DaggerAppComponent;
import com.yegrig.books.dagger.module.NetworkModule;
import com.yegrig.books.dagger.module.StorageModule;

public class App extends Application {
    private static AppComponent component;
    private BookAdapter adapter;
    private BookRepository bookRepository;
    private NetworkModule networkModule;
    private StorageModule storageModule;

    @Override
    public void onCreate() {
        super.onCreate();
        adapter = new BookAdapter(this);
        bookRepository = new BookRepositoryImpl();
        component = DaggerAppComponent.builder().
                bookAdapter(adapter).
                bookRepository(bookRepository).
                build();
        component.injectsBookAdapter(adapter);
    }

    public static AppComponent getComponent()
    {
        return component;
    }

}