package com.moloco.sdk.internal.unity_bridge.internal;

import com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback;
import com.moloco.sdk.internal.unity_bridge.internal.b;
import com.moloco.sdk.publisher.MolocoAd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f47213b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MolocoUnityShowCallback f47214c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MolocoAd f47215e;

    public /* synthetic */ c(MolocoUnityShowCallback molocoUnityShowCallback, MolocoAd molocoAd, int i10) {
        this.f47213b = i10;
        this.f47214c = molocoUnityShowCallback;
        this.f47215e = molocoAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f47213b) {
            case 0:
                b.C0390b.b(this.f47214c, this.f47215e);
                break;
            case 1:
                b.C0390b.a(this.f47214c, this.f47215e);
                break;
            default:
                b.C0390b.c(this.f47214c, this.f47215e);
                break;
        }
    }
}
