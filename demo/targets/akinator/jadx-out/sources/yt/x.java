package yt;

import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class x {
    public static <T> void subscribe(tw.b bVar, tw.c cVar) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        gu.f fVar = new gu.f(linkedBlockingQueue);
        bVar.subscribe(fVar);
        while (!fVar.isCancelled()) {
            try {
                Object objPoll = linkedBlockingQueue.poll();
                if (objPoll == null) {
                    if (fVar.isCancelled()) {
                        return;
                    }
                    iu.f.verifyNonBlocking();
                    objPoll = linkedBlockingQueue.take();
                }
                if (fVar.isCancelled() || objPoll == gu.f.f58425c || iu.u.acceptFull(objPoll, cVar)) {
                    return;
                }
            } catch (InterruptedException e10) {
                fVar.cancel();
                cVar.onError(e10);
                return;
            }
        }
    }

    public static <T> void subscribe(tw.b bVar) {
        iu.g gVar = new iu.g();
        gu.m mVar = new gu.m(ut.m0.emptyConsumer(), gVar, gVar, ut.m0.f88688k);
        bVar.subscribe(mVar);
        iu.f.awaitForComplete(gVar, mVar);
        Throwable th2 = gVar.f68407b;
        if (th2 != null) {
            throw iu.m.wrapOrThrow(th2);
        }
    }

    public static <T> void subscribe(tw.b bVar, st.g gVar, st.g gVar2, st.a aVar) {
        ut.o0.requireNonNull(gVar, "onNext is null");
        ut.o0.requireNonNull(gVar2, "onError is null");
        ut.o0.requireNonNull(aVar, "onComplete is null");
        subscribe(bVar, new gu.m(gVar, gVar2, aVar, ut.m0.f88688k));
    }

    public static <T> void subscribe(tw.b bVar, st.g gVar, st.g gVar2, st.a aVar, int i10) {
        ut.o0.requireNonNull(gVar, "onNext is null");
        ut.o0.requireNonNull(gVar2, "onError is null");
        ut.o0.requireNonNull(aVar, "onComplete is null");
        ut.o0.verifyPositive(i10, "number > 0 required");
        subscribe(bVar, new gu.g(gVar, gVar2, aVar, ut.m0.boundedConsumer(i10), i10));
    }
}
