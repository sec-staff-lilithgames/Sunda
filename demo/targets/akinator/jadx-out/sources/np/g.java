package np;

import android.text.Layout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public String f77152a;

    /* renamed from: b, reason: collision with root package name */
    public int f77153b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f77154c;

    /* renamed from: d, reason: collision with root package name */
    public int f77155d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f77156e;

    /* renamed from: k, reason: collision with root package name */
    public float f77162k;

    /* renamed from: l, reason: collision with root package name */
    public String f77163l;

    /* renamed from: o, reason: collision with root package name */
    public Layout.Alignment f77166o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f77167p;

    /* renamed from: r, reason: collision with root package name */
    public b f77169r;

    /* renamed from: t, reason: collision with root package name */
    public String f77171t;

    /* renamed from: u, reason: collision with root package name */
    public String f77172u;

    /* renamed from: f, reason: collision with root package name */
    public int f77157f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f77158g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f77159h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f77160i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f77161j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f77164m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f77165n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f77168q = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f77170s = Float.MAX_VALUE;

    public final void a(g gVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f77154c && gVar.f77154c) {
                setFontColor(gVar.f77153b);
            }
            if (this.f77159h == -1) {
                this.f77159h = gVar.f77159h;
            }
            if (this.f77160i == -1) {
                this.f77160i = gVar.f77160i;
            }
            if (this.f77152a == null && (str = gVar.f77152a) != null) {
                this.f77152a = str;
            }
            if (this.f77157f == -1) {
                this.f77157f = gVar.f77157f;
            }
            if (this.f77158g == -1) {
                this.f77158g = gVar.f77158g;
            }
            if (this.f77165n == -1) {
                this.f77165n = gVar.f77165n;
            }
            if (this.f77166o == null && (alignment2 = gVar.f77166o) != null) {
                this.f77166o = alignment2;
            }
            if (this.f77167p == null && (alignment = gVar.f77167p) != null) {
                this.f77167p = alignment;
            }
            if (this.f77168q == -1) {
                this.f77168q = gVar.f77168q;
            }
            if (this.f77161j == -1) {
                this.f77161j = gVar.f77161j;
                this.f77162k = gVar.f77162k;
            }
            if (this.f77169r == null) {
                this.f77169r = gVar.f77169r;
            }
            if (this.f77170s == Float.MAX_VALUE) {
                this.f77170s = gVar.f77170s;
            }
            if (this.f77171t == null) {
                this.f77171t = gVar.f77171t;
            }
            if (this.f77172u == null) {
                this.f77172u = gVar.f77172u;
            }
            if (z10 && !this.f77156e && gVar.f77156e) {
                setBackgroundColor(gVar.f77155d);
            }
            if (z10 && this.f77164m == -1 && (i10 = gVar.f77164m) != -1) {
                this.f77164m = i10;
            }
        }
    }

    public g chain(g gVar) {
        a(gVar, true);
        return this;
    }

    public int getBackgroundColor() {
        if (this.f77156e) {
            return this.f77155d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public String getExtent() {
        return this.f77172u;
    }

    public int getFontColor() {
        if (this.f77154c) {
            return this.f77153b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String getFontFamily() {
        return this.f77152a;
    }

    public float getFontSize() {
        return this.f77162k;
    }

    public int getFontSizeUnit() {
        return this.f77161j;
    }

    public String getId() {
        return this.f77163l;
    }

    public Layout.Alignment getMultiRowAlign() {
        return this.f77167p;
    }

    public String getOrigin() {
        return this.f77171t;
    }

    public int getRubyPosition() {
        return this.f77165n;
    }

    public int getRubyType() {
        return this.f77164m;
    }

    public float getShearPercentage() {
        return this.f77170s;
    }

    public int getStyle() {
        int i10 = this.f77159h;
        if (i10 == -1 && this.f77160i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f77160i == 1 ? 2 : 0);
    }

    public Layout.Alignment getTextAlign() {
        return this.f77166o;
    }

    public boolean getTextCombine() {
        return this.f77168q == 1;
    }

    public b getTextEmphasis() {
        return this.f77169r;
    }

    public boolean hasBackgroundColor() {
        return this.f77156e;
    }

    public boolean hasFontColor() {
        return this.f77154c;
    }

    public g inherit(g gVar) {
        a(gVar, false);
        return this;
    }

    public boolean isLinethrough() {
        return this.f77157f == 1;
    }

    public boolean isUnderline() {
        return this.f77158g == 1;
    }

    public g setBackgroundColor(int i10) {
        this.f77155d = i10;
        this.f77156e = true;
        return this;
    }

    public g setBold(boolean z10) {
        this.f77159h = z10 ? 1 : 0;
        return this;
    }

    public g setExtent(String str) {
        this.f77172u = str;
        return this;
    }

    public g setFontColor(int i10) {
        this.f77153b = i10;
        this.f77154c = true;
        return this;
    }

    public g setFontFamily(String str) {
        this.f77152a = str;
        return this;
    }

    public g setFontSize(float f10) {
        this.f77162k = f10;
        return this;
    }

    public g setFontSizeUnit(int i10) {
        this.f77161j = i10;
        return this;
    }

    public g setId(String str) {
        this.f77163l = str;
        return this;
    }

    public g setItalic(boolean z10) {
        this.f77160i = z10 ? 1 : 0;
        return this;
    }

    public g setLinethrough(boolean z10) {
        this.f77157f = z10 ? 1 : 0;
        return this;
    }

    public g setMultiRowAlign(Layout.Alignment alignment) {
        this.f77167p = alignment;
        return this;
    }

    public g setOrigin(String str) {
        this.f77171t = str;
        return this;
    }

    public g setRubyPosition(int i10) {
        this.f77165n = i10;
        return this;
    }

    public g setRubyType(int i10) {
        this.f77164m = i10;
        return this;
    }

    public g setShearPercentage(float f10) {
        this.f77170s = f10;
        return this;
    }

    public g setTextAlign(Layout.Alignment alignment) {
        this.f77166o = alignment;
        return this;
    }

    public g setTextCombine(boolean z10) {
        this.f77168q = z10 ? 1 : 0;
        return this;
    }

    public g setTextEmphasis(b bVar) {
        this.f77169r = bVar;
        return this;
    }

    public g setUnderline(boolean z10) {
        this.f77158g = z10 ? 1 : 0;
        return this;
    }
}
