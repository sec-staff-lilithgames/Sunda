package io.odeeo.internal.e1;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.sfbx.appconsent.core.BuildConfig;
import e3.g;
import io.odeeo.sdk.advertisement.data.AdRequestRetry;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f63827a = new a(null);

    @lk.c("ad_request_retries")
    private final List<AdRequestRetry> adRequestRetries;

    @lk.c("bundle")
    private final String bundle;

    @lk.c("cache_interval")
    private final int cacheInterval;

    @lk.c("country")
    private final String country;

    @lk.c("gc_api")
    private final String gcApi;

    @lk.c("pause_interval")
    private final int pauseInterval;

    @lk.c("reward_endlevel_popup")
    private final String rewardEndlevelPopup;

    @lk.c("reward_endlevel_time")
    private final int rewardEndlevelTime;

    @lk.c("reward_inlevel_popup")
    private final String rewardInlevelPopup;

    @lk.c("reward_inlevel_time")
    private final int rewardInlevelTime;

    @lk.c("reward_min_volume_level")
    private final int rewardMinVolumeLevel;

    @lk.c("SDK_requests_retries_TTL")
    private final int sdkRequestRetriesTTL;

    @lk.c("session_timeout")
    private final int sessionTimeout;

    @lk.c("tracking_event_api")
    private final String trackingEventApi;

    @lk.c("tracking_session_event_api")
    private final String trackingSessionEventApi;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    public b() {
        this(0, 0, 0, 0, null, null, 0, 0, null, null, null, null, null, null, 0, 32767, null);
    }

    public final int a(String str, int i10) {
        Object next;
        Iterator<T> it = this.adRequestRetries.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (e0.areEqual(((AdRequestRetry) next).getName(), str)) {
                break;
            }
        }
        AdRequestRetry adRequestRetry = (AdRequestRetry) next;
        return adRequestRetry == null ? i10 : adRequestRetry.getRetries();
    }

    public final int b(String str, int i10) {
        Object next;
        Iterator<T> it = this.adRequestRetries.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (e0.areEqual(((AdRequestRetry) next).getName(), str)) {
                break;
            }
        }
        AdRequestRetry adRequestRetry = (AdRequestRetry) next;
        return adRequestRetry == null ? i10 : adRequestRetry.getDelay();
    }

    public final int component1() {
        return this.cacheInterval;
    }

    public final String component10() {
        return this.bundle;
    }

    public final String component11() {
        return this.country;
    }

    public final String component12() {
        return this.trackingSessionEventApi;
    }

    public final String component13() {
        return this.trackingEventApi;
    }

    public final String component14() {
        return this.gcApi;
    }

    public final int component15() {
        return this.sdkRequestRetriesTTL;
    }

    public final int component2() {
        return this.pauseInterval;
    }

    public final int component3() {
        return this.rewardEndlevelTime;
    }

    public final int component4() {
        return this.rewardInlevelTime;
    }

    public final String component5() {
        return this.rewardInlevelPopup;
    }

    public final String component6() {
        return this.rewardEndlevelPopup;
    }

    public final int component7() {
        return this.rewardMinVolumeLevel;
    }

    public final int component8() {
        return this.sessionTimeout;
    }

    public final List<AdRequestRetry> component9() {
        return this.adRequestRetries;
    }

    public final b copy(int i10, int i11, int i12, int i13, String rewardInlevelPopup, String rewardEndlevelPopup, int i14, int i15, List<AdRequestRetry> adRequestRetries, String bundle, String country, String trackingSessionEventApi, String trackingEventApi, String gcApi, int i16) {
        e0.checkNotNullParameter(rewardInlevelPopup, "rewardInlevelPopup");
        e0.checkNotNullParameter(rewardEndlevelPopup, "rewardEndlevelPopup");
        e0.checkNotNullParameter(adRequestRetries, "adRequestRetries");
        e0.checkNotNullParameter(bundle, "bundle");
        e0.checkNotNullParameter(country, "country");
        e0.checkNotNullParameter(trackingSessionEventApi, "trackingSessionEventApi");
        e0.checkNotNullParameter(trackingEventApi, "trackingEventApi");
        e0.checkNotNullParameter(gcApi, "gcApi");
        return new b(i10, i11, i12, i13, rewardInlevelPopup, rewardEndlevelPopup, i14, i15, adRequestRetries, bundle, country, trackingSessionEventApi, trackingEventApi, gcApi, i16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.cacheInterval == bVar.cacheInterval && this.pauseInterval == bVar.pauseInterval && this.rewardEndlevelTime == bVar.rewardEndlevelTime && this.rewardInlevelTime == bVar.rewardInlevelTime && e0.areEqual(this.rewardInlevelPopup, bVar.rewardInlevelPopup) && e0.areEqual(this.rewardEndlevelPopup, bVar.rewardEndlevelPopup) && this.rewardMinVolumeLevel == bVar.rewardMinVolumeLevel && this.sessionTimeout == bVar.sessionTimeout && e0.areEqual(this.adRequestRetries, bVar.adRequestRetries) && e0.areEqual(this.bundle, bVar.bundle) && e0.areEqual(this.country, bVar.country) && e0.areEqual(this.trackingSessionEventApi, bVar.trackingSessionEventApi) && e0.areEqual(this.trackingEventApi, bVar.trackingEventApi) && e0.areEqual(this.gcApi, bVar.gcApi) && this.sdkRequestRetriesTTL == bVar.sdkRequestRetriesTTL;
    }

    public final int getAdPauseIntervalMs() {
        return this.pauseInterval * 1000;
    }

    public final List<AdRequestRetry> getAdRequestRetries() {
        return this.adRequestRetries;
    }

    public final String getBundle() {
        return this.bundle;
    }

    public final int getCacheInterval() {
        return this.cacheInterval;
    }

    public final int getCachedIntervalMs() {
        return this.cacheInterval * 1000;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getGcApi() {
        return this.gcApi;
    }

    public final int getIntermediateRetryAmount() {
        return a("INTERMEDIATE_RETRY", 1);
    }

    public final int getIntermediateRetryDelay() {
        return b("INTERMEDIATE_RETRY", 10);
    }

    public final int getLongRetryDelay() {
        return b("LONG_RETRY", 30);
    }

    public final int getPauseInterval() {
        return this.pauseInterval;
    }

    public final int getRewardEndLevelTimeMs() {
        return this.rewardEndlevelTime * 1000;
    }

    public final String getRewardEndlevelPopup() {
        return this.rewardEndlevelPopup;
    }

    public final int getRewardEndlevelTime() {
        return this.rewardEndlevelTime;
    }

    public final int getRewardInLevelTimeMs() {
        return this.rewardInlevelTime * 1000;
    }

    public final String getRewardInlevelPopup() {
        return this.rewardInlevelPopup;
    }

    public final int getRewardInlevelTime() {
        return this.rewardInlevelTime;
    }

    public final int getRewardMinVolumeLevel() {
        return this.rewardMinVolumeLevel;
    }

    public final int getSdkRequestRetriesTTL() {
        return this.sdkRequestRetriesTTL;
    }

    public final int getSessionTimeout() {
        return this.sessionTimeout;
    }

    public final int getShortRetryAmount() {
        return a("SHORT_RETRY", 1);
    }

    public final int getShortRetryDelay() {
        return b("SHORT_RETRY", 5);
    }

    public final String getTrackingEventApi() {
        return this.trackingEventApi;
    }

    public final String getTrackingSessionEventApi() {
        return this.trackingSessionEventApi;
    }

    public int hashCode() {
        return Integer.hashCode(this.sdkRequestRetriesTTL) + o2.e(o2.e(o2.e(o2.e(o2.e(j1.o2.c(g.d(this.sessionTimeout, g.d(this.rewardMinVolumeLevel, o2.e(o2.e(g.d(this.rewardInlevelTime, g.d(this.rewardEndlevelTime, g.d(this.pauseInterval, Integer.hashCode(this.cacheInterval) * 31, 31), 31), 31), 31, this.rewardInlevelPopup), 31, this.rewardEndlevelPopup), 31), 31), 31, this.adRequestRetries), 31, this.bundle), 31, this.country), 31, this.trackingSessionEventApi), 31, this.trackingEventApi), 31, this.gcApi);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GlobalConfig(cacheInterval=");
        sb2.append(this.cacheInterval);
        sb2.append(", pauseInterval=");
        sb2.append(this.pauseInterval);
        sb2.append(", rewardEndlevelTime=");
        sb2.append(this.rewardEndlevelTime);
        sb2.append(", rewardInlevelTime=");
        sb2.append(this.rewardInlevelTime);
        sb2.append(", rewardInlevelPopup=");
        sb2.append(this.rewardInlevelPopup);
        sb2.append(", rewardEndlevelPopup=");
        sb2.append(this.rewardEndlevelPopup);
        sb2.append(", rewardMinVolumeLevel=");
        sb2.append(this.rewardMinVolumeLevel);
        sb2.append(", sessionTimeout=");
        sb2.append(this.sessionTimeout);
        sb2.append(", adRequestRetries=");
        sb2.append(this.adRequestRetries);
        sb2.append(", bundle=");
        sb2.append(this.bundle);
        sb2.append(", country=");
        sb2.append(this.country);
        sb2.append(", trackingSessionEventApi=");
        sb2.append(this.trackingSessionEventApi);
        sb2.append(", trackingEventApi=");
        sb2.append(this.trackingEventApi);
        sb2.append(", gcApi=");
        sb2.append(this.gcApi);
        sb2.append(", sdkRequestRetriesTTL=");
        return g.m(sb2, this.sdkRequestRetriesTTL, ')');
    }

    public b(int i10, int i11, int i12, int i13, String rewardInlevelPopup, String rewardEndlevelPopup, int i14, int i15, List<AdRequestRetry> adRequestRetries, String bundle, String country, String trackingSessionEventApi, String trackingEventApi, String gcApi, int i16) {
        e0.checkNotNullParameter(rewardInlevelPopup, "rewardInlevelPopup");
        e0.checkNotNullParameter(rewardEndlevelPopup, "rewardEndlevelPopup");
        e0.checkNotNullParameter(adRequestRetries, "adRequestRetries");
        e0.checkNotNullParameter(bundle, "bundle");
        e0.checkNotNullParameter(country, "country");
        e0.checkNotNullParameter(trackingSessionEventApi, "trackingSessionEventApi");
        e0.checkNotNullParameter(trackingEventApi, "trackingEventApi");
        e0.checkNotNullParameter(gcApi, "gcApi");
        this.cacheInterval = i10;
        this.pauseInterval = i11;
        this.rewardEndlevelTime = i12;
        this.rewardInlevelTime = i13;
        this.rewardInlevelPopup = rewardInlevelPopup;
        this.rewardEndlevelPopup = rewardEndlevelPopup;
        this.rewardMinVolumeLevel = i14;
        this.sessionTimeout = i15;
        this.adRequestRetries = adRequestRetries;
        this.bundle = bundle;
        this.country = country;
        this.trackingSessionEventApi = trackingSessionEventApi;
        this.trackingEventApi = trackingEventApi;
        this.gcApi = gcApi;
        this.sdkRequestRetriesTTL = i16;
    }

    public /* synthetic */ b(int i10, int i11, int i12, int i13, String str, String str2, int i14, int i15, List list, String str3, String str4, String str5, String str6, String str7, int i16, int i17, u uVar) {
        this((i17 & 1) != 0 ? BuildConfig.VERSION_CODE : i10, (i17 & 2) != 0 ? 300 : i11, (i17 & 4) != 0 ? 0 : i12, (i17 & 8) != 0 ? 10 : i13, (i17 & 16) != 0 ? "https://d870umh9ykbyh.cloudfront.net/a4994afa588bd2bf73bef9b9dc9f25f833620489f84764e824ecca4af5f1916f.png" : str, (i17 & 32) != 0 ? "https://d870umh9ykbyh.cloudfront.net/fbdef80de9baa9471cd2abb7952b63fdb48585c8472b2e5dcf08d8deefdb03e8.png" : str2, (i17 & 64) != 0 ? 20 : i14, (i17 & 128) != 0 ? 1800 : i15, (i17 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? p0.listOf((Object[]) new AdRequestRetry[]{new AdRequestRetry(5, "SHORT_RETRY", 1), new AdRequestRetry(10, "INTERMEDIATE_RETRY", 1), new AdRequestRetry(30, "LONG_RETRY", -1)}) : list, (i17 & 512) != 0 ? "" : str3, (i17 & 1024) != 0 ? "Unknown" : str4, (i17 & 2048) != 0 ? "https://us-east-1.ingaa.xyz/v3/session" : str5, (i17 & 4096) != 0 ? "https://us-east-1.ingaa.xyz/v3/t" : str6, (i17 & Segment.SIZE) != 0 ? "https://us-east-1.ingaa.xyz/v1/gc" : str7, (i17 & 16384) != 0 ? 30 : i16);
    }
}
