package u2;

import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f87732e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar) {
        super(1);
        this.f87732e = oVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((o) obj);
        return x0.f87415a;
    }

    public final void invoke(o it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        o oVar = this.f87732e;
        oVar.getHandler().post(new a2.d0(3, oVar.f87755o));
    }
}
