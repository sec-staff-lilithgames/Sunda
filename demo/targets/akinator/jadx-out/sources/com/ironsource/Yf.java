package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class Yf {

    /* renamed from: a, reason: collision with root package name */
    private final D0 f35816a;

    public Yf(D0 d02) {
        this.f35816a = d02;
    }

    public void a(long j10) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        this.f35816a.a(A0.COLLECT_TOKENS_COMPLETED, map);
    }

    public void b(Map<String, Object> map, long j10) {
        HashMap map2 = new HashMap();
        map2.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f35816a.a(A0.INSTANCE_COLLECT_TOKEN_TIMED_OUT, map2);
    }

    public void a(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f35816a.a(A0.COLLECT_TOKENS_FAILED, map);
    }

    public void a() {
        this.f35816a.a(A0.COLLECT_TOKEN, new HashMap());
    }

    public void a(Map<String, Object> map) {
        HashMap map2 = new HashMap();
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f35816a.a(A0.INSTANCE_COLLECT_TOKEN, map2);
    }

    public void a(Map<String, Object> map, long j10) {
        HashMap map2 = new HashMap();
        map2.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f35816a.a(A0.INSTANCE_COLLECT_TOKEN_SUCCESS, map2);
    }

    public void a(Map<String, Object> map, long j10, String str) {
        HashMap map2 = new HashMap();
        map2.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        if (!TextUtils.isEmpty(str)) {
            map2.put("reason", str);
        }
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f35816a.a(A0.INSTANCE_COLLECT_TOKEN_FAILED, map2);
    }
}
