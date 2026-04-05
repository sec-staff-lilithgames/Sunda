package d3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class o extends p {
    @Override // d3.g
    public void addToSolver(x2.f fVar, boolean z10) {
        super.addToSolver(fVar, z10);
        if (this.D0 > 0) {
            g gVar = this.C0[0];
            gVar.resetAllConstraints();
            d dVar = d.f51748b;
            gVar.connect(dVar, this, dVar);
            d dVar2 = d.f51750e;
            gVar.connect(dVar2, this, dVar2);
            d dVar3 = d.f51749c;
            gVar.connect(dVar3, this, dVar3);
            d dVar4 = d.f51751f;
            gVar.connect(dVar4, this, dVar4);
        }
    }

    @Override // d3.p
    public void measure(int i10, int i11, int i12, int i13) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.D0 > 0) {
            paddingLeft += this.C0[0].getWidth();
            paddingTop += this.C0[0].getHeight();
        }
        int iMax = Math.max(getMinWidth(), paddingLeft);
        int iMax2 = Math.max(getMinHeight(), paddingTop);
        if (i10 != 1073741824) {
            i11 = i10 == Integer.MIN_VALUE ? Math.min(iMax, i11) : i10 == 0 ? iMax : 0;
        }
        if (i12 != 1073741824) {
            i13 = i12 == Integer.MIN_VALUE ? Math.min(iMax2, i13) : i12 == 0 ? iMax2 : 0;
        }
        setMeasure(i11, i13);
        setWidth(i11);
        setHeight(i13);
        this.K0 = this.D0 > 0;
    }
}
