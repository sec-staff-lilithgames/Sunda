package o5;

import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 extends kotlin.jvm.internal.a0 implements kv.l {
    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Set<Integer>) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(Set<Integer> p02) {
        kotlin.jvm.internal.e0.checkNotNullParameter(p02, "p0");
        y.access$notifyInvalidatedObservers((y) this.receiver, p02);
    }
}
