package h1;

import p0.j2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j2 f58537e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kv.l f58538f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kv.l lVar, j2 j2Var) {
        super(1);
        this.f58537e = j2Var;
        this.f58538f = lVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((u0) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(u0 it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        j2 j2Var = this.f58537e;
        if (kotlin.jvm.internal.e0.areEqual(j2Var.getValue(), it)) {
            return;
        }
        j2Var.setValue(it);
        this.f58538f.invoke(it);
    }
}
