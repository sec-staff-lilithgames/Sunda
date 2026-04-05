package b0;

import p0.o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public c0.z1 f8356a;

    /* renamed from: b, reason: collision with root package name */
    public final p0.j2 f8357b;

    public e0(c0.z1 transition) {
        kotlin.jvm.internal.e0.checkNotNullParameter(transition, "transition");
        this.f8356a = transition;
        this.f8357b = o5.mutableStateOf$default(s2.v.m6964boximpl(s2.v.f85360b.m6963getZeroYbymL2g()), null, 2, null);
    }

    @Override // b0.c0
    public /* bridge */ /* synthetic */ e1.v animateEnterExit(e1.v vVar, t1 t1Var, v1 v1Var, String str) {
        return super.animateEnterExit(vVar, t1Var, v1Var, str);
    }

    public final p0.j2 getTargetSize$animation_release() {
        return this.f8357b;
    }

    @Override // b0.c0
    public c0.z1 getTransition() {
        return this.f8356a;
    }

    public void setTransition(c0.z1 z1Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(z1Var, "<set-?>");
        this.f8356a = z1Var;
    }
}
