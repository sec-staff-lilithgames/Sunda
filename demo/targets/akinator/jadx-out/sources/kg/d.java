package kg;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public double f70953a;

    /* renamed from: b, reason: collision with root package name */
    public double f70954b;

    /* renamed from: c, reason: collision with root package name */
    public double f70955c;

    /* renamed from: d, reason: collision with root package name */
    public int f70956d;

    public d(int i10) {
        a(i10);
    }

    public static d from(double d10, double d11, double d12) {
        return new d(e.solveToInt(d10, d11, d12));
    }

    public static d fromInt(int i10) {
        return new d(i10);
    }

    public final void a(int i10) {
        this.f70956d = i10;
        b bVarFromInt = b.fromInt(i10);
        this.f70953a = bVarFromInt.getHue();
        this.f70954b = bVarFromInt.getChroma();
        this.f70955c = c.lstarFromArgb(i10);
    }

    public double getChroma() {
        return this.f70954b;
    }

    public double getHue() {
        return this.f70953a;
    }

    public double getTone() {
        return this.f70955c;
    }

    public d inViewingConditions(g gVar) {
        double[] dArrB = b.fromInt(toInt()).b(gVar, null);
        b bVarA = b.a(dArrB[0], dArrB[1], dArrB[2], g.f70961k);
        return from(bVarA.getHue(), bVarA.getChroma(), c.lstarFromY(dArrB[1]));
    }

    public void setChroma(double d10) {
        a(e.solveToInt(this.f70953a, d10, this.f70955c));
    }

    public void setHue(double d10) {
        a(e.solveToInt(d10, this.f70954b, this.f70955c));
    }

    public void setTone(double d10) {
        a(e.solveToInt(this.f70953a, this.f70954b, d10));
    }

    public int toInt() {
        return this.f70956d;
    }
}
