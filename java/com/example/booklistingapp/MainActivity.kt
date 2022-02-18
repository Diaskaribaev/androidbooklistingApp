package com.example.booklistingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.ListView

import android.widget.Toast
import android.widget.SearchView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Arrayadpater:BookAdapter;
        val book = ArrayList<Book>()
        book.add(Book(R.drawable.harry_poter_secret_stone,"J.K Rowling", "Harry Potter Secret Stone","EN","39.99$"))
        book.add(Book(R.drawable.the_richest_man,"George S.Clason", "The richest man in Babylon","EN","45.99$"))
        book.add(Book(R.drawable.the_jungle_book,"Rudyard Kipling", "The jungle book","EN","50.99$"))
        book.add(Book(R.drawable.the_secret_garden,"Inga Moore", "The Secret Garden","EN","30.99$"))
        book.add(Book(R.drawable.the_naruto,"Masashi Kishimoto", "Naruto volume 4 ","EN","60.99$"))




        val listView = findViewById<ListView>(R.id.listView)
        Arrayadpater = BookAdapter(
            this,
            book,

            )
        listView.adapter= Arrayadpater


           val searchView = findViewById<SearchView>(R.id.searchView)


          searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
          override fun onQueryTextSubmit(p0: String?): Boolean {
               return false
           }
           override fun onQueryTextChange(p0: String?): Boolean {
               Arrayadpater.filter.filter(p0)
               return true
            }

           })











//        val searchView = findViewById<SearchView>(R.id.searchView)
//
//        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
//            override fun onQueryTextSubmit(p0: String?): Boolean {
//                return false
//            }
//
//            override fun onQueryTextChange(p0: String?): Boolean {
//                Arrayadpater.filter.filter(p0)
//                return true
//            }
//
//
//        })



//        searchView.clearFocus()
//        if (book.containsAll(book)){
//            Arrayadpater.filter.filter(p0)
//        }else{
//            Toast.makeText(applicationContext,"Book not found",Toast.LENGTH_LONG).show()
//        }














    }
}