package com.unity3d.services.ads;

import com.unity3d.ads.IUnityAdsInitializationListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50735b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IUnityAdsInitializationListener f50736c;

    public /* synthetic */ a(IUnityAdsInitializationListener iUnityAdsInitializationListener, int i10) {
        this.f50735b = i10;
        this.f50736c = iUnityAdsInitializationListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f50735b) {
            case 0:
                UnityAdsImplementation.lambda$initialize$0(this.f50736c);
                break;
            default:
                this.f50736c.onInitializationComplete();
                break;
        }
    }
}
