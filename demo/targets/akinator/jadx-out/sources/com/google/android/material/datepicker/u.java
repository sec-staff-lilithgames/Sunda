package com.google.android.material.datepicker;

import android.view.View;
import x3.e3;
import x3.q0;
import x3.t3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class u implements q0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29206b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f29207c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f29208e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f29209f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f29210g;

    public u(View view, int i10, int i11, int i12, int i13) {
        this.f29206b = i10;
        this.f29207c = view;
        this.f29208e = i11;
        this.f29209f = i12;
        this.f29210g = i13;
    }

    @Override // x3.q0
    public e3 onApplyWindowInsets(View view, e3 e3Var) {
        o3.c insets = e3Var.getInsets(t3.systemBars());
        View view2 = this.f29207c;
        int i10 = this.f29206b;
        if (i10 >= 0) {
            view2.getLayoutParams().height = i10 + insets.f77433b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.f29208e + insets.f77432a, this.f29209f + insets.f77433b, this.f29210g + insets.f77434c, view2.getPaddingBottom());
        return e3Var;
    }
}
