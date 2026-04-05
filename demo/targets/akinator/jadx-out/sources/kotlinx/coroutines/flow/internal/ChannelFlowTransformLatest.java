package kotlinx.coroutines.flow.internal;

import av.e;
import bv.f;
import bv.n;
import kotlin.jvm.internal.b1;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kv.p;
import kv.q;
import tu.a0;
import tu.x0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ChannelFlowTransformLatest<T, R> extends ChannelFlowOperator<T, R> {
    private final q transform;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3, reason: invalid class name */
    public static final class AnonymousClass3 extends n implements p {
        final /* synthetic */ FlowCollector<R> $collector;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ChannelFlowTransformLatest<T, R> this$0;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            final /* synthetic */ FlowCollector<R> $collector;
            final /* synthetic */ b1 $previousFlow;
            final /* synthetic */ ChannelFlowTransformLatest<T, R> this$0;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends n implements p {
                final /* synthetic */ FlowCollector<R> $collector;
                final /* synthetic */ T $value;
                int label;
                final /* synthetic */ ChannelFlowTransformLatest<T, R> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass2(ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, FlowCollector<? super R> flowCollector, T t10, d<? super AnonymousClass2> dVar) {
                    super(2, dVar);
                    this.this$0 = channelFlowTransformLatest;
                    this.$collector = flowCollector;
                    this.$value = t10;
                }

                @Override // bv.a
                public final d<x0> create(Object obj, d<?> dVar) {
                    return new AnonymousClass2(this.this$0, this.$collector, this.$value, dVar);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                    int i10 = this.label;
                    if (i10 == 0) {
                        a0.throwOnFailure(obj);
                        q qVar = ((ChannelFlowTransformLatest) this.this$0).transform;
                        FlowCollector<R> flowCollector = this.$collector;
                        T t10 = this.$value;
                        this.label = 1;
                        if (qVar.invoke(flowCollector, t10, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a0.throwOnFailure(obj);
                    }
                    return x0.f87415a;
                }

                @Override // kv.p
                public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
                    return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(b1 b1Var, CoroutineScope coroutineScope, ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, FlowCollector<? super R> flowCollector) {
                this.$previousFlow = b1Var;
                this.$$this$coroutineScope = coroutineScope;
                this.this$0 = channelFlowTransformLatest;
                this.$collector = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r8, zu.d<? super tu.x0> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r9
                    kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.result
                    java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.L$2
                    kotlinx.coroutines.Job r8 = (kotlinx.coroutines.Job) r8
                    java.lang.Object r8 = r0.L$1
                    java.lang.Object r0 = r0.L$0
                    kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest.AnonymousClass3.AnonymousClass1) r0
                    tu.a0.throwOnFailure(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    tu.a0.throwOnFailure(r9)
                    kotlin.jvm.internal.b1 r9 = r7.$previousFlow
                    java.lang.Object r9 = r9.f71816b
                    kotlinx.coroutines.Job r9 = (kotlinx.coroutines.Job) r9
                    if (r9 == 0) goto L5d
                    kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                    r2.<init>()
                    r9.cancel(r2)
                    r0.L$0 = r7
                    r0.L$1 = r8
                    r0.L$2 = r9
                    r0.label = r3
                    java.lang.Object r9 = r9.join(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    kotlin.jvm.internal.b1 r9 = r0.$previousFlow
                    kotlinx.coroutines.CoroutineScope r1 = r0.$$this$coroutineScope
                    kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                    kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2 r4 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2
                    kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> r2 = r0.this$0
                    kotlinx.coroutines.flow.FlowCollector<R> r0 = r0.$collector
                    r5 = 0
                    r4.<init>(r2, r0, r8, r5)
                    r5 = 1
                    r6 = 0
                    r2 = 0
                    kotlinx.coroutines.Job r8 = kotlinx.coroutines.BuildersKt.launch$default(r1, r2, r3, r4, r5, r6)
                    r9.f71816b = r8
                    tu.x0 r8 = tu.x0.f87415a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest.AnonymousClass3.AnonymousClass1.emit(java.lang.Object, zu.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, FlowCollector<? super R> flowCollector, d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.this$0 = channelFlowTransformLatest;
            this.$collector = flowCollector;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$collector, dVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                b1 b1Var = new b1();
                ChannelFlowTransformLatest<T, R> channelFlowTransformLatest = this.this$0;
                Flow<S> flow = channelFlowTransformLatest.flow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(b1Var, coroutineScope, channelFlowTransformLatest, this.$collector);
                this.label = 1;
                if (flow.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass3) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public /* synthetic */ ChannelFlowTransformLatest(q qVar, Flow flow, m mVar, int i10, BufferOverflow bufferOverflow, int i11, u uVar) {
        this(qVar, flow, (i11 & 4) != 0 ? zu.n.f98854b : mVar, (i11 & 8) != 0 ? -2 : i10, (i11 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<R> create(m mVar, int i10, BufferOverflow bufferOverflow) {
        return new ChannelFlowTransformLatest(this.transform, this.flow, mVar, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    public Object flowCollect(FlowCollector<? super R> flowCollector, d<? super x0> dVar) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new AnonymousClass3(this, flowCollector, null), dVar);
        return objCoroutineScope == e.getCOROUTINE_SUSPENDED() ? objCoroutineScope : x0.f87415a;
    }

    public ChannelFlowTransformLatest(q qVar, Flow<? extends T> flow, m mVar, int i10, BufferOverflow bufferOverflow) {
        super(flow, mVar, i10, bufferOverflow);
        this.transform = qVar;
    }
}
