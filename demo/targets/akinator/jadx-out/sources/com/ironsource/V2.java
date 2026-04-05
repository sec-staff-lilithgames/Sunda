package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class V2 {

    /* renamed from: p, reason: collision with root package name */
    private static final int f35599p = 0;

    /* renamed from: a, reason: collision with root package name */
    private H1 f35600a;

    /* renamed from: b, reason: collision with root package name */
    private int f35601b;

    /* renamed from: c, reason: collision with root package name */
    private long f35602c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f35603d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<C3262i3> f35604e;

    /* renamed from: f, reason: collision with root package name */
    private C3262i3 f35605f;

    /* renamed from: g, reason: collision with root package name */
    private int f35606g;

    /* renamed from: h, reason: collision with root package name */
    private int f35607h;

    /* renamed from: i, reason: collision with root package name */
    private C3387p2 f35608i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f35609j;

    /* renamed from: k, reason: collision with root package name */
    private long f35610k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f35611l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f35612m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f35613n;

    /* renamed from: o, reason: collision with root package name */
    private long f35614o;

    public V2() {
        this.f35600a = new H1();
        this.f35604e = new ArrayList<>();
    }

    public int a() {
        return this.f35601b;
    }

    public long b() {
        return this.f35602c;
    }

    public boolean c() {
        return this.f35603d;
    }

    public C3387p2 d() {
        return this.f35608i;
    }

    public long e() {
        return this.f35610k;
    }

    public int f() {
        return this.f35607h;
    }

    public H1 g() {
        return this.f35600a;
    }

    public int h() {
        return this.f35606g;
    }

    public C3262i3 i() {
        Iterator<C3262i3> it = this.f35604e.iterator();
        while (it.hasNext()) {
            C3262i3 next = it.next();
            if (next.d()) {
                return next;
            }
        }
        C3262i3 c3262i3 = this.f35605f;
        return c3262i3 != null ? c3262i3 : new C3373o5();
    }

    public long j() {
        return this.f35614o;
    }

    public boolean k() {
        return this.f35609j;
    }

    public boolean l() {
        return this.f35611l;
    }

    public boolean m() {
        return this.f35613n;
    }

    public boolean n() {
        return this.f35612m;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BannerConfigurations{parallelLoad=");
        sb2.append(this.f35601b);
        sb2.append(", bidderExclusive=");
        return a.b.p(sb2, this.f35603d, AbstractJsonLexerKt.END_OBJ);
    }

    public void a(C3262i3 c3262i3) {
        if (c3262i3 != null) {
            this.f35604e.add(c3262i3);
            if (this.f35605f == null) {
                this.f35605f = c3262i3;
            } else if (c3262i3.a(0)) {
                this.f35605f = c3262i3;
            }
        }
    }

    public V2(int i10, long j10, boolean z10, H1 h12, int i11, C3387p2 c3387p2, int i12, boolean z11, long j11, boolean z12, boolean z13, boolean z14, long j12) {
        this.f35604e = new ArrayList<>();
        this.f35601b = i10;
        this.f35602c = j10;
        this.f35603d = z10;
        this.f35600a = h12;
        this.f35606g = i11;
        this.f35607h = i12;
        this.f35608i = c3387p2;
        this.f35609j = z11;
        this.f35610k = j11;
        this.f35611l = z12;
        this.f35612m = z13;
        this.f35613n = z14;
        this.f35614o = j12;
    }

    public C3262i3 a(String str) {
        Iterator<C3262i3> it = this.f35604e.iterator();
        while (it.hasNext()) {
            C3262i3 next = it.next();
            if (next.c().equals(str)) {
                return next;
            }
        }
        return null;
    }
}
