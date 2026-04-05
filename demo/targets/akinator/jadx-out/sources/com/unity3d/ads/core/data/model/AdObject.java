package com.unity3d.ads.core.data.model;

import androidx.core.app.NotificationCompat;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p0.o2;
import tv.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AdObject {
    private final AdPlayer adPlayer;
    private final DiagnosticEventRequestOuterClass.DiagnosticAdType adType;
    private final boolean isHeaderBidding;
    private boolean isOfferwallAd;
    private boolean isScarAd;
    private final UnityAdsLoadOptions loadOptions;
    private String offerwallPlacementName;
    private final ByteString opportunityId;
    private final String placementId;
    private String playerServerId;
    private String scarAdString;
    private String scarAdUnitId;
    private String scarQueryId;
    private MutableStateFlow<AdObjectState> state;
    private ByteString trackingToken;
    private MutableStateFlow<f> ttl;

    public AdObject(ByteString opportunityId, String placementId, ByteString trackingToken, boolean z10, String str, String str2, String str3, boolean z11, String str4, AdPlayer adPlayer, String str5, UnityAdsLoadOptions loadOptions, boolean z12, DiagnosticEventRequestOuterClass.DiagnosticAdType adType, MutableStateFlow<f> ttl, MutableStateFlow<AdObjectState> state) {
        e0.checkNotNullParameter(opportunityId, "opportunityId");
        e0.checkNotNullParameter(placementId, "placementId");
        e0.checkNotNullParameter(trackingToken, "trackingToken");
        e0.checkNotNullParameter(loadOptions, "loadOptions");
        e0.checkNotNullParameter(adType, "adType");
        e0.checkNotNullParameter(ttl, "ttl");
        e0.checkNotNullParameter(state, "state");
        this.opportunityId = opportunityId;
        this.placementId = placementId;
        this.trackingToken = trackingToken;
        this.isScarAd = z10;
        this.scarQueryId = str;
        this.scarAdUnitId = str2;
        this.scarAdString = str3;
        this.isOfferwallAd = z11;
        this.offerwallPlacementName = str4;
        this.adPlayer = adPlayer;
        this.playerServerId = str5;
        this.loadOptions = loadOptions;
        this.isHeaderBidding = z12;
        this.adType = adType;
        this.ttl = ttl;
        this.state = state;
    }

    public final ByteString component1() {
        return this.opportunityId;
    }

    public final AdPlayer component10() {
        return this.adPlayer;
    }

    public final String component11() {
        return this.playerServerId;
    }

    public final UnityAdsLoadOptions component12() {
        return this.loadOptions;
    }

    public final boolean component13() {
        return this.isHeaderBidding;
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticAdType component14() {
        return this.adType;
    }

    public final MutableStateFlow<f> component15() {
        return this.ttl;
    }

    public final MutableStateFlow<AdObjectState> component16() {
        return this.state;
    }

    public final String component2() {
        return this.placementId;
    }

    public final ByteString component3() {
        return this.trackingToken;
    }

    public final boolean component4() {
        return this.isScarAd;
    }

    public final String component5() {
        return this.scarQueryId;
    }

    public final String component6() {
        return this.scarAdUnitId;
    }

    public final String component7() {
        return this.scarAdString;
    }

    public final boolean component8() {
        return this.isOfferwallAd;
    }

    public final String component9() {
        return this.offerwallPlacementName;
    }

    public final AdObject copy(ByteString opportunityId, String placementId, ByteString trackingToken, boolean z10, String str, String str2, String str3, boolean z11, String str4, AdPlayer adPlayer, String str5, UnityAdsLoadOptions loadOptions, boolean z12, DiagnosticEventRequestOuterClass.DiagnosticAdType adType, MutableStateFlow<f> ttl, MutableStateFlow<AdObjectState> state) {
        e0.checkNotNullParameter(opportunityId, "opportunityId");
        e0.checkNotNullParameter(placementId, "placementId");
        e0.checkNotNullParameter(trackingToken, "trackingToken");
        e0.checkNotNullParameter(loadOptions, "loadOptions");
        e0.checkNotNullParameter(adType, "adType");
        e0.checkNotNullParameter(ttl, "ttl");
        e0.checkNotNullParameter(state, "state");
        return new AdObject(opportunityId, placementId, trackingToken, z10, str, str2, str3, z11, str4, adPlayer, str5, loadOptions, z12, adType, ttl, state);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdObject)) {
            return false;
        }
        AdObject adObject = (AdObject) obj;
        return e0.areEqual(this.opportunityId, adObject.opportunityId) && e0.areEqual(this.placementId, adObject.placementId) && e0.areEqual(this.trackingToken, adObject.trackingToken) && this.isScarAd == adObject.isScarAd && e0.areEqual(this.scarQueryId, adObject.scarQueryId) && e0.areEqual(this.scarAdUnitId, adObject.scarAdUnitId) && e0.areEqual(this.scarAdString, adObject.scarAdString) && this.isOfferwallAd == adObject.isOfferwallAd && e0.areEqual(this.offerwallPlacementName, adObject.offerwallPlacementName) && e0.areEqual(this.adPlayer, adObject.adPlayer) && e0.areEqual(this.playerServerId, adObject.playerServerId) && e0.areEqual(this.loadOptions, adObject.loadOptions) && this.isHeaderBidding == adObject.isHeaderBidding && this.adType == adObject.adType && e0.areEqual(this.ttl, adObject.ttl) && e0.areEqual(this.state, adObject.state);
    }

    public final AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.adType;
    }

    public final UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    public final ByteString getOpportunityId() {
        return this.opportunityId;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final String getPlayerServerId() {
        return this.playerServerId;
    }

    public final String getScarAdString() {
        return this.scarAdString;
    }

    public final String getScarAdUnitId() {
        return this.scarAdUnitId;
    }

    public final String getScarQueryId() {
        return this.scarQueryId;
    }

    public final MutableStateFlow<AdObjectState> getState() {
        return this.state;
    }

    public final ByteString getTrackingToken() {
        return this.trackingToken;
    }

    public final MutableStateFlow<f> getTtl() {
        return this.ttl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = (this.trackingToken.hashCode() + o2.e(this.opportunityId.hashCode() * 31, 31, this.placementId)) * 31;
        boolean z10 = this.isScarAd;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode + i10) * 31;
        String str = this.scarQueryId;
        int iHashCode2 = (i11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.scarAdUnitId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scarAdString;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z11 = this.isOfferwallAd;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (iHashCode4 + i12) * 31;
        String str4 = this.offerwallPlacementName;
        int iHashCode5 = (i13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AdPlayer adPlayer = this.adPlayer;
        int iHashCode6 = (iHashCode5 + (adPlayer == null ? 0 : adPlayer.hashCode())) * 31;
        String str5 = this.playerServerId;
        int iHashCode7 = (this.loadOptions.hashCode() + ((iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31)) * 31;
        boolean z12 = this.isHeaderBidding;
        return this.state.hashCode() + ((this.ttl.hashCode() + ((this.adType.hashCode() + ((iHashCode7 + (z12 ? 1 : z12 ? 1 : 0)) * 31)) * 31)) * 31);
    }

    public final boolean isHeaderBidding() {
        return this.isHeaderBidding;
    }

    public final boolean isOfferwallAd() {
        return this.isOfferwallAd;
    }

    public final boolean isScarAd() {
        return this.isScarAd;
    }

    public final void setOfferwallAd(boolean z10) {
        this.isOfferwallAd = z10;
    }

    public final void setOfferwallPlacementName(String str) {
        this.offerwallPlacementName = str;
    }

    public final void setPlayerServerId(String str) {
        this.playerServerId = str;
    }

    public final void setScarAd(boolean z10) {
        this.isScarAd = z10;
    }

    public final void setScarAdString(String str) {
        this.scarAdString = str;
    }

    public final void setScarAdUnitId(String str) {
        this.scarAdUnitId = str;
    }

    public final void setScarQueryId(String str) {
        this.scarQueryId = str;
    }

    public final void setState(MutableStateFlow<AdObjectState> mutableStateFlow) {
        e0.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.state = mutableStateFlow;
    }

    public final void setTrackingToken(ByteString byteString) {
        e0.checkNotNullParameter(byteString, "<set-?>");
        this.trackingToken = byteString;
    }

    public final void setTtl(MutableStateFlow<f> mutableStateFlow) {
        e0.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.ttl = mutableStateFlow;
    }

    public String toString() {
        return "AdObject(opportunityId=" + this.opportunityId + ", placementId=" + this.placementId + ", trackingToken=" + this.trackingToken + ", isScarAd=" + this.isScarAd + ", scarQueryId=" + this.scarQueryId + ", scarAdUnitId=" + this.scarAdUnitId + ", scarAdString=" + this.scarAdString + ", isOfferwallAd=" + this.isOfferwallAd + ", offerwallPlacementName=" + this.offerwallPlacementName + ", adPlayer=" + this.adPlayer + ", playerServerId=" + this.playerServerId + ", loadOptions=" + this.loadOptions + ", isHeaderBidding=" + this.isHeaderBidding + ", adType=" + this.adType + ", ttl=" + this.ttl + ", state=" + this.state + ')';
    }

    public /* synthetic */ AdObject(ByteString byteString, String str, ByteString byteString2, boolean z10, String str2, String str3, String str4, boolean z11, String str5, AdPlayer adPlayer, String str6, UnityAdsLoadOptions unityAdsLoadOptions, boolean z12, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, MutableStateFlow mutableStateFlow, MutableStateFlow mutableStateFlow2, int i10, u uVar) {
        this(byteString, str, byteString2, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? false : z11, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : str5, (i10 & 512) != 0 ? null : adPlayer, (i10 & 1024) != 0 ? null : str6, unityAdsLoadOptions, z12, diagnosticAdType, (i10 & 16384) != 0 ? StateFlowKt.MutableStateFlow(null) : mutableStateFlow, (i10 & 32768) != 0 ? StateFlowKt.MutableStateFlow(AdObjectState.INIT) : mutableStateFlow2);
    }
}
