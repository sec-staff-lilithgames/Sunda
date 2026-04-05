package t7;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.List;
import r7.a0;
import r7.h0;
import u7.y;
import z.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class i implements f, u7.a, l {

    /* renamed from: a, reason: collision with root package name */
    public final String f86459a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f86460b;

    /* renamed from: c, reason: collision with root package name */
    public final a8.a f86461c;

    /* renamed from: d, reason: collision with root package name */
    public final x f86462d = new x();

    /* renamed from: e, reason: collision with root package name */
    public final x f86463e = new x();

    /* renamed from: f, reason: collision with root package name */
    public final Path f86464f;

    /* renamed from: g, reason: collision with root package name */
    public final s7.a f86465g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f86466h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f86467i;

    /* renamed from: j, reason: collision with root package name */
    public final z7.g f86468j;

    /* renamed from: k, reason: collision with root package name */
    public final u7.f f86469k;

    /* renamed from: l, reason: collision with root package name */
    public final u7.f f86470l;

    /* renamed from: m, reason: collision with root package name */
    public final u7.f f86471m;

    /* renamed from: n, reason: collision with root package name */
    public final u7.f f86472n;

    /* renamed from: o, reason: collision with root package name */
    public y f86473o;

    /* renamed from: p, reason: collision with root package name */
    public y f86474p;

    /* renamed from: q, reason: collision with root package name */
    public final a0 f86475q;

    /* renamed from: r, reason: collision with root package name */
    public final int f86476r;

    /* renamed from: s, reason: collision with root package name */
    public u7.f f86477s;

    /* renamed from: t, reason: collision with root package name */
    public float f86478t;

    public i(a0 a0Var, r7.h hVar, a8.a aVar, z7.e eVar) {
        Path path = new Path();
        this.f86464f = path;
        this.f86465g = new s7.a(1);
        this.f86466h = new RectF();
        this.f86467i = new ArrayList();
        this.f86478t = 0.0f;
        this.f86461c = aVar;
        this.f86459a = eVar.getName();
        this.f86460b = eVar.isHidden();
        this.f86475q = a0Var;
        this.f86468j = eVar.getGradientType();
        path.setFillType(eVar.getFillType());
        this.f86476r = (int) (hVar.getDuration() / 32.0f);
        u7.f fVarCreateAnimation = eVar.getGradientColor().createAnimation();
        this.f86469k = fVarCreateAnimation;
        fVarCreateAnimation.addUpdateListener(this);
        aVar.addAnimation(fVarCreateAnimation);
        u7.f fVarCreateAnimation2 = eVar.getOpacity().createAnimation();
        this.f86470l = fVarCreateAnimation2;
        fVarCreateAnimation2.addUpdateListener(this);
        aVar.addAnimation(fVarCreateAnimation2);
        u7.f fVarCreateAnimation3 = eVar.getStartPoint().createAnimation();
        this.f86471m = fVarCreateAnimation3;
        fVarCreateAnimation3.addUpdateListener(this);
        aVar.addAnimation(fVarCreateAnimation3);
        u7.f fVarCreateAnimation4 = eVar.getEndPoint().createAnimation();
        this.f86472n = fVarCreateAnimation4;
        fVarCreateAnimation4.addUpdateListener(this);
        aVar.addAnimation(fVarCreateAnimation4);
        if (aVar.getBlurEffect() != null) {
            u7.j jVarCreateAnimation = aVar.getBlurEffect().getBlurriness().createAnimation();
            this.f86477s = jVarCreateAnimation;
            jVarCreateAnimation.addUpdateListener(this);
            aVar.addAnimation(this.f86477s);
        }
    }

    public final int[] a(int[] iArr) {
        y yVar = this.f86474p;
        if (yVar != null) {
            Integer[] numArr = (Integer[]) yVar.getValue();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t7.l, x7.g
    public <T> void addValueCallback(T t10, f8.c cVar) {
        PointF pointF = h0.f83915a;
        if (t10 == 4) {
            this.f86470l.setValueCallback(cVar);
            return;
        }
        ColorFilter colorFilter = h0.I;
        a8.a aVar = this.f86461c;
        if (t10 == colorFilter) {
            y yVar = this.f86473o;
            if (yVar != null) {
                aVar.removeAnimation(yVar);
            }
            if (cVar == null) {
                this.f86473o = null;
                return;
            }
            y yVar2 = new y(cVar);
            this.f86473o = yVar2;
            yVar2.addUpdateListener(this);
            aVar.addAnimation(this.f86473o);
            return;
        }
        if (t10 != h0.J) {
            if (t10 == h0.f83919e) {
                u7.f fVar = this.f86477s;
                if (fVar != null) {
                    fVar.setValueCallback(cVar);
                    return;
                }
                y yVar3 = new y(cVar);
                this.f86477s = yVar3;
                yVar3.addUpdateListener(this);
                aVar.addAnimation(this.f86477s);
                return;
            }
            return;
        }
        y yVar4 = this.f86474p;
        if (yVar4 != null) {
            aVar.removeAnimation(yVar4);
        }
        if (cVar == null) {
            this.f86474p = null;
            return;
        }
        this.f86462d.clear();
        this.f86463e.clear();
        y yVar5 = new y(cVar);
        this.f86474p = yVar5;
        yVar5.addUpdateListener(this);
        aVar.addAnimation(this.f86474p);
    }

    public final int b() {
        float progress = this.f86471m.getProgress();
        int i10 = this.f86476r;
        int iRound = Math.round(progress * i10);
        int iRound2 = Math.round(this.f86472n.getProgress() * i10);
        int iRound3 = Math.round(this.f86469k.getProgress() * i10);
        int i11 = iRound != 0 ? IronSourceError.ERROR_NON_EXISTENT_INSTANCE * iRound : 17;
        if (iRound2 != 0) {
            i11 = i11 * 31 * iRound2;
        }
        return iRound3 != 0 ? i11 * 31 * iRound3 : i11;
    }

    @Override // t7.f
    public void draw(Canvas canvas, Matrix matrix, int i10, e8.b bVar) {
        float f10;
        float[] fArr;
        int[] iArr;
        Shader shader;
        int[] iArr2;
        float[] fArr2;
        if (this.f86460b) {
            return;
        }
        if (r7.d.isTraceEnabled()) {
            r7.d.beginSection("GradientFillContent#draw");
        }
        Path path = this.f86464f;
        path.reset();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f86467i;
            if (i11 >= arrayList.size()) {
                break;
            }
            path.addPath(((n) arrayList.get(i11)).getPath(), matrix);
            i11++;
        }
        path.computeBounds(this.f86466h, false);
        z7.g gVar = this.f86468j;
        z7.g gVar2 = z7.g.f97601b;
        u7.f fVar = this.f86469k;
        u7.f fVar2 = this.f86472n;
        u7.f fVar3 = this.f86471m;
        if (gVar == gVar2) {
            long jB = b();
            x xVar = this.f86462d;
            shader = (LinearGradient) xVar.get(jB);
            if (shader != null) {
                f10 = 0.0f;
            } else {
                PointF pointF = (PointF) fVar3.getValue();
                PointF pointF2 = (PointF) fVar2.getValue();
                z7.d dVar = (z7.d) fVar.getValue();
                int[] iArrA = a(dVar.getColors());
                float[] positions = dVar.getPositions();
                f10 = 0.0f;
                if (iArrA.length < 2) {
                    fArr2 = new float[]{0.0f, 1.0f};
                    iArr2 = new int[]{iArrA[0], iArrA[0]};
                } else {
                    iArr2 = iArrA;
                    fArr2 = positions;
                }
                LinearGradient linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, iArr2, fArr2, Shader.TileMode.CLAMP);
                xVar.put(jB, linearGradient);
                shader = linearGradient;
            }
        } else {
            f10 = 0.0f;
            long jB2 = b();
            x xVar2 = this.f86463e;
            RadialGradient radialGradient = (RadialGradient) xVar2.get(jB2);
            if (radialGradient != null) {
                shader = radialGradient;
            } else {
                PointF pointF3 = (PointF) fVar3.getValue();
                PointF pointF4 = (PointF) fVar2.getValue();
                z7.d dVar2 = (z7.d) fVar.getValue();
                int[] iArrA2 = a(dVar2.getColors());
                float[] positions2 = dVar2.getPositions();
                if (iArrA2.length < 2) {
                    iArr = new int[]{iArrA2[0], iArrA2[0]};
                    fArr = new float[]{0.0f, 1.0f};
                } else {
                    fArr = positions2;
                    iArr = iArrA2;
                }
                float f11 = pointF3.x;
                float f12 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f11, pointF4.y - f12);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                RadialGradient radialGradient2 = new RadialGradient(f11, f12, fHypot, iArr, fArr, Shader.TileMode.CLAMP);
                xVar2.put(jB2, radialGradient2);
                shader = radialGradient2;
            }
        }
        Shader shader2 = shader;
        shader2.setLocalMatrix(matrix);
        s7.a aVar = this.f86465g;
        aVar.setShader(shader2);
        y yVar = this.f86473o;
        if (yVar != null) {
            aVar.setColorFilter((ColorFilter) yVar.getValue());
        }
        u7.f fVar4 = this.f86477s;
        if (fVar4 != null) {
            float fFloatValue = ((Float) fVar4.getValue()).floatValue();
            if (fFloatValue == f10) {
                aVar.setMaskFilter(null);
            } else if (fFloatValue != this.f86478t) {
                aVar.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f86478t = fFloatValue;
        }
        float fIntValue = ((Integer) this.f86470l.getValue()).intValue() / 100.0f;
        aVar.setAlpha(e8.j.clamp((int) (i10 * fIntValue), 0, 255));
        if (bVar != null) {
            bVar.applyWithAlpha((int) (fIntValue * 255.0f), aVar);
        }
        canvas.drawPath(path, aVar);
        if (r7.d.isTraceEnabled()) {
            r7.d.endSection("GradientFillContent#draw");
        }
    }

    @Override // t7.f
    public void getBounds(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f86464f;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f86467i;
            if (i10 >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((n) arrayList.get(i10)).getPath(), matrix);
                i10++;
            }
        }
    }

    @Override // t7.f, t7.d
    public String getName() {
        return this.f86459a;
    }

    @Override // u7.a
    public void onValueChanged() {
        this.f86475q.invalidateSelf();
    }

    @Override // t7.l, x7.g
    public void resolveKeyPath(x7.f fVar, int i10, List<x7.f> list, x7.f fVar2) {
        e8.j.resolveKeyPath(fVar, i10, list, fVar2, this);
    }

    @Override // t7.f, t7.d
    public void setContents(List<d> list, List<d> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            d dVar = list2.get(i10);
            if (dVar instanceof n) {
                this.f86467i.add((n) dVar);
            }
        }
    }
}
