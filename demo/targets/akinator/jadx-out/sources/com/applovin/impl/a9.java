package com.applovin.impl;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class a9 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13441b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13442c;

    public /* synthetic */ a9(Object obj, int i10) {
        this.f13441b = i10;
        this.f13442c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f13441b) {
            case 0:
                ((d1) this.f13442c).a(view);
                break;
            case 1:
                ((n1) this.f13442c).a(view);
                break;
            default:
                ((v1) this.f13442c).a(view);
                break;
        }
    }
}
