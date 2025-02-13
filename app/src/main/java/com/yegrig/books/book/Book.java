package com.yegrig.books.book;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Book implements Parcelable {
    private final String title;
    private final String author;
    private final String desc;

    protected Book(String Title, String Author, String Desc)
    {
        title = Title;
        author = Author;
        desc = Desc;
    }
    protected Book(Parcel in)
    {
        title = in.readString();
        author = in.readString();
        desc = in.readString();
    }

    public static final Creator<Book> CREATOR = new Creator<>()
    {
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };

    @Override
    public int describeContents()
    {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags)
    {
        dest.writeString(title);
        dest.writeString(author);
        dest.writeString(desc);
    }

    public String getAuthor() {return author;}
    public String getDesc() {return desc;}
    public String getTitle() {return title;}
}
