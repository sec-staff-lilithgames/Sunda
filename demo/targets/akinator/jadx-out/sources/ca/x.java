package ca;

import io.odeeo.sdk.AdListener;
import io.odeeo.sdk.AdUnit;
import io.odeeo.sdk.callbackData.AdData;
import io.odeeo.sdk.callbackData.ImpressionData;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class x implements AdListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f12040a;

    public x(y yVar) {
        this.f12040a = yVar;
    }

    @Override // io.odeeo.sdk.AdListener
    public void onAvailabilityChanged(boolean z10, AdData adData) {
        AdUnit adUnit;
        Timber.tag("ODEEO").d("onAvailabilityChanged %s", Boolean.valueOf(z10));
        y yVar = this.f12040a;
        if (yVar.f12044c || (adUnit = yVar.f12042a) == null || !z10 || yVar.f12045d) {
            return;
        }
        adUnit.showAd();
    }

    @Override // io.odeeo.sdk.AdActivity
    public void onShow() {
        this.f12040a.f12045d = true;
    }

    @Override // io.odeeo.sdk.AdActivity
    public void onClick() {
    }

    @Override // io.odeeo.sdk.AdActivity
    public void onRewardedPopupAppear() {
    }

    @Override // io.odeeo.sdk.AdActivity
    public void onClose(AdUnit.CloseReason closeReason) {
    }

    @Override // io.odeeo.sdk.AdActivity
    public void onImpression(ImpressionData impressionData) {
    }

    @Override // io.odeeo.sdk.AdActivity
    public void onMute(boolean z10) {
    }

    @Override // io.odeeo.sdk.AdActivity
    public void onPause(AdUnit.StateChangeReason stateChangeReason) {
    }

    @Override // io.odeeo.sdk.AdActivity
    public void onResume(AdUnit.StateChangeReason stateChangeReason) {
    }

    @Override // io.odeeo.sdk.AdActivity
    public void onReward(float f10) {
    }

    @Override // io.odeeo.sdk.AdActivity
    public void onRewardedPopupClosed(AdUnit.CloseReason closeReason) {
    }

    @Override // io.odeeo.sdk.AdActivity
    public void onShowFailed(String str, AdUnit.ErrorShowReason errorShowReason, String str2) {
    }
}
