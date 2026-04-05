package io.odeeo.sdk;

import io.odeeo.sdk.AdUnit;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import uu.p0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f67998a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final List<AdUnit.PlacementType> f67999b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static AdUnitBase f68000c;

    public final void addAdUnitType$odeeoSdk_release(AdUnit.PlacementType adRequestType) {
        e0.checkNotNullParameter(adRequestType, "adRequestType");
        synchronized (f67999b) {
            f67998a.getPlacementTypeList$odeeoSdk_release().add(adRequestType);
        }
    }

    public final void clear$odeeoSdk_release() {
        synchronized (f67999b) {
            a aVar = f67998a;
            aVar.setPlainAdUnit(null);
            if (!aVar.getPlacementTypeList$odeeoSdk_release().isEmpty()) {
                aVar.getPlacementTypeList$odeeoSdk_release().remove(0);
            }
        }
    }

    public final void disposeAd(AdUnit.PlacementType placementType) {
        e0.checkNotNullParameter(placementType, "placementType");
        synchronized (f67999b) {
            a aVar = f67998a;
            if (aVar.getPlainAdUnit() == null) {
                aVar.clear$odeeoSdk_release();
                return;
            }
            if (placementType.isRewardedAd()) {
                aVar.getPlacementTypeList$odeeoSdk_release().remove(p0.getLastIndex(aVar.getPlacementTypeList$odeeoSdk_release()));
                AdUnitBase plainAdUnit = aVar.getPlainAdUnit();
                if (plainAdUnit != null) {
                    plainAdUnit.setIsAudioFocused$odeeoSdk_release(true);
                    if (!plainAdUnit.isCurrentlyCovered$odeeoSdk_release()) {
                        plainAdUnit.resume(AdUnit.StateChangeReason.OtherOdeeoPlacementEnd);
                    }
                    h.f68100v.sendCustomEvent$odeeoSdk_release(plainAdUnit);
                }
            } else {
                aVar.clear$odeeoSdk_release();
            }
        }
    }

    public final AdUnit.PlacementType getCurrentPlacementType$odeeoSdk_release() {
        AdUnit.PlacementType placementType;
        synchronized (f67999b) {
            a aVar = f67998a;
            placementType = !aVar.getPlacementTypeList$odeeoSdk_release().isEmpty() ? (AdUnit.PlacementType) y0.last((List) aVar.getPlacementTypeList$odeeoSdk_release()) : null;
        }
        return placementType;
    }

    public final List<AdUnit.PlacementType> getPlacementTypeList$odeeoSdk_release() {
        return f67999b;
    }

    public final AdUnitBase getPlainAdUnit() {
        return f68000c;
    }

    public final boolean isResumeAllowedFor(AdUnit.PlacementType placementType) {
        e0.checkNotNullParameter(placementType, "placementType");
        if (getCurrentPlacementType$odeeoSdk_release() == null || placementType.isRewardedAd()) {
            return true;
        }
        AdUnit.PlacementType currentPlacementType$odeeoSdk_release = getCurrentPlacementType$odeeoSdk_release();
        e0.checkNotNull(currentPlacementType$odeeoSdk_release);
        return (currentPlacementType$odeeoSdk_release.isRewardedAd() && placementType.isPlainAd()) ? false : true;
    }

    public final boolean isShowAllowedFor(AdUnit.PlacementType placementType) {
        e0.checkNotNullParameter(placementType, "placementType");
        if (getCurrentPlacementType$odeeoSdk_release() != null) {
            AdUnit.PlacementType currentPlacementType$odeeoSdk_release = getCurrentPlacementType$odeeoSdk_release();
            e0.checkNotNull(currentPlacementType$odeeoSdk_release);
            if (currentPlacementType$odeeoSdk_release.isPlainAd() && placementType.isPlainAd()) {
                return false;
            }
            AdUnit.PlacementType currentPlacementType$odeeoSdk_release2 = getCurrentPlacementType$odeeoSdk_release();
            e0.checkNotNull(currentPlacementType$odeeoSdk_release2);
            if (currentPlacementType$odeeoSdk_release2.isRewardedAd() && placementType.isRewardedAd()) {
                return false;
            }
            AdUnit.PlacementType currentPlacementType$odeeoSdk_release3 = getCurrentPlacementType$odeeoSdk_release();
            e0.checkNotNull(currentPlacementType$odeeoSdk_release3);
            if (!currentPlacementType$odeeoSdk_release3.isPlainAd() || !placementType.isRewardedAd()) {
                return false;
            }
            AdUnitBase adUnitBase = f68000c;
            if (adUnitBase != null && adUnitBase.isPlaying()) {
                AdUnitBase adUnitBase2 = f68000c;
                if (adUnitBase2 != null) {
                    adUnitBase2.pause(AdUnit.StateChangeReason.OtherOdeeoPlacementStart);
                }
            } else {
                AdUnitBase adUnitBase3 = f68000c;
                if (adUnitBase3 != null) {
                    adUnitBase3.pauseWhenReady$odeeoSdk_release(AdUnit.StateChangeReason.OtherOdeeoPlacementStart);
                }
            }
            AdUnitBase adUnitBase4 = f68000c;
            if (adUnitBase4 != null) {
                h.f68099u.sendCustomEvent$odeeoSdk_release(adUnitBase4);
            }
        }
        return true;
    }

    public final void setPlainAdUnit(AdUnitBase adUnitBase) {
        f68000c = adUnitBase;
    }
}
