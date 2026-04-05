package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50742b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ShowOperationState f50743c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UnityAds.UnityAdsShowError f50744e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f50745f;

    public /* synthetic */ a(ShowOperationState showOperationState, UnityAds.UnityAdsShowError unityAdsShowError, String str, int i10) {
        this.f50742b = i10;
        this.f50743c = showOperationState;
        this.f50744e = unityAdsShowError;
        this.f50745f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f50742b) {
            case 0:
                this.f50743c.onUnityAdsShowFailure(this.f50744e, this.f50745f);
                break;
            default:
                this.f50743c.lambda$onUnityAdsShowFailure$0(this.f50744e, this.f50745f);
                break;
        }
    }
}
