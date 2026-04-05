package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.RootConfig;
import com.inmobi.sdk.InMobiSdk;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class M4 {

    /* renamed from: a, reason: collision with root package name */
    public static final M4 f32021a = new M4();

    /* renamed from: b, reason: collision with root package name */
    public static JSONObject f32022b;

    /* renamed from: c, reason: collision with root package name */
    public static JSONObject f32023c;

    /* renamed from: d, reason: collision with root package name */
    public static JSONObject f32024d;

    /* renamed from: e, reason: collision with root package name */
    public static RootConfig f32025e;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final org.json.JSONObject c() throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.M4.c():org.json.JSONObject");
    }

    public static final byte e() throws JSONException {
        JSONObject jSONObjectC = c();
        if (jSONObjectC == null) {
            return (byte) -1;
        }
        if (jSONObjectC.has(InMobiSdk.IM_GDPR_CONSENT_IAB)) {
            return (byte) 1;
        }
        if (!jSONObjectC.has(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE)) {
            return (byte) -1;
        }
        try {
            return jSONObjectC.getBoolean(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE) ? (byte) 1 : (byte) 0;
        } catch (JSONException unused) {
            return (byte) -1;
        }
    }

    public static final void h() {
        HashMap map = F3.f31768a;
        Config configA = F3.a(C2925od.b(), "root");
        kotlin.jvm.internal.e0.checkNotNull(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig");
        f32025e = (RootConfig) configA;
    }

    public static final void i() {
        f32022b = null;
        f32023c = null;
        f32024d = null;
        f32025e = null;
    }

    public final void a(JSONObject jSONObject) {
        f32024d = jSONObject;
    }

    public final JSONObject b() {
        return f32024d;
    }

    public final JSONObject g() {
        return f32022b;
    }

    public final void j() {
        LinkedHashMap linkedHashMap = Q2.f32149a;
        f32025e = (RootConfig) AbstractC3035v5.a("root", "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig", null);
    }

    public static /* synthetic */ boolean a(M4 m42, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return m42.a(z10);
    }

    public static final void b(JSONObject jSONObject) {
        if (jSONObject != null) {
            f32022b = jSONObject;
        }
    }

    public final boolean a(boolean z10) throws JSONException {
        if (f32025e == null) {
            j();
        }
        byte bE = e();
        RootConfig rootConfig = f32025e;
        return bE == 1 || kotlin.jvm.internal.e0.areEqual(rootConfig != null ? Boolean.valueOf(rootConfig.shouldTransmitRequest()) : null, Boolean.TRUE) || z10;
    }

    public final boolean a() {
        return a(this, false, 1, null);
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void f() {
    }

    public static final void c(JSONObject jSONObject) {
        if (jSONObject != null) {
            f32023c = jSONObject;
        }
    }
}
