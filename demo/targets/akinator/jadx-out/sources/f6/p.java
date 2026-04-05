package f6;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p extends s {

    /* renamed from: d, reason: collision with root package name */
    public n3.d f55387d;

    /* renamed from: e, reason: collision with root package name */
    public float f55388e;

    /* renamed from: f, reason: collision with root package name */
    public n3.d f55389f;

    /* renamed from: g, reason: collision with root package name */
    public float f55390g;

    /* renamed from: h, reason: collision with root package name */
    public float f55391h;

    /* renamed from: i, reason: collision with root package name */
    public float f55392i;

    /* renamed from: j, reason: collision with root package name */
    public float f55393j;

    /* renamed from: k, reason: collision with root package name */
    public float f55394k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f55395l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f55396m;

    /* renamed from: n, reason: collision with root package name */
    public float f55397n;

    @Override // f6.s
    public boolean canApplyTheme() {
        return false;
    }

    public float getFillAlpha() {
        return this.f55391h;
    }

    public int getFillColor() {
        return this.f55389f.getColor();
    }

    public float getStrokeAlpha() {
        return this.f55390g;
    }

    public int getStrokeColor() {
        return this.f55387d.getColor();
    }

    public float getStrokeWidth() {
        return this.f55388e;
    }

    public float getTrimPathEnd() {
        return this.f55393j;
    }

    public float getTrimPathOffset() {
        return this.f55394k;
    }

    public float getTrimPathStart() {
        return this.f55392i;
    }

    public void inflate(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainAttributes = n3.q.obtainAttributes(resources, theme, attributeSet, a.f55361c);
        if (n3.q.hasAttribute(xmlPullParser, "pathData")) {
            String string = typedArrayObtainAttributes.getString(0);
            if (string != null) {
                this.f55410b = string;
            }
            String string2 = typedArrayObtainAttributes.getString(2);
            if (string2 != null) {
                this.f55409a = o3.f.createNodesFromPathData(string2);
            }
            this.f55389f = n3.q.getNamedComplexColor(typedArrayObtainAttributes, xmlPullParser, theme, "fillColor", 1, 0);
            this.f55391h = n3.q.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "fillAlpha", 12, this.f55391h);
            int namedInt = n3.q.getNamedInt(typedArrayObtainAttributes, xmlPullParser, "strokeLineCap", 8, -1);
            Paint.Cap cap = this.f55395l;
            if (namedInt == 0) {
                cap = Paint.Cap.BUTT;
            } else if (namedInt == 1) {
                cap = Paint.Cap.ROUND;
            } else if (namedInt == 2) {
                cap = Paint.Cap.SQUARE;
            }
            this.f55395l = cap;
            int namedInt2 = n3.q.getNamedInt(typedArrayObtainAttributes, xmlPullParser, "strokeLineJoin", 9, -1);
            Paint.Join join = this.f55396m;
            if (namedInt2 == 0) {
                join = Paint.Join.MITER;
            } else if (namedInt2 == 1) {
                join = Paint.Join.ROUND;
            } else if (namedInt2 == 2) {
                join = Paint.Join.BEVEL;
            }
            this.f55396m = join;
            this.f55397n = n3.q.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "strokeMiterLimit", 10, this.f55397n);
            this.f55387d = n3.q.getNamedComplexColor(typedArrayObtainAttributes, xmlPullParser, theme, "strokeColor", 3, 0);
            this.f55390g = n3.q.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "strokeAlpha", 11, this.f55390g);
            this.f55388e = n3.q.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "strokeWidth", 4, this.f55388e);
            this.f55393j = n3.q.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "trimPathEnd", 6, this.f55393j);
            this.f55394k = n3.q.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "trimPathOffset", 7, this.f55394k);
            this.f55392i = n3.q.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "trimPathStart", 5, this.f55392i);
            this.f55411c = n3.q.getNamedInt(typedArrayObtainAttributes, xmlPullParser, "fillType", 13, this.f55411c);
        }
        typedArrayObtainAttributes.recycle();
    }

    @Override // f6.r
    public boolean isStateful() {
        return this.f55389f.isStateful() || this.f55387d.isStateful();
    }

    @Override // f6.r
    public boolean onStateChanged(int[] iArr) {
        return this.f55387d.onStateChanged(iArr) | this.f55389f.onStateChanged(iArr);
    }

    public void setFillAlpha(float f10) {
        this.f55391h = f10;
    }

    public void setFillColor(int i10) {
        this.f55389f.setColor(i10);
    }

    public void setStrokeAlpha(float f10) {
        this.f55390g = f10;
    }

    public void setStrokeColor(int i10) {
        this.f55387d.setColor(i10);
    }

    public void setStrokeWidth(float f10) {
        this.f55388e = f10;
    }

    public void setTrimPathEnd(float f10) {
        this.f55393j = f10;
    }

    public void setTrimPathOffset(float f10) {
        this.f55394k = f10;
    }

    public void setTrimPathStart(float f10) {
        this.f55392i = f10;
    }

    @Override // f6.s
    public void applyTheme(Resources.Theme theme) {
    }
}
