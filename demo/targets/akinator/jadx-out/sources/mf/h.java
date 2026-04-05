package mf;

import android.text.Layout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public String f74557a;

    /* renamed from: b, reason: collision with root package name */
    public int f74558b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f74559c;

    /* renamed from: d, reason: collision with root package name */
    public int f74560d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f74561e;

    /* renamed from: k, reason: collision with root package name */
    public float f74567k;

    /* renamed from: l, reason: collision with root package name */
    public String f74568l;

    /* renamed from: o, reason: collision with root package name */
    public Layout.Alignment f74571o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f74572p;

    /* renamed from: r, reason: collision with root package name */
    public b f74574r;

    /* renamed from: f, reason: collision with root package name */
    public int f74562f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f74563g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f74564h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f74565i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f74566j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f74569m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f74570n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f74573q = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f74575s = Float.MAX_VALUE;

    public final void a(h hVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (hVar != null) {
            if (!this.f74559c && hVar.f74559c) {
                setFontColor(hVar.f74558b);
            }
            if (this.f74564h == -1) {
                this.f74564h = hVar.f74564h;
            }
            if (this.f74565i == -1) {
                this.f74565i = hVar.f74565i;
            }
            if (this.f74557a == null && (str = hVar.f74557a) != null) {
                this.f74557a = str;
            }
            if (this.f74562f == -1) {
                this.f74562f = hVar.f74562f;
            }
            if (this.f74563g == -1) {
                this.f74563g = hVar.f74563g;
            }
            if (this.f74570n == -1) {
                this.f74570n = hVar.f74570n;
            }
            if (this.f74571o == null && (alignment2 = hVar.f74571o) != null) {
                this.f74571o = alignment2;
            }
            if (this.f74572p == null && (alignment = hVar.f74572p) != null) {
                this.f74572p = alignment;
            }
            if (this.f74573q == -1) {
                this.f74573q = hVar.f74573q;
            }
            if (this.f74566j == -1) {
                this.f74566j = hVar.f74566j;
                this.f74567k = hVar.f74567k;
            }
            if (this.f74574r == null) {
                this.f74574r = hVar.f74574r;
            }
            if (this.f74575s == Float.MAX_VALUE) {
                this.f74575s = hVar.f74575s;
            }
            if (z10 && !this.f74561e && hVar.f74561e) {
                setBackgroundColor(hVar.f74560d);
            }
            if (z10 && this.f74569m == -1 && (i10 = hVar.f74569m) != -1) {
                this.f74569m = i10;
            }
        }
    }

    public h chain(h hVar) {
        a(hVar, true);
        return this;
    }

    public int getBackgroundColor() {
        if (this.f74561e) {
            return this.f74560d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int getFontColor() {
        if (this.f74559c) {
            return this.f74558b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String getFontFamily() {
        return this.f74557a;
    }

    public float getFontSize() {
        return this.f74567k;
    }

    public int getFontSizeUnit() {
        return this.f74566j;
    }

    public String getId() {
        return this.f74568l;
    }

    public Layout.Alignment getMultiRowAlign() {
        return this.f74572p;
    }

    public int getRubyPosition() {
        return this.f74570n;
    }

    public int getRubyType() {
        return this.f74569m;
    }

    public float getShearPercentage() {
        return this.f74575s;
    }

    public int getStyle() {
        int i10 = this.f74564h;
        if (i10 == -1 && this.f74565i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f74565i == 1 ? 2 : 0);
    }

    public Layout.Alignment getTextAlign() {
        return this.f74571o;
    }

    public boolean getTextCombine() {
        return this.f74573q == 1;
    }

    public b getTextEmphasis() {
        return this.f74574r;
    }

    public boolean hasBackgroundColor() {
        return this.f74561e;
    }

    public boolean hasFontColor() {
        return this.f74559c;
    }

    public h inherit(h hVar) {
        a(hVar, false);
        return this;
    }

    public boolean isLinethrough() {
        return this.f74562f == 1;
    }

    public boolean isUnderline() {
        return this.f74563g == 1;
    }

    public h setBackgroundColor(int i10) {
        this.f74560d = i10;
        this.f74561e = true;
        return this;
    }

    public h setBold(boolean z10) {
        this.f74564h = z10 ? 1 : 0;
        return this;
    }

    public h setFontColor(int i10) {
        this.f74558b = i10;
        this.f74559c = true;
        return this;
    }

    public h setFontFamily(String str) {
        this.f74557a = str;
        return this;
    }

    public h setFontSize(float f10) {
        this.f74567k = f10;
        return this;
    }

    public h setFontSizeUnit(int i10) {
        this.f74566j = i10;
        return this;
    }

    public h setId(String str) {
        this.f74568l = str;
        return this;
    }

    public h setItalic(boolean z10) {
        this.f74565i = z10 ? 1 : 0;
        return this;
    }

    public h setLinethrough(boolean z10) {
        this.f74562f = z10 ? 1 : 0;
        return this;
    }

    public h setMultiRowAlign(Layout.Alignment alignment) {
        this.f74572p = alignment;
        return this;
    }

    public h setRubyPosition(int i10) {
        this.f74570n = i10;
        return this;
    }

    public h setRubyType(int i10) {
        this.f74569m = i10;
        return this;
    }

    public h setShearPercentage(float f10) {
        this.f74575s = f10;
        return this;
    }

    public h setTextAlign(Layout.Alignment alignment) {
        this.f74571o = alignment;
        return this;
    }

    public h setTextCombine(boolean z10) {
        this.f74573q = z10 ? 1 : 0;
        return this;
    }

    public h setTextEmphasis(b bVar) {
        this.f74574r = bVar;
        return this;
    }

    public h setUnderline(boolean z10) {
        this.f74563g = z10 ? 1 : 0;
        return this;
    }
}
