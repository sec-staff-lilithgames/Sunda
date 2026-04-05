package io.odeeo.sdk;

import io.odeeo.sdk.AdUnit;
import kotlin.jvm.internal.f0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class AdUnit$setTimerWithDelay$1 extends f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdUnit f67912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdUnit.RequestType f67913b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdUnit$setTimerWithDelay$1(AdUnit adUnit, AdUnit.RequestType requestType) {
        super(0);
        this.f67912a = adUnit;
        this.f67913b = requestType;
    }

    @Override // kv.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m4621invoke();
        return x0.f87415a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4621invoke() {
        if (this.f67912a.isPlaying$odeeoSdk_release() || this.f67912a.getCurrentState$odeeoSdk_release() != AdUnit.AdState.NO_ADS) {
            return;
        }
        this.f67912a.loadAd(this.f67913b);
    }
}
