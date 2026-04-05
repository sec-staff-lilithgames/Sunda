package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class fh implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36728b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LevelPlayAdInfo f36729c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Da f36730e;

    public /* synthetic */ fh(LevelPlayAdInfo levelPlayAdInfo, Da da2, int i10) {
        this.f36728b = i10;
        this.f36729c = levelPlayAdInfo;
        this.f36730e = da2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36728b) {
            case 0:
                Da.d(this.f36729c, this.f36730e);
                break;
            case 1:
                Da.b(this.f36729c, this.f36730e);
                break;
            case 2:
                Da.a(this.f36729c, this.f36730e);
                break;
            case 3:
                Da.e(this.f36729c, this.f36730e);
                break;
            default:
                Da.c(this.f36729c, this.f36730e);
                break;
        }
    }
}
