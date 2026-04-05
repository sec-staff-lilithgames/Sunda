package com.ironsource;

import android.app.Activity;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class M {

    /* renamed from: a, reason: collision with root package name */
    private final D0 f34825a;

    public M(D0 d02) {
        this.f34825a = d02;
    }

    public void a(Activity activity, String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        if (activity != null) {
            map.put(IronSourceConstants.EVENTS_EXT1, IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW);
        }
        this.f34825a.a(A0.SHOW_AD, map);
    }

    public void b(String str) {
        a(str, (String) null);
    }

    public void c(String str) {
        this.f34825a.a(A0.AD_DISMISS_SCREEN, b0.e2.s("placement", str));
    }

    public void d(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f34825a.a(A0.AD_ENDED, map);
    }

    public void e(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f34825a.a(A0.AD_INFO_CHANGED, map);
    }

    public void f(String str) {
        this.f34825a.a(A0.AD_LEFT_APPLICATION, b0.e2.s("placement", str));
    }

    public void g(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f34825a.a(A0.AD_OPENED, map);
    }

    public void h(String str) {
        this.f34825a.a(A0.AD_PRESENT_SCREEN, b0.e2.s("placement", str));
    }

    public void i(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f34825a.a(A0.AD_STARTED, map);
    }

    public void j(String str) {
        this.f34825a.a(A0.AD_VIEW_BOUND, b0.e2.s("placement", str));
    }

    public void k(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f34825a.a(A0.AD_VISIBLE, map);
    }

    public void b(String str, String str2) {
        HashMap mapS = b0.e2.s("placement", str);
        if (!TextUtils.isEmpty(str2)) {
            mapS.put("reason", str2);
        }
        this.f34825a.a(A0.PLACEMENT_CAPPED, mapS);
    }

    public void a(boolean z10) {
        HashMap map = new HashMap();
        map.put("status", z10 ? "true" : "false");
        this.f34825a.a(A0.SHOW_AD_CHANCE, map);
    }

    public void a(String str, int i10, String str2, String str3) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        map.put("reason", str2);
        if (!TextUtils.isEmpty(str3)) {
            map.put(IronSourceConstants.EVENTS_EXT1, str3);
        }
        this.f34825a.a(A0.SHOW_AD_FAILED, map);
    }

    public void a(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f34825a.a(A0.AD_CLICKED, map);
    }

    public void a(String str, String str2) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            map.put(IronSourceConstants.EVENTS_EXT1, str2);
        }
        this.f34825a.a(A0.AD_CLOSED, map);
    }

    public void a(String str, String str2, int i10, long j10, String str3, long j11, Map<String, Object> map, String str4) {
        HashMap map2 = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map2.put("placement", str);
        }
        map2.put(IronSourceConstants.EVENTS_REWARD_NAME, str2);
        map2.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(i10));
        map2.put(IronSourceConstants.EVENTS_TRANS_ID, str3);
        if (j11 != 0) {
            map2.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j11));
        }
        if (map != null) {
            map2.putAll(map);
        }
        if (!TextUtils.isEmpty(str4)) {
            map2.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, str4);
        }
        this.f34825a.a(A0.AD_REWARDED, map2, j10);
    }

    public void a(String str, String str2, boolean z10) {
        HashMap map = new HashMap();
        map.put("isMultipleAdUnits", 1);
        map.put("placement", str);
        if (!TextUtils.isEmpty(str2)) {
            map.put("reason", str2);
        }
        map.put(IronSourceConstants.EVENTS_EXT1, z10 ? "true" : "false");
        map.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        this.f34825a.a(A0.CHECK_PLACEMENT_CAPPED, map);
    }

    public void a() {
        this.f34825a.a(A0.SESSION_CAPPED, null);
    }
}
