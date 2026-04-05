package r6;

import android.net.NetworkRequest;
import android.os.Build;
import androidx.lifecycle.c3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends bv.n implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f83816i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f83817j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ n6.f f83818k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f83819l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(n6.f fVar, h hVar, zu.d dVar) {
        super(2, dVar);
        this.f83818k = fVar;
        this.f83819l = hVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        g gVar = new g(this.f83818k, this.f83819l, dVar);
        gVar.f83817j = obj;
        return gVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f83816i;
        x0 x0Var = x0.f87415a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return x0Var;
        }
        a0.throwOnFailure(obj);
        ProducerScope producerScope = (ProducerScope) this.f83817j;
        NetworkRequest requiredNetworkRequest = this.f83818k.getRequiredNetworkRequest();
        if (requiredNetworkRequest == null) {
            SendChannel.DefaultImpls.close$default(producerScope.getChannel(), null, 1, null);
            return x0Var;
        }
        h hVar = this.f83819l;
        c3 c3Var = new c3(18, BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new f(hVar, producerScope, null), 3, null), producerScope);
        e eVar = new e(0, Build.VERSION.SDK_INT >= 30 ? k.f83826a.addCallback(hVar.f83820a, requiredNetworkRequest, c3Var) : d.f83809b.addCallback(hVar.f83820a, requiredNetworkRequest, c3Var));
        this.f83816i = 1;
        return ProduceKt.awaitClose(producerScope, eVar, this) == coroutine_suspended ? coroutine_suspended : x0Var;
    }

    @Override // kv.p
    public final Object invoke(ProducerScope<? super c> producerScope, zu.d<? super x0> dVar) {
        return ((g) create(producerScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
