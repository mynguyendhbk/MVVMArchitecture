package edu.nguyenmy.mvvmarchitecture.view;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import edu.nguyenmy.mvvmarchitecture.R;
import edu.nguyenmy.mvvmarchitecture.databinding.ItemVegetableBinding;
import edu.nguyenmy.mvvmarchitecture.model.ItemVegetable;


/**
 * Created by DELL on 10/26/2017.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder>{
    private List<ItemVegetable> mVegetableList;

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemVegetableBinding itemVegetableBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.item_vegetable,parent, false);
        return new ItemViewHolder(itemVegetableBinding);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.bindVegetable(mVegetableList.get(position));
    }

    @Override
    public int getItemCount() {
        return mVegetableList.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder{
      ItemVegetableBinding mItemVegetableBinding;
        public ItemViewHolder (ItemVegetableBinding itemVegetableBinding){
            super(itemVegetableBinding.getRoot());
            this.mItemVegetableBinding = itemVegetableBinding;
        }
        public void bindVegetable(ItemVegetable itemVegetable){
            if (itemVegetable!= null){
                mItemVegetableBinding.setItemVegetable(itemVegetable);

            }
        }
    }
}
