package com.vungle.ads.internal.presenter;

import b3.h;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.util.Logger;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class AdEventListener {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AdEventListener";
    private boolean adRewarded;
    private Placement placement;
    private final AdPlayCallback playAdCallback;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public AdEventListener(AdPlayCallback adPlayCallback, Placement placement) {
        this.playAdCallback = adPlayCallback;
        this.placement = placement;
    }

    public final void onError(VungleError error, String str) {
        e0.checkNotNullParameter(error, "error");
        AdPlayCallback adPlayCallback = this.playAdCallback;
        if (adPlayCallback != null) {
            adPlayCallback.onFailure(error);
            Logger.Companion.e(TAG, "AdEventListener#PlayAdCallback " + str, error);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void onNext(String s10, String str, String str2) {
        Placement placement;
        AdPlayCallback adPlayCallback;
        AdPlayCallback adPlayCallback2;
        AdPlayCallback adPlayCallback3;
        AdPlayCallback adPlayCallback4;
        e0.checkNotNullParameter(s10, "s");
        Logger.Companion companion = Logger.Companion;
        StringBuilder sbB = h.b("s=", s10, ", value=", str, ", id=");
        sbB.append(str2);
        companion.d(TAG, sbB.toString());
        switch (s10.hashCode()) {
            case -1912374177:
                if (s10.equals(MRAIDPresenter.SUCCESSFUL_VIEW) && (placement = this.placement) != null && placement.isRewardedVideo() && !this.adRewarded) {
                    this.adRewarded = true;
                    AdPlayCallback adPlayCallback5 = this.playAdCallback;
                    if (adPlayCallback5 != null) {
                        adPlayCallback5.onAdRewarded(str2);
                        break;
                    }
                }
                break;
            case -1627831289:
                if (s10.equals("adViewed") && (adPlayCallback = this.playAdCallback) != null) {
                    adPlayCallback.onAdImpression(str2);
                    break;
                }
                break;
            case 100571:
                if (s10.equals(TtmlNode.END) && (adPlayCallback2 = this.playAdCallback) != null) {
                    adPlayCallback2.onAdEnd(str2);
                    break;
                }
                break;
            case 3417674:
                if (s10.equals("open")) {
                    if (!e0.areEqual(str, "adClick")) {
                        if (e0.areEqual(str, "adLeftApplication") && (adPlayCallback3 = this.playAdCallback) != null) {
                            adPlayCallback3.onAdLeftApplication(str2);
                            break;
                        }
                    } else {
                        AdPlayCallback adPlayCallback6 = this.playAdCallback;
                        if (adPlayCallback6 != null) {
                            adPlayCallback6.onAdClick(str2);
                            break;
                        }
                    }
                }
                break;
            case 109757538:
                if (s10.equals("start") && (adPlayCallback4 = this.playAdCallback) != null) {
                    adPlayCallback4.onAdStart(str2);
                    break;
                }
                break;
        }
    }
}
