package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.md, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3343md {

    /* renamed from: a, reason: collision with root package name */
    private boolean f37224a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f37225b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f37226c;

    /* renamed from: d, reason: collision with root package name */
    private EnumC3415qd f37227d;

    /* renamed from: e, reason: collision with root package name */
    private int f37228e;

    /* renamed from: f, reason: collision with root package name */
    private int f37229f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.md$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f37230a = true;

        /* renamed from: b, reason: collision with root package name */
        private boolean f37231b = false;

        /* renamed from: c, reason: collision with root package name */
        private boolean f37232c = false;

        /* renamed from: d, reason: collision with root package name */
        private EnumC3415qd f37233d = null;

        /* renamed from: e, reason: collision with root package name */
        private int f37234e = 0;

        /* renamed from: f, reason: collision with root package name */
        private int f37235f = 0;

        public a a(boolean z10) {
            this.f37230a = z10;
            return this;
        }

        public a a(boolean z10, EnumC3415qd enumC3415qd, int i10) {
            this.f37231b = z10;
            if (enumC3415qd == null) {
                enumC3415qd = EnumC3415qd.PER_DAY;
            }
            this.f37233d = enumC3415qd;
            this.f37234e = i10;
            return this;
        }

        public a a(boolean z10, int i10) {
            this.f37232c = z10;
            this.f37235f = i10;
            return this;
        }

        public C3343md a() {
            return new C3343md(this.f37230a, this.f37231b, this.f37232c, this.f37233d, this.f37234e, this.f37235f, 0);
        }
    }

    public /* synthetic */ C3343md(boolean z10, boolean z11, boolean z12, EnumC3415qd enumC3415qd, int i10, int i11, int i12) {
        this(z10, z11, z12, enumC3415qd, i10, i11);
    }

    public EnumC3415qd a() {
        return this.f37227d;
    }

    public int b() {
        return this.f37228e;
    }

    public int c() {
        return this.f37229f;
    }

    public boolean d() {
        return this.f37225b;
    }

    public boolean e() {
        return this.f37224a;
    }

    public boolean f() {
        return this.f37226c;
    }

    private C3343md(boolean z10, boolean z11, boolean z12, EnumC3415qd enumC3415qd, int i10, int i11) {
        this.f37224a = z10;
        this.f37225b = z11;
        this.f37226c = z12;
        this.f37227d = enumC3415qd;
        this.f37228e = i10;
        this.f37229f = i11;
    }
}
