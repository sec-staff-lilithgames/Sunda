package io.odeeo.sdk;

import android.view.View;
import be.nVUQ.UupKET;
import io.odeeo.sdk.AdUnit;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g extends f {
    public final io.odeeo.internal.z0.f L;
    public final c M;
    public final io.odeeo.internal.w1.e N;
    public final io.odeeo.internal.o1.e O;

    @Override // io.odeeo.sdk.AdUnitBase
    public AdUnit.RewardType d() {
        return this.N.getRewardedData$odeeoSdk_release().getType();
    }

    @Override // io.odeeo.sdk.f, io.odeeo.sdk.AdUnitBase
    public AdUnit.PlacementType getAdUnitType() {
        return AdUnit.PlacementType.RewardedAudioIconAd;
    }

    @Override // io.odeeo.sdk.f, io.odeeo.sdk.AdUnitBase
    public void play() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.play();
        getPopUp$odeeoSdk_release().buildView(this.N, this.M);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(io.odeeo.internal.z0.f viewModel, c audioAd, io.odeeo.internal.w1.e adView, AdActivity adActivity, View rootView, String placementId, String transactionId, io.odeeo.internal.o1.e eVar, kv.a onPageLoaded) {
        super(viewModel, audioAd, adView, adActivity, rootView, placementId, transactionId, eVar, onPageLoaded);
        e0.checkNotNullParameter(viewModel, "viewModel");
        e0.checkNotNullParameter(audioAd, "audioAd");
        e0.checkNotNullParameter(adView, "adView");
        e0.checkNotNullParameter(rootView, "rootView");
        e0.checkNotNullParameter(placementId, "placementId");
        e0.checkNotNullParameter(transactionId, "transactionId");
        e0.checkNotNullParameter(eVar, UupKET.xJegQeTkk);
        e0.checkNotNullParameter(onPageLoaded, "onPageLoaded");
        this.L = viewModel;
        this.M = audioAd;
        this.N = adView;
        this.O = eVar;
    }
}
