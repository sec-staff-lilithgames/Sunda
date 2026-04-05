package sh;

import com.fyber.inneractive.sdk.player.exoplayer2.text.Ir.NyKZx;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class y1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public Runnable f85884b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1 f85885c;

    public y1(z1 z1Var) {
        this.f85885c = z1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        r10.f85884b.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0052, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        sh.z1.f85895h.a().log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r10.f85884b, (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
    
        r10.f85884b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0074, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            sh.z1 r2 = r10.f85885c     // Catch: java.lang.Throwable -> L4e
            java.util.ArrayDeque r2 = r2.f85897c     // Catch: java.lang.Throwable -> L4e
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L4e
            r3 = 1
            if (r0 != 0) goto L28
            sh.z1 r0 = r10.f85885c     // Catch: java.lang.Throwable -> L1c
            int r4 = r0.f85898e     // Catch: java.lang.Throwable -> L1c
            r5 = 4
            if (r4 != r5) goto L1e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L3e
        L14:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L3e
        L1c:
            r0 = move-exception
            goto L75
        L1e:
            long r6 = r0.f85899f     // Catch: java.lang.Throwable -> L1c
            r8 = 1
            long r6 = r6 + r8
            r0.f85899f = r6     // Catch: java.lang.Throwable -> L1c
            r0.f85898e = r5     // Catch: java.lang.Throwable -> L1c
            r0 = r3
        L28:
            sh.z1 r4 = r10.f85885c     // Catch: java.lang.Throwable -> L1c
            java.util.ArrayDeque r4 = r4.f85897c     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L1c
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L1c
            r10.f85884b = r4     // Catch: java.lang.Throwable -> L1c
            if (r4 != 0) goto L3f
            sh.z1 r0 = r10.f85885c     // Catch: java.lang.Throwable -> L1c
            r0.f85898e = r3     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L3e
            goto L14
        L3e:
            return
        L3f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L4e
            r1 = r1 | r2
            r2 = 0
            java.lang.Runnable r3 = r10.f85884b     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            r3.run()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
        L4b:
            r10.f85884b = r2     // Catch: java.lang.Throwable -> L4e
            goto L2
        L4e:
            r0 = move-exception
            goto L77
        L50:
            r0 = move-exception
            goto L72
        L52:
            r3 = move-exception
            sh.m1 r4 = sh.z1.f85895h     // Catch: java.lang.Throwable -> L50
            java.util.logging.Logger r4 = r4.a()     // Catch: java.lang.Throwable -> L50
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r6.<init>()     // Catch: java.lang.Throwable -> L50
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L50
            java.lang.Runnable r7 = r10.f85884b     // Catch: java.lang.Throwable -> L50
            r6.append(r7)     // Catch: java.lang.Throwable -> L50
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L50
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L50
            goto L4b
        L72:
            r10.f85884b = r2     // Catch: java.lang.Throwable -> L4e
            throw r0     // Catch: java.lang.Throwable -> L4e
        L75:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r0     // Catch: java.lang.Throwable -> L4e
        L77:
            if (r1 == 0) goto L80
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L80:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sh.y1.a():void");
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            a();
        } catch (Error e10) {
            synchronized (this.f85885c.f85897c) {
                this.f85885c.f85898e = 1;
                throw e10;
            }
        }
    }

    public String toString() {
        Runnable runnable = this.f85884b;
        if (runnable != null) {
            return "SequentialExecutorWorker{running=" + runnable + "}";
        }
        StringBuilder sb2 = new StringBuilder(NyKZx.HtJPtmv);
        int i10 = this.f85885c.f85898e;
        sb2.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? AbstractJsonLexerKt.NULL : DebugCoroutineInfoImplKt.RUNNING : "QUEUED" : "QUEUING" : "IDLE");
        sb2.append("}");
        return sb2.toString();
    }
}
