package l5;

import android.net.Uri;
import bv.n;
import com.applovin.impl.ga;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import t3.t;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f72411i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f72412j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Uri f72413k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f72414l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, Uri uri, i iVar, zu.d dVar) {
        super(2, dVar);
        this.f72412j = hVar;
        this.f72413k = uri;
        this.f72414l = iVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new f(this.f72412j, this.f72413k, this.f72414l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f72411i;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            this.f72411i = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            this.f72412j.f72418b.registerSource(this.f72413k, this.f72414l.getInputEvent(), new ga(2), t.asOutcomeReceiver(cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            if (result == av.e.getCOROUTINE_SUSPENDED()) {
                bv.h.probeCoroutineSuspended(this);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
        }
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((f) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
