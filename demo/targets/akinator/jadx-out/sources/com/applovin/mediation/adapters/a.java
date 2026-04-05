package com.applovin.mediation.adapters;

import com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter;
import com.applovin.mediation.adapters.GoogleMediationAdapter;
import com.google.android.gms.ads.nativead.MediaView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16400b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MediaView f16401c;

    public /* synthetic */ a(MediaView mediaView, int i10) {
        this.f16400b = i10;
        this.f16401c = mediaView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16400b) {
            case 0:
                ((GoogleAdManagerMediationAdapter.AutoMeasuringMediaView) this.f16401c).lambda$requestLayout$0();
                break;
            default:
                ((GoogleMediationAdapter.AutoMeasuringMediaView) this.f16401c).lambda$requestLayout$0();
                break;
        }
    }
}
