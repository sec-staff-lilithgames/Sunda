package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import b0.e2;
import com.ironsource.Y1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.moloco.sdk.service_locator.a;
import java.net.URLEncoder;
import java.util.concurrent.TimeUnit;
import sv.x;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final tu.o f49450a = q.lazy(new com.moloco.sdk.service_locator.b(15));

    /* renamed from: b, reason: collision with root package name */
    public static final x f49451b = new x("\\[ERRORCODE]");

    /* renamed from: c, reason: collision with root package name */
    public static final x f49452c = new x("\\[CONTENTPLAYHEAD]");

    /* renamed from: d, reason: collision with root package name */
    public static final x f49453d = new x("\\[CACHEBUSTING]");

    /* renamed from: e, reason: collision with root package name */
    public static final x f49454e = new x("\\[ASSETURI]");

    /* renamed from: f, reason: collision with root package name */
    public static final x f49455f = new x("\\[[^]]*]");

    /* renamed from: g, reason: collision with root package name */
    public static final x f49456g = new x("\\[MEDIAPLAYHEAD]");

    /* renamed from: h, reason: collision with root package name */
    public static final x f49457h = new x("\\[ADPLAYHEAD]");

    public static final n b() {
        return e();
    }

    public static final String d() {
        return e2.m("%08d", "format(...)", 1, new Object[]{Integer.valueOf(ov.g.f79860b.nextInt(1, 99999999))});
    }

    public static final o e() {
        return (o) f49450a.getValue();
    }

    public static final o a() {
        return new o(a.i.f47469a.c());
    }

    public static final String b(String str, Integer num, Integer num2, String str2, String str3) {
        if (num != null) {
            str = f49451b.replace(str, num.toString());
        }
        if (num2 != null) {
            str = f49456g.replace(f49457h.replace(f49452c.replace(str, b(num2.intValue())), a(num2.intValue())), c(num2.intValue()));
        }
        if (str2 != null) {
            str = f49454e.replace(str, a(str2));
        }
        if (str3 != null) {
            str = f49453d.replace(str, str3);
        }
        return f49455f.replace(str, "");
    }

    public static final String c(int i10) {
        return Y1.f35726f;
    }

    public static final String a(int i10) {
        return b(i10);
    }

    public static final String a(String str) {
        try {
            return URLEncoder.encode(str, C.UTF8_NAME);
        } catch (Exception unused) {
            return "";
        }
    }

    public static final String b(int i10) {
        long j10 = i10;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return e2.m("%02d:%02d:%02d.%03d", "format(...)", 4, new Object[]{Long.valueOf(timeUnit.toHours(j10)), Long.valueOf(timeUnit.toMinutes(j10) % TimeUnit.HOURS.toMinutes(1L)), Long.valueOf(timeUnit.toSeconds(j10) % TimeUnit.MINUTES.toSeconds(1L)), Long.valueOf(j10 % 1000)});
    }
}
