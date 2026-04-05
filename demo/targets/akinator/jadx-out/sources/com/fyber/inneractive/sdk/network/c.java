package com.fyber.inneractive.sdk.network;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f24198b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f24199c;

    public c(f fVar, int i10, long j10) {
        this.f24199c = fVar;
        this.f24197a = i10;
        this.f24198b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24199c.f24216d.sendEmptyMessageDelayed(this.f24197a, this.f24198b);
    }
}
