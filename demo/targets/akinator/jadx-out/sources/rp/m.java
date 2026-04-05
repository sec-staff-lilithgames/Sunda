package rp;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f84757a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f84758b;

    /* renamed from: c, reason: collision with root package name */
    public jn.t f84759c;

    /* renamed from: d, reason: collision with root package name */
    public int f84760d;

    /* renamed from: e, reason: collision with root package name */
    public int f84761e;

    /* renamed from: f, reason: collision with root package name */
    public int f84762f;

    /* renamed from: g, reason: collision with root package name */
    public int f84763g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f84764h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f84765i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f84766j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f84767k;

    /* renamed from: l, reason: collision with root package name */
    public int f84768l;

    /* renamed from: m, reason: collision with root package name */
    public int f84769m;

    /* renamed from: n, reason: collision with root package name */
    public int f84770n;

    /* renamed from: o, reason: collision with root package name */
    public int f84771o;

    /* renamed from: p, reason: collision with root package name */
    public int f84772p;

    public void clear() {
        this.f84758b = false;
        this.f84757a = false;
    }

    public boolean isISlice() {
        if (!this.f84758b) {
            return false;
        }
        int i10 = this.f84761e;
        return i10 == 7 || i10 == 2;
    }

    public void setAll(jn.t tVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
        this.f84759c = tVar;
        this.f84760d = i10;
        this.f84761e = i11;
        this.f84762f = i12;
        this.f84763g = i13;
        this.f84764h = z10;
        this.f84765i = z11;
        this.f84766j = z12;
        this.f84767k = z13;
        this.f84768l = i14;
        this.f84769m = i15;
        this.f84770n = i16;
        this.f84771o = i17;
        this.f84772p = i18;
        this.f84757a = true;
        this.f84758b = true;
    }

    public void setSliceType(int i10) {
        this.f84761e = i10;
        this.f84758b = true;
    }
}
