package w2;

import kotlin.jvm.internal.f0;
import sh.n1;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q extends f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n1 f90362e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n1 n1Var) {
        super(1);
        this.f90362e = n1Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return x0.f87415a;
    }

    public final void invoke(Throwable th2) {
        this.f90362e.cancel(false);
    }
}
