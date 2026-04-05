package kotlinx.coroutines.flow.internal;

import av.e;
import bv.f;
import bv.n;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;
import kv.l;
import kv.p;
import kv.q;
import tu.a0;
import tu.x0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", i = {0, 0}, l = {Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE}, m = "invokeSuspend", n = {"second", "collectJob"}, s = {"L$0", "L$1"})
/* loaded from: classes10.dex */
public final class CombineKt$zipImpl$1$1 extends n implements p {
    final /* synthetic */ Flow<T1> $flow;
    final /* synthetic */ Flow<T2> $flow2;
    final /* synthetic */ FlowCollector<R> $this_unsafeFlow;
    final /* synthetic */ q $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", i = {}, l = {Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ Object $cnt;
        final /* synthetic */ CompletableJob $collectJob;
        final /* synthetic */ Flow<T1> $flow;
        final /* synthetic */ m $scopeContext;
        final /* synthetic */ ReceiveChannel<Object> $second;
        final /* synthetic */ FlowCollector<R> $this_unsafeFlow;
        final /* synthetic */ q $transform;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ Object $cnt;
            final /* synthetic */ CompletableJob $collectJob;
            final /* synthetic */ m $scopeContext;
            final /* synthetic */ ReceiveChannel<Object> $second;
            final /* synthetic */ FlowCollector<R> $this_unsafeFlow;
            final /* synthetic */ q $transform;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            @f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", i = {}, l = {126, 129, 129}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C07361 extends n implements p {
                final /* synthetic */ CompletableJob $collectJob;
                final /* synthetic */ ReceiveChannel<Object> $second;
                final /* synthetic */ FlowCollector<R> $this_unsafeFlow;
                final /* synthetic */ q $transform;
                final /* synthetic */ T1 $value;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C07361(ReceiveChannel<? extends Object> receiveChannel, FlowCollector<? super R> flowCollector, q qVar, T1 t12, CompletableJob completableJob, d<? super C07361> dVar) {
                    super(2, dVar);
                    this.$second = receiveChannel;
                    this.$this_unsafeFlow = flowCollector;
                    this.$transform = qVar;
                    this.$value = t12;
                    this.$collectJob = completableJob;
                }

                @Override // bv.a
                public final d<x0> create(Object obj, d<?> dVar) {
                    return new C07361(this.$second, this.$this_unsafeFlow, this.$transform, this.$value, this.$collectJob, dVar);
                }

                /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
                
                    if (r1.emit(r9, r8) != r0) goto L30;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v3, types: [kotlinx.coroutines.flow.FlowCollector] */
                /* JADX WARN: Type inference failed for: r1v6 */
                /* JADX WARN: Type inference failed for: r1v7 */
                @Override // bv.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
                    /*
                        r8 = this;
                        java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                        int r1 = r8.label
                        r2 = 0
                        r3 = 3
                        r4 = 2
                        r5 = 1
                        if (r1 == 0) goto L30
                        if (r1 == r5) goto L26
                        if (r1 == r4) goto L1e
                        if (r1 != r3) goto L16
                        tu.a0.throwOnFailure(r9)
                        goto L71
                    L16:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r0)
                        throw r9
                    L1e:
                        java.lang.Object r1 = r8.L$0
                        kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                        tu.a0.throwOnFailure(r9)
                        goto L66
                    L26:
                        tu.a0.throwOnFailure(r9)
                        kotlinx.coroutines.channels.ChannelResult r9 = (kotlinx.coroutines.channels.ChannelResult) r9
                        java.lang.Object r9 = r9.m5165unboximpl()
                        goto L3e
                    L30:
                        tu.a0.throwOnFailure(r9)
                        kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r9 = r8.$second
                        r8.label = r5
                        java.lang.Object r9 = r9.mo5145receiveCatchingJP2dKIU(r8)
                        if (r9 != r0) goto L3e
                        goto L70
                    L3e:
                        kotlinx.coroutines.CompletableJob r1 = r8.$collectJob
                        boolean r5 = r9 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
                        if (r5 == 0) goto L50
                        java.lang.Throwable r9 = kotlinx.coroutines.channels.ChannelResult.m5157exceptionOrNullimpl(r9)
                        if (r9 != 0) goto L4f
                        kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
                        r9.<init>(r1)
                    L4f:
                        throw r9
                    L50:
                        kotlinx.coroutines.flow.FlowCollector<R> r1 = r8.$this_unsafeFlow
                        kv.q r5 = r8.$transform
                        T1 r6 = r8.$value
                        kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
                        if (r9 != r7) goto L5b
                        r9 = r2
                    L5b:
                        r8.L$0 = r1
                        r8.label = r4
                        java.lang.Object r9 = r5.invoke(r6, r9, r8)
                        if (r9 != r0) goto L66
                        goto L70
                    L66:
                        r8.L$0 = r2
                        r8.label = r3
                        java.lang.Object r9 = r1.emit(r9, r8)
                        if (r9 != r0) goto L71
                    L70:
                        return r0
                    L71:
                        tu.x0 r9 = tu.x0.f87415a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.C07361.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kv.p
                public final Object invoke(x0 x0Var, d<? super x0> dVar) {
                    return ((C07361) create(x0Var, dVar)).invokeSuspend(x0.f87415a);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(m mVar, Object obj, ReceiveChannel<? extends Object> receiveChannel, FlowCollector<? super R> flowCollector, q qVar, CompletableJob completableJob) {
                this.$scopeContext = mVar;
                this.$cnt = obj;
                this.$second = receiveChannel;
                this.$this_unsafeFlow = flowCollector;
                this.$transform = qVar;
                this.$collectJob = completableJob;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T1 r13, zu.d<? super tu.x0> r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r14
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1
                    r0.<init>(r12, r14)
                L18:
                    java.lang.Object r14 = r0.result
                    java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                    int r2 = r0.label
                    tu.x0 r3 = tu.x0.f87415a
                    r4 = 1
                    if (r2 == 0) goto L33
                    if (r2 != r4) goto L2b
                    tu.a0.throwOnFailure(r14)
                    goto L52
                L2b:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L33:
                    tu.a0.throwOnFailure(r14)
                    zu.m r14 = r12.$scopeContext
                    java.lang.Object r2 = r12.$cnt
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1 r5 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1
                    kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r6 = r12.$second
                    kotlinx.coroutines.flow.FlowCollector<R> r7 = r12.$this_unsafeFlow
                    kv.q r8 = r12.$transform
                    kotlinx.coroutines.CompletableJob r10 = r12.$collectJob
                    r11 = 0
                    r9 = r13
                    r5.<init>(r6, r7, r8, r9, r10, r11)
                    r0.label = r4
                    java.lang.Object r13 = kotlinx.coroutines.flow.internal.ChannelFlowKt.withContextUndispatched(r14, r3, r2, r5, r0)
                    if (r13 != r1) goto L52
                    return r1
                L52:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.emit(java.lang.Object, zu.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Flow<? extends T1> flow, m mVar, Object obj, ReceiveChannel<? extends Object> receiveChannel, FlowCollector<? super R> flowCollector, q qVar, CompletableJob completableJob, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$flow = flow;
            this.$scopeContext = mVar;
            this.$cnt = obj;
            this.$second = receiveChannel;
            this.$this_unsafeFlow = flowCollector;
            this.$transform = qVar;
            this.$collectJob = completableJob;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.$flow, this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform, this.$collectJob, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                Flow<T1> flow = this.$flow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform, this.$collectJob);
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
        public final Object invoke(x0 x0Var, d<? super x0> dVar) {
            return ((AnonymousClass2) create(x0Var, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$zipImpl$1$1(Flow<? extends T2> flow, Flow<? extends T1> flow2, FlowCollector<? super R> flowCollector, q qVar, d<? super CombineKt$zipImpl$1$1> dVar) {
        super(2, dVar);
        this.$flow2 = flow;
        this.$flow = flow2;
        this.$this_unsafeFlow = flowCollector;
        this.$transform = qVar;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        CombineKt$zipImpl$1$1 combineKt$zipImpl$1$1 = new CombineKt$zipImpl$1$1(this.$flow2, this.$flow, this.$this_unsafeFlow, this.$transform, dVar);
        combineKt$zipImpl$1$1.L$0 = obj;
        return combineKt$zipImpl$1$1;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ReceiveChannel receiveChannel;
        CompletableJob completableJob;
        ReceiveChannel receiveChannel2;
        CompletableJob completableJob2;
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        x0 x0Var = x0.f87415a;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            ReceiveChannel receiveChannelProduce$default = ProduceKt.produce$default(coroutineScope, null, 0, new CombineKt$zipImpl$1$1$second$1(this.$flow2, null), 3, null);
            final CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
            e0.checkNotNull(receiveChannelProduce$default, "null cannot be cast to non-null type kotlinx.coroutines.channels.SendChannel<*>");
            ((SendChannel) receiveChannelProduce$default).invokeOnClose(new l() { // from class: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.1
                @Override // kv.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Throwable) obj2);
                    return x0.f87415a;
                }

                public final void invoke(Throwable th2) {
                    if (completableJobJob$default.isActive()) {
                        completableJobJob$default.cancel((CancellationException) new AbortFlowException(completableJobJob$default));
                    }
                }
            });
            try {
                m coroutineContext = coroutineScope.getCoroutineContext();
                Object objThreadContextElements = ThreadContextKt.threadContextElements(coroutineContext);
                m mVarPlus = coroutineScope.getCoroutineContext().plus(completableJobJob$default);
                try {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$flow, coroutineContext, objThreadContextElements, receiveChannelProduce$default, this.$this_unsafeFlow, this.$transform, completableJobJob$default, null);
                    receiveChannel = receiveChannelProduce$default;
                    completableJob = completableJobJob$default;
                    try {
                        this.L$0 = receiveChannel;
                        this.L$1 = completableJob;
                        this.label = 1;
                        if (ChannelFlowKt.withContextUndispatched$default(mVarPlus, x0Var, null, anonymousClass2, this, 4, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        receiveChannel2 = receiveChannel;
                    } catch (AbortFlowException e10) {
                        e = e10;
                        completableJob2 = completableJob;
                        receiveChannel2 = receiveChannel;
                        FlowExceptions_commonKt.checkOwnership(e, completableJob2);
                        ReceiveChannel.DefaultImpls.cancel$default(receiveChannel2, (CancellationException) null, 1, (Object) null);
                        return x0Var;
                    } catch (Throwable th2) {
                        th = th2;
                        receiveChannel2 = receiveChannel;
                        ReceiveChannel.DefaultImpls.cancel$default(receiveChannel2, (CancellationException) null, 1, (Object) null);
                        throw th;
                    }
                } catch (AbortFlowException e11) {
                    e = e11;
                    receiveChannel = receiveChannelProduce$default;
                    completableJob = completableJobJob$default;
                } catch (Throwable th3) {
                    th = th3;
                    receiveChannel = receiveChannelProduce$default;
                }
            } catch (AbortFlowException e12) {
                e = e12;
                receiveChannel = receiveChannelProduce$default;
                completableJob = completableJobJob$default;
            } catch (Throwable th4) {
                th = th4;
                receiveChannel = receiveChannelProduce$default;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            completableJob2 = (CompletableJob) this.L$1;
            receiveChannel2 = (ReceiveChannel) this.L$0;
            try {
                try {
                    a0.throwOnFailure(obj);
                } catch (AbortFlowException e13) {
                    e = e13;
                    FlowExceptions_commonKt.checkOwnership(e, completableJob2);
                    ReceiveChannel.DefaultImpls.cancel$default(receiveChannel2, (CancellationException) null, 1, (Object) null);
                    return x0Var;
                }
            } catch (Throwable th5) {
                th = th5;
                ReceiveChannel.DefaultImpls.cancel$default(receiveChannel2, (CancellationException) null, 1, (Object) null);
                throw th;
            }
        }
        ReceiveChannel.DefaultImpls.cancel$default(receiveChannel2, (CancellationException) null, 1, (Object) null);
        return x0Var;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
        return ((CombineKt$zipImpl$1$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
