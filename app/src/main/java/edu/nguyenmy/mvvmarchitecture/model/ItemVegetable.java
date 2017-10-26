package edu.nguyenmy.mvvmarchitecture.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import edu.nguyenmy.mvvmarchitecture.BR;

/**
 * Created by DELL on 10/26/2017.
 */

public class ItemVegetable extends BaseObservable {
    public String name;
    public String price;

    public ItemVegetable(String name, String price) {
        this.name = name;
        this.price = price;
    }
    @Bindable
    public String getName() {
        return name;
    }
    @Bindable
    public String getPrice()
    {
        return price;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public void setPrice(String price) {
        this.price = price;
        notifyPropertyChanged(BR.price);
    }
}
