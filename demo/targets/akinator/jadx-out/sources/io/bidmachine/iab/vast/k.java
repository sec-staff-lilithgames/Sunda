package io.bidmachine.iab.vast;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k extends Thread {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f60495b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f60496c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f60497e;

    public k(t tVar, Context context, u uVar) {
        this.f60497e = tVar;
        this.f60495b = context;
        this.f60496c = uVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws SecurityException, IllegalArgumentException {
        t tVar = this.f60497e;
        tVar.c(this.f60495b, tVar.f60531d, this.f60496c);
    }
}
