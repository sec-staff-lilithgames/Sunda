package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.b9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3142b9 {

    /* renamed from: a, reason: collision with root package name */
    private final D0 f36061a;

    public C3142b9(D0 d02) {
        this.f36061a = d02;
    }

    public void a(String str, String str2) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, str + "|" + str2);
        this.f36061a.a(A0.INIT_STARTED, map);
    }

    public void a(long j10) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        this.f36061a.a(A0.f33766d, map);
    }

    public void a() {
        this.f36061a.a(A0.INIT_SUCCESS, null);
    }

    public void a(int i10, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        map.put("reason", str);
        this.f36061a.a(A0.INIT_FAILED, map);
    }
}
