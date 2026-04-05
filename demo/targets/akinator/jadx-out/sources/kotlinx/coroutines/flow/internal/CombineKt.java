package kotlinx.coroutines.flow.internal;

import av.e;
import bv.f;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kv.a;
import kv.p;
import kv.q;
import tu.a0;
import tu.x0;
import uu.g1;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class CombineKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {51, TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ a $arrayFactory;
        final /* synthetic */ Flow<T>[] $flows;
        final /* synthetic */ FlowCollector<R> $this_combineInternal;
        final /* synthetic */ q $transform;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements p {
            final /* synthetic */ Flow<T>[] $flows;
            final /* synthetic */ int $i;
            final /* synthetic */ AtomicInteger $nonClosed;
            final /* synthetic */ Channel<g1> $resultChannel;
            int label;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C07351<T> implements FlowCollector {
                final /* synthetic */ int $i;
                final /* synthetic */ Channel<g1> $resultChannel;

                public C07351(Channel<g1> channel, int i10) {
                    this.$resultChannel = channel;
                    this.$i = i10;
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
                
                    if (kotlinx.coroutines.YieldKt.yield(r0) == r1) goto L21;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r7, zu.d<? super tu.x0> r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                        if (r0 == 0) goto L13
                        r0 = r8
                        kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                        r0.<init>(r6, r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        tu.a0.throwOnFailure(r8)
                        goto L56
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        tu.a0.throwOnFailure(r8)
                        goto L4d
                    L38:
                        tu.a0.throwOnFailure(r8)
                        kotlinx.coroutines.channels.Channel<uu.g1> r8 = r6.$resultChannel
                        uu.g1 r2 = new uu.g1
                        int r5 = r6.$i
                        r2.<init>(r5, r7)
                        r0.label = r4
                        java.lang.Object r7 = r8.send(r2, r0)
                        if (r7 != r1) goto L4d
                        goto L55
                    L4d:
                        r0.label = r3
                        java.lang.Object r7 = kotlinx.coroutines.YieldKt.yield(r0)
                        if (r7 != r1) goto L56
                    L55:
                        return r1
                    L56:
                        tu.x0 r7 = tu.x0.f87415a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt.AnonymousClass2.AnonymousClass1.C07351.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Flow<? extends T>[] flowArr, int i10, AtomicInteger atomicInteger, Channel<g1> channel, d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.$flows = flowArr;
                this.$i = i10;
                this.$nonClosed = atomicInteger;
                this.$resultChannel = channel;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                return new AnonymousClass1(this.$flows, this.$i, this.$nonClosed, this.$resultChannel, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                AtomicInteger atomicInteger;
                Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                try {
                    if (i10 == 0) {
                        a0.throwOnFailure(obj);
                        Flow[] flowArr = this.$flows;
                        int i11 = this.$i;
                        Flow flow = flowArr[i11];
                        C07351 c07351 = new C07351(this.$resultChannel, i11);
                        this.label = 1;
                        if (flow.collect(c07351, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a0.throwOnFailure(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        SendChannel.DefaultImpls.close$default(this.$resultChannel, null, 1, null);
                    }
                    return x0.f87415a;
                } finally {
                    if (this.$nonClosed.decrementAndGet() == 0) {
                        SendChannel.DefaultImpls.close$default(this.$resultChannel, null, 1, null);
                    }
                }
            }

            @Override // kv.p
            public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
                return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Flow<? extends T>[] flowArr, a aVar, q qVar, FlowCollector<? super R> flowCollector, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$flows = flowArr;
            this.$arrayFactory = aVar;
            this.$transform = qVar;
            this.$this_combineInternal = flowCollector;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$flows, this.$arrayFactory, this.$transform, this.$this_combineInternal, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0106, code lost:
        
            if (r11.invoke(r12, r10, r22) == r1) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0127, code lost:
        
            if (r12.invoke(r13, r11, r22) == r1) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x012a, code lost:
        
            if (r7 != 0) goto L42;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00c0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00c1 A[LOOP:0: B:26:0x00c1->B:45:?, LOOP_START, PHI: r7 r11
          0x00c1: PHI (r7v4 int) = (r7v3 int), (r7v5 int) binds: [B:24:0x00be, B:45:?] A[DONT_GENERATE, DONT_INLINE]
          0x00c1: PHI (r11v5 uu.g1) = (r11v4 uu.g1), (r11v12 uu.g1) binds: [B:24:0x00be, B:45:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e8  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0106 -> B:42:0x012a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0127 -> B:42:0x012a). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 305
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public static final <R, T> Object combineInternal(FlowCollector<? super R> flowCollector, Flow<? extends T>[] flowArr, a aVar, q qVar, d<? super x0> dVar) {
        Object objFlowScope = FlowCoroutineKt.flowScope(new AnonymousClass2(flowArr, aVar, qVar, flowCollector, null), dVar);
        return objFlowScope == e.getCOROUTINE_SUSPENDED() ? objFlowScope : x0.f87415a;
    }

    public static final <T1, T2, R> Flow<R> zipImpl(final Flow<? extends T1> flow, final Flow<? extends T2> flow2, final q qVar) {
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super R> flowCollector, d<? super x0> dVar) {
                Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new CombineKt$zipImpl$1$1(flow2, flow, flowCollector, qVar, null), dVar);
                return objCoroutineScope == e.getCOROUTINE_SUSPENDED() ? objCoroutineScope : x0.f87415a;
            }
        };
    }
}
