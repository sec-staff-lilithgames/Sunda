package com.applovin.impl;

import android.os.SystemClock;
import com.applovin.mediation.MaxAdFormat;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class z4 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f16356a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f16357b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Object f16358c = new Object();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16359a;

        static {
            int[] iArr = new int[b.values().length];
            f16359a = iArr;
            try {
                iArr[b.AD_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16359a[b.AD_UNIT_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16359a[b.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum b {
        AD_FORMAT,
        AD_UNIT_ID,
        ALL
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final a5 f16364a;

        /* renamed from: b, reason: collision with root package name */
        private final long f16365b;

        /* renamed from: c, reason: collision with root package name */
        private final long f16366c;

        public /* synthetic */ c(a5 a5Var, long j10, a aVar) {
            this(a5Var, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d() {
            return SystemClock.elapsedRealtime() - this.f16366c > this.f16365b;
        }

        public boolean a(Object obj) {
            return obj instanceof c;
        }

        public a5 c() {
            return this.f16364a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a((Object) this) || b() != cVar.b() || a() != cVar.a()) {
                return false;
            }
            a5 a5VarC = c();
            a5 a5VarC2 = cVar.c();
            return a5VarC != null ? a5VarC.equals(a5VarC2) : a5VarC2 == null;
        }

        public int hashCode() {
            long jB = b();
            long jA = a();
            a5 a5VarC = c();
            return ((((((int) (jB ^ (jB >>> 32))) + 59) * 59) + ((int) ((jA >>> 32) ^ jA))) * 59) + (a5VarC == null ? 43 : a5VarC.hashCode());
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("SignalCacheManager.SignalWrapper(signal=");
            sb2.append(c());
            sb2.append(", expirationTimeMillis=");
            sb2.append(b());
            sb2.append(", cacheTimestampMillis=");
            return a.b.g(a(), ")", sb2);
        }

        private c(a5 a5Var, long j10) {
            this.f16364a = a5Var;
            this.f16365b = j10;
            this.f16366c = SystemClock.elapsedRealtime();
        }

        public long b() {
            return this.f16365b;
        }

        public long a() {
            return this.f16366c;
        }
    }

    public z4(com.applovin.impl.sdk.k kVar) {
        this.f16356a = kVar;
    }

    public void a(a5 a5Var, b5 b5Var, String str, MaxAdFormat maxAdFormat) {
        if (a5Var == null) {
            return;
        }
        long jV = b5Var.v();
        if (jV <= 0) {
            return;
        }
        this.f16356a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f16356a.O().a("SignalCacheManager", "Caching signal for: " + b5Var);
        }
        String strA = a(b5Var, str, maxAdFormat);
        c cVar = new c(a5Var, jV, null);
        synchronized (this.f16358c) {
            this.f16357b.put(strA, cVar);
        }
    }

    public a5 b(b5 b5Var, String str, MaxAdFormat maxAdFormat) {
        String strA = a(b5Var, str, maxAdFormat);
        synchronized (this.f16358c) {
            try {
                c cVar = (c) this.f16357b.get(strA);
                if (cVar == null) {
                    return null;
                }
                if (cVar.d()) {
                    this.f16357b.remove(strA);
                    return null;
                }
                this.f16356a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f16356a.O().a("SignalCacheManager", "Returning cached signal for: " + b5Var);
                }
                return cVar.f16364a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private String a(b5 b5Var, String str, MaxAdFormat maxAdFormat) {
        String strC = b5Var.c();
        int i10 = a.f16359a[b5Var.t().ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? strC : w0.i.d(strC, "_", str);
        }
        StringBuilder sbT = a.b.t(strC, "_");
        sbT.append(maxAdFormat.getLabel());
        return sbT.toString();
    }
}
