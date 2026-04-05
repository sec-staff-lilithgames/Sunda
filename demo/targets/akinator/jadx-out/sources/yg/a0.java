package yg;

import android.util.StateSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public int f94399a;

    /* renamed from: b, reason: collision with root package name */
    public p f94400b;

    /* renamed from: c, reason: collision with root package name */
    public int[][] f94401c;

    /* renamed from: d, reason: collision with root package name */
    public p[] f94402d;

    /* renamed from: e, reason: collision with root package name */
    public z f94403e;

    /* renamed from: f, reason: collision with root package name */
    public z f94404f;

    /* renamed from: g, reason: collision with root package name */
    public z f94405g;

    /* renamed from: h, reason: collision with root package name */
    public z f94406h;

    public a0(b0 b0Var) {
        int i10 = b0Var.f94409a;
        this.f94399a = i10;
        this.f94400b = b0Var.f94410b;
        int[][] iArr = b0Var.f94411c;
        int[][] iArr2 = new int[iArr.length][];
        this.f94401c = iArr2;
        p[] pVarArr = b0Var.f94412d;
        this.f94402d = new p[pVarArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, i10);
        System.arraycopy(pVarArr, 0, this.f94402d, 0, this.f94399a);
        this.f94403e = b0Var.f94413e;
        this.f94404f = b0Var.f94414f;
        this.f94405g = b0Var.f94415g;
        this.f94406h = b0Var.f94416h;
    }

    public final void a() {
        this.f94400b = new p();
        this.f94401c = new int[10][];
        this.f94402d = new p[10];
    }

    public a0 addStateShapeAppearanceModel(int[] iArr, p pVar) {
        int i10 = this.f94399a;
        if (i10 == 0 || iArr.length == 0) {
            this.f94400b = pVar;
        }
        int[][] iArr2 = this.f94401c;
        if (i10 >= iArr2.length) {
            int i11 = i10 + 10;
            int[][] iArr3 = new int[i11][];
            System.arraycopy(iArr2, 0, iArr3, 0, i10);
            this.f94401c = iArr3;
            p[] pVarArr = new p[i11];
            System.arraycopy(this.f94402d, 0, pVarArr, 0, i10);
            this.f94402d = pVarArr;
        }
        int[][] iArr4 = this.f94401c;
        int i12 = this.f94399a;
        iArr4[i12] = iArr;
        this.f94402d[i12] = pVar;
        this.f94399a = i12 + 1;
        return this;
    }

    public b0 build() {
        if (this.f94399a == 0) {
            return null;
        }
        return new b0(this);
    }

    public a0 setCornerSizeOverride(z zVar, int i10) {
        if ((i10 | 1) == i10) {
            this.f94403e = zVar;
        }
        if ((i10 | 2) == i10) {
            this.f94404f = zVar;
        }
        if ((i10 | 4) == i10) {
            this.f94405g = zVar;
        }
        if ((i10 | 8) == i10) {
            this.f94406h = zVar;
        }
        return this;
    }

    public a0 withTransformedCornerSizes(q qVar) {
        p[] pVarArr = new p[this.f94402d.length];
        for (int i10 = 0; i10 < this.f94399a; i10++) {
            pVarArr[i10] = this.f94402d[i10].withTransformedCornerSizes(qVar);
        }
        this.f94402d = pVarArr;
        z zVar = this.f94403e;
        if (zVar != null) {
            this.f94403e = zVar.withTransformedCornerSizes(qVar);
        }
        z zVar2 = this.f94404f;
        if (zVar2 != null) {
            this.f94404f = zVar2.withTransformedCornerSizes(qVar);
        }
        z zVar3 = this.f94405g;
        if (zVar3 != null) {
            this.f94405g = zVar3.withTransformedCornerSizes(qVar);
        }
        z zVar4 = this.f94406h;
        if (zVar4 != null) {
            this.f94406h = zVar4.withTransformedCornerSizes(qVar);
        }
        return this;
    }

    public a0(p pVar) {
        a();
        addStateShapeAppearanceModel(StateSet.WILD_CARD, pVar);
    }
}
