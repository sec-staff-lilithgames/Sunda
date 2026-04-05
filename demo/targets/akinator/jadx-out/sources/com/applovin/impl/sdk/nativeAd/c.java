package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.f5;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements t.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15578b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15579c;

    public /* synthetic */ c(Object obj, int i10) {
        this.f15578b = i10;
        this.f15579c = obj;
    }

    @Override // t.a, jd.j
    public final Object apply(Object obj) {
        switch (this.f15578b) {
            case 0:
                return ((AppLovinNativeAdImpl) this.f15579c).lambda$getDirectClickTrackingPostbacks$1((f5) obj);
            case 1:
                return ((AppLovinNativeAdImpl) this.f15579c).lambda$getOpenMeasurementVerificationScriptResources$2((JSONArray) obj);
            default:
                return AppLovinNativeAdImpl.lambda$getOpenMeasurementVerificationScriptResources$3((c) this.f15579c, (f5) obj);
        }
    }
}
