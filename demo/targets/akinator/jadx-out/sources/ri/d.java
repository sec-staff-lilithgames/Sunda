package ri;

import bv.n;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import kv.l;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f84410i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f84411j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l f84412k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, l lVar, zu.d dVar) {
        super(2, dVar);
        this.f84411j = iVar;
        this.f84412k = lVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new d(this.f84411j, this.f84412k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f84410i;
        i iVar = this.f84411j;
        try {
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                if (e0.areEqual(iVar.f84429c.get(), bv.b.boxBoolean(true))) {
                    throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                }
                iVar.f84429c.set(bv.b.boxBoolean(true));
                k4.n nVar = iVar.f84430d;
                c cVar = new c(this.f84412k, null);
                this.f84410i = 1;
                obj = o4.p.edit(nVar, cVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return (o4.j) obj;
        } finally {
            iVar.f84429c.set(bv.b.boxBoolean(false));
        }
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super o4.j> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
