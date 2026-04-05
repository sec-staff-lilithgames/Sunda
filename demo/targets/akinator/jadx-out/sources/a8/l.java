package a8;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import e8.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import r7.a0;
import r7.h0;
import u7.v;
import u7.y;
import y7.m;
import z.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l extends a {
    public final StringBuilder E;
    public final StringBuilder F;
    public final StringBuilder G;
    public final StringBuilder H;
    public final RectF I;
    public final Matrix J;
    public final j K;
    public final j L;
    public final HashMap M;
    public final x N;
    public final ArrayList O;
    public final ArrayList P;
    public final v Q;
    public final a0 R;
    public final r7.h S;
    public final z7.a0 T;
    public final u7.f U;
    public y V;
    public final u7.f W;
    public y X;
    public final u7.j Y;
    public y Z;

    /* renamed from: a0, reason: collision with root package name */
    public final u7.j f4217a0;

    /* renamed from: b0, reason: collision with root package name */
    public y f4218b0;

    /* renamed from: c0, reason: collision with root package name */
    public final u7.f f4219c0;

    /* renamed from: d0, reason: collision with root package name */
    public y f4220d0;

    /* renamed from: e0, reason: collision with root package name */
    public y f4221e0;

    /* renamed from: f0, reason: collision with root package name */
    public final u7.f f4222f0;

    /* renamed from: g0, reason: collision with root package name */
    public final u7.f f4223g0;

    /* renamed from: h0, reason: collision with root package name */
    public final u7.f f4224h0;

    public l(a0 a0Var, f fVar) {
        y7.l lVar;
        y7.l lVar2;
        y7.d dVar;
        y7.l lVar3;
        y7.d dVar2;
        y7.l lVar4;
        y7.d dVar3;
        m mVar;
        y7.d dVar4;
        m mVar2;
        y7.b bVar;
        m mVar3;
        y7.b bVar2;
        m mVar4;
        y7.a aVar;
        m mVar5;
        y7.a aVar2;
        super(a0Var, fVar);
        this.E = new StringBuilder(2);
        this.F = new StringBuilder(0);
        this.G = new StringBuilder(0);
        this.H = new StringBuilder(0);
        this.I = new RectF();
        this.J = new Matrix();
        j jVar = new j(1);
        jVar.setStyle(Paint.Style.FILL);
        this.K = jVar;
        j jVar2 = new j(1);
        jVar2.setStyle(Paint.Style.STROKE);
        this.L = jVar2;
        this.M = new HashMap();
        this.N = new x();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.T = z7.a0.f97571c;
        this.R = a0Var;
        this.S = fVar.f4191b;
        v vVarCreateAnimation = fVar.f4206q.createAnimation();
        this.Q = vVarCreateAnimation;
        vVarCreateAnimation.addUpdateListener(this);
        addAnimation(vVarCreateAnimation);
        y7.k kVar = fVar.f4207r;
        if (kVar != null && (mVar5 = kVar.f94118a) != null && (aVar2 = mVar5.f94124a) != null) {
            u7.f fVarCreateAnimation = aVar2.createAnimation();
            this.U = fVarCreateAnimation;
            fVarCreateAnimation.addUpdateListener(this);
            addAnimation(fVarCreateAnimation);
        }
        if (kVar != null && (mVar4 = kVar.f94118a) != null && (aVar = mVar4.f94125b) != null) {
            u7.f fVarCreateAnimation2 = aVar.createAnimation();
            this.W = fVarCreateAnimation2;
            fVarCreateAnimation2.addUpdateListener(this);
            addAnimation(fVarCreateAnimation2);
        }
        if (kVar != null && (mVar3 = kVar.f94118a) != null && (bVar2 = mVar3.f94126c) != null) {
            u7.j jVarCreateAnimation = bVar2.createAnimation();
            this.Y = jVarCreateAnimation;
            jVarCreateAnimation.addUpdateListener(this);
            addAnimation(jVarCreateAnimation);
        }
        if (kVar != null && (mVar2 = kVar.f94118a) != null && (bVar = mVar2.f94127d) != null) {
            u7.j jVarCreateAnimation2 = bVar.createAnimation();
            this.f4217a0 = jVarCreateAnimation2;
            jVarCreateAnimation2.addUpdateListener(this);
            addAnimation(jVarCreateAnimation2);
        }
        if (kVar != null && (mVar = kVar.f94118a) != null && (dVar4 = mVar.f94128e) != null) {
            u7.f fVarCreateAnimation3 = dVar4.createAnimation();
            this.f4219c0 = fVarCreateAnimation3;
            fVarCreateAnimation3.addUpdateListener(this);
            addAnimation(fVarCreateAnimation3);
        }
        if (kVar != null && (lVar4 = kVar.f94119b) != null && (dVar3 = lVar4.f94120a) != null) {
            u7.f fVarCreateAnimation4 = dVar3.createAnimation();
            this.f4222f0 = fVarCreateAnimation4;
            fVarCreateAnimation4.addUpdateListener(this);
            addAnimation(fVarCreateAnimation4);
        }
        if (kVar != null && (lVar3 = kVar.f94119b) != null && (dVar2 = lVar3.f94121b) != null) {
            u7.f fVarCreateAnimation5 = dVar2.createAnimation();
            this.f4223g0 = fVarCreateAnimation5;
            fVarCreateAnimation5.addUpdateListener(this);
            addAnimation(fVarCreateAnimation5);
        }
        if (kVar != null && (lVar2 = kVar.f94119b) != null && (dVar = lVar2.f94122c) != null) {
            u7.f fVarCreateAnimation6 = dVar.createAnimation();
            this.f4224h0 = fVarCreateAnimation6;
            fVarCreateAnimation6.addUpdateListener(this);
            addAnimation(fVarCreateAnimation6);
        }
        if (kVar == null || (lVar = kVar.f94119b) == null) {
            return;
        }
        this.T = lVar.f94123d;
    }

    public static void g(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public static void h(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // a8.a, x7.g
    public <T> void addValueCallback(T t10, f8.c cVar) {
        super.addValueCallback(t10, cVar);
        PointF pointF = h0.f83915a;
        if (t10 == 1) {
            y yVar = this.V;
            if (yVar != null) {
                removeAnimation(yVar);
            }
            if (cVar == null) {
                this.V = null;
                return;
            }
            y yVar2 = new y(cVar);
            this.V = yVar2;
            yVar2.addUpdateListener(this);
            addAnimation(this.V);
            return;
        }
        if (t10 == 2) {
            y yVar3 = this.X;
            if (yVar3 != null) {
                removeAnimation(yVar3);
            }
            if (cVar == null) {
                this.X = null;
                return;
            }
            y yVar4 = new y(cVar);
            this.X = yVar4;
            yVar4.addUpdateListener(this);
            addAnimation(this.X);
            return;
        }
        if (t10 == h0.f83931q) {
            y yVar5 = this.Z;
            if (yVar5 != null) {
                removeAnimation(yVar5);
            }
            if (cVar == null) {
                this.Z = null;
                return;
            }
            y yVar6 = new y(cVar);
            this.Z = yVar6;
            yVar6.addUpdateListener(this);
            addAnimation(this.Z);
            return;
        }
        if (t10 == h0.f83932r) {
            y yVar7 = this.f4218b0;
            if (yVar7 != null) {
                removeAnimation(yVar7);
            }
            if (cVar == null) {
                this.f4218b0 = null;
                return;
            }
            y yVar8 = new y(cVar);
            this.f4218b0 = yVar8;
            yVar8.addUpdateListener(this);
            addAnimation(this.f4218b0);
            return;
        }
        if (t10 == h0.D) {
            y yVar9 = this.f4220d0;
            if (yVar9 != null) {
                removeAnimation(yVar9);
            }
            if (cVar == null) {
                this.f4220d0 = null;
                return;
            }
            y yVar10 = new y(cVar);
            this.f4220d0 = yVar10;
            yVar10.addUpdateListener(this);
            addAnimation(this.f4220d0);
            return;
        }
        if (t10 != h0.K) {
            if (t10 == h0.M) {
                this.Q.setStringValueCallback(cVar);
                return;
            }
            return;
        }
        y yVar11 = this.f4221e0;
        if (yVar11 != null) {
            removeAnimation(yVar11);
        }
        if (cVar == null) {
            this.f4221e0 = null;
            return;
        }
        y yVar12 = new y(cVar);
        this.f4221e0 = yVar12;
        yVar12.addUpdateListener(this);
        addAnimation(this.f4221e0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x03af, code lost:
    
        r3.insert(0, r6);
        r5 = r5 + 1;
        r1 = r21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0282  */
    @Override // a8.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawLayer(android.graphics.Canvas r26, android.graphics.Matrix r27, int r28, e8.b r29) {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.l.drawLayer(android.graphics.Canvas, android.graphics.Matrix, int, e8.b):void");
    }

    public final String e(int i10, String str) {
        int iCodePointAt = str.codePointAt(i10);
        int iCharCount = Character.charCount(iCodePointAt) + i10;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (Character.getType(iCodePointAt2) != 16 && Character.getType(iCodePointAt2) != 27 && Character.getType(iCodePointAt2) != 6 && Character.getType(iCodePointAt2) != 28 && Character.getType(iCodePointAt2) != 8 && Character.getType(iCodePointAt2) != 19) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j10 = iCodePointAt;
        x xVar = this.N;
        if (xVar.containsKey(j10)) {
            return (String) xVar.get(j10);
        }
        StringBuilder sb2 = this.E;
        sb2.setLength(0);
        while (i10 < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i10);
            sb2.appendCodePoint(iCodePointAt3);
            i10 += Character.charCount(iCodePointAt3);
        }
        String string = sb2.toString();
        xVar.put(j10, string);
        return string;
    }

    public final void f(x7.c cVar, int i10, int i11) {
        y yVar = this.V;
        j jVar = this.K;
        if (yVar != null) {
            jVar.setColor(((Integer) yVar.getValue()).intValue());
        } else {
            u7.f fVar = this.U;
            if (fVar == null || !j(i11)) {
                jVar.setColor(cVar.f91766h);
            } else {
                jVar.setColor(((Integer) fVar.getValue()).intValue());
            }
        }
        y yVar2 = this.X;
        j jVar2 = this.L;
        if (yVar2 != null) {
            jVar2.setColor(((Integer) yVar2.getValue()).intValue());
        } else {
            u7.f fVar2 = this.W;
            if (fVar2 == null || !j(i11)) {
                jVar2.setColor(cVar.f91767i);
            } else {
                jVar2.setColor(((Integer) fVar2.getValue()).intValue());
            }
        }
        u7.x xVar = this.f4180x;
        int iIntValue = 100;
        int iIntValue2 = xVar.getOpacity() == null ? 100 : ((Integer) xVar.getOpacity().getValue()).intValue();
        u7.f fVar3 = this.f4219c0;
        if (fVar3 != null && j(i11)) {
            iIntValue = ((Integer) fVar3.getValue()).intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i10) / 255.0f);
        jVar.setAlpha(iRound);
        jVar2.setAlpha(iRound);
        y yVar3 = this.Z;
        if (yVar3 != null) {
            jVar2.setStrokeWidth(((Float) yVar3.getValue()).floatValue());
            return;
        }
        u7.j jVar3 = this.Y;
        if (jVar3 == null || !j(i11)) {
            jVar2.setStrokeWidth(n.dpScale() * cVar.f91768j);
        } else {
            jVar2.setStrokeWidth(((Float) jVar3.getValue()).floatValue());
        }
    }

    @Override // a8.a, t7.f
    public void getBounds(RectF rectF, Matrix matrix, boolean z10) {
        super.getBounds(rectF, matrix, z10);
        r7.h hVar = this.S;
        rectF.set(0.0f, 0.0f, hVar.getBounds().width(), hVar.getBounds().height());
    }

    public final k i(int i10) {
        ArrayList arrayList = this.P;
        for (int size = arrayList.size(); size < i10; size++) {
            k kVar = new k();
            kVar.f4215a = "";
            kVar.f4216b = 0.0f;
            arrayList.add(kVar);
        }
        return (k) arrayList.get(i10 - 1);
    }

    public final boolean j(int i10) {
        u7.f fVar;
        int length = ((x7.c) this.Q.getValue()).f91759a.length();
        u7.f fVar2 = this.f4222f0;
        if (fVar2 == null || (fVar = this.f4223g0) == null) {
            return true;
        }
        int iMin = Math.min(((Integer) fVar2.getValue()).intValue(), ((Integer) fVar.getValue()).intValue());
        int iMax = Math.max(((Integer) fVar2.getValue()).intValue(), ((Integer) fVar.getValue()).intValue());
        u7.f fVar3 = this.f4224h0;
        if (fVar3 != null) {
            int iIntValue = ((Integer) fVar3.getValue()).intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.T == z7.a0.f97571c) {
            return i10 >= iMin && i10 < iMax;
        }
        float f10 = (i10 / length) * 100.0f;
        return f10 >= ((float) iMin) && f10 < ((float) iMax);
    }

    public final boolean k(Canvas canvas, x7.c cVar, int i10, float f10) {
        PointF pointF = cVar.f91770l;
        PointF pointF2 = cVar.f91771m;
        float fDpScale = n.dpScale();
        float f11 = (i10 * cVar.f91764f * fDpScale) + (pointF == null ? 0.0f : (cVar.f91764f * fDpScale) + pointF.y);
        if (this.R.getClipTextToBoundingBox() && pointF2 != null && pointF != null && f11 >= pointF.y + pointF2.y + cVar.f91761c) {
            return false;
        }
        float f12 = pointF == null ? 0.0f : pointF.x;
        float f13 = pointF2 != null ? pointF2.x : 0.0f;
        int iOrdinal = cVar.f91762d.ordinal();
        if (iOrdinal == 0) {
            canvas.translate(f12, f11);
            return true;
        }
        if (iOrdinal == 1) {
            canvas.translate((f12 + f13) - f10, f11);
            return true;
        }
        if (iOrdinal != 2) {
            return true;
        }
        canvas.translate(((f13 / 2.0f) + f12) - (f10 / 2.0f), f11);
        return true;
    }

    public final List l(String str, float f10, x7.d dVar, float f11, float f12, boolean z10) {
        float fMeasureText;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (z10) {
                x7.e eVar = (x7.e) this.S.getCharacters().get(x7.e.hashFor(cCharAt, dVar.getFamily(), dVar.getStyle()));
                if (eVar != null) {
                    fMeasureText = (n.dpScale() * ((float) eVar.getWidth()) * f11) + f12;
                }
            } else {
                fMeasureText = this.K.measureText(str.substring(i13, i13 + 1)) + f12;
            }
            if (cCharAt == ' ') {
                z11 = true;
                f15 = fMeasureText;
            } else if (z11) {
                z11 = false;
                i12 = i13;
                f14 = fMeasureText;
            } else {
                f14 += fMeasureText;
            }
            f13 += fMeasureText;
            if (f10 > 0.0f && f13 >= f10 && cCharAt != ' ') {
                i10++;
                k kVarI = i(i10);
                if (i12 == i11) {
                    kVarI.f4215a = str.substring(i11, i13).trim();
                    kVarI.f4216b = (f13 - fMeasureText) - ((r9.length() - r7.length()) * f15);
                    i11 = i13;
                    i12 = i11;
                    f13 = fMeasureText;
                    f14 = f13;
                } else {
                    kVarI.f4215a = str.substring(i11, i12 - 1).trim();
                    kVarI.f4216b = ((f13 - f14) - ((r7.length() - r13.length()) * f15)) - f15;
                    f13 = f14;
                    i11 = i12;
                }
            }
        }
        if (f13 > 0.0f) {
            i10++;
            k kVarI2 = i(i10);
            kVarI2.f4215a = str.substring(i11);
            kVarI2.f4216b = f13;
        }
        return this.P.subList(0, i10);
    }
}
