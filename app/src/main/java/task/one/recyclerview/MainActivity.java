package task.one.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Adapter adapter;

    List<Desc> descList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        descList = new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.parent);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager( (new LinearLayoutManager(this)));

        descList = new ArrayList<>();


        //adding some items to our list
        descList.add(
                new Desc(
                        1,
                        "Nyanta",
                        "Log Horizon",
                        4.3,
                        60000,
                        R.drawable.nyanta));

        descList.add(
                new Desc(
                        1,
                        "Shiroe",
                        "Log Horizon",
                        4.3,
                        60000,
                        R.drawable.shiroe));

        descList.add(
                new Desc(
                        1,
                        "kon",
                        "Tokyo Raven",
                        4.3,
                        60000,
                        R.drawable.kon));
    adapter = new Adapter(this, descList);
    recyclerView.setAdapter(adapter);
    }
}
