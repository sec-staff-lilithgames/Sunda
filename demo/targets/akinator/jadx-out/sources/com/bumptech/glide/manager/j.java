package com.bumptech.glide.manager;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j implements ViewTreeObserver.OnDrawListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f16637b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f16638c;

    public j(k kVar, View view) {
        this.f16638c = kVar;
        this.f16637b = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        j9.s.postOnUiThread(new i(this, this));
    }
}
