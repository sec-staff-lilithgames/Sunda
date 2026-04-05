package io.odeeo.sdk;

import com.amazon.device.ads.DtbConstants;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@bv.f(c = "io.odeeo.sdk.AdUnit", f = "AdUnit.kt", i = {}, l = {DtbConstants.DEFAULT_PLAYER_HEIGHT}, m = "isInternetAvailableOrNotifyFailure", n = {}, s = {})
/* loaded from: classes10.dex */
public final class AdUnit$isInternetAvailableOrNotifyFailure$1 extends bv.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f67888a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdUnit f67889b;

    /* renamed from: c, reason: collision with root package name */
    public int f67890c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdUnit$isInternetAvailableOrNotifyFailure$1(AdUnit adUnit, zu.d<? super AdUnit$isInternetAvailableOrNotifyFailure$1> dVar) {
        super(dVar);
        this.f67889b = adUnit;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f67888a = obj;
        this.f67890c |= Integer.MIN_VALUE;
        return this.f67889b.c(this);
    }
}
