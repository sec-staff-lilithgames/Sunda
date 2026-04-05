package com.bytedance.adsdk.jd.qk;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.adsdk.jd.qk;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo<T> {

    /* renamed from: au, reason: collision with root package name */
    private int f17431au;

    /* renamed from: cm, reason: collision with root package name */
    public final Interpolator f17432cm;
    private float hna;

    /* renamed from: if, reason: not valid java name */
    private float f13if;

    /* renamed from: jd, reason: collision with root package name */
    public T f17433jd;

    /* renamed from: jj, reason: collision with root package name */
    public final float f17434jj;
    public final T jpo;

    /* renamed from: ju, reason: collision with root package name */
    private float f17435ju;
    public final Interpolator my;
    private int oya;
    private float prr;

    /* renamed from: qk, reason: collision with root package name */
    public Float f17436qk;
    public final Interpolator wqx;
    public PointF xyk;

    /* renamed from: yd, reason: collision with root package name */
    private final qk f17437yd;
    public PointF zz;

    public jpo(qk qkVar, T t10, T t11, Interpolator interpolator, float f10, Float f11) {
        this.f17435ju = -3987645.8f;
        this.f13if = -3987645.8f;
        this.f17431au = 784923401;
        this.oya = 784923401;
        this.prr = Float.MIN_VALUE;
        this.hna = Float.MIN_VALUE;
        this.xyk = null;
        this.zz = null;
        this.f17437yd = qkVar;
        this.jpo = t10;
        this.f17433jd = t11;
        this.wqx = interpolator;
        this.f17432cm = null;
        this.my = null;
        this.f17434jj = f10;
        this.f17436qk = f11;
    }

    public float cm() {
        if (this.f17437yd == null) {
            return 1.0f;
        }
        if (this.hna == Float.MIN_VALUE) {
            if (this.f17436qk == null) {
                this.hna = 1.0f;
            } else {
                this.hna = ((this.f17436qk.floatValue() - this.f17434jj) / this.f17437yd.sq()) + wqx();
            }
        }
        return this.hna;
    }

    public float jj() {
        if (this.f17435ju == -3987645.8f) {
            this.f17435ju = ((Float) this.jpo).floatValue();
        }
        return this.f17435ju;
    }

    public jpo<T> jpo(T t10, T t11) {
        return new jpo<>(t10, t11);
    }

    public boolean my() {
        return this.wqx == null && this.f17432cm == null && this.my == null;
    }

    public float qk() {
        if (this.f13if == -3987645.8f) {
            this.f13if = ((Float) this.f17433jd).floatValue();
        }
        return this.f13if;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.jpo + ", endValue=" + this.f17433jd + ", startFrame=" + this.f17434jj + ", endFrame=" + this.f17436qk + ", interpolator=" + this.wqx + AbstractJsonLexerKt.END_OBJ;
    }

    public float wqx() {
        qk qkVar = this.f17437yd;
        if (qkVar == null) {
            return 0.0f;
        }
        if (this.prr == Float.MIN_VALUE) {
            this.prr = (this.f17434jj - qkVar.jj()) / this.f17437yd.sq();
        }
        return this.prr;
    }

    public int xyk() {
        if (this.f17431au == 784923401) {
            this.f17431au = ((Integer) this.jpo).intValue();
        }
        return this.f17431au;
    }

    public int zz() {
        if (this.oya == 784923401) {
            this.oya = ((Integer) this.f17433jd).intValue();
        }
        return this.oya;
    }

    public boolean jpo(float f10) {
        return f10 >= wqx() && f10 < cm();
    }

    public jpo(qk qkVar, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, float f10, Float f11) {
        this.f17435ju = -3987645.8f;
        this.f13if = -3987645.8f;
        this.f17431au = 784923401;
        this.oya = 784923401;
        this.prr = Float.MIN_VALUE;
        this.hna = Float.MIN_VALUE;
        this.xyk = null;
        this.zz = null;
        this.f17437yd = qkVar;
        this.jpo = t10;
        this.f17433jd = t11;
        this.wqx = null;
        this.f17432cm = interpolator;
        this.my = interpolator2;
        this.f17434jj = f10;
        this.f17436qk = f11;
    }

    public jpo(qk qkVar, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.f17435ju = -3987645.8f;
        this.f13if = -3987645.8f;
        this.f17431au = 784923401;
        this.oya = 784923401;
        this.prr = Float.MIN_VALUE;
        this.hna = Float.MIN_VALUE;
        this.xyk = null;
        this.zz = null;
        this.f17437yd = qkVar;
        this.jpo = t10;
        this.f17433jd = t11;
        this.wqx = interpolator;
        this.f17432cm = interpolator2;
        this.my = interpolator3;
        this.f17434jj = f10;
        this.f17436qk = f11;
    }

    public jpo(T t10) {
        this.f17435ju = -3987645.8f;
        this.f13if = -3987645.8f;
        this.f17431au = 784923401;
        this.oya = 784923401;
        this.prr = Float.MIN_VALUE;
        this.hna = Float.MIN_VALUE;
        this.xyk = null;
        this.zz = null;
        this.f17437yd = null;
        this.jpo = t10;
        this.f17433jd = t10;
        this.wqx = null;
        this.f17432cm = null;
        this.my = null;
        this.f17434jj = Float.MIN_VALUE;
        this.f17436qk = Float.valueOf(Float.MAX_VALUE);
    }

    private jpo(T t10, T t11) {
        this.f17435ju = -3987645.8f;
        this.f13if = -3987645.8f;
        this.f17431au = 784923401;
        this.oya = 784923401;
        this.prr = Float.MIN_VALUE;
        this.hna = Float.MIN_VALUE;
        this.xyk = null;
        this.zz = null;
        this.f17437yd = null;
        this.jpo = t10;
        this.f17433jd = t11;
        this.wqx = null;
        this.f17432cm = null;
        this.my = null;
        this.f17434jj = Float.MIN_VALUE;
        this.f17436qk = Float.valueOf(Float.MAX_VALUE);
    }
}
