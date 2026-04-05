package l0;

import g2.x1;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0 f72127e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(x0 x0Var) {
        super(1);
        this.f72127e = x0Var;
    }

    @Override // kv.l
    public final Boolean invoke(List<x1> it) {
        boolean z10;
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        x0 x0Var = this.f72127e;
        if (x0Var.getState().getLayoutResult() != null) {
            x1 layoutResult = x0Var.getState().getLayoutResult();
            kotlin.jvm.internal.e0.checkNotNull(layoutResult);
            it.add(layoutResult);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
