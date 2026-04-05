package u2;

import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z1.b0 f87704e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e1.v f87705f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(z1.b0 b0Var, e1.v vVar) {
        super(1);
        this.f87704e = b0Var;
        this.f87705f = vVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((e1.v) obj);
        return x0.f87415a;
    }

    public final void invoke(e1.v it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        this.f87704e.setModifier(it.then(this.f87705f));
    }
}
