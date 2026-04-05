package com.bytedance.adsdk.jd.wqx;

import android.graphics.PointF;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {

    /* renamed from: au, reason: collision with root package name */
    public PointF f17446au;

    /* renamed from: cm, reason: collision with root package name */
    public jpo f17447cm;

    /* renamed from: if, reason: not valid java name */
    public PointF f14if;

    /* renamed from: jd, reason: collision with root package name */
    public String f17448jd;

    /* renamed from: jj, reason: collision with root package name */
    public float f17449jj;
    public String jpo;

    /* renamed from: ju, reason: collision with root package name */
    public boolean f17450ju;
    public int my;

    /* renamed from: qk, reason: collision with root package name */
    public float f17451qk;
    public float wqx;
    public int xyk;

    /* renamed from: yd, reason: collision with root package name */
    public float f17452yd;
    public int zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum jpo {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public jd(String str, String str2, float f10, jpo jpoVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        jpo(str, str2, f10, jpoVar, i10, f11, f12, i11, i12, f13, z10, pointF, pointF2);
    }

    public int hashCode() {
        int iOrdinal = ((this.f17447cm.ordinal() + (((int) (o2.e(this.jpo.hashCode() * 31, 31, this.f17448jd) + this.wqx)) * 31)) * 31) + this.my;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f17449jj);
        return (((iOrdinal * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.xyk;
    }

    public void jpo(String str, String str2, float f10, jpo jpoVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        this.jpo = str;
        this.f17448jd = str2;
        this.wqx = f10;
        this.f17447cm = jpoVar;
        this.my = i10;
        this.f17449jj = f11;
        this.f17451qk = f12;
        this.xyk = i11;
        this.zz = i12;
        this.f17452yd = f13;
        this.f17450ju = z10;
        this.f14if = pointF;
        this.f17446au = pointF2;
    }

    public jd() {
    }
}
