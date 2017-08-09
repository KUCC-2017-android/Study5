package kr.ac.korea.kucc.study;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Memo> itemList = new ArrayList<>();
    private CustomAdapter adapter;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        editText = (EditText) findViewById(R.id.edit);
        adapter = new CustomAdapter(itemList);
        recyclerView.setAdapter(adapter);
    }

    public void onAddButtonClick(View v) {
        Memo item = new Memo(editText.getText().toString(), Calendar.getInstance());
        itemList.add(item);
        editText.setText("");
        adapter.notifyDataSetChanged();
    }
}
