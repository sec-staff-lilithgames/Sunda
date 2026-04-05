package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.dg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3185dg {

    /* renamed from: a, reason: collision with root package name */
    private final D0 f36308a;

    public C3185dg(D0 d02) {
        this.f36308a = d02;
    }

    public void a(int i10, String str, String str2) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        map.put("reason", str);
        map.put(IronSourceConstants.EVENTS_EXT1, str2);
        this.f36308a.a(A0.TROUBLESHOOT_NOTIFICATION_ERROR, map);
    }

    public void b(int i10, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        map.put("reason", str);
        this.f36308a.a(A0.TROUBLESHOOT_LOAD_FAILED, map);
    }

    public void c() {
        this.f36308a.a(A0.TROUBLESHOOT_LOAD_SUCCESS, null);
    }

    public void d() {
        this.f36308a.a(A0.TROUBLESHOOT_SHOW, null);
    }

    public void e() {
        this.f36308a.a(A0.TROUBLESHOOT_SHOW_SUCCESS, null);
    }

    public void f(String str) {
        this.f36308a.a(A0.TROUBLESHOOT_ILLEGAL_STATE, b0.e2.s("reason", str));
    }

    public void g(String str) {
        this.f36308a.a(A0.TROUBLESHOOT_INTERNAL_ERROR, b0.e2.s("reason", str));
    }

    public void h(String str) {
        this.f36308a.a(A0.TROUBLESHOOT_LOAD_SKIPPED, b0.e2.s("reason", str));
    }

    public void i(String str) {
        this.f36308a.a(A0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, b0.e2.s("reason", str));
    }

    public void j(String str) {
        this.f36308a.a(A0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, b0.e2.s("reason", str));
    }

    public void k(String str) {
        this.f36308a.a(A0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, b0.e2.s("reason", str));
    }

    public void l(String str) {
        this.f36308a.a(A0.TROUBLESHOOT_UNEXPECTED_CLOSED, b0.e2.s("reason", str));
    }

    public void m(String str) {
        this.f36308a.a(A0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, b0.e2.s("reason", str));
    }

    public void n(String str) {
        this.f36308a.a(A0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, b0.e2.s("reason", str));
    }

    public void o(String str) {
        this.f36308a.a(A0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, b0.e2.s("reason", str));
    }

    public void p(String str) {
        this.f36308a.a(A0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, b0.e2.s("reason", str));
    }

    public void q(String str) {
        this.f36308a.a(A0.TROUBLESHOOT_UNEXPECTED_OPENED, b0.e2.s("reason", str));
    }

    public void r(String str) {
        this.f36308a.a(A0.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED, b0.e2.s("reason", str));
    }

    public void s(String str) {
        this.f36308a.a(A0.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS, b0.e2.s("reason", str));
    }

    public void t(String str) {
        this.f36308a.a(A0.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED, b0.e2.s("reason", str));
    }

    public void u(String str) {
        this.f36308a.a(A0.TROUBLESHOOT_UNEXPECTED_TIMEOUT, b0.e2.s("reason", str));
    }

    public void v(String str) {
        this.f36308a.a(A0.TROUBLESHOOT_WATERFALL_OVERHEAD, b0.e2.s("reason", str));
    }

    public void c(String str) {
        this.f36308a.a(A0.TROUBLESHOOT_BN_RELOAD_EXCEPTION, b0.e2.s("reason", str));
    }

    public void d(String str) {
        this.f36308a.a(A0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_PAUSE, b0.e2.s("reason", str));
    }

    public void e(String str) {
        this.f36308a.a(A0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_RESUME, b0.e2.s("reason", str));
    }

    public void b() {
        this.f36308a.a(A0.TROUBLESHOOT_LOAD, null);
    }

    public void a(Long l9) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, l9);
        this.f36308a.a(A0.TROUBLESHOOT_LOAD_WHILE_LOADED, map);
    }

    public void b(String str) {
        this.f36308a.a(A0.TROUBLESHOOT_IMPRESSION_TIMEOUT, b0.e2.s("reason", str));
    }

    public void a(LevelPlayAdError levelPlayAdError) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(levelPlayAdError.getErrorCode()));
        map.put("reason", levelPlayAdError.getErrorMessage());
        this.f36308a.a(A0.TROUBLESHOOT_SHOW_FAILED, map);
    }

    public void b(String str, long j10, long j11, long j12) {
        HashMap mapS = b0.e2.s("reason", str);
        mapS.put(IronSourceConstants.EVENTS_EXT1, a(j10, j11, j12));
        this.f36308a.a(A0.TROUBLESHOOT_BANNER_REFRESH_RESUMED, mapS);
    }

    public void a(int i10, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        map.put("reason", str);
        this.f36308a.a(A0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, map);
    }

    public void a(String str) {
        this.f36308a.a(A0.TROUBLESHOOT_AD_EXPIRED, b0.e2.s("reason", str));
    }

    public void a(String str, long j10) {
        HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.isEmpty() ? "" : a.b.l("provider=", str, ";"));
        sb2.append("expirationDuration=");
        sb2.append(j10);
        map.put(IronSourceConstants.EVENTS_EXT1, sb2.toString());
        this.f36308a.a(A0.TROUBLESHOOT_AD_EXPIRED, map);
    }

    public void a(String str, long j10, long j11, long j12) {
        HashMap mapS = b0.e2.s("reason", str);
        mapS.put(IronSourceConstants.EVENTS_EXT1, a(j10, j11, j12));
        this.f36308a.a(A0.TROUBLESHOOT_BANNER_REFRESH_PAUSED, mapS);
    }

    public void a(boolean z10, long j10) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, "isAnimated:" + (z10 ? 1 : 0));
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        this.f36308a.a(A0.TROUBLESHOOT_BANNER_REFRESH_TRANSITION, map);
    }

    public void a(long j10) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        this.f36308a.a(A0.TROUBLESHOOT_BANNER_REFRESH_ANIMATED, map);
    }

    private String a(long j10, long j11, long j12) {
        StringBuilder sbR = b0.e2.r(j10, "interval: ", ", remainingTime: ");
        sbR.append(j11);
        return b0.e2.i(j12, ", timePassed: ", sbR);
    }

    public void a(LevelPlayAdInfo levelPlayAdInfo, LevelPlayAdInfo levelPlayAdInfo2) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, String.format(Locale.ENGLISH, "oldAdNetwork=%s;oldInstanceId=%s;oldRevenue=%.3f;oldPrecision=%s;newAdNetwork=%s;newInstanceId=%s;newRevenue=%.3f;newPrecision=%s;delta=%.3f", levelPlayAdInfo.getAdNetwork(), levelPlayAdInfo.getInstanceId(), Double.valueOf(levelPlayAdInfo.getRevenue()), levelPlayAdInfo.getPrecision(), levelPlayAdInfo2.getAdNetwork(), levelPlayAdInfo2.getInstanceId(), Double.valueOf(levelPlayAdInfo2.getRevenue()), levelPlayAdInfo2.getPrecision(), Double.valueOf(levelPlayAdInfo2.getRevenue() - levelPlayAdInfo.getRevenue())));
        this.f36308a.a(A0.TROUBLESHOOT_AD_INFO_CHANGED, map);
    }

    public void a() {
        this.f36308a.a(A0.TROUBLESHOOT_DISPOSE, null);
    }

    public void a(long j10, long j11, String str) {
        HashMap map = new HashMap();
        Locale locale = Locale.ENGLISH;
        StringBuilder sbR = b0.e2.r(j10, "refreshDuration=", ";notVisibleDuration=");
        sbR.append(j11);
        sbR.append(";reason=");
        sbR.append(str);
        map.put(IronSourceConstants.EVENTS_EXT1, sbR.toString());
        this.f36308a.a(A0.R0, map);
    }
}
