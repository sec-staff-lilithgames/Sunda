package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class wh implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39188b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3162cb f39189c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LevelPlayAdInfo f39190e;

    public /* synthetic */ wh(C3162cb c3162cb, LevelPlayAdInfo levelPlayAdInfo, int i10) {
        this.f39188b = i10;
        this.f39189c = c3162cb;
        this.f39190e = levelPlayAdInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39188b) {
            case 0:
                C3162cb.a(this.f39189c, this.f39190e);
                break;
            case 1:
                C3162cb.d(this.f39189c, this.f39190e);
                break;
            case 2:
                C3162cb.c(this.f39189c, this.f39190e);
                break;
            default:
                C3162cb.b(this.f39189c, this.f39190e);
                break;
        }
    }
}
