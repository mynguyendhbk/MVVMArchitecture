package edu.nguyenmy.mvvmarchitecture;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import edu.nguyenmy.mvvmarchitecture.databinding.ActivityMainBinding;
import edu.nguyenmy.mvvmarchitecture.view.ItemAdapter;
import edu.nguyenmy.mvvmarchitecture.viewmodel.ItemViewModel;

public class MainActivity extends AppCompatActivity  {

    public ActivityMainBinding mActivityMainBinding;
    private ItemViewModel mItemViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataBinding();
    }

    private void initDataBinding() {
        mActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mItemViewModel= new ItemViewModel(this);
        setupRecyclerView(mActivityMainBinding.rcView);
        mItemViewModel.addData();

    }

    private void setupRecyclerView(RecyclerView recyclerView){
        ItemAdapter adapter = new ItemAdapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
