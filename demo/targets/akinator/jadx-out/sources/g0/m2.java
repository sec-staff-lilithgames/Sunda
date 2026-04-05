package g0;

import be.nVUQ.UupKET;
import x1.q1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class m2 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x1.q1 f56525e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x1.a1 f56526f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n2 f56527g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(x1.q1 q1Var, x1.a1 a1Var, n2 n2Var) {
        super(1);
        this.f56525e = q1Var;
        this.f56526f = a1Var;
        this.f56527g = n2Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((q1.a) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(q1.a aVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(aVar, UupKET.aeRxmTLR);
        n2 n2Var = this.f56527g;
        i2 paddingValues = n2Var.getPaddingValues();
        x1.a1 a1Var = this.f56526f;
        q1.a.place$default(aVar, this.f56525e, a1Var.mo3419roundToPx0680j_4(paddingValues.mo3842calculateLeftPaddingu2uoSUM(a1Var.getLayoutDirection())), a1Var.mo3419roundToPx0680j_4(n2Var.getPaddingValues().mo3844calculateTopPaddingD9Ej5fM()), 0.0f, 4, null);
    }
}
