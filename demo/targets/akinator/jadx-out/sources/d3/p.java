package d3;

import e3.b;
import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class p extends m {
    public int E0 = 0;
    public int F0 = 0;
    public int G0 = 0;
    public int H0 = 0;
    public int I0 = 0;
    public int J0 = 0;
    public boolean K0 = false;
    public int L0 = 0;
    public int M0 = 0;
    public final b.a N0 = new b.a();
    public e3.c O0 = null;

    public void applyRtl(boolean z10) {
        int i10 = this.G0;
        if (i10 > 0 || this.H0 > 0) {
            if (z10) {
                this.I0 = this.H0;
                this.J0 = i10;
            } else {
                this.I0 = i10;
                this.J0 = this.H0;
            }
        }
    }

    public void captureWidgets() {
        for (int i10 = 0; i10 < this.D0; i10++) {
            g gVar = this.C0[i10];
            if (gVar != null) {
                gVar.setInVirtualLayout(true);
            }
        }
    }

    public boolean contains(HashSet<g> hashSet) {
        for (int i10 = 0; i10 < this.D0; i10++) {
            if (hashSet.contains(this.C0[i10])) {
                return true;
            }
        }
        return false;
    }

    public int getMeasuredHeight() {
        return this.M0;
    }

    public int getMeasuredWidth() {
        return this.L0;
    }

    public int getPaddingBottom() {
        return this.F0;
    }

    public int getPaddingLeft() {
        return this.I0;
    }

    public int getPaddingRight() {
        return this.J0;
    }

    public int getPaddingTop() {
        return this.E0;
    }

    public final void k(g gVar, f fVar, int i10, f fVar2, int i11) {
        while (this.O0 == null && getParent() != null) {
            this.O0 = ((h) getParent()).getMeasurer();
        }
        b.a aVar = this.N0;
        aVar.f53642a = fVar;
        aVar.f53643b = fVar2;
        aVar.f53644c = i10;
        aVar.f53645d = i11;
        ((androidx.constraintlayout.widget.e) this.O0).measure(gVar, aVar);
        gVar.setWidth(aVar.f53646e);
        gVar.setHeight(aVar.f53647f);
        gVar.setHasBaseline(aVar.f53649h);
        gVar.setBaselineDistance(aVar.f53648g);
    }

    public boolean needSolverPass() {
        return this.K0;
    }

    public void setMeasure(int i10, int i11) {
        this.L0 = i10;
        this.M0 = i11;
    }

    public void setPadding(int i10) {
        this.E0 = i10;
        this.F0 = i10;
        this.G0 = i10;
        this.H0 = i10;
    }

    public void setPaddingBottom(int i10) {
        this.F0 = i10;
    }

    public void setPaddingEnd(int i10) {
        this.H0 = i10;
    }

    public void setPaddingLeft(int i10) {
        this.I0 = i10;
    }

    public void setPaddingRight(int i10) {
        this.J0 = i10;
    }

    public void setPaddingStart(int i10) {
        this.G0 = i10;
        this.I0 = i10;
        this.J0 = i10;
    }

    public void setPaddingTop(int i10) {
        this.E0 = i10;
    }

    @Override // d3.m, d3.l
    public void updateConstraints(h hVar) {
        captureWidgets();
    }

    public void measure(int i10, int i11, int i12, int i13) {
    }
}
