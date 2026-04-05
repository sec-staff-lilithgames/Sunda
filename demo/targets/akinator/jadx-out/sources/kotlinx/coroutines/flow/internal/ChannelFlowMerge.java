package kotlinx.coroutines.flow.internal;

import av.e;
import bv.f;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ChannelFlowMerge<T> extends ChannelFlow<T> {
    private final int concurrency;
    private final Flow<Flow<T>> flow;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ SendingCollector<T> $collector;
        final /* synthetic */ Job $job;
        final /* synthetic */ ProducerScope<T> $scope;
        final /* synthetic */ Semaphore $semaphore;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {TokenParametersOuterClass$TokenParameters.MOCKRESPONSEID_FIELD_NUMBER}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements p {
            final /* synthetic */ SendingCollector<T> $collector;
            final /* synthetic */ Flow<T> $inner;
            final /* synthetic */ Semaphore $semaphore;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Flow<? extends T> flow, SendingCollector<T> sendingCollector, Semaphore semaphore, d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.$inner = flow;
                this.$collector = sendingCollector;
                this.$semaphore = semaphore;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                return new AnonymousClass1(this.$inner, this.$collector, this.$semaphore, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                try {
                    if (i10 == 0) {
                        a0.throwOnFailure(obj);
                        Flow<T> flow = this.$inner;
                        SendingCollector<T> sendingCollector = this.$collector;
                        this.label = 1;
                        if (flow.collect(sendingCollector, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a0.throwOnFailure(obj);
                    }
                    this.$semaphore.release();
                    return x0.f87415a;
                } catch (Throwable th2) {
                    this.$semaphore.release();
                    throw th2;
                }
            }

            @Override // kv.p
            public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
                return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Job job, Semaphore semaphore, ProducerScope<? super T> producerScope, SendingCollector<T> sendingCollector) {
            this.$job = job;
            this.$semaphore = semaphore;
            this.$scope = producerScope;
            this.$collector = sendingCollector;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, d dVar) {
            return emit((Flow) obj, (d<? super x0>) dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(kotlinx.coroutines.flow.Flow<? extends T> r8, zu.d<? super tu.x0> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r8 = r0.L$1
                kotlinx.coroutines.flow.Flow r8 = (kotlinx.coroutines.flow.Flow) r8
                java.lang.Object r0 = r0.L$0
                kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowMerge.AnonymousClass2) r0
                tu.a0.throwOnFailure(r9)
                goto L53
            L31:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L39:
                tu.a0.throwOnFailure(r9)
                kotlinx.coroutines.Job r9 = r7.$job
                if (r9 == 0) goto L43
                kotlinx.coroutines.JobKt.ensureActive(r9)
            L43:
                kotlinx.coroutines.sync.Semaphore r9 = r7.$semaphore
                r0.L$0 = r7
                r0.L$1 = r8
                r0.label = r3
                java.lang.Object r9 = r9.acquire(r0)
                if (r9 != r1) goto L52
                return r1
            L52:
                r0 = r7
            L53:
                kotlinx.coroutines.channels.ProducerScope<T> r1 = r0.$scope
                kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1 r4 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1
                kotlinx.coroutines.flow.internal.SendingCollector<T> r9 = r0.$collector
                kotlinx.coroutines.sync.Semaphore r0 = r0.$semaphore
                r2 = 0
                r4.<init>(r8, r9, r0, r2)
                r5 = 3
                r6 = 0
                r3 = 0
                kotlinx.coroutines.BuildersKt.launch$default(r1, r2, r3, r4, r5, r6)
                tu.x0 r8 = tu.x0.f87415a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowMerge.AnonymousClass2.emit(kotlinx.coroutines.flow.Flow, zu.d):java.lang.Object");
        }
    }

    public /* synthetic */ ChannelFlowMerge(Flow flow, int i10, m mVar, int i11, BufferOverflow bufferOverflow, int i12, u uVar) {
        this(flow, i10, (i12 & 4) != 0 ? zu.n.f98854b : mVar, (i12 & 8) != 0 ? -2 : i11, (i12 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String additionalToStringProps() {
        return "concurrency=" + this.concurrency;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object collectTo(ProducerScope<? super T> producerScope, d<? super x0> dVar) {
        Object objCollect = this.flow.collect(new AnonymousClass2((Job) dVar.getContext().get(Job.Key), SemaphoreKt.Semaphore$default(this.concurrency, 0, 2, null), producerScope, new SendingCollector(producerScope)), dVar);
        return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<T> create(m mVar, int i10, BufferOverflow bufferOverflow) {
        return new ChannelFlowMerge(this.flow, this.concurrency, mVar, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ReceiveChannel<T> produceImpl(CoroutineScope coroutineScope) {
        return ProduceKt.produce(coroutineScope, this.context, this.capacity, getCollectToFun$kotlinx_coroutines_core());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowMerge(Flow<? extends Flow<? extends T>> flow, int i10, m mVar, int i11, BufferOverflow bufferOverflow) {
        super(mVar, i11, bufferOverflow);
        this.flow = flow;
        this.concurrency = i10;
    }
}
