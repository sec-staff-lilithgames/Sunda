package kotlinx.coroutines;

import kv.p;
import zu.m;
import zu.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class BuildersKt__BuildersKt {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T runBlocking(zu.m r4, kv.p r5) throws java.lang.InterruptedException {
        /*
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            zu.f r1 = zu.f.f98853b
            zu.k r1 = r4.get(r1)
            zu.g r1 = (zu.g) r1
            if (r1 != 0) goto L1f
            kotlinx.coroutines.ThreadLocalEventLoop r1 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r1 = r1.getEventLoop$kotlinx_coroutines_core()
            kotlinx.coroutines.GlobalScope r2 = kotlinx.coroutines.GlobalScope.INSTANCE
            zu.m r4 = r4.plus(r1)
            zu.m r4 = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(r2, r4)
            goto L42
        L1f:
            boolean r2 = r1 instanceof kotlinx.coroutines.EventLoop
            r3 = 0
            if (r2 == 0) goto L27
            kotlinx.coroutines.EventLoop r1 = (kotlinx.coroutines.EventLoop) r1
            goto L28
        L27:
            r1 = r3
        L28:
            if (r1 == 0) goto L36
            boolean r2 = r1.shouldBeProcessedFromContext()
            if (r2 == 0) goto L31
            r3 = r1
        L31:
            if (r3 != 0) goto L34
            goto L36
        L34:
            r1 = r3
            goto L3c
        L36:
            kotlinx.coroutines.ThreadLocalEventLoop r1 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r1 = r1.currentOrNull$kotlinx_coroutines_core()
        L3c:
            kotlinx.coroutines.GlobalScope r2 = kotlinx.coroutines.GlobalScope.INSTANCE
            zu.m r4 = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(r2, r4)
        L42:
            kotlinx.coroutines.BlockingCoroutine r2 = new kotlinx.coroutines.BlockingCoroutine
            r2.<init>(r4, r0, r1)
            kotlinx.coroutines.CoroutineStart r4 = kotlinx.coroutines.CoroutineStart.DEFAULT
            r2.start(r4, r2, r5)
            java.lang.Object r4 = r2.joinBlocking()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking(zu.m, kv.p):java.lang.Object");
    }

    public static /* synthetic */ Object runBlocking$default(m mVar, p pVar, int i10, Object obj) throws InterruptedException {
        if ((i10 & 1) != 0) {
            mVar = n.f98854b;
        }
        return BuildersKt.runBlocking(mVar, pVar);
    }
}
