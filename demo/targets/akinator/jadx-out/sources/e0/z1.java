package e0;

import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f53437i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f53438j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f53439k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v5 f53440l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v5 f53441m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m2 f53442n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Channel f53443o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f53444p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(boolean z10, v5 v5Var, v5 v5Var2, m2 m2Var, Channel channel, boolean z11, zu.d dVar) {
        super(2, dVar);
        this.f53439k = z10;
        this.f53440l = v5Var;
        this.f53441m = v5Var2;
        this.f53442n = m2Var;
        this.f53443o = channel;
        this.f53444p = z11;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        z1 z1Var = new z1(this.f53439k, this.f53440l, this.f53441m, this.f53442n, this.f53443o, this.f53444p, dVar);
        z1Var.f53438j = obj;
        return z1Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f53437i;
        tu.x0 x0Var = tu.x0.f87415a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return x0Var;
        }
        tu.a0.throwOnFailure(obj);
        u1.k0 k0Var = (u1.k0) this.f53438j;
        if (this.f53439k) {
            y1 y1Var = new y1(k0Var, this.f53440l, this.f53441m, this.f53442n, this.f53443o, this.f53444p, null);
            this.f53437i = 1;
            if (CoroutineScopeKt.coroutineScope(y1Var, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return x0Var;
    }

    @Override // kv.p
    public final Object invoke(u1.k0 k0Var, zu.d<? super tu.x0> dVar) {
        return ((z1) create(k0Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
