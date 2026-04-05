package bu;

import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class x {
    public static <T> void subscribe(mt.g0 g0Var, mt.i0 i0Var) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        wt.i iVar = new wt.i(linkedBlockingQueue);
        i0Var.onSubscribe(iVar);
        g0Var.subscribe(iVar);
        while (!iVar.isDisposed()) {
            Object objPoll = linkedBlockingQueue.poll();
            if (objPoll == null) {
                try {
                    objPoll = linkedBlockingQueue.take();
                } catch (InterruptedException e10) {
                    iVar.dispose();
                    i0Var.onError(e10);
                    return;
                }
            }
            if (iVar.isDisposed() || objPoll == wt.i.f91253c || iu.u.acceptFull(objPoll, i0Var)) {
                return;
            }
        }
    }

    public static <T> void subscribe(mt.g0 g0Var) {
        iu.g gVar = new iu.g();
        wt.t tVar = new wt.t(ut.m0.emptyConsumer(), gVar, gVar, ut.m0.emptyConsumer());
        g0Var.subscribe(tVar);
        iu.f.awaitForComplete(gVar, tVar);
        Throwable th2 = gVar.f68407b;
        if (th2 != null) {
            throw iu.m.wrapOrThrow(th2);
        }
    }

    public static <T> void subscribe(mt.g0 g0Var, st.g gVar, st.g gVar2, st.a aVar) {
        ut.o0.requireNonNull(gVar, "onNext is null");
        ut.o0.requireNonNull(gVar2, "onError is null");
        ut.o0.requireNonNull(aVar, "onComplete is null");
        subscribe(g0Var, new wt.t(gVar, gVar2, aVar, ut.m0.emptyConsumer()));
    }
}
