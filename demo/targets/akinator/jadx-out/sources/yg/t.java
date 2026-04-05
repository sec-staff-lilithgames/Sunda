package yg;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public final v[] f94503a = new v[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f94504b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f94505c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    public final PointF f94506d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f94507e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f94508f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final v f94509g = new v();

    /* renamed from: h, reason: collision with root package name */
    public final float[] f94510h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f94511i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f94512j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f94513k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public boolean f94514l = true;

    public t() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f94503a[i10] = new v();
            this.f94504b[i10] = new Matrix();
            this.f94505c[i10] = new Matrix();
        }
    }

    public static t getInstance() {
        return r.f94502a;
    }

    public final boolean a(Path path, int i10) {
        Path path2 = this.f94513k;
        path2.reset();
        this.f94503a[i10].applyToPath(this.f94504b[i10], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    public void calculatePath(p pVar, float f10, RectF rectF, Path path) {
        calculatePath(pVar, f10, rectF, null, path);
    }

    public void calculatePath(p pVar, float f10, RectF rectF, s sVar, Path path) {
        calculatePath(pVar, null, f10, rectF, sVar, path);
    }

    public void calculatePath(p pVar, float[] fArr, float f10, RectF rectF, s sVar, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i10;
        v[] vVarArr;
        Matrix[] matrixArr2;
        float fAbs;
        g bottomEdge;
        d cVar;
        e bottomRightCorner;
        path.rewind();
        Path path2 = this.f94507e;
        path2.rewind();
        Path path3 = this.f94508f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i11 = 0;
        while (true) {
            matrixArr = this.f94505c;
            fArr2 = this.f94510h;
            vVarArr = this.f94503a;
            matrixArr2 = this.f94504b;
            if (i11 >= 4) {
                break;
            }
            if (fArr != null) {
                cVar = new c(fArr[i11]);
            } else if (i11 == 1) {
                cVar = pVar.getBottomRightCornerSize();
            } else if (i11 == 2) {
                cVar = pVar.getBottomLeftCornerSize();
            } else if (i11 != 3) {
                cVar = pVar.getTopRightCornerSize();
            } else {
                cVar = pVar.getTopLeftCornerSize();
            }
            d dVar = cVar;
            if (i11 == 1) {
                bottomRightCorner = pVar.getBottomRightCorner();
            } else if (i11 == 2) {
                bottomRightCorner = pVar.getBottomLeftCorner();
            } else if (i11 != 3) {
                bottomRightCorner = pVar.getTopRightCorner();
            } else {
                bottomRightCorner = pVar.getTopLeftCorner();
            }
            bottomRightCorner.getCornerPath(vVarArr[i11], 90.0f, f10, rectF, dVar);
            int i12 = i11 + 1;
            float f11 = (i12 % 4) * 90;
            matrixArr2[i11].reset();
            PointF pointF = this.f94506d;
            if (i11 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i11 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i11 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i11].setTranslate(pointF.x, pointF.y);
            matrixArr2[i11].preRotate(f11);
            v vVar = vVarArr[i11];
            fArr2[0] = vVar.f94519c;
            fArr2[1] = vVar.f94520d;
            matrixArr2[i11].mapPoints(fArr2);
            matrixArr[i11].reset();
            matrixArr[i11].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i11].preRotate(f11);
            i11 = i12;
        }
        int i13 = 1;
        int i14 = 0;
        for (i10 = 4; i14 < i10; i10 = 4) {
            v vVar2 = vVarArr[i14];
            fArr2[0] = vVar2.f94517a;
            fArr2[i13] = vVar2.f94518b;
            matrixArr2[i14].mapPoints(fArr2);
            if (i14 == 0) {
                path.moveTo(fArr2[0], fArr2[i13]);
            } else {
                path.lineTo(fArr2[0], fArr2[i13]);
            }
            vVarArr[i14].applyToPath(matrixArr2[i14], path);
            if (sVar != null) {
                ((i) sVar).onCornerPathCreated(vVarArr[i14], matrixArr2[i14], i14);
            }
            int i15 = i14 + 1;
            int i16 = i15 % 4;
            v vVar3 = vVarArr[i14];
            fArr2[0] = vVar3.f94519c;
            fArr2[i13] = vVar3.f94520d;
            matrixArr2[i14].mapPoints(fArr2);
            v vVar4 = vVarArr[i16];
            float f12 = vVar4.f94517a;
            float[] fArr3 = this.f94511i;
            fArr3[0] = f12;
            fArr3[i13] = vVar4.f94518b;
            matrixArr2[i16].mapPoints(fArr3);
            double d10 = fArr2[0] - fArr3[0];
            float f13 = fArr2[i13] - fArr3[i13];
            Matrix[] matrixArr3 = matrixArr;
            float fMax = Math.max(((float) Math.hypot(d10, f13)) - 0.001f, 0.0f);
            v vVar5 = vVarArr[i14];
            fArr2[0] = vVar5.f94519c;
            fArr2[i13] = vVar5.f94520d;
            matrixArr2[i14].mapPoints(fArr2);
            if (i14 != i13 && i14 != 3) {
                fAbs = Math.abs(rectF.centerY() - fArr2[i13]);
            } else {
                fAbs = Math.abs(rectF.centerX() - fArr2[0]);
            }
            v vVar6 = this.f94509g;
            vVar6.reset(0.0f, 0.0f);
            if (i14 == i13) {
                bottomEdge = pVar.getBottomEdge();
            } else if (i14 == 2) {
                bottomEdge = pVar.getLeftEdge();
            } else if (i14 != 3) {
                bottomEdge = pVar.getRightEdge();
            } else {
                bottomEdge = pVar.getTopEdge();
            }
            int i17 = i13;
            bottomEdge.getEdgePath(fMax, fAbs, f10, vVar6);
            Path path4 = this.f94512j;
            path4.reset();
            vVar6.applyToPath(matrixArr3[i14], path4);
            if (this.f94514l && (a(path4, i14) || a(path4, i16))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = vVar6.f94517a;
                fArr2[i17] = vVar6.f94518b;
                matrixArr3[i14].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[i17]);
                vVar6.applyToPath(matrixArr3[i14], path2);
            } else {
                vVar6.applyToPath(matrixArr3[i14], path);
            }
            if (sVar != null) {
                ((i) sVar).onEdgePathCreated(vVar6, matrixArr3[i14], i14);
            }
            matrixArr = matrixArr3;
            i14 = i15;
            i13 = i17;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }
}
