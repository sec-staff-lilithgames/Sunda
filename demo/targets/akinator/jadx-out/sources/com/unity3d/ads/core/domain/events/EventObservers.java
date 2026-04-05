package com.unity3d.ads.core.domain.events;

import bv.d;
import bv.f;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class EventObservers {
    private final DiagnosticEventObserver diagnosticEventObserver;
    private final OperativeEventObserver operativeEventObserver;
    private final TransactionEventObserver transactionEventObserver;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.events.EventObservers", f = "EventObservers.kt", i = {0, 1}, l = {16, 17, 18}, m = "invoke", n = {"this", "this"}, s = {"L$0", "L$0"})
    /* renamed from: com.unity3d.ads.core.domain.events.EventObservers$invoke$1, reason: invalid class name */
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
            return EventObservers.this.invoke(this);
        }
    }

    public EventObservers(OperativeEventObserver operativeEventObserver, DiagnosticEventObserver diagnosticEventObserver, TransactionEventObserver transactionEventObserver) {
        e0.checkNotNullParameter(operativeEventObserver, "operativeEventObserver");
        e0.checkNotNullParameter(diagnosticEventObserver, "diagnosticEventObserver");
        e0.checkNotNullParameter(transactionEventObserver, "transactionEventObserver");
        this.operativeEventObserver = operativeEventObserver;
        this.diagnosticEventObserver = diagnosticEventObserver;
        this.transactionEventObserver = transactionEventObserver;
    }

    public final DiagnosticEventObserver getDiagnosticEventObserver() {
        return this.diagnosticEventObserver;
    }

    public final OperativeEventObserver getOperativeEventObserver() {
        return this.operativeEventObserver;
    }

    public final TransactionEventObserver getTransactionEventObserver() {
        return this.transactionEventObserver;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r7.invoke(r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(zu.d<? super tu.x0> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.domain.events.EventObservers.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.domain.events.EventObservers$invoke$1 r0 = (com.unity3d.ads.core.domain.events.EventObservers.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.events.EventObservers$invoke$1 r0 = new com.unity3d.ads.core.domain.events.EventObservers$invoke$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            tu.a0.throwOnFailure(r7)
            goto L73
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.events.EventObservers r2 = (com.unity3d.ads.core.domain.events.EventObservers) r2
            tu.a0.throwOnFailure(r7)
            goto L65
        L3f:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.events.EventObservers r2 = (com.unity3d.ads.core.domain.events.EventObservers) r2
            tu.a0.throwOnFailure(r7)
            goto L58
        L47:
            tu.a0.throwOnFailure(r7)
            com.unity3d.ads.core.domain.events.OperativeEventObserver r7 = r6.operativeEventObserver
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 != r1) goto L57
            goto L72
        L57:
            r2 = r6
        L58:
            com.unity3d.ads.core.domain.events.DiagnosticEventObserver r7 = r2.diagnosticEventObserver
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 != r1) goto L65
            goto L72
        L65:
            com.unity3d.ads.core.domain.events.TransactionEventObserver r7 = r2.transactionEventObserver
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 != r1) goto L73
        L72:
            return r1
        L73:
            tu.x0 r7 = tu.x0.f87415a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.EventObservers.invoke(zu.d):java.lang.Object");
    }
}
