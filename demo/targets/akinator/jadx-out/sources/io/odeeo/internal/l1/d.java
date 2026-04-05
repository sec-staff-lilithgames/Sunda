package io.odeeo.internal.l1;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d {

    @lk.c("ad_verifications")
    private final List<a> adVerifications;

    @lk.c("click_through")
    private final String clickThrough;

    @lk.c("click_tracking")
    private final List<c> clickTracking;

    @lk.c("companion_html_resource")
    private final String companionHtmlResource;

    @lk.c("companion_static_resource")
    private final String companionStaticResource;

    @lk.c("cpm")
    private final double cpm;

    @lk.c("impression_tracking")
    private final List<c> impressionTracking;

    @lk.c("media_file")
    private final String mediaFile;

    @lk.c("payload")
    private final String payload;

    @lk.c("reward_granted_callback_url")
    private final String rewardGrantedCallbackUrl;

    @lk.c("reward_rejected_callback_url")
    private final String rewardRejectedCallbackUrl;

    @lk.c("tracking_events")
    private final List<c> trackingEvents;

    public d() {
        this(null, 0.0d, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public static /* synthetic */ d copy$default(d dVar, String str, double d10, String str2, String str3, String str4, List list, List list2, List list3, List list4, String str5, String str6, String str7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dVar.payload;
        }
        return dVar.copy(str, (i10 & 2) != 0 ? dVar.cpm : d10, (i10 & 4) != 0 ? dVar.mediaFile : str2, (i10 & 8) != 0 ? dVar.companionHtmlResource : str3, (i10 & 16) != 0 ? dVar.companionStaticResource : str4, (i10 & 32) != 0 ? dVar.impressionTracking : list, (i10 & 64) != 0 ? dVar.clickTracking : list2, (i10 & 128) != 0 ? dVar.trackingEvents : list3, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? dVar.adVerifications : list4, (i10 & 512) != 0 ? dVar.clickThrough : str5, (i10 & 1024) != 0 ? dVar.rewardGrantedCallbackUrl : str6, (i10 & 2048) != 0 ? dVar.rewardRejectedCallbackUrl : str7);
    }

    public final String component1() {
        return this.payload;
    }

    public final String component10() {
        return this.clickThrough;
    }

    public final String component11() {
        return this.rewardGrantedCallbackUrl;
    }

    public final String component12() {
        return this.rewardRejectedCallbackUrl;
    }

    public final double component2() {
        return this.cpm;
    }

    public final String component3() {
        return this.mediaFile;
    }

    public final String component4() {
        return this.companionHtmlResource;
    }

    public final String component5() {
        return this.companionStaticResource;
    }

    public final List<c> component6() {
        return this.impressionTracking;
    }

    public final List<c> component7() {
        return this.clickTracking;
    }

    public final List<c> component8() {
        return this.trackingEvents;
    }

    public final List<a> component9() {
        return this.adVerifications;
    }

    public final d copy(String payload, double d10, String mediaFile, String companionHtmlResource, String companionStaticResource, List<c> impressionTracking, List<c> clickTracking, List<c> trackingEvents, List<a> adVerifications, String clickThrough, String str, String str2) {
        e0.checkNotNullParameter(payload, "payload");
        e0.checkNotNullParameter(mediaFile, "mediaFile");
        e0.checkNotNullParameter(companionHtmlResource, "companionHtmlResource");
        e0.checkNotNullParameter(companionStaticResource, "companionStaticResource");
        e0.checkNotNullParameter(impressionTracking, "impressionTracking");
        e0.checkNotNullParameter(clickTracking, "clickTracking");
        e0.checkNotNullParameter(trackingEvents, "trackingEvents");
        e0.checkNotNullParameter(adVerifications, "adVerifications");
        e0.checkNotNullParameter(clickThrough, "clickThrough");
        return new d(payload, d10, mediaFile, companionHtmlResource, companionStaticResource, impressionTracking, clickTracking, trackingEvents, adVerifications, clickThrough, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return e0.areEqual(this.payload, dVar.payload) && e0.areEqual((Object) Double.valueOf(this.cpm), (Object) Double.valueOf(dVar.cpm)) && e0.areEqual(this.mediaFile, dVar.mediaFile) && e0.areEqual(this.companionHtmlResource, dVar.companionHtmlResource) && e0.areEqual(this.companionStaticResource, dVar.companionStaticResource) && e0.areEqual(this.impressionTracking, dVar.impressionTracking) && e0.areEqual(this.clickTracking, dVar.clickTracking) && e0.areEqual(this.trackingEvents, dVar.trackingEvents) && e0.areEqual(this.adVerifications, dVar.adVerifications) && e0.areEqual(this.clickThrough, dVar.clickThrough) && e0.areEqual(this.rewardGrantedCallbackUrl, dVar.rewardGrantedCallbackUrl) && e0.areEqual(this.rewardRejectedCallbackUrl, dVar.rewardRejectedCallbackUrl);
    }

    public final List<a> getAdVerifications() {
        return this.adVerifications;
    }

    public final String getClickThrough() {
        return this.clickThrough;
    }

    public final List<c> getClickTracking() {
        return this.clickTracking;
    }

    public final String getCompanionHtmlResource() {
        return this.companionHtmlResource;
    }

    public final String getCompanionStaticResource() {
        return this.companionStaticResource;
    }

    public final double getCpm() {
        return this.cpm;
    }

    public final List<c> getImpressionTracking() {
        return this.impressionTracking;
    }

    public final String getMediaFile() {
        return this.mediaFile;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final String getRewardGrantedCallbackUrl() {
        return this.rewardGrantedCallbackUrl;
    }

    public final String getRewardRejectedCallbackUrl() {
        return this.rewardRejectedCallbackUrl;
    }

    public final List<c> getTrackingEvents() {
        return this.trackingEvents;
    }

    public int hashCode() {
        int iE = o2.e(j1.o2.c(j1.o2.c(j1.o2.c(j1.o2.c(o2.e(o2.e(o2.e((Double.hashCode(this.cpm) + (this.payload.hashCode() * 31)) * 31, 31, this.mediaFile), 31, this.companionHtmlResource), 31, this.companionStaticResource), 31, this.impressionTracking), 31, this.clickTracking), 31, this.trackingEvents), 31, this.adVerifications), 31, this.clickThrough);
        String str = this.rewardGrantedCallbackUrl;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.rewardRejectedCallbackUrl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "VastJson(payload=" + this.payload + ", cpm=" + this.cpm + ", mediaFile=" + this.mediaFile + ", companionHtmlResource=" + this.companionHtmlResource + ", companionStaticResource=" + this.companionStaticResource + ", impressionTracking=" + this.impressionTracking + ", clickTracking=" + this.clickTracking + ", trackingEvents=" + this.trackingEvents + ", adVerifications=" + this.adVerifications + ", clickThrough=" + this.clickThrough + ", rewardGrantedCallbackUrl=" + ((Object) this.rewardGrantedCallbackUrl) + ", rewardRejectedCallbackUrl=" + ((Object) this.rewardRejectedCallbackUrl) + ')';
    }

    public d(String payload, double d10, String mediaFile, String companionHtmlResource, String companionStaticResource, List<c> impressionTracking, List<c> clickTracking, List<c> trackingEvents, List<a> adVerifications, String clickThrough, String str, String str2) {
        e0.checkNotNullParameter(payload, "payload");
        e0.checkNotNullParameter(mediaFile, "mediaFile");
        e0.checkNotNullParameter(companionHtmlResource, "companionHtmlResource");
        e0.checkNotNullParameter(companionStaticResource, "companionStaticResource");
        e0.checkNotNullParameter(impressionTracking, "impressionTracking");
        e0.checkNotNullParameter(clickTracking, "clickTracking");
        e0.checkNotNullParameter(trackingEvents, "trackingEvents");
        e0.checkNotNullParameter(adVerifications, "adVerifications");
        e0.checkNotNullParameter(clickThrough, "clickThrough");
        this.payload = payload;
        this.cpm = d10;
        this.mediaFile = mediaFile;
        this.companionHtmlResource = companionHtmlResource;
        this.companionStaticResource = companionStaticResource;
        this.impressionTracking = impressionTracking;
        this.clickTracking = clickTracking;
        this.trackingEvents = trackingEvents;
        this.adVerifications = adVerifications;
        this.clickThrough = clickThrough;
        this.rewardGrantedCallbackUrl = str;
        this.rewardRejectedCallbackUrl = str2;
    }

    public /* synthetic */ d(String str, double d10, String str2, String str3, String str4, List list, List list2, List list3, List list4, String str5, String str6, String str7, int i10, u uVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? 0.0d : d10, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? "" : str3, (i10 & 16) != 0 ? "" : str4, (i10 & 32) != 0 ? new ArrayList() : list, (i10 & 64) != 0 ? new ArrayList() : list2, (i10 & 128) != 0 ? new ArrayList() : list3, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? new ArrayList() : list4, (i10 & 512) == 0 ? str5 : "", (i10 & 1024) != 0 ? null : str6, (i10 & 2048) != 0 ? null : str7);
    }
}
