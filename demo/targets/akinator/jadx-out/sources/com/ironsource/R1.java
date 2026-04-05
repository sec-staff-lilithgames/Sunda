package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class R1 {

    /* renamed from: a, reason: collision with root package name */
    private final D0 f35378a;

    public R1(D0 d02) {
        this.f35378a = d02;
    }

    public void a(Double d10) {
        HashMap map;
        if (d10 != null) {
            map = new HashMap();
            map.put(IronSourceConstants.EVENTS_EXT1, "flooring=" + d10);
        } else {
            map = null;
        }
        this.f35378a.a(A0.AUCTION_REQUEST, map);
    }

    public void b(String str) {
        this.f35378a.a(A0.AUCTION_REQUEST_WATERFALL, b0.e2.s(IronSourceConstants.EVENTS_EXT1, str));
    }

    public void c(String str) {
        this.f35378a.a(A0.AUCTION_RESULT_WATERFALL, b0.e2.s(IronSourceConstants.EVENTS_EXT1, str));
    }

    public String a(int i10, int i11, int i12, int i13) {
        StringBuilder sbF = w0.i.f(i10, i11, "interstitial=", ";rewarded=", ";banner=");
        sbF.append(i12);
        sbF.append(";native=");
        sbF.append(i13);
        return sbF.toString();
    }

    public void a(long j10, int i10, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f35378a.a(A0.AUCTION_FAILED, map);
    }

    public void a(int i10, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f35378a.a(A0.AUCTION_FAILED_NO_CANDIDATES, map);
    }

    public void a(long j10, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        map.put(IronSourceConstants.EVENTS_EXT1, str);
        this.f35378a.a(A0.AUCTION_SUCCESS, map);
    }

    public void a(String str) {
        this.f35378a.a(A0.AD_FORMAT_CAPPED, b0.e2.s("auctionId", str));
    }
}
