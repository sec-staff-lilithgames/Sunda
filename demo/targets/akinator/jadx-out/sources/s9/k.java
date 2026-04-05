package s9;

import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f85540i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Throwable f85541j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Throwable th2, g gVar, zu.d dVar) {
        super(2, dVar);
        this.f85540i = gVar;
        this.f85541j = th2;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new k(this.f85541j, this.f85540i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        a0.throwOnFailure(obj);
        g gVar = this.f85540i;
        FragmentActivity fragmentActivityRequireActivity = gVar.requireActivity();
        e0.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        da.f fVar = new da.f(fragmentActivityRequireActivity);
        fVar.setTypeOk(this.f85541j.getMessage());
        fVar.setOkListener(new j(gVar, 0));
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((k) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
