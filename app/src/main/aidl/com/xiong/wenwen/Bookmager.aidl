// Bookmager.aidl
package com.xiong.wenwen;
import com.xiong.wenwen.Book;
// Declare any non-default types here with import statements

interface Bookmager {
    Book goBooks();
    void toBooks(in String name );
}
