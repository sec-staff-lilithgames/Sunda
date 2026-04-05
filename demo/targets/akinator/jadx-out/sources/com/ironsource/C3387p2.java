package com.ironsource;

import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.p2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3387p2 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f38061a;

    /* renamed from: b, reason: collision with root package name */
    private String f38062b;

    /* renamed from: c, reason: collision with root package name */
    private String f38063c;

    /* renamed from: d, reason: collision with root package name */
    private String f38064d;

    /* renamed from: e, reason: collision with root package name */
    private int f38065e;

    /* renamed from: f, reason: collision with root package name */
    private int f38066f;

    /* renamed from: g, reason: collision with root package name */
    private int f38067g;

    /* renamed from: h, reason: collision with root package name */
    private long f38068h;

    /* renamed from: i, reason: collision with root package name */
    private long f38069i;

    /* renamed from: j, reason: collision with root package name */
    private long f38070j;

    /* renamed from: k, reason: collision with root package name */
    private long f38071k;

    /* renamed from: l, reason: collision with root package name */
    private long f38072l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f38073m;

    /* renamed from: n, reason: collision with root package name */
    private ArrayList<String> f38074n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f38075o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f38076p;

    /* renamed from: q, reason: collision with root package name */
    private int f38077q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f38078r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f38079s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f38080t;

    public C3387p2() {
        this.f38062b = "";
        this.f38063c = "";
        this.f38064d = "";
        this.f38069i = 0L;
        this.f38070j = 0L;
        this.f38071k = 0L;
        this.f38072l = 0L;
        this.f38073m = true;
        this.f38074n = new ArrayList<>();
        this.f38067g = 0;
        this.f38075o = false;
        this.f38076p = false;
        this.f38077q = 1;
    }

    public String a() {
        return this.f38062b;
    }

    public long b() {
        return this.f38070j;
    }

    public int c() {
        return this.f38066f;
    }

    public int d() {
        return this.f38077q;
    }

    public boolean e() {
        return this.f38073m;
    }

    public ArrayList<String> f() {
        return this.f38074n;
    }

    public int g() {
        return this.f38065e;
    }

    public boolean h() {
        return this.f38061a;
    }

    public int i() {
        return this.f38067g;
    }

    public long j() {
        return this.f38071k;
    }

    public long k() {
        return this.f38069i;
    }

    public long l() {
        return this.f38072l;
    }

    public long m() {
        return this.f38068h;
    }

    public boolean n() {
        return this.f38080t;
    }

    public boolean o() {
        return this.f38075o;
    }

    public boolean p() {
        return this.f38076p;
    }

    public boolean q() {
        return this.f38079s;
    }

    public boolean r() {
        return this.f38078r;
    }

    public String a(boolean z10) {
        return z10 ? this.f38064d : this.f38063c;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f38074n.add(str);
    }

    public C3387p2(String str, String str2, String str3, int i10, int i11, long j10, long j11, long j12, long j13, long j14, boolean z10, int i12, boolean z11, boolean z12, boolean z13, int i13, boolean z14, boolean z15, boolean z16) {
        this.f38062b = str;
        this.f38063c = str2;
        this.f38064d = str3;
        this.f38065e = i10;
        this.f38066f = i11;
        this.f38068h = j10;
        this.f38061a = z13;
        this.f38069i = j11;
        this.f38070j = j12;
        this.f38071k = j13;
        this.f38072l = j14;
        this.f38073m = z10;
        this.f38067g = i12;
        this.f38074n = new ArrayList<>();
        this.f38075o = z11;
        this.f38076p = z12;
        this.f38077q = i13;
        this.f38078r = z14;
        this.f38079s = z15;
        this.f38080t = z16;
    }
}
