package u2;

import tu.x0;
import z1.a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a2 f87772e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(a2 a2Var) {
        super(2);
        this.f87772e = a2Var;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((z1.b0) obj, (s2.e) obj2);
        return x0.f87415a;
    }

    public final void invoke(z1.b0 set, s2.e it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(set, "$this$set");
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        Object value = this.f87772e.getValue();
        kotlin.jvm.internal.e0.checkNotNull(value);
        ((g0) value).setDensity(it);
    }
}
