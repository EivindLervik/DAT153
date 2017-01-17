package no.hvl.dat153.oblig1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainMenu extends AppCompatActivity {

    public List<Person> persons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        if(persons == null){
            persons = new ArrayList<>();
            persons.add(new Person());
            persons.add(new Person());
            persons.add(new Person());
        }

    }
}
