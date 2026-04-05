package kotlinx.coroutines.channels;

import com.vungle.ads.internal.protos.Sdk;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kv.l;
import kv.p;
import zu.m;
import zu.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ProduceKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", i = {0, 0}, l = {Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE}, m = "awaitClose", n = {"$this$awaitClose", "block"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.channels.ProduceKt$awaitClose$1, reason: invalid class name */
    public static final class AnonymousClass1 extends bv.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProduceKt.awaitClose(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitClose(kotlinx.coroutines.channels.ProducerScope<?> r4, kv.a r5, zu.d<? super tu.x0> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ProduceKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = (kotlinx.coroutines.channels.ProduceKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.L$1
            r5 = r4
            kv.a r5 = (kv.a) r5
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
            tu.a0.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L32
            goto L75
        L32:
            r4 = move-exception
            goto L7b
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            tu.a0.throwOnFailure(r6)
            zu.m r6 = r0.getContext()
            kotlinx.coroutines.Job$Key r2 = kotlinx.coroutines.Job.Key
            zu.k r6 = r6.get(r2)
            if (r6 != r4) goto L7f
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L32
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L32
            r0.label = r3     // Catch: java.lang.Throwable -> L32
            kotlinx.coroutines.CancellableContinuationImpl r6 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: java.lang.Throwable -> L32
            zu.d r2 = av.b.intercepted(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.initCancellability()     // Catch: java.lang.Throwable -> L32
            kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1 r2 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1     // Catch: java.lang.Throwable -> L32
            r2.<init>()     // Catch: java.lang.Throwable -> L32
            r4.invokeOnClose(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.getResult()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = av.e.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L72
            bv.h.probeCoroutineSuspended(r0)     // Catch: java.lang.Throwable -> L32
        L72:
            if (r4 != r1) goto L75
            return r1
        L75:
            r5.invoke()
            tu.x0 r4 = tu.x0.f87415a
            return r4
        L7b:
            r5.invoke()
            throw r4
        L7f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ProduceKt.awaitClose(kotlinx.coroutines.channels.ProducerScope, kv.a, zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object awaitClose$default(ProducerScope producerScope, kv.a aVar, zu.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = new f();
        }
        return awaitClose(producerScope, aVar, dVar);
    }

    public static final <E> ReceiveChannel<E> produce(CoroutineScope coroutineScope, m mVar, int i10, p pVar) {
        return produce(coroutineScope, mVar, i10, BufferOverflow.SUSPEND, CoroutineStart.DEFAULT, null, pVar);
    }

    public static /* synthetic */ ReceiveChannel produce$default(CoroutineScope coroutineScope, m mVar, int i10, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            mVar = n.f98854b;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return produce(coroutineScope, mVar, i10, pVar);
    }

    public static final <E> ReceiveChannel<E> produce(CoroutineScope coroutineScope, m mVar, int i10, CoroutineStart coroutineStart, l lVar, p pVar) {
        return produce(coroutineScope, mVar, i10, BufferOverflow.SUSPEND, coroutineStart, lVar, pVar);
    }

    public static final <E> ReceiveChannel<E> produce(CoroutineScope coroutineScope, m mVar, int i10, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, l lVar, p pVar) {
        ProducerCoroutine producerCoroutine = new ProducerCoroutine(CoroutineContextKt.newCoroutineContext(coroutineScope, mVar), ChannelKt.Channel$default(i10, bufferOverflow, null, 4, null));
        if (lVar != null) {
            producerCoroutine.invokeOnCompletion(lVar);
        }
        producerCoroutine.start(coroutineStart, producerCoroutine, pVar);
        return producerCoroutine;
    }

    public static /* synthetic */ ReceiveChannel produce$default(CoroutineScope coroutineScope, m mVar, int i10, CoroutineStart coroutineStart, l lVar, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            mVar = n.f98854b;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        if ((i11 & 8) != 0) {
            lVar = null;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        return produce(coroutineScope, mVar, i10, coroutineStart2, lVar, pVar);
    }

    public static /* synthetic */ ReceiveChannel produce$default(CoroutineScope coroutineScope, m mVar, int i10, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, l lVar, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            mVar = n.f98854b;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i11 & 8) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        if ((i11 & 16) != 0) {
            lVar = null;
        }
        l lVar2 = lVar;
        return produce(coroutineScope, mVar, i10, bufferOverflow, coroutineStart, lVar2, pVar);
    }
}
