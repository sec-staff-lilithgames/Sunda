package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class Ab {

    /* renamed from: a, reason: collision with root package name */
    private final D0 f33836a;

    public Ab(D0 d02) {
        this.f33836a = d02;
    }

    public void a(boolean z10) {
        HashMap map = new HashMap();
        if (z10) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f33836a.a(A0.LOAD_AD, map);
    }

    public void b(int i10) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        this.f33836a.a(A0.SKIP_RELOAD_AD, map);
    }

    public void a() {
        this.f33836a.a(A0.RELOAD_AD, new HashMap());
    }

    public void b(long j10, int i10) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        this.f33836a.a(A0.RELOAD_AD_NO_FILL, map);
    }

    public void a(int i10) {
        HashMap map = new HashMap();
        map.put("sessionDepth", Integer.valueOf(i10));
        this.f33836a.a(A0.DESTROY_AD, map);
    }

    public void a(long j10, boolean z10) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        if (z10) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f33836a.a(A0.LOAD_AD_SUCCESS, map);
    }

    public void a(long j10) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        this.f33836a.a(A0.RELOAD_AD_SUCCESS, map);
    }

    public void a(long j10, int i10, boolean z10) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        if (z10) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f33836a.a(A0.LOAD_AD_FAILED, map);
    }

    public void a(long j10, int i10, String str, boolean z10) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        if (z10) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f33836a.a(A0.LOAD_AD_FAILED_WITH_REASON, map);
    }

    public void a(long j10, int i10, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f33836a.a(A0.RELOAD_AD_FAILED_WITH_REASON, map);
    }

    public void a(boolean z10, long j10, boolean z11) {
        A0 a02;
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        if (z11) {
            map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS));
            map.put("reason", "loaded ads are expired");
        }
        D0 d02 = this.f33836a;
        if (z10) {
            a02 = A0.AD_AVAILABILITY_CHANGED_TRUE;
        } else {
            a02 = A0.AD_AVAILABILITY_CHANGED_FALSE;
        }
        d02.a(a02, map);
    }

    public void a(long j10, int i10) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        this.f33836a.a(A0.LOAD_AD_NO_FILL, map);
    }

    public void a(Boolean bool, String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f33836a.a(bool.booleanValue() ? A0.AD_READY_TRUE : A0.AD_READY_FALSE, map);
    }
}
