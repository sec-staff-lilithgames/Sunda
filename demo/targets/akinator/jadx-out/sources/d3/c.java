package d3;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final g f51731a;

    /* renamed from: b, reason: collision with root package name */
    public g f51732b;

    /* renamed from: c, reason: collision with root package name */
    public g f51733c;

    /* renamed from: d, reason: collision with root package name */
    public g f51734d;

    /* renamed from: e, reason: collision with root package name */
    public g f51735e;

    /* renamed from: f, reason: collision with root package name */
    public g f51736f;

    /* renamed from: g, reason: collision with root package name */
    public g f51737g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f51738h;

    /* renamed from: i, reason: collision with root package name */
    public int f51739i;

    /* renamed from: j, reason: collision with root package name */
    public int f51740j;

    /* renamed from: k, reason: collision with root package name */
    public float f51741k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    public final int f51742l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f51743m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f51744n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f51745o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f51746p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f51747q;

    public c(g gVar, int i10, boolean z10) {
        this.f51731a = gVar;
        this.f51742l = i10;
        this.f51743m = z10;
    }

    public void define() {
        float f10;
        int i10;
        if (!this.f51747q) {
            int i11 = this.f51742l;
            int i12 = i11 * 2;
            g gVar = this.f51731a;
            g gVar2 = gVar;
            g gVar3 = gVar2;
            boolean z10 = false;
            while (!z10) {
                this.f51739i++;
                g[] gVarArr = gVar2.f51818x0;
                int[] iArr = gVar2.f51813v;
                e[] eVarArr = gVar2.V;
                g gVar4 = null;
                gVarArr[i11] = null;
                gVar2.f51816w0[i11] = null;
                if (gVar2.getVisibility() != 8) {
                    f dimensionBehaviour = gVar2.getDimensionBehaviour(i11);
                    f fVar = f.f51768e;
                    if (dimensionBehaviour != fVar) {
                        gVar2.getLength(i11);
                    }
                    eVarArr[i12].getMargin();
                    int i13 = i12 + 1;
                    eVarArr[i13].getMargin();
                    eVarArr[i12].getMargin();
                    eVarArr[i13].getMargin();
                    if (this.f51732b == null) {
                        this.f51732b = gVar2;
                    }
                    this.f51734d = gVar2;
                    if (gVar2.Y[i11] == fVar) {
                        int i14 = iArr[i11];
                        if (i14 == 0 || i14 == 3 || i14 == 2) {
                            this.f51740j++;
                            float f11 = gVar2.f51814v0[i11];
                            if (f11 > 0.0f) {
                                f10 = 0.0f;
                                this.f51741k += f11;
                            } else {
                                f10 = 0.0f;
                            }
                            if (gVar2.getVisibility() != 8 && gVar2.Y[i11] == fVar && ((i10 = iArr[i11]) == 0 || i10 == 3)) {
                                if (f11 < f10) {
                                    this.f51744n = true;
                                } else {
                                    this.f51745o = true;
                                }
                                if (this.f51738h == null) {
                                    this.f51738h = new ArrayList();
                                }
                                this.f51738h.add(gVar2);
                            }
                            if (this.f51736f == null) {
                                this.f51736f = gVar2;
                            }
                            g gVar5 = this.f51737g;
                            if (gVar5 != null) {
                                gVar5.f51816w0[i11] = gVar2;
                            }
                            this.f51737g = gVar2;
                        }
                        if (i11 == 0) {
                            if (gVar2.f51809t == 0 && gVar2.f51815w == 0) {
                                int i15 = gVar2.f51817x;
                            }
                        } else if (gVar2.f51811u == 0 && gVar2.f51821z == 0) {
                            int i16 = gVar2.A;
                        }
                    }
                }
                if (gVar3 != gVar2) {
                    gVar3.f51818x0[i11] = gVar2;
                }
                e eVar = eVarArr[i12 + 1].f51762f;
                if (eVar != null) {
                    g gVar6 = eVar.f51760d;
                    e eVar2 = gVar6.V[i12].f51762f;
                    if (eVar2 != null && eVar2.f51760d == gVar2) {
                        gVar4 = gVar6;
                    }
                }
                if (gVar4 == null) {
                    z10 = true;
                    gVar4 = gVar2;
                }
                gVar3 = gVar2;
                gVar2 = gVar4;
            }
            g gVar7 = this.f51732b;
            if (gVar7 != null) {
                gVar7.V[i12].getMargin();
            }
            g gVar8 = this.f51734d;
            if (gVar8 != null) {
                gVar8.V[i12 + 1].getMargin();
            }
            this.f51733c = gVar2;
            if (i11 == 0 && this.f51743m) {
                this.f51735e = gVar2;
            } else {
                this.f51735e = gVar;
            }
            this.f51746p = this.f51745o && this.f51744n;
        }
        this.f51747q = true;
    }

    public g getFirst() {
        return this.f51731a;
    }

    public g getFirstMatchConstraintWidget() {
        return this.f51736f;
    }

    public g getFirstVisibleWidget() {
        return this.f51732b;
    }

    public g getHead() {
        return this.f51735e;
    }

    public g getLast() {
        return this.f51733c;
    }

    public g getLastMatchConstraintWidget() {
        return this.f51737g;
    }

    public g getLastVisibleWidget() {
        return this.f51734d;
    }

    public float getTotalWeight() {
        return this.f51741k;
    }
}
