package iu;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import mt.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class z {
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(long r8, tw.c r10, java.util.Queue r11, java.util.concurrent.atomic.AtomicLong r12, st.e r13) {
        /*
            r0 = -9223372036854775808
            long r2 = r8 & r0
        L4:
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            r5 = 1
            if (r4 == 0) goto L2a
            r4 = r13
            yt.z r4 = (yt.z) r4     // Catch: java.lang.Throwable -> L11
            boolean r4 = r4.getAsBoolean()     // Catch: java.lang.Throwable -> L11
            goto L16
        L11:
            r4 = move-exception
            qt.d.throwIfFatal(r4)
            r4 = r5
        L16:
            if (r4 == 0) goto L19
            goto L39
        L19:
            java.lang.Object r4 = r11.poll()
            if (r4 != 0) goto L23
            r10.onComplete()
            return r5
        L23:
            r10.onNext(r4)
            r4 = 1
            long r2 = r2 + r4
            goto L4
        L2a:
            r8 = r13
            yt.z r8 = (yt.z) r8     // Catch: java.lang.Throwable -> L32
            boolean r8 = r8.getAsBoolean()     // Catch: java.lang.Throwable -> L32
            goto L37
        L32:
            r8 = move-exception
            qt.d.throwIfFatal(r8)
            r8 = r5
        L37:
            if (r8 == 0) goto L3a
        L39:
            return r5
        L3a:
            boolean r8 = r11.isEmpty()
            if (r8 == 0) goto L44
            r10.onComplete()
            return r5
        L44:
            long r8 = r12.get()
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 != 0) goto L4
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r2 = r2 & r8
            long r2 = -r2
            long r2 = r12.addAndGet(r2)
            long r8 = r8 & r2
            r4 = 0
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 != 0) goto L60
            r8 = 0
            return r8
        L60:
            long r8 = r2 & r0
            r6 = r2
            r2 = r8
            r8 = r6
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: iu.z.a(long, tw.c, java.util.Queue, java.util.concurrent.atomic.AtomicLong, st.e):boolean");
    }

    public static <T, U> boolean checkTerminated(boolean z10, boolean z11, tw.c cVar, boolean z12, vt.o oVar, y yVar) {
        if (yVar.cancelled()) {
            oVar.clear();
            return true;
        }
        if (!z10) {
            return false;
        }
        if (z12) {
            if (!z11) {
                return false;
            }
            Throwable thError = yVar.error();
            if (thError != null) {
                cVar.onError(thError);
            } else {
                cVar.onComplete();
            }
            return true;
        }
        Throwable thError2 = yVar.error();
        if (thError2 != null) {
            oVar.clear();
            cVar.onError(thError2);
            return true;
        }
        if (!z11) {
            return false;
        }
        cVar.onComplete();
        return true;
    }

    public static <T> vt.o createQueue(int i10) {
        return i10 < 0 ? new eu.d(-i10) : new eu.c(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        r1 = r8.leave(-r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r1 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T, U> void drainLoop(vt.n r9, mt.i0 r10, boolean r11, pt.c r12, iu.v r13) {
        /*
            r0 = 1
            r1 = r0
        L2:
            boolean r2 = r13.done()
            boolean r3 = r9.isEmpty()
            r6 = r9
            r4 = r10
            r5 = r11
            r7 = r12
            r8 = r13
            boolean r9 = checkTerminated(r2, r3, r4, r5, r6, r7, r8)
            if (r9 == 0) goto L16
            goto L35
        L16:
            boolean r2 = r8.done()
            java.lang.Object r9 = r6.poll()
            if (r9 != 0) goto L22
            r3 = r0
            goto L24
        L22:
            r10 = 0
            r3 = r10
        L24:
            boolean r10 = checkTerminated(r2, r3, r4, r5, r6, r7, r8)
            r11 = r3
            if (r10 == 0) goto L2c
            goto L35
        L2c:
            if (r11 == 0) goto L3c
            int r9 = -r1
            int r1 = r8.leave(r9)
            if (r1 != 0) goto L36
        L35:
            return
        L36:
            r10 = r4
            r11 = r5
            r9 = r6
            r12 = r7
            r13 = r8
            goto L2
        L3c:
            r8.accept(r4, r9)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: iu.z.drainLoop(vt.n, mt.i0, boolean, pt.c, iu.v):void");
    }

    public static <T, U> void drainMaxLoop(vt.n nVar, tw.c cVar, boolean z10, pt.c cVar2, y yVar) {
        int iLeave = 1;
        while (true) {
            boolean zDone = yVar.done();
            Object objPoll = nVar.poll();
            boolean z11 = objPoll == null;
            vt.n nVar2 = nVar;
            tw.c cVar3 = cVar;
            boolean z12 = z10;
            y yVar2 = yVar;
            if (checkTerminated(zDone, z11, cVar3, z12, nVar2, yVar2)) {
                if (cVar2 != null) {
                    cVar2.dispose();
                    return;
                }
                return;
            }
            if (z11) {
                iLeave = yVar2.leave(-iLeave);
                if (iLeave == 0) {
                    return;
                }
            } else {
                long jRequested = yVar2.requested();
                if (jRequested == 0) {
                    nVar2.clear();
                    if (cVar2 != null) {
                        cVar2.dispose();
                    }
                    cVar3.onError(new qt.e("Could not emit value due to lack of requests."));
                    return;
                }
                if (yVar2.accept(cVar3, objPoll) && jRequested != Long.MAX_VALUE) {
                    yVar2.produced(1L);
                }
            }
            cVar = cVar3;
            z10 = z12;
            nVar = nVar2;
            yVar = yVar2;
        }
    }

    public static <T> void postComplete(tw.c cVar, Queue<T> queue, AtomicLong atomicLong, st.e eVar) {
        long j10;
        long j11;
        if (queue.isEmpty()) {
            cVar.onComplete();
            return;
        }
        if (a(atomicLong.get(), cVar, queue, atomicLong, eVar)) {
            return;
        }
        do {
            j10 = atomicLong.get();
            if ((j10 & Long.MIN_VALUE) != 0) {
                return;
            } else {
                j11 = j10 | Long.MIN_VALUE;
            }
        } while (!atomicLong.compareAndSet(j10, j11));
        if (j10 != 0) {
            a(j11, cVar, queue, atomicLong, eVar);
        }
    }

    public static <T> boolean postCompleteRequest(long j10, tw.c cVar, Queue<T> queue, AtomicLong atomicLong, st.e eVar) {
        long j11;
        do {
            j11 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j11, e.addCap(Long.MAX_VALUE & j11, j10) | (j11 & Long.MIN_VALUE)));
        if (j11 != Long.MIN_VALUE) {
            return false;
        }
        a(j10 | Long.MIN_VALUE, cVar, queue, atomicLong, eVar);
        return true;
    }

    public static void request(tw.d dVar, int i10) {
        dVar.request(i10 < 0 ? Long.MAX_VALUE : i10);
    }

    public static <T, U> boolean checkTerminated(boolean z10, boolean z11, i0 i0Var, boolean z12, vt.o oVar, pt.c cVar, v vVar) {
        if (vVar.cancelled()) {
            oVar.clear();
            cVar.dispose();
            return true;
        }
        if (!z10) {
            return false;
        }
        if (z12) {
            if (!z11) {
                return false;
            }
            if (cVar != null) {
                cVar.dispose();
            }
            Throwable thError = vVar.error();
            if (thError != null) {
                i0Var.onError(thError);
            } else {
                i0Var.onComplete();
            }
            return true;
        }
        Throwable thError2 = vVar.error();
        if (thError2 != null) {
            oVar.clear();
            if (cVar != null) {
                cVar.dispose();
            }
            i0Var.onError(thError2);
            return true;
        }
        if (!z11) {
            return false;
        }
        if (cVar != null) {
            cVar.dispose();
        }
        i0Var.onComplete();
        return true;
    }
}
