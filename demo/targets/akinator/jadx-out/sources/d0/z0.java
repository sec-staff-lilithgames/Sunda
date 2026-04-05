package d0;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public f0.t f51687i;

    /* renamed from: j, reason: collision with root package name */
    public int f51688j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v5 f51689k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f51690l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f0.q f51691m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f51692n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(v5 v5Var, long j10, f0.q qVar, p0.j2 j2Var, zu.d dVar) {
        super(2, dVar);
        this.f51689k = v5Var;
        this.f51690l = j10;
        this.f51691m = qVar;
        this.f51692n = j2Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new z0(this.f51689k, this.f51690l, this.f51691m, this.f51692n, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        f0.t tVar;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f51688j;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            if (((Boolean) ((kv.a) this.f51689k.getValue()).invoke()).booleanValue()) {
                long tapIndicationDelay = c1.getTapIndicationDelay();
                this.f51688j = 1;
                if (DelayKt.delay(tapIndicationDelay, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tVar = this.f51687i;
                tu.a0.throwOnFailure(obj);
                this.f51692n.setValue(tVar);
                return tu.x0.f87415a;
            }
            tu.a0.throwOnFailure(obj);
        }
        f0.t tVar2 = new f0.t(this.f51690l, null);
        this.f51687i = tVar2;
        this.f51688j = 2;
        if (this.f51691m.emit(tVar2, this) != coroutine_suspended) {
            tVar = tVar2;
            this.f51692n.setValue(tVar);
            return tu.x0.f87415a;
        }
        return coroutine_suspended;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((z0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
