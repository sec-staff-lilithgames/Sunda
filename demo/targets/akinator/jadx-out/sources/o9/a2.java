package o9;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f78026i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(int i10, zu.d dVar) {
        super(2, dVar);
        this.f78026i = i10;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new a2(this.f78026i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        ca.m.sharedInstance().setCurrentSubject(this.f78026i);
        lb.c currentInstance = ca.m.sharedInstance().getCurrentInstance();
        kotlin.jvm.internal.e0.checkNotNull(currentInstance);
        int tradsAppId = currentInstance.getTradsAppId();
        lb.b1 b1VarSharedInstance = lb.b1.f72741d.sharedInstance();
        String currentLanguage = ca.m.sharedInstance().getCurrentLanguage();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(currentLanguage, "getCurrentLanguage(...)");
        return bv.b.boxInt(b1VarSharedInstance.setApplicationLanguage(currentLanguage, tradsAppId));
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((a2) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
