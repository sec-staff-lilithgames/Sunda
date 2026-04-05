package ad;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a extends zc.u {

    /* renamed from: v, reason: collision with root package name */
    public final String f4250v;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(String str, rc.d0 d0Var, dd.b bVar, jc.o oVar) {
        tb.c0 valueInclusion;
        Object obj;
        tb.d0 d0VarFindInclusion = d0Var.findInclusion();
        rc.l primaryMember = d0Var.getPrimaryMember();
        tb.c0 c0Var = tb.c0.f86699h;
        tb.c0 c0Var2 = tb.c0.f86694b;
        boolean z10 = false;
        if (d0VarFindInclusion != null && (valueInclusion = d0VarFindInclusion.getValueInclusion()) != c0Var2 && valueInclusion != c0Var) {
            z10 = true;
        }
        boolean z11 = z10;
        if (d0VarFindInclusion == null) {
            obj = Boolean.FALSE;
        } else {
            tb.c0 valueInclusion2 = d0VarFindInclusion.getValueInclusion();
            obj = (valueInclusion2 == c0Var2 || valueInclusion2 == tb.c0.f86695c || valueInclusion2 == c0Var) ? null : tb.c0.f86696e;
        }
        super(d0Var, primaryMember, bVar, oVar, null, null, null, z11, obj, null);
        this.f4250v = str;
    }

    public static a construct(String str, rc.d0 d0Var, dd.b bVar, jc.o oVar) {
        return new a(str, d0Var, bVar, oVar);
    }

    @Override // zc.u
    public zc.u withConfig(lc.z zVar, rc.e eVar, rc.d0 d0Var, jc.o oVar) {
        throw new IllegalStateException("Should not be called on this type");
    }
}
