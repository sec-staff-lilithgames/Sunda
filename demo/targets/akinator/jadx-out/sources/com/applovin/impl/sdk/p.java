package com.applovin.impl.sdk;

import com.applovin.impl.v2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final o f15665a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f15666b = new HashMap(5);

    /* renamed from: c, reason: collision with root package name */
    private final Object f15667c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Map f15668d = Collections.synchronizedMap(new HashMap(5));

    /* renamed from: e, reason: collision with root package name */
    private final Map f15669e = Collections.synchronizedMap(new HashMap(5));

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f15670a;

        /* renamed from: b, reason: collision with root package name */
        private final String f15671b;

        /* renamed from: c, reason: collision with root package name */
        private final String f15672c;

        public a(String str, String str2, String str3) {
            this.f15670a = str;
            this.f15671b = str2;
            this.f15672c = str3;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public String b() {
            return this.f15670a;
        }

        public String c() {
            return this.f15672c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this)) {
                return false;
            }
            String strB = b();
            String strB2 = aVar.b();
            if (strB != null ? !strB.equals(strB2) : strB2 != null) {
                return false;
            }
            String strA = a();
            String strA2 = aVar.a();
            if (strA != null ? !strA.equals(strA2) : strA2 != null) {
                return false;
            }
            String strC = c();
            String strC2 = aVar.c();
            return strC != null ? strC.equals(strC2) : strC2 == null;
        }

        public int hashCode() {
            String strB = b();
            int iHashCode = strB == null ? 43 : strB.hashCode();
            String strA = a();
            int iHashCode2 = ((iHashCode + 59) * 59) + (strA == null ? 43 : strA.hashCode());
            String strC = c();
            return (iHashCode2 * 59) + (strC != null ? strC.hashCode() : 43);
        }

        public String toString() {
            return "MediationWaterfallWinnerTracker.WinningAd(bCode=" + b() + ", adapterName=" + a() + ", networkName=" + c() + ")";
        }

        public String a() {
            return this.f15671b;
        }
    }

    public p(k kVar) {
        this.f15665a = kVar.O();
    }

    public String a(String str) {
        return (String) this.f15669e.get(str);
    }

    public void b(v2 v2Var) {
        this.f15668d.put(v2Var.getAdUnitId(), v2Var.P());
    }

    public void c(v2 v2Var) {
        synchronized (this.f15667c) {
            try {
                if (o.a()) {
                    this.f15665a.a("MediationWaterfallWinnerTracker", "Tracking winning ad: " + v2Var);
                }
                this.f15666b.put(v2Var.getAdUnitId(), new a(v2Var.C(), v2Var.c(), v2Var.getNetworkName()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f15669e.put(v2Var.getAdUnitId(), v2Var.P());
    }

    public void a(v2 v2Var) {
        synchronized (this.f15667c) {
            try {
                String adUnitId = v2Var.getAdUnitId();
                a aVar = (a) this.f15666b.get(adUnitId);
                if (aVar == null) {
                    if (o.a()) {
                        this.f15665a.a("MediationWaterfallWinnerTracker", "No previous winner to clear.");
                    }
                    return;
                }
                if (v2Var.C().equals(aVar.b())) {
                    if (o.a()) {
                        this.f15665a.a("MediationWaterfallWinnerTracker", "Clearing previous winning ad: " + aVar);
                    }
                    this.f15666b.remove(adUnitId);
                } else if (o.a()) {
                    this.f15665a.a("MediationWaterfallWinnerTracker", "Previous winner not cleared for ad: " + v2Var + " , since it could have already been updated with a new ad: " + aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String b(String str) {
        return (String) this.f15668d.get(str);
    }

    public a c(String str) {
        a aVar;
        synchronized (this.f15667c) {
            aVar = (a) this.f15666b.get(str);
        }
        return aVar;
    }
}
