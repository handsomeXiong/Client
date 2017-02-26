package com.xiong.wenwen;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by xiong on 16.12.9.
 */
public class Book implements Parcelable {
    String name;
    int id;

    public void setName(String name) {
        this.name = name;
    }

    public Book(String name, int id) {
        this.name = name;
        this.id = id;
    }

    protected Book(Parcel in) {
        name = in.readString();
        id = in.readInt();
    }

    public static final Creator<Book> CREATOR = new Creator<Book>() {
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
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(id);
    }

    public void readFromParcel(Parcel in){
        name = in.readString();
        id = in.readInt();
    }
}
