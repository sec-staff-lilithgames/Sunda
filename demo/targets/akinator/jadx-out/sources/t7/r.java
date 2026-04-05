package t7;

import android.graphics.PointF;
import j1.o2;
import java.util.ArrayList;
import java.util.List;
import r7.a0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class r implements t, u7.a {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f86534a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86535b;

    /* renamed from: c, reason: collision with root package name */
    public final u7.f f86536c;

    /* renamed from: d, reason: collision with root package name */
    public z7.r f86537d;

    public r(a0 a0Var, a8.a aVar, z7.q qVar) {
        this.f86534a = a0Var;
        this.f86535b = qVar.getName();
        u7.f fVarCreateAnimation = qVar.getCornerRadius().createAnimation();
        this.f86536c = fVarCreateAnimation;
        aVar.addAnimation(fVarCreateAnimation);
        fVarCreateAnimation.addUpdateListener(this);
    }

    public static int a(int i10, int i11) {
        int i12 = i10 / i11;
        if ((i10 ^ i11) < 0 && i12 * i11 != i10) {
            i12--;
        }
        return i10 - (i12 * i11);
    }

    @Override // t7.t
    public void addUpdateListener(u7.a aVar) {
        this.f86536c.addUpdateListener(aVar);
    }

    @Override // t7.t, t7.d
    public String getName() {
        return this.f86535b;
    }

    public u7.f getRoundedCorners() {
        return this.f86536c;
    }

    @Override // t7.t
    public z7.r modifyShape(z7.r rVar) {
        List<x7.a> list;
        List<x7.a> curves = rVar.getCurves();
        if (curves.size() > 2) {
            float fFloatValue = ((Float) this.f86536c.getValue()).floatValue();
            if (fFloatValue != 0.0f) {
                List<x7.a> curves2 = rVar.getCurves();
                boolean zIsClosed = rVar.isClosed();
                boolean z10 = true;
                int size = curves2.size() - 1;
                int i10 = 0;
                while (size >= 0) {
                    x7.a aVar = curves2.get(size);
                    x7.a aVar2 = curves2.get(a(size - 1, curves2.size()));
                    PointF vertex = (size != 0 || zIsClosed) ? aVar2.getVertex() : rVar.getInitialPoint();
                    i10 = (((size != 0 || zIsClosed) ? aVar2.getControlPoint2() : vertex).equals(vertex) && aVar.getControlPoint1().equals(vertex) && !(!rVar.isClosed() && (size == 0 || size == curves2.size() - 1))) ? i10 + 2 : i10 + 1;
                    size--;
                }
                z7.r rVar2 = this.f86537d;
                if (rVar2 == null || rVar2.getCurves().size() != i10) {
                    ArrayList arrayList = new ArrayList(i10);
                    for (int i11 = 0; i11 < i10; i11++) {
                        arrayList.add(new x7.a());
                    }
                    this.f86537d = new z7.r(new PointF(0.0f, 0.0f), false, arrayList);
                }
                this.f86537d.setClosed(zIsClosed);
                z7.r rVar3 = this.f86537d;
                rVar3.setInitialPoint(rVar.getInitialPoint().x, rVar.getInitialPoint().y);
                List<x7.a> curves3 = rVar3.getCurves();
                boolean zIsClosed2 = rVar.isClosed();
                int i12 = 0;
                int i13 = 0;
                while (i12 < curves.size()) {
                    x7.a aVar3 = curves.get(i12);
                    x7.a aVar4 = curves.get(a(i12 - 1, curves.size()));
                    x7.a aVar5 = curves.get(a(i12 - 2, curves.size()));
                    PointF vertex2 = (i12 != 0 || zIsClosed2) ? aVar4.getVertex() : rVar.getInitialPoint();
                    PointF controlPoint2 = (i12 != 0 || zIsClosed2) ? aVar4.getControlPoint2() : vertex2;
                    PointF controlPoint1 = aVar3.getControlPoint1();
                    PointF vertex3 = aVar5.getVertex();
                    boolean z11 = z10;
                    PointF vertex4 = aVar3.getVertex();
                    boolean z12 = (rVar.isClosed() || !(i12 == 0 || i12 == curves.size() + (-1))) ? false : z11;
                    if (controlPoint2.equals(vertex2) && controlPoint1.equals(vertex2) && !z12) {
                        float f10 = vertex2.x;
                        float f11 = f10 - vertex3.x;
                        float f12 = vertex2.y;
                        float f13 = f12 - vertex3.y;
                        float f14 = vertex4.x - f10;
                        float f15 = vertex4.y - f12;
                        list = curves;
                        float fHypot = (float) Math.hypot(f11, f13);
                        float fHypot2 = (float) Math.hypot(f14, f15);
                        float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                        float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                        float f16 = vertex2.x;
                        float fA = o2.a(vertex3.x, f16, fMin, f16);
                        float f17 = vertex2.y;
                        float fA2 = o2.a(vertex3.y, f17, fMin, f17);
                        float fA3 = o2.a(vertex4.x, f16, fMin2, f16);
                        float fA4 = o2.a(vertex4.y, f17, fMin2, f17);
                        float f18 = fA - ((fA - f16) * 0.5519f);
                        float f19 = fA2 - ((fA2 - f17) * 0.5519f);
                        float f20 = fA3 - ((fA3 - f16) * 0.5519f);
                        float f21 = fA4 - ((fA4 - f17) * 0.5519f);
                        x7.a aVar6 = curves3.get(a(i13 - 1, curves3.size()));
                        x7.a aVar7 = curves3.get(i13);
                        aVar6.setControlPoint2(fA, fA2);
                        aVar6.setVertex(fA, fA2);
                        if (i12 == 0) {
                            rVar3.setInitialPoint(fA, fA2);
                        }
                        aVar7.setControlPoint1(f18, f19);
                        x7.a aVar8 = curves3.get(i13 + 1);
                        aVar7.setControlPoint2(f20, f21);
                        aVar7.setVertex(fA3, fA4);
                        aVar8.setControlPoint1(fA3, fA4);
                        i13 += 2;
                    } else {
                        list = curves;
                        x7.a aVar9 = curves3.get(a(i13 - 1, curves3.size()));
                        x7.a aVar10 = curves3.get(i13);
                        aVar9.setControlPoint2(aVar4.getControlPoint2().x, aVar4.getControlPoint2().y);
                        aVar9.setVertex(aVar4.getVertex().x, aVar4.getVertex().y);
                        aVar10.setControlPoint1(aVar3.getControlPoint1().x, aVar3.getControlPoint1().y);
                        i13++;
                    }
                    i12++;
                    z10 = z11;
                    curves = list;
                }
                return rVar3;
            }
        }
        return rVar;
    }

    @Override // u7.a
    public void onValueChanged() {
        this.f86534a.invalidateSelf();
    }

    @Override // t7.t, t7.d
    public void setContents(List<d> list, List<d> list2) {
    }
}
