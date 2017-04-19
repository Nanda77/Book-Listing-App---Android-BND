package com.example.android.booklisting;

/**
 * Created by Nanda on 16/11/16.
 */

public class Book {

    //Initialising Variables

    private String mBookTitle;
    private String mBookAuthor;
    private String mBookPublisher;

    // Public Constructor

    public Book(String mBookTitle, String mBookAuthor, String mBookPublisher) {
        this.mBookTitle = mBookTitle;
        this.mBookAuthor = mBookAuthor;
        this.mBookPublisher = mBookPublisher;
    }

    // Getter Methods

    public String getmBookTitle() {
        return mBookTitle;
    }

    public String getmBookAuthor() {
        return mBookAuthor;
    }

    public String getmBookPublisher() {
        return mBookPublisher;
    }
}
