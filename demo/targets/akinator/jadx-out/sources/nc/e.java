package nc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final jc.c f75883a;

    /* renamed from: b, reason: collision with root package name */
    public final rc.r f75884b;

    /* renamed from: c, reason: collision with root package name */
    public final int f75885c;

    /* renamed from: d, reason: collision with root package name */
    public final d[] f75886d;

    public e(jc.c cVar, rc.r rVar, d[] dVarArr, int i10) {
        this.f75883a = cVar;
        this.f75884b = rVar;
        this.f75886d = dVarArr;
        this.f75885c = i10;
    }

    public static e construct(jc.c cVar, rc.r rVar, rc.d0[] d0VarArr) {
        int parameterCount = rVar.getParameterCount();
        d[] dVarArr = new d[parameterCount];
        for (int i10 = 0; i10 < parameterCount; i10++) {
            rc.q parameter = rVar.getParameter(i10);
            dVarArr[i10] = new d(parameter, d0VarArr == null ? null : d0VarArr[i10], cVar.findInjectableValue(parameter));
        }
        return new e(cVar, rVar, dVarArr, parameterCount);
    }

    public rc.r creator() {
        return this.f75884b;
    }

    public jc.n0 explicitParamName(int i10) {
        rc.d0 d0Var = this.f75886d[i10].f75879b;
        if (d0Var == null || !d0Var.isExplicitlyNamed()) {
            return null;
        }
        return d0Var.getFullName();
    }

    @Deprecated
    public jc.n0 findImplicitParamName(int i10) {
        String strFindImplicitPropertyName = this.f75883a.findImplicitPropertyName(this.f75886d[i10].f75878a);
        if (strFindImplicitPropertyName == null || strFindImplicitPropertyName.isEmpty()) {
            return null;
        }
        return jc.n0.construct(strFindImplicitPropertyName);
    }

    @Deprecated
    public int findOnlyParamWithoutInjectionX() {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f75885c; i11++) {
            if (this.f75886d[i11].f75880c == null) {
                if (i10 >= 0) {
                    return -1;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    public tb.c injection(int i10) {
        return this.f75886d[i10].f75880c;
    }

    public int paramCount() {
        return this.f75885c;
    }

    public jc.n0 paramName(int i10) {
        rc.d0 d0Var = this.f75886d[i10].f75879b;
        if (d0Var != null) {
            return d0Var.getFullName();
        }
        return null;
    }

    public rc.q parameter(int i10) {
        return this.f75886d[i10].f75878a;
    }

    public rc.d0 propertyDef(int i10) {
        return this.f75886d[i10].f75879b;
    }

    public String toString() {
        return this.f75884b.toString();
    }
}
