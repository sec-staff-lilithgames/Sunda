package n1;

import java.util.ArrayList;
import java.util.List;
import n1.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f75440a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final b f75441b;

    /* renamed from: c, reason: collision with root package name */
    public final b f75442c;

    /* renamed from: d, reason: collision with root package name */
    public final b f75443d;

    /* renamed from: e, reason: collision with root package name */
    public final b f75444e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f75445a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f75446b;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(0, 0 == true ? 1 : 0, 3, null);
        }

        public static /* synthetic */ a copy$default(a aVar, int i10, boolean z10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = aVar.f75445a;
            }
            if ((i11 & 2) != 0) {
                z10 = aVar.f75446b;
            }
            return aVar.copy(i10, z10);
        }

        public final int component1() {
            return this.f75445a;
        }

        public final boolean component2() {
            return this.f75446b;
        }

        public final a copy(int i10, boolean z10) {
            return new a(i10, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f75445a == aVar.f75445a && this.f75446b == aVar.f75446b;
        }

        public final int getEndPosition() {
            return this.f75445a;
        }

        public final boolean getEndWithNegativeOrDot() {
            return this.f75446b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iHashCode = Integer.hashCode(this.f75445a) * 31;
            boolean z10 = this.f75446b;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return iHashCode + i10;
        }

        public final void setEndPosition(int i10) {
            this.f75445a = i10;
        }

        public final void setEndWithNegativeOrDot(boolean z10) {
            this.f75446b = z10;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ExtractFloatResult(endPosition=");
            sb2.append(this.f75445a);
            sb2.append(", endWithNegativeOrDot=");
            return a.b.p(sb2, this.f75446b, ')');
        }

        public a(int i10, boolean z10) {
            this.f75445a = i10;
            this.f75446b = z10;
        }

        public /* synthetic */ a(int i10, boolean z10, int i11, kotlin.jvm.internal.u uVar) {
            this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? false : z10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public float f75447a;

        /* renamed from: b, reason: collision with root package name */
        public float f75448b;

        /* JADX WARN: Illegal instructions before constructor call */
        public b() {
            float f10 = 0.0f;
            this(f10, f10, 3, null);
        }

        public static /* synthetic */ b copy$default(b bVar, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = bVar.f75447a;
            }
            if ((i10 & 2) != 0) {
                f11 = bVar.f75448b;
            }
            return bVar.copy(f10, f11);
        }

        public final float component1() {
            return this.f75447a;
        }

        public final float component2() {
            return this.f75448b;
        }

        public final b copy(float f10, float f11) {
            return new b(f10, f11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75447a), (Object) Float.valueOf(bVar.f75447a)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75448b), (Object) Float.valueOf(bVar.f75448b));
        }

        public final float getX() {
            return this.f75447a;
        }

        public final float getY() {
            return this.f75448b;
        }

        public int hashCode() {
            return Float.hashCode(this.f75448b) + (Float.hashCode(this.f75447a) * 31);
        }

        public final void reset() {
            this.f75447a = 0.0f;
            this.f75448b = 0.0f;
        }

        public final void setX(float f10) {
            this.f75447a = f10;
        }

        public final void setY(float f10) {
            this.f75448b = f10;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("PathPoint(x=");
            sb2.append(this.f75447a);
            sb2.append(", y=");
            return a.b.n(sb2, this.f75448b, ')');
        }

        public b(float f10, float f11) {
            this.f75447a = f10;
            this.f75448b = f11;
        }

        public /* synthetic */ b(float f10, float f11, int i10, kotlin.jvm.internal.u uVar) {
            this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 0.0f : f11);
        }
    }

    public j() {
        float f10 = 0.0f;
        int i10 = 3;
        kotlin.jvm.internal.u uVar = null;
        this.f75441b = new b(f10, f10, i10, uVar);
        this.f75442c = new b(f10, f10, i10, uVar);
        this.f75443d = new b(f10, f10, i10, uVar);
        this.f75444e = new b(f10, f10, i10, uVar);
    }

    public static void a(j1.l1 l1Var, double d10, double d11, double d12, double d13, double d14, double d15, double d16, boolean z10, boolean z11) {
        double d17;
        double d18;
        double d19 = d14;
        double d20 = (d16 / 180) * 3.141592653589793d;
        double dCos = Math.cos(d20);
        double dSin = Math.sin(d20);
        double d21 = ((d11 * dSin) + (d10 * dCos)) / d19;
        double d22 = ((d11 * dCos) + ((-d10) * dSin)) / d15;
        double d23 = ((d13 * dSin) + (d12 * dCos)) / d19;
        double d24 = ((d13 * dCos) + ((-d12) * dSin)) / d15;
        double d25 = d21 - d23;
        double d26 = d22 - d24;
        double d27 = 2;
        double d28 = (d21 + d23) / d27;
        double d29 = (d22 + d24) / d27;
        double d30 = (d26 * d26) + (d25 * d25);
        if (d30 == 0.0d) {
            return;
        }
        double d31 = (1.0d / d30) - 0.25d;
        if (d31 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d30) / 1.99999d);
            a(l1Var, d10, d11, d12, d13, d19 * dSqrt, d15 * dSqrt, d16, z10, z11);
            return;
        }
        double dSqrt2 = Math.sqrt(d31);
        double d32 = d25 * dSqrt2;
        double d33 = dSqrt2 * d26;
        if (z10 == z11) {
            d17 = d28 - d33;
            d18 = d29 + d32;
        } else {
            d17 = d28 + d33;
            d18 = d29 - d32;
        }
        double dAtan2 = Math.atan2(d22 - d18, d21 - d17);
        double dAtan22 = Math.atan2(d24 - d18, d23 - d17) - dAtan2;
        if (z11 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d34 = d17 * d19;
        double d35 = d18 * d15;
        double d36 = (d34 * dCos) - (d35 * dSin);
        double d37 = (d35 * dCos) + (d34 * dSin);
        double d38 = 4;
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * d38) / 3.141592653589793d));
        double dCos2 = Math.cos(d20);
        double dSin2 = Math.sin(d20);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d39 = dAtan22;
        double d40 = -d19;
        double d41 = d40 * dCos2;
        double d42 = d15 * dSin2;
        double d43 = (d41 * dSin3) - (d42 * dCos3);
        double d44 = d40 * dSin2;
        double d45 = d15 * dCos2;
        double d46 = (dCos3 * d45) + (dSin3 * d44);
        double d47 = d39 / iCeil;
        double d48 = dAtan2;
        double d49 = d43;
        int i10 = 0;
        double d50 = d10;
        double d51 = d46;
        double d52 = d11;
        while (i10 < iCeil) {
            double d53 = d48 + d47;
            double dSin4 = Math.sin(d53);
            double dCos4 = Math.cos(d53);
            int i11 = i10;
            double d54 = (((d19 * dCos2) * dCos4) + d36) - (d42 * dSin4);
            int i12 = iCeil;
            double d55 = (d45 * dSin4) + (d19 * dSin2 * dCos4) + d37;
            double d56 = (d41 * dSin4) - (d42 * dCos4);
            double d57 = (dCos4 * d45) + (dSin4 * d44);
            double d58 = d53 - d48;
            double dTan = Math.tan(d58 / d27);
            double dSqrt3 = ((Math.sqrt(((3.0d * dTan) * dTan) + d38) - 1) * Math.sin(d58)) / 3;
            l1Var.cubicTo((float) ((d49 * dSqrt3) + d50), (float) ((d51 * dSqrt3) + d52), (float) (d54 - (dSqrt3 * d56)), (float) (d55 - (dSqrt3 * d57)), (float) d54, (float) d55);
            d50 = d54;
            i10 = i11 + 1;
            d36 = d36;
            dSin2 = dSin2;
            d38 = d38;
            d48 = d53;
            d51 = d57;
            d49 = d56;
            d52 = d55;
            d19 = d14;
            iCeil = i12;
        }
    }

    public static /* synthetic */ j1.l1 toPath$default(j jVar, j1.l1 l1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l1Var = j1.p.Path();
        }
        return jVar.toPath(l1Var);
    }

    public final j addPathNodes(List<? extends g> nodes) {
        kotlin.jvm.internal.e0.checkNotNullParameter(nodes, "nodes");
        this.f75440a.addAll(nodes);
        return this;
    }

    public final void clear() {
        this.f75440a.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00f8 A[EDGE_INSN: B:120:0x00f8->B:71:0x00f8 BREAK  A[LOOP:4: B:42:0x00b4->B:69:0x00f1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f1 A[LOOP:4: B:42:0x00b4->B:69:0x00f1, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final n1.j parsePathString(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.j.parsePathString(java.lang.String):n1.j");
    }

    public final List<g> toNodes() {
        return this.f75440a;
    }

    public final j1.l1 toPath(j1.l1 l1Var) {
        b bVar;
        b bVar2;
        b bVar3;
        ArrayList arrayList;
        int i10;
        int i11;
        g gVar;
        b bVar4;
        j1.l1 target = l1Var;
        kotlin.jvm.internal.e0.checkNotNullParameter(target, "target");
        target.reset();
        b bVar5 = this.f75441b;
        bVar5.reset();
        b bVar6 = this.f75442c;
        bVar6.reset();
        b bVar7 = this.f75443d;
        bVar7.reset();
        b bVar8 = this.f75444e;
        bVar8.reset();
        ArrayList arrayList2 = this.f75440a;
        int size = arrayList2.size();
        g gVar2 = null;
        int i12 = 0;
        while (i12 < size) {
            g gVar3 = (g) arrayList2.get(i12);
            if (gVar2 == null) {
                gVar2 = gVar3;
            }
            if (gVar3 instanceof h) {
                bVar5.setX(bVar7.getX());
                bVar5.setY(bVar7.getY());
                bVar6.setX(bVar7.getX());
                bVar6.setY(bVar7.getY());
                target.close();
                target.moveTo(bVar5.getX(), bVar5.getY());
            } else if (gVar3 instanceof g.m) {
                g.m mVar = (g.m) gVar3;
                bVar5.setX(mVar.getDx() + bVar5.getX());
                bVar5.setY(mVar.getDy() + bVar5.getY());
                target.relativeMoveTo(mVar.getDx(), mVar.getDy());
                bVar7.setX(bVar5.getX());
                bVar7.setY(bVar5.getY());
            } else if (gVar3 instanceof g.e) {
                g.e eVar = (g.e) gVar3;
                bVar5.setX(eVar.getX());
                bVar5.setY(eVar.getY());
                target.moveTo(eVar.getX(), eVar.getY());
                bVar7.setX(bVar5.getX());
                bVar7.setY(bVar5.getY());
            } else if (gVar3 instanceof g.l) {
                g.l lVar = (g.l) gVar3;
                target.relativeLineTo(lVar.getDx(), lVar.getDy());
                bVar5.setX(lVar.getDx() + bVar5.getX());
                bVar5.setY(lVar.getDy() + bVar5.getY());
            } else if (gVar3 instanceof g.d) {
                g.d dVar = (g.d) gVar3;
                target.lineTo(dVar.getX(), dVar.getY());
                bVar5.setX(dVar.getX());
                bVar5.setY(dVar.getY());
            } else if (gVar3 instanceof g.k) {
                g.k kVar = (g.k) gVar3;
                target.relativeLineTo(kVar.getDx(), 0.0f);
                bVar5.setX(kVar.getDx() + bVar5.getX());
            } else if (gVar3 instanceof g.c) {
                g.c cVar = (g.c) gVar3;
                target.lineTo(cVar.getX(), bVar5.getY());
                bVar5.setX(cVar.getX());
            } else if (gVar3 instanceof g.q) {
                g.q qVar = (g.q) gVar3;
                target.relativeLineTo(0.0f, qVar.getDy());
                bVar5.setY(qVar.getDy() + bVar5.getY());
            } else if (gVar3 instanceof g.r) {
                g.r rVar = (g.r) gVar3;
                target.lineTo(bVar5.getX(), rVar.getY());
                bVar5.setY(rVar.getY());
            } else if (gVar3 instanceof g.j) {
                g.j jVar = (g.j) gVar3;
                target.relativeCubicTo(jVar.getDx1(), jVar.getDy1(), jVar.getDx2(), jVar.getDy2(), jVar.getDx3(), jVar.getDy3());
                bVar6.setX(jVar.getDx2() + bVar5.getX());
                bVar6.setY(jVar.getDy2() + bVar5.getY());
                bVar5.setX(jVar.getDx3() + bVar5.getX());
                bVar5.setY(jVar.getDy3() + bVar5.getY());
            } else if (gVar3 instanceof g.b) {
                g.b bVar9 = (g.b) gVar3;
                l1Var.cubicTo(bVar9.getX1(), bVar9.getY1(), bVar9.getX2(), bVar9.getY2(), bVar9.getX3(), bVar9.getY3());
                bVar6.setX(bVar9.getX2());
                bVar6.setY(bVar9.getY2());
                bVar5.setX(bVar9.getX3());
                bVar5.setY(bVar9.getY3());
            } else if (gVar3 instanceof g.o) {
                g.o oVar = (g.o) gVar3;
                kotlin.jvm.internal.e0.checkNotNull(gVar2);
                if (gVar2.isCurve()) {
                    bVar8.setX(bVar5.getX() - bVar6.getX());
                    bVar8.setY(bVar5.getY() - bVar6.getY());
                } else {
                    bVar8.reset();
                }
                l1Var.relativeCubicTo(bVar8.getX(), bVar8.getY(), oVar.getDx1(), oVar.getDy1(), oVar.getDx2(), oVar.getDy2());
                bVar6.setX(oVar.getDx1() + bVar5.getX());
                bVar6.setY(oVar.getDy1() + bVar5.getY());
                bVar5.setX(oVar.getDx2() + bVar5.getX());
                bVar5.setY(oVar.getDy2() + bVar5.getY());
            } else if (gVar3 instanceof g.C0751g) {
                g.C0751g c0751g = (g.C0751g) gVar3;
                kotlin.jvm.internal.e0.checkNotNull(gVar2);
                if (gVar2.isCurve()) {
                    float f10 = 2;
                    bVar8.setX((bVar5.getX() * f10) - bVar6.getX());
                    bVar8.setY((bVar5.getY() * f10) - bVar6.getY());
                } else {
                    bVar8.setX(bVar5.getX());
                    bVar8.setY(bVar5.getY());
                }
                l1Var.cubicTo(bVar8.getX(), bVar8.getY(), c0751g.getX1(), c0751g.getY1(), c0751g.getX2(), c0751g.getY2());
                bVar6.setX(c0751g.getX1());
                bVar6.setY(c0751g.getY1());
                bVar5.setX(c0751g.getX2());
                bVar5.setY(c0751g.getY2());
            } else if (gVar3 instanceof g.n) {
                g.n nVar = (g.n) gVar3;
                l1Var.relativeQuadraticBezierTo(nVar.getDx1(), nVar.getDy1(), nVar.getDx2(), nVar.getDy2());
                bVar6.setX(nVar.getDx1() + bVar5.getX());
                bVar6.setY(nVar.getDy1() + bVar5.getY());
                bVar5.setX(nVar.getDx2() + bVar5.getX());
                bVar5.setY(nVar.getDy2() + bVar5.getY());
            } else if (gVar3 instanceof g.f) {
                g.f fVar = (g.f) gVar3;
                l1Var.quadraticBezierTo(fVar.getX1(), fVar.getY1(), fVar.getX2(), fVar.getY2());
                bVar6.setX(fVar.getX1());
                bVar6.setY(fVar.getY1());
                bVar5.setX(fVar.getX2());
                bVar5.setY(fVar.getY2());
            } else if (gVar3 instanceof g.p) {
                g.p pVar = (g.p) gVar3;
                kotlin.jvm.internal.e0.checkNotNull(gVar2);
                if (gVar2.isQuad()) {
                    bVar8.setX(bVar5.getX() - bVar6.getX());
                    bVar8.setY(bVar5.getY() - bVar6.getY());
                } else {
                    bVar8.reset();
                }
                l1Var.relativeQuadraticBezierTo(bVar8.getX(), bVar8.getY(), pVar.getDx(), pVar.getDy());
                bVar6.setX(bVar8.getX() + bVar5.getX());
                bVar6.setY(bVar8.getY() + bVar5.getY());
                bVar5.setX(pVar.getDx() + bVar5.getX());
                bVar5.setY(pVar.getDy() + bVar5.getY());
            } else if (gVar3 instanceof g.h) {
                g.h hVar = (g.h) gVar3;
                kotlin.jvm.internal.e0.checkNotNull(gVar2);
                if (gVar2.isQuad()) {
                    float f11 = 2;
                    bVar8.setX((bVar5.getX() * f11) - bVar6.getX());
                    bVar8.setY((bVar5.getY() * f11) - bVar6.getY());
                } else {
                    bVar8.setX(bVar5.getX());
                    bVar8.setY(bVar5.getY());
                }
                l1Var.quadraticBezierTo(bVar8.getX(), bVar8.getY(), hVar.getX(), hVar.getY());
                bVar6.setX(bVar8.getX());
                bVar6.setY(bVar8.getY());
                bVar5.setX(hVar.getX());
                bVar5.setY(hVar.getY());
            } else {
                if (gVar3 instanceof g.i) {
                    g.i iVar = (g.i) gVar3;
                    float arcStartDx = iVar.getArcStartDx() + bVar5.getX();
                    float arcStartDy = iVar.getArcStartDy() + bVar5.getY();
                    b bVar10 = bVar5;
                    i10 = size;
                    i11 = i12;
                    bVar2 = bVar7;
                    bVar3 = bVar8;
                    arrayList = arrayList2;
                    a(l1Var, bVar5.getX(), bVar5.getY(), arcStartDx, arcStartDy, iVar.getHorizontalEllipseRadius(), iVar.getVerticalEllipseRadius(), iVar.getTheta(), iVar.isMoreThanHalf(), iVar.isPositiveArc());
                    bVar10.setX(arcStartDx);
                    bVar10.setY(arcStartDy);
                    bVar = bVar6;
                    bVar.setX(bVar10.getX());
                    bVar.setY(bVar10.getY());
                    bVar4 = bVar10;
                    gVar = gVar3;
                } else {
                    b bVar11 = bVar5;
                    bVar = bVar6;
                    bVar2 = bVar7;
                    bVar3 = bVar8;
                    arrayList = arrayList2;
                    i10 = size;
                    i11 = i12;
                    if (gVar3 instanceof g.a) {
                        g.a aVar = (g.a) gVar3;
                        gVar = gVar3;
                        bVar4 = bVar11;
                        a(l1Var, bVar11.getX(), bVar11.getY(), aVar.getArcStartX(), aVar.getArcStartY(), aVar.getHorizontalEllipseRadius(), aVar.getVerticalEllipseRadius(), aVar.getTheta(), aVar.isMoreThanHalf(), aVar.isPositiveArc());
                        bVar4.setX(aVar.getArcStartX());
                        bVar4.setY(aVar.getArcStartY());
                        bVar = bVar;
                        bVar.setX(bVar4.getX());
                        bVar.setY(bVar4.getY());
                    } else {
                        gVar = gVar3;
                        bVar4 = bVar11;
                    }
                }
                i12 = i11 + 1;
                target = l1Var;
                bVar5 = bVar4;
                bVar6 = bVar;
                size = i10;
                bVar7 = bVar2;
                bVar8 = bVar3;
                arrayList2 = arrayList;
                gVar2 = gVar;
            }
            bVar4 = bVar5;
            bVar = bVar6;
            bVar2 = bVar7;
            bVar3 = bVar8;
            arrayList = arrayList2;
            i10 = size;
            i11 = i12;
            gVar = gVar3;
            i12 = i11 + 1;
            target = l1Var;
            bVar5 = bVar4;
            bVar6 = bVar;
            size = i10;
            bVar7 = bVar2;
            bVar8 = bVar3;
            arrayList2 = arrayList;
            gVar2 = gVar;
        }
        return l1Var;
    }
}
