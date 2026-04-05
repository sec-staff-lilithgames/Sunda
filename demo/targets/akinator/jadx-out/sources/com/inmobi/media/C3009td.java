package com.inmobi.media;

import android.content.Context;
import android.os.Process;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.inmobi.commons.core.configs.SignalsConfig;
import com.ironsource.C3191e4;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.reflect.KProperty;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.td, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3009td {

    /* renamed from: d, reason: collision with root package name */
    public static String f33393d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f33394e;

    /* renamed from: f, reason: collision with root package name */
    public static long f33395f;

    /* renamed from: h, reason: collision with root package name */
    public static final SignalsConfig.SessionConfig f33397h;

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicBoolean f33398i;

    /* renamed from: j, reason: collision with root package name */
    public static final I6 f33399j;

    /* renamed from: k, reason: collision with root package name */
    public static final C3099z1 f33400k;

    /* renamed from: l, reason: collision with root package name */
    public static final C3099z1 f33401l;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f33391b = {kotlin.jvm.internal.c1.property1(new kotlin.jvm.internal.s0(C3009td.class, "sessionCnt", "getSessionCnt()I", 0)), kotlin.jvm.internal.c1.property1(new kotlin.jvm.internal.s0(C3009td.class, "userRetention", "getUserRetention()I", 0))};

    /* renamed from: a, reason: collision with root package name */
    public static final C3009td f33390a = new C3009td();

    /* renamed from: c, reason: collision with root package name */
    public static final String f33392c = "td";

    /* renamed from: g, reason: collision with root package name */
    public static final List f33396g = uu.p0.mutableListOf(0, 0, 0, 0);

    static {
        int i10 = -1;
        boolean z10 = false;
        LinkedHashMap linkedHashMap = Q2.f32149a;
        I6 i6A = null;
        f33397h = ((SignalsConfig) AbstractC3035v5.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getSessionConfig();
        f33398i = new AtomicBoolean(false);
        Context contextD = C2925od.d();
        if (contextD != null) {
            ConcurrentHashMap concurrentHashMap = I6.f31865b;
            i6A = H6.a(contextD, "session_pref_file");
        }
        f33399j = i6A;
        int i11 = 12;
        f33400k = new C3099z1((Integer) i10, (kv.a) C2975rd.f33324a, z10, i11);
        f33401l = new C3099z1((Integer) i10, (kv.a) C2992sd.f33372a, z10, i11);
    }

    public static int a() {
        I6 i62 = f33399j;
        if (i62 == null) {
            return 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        kotlin.jvm.internal.e0.checkNotNullParameter("u-ret", C3191e4.h.W);
        return Integer.min((int) ((jCurrentTimeMillis - i62.f31866a.getLong("u-ret", jCurrentTimeMillis)) / 86400000), Integer.MAX_VALUE);
    }

    public static void c() {
        if (f33398i.getAndSet(true)) {
            return;
        }
        LinkedHashMap linkedHashMap = Q2.f32149a;
        if (((SignalsConfig) AbstractC3035v5.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getIceConfig().isSessionEnabled()) {
            f33393d = w0.i.c("toString(...)");
            String TAG = f33392c;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
        }
        f33395f = System.currentTimeMillis() - Process.getElapsedCpuTime();
        SignalsConfig.SessionConfig sessionConfig = f33397h;
        if (sessionConfig.getSigControlList().contains(5)) {
            I6 i62 = f33399j;
            if (i62 != null) {
                kotlin.jvm.internal.e0.checkNotNullParameter("cnt", C3191e4.h.W);
                I6.a(i62, "cnt", Integer.min(i62.f31866a.getInt("cnt", 0) + 1, Integer.MAX_VALUE), false, 4, (Object) null);
            }
            f33400k.a();
        }
        if (sessionConfig.getSigControlList().contains(6)) {
            I6 i63 = f33399j;
            if (i63 != null) {
                kotlin.jvm.internal.e0.checkNotNullParameter("u-ret", C3191e4.h.W);
                if (!i63.f31866a.contains("u-ret")) {
                    I6.a(i63, "u-ret", System.currentTimeMillis(), false, 4, (Object) null);
                }
            }
            f33401l.a();
        }
    }

    public final JSONObject b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SignalsConfig.SessionConfig sessionConfig = f33397h;
        if (sessionConfig.getSigControlList().contains(0)) {
            linkedHashMap.put(ApsMetricsDataMap.APSMETRICS_FIELD_STARTTIME, Long.valueOf(f33395f));
        }
        if (sessionConfig.getSigControlList().contains(5)) {
            C3099z1 c3099z1 = f33400k;
            KProperty[] kPropertyArr = f33391b;
            if (((Number) c3099z1.getValue(this, kPropertyArr[0])).intValue() != -1) {
                linkedHashMap.put("cnt", Integer.valueOf(((Number) c3099z1.getValue(this, kPropertyArr[0])).intValue()));
            }
        }
        if (sessionConfig.getSigControlList().contains(6)) {
            C3099z1 c3099z12 = f33401l;
            KProperty[] kPropertyArr2 = f33391b;
            if (((Number) c3099z12.getValue(this, kPropertyArr2[1])).intValue() != -1) {
                linkedHashMap.put("u-ret", Integer.valueOf(((Number) c3099z12.getValue(this, kPropertyArr2[1])).intValue()));
            }
        }
        List mutableList = uu.y0.toMutableList((Collection) f33396g);
        if (!sessionConfig.getSigControlList().contains(1)) {
            mutableList.set(0, -1);
        }
        if (!sessionConfig.getSigControlList().contains(2)) {
            mutableList.set(1, -1);
        }
        if (!sessionConfig.getSigControlList().contains(3)) {
            mutableList.set(2, -1);
        }
        if (!sessionConfig.getSigControlList().contains(4)) {
            mutableList.set(3, -1);
        }
        if (!(mutableList instanceof Collection) || !mutableList.isEmpty()) {
            Iterator it = mutableList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Number) it.next()).intValue() != -1) {
                        linkedHashMap.put("dep", mutableList);
                        break;
                    }
                }
            }
        }
        try {
            return new JSONObject(linkedHashMap);
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    public static void a(String adtype, Boolean bool) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adtype, "adtype");
        if (kotlin.jvm.internal.e0.areEqual(adtype, "banner") && f33397h.getSigControlList().contains(1)) {
            List list = f33396g;
            list.set(0, Integer.valueOf(Integer.min(((Number) list.get(0)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (kotlin.jvm.internal.e0.areEqual(adtype, "int") && !kotlin.jvm.internal.e0.areEqual(bool, Boolean.TRUE) && f33397h.getSigControlList().contains(2)) {
            List list2 = f33396g;
            list2.set(1, Integer.valueOf(Integer.min(((Number) list2.get(1)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (kotlin.jvm.internal.e0.areEqual(adtype, "native") && f33397h.getSigControlList().contains(4)) {
            List list3 = f33396g;
            list3.set(3, Integer.valueOf(Integer.min(((Number) list3.get(3)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (kotlin.jvm.internal.e0.areEqual(bool, Boolean.TRUE) && f33397h.getSigControlList().contains(3)) {
            List list4 = f33396g;
            list4.set(2, Integer.valueOf(Integer.min(((Number) list4.get(2)).intValue() + 1, Integer.MAX_VALUE)));
        }
    }
}
