package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f41177a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f41178b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f41179c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f41180d;

    /* renamed from: e, reason: collision with root package name */
    public volatile JSONObject f41181e;

    /* renamed from: f, reason: collision with root package name */
    private String f41182f;

    /* renamed from: g, reason: collision with root package name */
    private volatile ConcurrentHashMap<String, Boolean> f41183g;

    /* renamed from: h, reason: collision with root package name */
    private volatile ConcurrentHashMap<String, Integer> f41184h;

    /* renamed from: i, reason: collision with root package name */
    private volatile ConcurrentHashMap<String, String> f41185i;

    /* renamed from: j, reason: collision with root package name */
    private volatile com.mbridge.msdk.setting.g f41186j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static final r0 f41187a = new r0();
    }

    public static r0 a() {
        return b.f41187a;
    }

    private static Integer b(String str, ConcurrentHashMap<String, Integer> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static String c(String str, ConcurrentHashMap<String, String> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private ConcurrentHashMap<String, String> d() {
        synchronized (this.f41178b) {
            try {
                if (this.f41185i == null) {
                    this.f41185i = new ConcurrentHashMap<>();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f41185i;
    }

    private boolean e() {
        return this.f41186j.D() == 1;
    }

    private r0() {
        this.f41177a = new Object();
        this.f41178b = new Object();
        this.f41179c = new Object();
        this.f41180d = new Object();
    }

    private int a(String str, String str2, int i10) {
        if (!a(true)) {
            try {
                String strOptString = this.f41181e.optString(str, "");
                if (!TextUtils.isEmpty(strOptString)) {
                    String strA = j0.a(strOptString);
                    if (!TextUtils.isEmpty(strA)) {
                        return new JSONObject(strA).optInt(str2, i10);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return i10;
    }

    private ConcurrentHashMap<String, Integer> c() {
        synchronized (this.f41177a) {
            try {
                if (this.f41184h == null) {
                    this.f41184h = new ConcurrentHashMap<>();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f41184h;
    }

    public int b(String str, int i10) {
        Integer numValueOf;
        if (TextUtils.isEmpty(str)) {
            return i10;
        }
        ConcurrentHashMap<String, Integer> concurrentHashMapC = c();
        Integer numB = b(str, concurrentHashMapC);
        if (numB != null) {
            return numB.intValue();
        }
        try {
            numValueOf = Integer.valueOf(a(str, i10));
        } catch (Exception unused) {
            numValueOf = Integer.valueOf(i10);
        }
        concurrentHashMapC.put(str, numValueOf);
        return numValueOf.intValue();
    }

    private int a(String str, int i10) {
        if (!a(true)) {
            try {
                return this.f41181e.optInt(str, i10);
            } catch (Exception unused) {
            }
        }
        return i10;
    }

    public String b(String str, String str2, boolean z10) {
        String strA;
        String strC;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        ConcurrentHashMap<String, String> concurrentHashMapD = d();
        if (z10 && (strC = c(str, concurrentHashMapD)) != null) {
            return strC;
        }
        try {
            strA = a(str, str2, z10);
        } catch (Exception unused) {
            strA = str2;
        }
        concurrentHashMapD.put(str, strA);
        return strA;
    }

    private String a(String str, String str2, boolean z10) {
        if (!a(z10)) {
            try {
                return this.f41181e.optString(str, str2);
            } catch (Exception unused) {
            }
        }
        return str2;
    }

    public boolean a(String str, boolean z10) {
        try {
            return b(str, z10, true);
        } catch (Exception unused) {
            return z10;
        }
    }

    private static Boolean a(String str, ConcurrentHashMap<String, Boolean> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean a(String str, boolean z10, boolean z11) {
        if (!a(z11)) {
            try {
                return this.f41181e.optInt(str, z10 ? 1 : 0) != 0;
            } catch (Exception unused) {
            }
        }
        return z10;
    }

    public int b(String str, String str2, int i10) {
        Integer numValueOf;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                String str3 = str + "_" + str2;
                ConcurrentHashMap<String, Integer> concurrentHashMapC = c();
                Integer numB = b(str3, concurrentHashMapC);
                if (numB != null) {
                    return numB.intValue();
                }
                try {
                    numValueOf = Integer.valueOf(a(str, str2, i10));
                } catch (Exception unused) {
                    numValueOf = Integer.valueOf(i10);
                }
                concurrentHashMapC.put(str3, numValueOf);
                return numValueOf.intValue();
            }
            return b(str2, i10);
        } catch (Exception unused2) {
            return i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a A[Catch: all -> 0x0010, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:21:0x0046, B:23:0x004a, B:24:0x0052, B:12:0x0012, B:14:0x001a, B:16:0x002a, B:17:0x0036, B:20:0x0044), top: B:35:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(boolean r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f41180d
            monitor-enter(r0)
            com.mbridge.msdk.setting.g r1 = r2.f41186j     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L12
            boolean r1 = r2.e()     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L12
            if (r3 != 0) goto L46
            goto L12
        L10:
            r3 = move-exception
            goto L60
        L12:
            java.lang.String r3 = r2.f41182f     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L43
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L43
            if (r3 == 0) goto L36
            com.mbridge.msdk.foundation.controller.c r3 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L43
            java.lang.String r3 = r3.b()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L43
            r2.f41182f = r3     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L43
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L43
            if (r3 == 0) goto L36
            com.mbridge.msdk.foundation.buffer.sharedperference.a r3 = com.mbridge.msdk.foundation.buffer.sharedperference.a.b()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L43
            java.lang.String r1 = "app_id"
            java.lang.String r3 = r3.a(r1)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L43
            r2.f41182f = r3     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L43
        L36:
            com.mbridge.msdk.setting.h r3 = com.mbridge.msdk.setting.h.b()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L43
            java.lang.String r1 = r2.f41182f     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L43
            com.mbridge.msdk.setting.g r3 = r3.b(r1)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L43
            r2.f41186j = r3     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L43
            goto L46
        L43:
            r3 = 0
            r2.f41186j = r3     // Catch: java.lang.Throwable -> L10
        L46:
            com.mbridge.msdk.setting.g r3 = r2.f41186j     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L52
            com.mbridge.msdk.setting.g r3 = r2.f41186j     // Catch: java.lang.Throwable -> L10
            org.json.JSONObject r3 = r3.j0()     // Catch: java.lang.Throwable -> L10
            r2.f41181e = r3     // Catch: java.lang.Throwable -> L10
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            com.mbridge.msdk.setting.g r3 = r2.f41186j
            if (r3 == 0) goto L5e
            org.json.JSONObject r3 = r2.f41181e
            if (r3 != 0) goto L5c
            goto L5e
        L5c:
            r3 = 0
            goto L5f
        L5e:
            r3 = 1
        L5f:
            return r3
        L60:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.r0.a(boolean):boolean");
    }

    public boolean b(String str, boolean z10, boolean z11) {
        Boolean boolValueOf;
        Boolean boolA;
        if (TextUtils.isEmpty(str)) {
            return z10;
        }
        ConcurrentHashMap<String, Boolean> concurrentHashMapB = b();
        if (z11 && (boolA = a(str, concurrentHashMapB)) != null) {
            return boolA.booleanValue();
        }
        try {
            boolValueOf = Boolean.valueOf(a(str, z10, z11));
        } catch (Exception unused) {
            boolValueOf = Boolean.valueOf(z10);
        }
        concurrentHashMapB.put(str, boolValueOf);
        return boolValueOf.booleanValue();
    }

    private ConcurrentHashMap<String, Boolean> b() {
        synchronized (this.f41179c) {
            try {
                if (this.f41183g == null) {
                    this.f41183g = new ConcurrentHashMap<>();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f41183g;
    }
}
