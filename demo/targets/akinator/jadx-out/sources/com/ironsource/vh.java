package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class vh implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39144b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LevelPlayAdError f39145c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3162cb f39146e;

    public /* synthetic */ vh(C3162cb c3162cb, LevelPlayAdError levelPlayAdError) {
        this.f39144b = 1;
        this.f39145c = levelPlayAdError;
        this.f39146e = c3162cb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39144b) {
            case 0:
                C3162cb.b(this.f39146e, this.f39145c);
                break;
            case 1:
                C3162cb.a(this.f39145c, this.f39146e);
                break;
            case 2:
                C3162cb.a(this.f39146e, this.f39145c);
                break;
            default:
                C3162cb.c(this.f39146e, this.f39145c);
                break;
        }
    }

    public /* synthetic */ vh(C3162cb c3162cb, LevelPlayAdError levelPlayAdError, int i10) {
        this.f39144b = i10;
        this.f39146e = c3162cb;
        this.f39145c = levelPlayAdError;
    }
}
