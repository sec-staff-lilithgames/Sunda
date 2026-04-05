package t7;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import j1.o2;
import java.util.List;
import r7.a0;
import r7.h0;
import z7.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class o implements n, u7.a, l {

    /* renamed from: e, reason: collision with root package name */
    public final String f86499e;

    /* renamed from: f, reason: collision with root package name */
    public final a0 f86500f;

    /* renamed from: g, reason: collision with root package name */
    public final z7.m f86501g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f86502h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f86503i;

    /* renamed from: j, reason: collision with root package name */
    public final u7.j f86504j;

    /* renamed from: k, reason: collision with root package name */
    public final u7.f f86505k;

    /* renamed from: l, reason: collision with root package name */
    public final u7.j f86506l;

    /* renamed from: m, reason: collision with root package name */
    public final u7.j f86507m;

    /* renamed from: n, reason: collision with root package name */
    public final u7.j f86508n;

    /* renamed from: o, reason: collision with root package name */
    public final u7.j f86509o;

    /* renamed from: p, reason: collision with root package name */
    public final u7.j f86510p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f86512r;

    /* renamed from: a, reason: collision with root package name */
    public final Path f86495a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f86496b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final PathMeasure f86497c = new PathMeasure();

    /* renamed from: d, reason: collision with root package name */
    public final float[] f86498d = new float[2];

    /* renamed from: q, reason: collision with root package name */
    public final c f86511q = new c();

    public o(a0 a0Var, a8.a aVar, z7.n nVar) {
        this.f86500f = a0Var;
        this.f86499e = nVar.getName();
        z7.m type = nVar.getType();
        this.f86501g = type;
        this.f86502h = nVar.isHidden();
        this.f86503i = nVar.isReversed();
        u7.j jVarCreateAnimation = nVar.getPoints().createAnimation();
        this.f86504j = jVarCreateAnimation;
        u7.f fVarCreateAnimation = nVar.getPosition().createAnimation();
        this.f86505k = fVarCreateAnimation;
        u7.j jVarCreateAnimation2 = nVar.getRotation().createAnimation();
        this.f86506l = jVarCreateAnimation2;
        u7.j jVarCreateAnimation3 = nVar.getOuterRadius().createAnimation();
        this.f86508n = jVarCreateAnimation3;
        u7.j jVarCreateAnimation4 = nVar.getOuterRoundedness().createAnimation();
        this.f86510p = jVarCreateAnimation4;
        z7.m mVar = z7.m.STAR;
        if (type == mVar) {
            this.f86507m = nVar.getInnerRadius().createAnimation();
            this.f86509o = nVar.getInnerRoundedness().createAnimation();
        } else {
            this.f86507m = null;
            this.f86509o = null;
        }
        aVar.addAnimation(jVarCreateAnimation);
        aVar.addAnimation(fVarCreateAnimation);
        aVar.addAnimation(jVarCreateAnimation2);
        aVar.addAnimation(jVarCreateAnimation3);
        aVar.addAnimation(jVarCreateAnimation4);
        if (type == mVar) {
            aVar.addAnimation(this.f86507m);
            aVar.addAnimation(this.f86509o);
        }
        jVarCreateAnimation.addUpdateListener(this);
        fVarCreateAnimation.addUpdateListener(this);
        jVarCreateAnimation2.addUpdateListener(this);
        jVarCreateAnimation3.addUpdateListener(this);
        jVarCreateAnimation4.addUpdateListener(this);
        if (type == mVar) {
            this.f86507m.addUpdateListener(this);
            this.f86509o.addUpdateListener(this);
        }
    }

    @Override // t7.l, x7.g
    public <T> void addValueCallback(T t10, f8.c cVar) {
        u7.j jVar;
        u7.j jVar2;
        if (t10 == h0.f83935u) {
            this.f86504j.setValueCallback(cVar);
            return;
        }
        if (t10 == h0.f83936v) {
            this.f86506l.setValueCallback(cVar);
            return;
        }
        if (t10 == h0.f83923i) {
            this.f86505k.setValueCallback(cVar);
            return;
        }
        if (t10 == h0.f83937w && (jVar2 = this.f86507m) != null) {
            jVar2.setValueCallback(cVar);
            return;
        }
        if (t10 == h0.f83938x) {
            this.f86508n.setValueCallback(cVar);
            return;
        }
        if (t10 == h0.f83939y && (jVar = this.f86509o) != null) {
            jVar.setValueCallback(cVar);
        } else if (t10 == h0.f83940z) {
            this.f86510p.setValueCallback(cVar);
        }
    }

    @Override // t7.n, t7.d
    public String getName() {
        return this.f86499e;
    }

    @Override // t7.n
    public Path getPath() {
        boolean z10;
        float f10;
        double d10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i10;
        double d11;
        boolean z11 = this.f86512r;
        Path path = this.f86495a;
        if (z11) {
            return path;
        }
        path.reset();
        if (this.f86502h) {
            this.f86512r = true;
            return path;
        }
        int iOrdinal = this.f86501g.ordinal();
        u7.f fVar = this.f86505k;
        u7.j jVar = this.f86508n;
        u7.j jVar2 = this.f86510p;
        u7.j jVar3 = this.f86506l;
        u7.j jVar4 = this.f86504j;
        if (iOrdinal == 0) {
            z10 = true;
            float fFloatValue = ((Float) jVar4.getValue()).floatValue();
            double radians = Math.toRadians((jVar3 != null ? ((Float) jVar3.getValue()).floatValue() : 0.0d) - 90.0d);
            double d12 = fFloatValue;
            float f16 = (float) (6.283185307179586d / d12);
            if (this.f86503i) {
                f16 *= -1.0f;
            }
            float f17 = f16;
            float f18 = f17 / 2.0f;
            float f19 = fFloatValue - ((int) fFloatValue);
            if (f19 != 0.0f) {
                f10 = 2.0f;
                radians += (1.0f - f19) * f18;
            } else {
                f10 = 2.0f;
            }
            float fFloatValue2 = ((Float) jVar.getValue()).floatValue();
            float fFloatValue3 = ((Float) this.f86507m.getValue()).floatValue();
            u7.j jVar5 = this.f86509o;
            float fFloatValue4 = jVar5 != null ? ((Float) jVar5.getValue()).floatValue() / 100.0f : 0.0f;
            float fFloatValue5 = jVar2 != null ? ((Float) jVar2.getValue()).floatValue() / 100.0f : 0.0f;
            if (f19 != 0.0f) {
                float fA = o2.a(fFloatValue2, fFloatValue3, f19, fFloatValue3);
                double d13 = fA;
                f13 = fA;
                float fCos = (float) (Math.cos(radians) * d13);
                float fSin = (float) (Math.sin(radians) * d13);
                path.moveTo(fCos, fSin);
                d10 = radians + ((f17 * f19) / f10);
                f11 = fCos;
                f12 = fSin;
            } else {
                double d14 = fFloatValue2;
                float fCos2 = (float) (Math.cos(radians) * d14);
                float fSin2 = (float) (Math.sin(radians) * d14);
                path.moveTo(fCos2, fSin2);
                d10 = radians + f18;
                f11 = fCos2;
                f12 = fSin2;
                f13 = 0.0f;
            }
            double dCeil = Math.ceil(d12) * 2.0d;
            double d15 = d10;
            int i11 = 0;
            boolean z12 = false;
            while (true) {
                double d16 = i11;
                if (d16 >= dCeil) {
                    break;
                }
                float f20 = z12 ? fFloatValue2 : fFloatValue3;
                float f21 = (f13 == 0.0f || d16 != dCeil - 2.0d) ? f18 : (f17 * f19) / f10;
                if (f13 != 0.0f && d16 == dCeil - 1.0d) {
                    f20 = f13;
                }
                double d17 = f20;
                float fCos3 = (float) (Math.cos(d15) * d17);
                float fSin3 = (float) (Math.sin(d15) * d17);
                if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                    path.lineTo(fCos3, fSin3);
                    f14 = f19;
                    f15 = fCos3;
                } else {
                    f14 = f19;
                    Path path2 = path;
                    double dAtan2 = (float) (Math.atan2(f12, f11) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin4 = (float) Math.sin(dAtan2);
                    float f22 = f11;
                    float f23 = f12;
                    double dAtan22 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) Math.cos(dAtan22);
                    float fSin5 = (float) Math.sin(dAtan22);
                    float f24 = z12 ? fFloatValue4 : fFloatValue5;
                    float f25 = z12 ? fFloatValue5 : fFloatValue4;
                    float f26 = (z12 ? fFloatValue3 : fFloatValue2) * f24 * 0.47829f;
                    float f27 = fCos4 * f26;
                    float f28 = f26 * fSin4;
                    float f29 = (z12 ? fFloatValue2 : fFloatValue3) * f25 * 0.47829f;
                    float f30 = fCos5 * f29;
                    float f31 = f29 * fSin5;
                    if (f19 != 0.0f) {
                        if (i11 == 0) {
                            f27 *= f14;
                            f28 *= f14;
                        } else if (d16 == dCeil - 1.0d) {
                            f30 *= f14;
                            f31 *= f14;
                        }
                    }
                    f15 = fCos3;
                    path = path2;
                    path.cubicTo(f22 - f27, f23 - f28, f30 + fCos3, fSin3 + f31, f15, fSin3);
                }
                d15 += f21;
                z12 = !z12;
                i11++;
                f11 = f15;
                f12 = fSin3;
                f19 = f14;
                f10 = 2.0f;
            }
            PointF pointF = (PointF) fVar.getValue();
            path.offset(pointF.x, pointF.y);
            path.close();
        } else if (iOrdinal != 1) {
            z10 = true;
        } else {
            int iFloor = (int) Math.floor(((Float) jVar4.getValue()).floatValue());
            double radians2 = Math.toRadians((jVar3 != null ? ((Float) jVar3.getValue()).floatValue() : 0.0d) - 90.0d);
            double d18 = iFloor;
            float fFloatValue6 = ((Float) jVar2.getValue()).floatValue() / 100.0f;
            float fFloatValue7 = ((Float) jVar.getValue()).floatValue();
            double d19 = fFloatValue7;
            z10 = true;
            float fCos6 = (float) (Math.cos(radians2) * d19);
            float fSin6 = (float) (Math.sin(radians2) * d19);
            path.moveTo(fCos6, fSin6);
            double d20 = (float) (6.283185307179586d / d18);
            double dCeil2 = Math.ceil(d18);
            double d21 = radians2 + d20;
            int i12 = 0;
            while (true) {
                double d22 = i12;
                if (d22 >= dCeil2) {
                    break;
                }
                double d23 = dCeil2;
                float fCos7 = (float) (Math.cos(d21) * d19);
                float fSin7 = (float) (Math.sin(d21) * d19);
                if (fFloatValue6 != 0.0f) {
                    i10 = i12;
                    Path path3 = path;
                    d11 = d19;
                    double dAtan23 = (float) (Math.atan2(fSin6, fCos6) - 1.5707963267948966d);
                    float fCos8 = (float) Math.cos(dAtan23);
                    float fSin8 = (float) Math.sin(dAtan23);
                    double dAtan24 = (float) (Math.atan2(fSin7, fCos7) - 1.5707963267948966d);
                    float f32 = fFloatValue7 * fFloatValue6 * 0.25f;
                    float f33 = f32 * fCos8;
                    float f34 = f32 * fSin8;
                    float fCos9 = ((float) Math.cos(dAtan24)) * f32;
                    float fSin9 = f32 * ((float) Math.sin(dAtan24));
                    if (d22 == d23 - 1.0d) {
                        Path path4 = this.f86496b;
                        path4.reset();
                        path4.moveTo(fCos6, fSin6);
                        float f35 = fCos6 - f33;
                        float f36 = fSin6 - f34;
                        float f37 = fCos7 + fCos9;
                        float f38 = fSin7 + fSin9;
                        path4.cubicTo(f35, f36, f37, f38, fCos7, fSin7);
                        PathMeasure pathMeasure = this.f86497c;
                        pathMeasure.setPath(path4, false);
                        float length = pathMeasure.getLength() * 0.9999f;
                        float[] fArr = this.f86498d;
                        pathMeasure.getPosTan(length, fArr, null);
                        path = path3;
                        path.cubicTo(f35, f36, f37, f38, fArr[0], fArr[1]);
                        fCos6 = fCos7;
                        fSin6 = fSin7;
                    } else {
                        float f39 = fSin7 + fSin9;
                        path = path3;
                        fSin6 = fSin7;
                        path.cubicTo(fCos6 - f33, fSin6 - f34, fCos7 + fCos9, f39, fCos7, fSin6);
                        fCos6 = fCos7;
                    }
                } else {
                    i10 = i12;
                    d11 = d19;
                    fCos6 = fCos7;
                    fSin6 = fSin7;
                    if (d22 == d23 - 1.0d) {
                        i12 = i10 + 1;
                        dCeil2 = d23;
                        d19 = d11;
                    } else {
                        path.lineTo(fCos6, fSin6);
                    }
                }
                d21 += d20;
                i12 = i10 + 1;
                dCeil2 = d23;
                d19 = d11;
            }
            PointF pointF2 = (PointF) fVar.getValue();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.f86511q.apply(path);
        this.f86512r = z10;
        return path;
    }

    @Override // u7.a
    public void onValueChanged() {
        this.f86512r = false;
        this.f86500f.invalidateSelf();
    }

    @Override // t7.l, x7.g
    public void resolveKeyPath(x7.f fVar, int i10, List<x7.f> list, x7.f fVar2) {
        e8.j.resolveKeyPath(fVar, i10, list, fVar2, this);
    }

    @Override // t7.n, t7.d
    public void setContents(List<d> list, List<d> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            d dVar = list.get(i10);
            if (dVar instanceof v) {
                v vVar = (v) dVar;
                if (vVar.f86553d == y.f97681b) {
                    this.f86511q.f86426a.add(vVar);
                    vVar.a(this);
                }
            }
        }
    }
}
