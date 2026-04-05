package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f48180a;

    /* renamed from: b, reason: collision with root package name */
    public final MutableStateFlow f48181b;

    /* renamed from: c, reason: collision with root package name */
    public final StateFlow f48182c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f48183i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f48184j;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p0$a$a, reason: collision with other inner class name */
        public static final class C0416a extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public int f48186i;

            /* renamed from: j, reason: collision with root package name */
            public /* synthetic */ Object f48187j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ ProducerScope f48188k;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p0$a$a$a, reason: collision with other inner class name */
            public static final class C0417a implements FlowCollector {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ProducerScope f48189b;

                public C0417a(ProducerScope<? super tu.k0> producerScope) {
                    this.f48189b = producerScope;
                }

                public final Object a(int i10, zu.d<? super x0> dVar) {
                    Object objSend = this.f48189b.send(tu.k0.m7055boximpl(i10), dVar);
                    return objSend == av.e.getCOROUTINE_SUSPENDED() ? objSend : x0.f87415a;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, zu.d dVar) {
                    return a(((tu.k0) obj).m7061unboximpl(), dVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0416a(ProducerScope<? super tu.k0> producerScope, zu.d<? super C0416a> dVar) {
                super(2, dVar);
                this.f48188k = producerScope;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(StateFlow<tu.k0> stateFlow, zu.d<? super x0> dVar) {
                return ((C0416a) create(stateFlow, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                C0416a c0416a = new C0416a(this.f48188k, dVar);
                c0416a.f48187j = obj;
                return c0416a;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                int i10 = this.f48186i;
                if (i10 == 0) {
                    tu.a0.throwOnFailure(obj);
                    StateFlow stateFlow = (StateFlow) this.f48187j;
                    C0417a c0417a = new C0417a(this.f48188k);
                    this.f48186i = 1;
                    if (stateFlow.collect(c0417a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tu.a0.throwOnFailure(obj);
                }
                throw new tu.k();
            }
        }

        public a(zu.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ProducerScope<? super tu.k0> producerScope, zu.d<? super x0> dVar) {
            return ((a) create(producerScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            a aVar = p0.this.new a(dVar);
            aVar.f48184j = obj;
            return aVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48183i;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                ProducerScope producerScope = (ProducerScope) this.f48184j;
                MutableStateFlow mutableStateFlow = p0.this.f48181b;
                C0416a c0416a = new C0416a(producerScope, null);
                this.f48183i = 1;
                if (FlowKt.collectLatest(mutableStateFlow, c0416a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }
    }

    public /* synthetic */ p0(int i10, CoroutineScope coroutineScope, kotlin.jvm.internal.u uVar) {
        this(i10, coroutineScope);
    }

    public p0(int i10, CoroutineScope scope) {
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        this.f48180a = scope;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(y.a(i10, scope));
        this.f48181b = MutableStateFlow;
        this.f48182c = FlowKt.stateIn(FlowKt.channelFlow(new a(null)), scope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), ((StateFlow) MutableStateFlow.getValue()).getValue());
    }

    public final void a(int i10) {
        this.f48181b.setValue(y.a(i10, this.f48180a));
    }

    public final StateFlow<tu.k0> a() {
        return this.f48182c;
    }
}
