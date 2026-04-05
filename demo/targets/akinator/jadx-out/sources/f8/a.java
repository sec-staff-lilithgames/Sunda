package f8;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import r7.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final h f55488a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f55489b;

    /* renamed from: c, reason: collision with root package name */
    public Object f55490c;

    /* renamed from: d, reason: collision with root package name */
    public final Interpolator f55491d;

    /* renamed from: e, reason: collision with root package name */
    public final Interpolator f55492e;

    /* renamed from: f, reason: collision with root package name */
    public final Interpolator f55493f;

    /* renamed from: g, reason: collision with root package name */
    public final float f55494g;

    /* renamed from: h, reason: collision with root package name */
    public Float f55495h;

    /* renamed from: i, reason: collision with root package name */
    public float f55496i;

    /* renamed from: j, reason: collision with root package name */
    public float f55497j;

    /* renamed from: k, reason: collision with root package name */
    public int f55498k;

    /* renamed from: l, reason: collision with root package name */
    public int f55499l;

    /* renamed from: m, reason: collision with root package name */
    public float f55500m;

    /* renamed from: n, reason: collision with root package name */
    public float f55501n;

    /* renamed from: o, reason: collision with root package name */
    public PointF f55502o;

    /* renamed from: p, reason: collision with root package name */
    public PointF f55503p;

    public a(h hVar, Object obj, Object obj2, Interpolator interpolator, float f10, Float f11) {
        this.f55496i = -3987645.8f;
        this.f55497j = -3987645.8f;
        this.f55498k = 784923401;
        this.f55499l = 784923401;
        this.f55500m = Float.MIN_VALUE;
        this.f55501n = Float.MIN_VALUE;
        this.f55502o = null;
        this.f55503p = null;
        this.f55488a = hVar;
        this.f55489b = obj;
        this.f55490c = obj2;
        this.f55491d = interpolator;
        this.f55492e = null;
        this.f55493f = null;
        this.f55494g = f10;
        this.f55495h = f11;
    }

    public boolean containsProgress(float f10) {
        return f10 >= getStartProgress() && f10 < getEndProgress();
    }

    public a copyWith(Object obj, Object obj2) {
        return new a(obj, obj2);
    }

    public float getEndProgress() {
        if (this.f55488a == null) {
            return 1.0f;
        }
        if (this.f55501n == Float.MIN_VALUE) {
            if (this.f55495h == null) {
                this.f55501n = 1.0f;
            } else {
                this.f55501n = (float) (getStartProgress() + ((this.f55495h.floatValue() - this.f55494g) / r1.getDurationFrames()));
            }
        }
        return this.f55501n;
    }

    public float getEndValueFloat() {
        if (this.f55497j == -3987645.8f) {
            this.f55497j = ((Float) this.f55490c).floatValue();
        }
        return this.f55497j;
    }

    public int getEndValueInt() {
        if (this.f55499l == 784923401) {
            this.f55499l = ((Integer) this.f55490c).intValue();
        }
        return this.f55499l;
    }

    public float getStartProgress() {
        h hVar = this.f55488a;
        if (hVar == null) {
            return 0.0f;
        }
        if (this.f55500m == Float.MIN_VALUE) {
            this.f55500m = (this.f55494g - hVar.getStartFrame()) / hVar.getDurationFrames();
        }
        return this.f55500m;
    }

    public float getStartValueFloat() {
        if (this.f55496i == -3987645.8f) {
            this.f55496i = ((Float) this.f55489b).floatValue();
        }
        return this.f55496i;
    }

    public int getStartValueInt() {
        if (this.f55498k == 784923401) {
            this.f55498k = ((Integer) this.f55489b).intValue();
        }
        return this.f55498k;
    }

    public boolean isStatic() {
        return this.f55491d == null && this.f55492e == null && this.f55493f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f55489b + ", endValue=" + this.f55490c + ", startFrame=" + this.f55494g + ", endFrame=" + this.f55495h + ", interpolator=" + this.f55491d + AbstractJsonLexerKt.END_OBJ;
    }

    public a(h hVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f10, Float f11) {
        this.f55496i = -3987645.8f;
        this.f55497j = -3987645.8f;
        this.f55498k = 784923401;
        this.f55499l = 784923401;
        this.f55500m = Float.MIN_VALUE;
        this.f55501n = Float.MIN_VALUE;
        this.f55502o = null;
        this.f55503p = null;
        this.f55488a = hVar;
        this.f55489b = obj;
        this.f55490c = obj2;
        this.f55491d = null;
        this.f55492e = interpolator;
        this.f55493f = interpolator2;
        this.f55494g = f10;
        this.f55495h = f11;
    }

    public a(h hVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.f55496i = -3987645.8f;
        this.f55497j = -3987645.8f;
        this.f55498k = 784923401;
        this.f55499l = 784923401;
        this.f55500m = Float.MIN_VALUE;
        this.f55501n = Float.MIN_VALUE;
        this.f55502o = null;
        this.f55503p = null;
        this.f55488a = hVar;
        this.f55489b = obj;
        this.f55490c = obj2;
        this.f55491d = interpolator;
        this.f55492e = interpolator2;
        this.f55493f = interpolator3;
        this.f55494g = f10;
        this.f55495h = f11;
    }

    public a(Object obj) {
        this.f55496i = -3987645.8f;
        this.f55497j = -3987645.8f;
        this.f55498k = 784923401;
        this.f55499l = 784923401;
        this.f55500m = Float.MIN_VALUE;
        this.f55501n = Float.MIN_VALUE;
        this.f55502o = null;
        this.f55503p = null;
        this.f55488a = null;
        this.f55489b = obj;
        this.f55490c = obj;
        this.f55491d = null;
        this.f55492e = null;
        this.f55493f = null;
        this.f55494g = Float.MIN_VALUE;
        this.f55495h = Float.valueOf(Float.MAX_VALUE);
    }

    public a(Object obj, Object obj2) {
        this.f55496i = -3987645.8f;
        this.f55497j = -3987645.8f;
        this.f55498k = 784923401;
        this.f55499l = 784923401;
        this.f55500m = Float.MIN_VALUE;
        this.f55501n = Float.MIN_VALUE;
        this.f55502o = null;
        this.f55503p = null;
        this.f55488a = null;
        this.f55489b = obj;
        this.f55490c = obj2;
        this.f55491d = null;
        this.f55492e = null;
        this.f55493f = null;
        this.f55494g = Float.MIN_VALUE;
        this.f55495h = Float.valueOf(Float.MAX_VALUE);
    }
}
