package u2;

import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z1.b0 f87707e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(z1.b0 b0Var) {
        super(1);
        this.f87707e = b0Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((s2.e) obj);
        return x0.f87415a;
    }

    public final void invoke(s2.e it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        this.f87707e.setDensity(it);
    }
}
