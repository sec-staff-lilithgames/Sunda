package l0;

import m0.t1;
import m0.w1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t1 f72097e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(t1 t1Var) {
        super(2);
        this.f72097e = t1Var;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((a1.r) obj, ((Number) obj2).longValue());
    }

    public final Long invoke(a1.r Saver, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(Saver, "$this$Saver");
        if (w1.hasSelection(this.f72097e, j10)) {
            return Long.valueOf(j10);
        }
        return null;
    }
}
