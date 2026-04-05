package u2;

import android.view.View;
import kotlin.jvm.internal.b1;
import tu.x0;
import z1.s1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f87713e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z1.b0 f87714f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b1 f87715g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o oVar, z1.b0 b0Var, b1 b1Var) {
        super(1);
        this.f87713e = oVar;
        this.f87714f = b0Var;
        this.f87715g = b1Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((s1) obj);
        return x0.f87415a;
    }

    public final void invoke(s1 owner) {
        kotlin.jvm.internal.e0.checkNotNullParameter(owner, "owner");
        a2.t tVar = owner instanceof a2.t ? (a2.t) owner : null;
        o oVar = this.f87713e;
        if (tVar != null) {
            tVar.addAndroidView(oVar, this.f87714f);
        }
        Object obj = this.f87715g.f71816b;
        if (obj != null) {
            oVar.setView$ui_release((View) obj);
        }
    }
}
