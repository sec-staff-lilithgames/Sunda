package com.mbridge.msdk.nativex.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.mbridge.msdk.nativex.view.MBNativeRollView;
import com.mbridge.msdk.out.Frame;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class RollingAdapter extends PagerAdapter {
    private List<Frame> list;
    private List<View> listview = new ArrayList();
    private MBNativeRollView.a mvinterface;

    public RollingAdapter(List<Frame> list) {
        this.list = new ArrayList();
        this.list = list;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
        viewGroup.removeView(this.listview.get(i10));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.list.size();
    }

    public MBNativeRollView.a getMvinterface() {
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i10) {
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public void setMvinterface(MBNativeRollView.a aVar) {
    }
}
