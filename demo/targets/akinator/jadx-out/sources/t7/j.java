package t7;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.ironsource.mediationsdk.logger.IronSourceError;
import r7.a0;
import r7.h0;
import u7.y;
import z.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class j extends b {
    public y A;

    /* renamed from: q, reason: collision with root package name */
    public final String f86479q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f86480r;

    /* renamed from: s, reason: collision with root package name */
    public final x f86481s;

    /* renamed from: t, reason: collision with root package name */
    public final x f86482t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f86483u;

    /* renamed from: v, reason: collision with root package name */
    public final z7.g f86484v;

    /* renamed from: w, reason: collision with root package name */
    public final int f86485w;

    /* renamed from: x, reason: collision with root package name */
    public final u7.f f86486x;

    /* renamed from: y, reason: collision with root package name */
    public final u7.f f86487y;

    /* renamed from: z, reason: collision with root package name */
    public final u7.f f86488z;

    public j(a0 a0Var, a8.a aVar, z7.f fVar) {
        super(a0Var, aVar, fVar.getCapType().toPaintCap(), fVar.getJoinType().toPaintJoin(), fVar.getMiterLimit(), fVar.getOpacity(), fVar.getWidth(), fVar.getLineDashPattern(), fVar.getDashOffset());
        this.f86481s = new x();
        this.f86482t = new x();
        this.f86483u = new RectF();
        this.f86479q = fVar.getName();
        this.f86484v = fVar.getGradientType();
        this.f86480r = fVar.isHidden();
        this.f86485w = (int) (a0Var.getComposition().getDuration() / 32.0f);
        u7.f fVarCreateAnimation = fVar.getGradientColor().createAnimation();
        this.f86486x = fVarCreateAnimation;
        fVarCreateAnimation.addUpdateListener(this);
        aVar.addAnimation(fVarCreateAnimation);
        u7.f fVarCreateAnimation2 = fVar.getStartPoint().createAnimation();
        this.f86487y = fVarCreateAnimation2;
        fVarCreateAnimation2.addUpdateListener(this);
        aVar.addAnimation(fVarCreateAnimation2);
        u7.f fVarCreateAnimation3 = fVar.getEndPoint().createAnimation();
        this.f86488z = fVarCreateAnimation3;
        fVarCreateAnimation3.addUpdateListener(this);
        aVar.addAnimation(fVarCreateAnimation3);
    }

    public final int[] a(int[] iArr) {
        y yVar = this.A;
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
    @Override // t7.b, t7.l, x7.g
    public <T> void addValueCallback(T t10, f8.c cVar) {
        super.addValueCallback(t10, cVar);
        if (t10 == h0.J) {
            y yVar = this.A;
            a8.a aVar = this.f86415f;
            if (yVar != null) {
                aVar.removeAnimation(yVar);
            }
            if (cVar == null) {
                this.A = null;
                return;
            }
            y yVar2 = new y(cVar);
            this.A = yVar2;
            yVar2.addUpdateListener(this);
            aVar.addAnimation(this.A);
        }
    }

    public final int b() {
        float progress = this.f86487y.getProgress();
        int i10 = this.f86485w;
        int iRound = Math.round(progress * i10);
        int iRound2 = Math.round(this.f86488z.getProgress() * i10);
        int iRound3 = Math.round(this.f86486x.getProgress() * i10);
        int i11 = iRound != 0 ? IronSourceError.ERROR_NON_EXISTENT_INSTANCE * iRound : 17;
        if (iRound2 != 0) {
            i11 = i11 * 31 * iRound2;
        }
        return iRound3 != 0 ? i11 * 31 * iRound3 : i11;
    }

    @Override // t7.b, t7.f
    public void draw(Canvas canvas, Matrix matrix, int i10, e8.b bVar) {
        Shader shader;
        Shader radialGradient;
        if (this.f86480r) {
            return;
        }
        getBounds(this.f86483u, matrix, false);
        z7.g gVar = this.f86484v;
        z7.g gVar2 = z7.g.f97601b;
        u7.f fVar = this.f86486x;
        u7.f fVar2 = this.f86488z;
        u7.f fVar3 = this.f86487y;
        if (gVar == gVar2) {
            long jB = b();
            x xVar = this.f86481s;
            shader = (LinearGradient) xVar.get(jB);
            if (shader == null) {
                PointF pointF = (PointF) fVar3.getValue();
                PointF pointF2 = (PointF) fVar2.getValue();
                z7.d dVar = (z7.d) fVar.getValue();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, a(dVar.getColors()), dVar.getPositions(), Shader.TileMode.CLAMP);
                xVar.put(jB, radialGradient);
                shader = radialGradient;
            }
        } else {
            long jB2 = b();
            x xVar2 = this.f86482t;
            shader = (RadialGradient) xVar2.get(jB2);
            if (shader == null) {
                PointF pointF3 = (PointF) fVar3.getValue();
                PointF pointF4 = (PointF) fVar2.getValue();
                z7.d dVar2 = (z7.d) fVar.getValue();
                int[] iArrA = a(dVar2.getColors());
                float[] positions = dVar2.getPositions();
                radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), iArrA, positions, Shader.TileMode.CLAMP);
                xVar2.put(jB2, radialGradient);
                shader = radialGradient;
            }
        }
        this.f86418i.setShader(shader);
        super.draw(canvas, matrix, i10, bVar);
    }

    @Override // t7.b, t7.l, t7.d
    public String getName() {
        return this.f86479q;
    }
}
