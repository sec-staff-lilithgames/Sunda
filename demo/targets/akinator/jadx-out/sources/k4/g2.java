package k4;

import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class g2 {

    /* renamed from: a, reason: collision with root package name */
    public final Mutex f70347a = MutexKt.Mutex$default(false, 1, null);

    /* renamed from: b, reason: collision with root package name */
    public final CompletableDeferred f70348b = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);

    public abstract Object a(bv.d dVar);

    public final Object awaitComplete(zu.d<? super tu.x0> dVar) {
        Object objAwait = this.f70348b.await(dVar);
        return objAwait == av.e.getCOROUTINE_SUSPENDED() ? objAwait : tu.x0.f87415a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runIfNeeded(zu.d<? super tu.x0> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof k4.f2
            if (r0 == 0) goto L13
            r0 = r8
            k4.f2 r0 = (k4.f2) r0
            int r1 = r0.f70333m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f70333m = r1
            goto L18
        L13:
            k4.f2 r0 = new k4.f2
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f70331k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f70333m
            r3 = 2
            r4 = 1
            tu.x0 r5 = tu.x0.f87415a
            r6 = 0
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            kotlinx.coroutines.sync.Mutex r1 = r0.f70330j
            k4.g2 r0 = r0.f70329i
            tu.a0.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L33
            goto L7d
        L33:
            r8 = move-exception
            goto L89
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3d:
            kotlinx.coroutines.sync.Mutex r2 = r0.f70330j
            k4.g2 r4 = r0.f70329i
            tu.a0.throwOnFailure(r8)
            r8 = r2
            goto L62
        L46:
            tu.a0.throwOnFailure(r8)
            kotlinx.coroutines.CompletableDeferred r8 = r7.f70348b
            boolean r8 = r8.isCompleted()
            if (r8 == 0) goto L52
            return r5
        L52:
            r0.f70329i = r7
            kotlinx.coroutines.sync.Mutex r8 = r7.f70347a
            r0.f70330j = r8
            r0.f70333m = r4
            java.lang.Object r2 = r8.lock(r6, r0)
            if (r2 != r1) goto L61
            goto L7a
        L61:
            r4 = r7
        L62:
            kotlinx.coroutines.CompletableDeferred r2 = r4.f70348b     // Catch: java.lang.Throwable -> L86
            boolean r2 = r2.isCompleted()     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L6e
            r8.unlock(r6)
            return r5
        L6e:
            r0.f70329i = r4     // Catch: java.lang.Throwable -> L86
            r0.f70330j = r8     // Catch: java.lang.Throwable -> L86
            r0.f70333m = r3     // Catch: java.lang.Throwable -> L86
            java.lang.Object r0 = r4.a(r0)     // Catch: java.lang.Throwable -> L86
            if (r0 != r1) goto L7b
        L7a:
            return r1
        L7b:
            r1 = r8
            r0 = r4
        L7d:
            kotlinx.coroutines.CompletableDeferred r8 = r0.f70348b     // Catch: java.lang.Throwable -> L33
            r8.complete(r5)     // Catch: java.lang.Throwable -> L33
            r1.unlock(r6)
            return r5
        L86:
            r0 = move-exception
            r1 = r8
            r8 = r0
        L89:
            r1.unlock(r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.g2.runIfNeeded(zu.d):java.lang.Object");
    }
}
