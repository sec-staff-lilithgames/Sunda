package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k0 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f26784a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f26785b;

    public k0(n0 n0Var, Context context) {
        this.f26785b = n0Var;
        this.f26784a = context;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f26785b.a(this.f26784a);
        return true;
    }
}
