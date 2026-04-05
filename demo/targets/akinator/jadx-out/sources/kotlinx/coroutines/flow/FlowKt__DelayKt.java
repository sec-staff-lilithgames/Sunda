package kotlinx.coroutines.flow;

import av.e;
import bv.f;
import bv.n;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.b1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.selects.SelectImplementation;
import kv.l;
import kv.p;
import kv.q;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final /* synthetic */ class FlowKt__DelayKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1", f = "Delay.kt", i = {0, 1, 2}, l = {307, Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE, Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ long $delayMillis;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j10, zu.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$delayMillis = j10;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$delayMillis, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0050 A[PHI: r1
          0x0050: PHI (r1v4 kotlinx.coroutines.channels.ProducerScope) = (r1v3 kotlinx.coroutines.channels.ProducerScope), (r1v8 kotlinx.coroutines.channels.ProducerScope) binds: [B:16:0x004d, B:10:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:15:0x003f). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2a
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L22
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                java.lang.Object r1 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                tu.a0.throwOnFailure(r8)
                goto L50
            L22:
                java.lang.Object r1 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                tu.a0.throwOnFailure(r8)
                goto L3f
            L2a:
                tu.a0.throwOnFailure(r8)
                java.lang.Object r8 = r7.L$0
                r1 = r8
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                long r5 = r7.$delayMillis
                r7.L$0 = r1
                r7.label = r4
                java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r5, r7)
                if (r8 != r0) goto L3f
                goto L5c
            L3f:
                kotlinx.coroutines.channels.SendChannel r8 = r1.getChannel()
                r7.L$0 = r1
                r7.label = r3
                tu.x0 r4 = tu.x0.f87415a
                java.lang.Object r8 = r8.send(r4, r7)
                if (r8 != r0) goto L50
                goto L5c
            L50:
                long r4 = r7.$delayMillis
                r7.L$0 = r1
                r7.label = r2
                java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r4, r7)
                if (r8 != r0) goto L3f
            L5c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(ProducerScope<? super x0> producerScope, zu.d<? super x0> dVar) {
            return ((AnonymousClass1) create(producerScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", i = {0, 0, 0, 0}, l = {TTAdConstant.IMAGE_URL_CODE}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "ticker"}, s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements q {
        final /* synthetic */ long $periodMillis;
        final /* synthetic */ Flow<T> $this_sample;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(long j10, Flow<? extends T> flow, zu.d<? super AnonymousClass2> dVar) {
            super(3, dVar);
            this.$periodMillis = j10;
            this.$this_sample = flow;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            ReceiveChannel receiveChannel;
            ReceiveChannel<x0> receiveChannelFixedPeriodTicker;
            b1 b1Var;
            FlowCollector flowCollector;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                FlowCollector flowCollector2 = (FlowCollector) this.L$1;
                ReceiveChannel receiveChannelProduce$default = ProduceKt.produce$default(coroutineScope, null, -1, new FlowKt__DelayKt$sample$2$values$1(this.$this_sample, null), 1, null);
                b1 b1Var2 = new b1();
                receiveChannel = receiveChannelProduce$default;
                receiveChannelFixedPeriodTicker = FlowKt.fixedPeriodTicker(coroutineScope, this.$periodMillis);
                b1Var = b1Var2;
                flowCollector = flowCollector2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                receiveChannelFixedPeriodTicker = (ReceiveChannel) this.L$3;
                b1Var = (b1) this.L$2;
                receiveChannel = (ReceiveChannel) this.L$1;
                flowCollector = (FlowCollector) this.L$0;
                a0.throwOnFailure(obj);
            }
            while (b1Var.f71816b != NullSurrogateKt.DONE) {
                SelectImplementation selectImplementation = new SelectImplementation(getContext());
                selectImplementation.invoke(receiveChannel.getOnReceiveCatching(), new FlowKt__DelayKt$sample$2$1$1(b1Var, receiveChannelFixedPeriodTicker, null));
                selectImplementation.invoke(receiveChannelFixedPeriodTicker.getOnReceive(), new FlowKt__DelayKt$sample$2$1$2(b1Var, flowCollector, null));
                this.L$0 = flowCollector;
                this.L$1 = receiveChannel;
                this.L$2 = b1Var;
                this.L$3 = receiveChannelFixedPeriodTicker;
                this.label = 1;
                if (selectImplementation.doSelect(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return x0.f87415a;
        }

        @Override // kv.q
        public final Object invoke(CoroutineScope coroutineScope, FlowCollector<? super T> flowCollector, zu.d<? super x0> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$periodMillis, this.$this_sample, dVar);
            anonymousClass2.L$0 = coroutineScope;
            anonymousClass2.L$1 = flowCollector;
            return anonymousClass2.invokeSuspend(x0.f87415a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Flow<T> debounce(Flow<? extends T> flow, final long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? flow : debounceInternal$FlowKt__DelayKt(flow, new l() { // from class: kotlinx.coroutines.flow.b
                @Override // kv.l
                public final Object invoke(Object obj) {
                    return Long.valueOf(FlowKt__DelayKt.debounce$lambda$1$FlowKt__DelayKt(j10, obj));
                }
            });
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long debounce$lambda$2$FlowKt__DelayKt(l lVar, Object obj) {
        return DelayKt.m5129toDelayMillisLRDsOJo(((tv.f) lVar.invoke(obj)).m7225unboximpl());
    }

    /* renamed from: debounce-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m5175debounceHG0u8IE(Flow<? extends T> flow, long j10) {
        return FlowKt.debounce(flow, DelayKt.m5129toDelayMillisLRDsOJo(j10));
    }

    public static final <T> Flow<T> debounceDuration(Flow<? extends T> flow, final l lVar) {
        return debounceInternal$FlowKt__DelayKt(flow, new l() { // from class: kotlinx.coroutines.flow.a
            @Override // kv.l
            public final Object invoke(Object obj) {
                return Long.valueOf(FlowKt__DelayKt.debounce$lambda$2$FlowKt__DelayKt(lVar, obj));
            }
        });
    }

    private static final <T> Flow<T> debounceInternal$FlowKt__DelayKt(Flow<? extends T> flow, l lVar) {
        return FlowCoroutineKt.scopedFlow(new FlowKt__DelayKt$debounceInternal$1(lVar, flow, null));
    }

    public static final ReceiveChannel<x0> fixedPeriodTicker(CoroutineScope coroutineScope, long j10) {
        return ProduceKt.produce$default(coroutineScope, null, 0, new AnonymousClass1(j10, null), 1, null);
    }

    public static final <T> Flow<T> sample(Flow<? extends T> flow, long j10) {
        if (j10 > 0) {
            return FlowCoroutineKt.scopedFlow(new AnonymousClass2(j10, flow, null));
        }
        throw new IllegalArgumentException("Sample period should be positive");
    }

    /* renamed from: sample-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m5176sampleHG0u8IE(Flow<? extends T> flow, long j10) {
        return FlowKt.sample(flow, DelayKt.m5129toDelayMillisLRDsOJo(j10));
    }

    /* renamed from: timeout-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m5177timeoutHG0u8IE(Flow<? extends T> flow, long j10) {
        return m5178timeoutInternalHG0u8IE$FlowKt__DelayKt(flow, j10);
    }

    /* renamed from: timeoutInternal-HG0u8IE$FlowKt__DelayKt, reason: not valid java name */
    private static final <T> Flow<T> m5178timeoutInternalHG0u8IE$FlowKt__DelayKt(Flow<? extends T> flow, long j10) {
        return FlowCoroutineKt.scopedFlow(new FlowKt__DelayKt$timeoutInternal$1(j10, flow, null));
    }

    public static final <T> Flow<T> debounce(Flow<? extends T> flow, l lVar) {
        return debounceInternal$FlowKt__DelayKt(flow, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long debounce$lambda$1$FlowKt__DelayKt(long j10, Object obj) {
        return j10;
    }
}
