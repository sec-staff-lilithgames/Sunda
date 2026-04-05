package com.applovin.impl.adview;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.adview.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class g extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private e f13542a;

    /* renamed from: b, reason: collision with root package name */
    private int f13543b;

    public g(e.a aVar, Activity activity) {
        super(activity);
        setBackgroundColor(0);
        e eVarA = e.a(aVar, activity);
        this.f13542a = eVarA;
        addView(eVarA);
    }

    public void a(e.a aVar) {
        if (aVar == null || aVar == this.f13542a.getStyle()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f13542a.getLayoutParams();
        removeView(this.f13542a);
        e eVarA = e.a(aVar, getContext());
        this.f13542a = eVarA;
        addView(eVarA);
        this.f13542a.setLayoutParams(layoutParams);
        this.f13542a.a(this.f13543b);
    }

    public void a(int i10, int i11, int i12, int i13) {
        this.f13543b = i10;
        int i14 = i11 + i10 + i12;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i14;
            layoutParams.width = i14;
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(i14, i14));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i10, i10, i13);
        layoutParams2.setMargins(i12, i12, i12, 0);
        this.f13542a.setLayoutParams(layoutParams2);
        this.f13542a.a(i10);
    }
}
