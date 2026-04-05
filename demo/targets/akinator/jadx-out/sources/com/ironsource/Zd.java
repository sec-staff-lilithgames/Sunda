package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class Zd {

    /* renamed from: o, reason: collision with root package name */
    private static final int f35886o = 0;

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<C3325ld> f35887a;

    /* renamed from: b, reason: collision with root package name */
    private H1 f35888b;

    /* renamed from: c, reason: collision with root package name */
    private int f35889c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f35890d;

    /* renamed from: e, reason: collision with root package name */
    private int f35891e;

    /* renamed from: f, reason: collision with root package name */
    private int f35892f;

    /* renamed from: g, reason: collision with root package name */
    private int f35893g;

    /* renamed from: h, reason: collision with root package name */
    private long f35894h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f35895i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f35896j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f35897k;

    /* renamed from: l, reason: collision with root package name */
    private C3325ld f35898l;

    /* renamed from: m, reason: collision with root package name */
    private C3387p2 f35899m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f35900n;

    public Zd() {
        this.f35887a = new ArrayList<>();
        this.f35888b = new H1();
    }

    public void a(C3325ld c3325ld) {
        if (c3325ld != null) {
            this.f35887a.add(c3325ld);
            if (this.f35898l == null) {
                this.f35898l = c3325ld;
            } else if (c3325ld.a(0)) {
                this.f35898l = c3325ld;
            }
        }
    }

    public int b() {
        return this.f35893g;
    }

    public int c() {
        return this.f35892f;
    }

    public boolean d() {
        return this.f35900n;
    }

    public ArrayList<C3325ld> e() {
        return this.f35887a;
    }

    public boolean f() {
        return this.f35895i;
    }

    public int g() {
        return this.f35889c;
    }

    public int h() {
        return this.f35891e;
    }

    public long i() {
        return TimeUnit.SECONDS.toMillis(this.f35891e);
    }

    public boolean j() {
        return this.f35890d;
    }

    public C3387p2 k() {
        return this.f35899m;
    }

    public long l() {
        return this.f35894h;
    }

    public H1 m() {
        return this.f35888b;
    }

    public boolean n() {
        return this.f35897k;
    }

    public boolean o() {
        return this.f35896j;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RewardedVideoConfigurations{parallelLoad=");
        sb2.append(this.f35889c);
        sb2.append(", bidderExclusive=");
        return a.b.p(sb2, this.f35890d, AbstractJsonLexerKt.END_OBJ);
    }

    public Zd(int i10, boolean z10, int i11, int i12, H1 h12, C3387p2 c3387p2, int i13, boolean z11, long j10, boolean z12, boolean z13, boolean z14) {
        this.f35887a = new ArrayList<>();
        this.f35889c = i10;
        this.f35890d = z10;
        this.f35891e = i11;
        this.f35888b = h12;
        this.f35892f = i12;
        this.f35899m = c3387p2;
        this.f35893g = i13;
        this.f35900n = z11;
        this.f35894h = j10;
        this.f35895i = z12;
        this.f35896j = z13;
        this.f35897k = z14;
    }

    public C3325ld a(String str) {
        Iterator<C3325ld> it = this.f35887a.iterator();
        while (it.hasNext()) {
            C3325ld next = it.next();
            if (next.c().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public C3325ld a() {
        Iterator<C3325ld> it = this.f35887a.iterator();
        while (it.hasNext()) {
            C3325ld next = it.next();
            if (next.d()) {
                return next;
            }
        }
        return this.f35898l;
    }
}
