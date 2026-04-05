package kotlinx.coroutines.channels;

import bv.n;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.JobSupport;
import kv.l;
import kv.p;
import tu.x0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class BroadcastKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", f = "Broadcast.kt", i = {0, 1}, l = {26, 27}, m = "invokeSuspend", n = {"$this$broadcast", "$this$broadcast"}, s = {"L$0", "L$0"})
    /* renamed from: kotlinx.coroutines.channels.BroadcastKt$broadcast$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ ReceiveChannel<E> $channel;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(ReceiveChannel<? extends E> receiveChannel, zu.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$channel = receiveChannel;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$channel, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
        
            if (r4.send(r7, r6) == r0) goto L20;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0062 -> B:7:0x0019). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2f
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r6.L$1
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r4 = r6.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                tu.a0.throwOnFailure(r7)
            L19:
                r7 = r4
                goto L3c
            L1b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L23:
                java.lang.Object r1 = r6.L$1
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r4 = r6.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                tu.a0.throwOnFailure(r7)
                goto L4c
            L2f:
                tu.a0.throwOnFailure(r7)
                java.lang.Object r7 = r6.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r6.$channel
                kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            L3c:
                r6.L$0 = r7
                r6.L$1 = r1
                r6.label = r3
                java.lang.Object r4 = r1.hasNext(r6)
                if (r4 != r0) goto L49
                goto L64
            L49:
                r5 = r4
                r4 = r7
                r7 = r5
            L4c:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L65
                java.lang.Object r7 = r1.next()
                r6.L$0 = r4
                r6.L$1 = r1
                r6.label = r2
                java.lang.Object r7 = r4.send(r7, r6)
                if (r7 != r0) goto L19
            L64:
                return r0
            L65:
                tu.x0 r7 = tu.x0.f87415a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BroadcastKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(ProducerScope<? super E> producerScope, zu.d<? super x0> dVar) {
            return ((AnonymousClass2) create(producerScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    @tu.f
    public static final <E> BroadcastChannel<E> broadcast(ReceiveChannel<? extends E> receiveChannel, int i10, CoroutineStart coroutineStart) {
        return broadcast$default(CoroutineScopeKt.plus(CoroutineScopeKt.plus(GlobalScope.INSTANCE, Dispatchers.getUnconfined()), new BroadcastKt$broadcast$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key)), null, i10, coroutineStart, new d(receiveChannel, 1), new AnonymousClass2(receiveChannel, null), 1, null);
    }

    public static /* synthetic */ BroadcastChannel broadcast$default(ReceiveChannel receiveChannel, int i10, CoroutineStart coroutineStart, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        if ((i11 & 2) != 0) {
            coroutineStart = CoroutineStart.LAZY;
        }
        return broadcast(receiveChannel, i10, coroutineStart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 broadcast$lambda$1(ReceiveChannel receiveChannel, Throwable th2) {
        ChannelsKt.cancelConsumed(receiveChannel, th2);
        return x0.f87415a;
    }

    public static /* synthetic */ BroadcastChannel broadcast$default(CoroutineScope coroutineScope, m mVar, int i10, CoroutineStart coroutineStart, l lVar, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            mVar = zu.n.f98854b;
        }
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        if ((i11 & 4) != 0) {
            coroutineStart = CoroutineStart.LAZY;
        }
        if ((i11 & 8) != 0) {
            lVar = null;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        return broadcast(coroutineScope, mVar, i10, coroutineStart2, lVar, pVar);
    }

    @tu.f
    public static final <E> BroadcastChannel<E> broadcast(CoroutineScope coroutineScope, m mVar, int i10, CoroutineStart coroutineStart, l lVar, p pVar) {
        BroadcastCoroutine broadcastCoroutine;
        m mVarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(coroutineScope, mVar);
        BroadcastChannel BroadcastChannel = BroadcastChannelKt.BroadcastChannel(i10);
        if (coroutineStart.isLazy()) {
            broadcastCoroutine = new LazyBroadcastCoroutine(mVarNewCoroutineContext, BroadcastChannel, pVar);
        } else {
            broadcastCoroutine = new BroadcastCoroutine(mVarNewCoroutineContext, BroadcastChannel, true);
        }
        if (lVar != null) {
            ((JobSupport) broadcastCoroutine).invokeOnCompletion(lVar);
        }
        ((AbstractCoroutine) broadcastCoroutine).start(coroutineStart, broadcastCoroutine, pVar);
        return (BroadcastChannel<E>) broadcastCoroutine;
    }
}
