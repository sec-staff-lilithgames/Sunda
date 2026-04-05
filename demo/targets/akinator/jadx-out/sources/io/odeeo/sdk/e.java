package io.odeeo.sdk;

import android.view.View;
import io.odeeo.sdk.AdUnit;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e extends d {
    public final io.odeeo.internal.z0.f I;
    public final c J;
    public final io.odeeo.internal.w1.b K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(io.odeeo.internal.z0.f adViewModel, c audioAd, io.odeeo.internal.w1.b adView, AdActivity adActivity, View rootView, String placementId, String transactionId, io.odeeo.internal.o1.e eventTrackingManager, kv.a onPageLoaded) {
        super(adViewModel, audioAd, adView, adActivity, rootView, placementId, transactionId, eventTrackingManager, onPageLoaded);
        e0.checkNotNullParameter(adViewModel, "adViewModel");
        e0.checkNotNullParameter(audioAd, "audioAd");
        e0.checkNotNullParameter(adView, "adView");
        e0.checkNotNullParameter(rootView, "rootView");
        e0.checkNotNullParameter(placementId, "placementId");
        e0.checkNotNullParameter(transactionId, "transactionId");
        e0.checkNotNullParameter(eventTrackingManager, "eventTrackingManager");
        e0.checkNotNullParameter(onPageLoaded, "onPageLoaded");
        this.I = adViewModel;
        this.J = audioAd;
        this.K = adView;
    }

    @Override // io.odeeo.sdk.AdUnitBase
    public AdUnit.RewardType d() {
        return this.K.getRewardedData$odeeoSdk_release().getType();
    }

    @Override // io.odeeo.sdk.d, io.odeeo.sdk.AdUnitBase
    public AdUnit.PlacementType getAdUnitType() {
        return AdUnit.PlacementType.RewardedAudioBannerAd;
    }

    @Override // io.odeeo.sdk.d, io.odeeo.sdk.AdUnitBase
    public void play() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.play();
        getPopUp$odeeoSdk_release().buildView(this.K, this.J);
    }
}
