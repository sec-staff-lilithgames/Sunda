package io.ktor.utils.io.internal;

import bv.d;
import bv.f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletableJob;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class AwaitingSlot {
    private static final /* synthetic */ AtomicReferenceFieldUpdater suspension$FU = AtomicReferenceFieldUpdater.newUpdater(AwaitingSlot.class, Object.class, "suspension");
    private volatile /* synthetic */ Object suspension = null;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.internal.AwaitingSlot", f = "AwaitingSlot.kt", i = {0}, l = {24}, m = "sleep", n = {"this"}, s = {"L$0"})
    /* renamed from: io.ktor.utils.io.internal.AwaitingSlot$sleep$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AwaitingSlot.this.sleep(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.internal.AwaitingSlot", f = "AwaitingSlot.kt", i = {0}, l = {57}, m = "trySuspend", n = {"suspended"}, s = {"I$0"})
    /* renamed from: io.ktor.utils.io.internal.AwaitingSlot$trySuspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40951 extends d {
        int I$0;
        int label;
        /* synthetic */ Object result;

        public C40951(zu.d<? super C40951> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AwaitingSlot.this.trySuspend(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object trySuspend(kv.a r8, zu.d<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof io.ktor.utils.io.internal.AwaitingSlot.C40951
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.internal.AwaitingSlot$trySuspend$1 r0 = (io.ktor.utils.io.internal.AwaitingSlot.C40951) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.internal.AwaitingSlot$trySuspend$1 r0 = new io.ktor.utils.io.internal.AwaitingSlot$trySuspend$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            int r8 = r0.I$0
            tu.a0.throwOnFailure(r9)
            goto L64
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            tu.a0.throwOnFailure(r9)
            r9 = 0
            kotlinx.coroutines.CompletableJob r2 = kotlinx.coroutines.JobKt.Job$default(r9, r4, r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = io.ktor.utils.io.internal.AwaitingSlot.suspension$FU
        L3e:
            boolean r6 = r5.compareAndSet(r7, r9, r2)
            if (r6 == 0) goto L5d
            java.lang.Object r8 = r8.invoke()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L63
            r0.I$0 = r4
            r0.label = r4
            java.lang.Object r8 = r2.join(r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            r8 = r4
            goto L64
        L5d:
            java.lang.Object r6 = r5.get(r7)
            if (r6 == 0) goto L3e
        L63:
            r8 = r3
        L64:
            if (r8 == 0) goto L67
            r3 = r4
        L67:
            java.lang.Boolean r8 = bv.b.boxBoolean(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.internal.AwaitingSlot.trySuspend(kv.a, zu.d):java.lang.Object");
    }

    public final void cancel(Throwable th2) {
        CompletableJob completableJob = (CompletableJob) suspension$FU.getAndSet(this, null);
        if (completableJob == null) {
            return;
        }
        if (th2 != null) {
            completableJob.completeExceptionally(th2);
        } else {
            completableJob.complete();
        }
    }

    public final void resume() {
        CompletableJob completableJob = (CompletableJob) suspension$FU.getAndSet(this, null);
        if (completableJob != null) {
            completableJob.complete();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sleep(kv.a r5, zu.d<? super tu.x0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.internal.AwaitingSlot.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.internal.AwaitingSlot$sleep$1 r0 = (io.ktor.utils.io.internal.AwaitingSlot.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.internal.AwaitingSlot$sleep$1 r0 = new io.ktor.utils.io.internal.AwaitingSlot$sleep$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            io.ktor.utils.io.internal.AwaitingSlot r5 = (io.ktor.utils.io.internal.AwaitingSlot) r5
            tu.a0.throwOnFailure(r6)
            goto L44
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            tu.a0.throwOnFailure(r6)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r4.trySuspend(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            r5 = r4
        L44:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            tu.x0 r0 = tu.x0.f87415a
            if (r6 == 0) goto L4f
            return r0
        L4f:
            r5.resume()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.internal.AwaitingSlot.sleep(kv.a, zu.d):java.lang.Object");
    }
}
