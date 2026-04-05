package n0;

import g0.i2;
import p0.h3;
import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v5 f75044e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i2 f75045f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kv.q f75046g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f75047h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(v5 v5Var, i2 i2Var, kv.q qVar, int i10) {
        super(2);
        this.f75044e = v5Var;
        this.f75045f = i2Var;
        this.f75046g = qVar;
        this.f75047h = i10;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        if ((i10 & 11) == 2 && wVar.getSkipping()) {
            wVar.skipToGroupEnd();
            return;
        }
        p0.o0.CompositionLocalProvider(new h3[]{n.getLocalContentAlpha().provides(Float.valueOf(j1.m0.m4860getAlphaimpl(((j1.m0) this.f75044e.getValue()).m4868unboximpl())))}, z0.u.composableLambda(wVar, -1699085201, true, new e(this.f75045f, this.f75046g, this.f75047h)), wVar, 56);
    }
}
