package v2;

import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0 f88922e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(a0 a0Var) {
        super(1);
        this.f88922e = a0Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m7430invokeozmzZPI(((s2.v) obj).m6976unboximpl());
        return x0.f87415a;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m7430invokeozmzZPI(long j10) {
        s2.v vVarM6964boximpl = s2.v.m6964boximpl(j10);
        a0 a0Var = this.f88922e;
        a0Var.m7428setPopupContentSizefhxjrPA(vVarM6964boximpl);
        a0Var.updatePosition();
    }
}
