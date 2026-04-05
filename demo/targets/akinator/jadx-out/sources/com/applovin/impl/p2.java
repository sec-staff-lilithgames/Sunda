package com.applovin.impl;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class p2 extends BaseAdapter implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    protected Context f15022a;

    /* renamed from: b, reason: collision with root package name */
    private List f15023b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private Map f15024c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private a f15025d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void a(i2 i2Var, o2 o2Var);
    }

    public p2(Context context) {
        this.f15022a = context.getApplicationContext();
    }

    public o2 a() {
        return null;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    public abstract int b();

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public o2 getItem(int i10) {
        return (o2) this.f15023b.get(i10);
    }

    public abstract List c(int i10);

    public void c() {
        AppLovinSdkUtils.runOnUiThread(new m9(this, 11));
    }

    public abstract int d(int i10);

    public abstract o2 e(int i10);

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f15023b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i10) {
        return getItem(i10).m();
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        n2 n2Var;
        o2 item = getItem(i10);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(item.j(), viewGroup, false);
            n2Var = new n2();
            n2Var.f14845a = (TextView) view.findViewById(R.id.text1);
            n2Var.f14846b = (TextView) view.findViewById(R.id.text2);
            n2Var.f14847c = (ImageView) view.findViewById(com.applovin.sdk.R.id.imageView);
            n2Var.f14848d = (ImageView) view.findViewById(com.applovin.sdk.R.id.detailImageView);
            view.setTag(n2Var);
            view.setOnClickListener(this);
            view.setBackground(a(view));
        } else {
            n2Var = (n2) view.getTag();
        }
        n2Var.a(i10);
        n2Var.a(item);
        view.setEnabled(item.o());
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return o2.n();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i10) {
        return getItem(i10).o();
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        int i10;
        this.f15023b = new ArrayList();
        int iB = b();
        this.f15024c = new HashMap(iB);
        o2 o2VarA = a();
        if (o2VarA != null) {
            this.f15023b.add(o2VarA);
            i10 = 1;
        } else {
            i10 = 0;
        }
        for (int i11 = 0; i11 < iB; i11++) {
            int iD = d(i11);
            if (iD != 0) {
                this.f15023b.add(e(i11));
                this.f15023b.addAll(c(i11));
                this.f15024c.put(Integer.valueOf(i11), Integer.valueOf(i10));
                i10 = iD + 1 + i10;
            }
        }
        this.f15023b.add(new t4(""));
        super.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        n2 n2Var = (n2) view.getTag();
        o2 o2VarB = n2Var.b();
        i2 i2VarA = a(n2Var.a());
        a aVar = this.f15025d;
        if (aVar == null || i2VarA == null) {
            return;
        }
        aVar.a(i2VarA, o2VarB);
    }

    public void a(a aVar) {
        this.f15025d = aVar;
    }

    private i2 a(int i10) {
        for (int i11 = 0; i11 < b(); i11++) {
            Integer num = (Integer) this.f15024c.get(Integer.valueOf(i11));
            if (num != null) {
                if (i10 <= num.intValue() + d(i11)) {
                    return new i2(i11, i10 - (num.intValue() + 1));
                }
            }
        }
        return null;
    }

    private Drawable a(View view) {
        Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(m0.a(com.applovin.sdk.R.color.applovin_sdk_highlightListItemColor, this.f15022a));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable);
        stateListDrawable.addState(new int[0], background);
        return stateListDrawable;
    }
}
