package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class F9 {

    /* renamed from: n, reason: collision with root package name */
    private static final int f34365n = 0;

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<K9> f34366a;

    /* renamed from: b, reason: collision with root package name */
    private H1 f34367b;

    /* renamed from: c, reason: collision with root package name */
    private int f34368c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f34369d;

    /* renamed from: e, reason: collision with root package name */
    private int f34370e;

    /* renamed from: f, reason: collision with root package name */
    private int f34371f;

    /* renamed from: g, reason: collision with root package name */
    private C3387p2 f34372g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f34373h;

    /* renamed from: i, reason: collision with root package name */
    private long f34374i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f34375j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f34376k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f34377l;

    /* renamed from: m, reason: collision with root package name */
    private K9 f34378m;

    public F9() {
        this.f34366a = new ArrayList<>();
        this.f34367b = new H1();
        this.f34372g = new C3387p2();
    }

    public void a(K9 k92) {
        if (k92 != null) {
            this.f34366a.add(k92);
            if (this.f34378m == null) {
                this.f34378m = k92;
            } else if (k92.a(0)) {
                this.f34378m = k92;
            }
        }
    }

    public int b() {
        return this.f34371f;
    }

    public int c() {
        return this.f34368c;
    }

    public int d() {
        return this.f34370e;
    }

    public long e() {
        return TimeUnit.SECONDS.toMillis(this.f34370e);
    }

    public boolean f() {
        return this.f34369d;
    }

    public C3387p2 g() {
        return this.f34372g;
    }

    public long h() {
        return this.f34374i;
    }

    public H1 i() {
        return this.f34367b;
    }

    public boolean j() {
        return this.f34373h;
    }

    public boolean k() {
        return this.f34375j;
    }

    public boolean l() {
        return this.f34377l;
    }

    public boolean m() {
        return this.f34376k;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("InterstitialConfigurations{parallelLoad=");
        sb2.append(this.f34368c);
        sb2.append(", bidderExclusive=");
        return a.b.p(sb2, this.f34369d, AbstractJsonLexerKt.END_OBJ);
    }

    public F9(int i10, boolean z10, int i11, H1 h12, C3387p2 c3387p2, int i12, boolean z11, long j10, boolean z12, boolean z13, boolean z14) {
        this.f34366a = new ArrayList<>();
        this.f34368c = i10;
        this.f34369d = z10;
        this.f34370e = i11;
        this.f34367b = h12;
        this.f34372g = c3387p2;
        this.f34375j = z12;
        this.f34376k = z13;
        this.f34371f = i12;
        this.f34373h = z11;
        this.f34374i = j10;
        this.f34377l = z14;
    }

    public K9 a(String str) {
        Iterator<K9> it = this.f34366a.iterator();
        while (it.hasNext()) {
            K9 next = it.next();
            if (next.c().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public K9 a() {
        Iterator<K9> it = this.f34366a.iterator();
        while (it.hasNext()) {
            K9 next = it.next();
            if (next.d()) {
                return next;
            }
        }
        return this.f34378m;
    }
}
