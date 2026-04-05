package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class bi implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36101b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3341mb f36102c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LevelPlayAdInfo f36103e;

    public /* synthetic */ bi(C3341mb c3341mb, LevelPlayAdInfo levelPlayAdInfo, int i10) {
        this.f36101b = i10;
        this.f36102c = c3341mb;
        this.f36103e = levelPlayAdInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36101b) {
            case 0:
                C3341mb.a(this.f36102c, this.f36103e);
                break;
            default:
                C3341mb.b(this.f36102c, this.f36103e);
                break;
        }
    }
}
