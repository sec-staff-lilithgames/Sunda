package com.applovin.impl.sdk.network;

import com.applovin.impl.s4;
import com.applovin.impl.sdk.k;
import com.applovin.impl.v4;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private String f15583a;

    /* renamed from: b, reason: collision with root package name */
    private String f15584b;

    /* renamed from: c, reason: collision with root package name */
    private Map f15585c;

    /* renamed from: d, reason: collision with root package name */
    private Map f15586d;

    /* renamed from: e, reason: collision with root package name */
    private final JSONObject f15587e;

    /* renamed from: f, reason: collision with root package name */
    private String f15588f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f15589g;

    /* renamed from: h, reason: collision with root package name */
    private final int f15590h;

    /* renamed from: i, reason: collision with root package name */
    private int f15591i;

    /* renamed from: j, reason: collision with root package name */
    private final int f15592j;

    /* renamed from: k, reason: collision with root package name */
    private final int f15593k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f15594l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f15595m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f15596n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f15597o;

    /* renamed from: p, reason: collision with root package name */
    private final s4.a f15598p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f15599q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f15600r;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.applovin.impl.sdk.network.a$a, reason: collision with other inner class name */
    public static class C0042a {

        /* renamed from: a, reason: collision with root package name */
        String f15601a;

        /* renamed from: b, reason: collision with root package name */
        String f15602b;

        /* renamed from: c, reason: collision with root package name */
        String f15603c;

        /* renamed from: e, reason: collision with root package name */
        Map f15605e;

        /* renamed from: f, reason: collision with root package name */
        JSONObject f15606f;

        /* renamed from: g, reason: collision with root package name */
        Object f15607g;

        /* renamed from: i, reason: collision with root package name */
        int f15609i;

        /* renamed from: j, reason: collision with root package name */
        int f15610j;

        /* renamed from: k, reason: collision with root package name */
        boolean f15611k;

        /* renamed from: m, reason: collision with root package name */
        boolean f15613m;

        /* renamed from: n, reason: collision with root package name */
        boolean f15614n;

        /* renamed from: o, reason: collision with root package name */
        boolean f15615o;

        /* renamed from: p, reason: collision with root package name */
        boolean f15616p;

        /* renamed from: q, reason: collision with root package name */
        s4.a f15617q;

        /* renamed from: h, reason: collision with root package name */
        int f15608h = 1;

        /* renamed from: l, reason: collision with root package name */
        boolean f15612l = true;

        /* renamed from: d, reason: collision with root package name */
        Map f15604d = new HashMap();

        public C0042a(k kVar) {
            this.f15609i = ((Integer) kVar.a(v4.R2)).intValue();
            this.f15610j = ((Integer) kVar.a(v4.Q2)).intValue();
            this.f15613m = ((Boolean) kVar.a(v4.f15987n3)).booleanValue();
            this.f15614n = ((Boolean) kVar.a(v4.f15883a5)).booleanValue();
            this.f15617q = s4.a.a(((Integer) kVar.a(v4.f15891b5)).intValue());
            this.f15616p = ((Boolean) kVar.a(v4.f16085z5)).booleanValue();
        }

        public C0042a a(Map map) {
            this.f15605e = map;
            return this;
        }

        public C0042a b(String str) {
            this.f15602b = str;
            return this;
        }

        public C0042a c(String str) {
            this.f15601a = str;
            return this;
        }

        public C0042a d(boolean z10) {
            this.f15612l = z10;
            return this;
        }

        public C0042a e(boolean z10) {
            this.f15613m = z10;
            return this;
        }

        public C0042a f(boolean z10) {
            this.f15615o = z10;
            return this;
        }

        public C0042a a(JSONObject jSONObject) {
            this.f15606f = jSONObject;
            return this;
        }

        public C0042a b(Map map) {
            this.f15604d = map;
            return this;
        }

        public C0042a c(int i10) {
            this.f15609i = i10;
            return this;
        }

        public C0042a a(String str) {
            this.f15603c = str;
            return this;
        }

        public C0042a b(int i10) {
            this.f15610j = i10;
            return this;
        }

        public C0042a c(boolean z10) {
            this.f15611k = z10;
            return this;
        }

        public C0042a a(Object obj) {
            this.f15607g = obj;
            return this;
        }

        public C0042a b(boolean z10) {
            this.f15616p = z10;
            return this;
        }

        public C0042a a(int i10) {
            this.f15608h = i10;
            return this;
        }

        public C0042a a(boolean z10) {
            this.f15614n = z10;
            return this;
        }

        public C0042a a(s4.a aVar) {
            this.f15617q = aVar;
            return this;
        }

        public a a() {
            return new a(this);
        }
    }

    public a(C0042a c0042a) {
        this.f15583a = c0042a.f15602b;
        this.f15584b = c0042a.f15601a;
        this.f15585c = c0042a.f15604d;
        this.f15586d = c0042a.f15605e;
        this.f15587e = c0042a.f15606f;
        this.f15588f = c0042a.f15603c;
        this.f15589g = c0042a.f15607g;
        int i10 = c0042a.f15608h;
        this.f15590h = i10;
        this.f15591i = i10;
        this.f15592j = c0042a.f15609i;
        this.f15593k = c0042a.f15610j;
        this.f15594l = c0042a.f15611k;
        this.f15595m = c0042a.f15612l;
        this.f15596n = c0042a.f15613m;
        this.f15597o = c0042a.f15614n;
        this.f15598p = c0042a.f15617q;
        this.f15599q = c0042a.f15615o;
        this.f15600r = c0042a.f15616p;
    }

    public void a(String str) {
        this.f15583a = str;
    }

    public void b(String str) {
        this.f15584b = str;
    }

    public int c() {
        return this.f15590h - this.f15591i;
    }

    public Object d() {
        return this.f15589g;
    }

    public s4.a e() {
        return this.f15598p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f15583a;
        if (str == null ? aVar.f15583a != null : !str.equals(aVar.f15583a)) {
            return false;
        }
        Map map = this.f15585c;
        if (map == null ? aVar.f15585c != null : !map.equals(aVar.f15585c)) {
            return false;
        }
        Map map2 = this.f15586d;
        if (map2 == null ? aVar.f15586d != null : !map2.equals(aVar.f15586d)) {
            return false;
        }
        String str2 = this.f15588f;
        if (str2 == null ? aVar.f15588f != null : !str2.equals(aVar.f15588f)) {
            return false;
        }
        String str3 = this.f15584b;
        if (str3 == null ? aVar.f15584b != null : !str3.equals(aVar.f15584b)) {
            return false;
        }
        JSONObject jSONObject = this.f15587e;
        if (jSONObject == null ? aVar.f15587e != null : !jSONObject.equals(aVar.f15587e)) {
            return false;
        }
        Object obj2 = this.f15589g;
        if (obj2 == null ? aVar.f15589g == null : obj2.equals(aVar.f15589g)) {
            return this.f15590h == aVar.f15590h && this.f15591i == aVar.f15591i && this.f15592j == aVar.f15592j && this.f15593k == aVar.f15593k && this.f15594l == aVar.f15594l && this.f15595m == aVar.f15595m && this.f15596n == aVar.f15596n && this.f15597o == aVar.f15597o && this.f15598p == aVar.f15598p && this.f15599q == aVar.f15599q && this.f15600r == aVar.f15600r;
        }
        return false;
    }

    public String f() {
        return this.f15583a;
    }

    public Map g() {
        return this.f15586d;
    }

    public String h() {
        return this.f15584b;
    }

    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f15583a;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f15588f;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f15584b;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Object obj = this.f15589g;
        int iB = ((((this.f15598p.b() + ((((((((((((((((((iHashCode4 + (obj != null ? obj.hashCode() : 0)) * 31) + this.f15590h) * 31) + this.f15591i) * 31) + this.f15592j) * 31) + this.f15593k) * 31) + (this.f15594l ? 1 : 0)) * 31) + (this.f15595m ? 1 : 0)) * 31) + (this.f15596n ? 1 : 0)) * 31) + (this.f15597o ? 1 : 0)) * 31)) * 31) + (this.f15599q ? 1 : 0)) * 31) + (this.f15600r ? 1 : 0);
        Map map = this.f15585c;
        if (map != null) {
            iB = (iB * 31) + map.hashCode();
        }
        Map map2 = this.f15586d;
        if (map2 != null) {
            iB = (iB * 31) + map2.hashCode();
        }
        JSONObject jSONObject = this.f15587e;
        if (jSONObject == null) {
            return iB;
        }
        char[] charArray = jSONObject.toString().toCharArray();
        Arrays.sort(charArray);
        return new String(charArray).hashCode() + (iB * 31);
    }

    public Map i() {
        return this.f15585c;
    }

    public int j() {
        return this.f15591i;
    }

    public int k() {
        return this.f15593k;
    }

    public int l() {
        return this.f15592j;
    }

    public boolean m() {
        return this.f15597o;
    }

    public boolean n() {
        return this.f15594l;
    }

    public boolean o() {
        return this.f15600r;
    }

    public boolean p() {
        return this.f15595m;
    }

    public boolean q() {
        return this.f15596n;
    }

    public boolean r() {
        return this.f15599q;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HttpRequest {endpoint=");
        sb2.append(this.f15583a);
        sb2.append(", backupEndpoint=");
        sb2.append(this.f15588f);
        sb2.append(", httpMethod=");
        sb2.append(this.f15584b);
        sb2.append(", httpHeaders=");
        sb2.append(this.f15586d);
        sb2.append(", body=");
        sb2.append(this.f15587e);
        sb2.append(", emptyResponse=");
        sb2.append(this.f15589g);
        sb2.append(", initialRetryAttempts=");
        sb2.append(this.f15590h);
        sb2.append(", retryAttemptsLeft=");
        sb2.append(this.f15591i);
        sb2.append(", timeoutMillis=");
        sb2.append(this.f15592j);
        sb2.append(", retryDelayMillis=");
        sb2.append(this.f15593k);
        sb2.append(", exponentialRetries=");
        sb2.append(this.f15594l);
        sb2.append(", retryOnAllErrors=");
        sb2.append(this.f15595m);
        sb2.append(", retryOnNoConnection=");
        sb2.append(this.f15596n);
        sb2.append(", encodingEnabled=");
        sb2.append(this.f15597o);
        sb2.append(", encodingType=");
        sb2.append(this.f15598p);
        sb2.append(", trackConnectionSpeed=");
        sb2.append(this.f15599q);
        sb2.append(", gzipBodyEncoding=");
        return a.b.p(sb2, this.f15600r, AbstractJsonLexerKt.END_OBJ);
    }

    public String a() {
        return this.f15588f;
    }

    public JSONObject b() {
        return this.f15587e;
    }

    public void a(int i10) {
        this.f15591i = i10;
    }

    public static C0042a a(k kVar) {
        return new C0042a(kVar);
    }
}
