package com.amazon.aps.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements kv.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12501b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ApsAdController f12502c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ApsAd f12503e;

    public /* synthetic */ a(ApsAdController apsAdController, ApsAd apsAd, int i10) {
        this.f12501b = i10;
        this.f12502c = apsAdController;
        this.f12503e = apsAd;
    }

    @Override // kv.a
    public final Object invoke() {
        switch (this.f12501b) {
            case 0:
                return ApsAdController$apsAdListenerInternal$1.onAdLoaded$lambda$0(this.f12502c, this.f12503e);
            case 1:
                return ApsAdController$apsAdListenerInternal$1.onAdClosed$lambda$7(this.f12502c, this.f12503e);
            case 2:
                return ApsAdController$apsAdListenerInternal$1.onVideoCompleted$lambda$8(this.f12502c, this.f12503e);
            case 3:
                return ApsAdController$apsAdListenerInternal$1.onAdError$lambda$5(this.f12502c, this.f12503e);
            case 4:
                return ApsAdController$apsAdListenerInternal$1.onImpressionFired$lambda$4(this.f12502c, this.f12503e);
            case 5:
                return ApsAdController$apsAdListenerInternal$1.onAdOpen$lambda$6(this.f12502c, this.f12503e);
            case 6:
                return ApsAdController$apsAdListenerInternal$1.onAdFailedToLoad$lambda$1(this.f12502c, this.f12503e);
            default:
                return ApsAdController$apsAdListenerInternal$1.onAdClicked$lambda$2(this.f12502c, this.f12503e);
        }
    }
}
