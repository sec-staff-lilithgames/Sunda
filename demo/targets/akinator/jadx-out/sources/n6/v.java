package n6;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f75787i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f75788j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kv.p f75789k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w2.j f75790l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(kv.p pVar, w2.j jVar, zu.d dVar) {
        super(2, dVar);
        this.f75789k = pVar;
        this.f75790l = jVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        v vVar = new v(this.f75789k, this.f75790l, dVar);
        vVar.f75788j = obj;
        return vVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f75787i;
        w2.j jVar = this.f75790l;
        try {
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f75788j;
                kv.p pVar = this.f75789k;
                this.f75787i = 1;
                obj = pVar.invoke(coroutineScope, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
            }
            jVar.set(obj);
        } catch (CancellationException unused) {
            jVar.setCancelled();
        } catch (Throwable th2) {
            jVar.setException(th2);
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((v) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
