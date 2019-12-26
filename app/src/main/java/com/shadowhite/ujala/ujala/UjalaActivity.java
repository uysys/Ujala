package com.shadowhite.ujala.ujala;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.shadowhite.ujala.R;

public class UjalaActivity extends AppCompatActivity {
private RecyclerView specialCoursesRecyclerview;
private RecyclerView courseRecyclerView;
private SpecialItemAdapter mSpecialAdapter;
private CourseItemAdapter mCourseItemAdapter;
private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ujala);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        specialCoursesRecyclerview=findViewById(R.id.recycleview_special_course);
        courseRecyclerView=findViewById(R.id.recyclerview_courses);

        mSpecialAdapter=new SpecialItemAdapter();
        mCourseItemAdapter=new CourseItemAdapter();

        specialCoursesRecyclerview.setAdapter(mSpecialAdapter);
        specialCoursesRecyclerview.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        courseRecyclerView.setAdapter(mCourseItemAdapter);
        courseRecyclerView.setLayoutManager(new LinearLayoutManager(UjalaActivity.this));
    }
}
