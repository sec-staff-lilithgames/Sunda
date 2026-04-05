package j$.time.format;

/* loaded from: classes3.dex */
public final class o implements f {

    /* renamed from: a, reason: collision with root package name */
    public final j$.time.temporal.p f68564a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f68565b;

    /* renamed from: c, reason: collision with root package name */
    public final x f68566c;

    /* renamed from: d, reason: collision with root package name */
    public volatile j f68567d;

    public o(j$.time.temporal.p pVar, b0 b0Var, x xVar) {
        this.f68564a = pVar;
        this.f68565b = b0Var;
        this.f68566c = xVar;
    }

    @Override // j$.time.format.f
    public final boolean r(u uVar, StringBuilder sb2) {
        String strB;
        Long lA = uVar.a(this.f68564a);
        if (lA == null) {
            return false;
        }
        j$.time.chrono.m mVar = (j$.time.chrono.m) uVar.f68588a.b(j$.time.temporal.q.f68657b);
        if (mVar == null || mVar == j$.time.chrono.t.f68512c) {
            strB = this.f68566c.b(this.f68564a, lA.longValue(), this.f68565b, uVar.f68589b.f68532b);
        } else {
            strB = this.f68566c.a(mVar, this.f68564a, lA.longValue(), this.f68565b, uVar.f68589b.f68532b);
        }
        if (strB != null) {
            sb2.append(strB);
            return true;
        }
        if (this.f68567d == null) {
            this.f68567d = new j(this.f68564a, 1, 19, a0.NORMAL);
        }
        return this.f68567d.r(uVar, sb2);
    }

    public final String toString() {
        b0 b0Var = b0.FULL;
        j$.time.temporal.p pVar = this.f68564a;
        b0 b0Var2 = this.f68565b;
        if (b0Var2 == b0Var) {
            return "Text(" + pVar + ")";
        }
        return "Text(" + pVar + "," + b0Var2 + ")";
    }
}
