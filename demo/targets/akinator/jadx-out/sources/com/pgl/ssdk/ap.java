package com.pgl.ssdk;

import android.content.Context;
import com.apm.insight.b.El.rJqlArycrfkilN;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class ap extends am {

    /* renamed from: n, reason: collision with root package name */
    private Context f50417n;

    /* renamed from: o, reason: collision with root package name */
    private final int f50418o;

    public ap(Context context, int i10) {
        super(context);
        this.f50417n = context;
        this.f50418o = i10;
    }

    @Override // com.pgl.ssdk.am
    public String a() {
        int i10 = this.f50418o;
        if (i10 == 222) {
            return "/ssdk/v2/r?os=0&ver=7.6.0.0.overseas-rc.1&mode=1&app_ver=" + ab.h(this.f50417n) + rJqlArycrfkilN.azEh + ad.a() + "&did=" + com.pgl.ssdk.ces.b.d() + "&aid=" + com.pgl.ssdk.ces.b.c();
        }
        if (i10 != 301) {
            return null;
        }
        return "/ssdk/sd/token?os=android&app_id=" + com.pgl.ssdk.ces.b.c() + "&did=" + com.pgl.ssdk.ces.b.d() + "&app_ver=" + ab.h(this.f50417n) + "&platform=android&ver=7.6.0.0.overseas-rc.1&mode=1";
    }

    @Override // com.pgl.ssdk.am
    public void a(int i10, byte[] bArr) {
        try {
            if (i10 == 200) {
                int i11 = this.f50418o;
                if (i11 == 222) {
                    ((Integer) com.pgl.ssdk.ces.a.meta(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, null, bArr)).getClass();
                    return;
                }
                if (i11 == 301) {
                    Object objA = a5.a(bArr);
                    au.b("write token result = ".concat(String.valueOf(objA)));
                    if ((objA instanceof Integer) && ((Integer) objA).intValue() == 0) {
                        au.b("write token succ");
                        a5.f50350a = 200;
                        return;
                    } else {
                        if (objA instanceof String) {
                            a5.f50352c = (String) objA;
                            a5.f50350a = 200;
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            an.b(this.f50417n);
        } catch (Throwable unused) {
        }
    }
}
