package u7;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;
import r7.h0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class x {

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f88028b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f88029c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f88030d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f88031e;

    /* renamed from: l, reason: collision with root package name */
    public f f88038l;

    /* renamed from: m, reason: collision with root package name */
    public f f88039m;

    /* renamed from: n, reason: collision with root package name */
    public f f88040n;

    /* renamed from: o, reason: collision with root package name */
    public f f88041o;

    /* renamed from: p, reason: collision with root package name */
    public f f88042p;

    /* renamed from: q, reason: collision with root package name */
    public j f88043q;

    /* renamed from: r, reason: collision with root package name */
    public j f88044r;

    /* renamed from: s, reason: collision with root package name */
    public j f88045s;

    /* renamed from: t, reason: collision with root package name */
    public j f88046t;

    /* renamed from: u, reason: collision with root package name */
    public j f88047u;

    /* renamed from: v, reason: collision with root package name */
    public f f88048v;

    /* renamed from: w, reason: collision with root package name */
    public f f88049w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f88050x;

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f88027a = new Matrix();

    /* renamed from: f, reason: collision with root package name */
    public float f88032f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public float f88033g = Float.NaN;

    /* renamed from: h, reason: collision with root package name */
    public float f88034h = Float.NaN;

    /* renamed from: i, reason: collision with root package name */
    public float f88035i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f88036j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public boolean f88037k = true;

    public x(y7.n nVar) {
        this.f88038l = nVar.getAnchorPoint() == null ? null : nVar.getAnchorPoint().createAnimation();
        this.f88039m = nVar.getPosition() == null ? null : nVar.getPosition().createAnimation();
        this.f88040n = nVar.getScale() == null ? null : nVar.getScale().createAnimation();
        this.f88041o = nVar.getRotation() == null ? null : nVar.getRotation().createAnimation();
        this.f88043q = nVar.getSkew() == null ? null : nVar.getSkew().createAnimation();
        this.f88050x = nVar.isAutoOrient();
        this.f88045s = nVar.getRotationX() == null ? null : nVar.getRotationX().createAnimation();
        this.f88046t = nVar.getRotationY() == null ? null : nVar.getRotationY().createAnimation();
        this.f88047u = nVar.getRotationZ() == null ? null : nVar.getRotationZ().createAnimation();
        if (this.f88043q != null) {
            this.f88028b = new Matrix();
            this.f88029c = new Matrix();
            this.f88030d = new Matrix();
            this.f88031e = new float[9];
        } else {
            this.f88028b = null;
            this.f88029c = null;
            this.f88030d = null;
            this.f88031e = null;
        }
        this.f88044r = nVar.getSkewAngle() == null ? null : nVar.getSkewAngle().createAnimation();
        if (nVar.getOpacity() != null) {
            this.f88042p = nVar.getOpacity().createAnimation();
        }
        if (nVar.getStartOpacity() != null) {
            this.f88048v = nVar.getStartOpacity().createAnimation();
        } else {
            this.f88048v = null;
        }
        if (nVar.getEndOpacity() != null) {
            this.f88049w = nVar.getEndOpacity().createAnimation();
        } else {
            this.f88049w = null;
        }
    }

    public final void a() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f88031e[i10] = 0.0f;
        }
    }

    public void addAnimationsToLayer(a8.a aVar) {
        aVar.addAnimation(this.f88042p);
        aVar.addAnimation(this.f88048v);
        aVar.addAnimation(this.f88049w);
        aVar.addAnimation(this.f88038l);
        aVar.addAnimation(this.f88039m);
        aVar.addAnimation(this.f88040n);
        aVar.addAnimation(this.f88041o);
        aVar.addAnimation(this.f88043q);
        aVar.addAnimation(this.f88044r);
        aVar.addAnimation(this.f88045s);
        aVar.addAnimation(this.f88046t);
        aVar.addAnimation(this.f88047u);
    }

    public void addListener(a aVar) {
        f fVar = this.f88042p;
        if (fVar != null) {
            fVar.addUpdateListener(aVar);
        }
        f fVar2 = this.f88048v;
        if (fVar2 != null) {
            fVar2.addUpdateListener(aVar);
        }
        f fVar3 = this.f88049w;
        if (fVar3 != null) {
            fVar3.addUpdateListener(aVar);
        }
        f fVar4 = this.f88038l;
        if (fVar4 != null) {
            fVar4.addUpdateListener(aVar);
        }
        f fVar5 = this.f88039m;
        if (fVar5 != null) {
            fVar5.addUpdateListener(aVar);
        }
        f fVar6 = this.f88040n;
        if (fVar6 != null) {
            fVar6.addUpdateListener(aVar);
        }
        f fVar7 = this.f88041o;
        if (fVar7 != null) {
            fVar7.addUpdateListener(aVar);
        }
        j jVar = this.f88043q;
        if (jVar != null) {
            jVar.addUpdateListener(aVar);
        }
        j jVar2 = this.f88044r;
        if (jVar2 != null) {
            jVar2.addUpdateListener(aVar);
        }
        j jVar3 = this.f88045s;
        if (jVar3 != null) {
            jVar3.addUpdateListener(aVar);
            this.f88045s.addUpdateListener(new w(this, 0));
        }
        j jVar4 = this.f88046t;
        if (jVar4 != null) {
            jVar4.addUpdateListener(aVar);
            this.f88046t.addUpdateListener(new w(this, 1));
        }
        j jVar5 = this.f88047u;
        if (jVar5 != null) {
            jVar5.addUpdateListener(aVar);
            this.f88047u.addUpdateListener(new w(this, 2));
        }
    }

    public <T> boolean applyValueCallback(T t10, f8.c cVar) {
        Float fValueOf = Float.valueOf(100.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (t10 == h0.f83915a) {
            f fVar = this.f88038l;
            if (fVar == null) {
                this.f88038l = new y(cVar, new PointF());
                return true;
            }
            fVar.setValueCallback(cVar);
            return true;
        }
        if (t10 == h0.f83916b) {
            f fVar2 = this.f88039m;
            if (fVar2 == null) {
                this.f88039m = new y(cVar, new PointF());
                return true;
            }
            fVar2.setValueCallback(cVar);
            return true;
        }
        if (t10 == h0.f83917c) {
            f fVar3 = this.f88039m;
            if (fVar3 instanceof t) {
                ((t) fVar3).setXValueCallback(cVar);
                return true;
            }
        }
        if (t10 == h0.f83918d) {
            f fVar4 = this.f88039m;
            if (fVar4 instanceof t) {
                ((t) fVar4).setYValueCallback(cVar);
                return true;
            }
        }
        if (t10 == h0.f83924j) {
            f fVar5 = this.f88040n;
            if (fVar5 == null) {
                this.f88040n = new y(cVar, new f8.d());
                return true;
            }
            fVar5.setValueCallback(cVar);
            return true;
        }
        if (t10 == h0.f83925k) {
            f fVar6 = this.f88041o;
            if (fVar6 == null) {
                this.f88041o = new y(cVar, fValueOf2);
                return true;
            }
            fVar6.setValueCallback(cVar);
            return true;
        }
        if (t10 == 3) {
            f fVar7 = this.f88042p;
            if (fVar7 == null) {
                this.f88042p = new y(cVar, 100);
                return true;
            }
            fVar7.setValueCallback(cVar);
            return true;
        }
        if (t10 == h0.A) {
            f fVar8 = this.f88048v;
            if (fVar8 == null) {
                this.f88048v = new y(cVar, fValueOf);
                return true;
            }
            fVar8.setValueCallback(cVar);
            return true;
        }
        if (t10 == h0.B) {
            f fVar9 = this.f88049w;
            if (fVar9 == null) {
                this.f88049w = new y(cVar, fValueOf);
                return true;
            }
            fVar9.setValueCallback(cVar);
            return true;
        }
        if (t10 == h0.f83929o) {
            if (this.f88043q == null) {
                this.f88043q = new j(Collections.singletonList(new f8.a(fValueOf2)));
            }
            this.f88043q.setValueCallback(cVar);
            return true;
        }
        if (t10 == h0.f83930p) {
            if (this.f88044r == null) {
                this.f88044r = new j(Collections.singletonList(new f8.a(fValueOf2)));
            }
            this.f88044r.setValueCallback(cVar);
            return true;
        }
        if (t10 == h0.f83926l) {
            if (this.f88045s == null) {
                this.f88045s = new j(Collections.singletonList(new f8.a(fValueOf2)));
            }
            this.f88045s.setValueCallback(cVar);
            return true;
        }
        if (t10 == h0.f83927m) {
            if (this.f88046t == null) {
                this.f88046t = new j(Collections.singletonList(new f8.a(fValueOf2)));
            }
            this.f88046t.setValueCallback(cVar);
            return true;
        }
        if (t10 != h0.f83928n) {
            return false;
        }
        if (this.f88047u == null) {
            this.f88047u = new j(Collections.singletonList(new f8.a(fValueOf2)));
        }
        this.f88047u.setValueCallback(cVar);
        return true;
    }

    public f getEndOpacity() {
        return this.f88049w;
    }

    public Matrix getMatrix() {
        j jVar;
        j jVar2;
        PointF pointF;
        f8.d dVar;
        PointF pointF2;
        Matrix matrix = this.f88027a;
        matrix.reset();
        j jVar3 = this.f88045s;
        if ((jVar3 != null && jVar3.getFloatValue() != 0.0f) || (((jVar = this.f88046t) != null && jVar.getFloatValue() != 0.0f) || ((jVar2 = this.f88047u) != null && jVar2.getFloatValue() != 0.0f))) {
            j jVar4 = this.f88045s;
            float floatValue = jVar4 != null ? jVar4.getFloatValue() : 0.0f;
            j jVar5 = this.f88046t;
            float floatValue2 = jVar5 != null ? jVar5.getFloatValue() : 0.0f;
            j jVar6 = this.f88047u;
            float floatValue3 = jVar6 != null ? jVar6.getFloatValue() : 0.0f;
            if (this.f88037k || floatValue != this.f88032f || floatValue2 != this.f88033g || floatValue3 != this.f88034h) {
                this.f88032f = floatValue;
                this.f88033g = floatValue2;
                this.f88034h = floatValue3;
                if (floatValue != 0.0f) {
                    this.f88035i = (float) Math.cos(Math.toRadians(floatValue));
                } else {
                    this.f88035i = 1.0f;
                }
                if (floatValue2 != 0.0f) {
                    this.f88036j = (float) Math.cos(Math.toRadians(floatValue2));
                } else {
                    this.f88036j = 1.0f;
                }
                this.f88037k = false;
            }
            f fVar = this.f88038l;
            PointF pointF3 = fVar == null ? null : (PointF) fVar.getValue();
            f fVar2 = this.f88039m;
            PointF pointF4 = fVar2 == null ? null : (PointF) fVar2.getValue();
            f fVar3 = this.f88040n;
            f8.d dVar2 = fVar3 != null ? (f8.d) fVar3.getValue() : null;
            e8.l.applyTransform(matrix, pointF3, pointF4, dVar2 != null ? dVar2.getScaleX() : 1.0f, dVar2 != null ? dVar2.getScaleY() : 1.0f, floatValue, floatValue2, floatValue3, this.f88035i, this.f88036j);
            return matrix;
        }
        f fVar4 = this.f88039m;
        if (fVar4 != null && (pointF2 = (PointF) fVar4.getValue()) != null) {
            float f10 = pointF2.x;
            if (f10 != 0.0f || pointF2.y != 0.0f) {
                matrix.preTranslate(f10, pointF2.y);
            }
        }
        if (!this.f88050x) {
            f fVar5 = this.f88041o;
            if (fVar5 != null) {
                float fFloatValue = fVar5 instanceof y ? ((Float) fVar5.getValue()).floatValue() : ((j) fVar5).getFloatValue();
                if (fFloatValue != 0.0f) {
                    matrix.preRotate(fFloatValue);
                }
            }
        } else if (fVar4 != null) {
            float progress = fVar4.getProgress();
            PointF pointF5 = (PointF) fVar4.getValue();
            float f11 = pointF5.x;
            float f12 = pointF5.y;
            fVar4.setProgress(1.0E-4f + progress);
            PointF pointF6 = (PointF) fVar4.getValue();
            fVar4.setProgress(progress);
            matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF6.y - f12, pointF6.x - f11)));
        }
        if (this.f88043q != null) {
            float fCos = this.f88044r == null ? 0.0f : (float) Math.cos(Math.toRadians((-r5.getFloatValue()) + 90.0f));
            float fSin = this.f88044r == null ? 1.0f : (float) Math.sin(Math.toRadians((-r7.getFloatValue()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r1.getFloatValue()));
            a();
            float[] fArr = this.f88031e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f13 = -fSin;
            fArr[3] = f13;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.f88028b;
            matrix2.setValues(fArr);
            a();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.f88029c;
            matrix3.setValues(fArr);
            a();
            fArr[0] = fCos;
            fArr[1] = f13;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.f88030d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        f fVar6 = this.f88040n;
        if (fVar6 != null && (dVar = (f8.d) fVar6.getValue()) != null && (dVar.getScaleX() != 1.0f || dVar.getScaleY() != 1.0f)) {
            matrix.preScale(dVar.getScaleX(), dVar.getScaleY());
        }
        f fVar7 = this.f88038l;
        if (fVar7 != null && (pointF = (PointF) fVar7.getValue()) != null) {
            float f14 = pointF.x;
            if (f14 != 0.0f || pointF.y != 0.0f) {
                matrix.preTranslate(-f14, -pointF.y);
            }
        }
        return matrix;
    }

    public Matrix getMatrixForRepeater(float f10) {
        f fVar = this.f88039m;
        PointF pointF = fVar == null ? null : (PointF) fVar.getValue();
        f fVar2 = this.f88040n;
        f8.d dVar = fVar2 == null ? null : (f8.d) fVar2.getValue();
        f fVar3 = this.f88038l;
        PointF pointF2 = fVar3 != null ? (PointF) fVar3.getValue() : null;
        Matrix matrix = this.f88027a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f10, pointF.y * f10);
        }
        j jVar = this.f88045s;
        float floatValue = jVar != null ? jVar.getFloatValue() * f10 : 0.0f;
        j jVar2 = this.f88046t;
        float floatValue2 = jVar2 != null ? jVar2.getFloatValue() * f10 : 0.0f;
        j jVar3 = this.f88047u;
        float floatValue3 = jVar3 != null ? jVar3.getFloatValue() * f10 : 0.0f;
        if (floatValue == 0.0f && floatValue2 == 0.0f && floatValue3 == 0.0f) {
            f fVar4 = this.f88041o;
            if (fVar4 != null) {
                matrix.preRotate(((Float) fVar4.getValue()).floatValue() * f10, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
        } else {
            float fCos = floatValue != 0.0f ? (float) Math.cos(Math.toRadians(floatValue)) : 1.0f;
            float fCos2 = floatValue2 != 0.0f ? (float) Math.cos(Math.toRadians(floatValue2)) : 1.0f;
            if (floatValue3 != 0.0f) {
                matrix.preRotate(floatValue3, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
            e8.l.apply3DRotations(matrix, floatValue, floatValue2, 0.0f, fCos, fCos2);
        }
        if (dVar != null) {
            double d10 = f10;
            matrix.preScale((float) Math.pow(dVar.getScaleX(), d10), (float) Math.pow(dVar.getScaleY(), d10));
        }
        return matrix;
    }

    public f getOpacity() {
        return this.f88042p;
    }

    public f getStartOpacity() {
        return this.f88048v;
    }

    public void setProgress(float f10) {
        f fVar = this.f88042p;
        if (fVar != null) {
            fVar.setProgress(f10);
        }
        f fVar2 = this.f88048v;
        if (fVar2 != null) {
            fVar2.setProgress(f10);
        }
        f fVar3 = this.f88049w;
        if (fVar3 != null) {
            fVar3.setProgress(f10);
        }
        f fVar4 = this.f88038l;
        if (fVar4 != null) {
            fVar4.setProgress(f10);
        }
        f fVar5 = this.f88039m;
        if (fVar5 != null) {
            fVar5.setProgress(f10);
        }
        f fVar6 = this.f88040n;
        if (fVar6 != null) {
            fVar6.setProgress(f10);
        }
        f fVar7 = this.f88041o;
        if (fVar7 != null) {
            fVar7.setProgress(f10);
        }
        j jVar = this.f88043q;
        if (jVar != null) {
            jVar.setProgress(f10);
        }
        j jVar2 = this.f88044r;
        if (jVar2 != null) {
            jVar2.setProgress(f10);
        }
        j jVar3 = this.f88045s;
        if (jVar3 != null) {
            jVar3.setProgress(f10);
        }
        j jVar4 = this.f88046t;
        if (jVar4 != null) {
            jVar4.setProgress(f10);
        }
        j jVar5 = this.f88047u;
        if (jVar5 != null) {
            jVar5.setProgress(f10);
        }
    }
}
