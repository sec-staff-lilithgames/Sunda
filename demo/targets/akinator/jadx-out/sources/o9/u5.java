package o9;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class u5 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f78590i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(String str, zu.d dVar) {
        super(2, dVar);
        this.f78590i = str;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new u5(this.f78590i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        ca.t tVarSharedInstance = ca.t.sharedInstance();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(tVarSharedInstance, "sharedInstance(...)");
        String str = this.f78590i;
        return new tu.d0(tVarSharedInstance.getAkiBitmap(str), tVarSharedInstance.getClothBitmap(ca.m.sharedInstance().getCloth(), str), tVarSharedInstance.getHatBitmap(ca.m.sharedInstance().getHat(), str));
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.d0> dVar) {
        return ((u5) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
