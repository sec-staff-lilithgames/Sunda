package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.PagerAdapter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class A8 extends PagerAdapter implements V8 {

    /* renamed from: a, reason: collision with root package name */
    public final C3106z8 f31622a;

    /* renamed from: b, reason: collision with root package name */
    public final N8 f31623b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31624c;

    /* renamed from: d, reason: collision with root package name */
    public final int f31625d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f31626e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31627f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseArray f31628g;

    public A8(C3106z8 mNativeDataModel, N8 mNativeLayoutInflater) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mNativeDataModel, "mNativeDataModel");
        kotlin.jvm.internal.e0.checkNotNullParameter(mNativeLayoutInflater, "mNativeLayoutInflater");
        this.f31622a = mNativeDataModel;
        this.f31623b = mNativeLayoutInflater;
        this.f31624c = "A8";
        this.f31625d = 50;
        this.f31626e = new Handler(Looper.getMainLooper());
        this.f31628g = new SparseArray();
    }

    public static final void a(Object item, A8 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(item, "$item");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        if (item instanceof View) {
            N8 n82 = this$0.f31623b;
            View view = (View) item;
            n82.getClass();
            kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
            n82.f32063m.a(view);
        }
    }

    @Override // com.inmobi.media.V8
    public final void destroy() {
        this.f31627f = true;
        int size = this.f31628g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f31626e.removeCallbacks((Runnable) this.f31628g.get(this.f31628g.keyAt(i10)));
        }
        this.f31628g.clear();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup container, int i10, Object item) {
        kotlin.jvm.internal.e0.checkNotNullParameter(container, "container");
        kotlin.jvm.internal.e0.checkNotNullParameter(item, "item");
        if (item instanceof View) {
            container.removeView((View) item);
        }
        Runnable runnable = (Runnable) this.f31628g.get(i10);
        if (runnable != null) {
            this.f31626e.removeCallbacks(runnable);
            String TAG = this.f31624c;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
        }
        this.f31626e.post(new on.z(28, item, this));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f31622a.d();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object item) {
        kotlin.jvm.internal.e0.checkNotNullParameter(item, "item");
        View view = item instanceof View ? (View) item : null;
        Object tag = view != null ? view.getTag() : null;
        if (tag instanceof Integer) {
            return ((Number) tag).intValue();
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup container, int i10) {
        View relativeLayout;
        kotlin.jvm.internal.e0.checkNotNullParameter(container, "container");
        String TAG = this.f31624c;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
        C2970r8 c2970r8B = this.f31622a.b(i10);
        if (c2970r8B == null || (relativeLayout = a(i10, container, c2970r8B)) == null) {
            relativeLayout = new RelativeLayout(container.getContext());
        }
        relativeLayout.setTag(Integer.valueOf(i10));
        container.addView(relativeLayout);
        return relativeLayout;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(obj, "obj");
        return kotlin.jvm.internal.e0.areEqual(view, obj);
    }

    public final ViewGroup a(int i10, ViewGroup parent, C2970r8 pageContainerAsset) {
        kotlin.jvm.internal.e0.checkNotNullParameter(parent, "parent");
        kotlin.jvm.internal.e0.checkNotNullParameter(pageContainerAsset, "pageContainerAsset");
        ViewGroup viewGroupA = this.f31623b.a(parent, pageContainerAsset);
        if (viewGroupA == null) {
            return viewGroupA;
        }
        int iAbs = Math.abs(this.f31623b.f32061k - i10);
        com.applovin.impl.c9 c9Var = new com.applovin.impl.c9(this, i10, viewGroupA, parent, pageContainerAsset);
        this.f31628g.put(i10, c9Var);
        this.f31626e.postDelayed(c9Var, iAbs * this.f31625d);
        return viewGroupA;
    }

    public static final void a(A8 this$0, int i10, ViewGroup container, ViewGroup parent, C2970r8 root) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(container, "$it");
        kotlin.jvm.internal.e0.checkNotNullParameter(parent, "$parent");
        kotlin.jvm.internal.e0.checkNotNullParameter(root, "$pageContainerAsset");
        if (this$0.f31627f) {
            return;
        }
        this$0.f31628g.remove(i10);
        N8 n82 = this$0.f31623b;
        n82.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(container, "container");
        kotlin.jvm.internal.e0.checkNotNullParameter(parent, "parent");
        kotlin.jvm.internal.e0.checkNotNullParameter(root, "root");
        n82.b(container, root);
    }
}
