package g1;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import tu.x0;
import x1.q1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o extends f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q1 f56682e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q1 q1Var) {
        super(1);
        this.f56682e = q1Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((q1.a) obj);
        return x0.f87415a;
    }

    public final void invoke(q1.a layout) {
        e0.checkNotNullParameter(layout, "$this$layout");
        q1.a.placeRelative$default(layout, this.f56682e, 0, 0, 0.0f, 4, null);
    }
}
