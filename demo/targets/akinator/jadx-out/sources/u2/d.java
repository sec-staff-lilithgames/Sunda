package u2;

import kotlin.jvm.internal.b1;
import tu.x0;
import z1.s1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f87717e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b1 f87718f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o oVar, b1 b1Var) {
        super(1);
        this.f87717e = oVar;
        this.f87718f = b1Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((s1) obj);
        return x0.f87415a;
    }

    public final void invoke(s1 owner) {
        kotlin.jvm.internal.e0.checkNotNullParameter(owner, "owner");
        a2.t tVar = owner instanceof a2.t ? (a2.t) owner : null;
        o oVar = this.f87717e;
        if (tVar != null) {
            tVar.removeAndroidView(oVar);
        }
        this.f87718f.f71816b = oVar.getView();
        oVar.setView$ui_release(null);
    }
}
