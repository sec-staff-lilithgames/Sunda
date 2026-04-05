package com.applovin.impl;

import android.content.DialogInterface;
import android.net.Uri;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class u9 implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15816b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15817c;

    public /* synthetic */ u9(Object obj, int i10) {
        this.f15816b = i10;
        this.f15817c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f15816b) {
            case 0:
                ((m3) this.f15817c).a(dialogInterface, i10);
                break;
            default:
                t0.b((Uri) this.f15817c, dialogInterface, i10);
                break;
        }
    }
}
