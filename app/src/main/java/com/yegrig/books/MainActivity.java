package com.yegrig.books;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.yegrig.books.fragment.BookDetailsFragment;
import com.yegrig.books.fragment.BookFragment;

public class MainActivity extends AppCompatActivity {

    private static FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        if(savedInstanceState == null)
        {
            fragmentManager.beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.main, new BookFragment(), null)
                    .commit();
        }
    }

    public static void openDetails(int position)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("position", position);

        BookDetailsFragment bookDetailsFragment = new BookDetailsFragment();
        bookDetailsFragment.setArguments(bundle);

        fragmentManager.beginTransaction()
                .replace(R.id.main, bookDetailsFragment)
                .setReorderingAllowed(true)
                .addToBackStack("detail")
                .commit();
    }
}