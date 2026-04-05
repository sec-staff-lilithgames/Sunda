package o9;

import java.net.UnknownHostException;
import java.util.concurrent.TimeoutException;
import kotlinx.coroutines.CoroutineScope;
import lb.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class o5 extends bv.n implements kv.p {
    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new o5(2, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) throws TimeoutException, UnknownHostException {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        e.i iVar = new e.i();
        lb.e currentSession = ca.o.sharedInstance().getCurrentSession();
        kotlin.jvm.internal.e0.checkNotNull(currentSession);
        int iCancelAnswer = currentSession.cancelAnswer(iVar);
        if (iCancelAnswer == 0) {
            return iVar;
        }
        if (iCancelAnswer == 600) {
            throw new TimeoutException();
        }
        if (iCancelAnswer == 610 || iCancelAnswer == -1) {
            throw new UnknownHostException();
        }
        throw new UnknownError(lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"));
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super e.i> dVar) {
        return ((o5) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
