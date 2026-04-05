package o4;

import kotlin.jvm.internal.e0;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f77477i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f77478j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kv.p f77479k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kv.p pVar, zu.d dVar) {
        super(2, dVar);
        this.f77479k = pVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        e eVar = new e(this.f77479k, dVar);
        eVar.f77478j = obj;
        return eVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f77477i;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            j jVar = (j) this.f77478j;
            this.f77477i = 1;
            obj = this.f77479k.invoke(jVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
        }
        j jVar2 = (j) obj;
        e0.checkNotNull(jVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((d) jVar2).freeze$datastore_preferences_core_release();
        return jVar2;
    }

    @Override // kv.p
    public final Object invoke(j jVar, zu.d<? super j> dVar) {
        return ((e) create(jVar, dVar)).invokeSuspend(x0.f87415a);
    }
}
