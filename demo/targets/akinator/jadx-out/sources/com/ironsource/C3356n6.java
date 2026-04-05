package com.ironsource;

import android.app.Activity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.n6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3356n6 implements I {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f37955a;

    public C3356n6(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        this.f37955a = activity;
    }

    @Override // com.ironsource.I
    public void a(C3318l6 fullscreenAdInstance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fullscreenAdInstance, "fullscreenAdInstance");
        fullscreenAdInstance.a(this.f37955a);
    }
}
