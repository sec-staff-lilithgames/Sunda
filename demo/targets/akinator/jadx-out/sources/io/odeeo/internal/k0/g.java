package io.odeeo.internal.k0;

import android.text.Layout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public String f64478a;

    /* renamed from: b, reason: collision with root package name */
    public int f64479b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f64480c;

    /* renamed from: d, reason: collision with root package name */
    public int f64481d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f64482e;

    /* renamed from: k, reason: collision with root package name */
    public float f64488k;

    /* renamed from: l, reason: collision with root package name */
    public String f64489l;

    /* renamed from: o, reason: collision with root package name */
    public Layout.Alignment f64492o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f64493p;

    /* renamed from: r, reason: collision with root package name */
    public b f64495r;

    /* renamed from: f, reason: collision with root package name */
    public int f64483f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f64484g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f64485h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f64486i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f64487j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f64490m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f64491n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f64494q = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f64496s = Float.MAX_VALUE;

    public final g a(g gVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f64480c && gVar.f64480c) {
                setFontColor(gVar.f64479b);
            }
            if (this.f64485h == -1) {
                this.f64485h = gVar.f64485h;
            }
            if (this.f64486i == -1) {
                this.f64486i = gVar.f64486i;
            }
            if (this.f64478a == null && (str = gVar.f64478a) != null) {
                this.f64478a = str;
            }
            if (this.f64483f == -1) {
                this.f64483f = gVar.f64483f;
            }
            if (this.f64484g == -1) {
                this.f64484g = gVar.f64484g;
            }
            if (this.f64491n == -1) {
                this.f64491n = gVar.f64491n;
            }
            if (this.f64492o == null && (alignment2 = gVar.f64492o) != null) {
                this.f64492o = alignment2;
            }
            if (this.f64493p == null && (alignment = gVar.f64493p) != null) {
                this.f64493p = alignment;
            }
            if (this.f64494q == -1) {
                this.f64494q = gVar.f64494q;
            }
            if (this.f64487j == -1) {
                this.f64487j = gVar.f64487j;
                this.f64488k = gVar.f64488k;
            }
            if (this.f64495r == null) {
                this.f64495r = gVar.f64495r;
            }
            if (this.f64496s == Float.MAX_VALUE) {
                this.f64496s = gVar.f64496s;
            }
            if (z10 && !this.f64482e && gVar.f64482e) {
                setBackgroundColor(gVar.f64481d);
            }
            if (z10 && this.f64490m == -1 && (i10 = gVar.f64490m) != -1) {
                this.f64490m = i10;
            }
        }
        return this;
    }

    public g chain(g gVar) {
        return a(gVar, true);
    }

    public int getBackgroundColor() {
        if (this.f64482e) {
            return this.f64481d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int getFontColor() {
        if (this.f64480c) {
            return this.f64479b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String getFontFamily() {
        return this.f64478a;
    }

    public float getFontSize() {
        return this.f64488k;
    }

    public int getFontSizeUnit() {
        return this.f64487j;
    }

    public String getId() {
        return this.f64489l;
    }

    public Layout.Alignment getMultiRowAlign() {
        return this.f64493p;
    }

    public int getRubyPosition() {
        return this.f64491n;
    }

    public int getRubyType() {
        return this.f64490m;
    }

    public float getShearPercentage() {
        return this.f64496s;
    }

    public int getStyle() {
        int i10 = this.f64485h;
        if (i10 == -1 && this.f64486i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f64486i == 1 ? 2 : 0);
    }

    public Layout.Alignment getTextAlign() {
        return this.f64492o;
    }

    public boolean getTextCombine() {
        return this.f64494q == 1;
    }

    public b getTextEmphasis() {
        return this.f64495r;
    }

    public boolean hasBackgroundColor() {
        return this.f64482e;
    }

    public boolean hasFontColor() {
        return this.f64480c;
    }

    public g inherit(g gVar) {
        return a(gVar, false);
    }

    public boolean isLinethrough() {
        return this.f64483f == 1;
    }

    public boolean isUnderline() {
        return this.f64484g == 1;
    }

    public g setBackgroundColor(int i10) {
        this.f64481d = i10;
        this.f64482e = true;
        return this;
    }

    public g setBold(boolean z10) {
        this.f64485h = z10 ? 1 : 0;
        return this;
    }

    public g setFontColor(int i10) {
        this.f64479b = i10;
        this.f64480c = true;
        return this;
    }

    public g setFontFamily(String str) {
        this.f64478a = str;
        return this;
    }

    public g setFontSize(float f10) {
        this.f64488k = f10;
        return this;
    }

    public g setFontSizeUnit(int i10) {
        this.f64487j = i10;
        return this;
    }

    public g setId(String str) {
        this.f64489l = str;
        return this;
    }

    public g setItalic(boolean z10) {
        this.f64486i = z10 ? 1 : 0;
        return this;
    }

    public g setLinethrough(boolean z10) {
        this.f64483f = z10 ? 1 : 0;
        return this;
    }

    public g setMultiRowAlign(Layout.Alignment alignment) {
        this.f64493p = alignment;
        return this;
    }

    public g setRubyPosition(int i10) {
        this.f64491n = i10;
        return this;
    }

    public g setRubyType(int i10) {
        this.f64490m = i10;
        return this;
    }

    public g setShearPercentage(float f10) {
        this.f64496s = f10;
        return this;
    }

    public g setTextAlign(Layout.Alignment alignment) {
        this.f64492o = alignment;
        return this;
    }

    public g setTextCombine(boolean z10) {
        this.f64494q = z10 ? 1 : 0;
        return this;
    }

    public g setTextEmphasis(b bVar) {
        this.f64495r = bVar;
        return this;
    }

    public g setUnderline(boolean z10) {
        this.f64484g = z10 ? 1 : 0;
        return this;
    }
}
