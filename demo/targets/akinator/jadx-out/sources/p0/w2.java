package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w2 implements kv.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x2 f80568b;

    public w2(x2 x2Var) {
        this.f80568b = x2Var;
    }

    @Override // kv.a
    public /* bridge */ /* synthetic */ Object invoke() {
        return r0.b.m5980boximpl(m5855invokefVlnmYg());
    }

    /* renamed from: invoke-fVlnmYg, reason: not valid java name */
    public final z.u0 m5855invokefVlnmYg() {
        x2 x2Var = this.f80568b;
        z.u0 u0VarM5982constructorimpl = r0.b.m5982constructorimpl(new z.u0(x2Var.getKeyInfos().size()));
        int size = x2Var.getKeyInfos().size();
        for (int i10 = 0; i10 < size; i10++) {
            v1 v1Var = x2Var.getKeyInfos().get(i10);
            r0.b.m5979addimpl(u0VarM5982constructorimpl, d0.access$getJoinedKey(v1Var), v1Var);
        }
        return u0VarM5982constructorimpl;
    }
}
