package com.bumptech.glide.manager;

import android.view.View;
import x8.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f16635b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f16636c;

    public i(j jVar, j jVar2) {
        this.f16636c = jVar;
        this.f16635b = jVar2;
    }

    @Override // java.lang.Runnable
    public void run() {
        g0.getInstance().unblockHardwareBitmaps();
        this.f16636c.f16638c.f16640b = true;
        View view = this.f16636c.f16637b;
        view.getViewTreeObserver().removeOnDrawListener(this.f16635b);
        this.f16636c.f16638c.f16639a.clear();
    }
}
