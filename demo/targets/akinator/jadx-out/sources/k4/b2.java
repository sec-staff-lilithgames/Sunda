package k4;

import java.io.File;
import k4.c2;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public DisposableHandle f70284i;

    /* renamed from: j, reason: collision with root package name */
    public int f70285j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f70286k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ File f70287l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(File file, zu.d dVar) {
        super(2, dVar);
        this.f70287l = file;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        b2 b2Var = new b2(this.f70287l, dVar);
        b2Var.f70286k = obj;
        return b2Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        DisposableHandle disposableHandleAccess$observe;
        ProducerScope producerScope;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f70285j;
        tu.x0 x0Var = tu.x0.f87415a;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            ProducerScope producerScope2 = (ProducerScope) this.f70286k;
            File file = this.f70287l;
            a2 a2Var = new a2(producerScope2, file);
            c2.a aVar = c2.f70301c;
            File parentFile = file.getParentFile();
            kotlin.jvm.internal.e0.checkNotNull(parentFile);
            disposableHandleAccess$observe = c2.a.access$observe(aVar, parentFile, a2Var);
            this.f70286k = producerScope2;
            this.f70284i = disposableHandleAccess$observe;
            this.f70285j = 1;
            if (producerScope2.send(x0Var, this) != coroutine_suspended) {
                producerScope = producerScope2;
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return x0Var;
        }
        disposableHandleAccess$observe = this.f70284i;
        producerScope = (ProducerScope) this.f70286k;
        tu.a0.throwOnFailure(obj);
        z1 z1Var = new z1(disposableHandleAccess$observe);
        this.f70286k = null;
        this.f70284i = null;
        this.f70285j = 2;
        return ProduceKt.awaitClose(producerScope, z1Var, this) == coroutine_suspended ? coroutine_suspended : x0Var;
    }

    @Override // kv.p
    public final Object invoke(ProducerScope<? super tu.x0> producerScope, zu.d<? super tu.x0> dVar) {
        return ((b2) create(producerScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
