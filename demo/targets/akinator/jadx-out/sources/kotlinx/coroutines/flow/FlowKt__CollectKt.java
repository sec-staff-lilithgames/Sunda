package kotlinx.coroutines.flow;

import av.e;
import bv.f;
import bv.n;
import kotlin.jvm.internal.b0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.internal.NopCollector;
import kv.p;
import kv.q;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final /* synthetic */ class FlowKt__CollectKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3, reason: invalid class name */
    public static final class AnonymousClass3<T> implements FlowCollector<T> {
        final /* synthetic */ p $action;

        public AnonymousClass3(p pVar) {
            this.$action = pVar;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public Object emit(T t10, zu.d<? super x0> dVar) {
            Object objInvoke = this.$action.invoke(t10, dVar);
            return objInvoke == e.getCOROUTINE_SUSPENDED() ? objInvoke : x0.f87415a;
        }

        public Object emit$$forInline(T t10, final zu.d<? super x0> dVar) {
            b0.mark(4);
            new bv.d(dVar) { // from class: kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3$emit$1
                int label;
                /* synthetic */ Object result;

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.emit(null, this);
                }
            };
            b0.mark(5);
            this.$action.invoke(t10, dVar);
            return x0.f87415a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements FlowCollector<T> {
        final /* synthetic */ q $action;
        private int index;

        public AnonymousClass2(q qVar) {
            this.$action = qVar;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public Object emit(T t10, zu.d<? super x0> dVar) {
            q qVar = this.$action;
            int i10 = this.index;
            this.index = i10 + 1;
            if (i10 < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            Object objInvoke = qVar.invoke(bv.b.boxInt(i10), t10, dVar);
            return objInvoke == e.getCOROUTINE_SUSPENDED() ? objInvoke : x0.f87415a;
        }

        public Object emit$$forInline(T t10, final zu.d<? super x0> dVar) {
            b0.mark(4);
            new bv.d(dVar) { // from class: kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2$emit$1
                int label;
                /* synthetic */ Object result;

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.emit(null, this);
                }
            };
            b0.mark(5);
            q qVar = this.$action;
            int i10 = this.index;
            this.index = i10 + 1;
            if (i10 < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            qVar.invoke(Integer.valueOf(i10), t10, dVar);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ Flow<T> $this_launchIn;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Flow<? extends T> flow, zu.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$this_launchIn = flow;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new AnonymousClass1(this.$this_launchIn, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                Flow<T> flow = this.$this_launchIn;
                this.label = 1;
                if (FlowKt.collect(flow, this) == coroutine_suspended) {
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
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public static final Object collect(Flow<?> flow, zu.d<? super x0> dVar) {
        Object objCollect = flow.collect(NopCollector.INSTANCE, dVar);
        return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
    }

    @tu.f
    private static final /* synthetic */ <T> Object collect$$forInline(Flow<? extends T> flow, p pVar, zu.d<? super x0> dVar) {
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(pVar);
        b0.mark(0);
        flow.collect(anonymousClass3, dVar);
        b0.mark(1);
        return x0.f87415a;
    }

    public static final <T> Object collectIndexed(Flow<? extends T> flow, q qVar, zu.d<? super x0> dVar) {
        Object objCollect = flow.collect(new AnonymousClass2(qVar), dVar);
        return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
    }

    private static final <T> Object collectIndexed$$forInline(Flow<? extends T> flow, q qVar, zu.d<? super x0> dVar) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(qVar);
        b0.mark(0);
        flow.collect(anonymousClass2, dVar);
        b0.mark(1);
        return x0.f87415a;
    }

    public static final <T> Object collectLatest(Flow<? extends T> flow, p pVar, zu.d<? super x0> dVar) {
        Object objCollect = FlowKt.collect(FlowKt__ContextKt.buffer$default(FlowKt.mapLatest(flow, pVar), 0, null, 2, null), dVar);
        return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
    }

    public static final <T> Object emitAll(FlowCollector<? super T> flowCollector, Flow<? extends T> flow, zu.d<? super x0> dVar) {
        FlowKt.ensureActive(flowCollector);
        Object objCollect = flow.collect(flowCollector, dVar);
        return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
    }

    public static final <T> Job launchIn(Flow<? extends T> flow, CoroutineScope coroutineScope) {
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(flow, null), 3, null);
    }

    @tu.f
    public static final /* synthetic */ <T> Object collect(Flow<? extends T> flow, p pVar, zu.d<? super x0> dVar) {
        Object objCollect = flow.collect(new AnonymousClass3(pVar), dVar);
        return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
    }
}
