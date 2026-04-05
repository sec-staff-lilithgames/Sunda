package io.odeeo.sdk;

import io.odeeo.sdk.AdUnit;
import io.odeeo.sdk.callbackData.ImpressionData;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface AdActivity {
    void onClick();

    void onClose(AdUnit.CloseReason closeReason);

    void onImpression(ImpressionData impressionData);

    void onMute(boolean z10);

    void onPause(AdUnit.StateChangeReason stateChangeReason);

    void onResume(AdUnit.StateChangeReason stateChangeReason);

    void onReward(float f10);

    void onRewardedPopupAppear();

    void onRewardedPopupClosed(AdUnit.CloseReason closeReason);

    void onShow();

    void onShowFailed(String str, AdUnit.ErrorShowReason errorShowReason, String str2);
}
