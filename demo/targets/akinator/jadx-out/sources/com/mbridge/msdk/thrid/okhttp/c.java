package com.mbridge.msdk.thrid.okhttp;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    public static final c f43161n = new a().b().a();

    /* renamed from: o, reason: collision with root package name */
    public static final c f43162o = new a().c().a(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f43163a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f43164b;

    /* renamed from: c, reason: collision with root package name */
    private final int f43165c;

    /* renamed from: d, reason: collision with root package name */
    private final int f43166d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f43167e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f43168f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f43169g;

    /* renamed from: h, reason: collision with root package name */
    private final int f43170h;

    /* renamed from: i, reason: collision with root package name */
    private final int f43171i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f43172j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f43173k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f43174l;

    /* renamed from: m, reason: collision with root package name */
    String f43175m;

    private c(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f43163a = z10;
        this.f43164b = z11;
        this.f43165c = i10;
        this.f43166d = i11;
        this.f43167e = z12;
        this.f43168f = z13;
        this.f43169g = z14;
        this.f43170h = i12;
        this.f43171i = i13;
        this.f43172j = z15;
        this.f43173k = z16;
        this.f43174l = z17;
        this.f43175m = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.mbridge.msdk.thrid.okhttp.c a(com.mbridge.msdk.thrid.okhttp.p r23) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.c.a(com.mbridge.msdk.thrid.okhttp.p):com.mbridge.msdk.thrid.okhttp.c");
    }

    public boolean b() {
        return this.f43167e;
    }

    public boolean c() {
        return this.f43168f;
    }

    public int d() {
        return this.f43165c;
    }

    public int e() {
        return this.f43170h;
    }

    public int f() {
        return this.f43171i;
    }

    public boolean g() {
        return this.f43169g;
    }

    public boolean h() {
        return this.f43163a;
    }

    public boolean i() {
        return this.f43164b;
    }

    public boolean j() {
        return this.f43172j;
    }

    public String toString() {
        String str = this.f43175m;
        if (str != null) {
            return str;
        }
        String strA = a();
        this.f43175m = strA;
        return strA;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f43176a;

        /* renamed from: b, reason: collision with root package name */
        boolean f43177b;

        /* renamed from: c, reason: collision with root package name */
        int f43178c = -1;

        /* renamed from: d, reason: collision with root package name */
        int f43179d = -1;

        /* renamed from: e, reason: collision with root package name */
        int f43180e = -1;

        /* renamed from: f, reason: collision with root package name */
        boolean f43181f;

        /* renamed from: g, reason: collision with root package name */
        boolean f43182g;

        /* renamed from: h, reason: collision with root package name */
        boolean f43183h;

        public a a(int i10, TimeUnit timeUnit) {
            if (i10 < 0) {
                throw new IllegalArgumentException(a.b.e(i10, "maxStale < 0: "));
            }
            long seconds = timeUnit.toSeconds(i10);
            this.f43179d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
            return this;
        }

        public a b() {
            this.f43176a = true;
            return this;
        }

        public a c() {
            this.f43181f = true;
            return this;
        }

        public c a() {
            return new c(this);
        }
    }

    public c(a aVar) {
        this.f43163a = aVar.f43176a;
        this.f43164b = aVar.f43177b;
        this.f43165c = aVar.f43178c;
        this.f43166d = -1;
        this.f43167e = false;
        this.f43168f = false;
        this.f43169g = false;
        this.f43170h = aVar.f43179d;
        this.f43171i = aVar.f43180e;
        this.f43172j = aVar.f43181f;
        this.f43173k = aVar.f43182g;
        this.f43174l = aVar.f43183h;
    }

    private String a() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f43163a) {
            sb2.append("no-cache, ");
        }
        if (this.f43164b) {
            sb2.append("no-store, ");
        }
        if (this.f43165c != -1) {
            sb2.append("max-age=");
            sb2.append(this.f43165c);
            sb2.append(", ");
        }
        if (this.f43166d != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.f43166d);
            sb2.append(", ");
        }
        if (this.f43167e) {
            sb2.append("private, ");
        }
        if (this.f43168f) {
            sb2.append("public, ");
        }
        if (this.f43169g) {
            sb2.append("must-revalidate, ");
        }
        if (this.f43170h != -1) {
            sb2.append("max-stale=");
            sb2.append(this.f43170h);
            sb2.append(", ");
        }
        if (this.f43171i != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.f43171i);
            sb2.append(", ");
        }
        if (this.f43172j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f43173k) {
            sb2.append("no-transform, ");
        }
        if (this.f43174l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        return sb2.toString();
    }
}
