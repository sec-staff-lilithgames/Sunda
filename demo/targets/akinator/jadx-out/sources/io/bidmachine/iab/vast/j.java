package io.bidmachine.iab.vast;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j extends Thread {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f60491b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f60492c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f60493e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f60494f;

    public j(Context context, t tVar, u uVar, String str) {
        this.f60494f = tVar;
        this.f60491b = context;
        this.f60492c = str;
        this.f60493e = uVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws SecurityException, IllegalArgumentException {
        this.f60494f.loadVideoWithDataSync(this.f60491b, this.f60492c, this.f60493e);
    }
}
