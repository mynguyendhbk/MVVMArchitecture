package edu.nguyenmy.mvvmarchitecture.viewmodel;

import android.content.Context;
import android.databinding.ObservableInt;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import edu.nguyenmy.mvvmarchitecture.model.ItemVegetable;

/**
 * Created by DELL on 10/26/2017.
 */

public class ItemViewModel  {
    public ObservableInt mRecyclerView;
    private Context mContext;

    private List<ItemVegetable> itemVegetables;

    public ItemViewModel(Context context){
        this.mContext = context;
        mRecyclerView = new ObservableInt(View.VISIBLE);

    }
    public void addData(){
        mRecyclerView.set(View.VISIBLE);
        itemVegetables = new ArrayList<>();
        itemVegetables.add(new ItemVegetable("ca rot", "19.000VND"));
        itemVegetables.add(new ItemVegetable("ca rot", "19.000VND"));
        itemVegetables.add(new ItemVegetable("ca rot", "19.000VND"));
        itemVegetables.add(new ItemVegetable("ca rot", "19.000VND"));
        itemVegetables.add(new ItemVegetable("ca rot", "19.000VND"));
        itemVegetables.add(new ItemVegetable("ca rot", "19.000VND"));
    }

}
