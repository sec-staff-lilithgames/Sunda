package b7;

import b7.i;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public i f8869i;

    /* renamed from: j, reason: collision with root package name */
    public int f8870j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i f8871k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar, zu.d dVar) {
        super(2, dVar);
        this.f8871k = iVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new l(this.f8871k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        i iVar;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f8870j;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            i iVar2 = this.f8871k;
            a7.m imageLoader = iVar2.getImageLoader();
            l7.i iVarAccess$updateRequest = i.access$updateRequest(iVar2, iVar2.getRequest());
            this.f8869i = iVar2;
            this.f8870j = 1;
            Object objExecute = imageLoader.execute(iVarAccess$updateRequest, this);
            if (objExecute == coroutine_suspended) {
                return coroutine_suspended;
            }
            iVar = iVar2;
            obj = objExecute;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = this.f8869i;
            tu.a0.throwOnFailure(obj);
        }
        return i.access$toState(iVar, (l7.k) obj);
    }

    @Override // kv.p
    public final Object invoke(l7.i iVar, zu.d<? super i.b> dVar) {
        return ((l) create(iVar, dVar)).invokeSuspend(x0.f87415a);
    }
}
