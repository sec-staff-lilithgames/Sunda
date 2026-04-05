package kotlinx.coroutines.flow;

import av.e;
import bv.f;
import bv.n;
import com.vungle.ads.internal.protos.Sdk;
import j1.o2;
import kotlinx.coroutines.DelayKt;
import kv.l;
import kv.p;
import kv.q;
import kv.r;
import kv.s;
import kv.t;
import tu.a0;
import tu.x0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final /* synthetic */ class FlowKt__MigrationKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1", f = "Migration.kt", i = {}, l = {423}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ long $timeMillis;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j10, zu.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$timeMillis = j10;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new AnonymousClass1(this.$timeMillis, dVar);
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((AnonymousClass1) obj, (zu.d<? super x0>) obj2);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                long j10 = this.$timeMillis;
                this.label = 1;
                if (DelayKt.delay(j10, this) == coroutine_suspended) {
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

        public final Object invoke(T t10, zu.d<? super x0> dVar) {
            return ((AnonymousClass1) create(t10, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1", f = "Migration.kt", i = {}, l = {411}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41591 extends n implements p {
        final /* synthetic */ long $timeMillis;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41591(long j10, zu.d<? super C41591> dVar) {
            super(2, dVar);
            this.$timeMillis = j10;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new C41591(this.$timeMillis, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                long j10 = this.$timeMillis;
                this.label = 1;
                if (DelayKt.delay(j10, this) == coroutine_suspended) {
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
        public final Object invoke(FlowCollector<? super T> flowCollector, zu.d<? super x0> dVar) {
            return ((C41591) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", f = "Migration.kt", i = {}, l = {Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements q {
        final /* synthetic */ T $fallback;
        final /* synthetic */ l $predicate;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(l lVar, T t10, zu.d<? super AnonymousClass2> dVar) {
            super(3, dVar);
            this.$predicate = lVar;
            this.$fallback = t10;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Throwable th2 = (Throwable) this.L$1;
                if (!((Boolean) this.$predicate.invoke(th2)).booleanValue()) {
                    throw th2;
                }
                T t10 = this.$fallback;
                this.L$0 = null;
                this.label = 1;
                if (flowCollector.emit(t10, this) == coroutine_suspended) {
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

        @Override // kv.q
        public final Object invoke(FlowCollector<? super T> flowCollector, Throwable th2, zu.d<? super x0> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$predicate, this.$fallback, dVar);
            anonymousClass2.L$0 = flowCollector;
            anonymousClass2.L$1 = th2;
            return anonymousClass2.invokeSuspend(x0.f87415a);
        }
    }

    @tu.f
    public static final <T> Flow<T> cache(Flow<? extends T> flow) {
        throw o2.r();
    }

    @tu.f
    public static final <T1, T2, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, q qVar) {
        return FlowKt.combine(flow, flow2, qVar);
    }

    @tu.f
    public static final <T, R> Flow<R> compose(Flow<? extends T> flow, l lVar) {
        throw o2.r();
    }

    @tu.f
    public static final <T, R> Flow<R> concatMap(Flow<? extends T> flow, l lVar) {
        throw o2.r();
    }

    @tu.f
    public static final <T> Flow<T> concatWith(Flow<? extends T> flow, T t10) {
        throw o2.r();
    }

    @tu.f
    public static final <T> Flow<T> delayEach(Flow<? extends T> flow, long j10) {
        return FlowKt.onEach(flow, new AnonymousClass1(j10, null));
    }

    @tu.f
    public static final <T> Flow<T> delayFlow(Flow<? extends T> flow, long j10) {
        return FlowKt.onStart(flow, new C41591(j10, null));
    }

    @tu.f
    public static final <T, R> Flow<R> flatMap(Flow<? extends T> flow, p pVar) {
        throw o2.r();
    }

    @tu.f
    public static final <T> Flow<T> flatten(Flow<? extends Flow<? extends T>> flow) {
        throw o2.r();
    }

    @tu.f
    public static final <T> void forEach(Flow<? extends T> flow, p pVar) {
        throw o2.r();
    }

    @tu.f
    public static final <T> Flow<T> merge(Flow<? extends Flow<? extends T>> flow) {
        throw o2.r();
    }

    public static final Void noImpl() {
        throw new UnsupportedOperationException("Not implemented, should not be called");
    }

    @tu.f
    public static final <T> Flow<T> observeOn(Flow<? extends T> flow, m mVar) {
        throw o2.r();
    }

    @tu.f
    public static final <T> Flow<T> onErrorResume(Flow<? extends T> flow, Flow<? extends T> flow2) {
        throw o2.r();
    }

    @tu.f
    public static final <T> Flow<T> onErrorResumeNext(Flow<? extends T> flow, Flow<? extends T> flow2) {
        throw o2.r();
    }

    @tu.f
    public static final <T> Flow<T> onErrorReturn(Flow<? extends T> flow, T t10) {
        throw o2.r();
    }

    public static /* synthetic */ Flow onErrorReturn$default(Flow flow, Object obj, l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = new c(1);
        }
        return FlowKt.onErrorReturn(flow, obj, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onErrorReturn$lambda$0$FlowKt__MigrationKt(Throwable th2) {
        return true;
    }

    @tu.f
    public static final <T> Flow<T> publish(Flow<? extends T> flow) {
        throw o2.r();
    }

    @tu.f
    public static final <T> Flow<T> publishOn(Flow<? extends T> flow, m mVar) {
        throw o2.r();
    }

    @tu.f
    public static final <T> Flow<T> replay(Flow<? extends T> flow) {
        throw o2.r();
    }

    @tu.f
    public static final <T, R> Flow<R> scanFold(Flow<? extends T> flow, R r10, q qVar) {
        throw o2.r();
    }

    @tu.f
    public static final <T> Flow<T> scanReduce(Flow<? extends T> flow, q qVar) {
        return FlowKt.runningReduce(flow, qVar);
    }

    @tu.f
    public static final <T> Flow<T> skip(Flow<? extends T> flow, int i10) {
        throw o2.r();
    }

    @tu.f
    public static final <T> Flow<T> startWith(Flow<? extends T> flow, T t10) {
        throw o2.r();
    }

    @tu.f
    public static final <T> void subscribe(Flow<? extends T> flow) {
        throw o2.r();
    }

    @tu.f
    public static final <T> Flow<T> subscribeOn(Flow<? extends T> flow, m mVar) {
        throw o2.r();
    }

    @tu.f
    public static final <T, R> Flow<R> switchMap(Flow<? extends T> flow, p pVar) {
        return FlowKt.transformLatest(flow, new FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(pVar, null));
    }

    @tu.f
    public static final <T1, T2, T3, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, r rVar) {
        return FlowKt.combine(flow, flow2, flow3, rVar);
    }

    @tu.f
    public static final <T1, T2, T3, T4, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, s sVar) {
        return FlowKt.combine(flow, flow2, flow3, flow4, sVar);
    }

    @tu.f
    public static final <T1, T2, T3, T4, T5, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, t tVar) {
        return FlowKt.combine(flow, flow2, flow3, flow4, flow5, tVar);
    }

    @tu.f
    public static final <T> Flow<T> concatWith(Flow<? extends T> flow, Flow<? extends T> flow2) {
        throw o2.r();
    }

    @tu.f
    public static final <T> Flow<T> onErrorReturn(Flow<? extends T> flow, T t10, l lVar) {
        return FlowKt.m5171catch(flow, new AnonymousClass2(lVar, t10, null));
    }

    @tu.f
    public static final <T> Flow<T> publish(Flow<? extends T> flow, int i10) {
        throw o2.r();
    }

    @tu.f
    public static final <T> Flow<T> replay(Flow<? extends T> flow, int i10) {
        throw o2.r();
    }

    @tu.f
    public static final <T> Flow<T> startWith(Flow<? extends T> flow, Flow<? extends T> flow2) {
        throw o2.r();
    }

    @tu.f
    public static final <T> void subscribe(Flow<? extends T> flow, p pVar) {
        throw o2.r();
    }

    @tu.f
    public static final <T> void subscribe(Flow<? extends T> flow, p pVar, p pVar2) {
        throw o2.r();
    }
}
