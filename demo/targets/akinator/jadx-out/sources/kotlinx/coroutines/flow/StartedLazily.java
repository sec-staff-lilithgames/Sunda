package kotlinx.coroutines.flow;

import av.e;
import bv.f;
import bv.n;
import kotlin.jvm.internal.w0;
import kv.p;
import tu.a0;
import tu.k;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class StartedLazily implements SharingStarted {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.StartedLazily$command$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ StateFlow<Integer> $subscriptionCount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StateFlow<Integer> stateFlow, zu.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$subscriptionCount = stateFlow;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$subscriptionCount, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                w0 w0Var = new w0();
                StateFlow<Integer> stateFlow = this.$subscriptionCount;
                C07341 c07341 = new C07341(w0Var, flowCollector);
                this.label = 1;
                if (stateFlow.collect(c07341, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            throw new k();
        }

        @Override // kv.p
        public final Object invoke(FlowCollector<? super SharingCommand> flowCollector, zu.d<? super x0> dVar) {
            return ((AnonymousClass1) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: kotlinx.coroutines.flow.StartedLazily$command$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C07341<T> implements FlowCollector {
            final /* synthetic */ FlowCollector<SharingCommand> $$this$flow;
            final /* synthetic */ w0 $started;

            /* JADX WARN: Multi-variable type inference failed */
            public C07341(w0 w0Var, FlowCollector<? super SharingCommand> flowCollector) {
                this.$started = w0Var;
                this.$$this$flow = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(int r6, zu.d<? super tu.x0> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r7
                    kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1 r0 = (kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1 r0 = new kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1
                    r0.<init>(r5, r7)
                L18:
                    java.lang.Object r7 = r0.result
                    java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                    int r2 = r0.label
                    tu.x0 r3 = tu.x0.f87415a
                    r4 = 1
                    if (r2 == 0) goto L33
                    if (r2 != r4) goto L2b
                    tu.a0.throwOnFailure(r7)
                    goto L4d
                L2b:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L33:
                    tu.a0.throwOnFailure(r7)
                    if (r6 <= 0) goto L4d
                    kotlin.jvm.internal.w0 r6 = r5.$started
                    boolean r7 = r6.f71863b
                    if (r7 != 0) goto L4d
                    r6.f71863b = r4
                    kotlinx.coroutines.flow.FlowCollector<kotlinx.coroutines.flow.SharingCommand> r6 = r5.$$this$flow
                    kotlinx.coroutines.flow.SharingCommand r7 = kotlinx.coroutines.flow.SharingCommand.START
                    r0.label = r4
                    java.lang.Object r6 = r6.emit(r7, r0)
                    if (r6 != r1) goto L4d
                    return r1
                L4d:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StartedLazily.AnonymousClass1.C07341.emit(int, zu.d):java.lang.Object");
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, zu.d dVar) {
                return emit(((Number) obj).intValue(), (zu.d<? super x0>) dVar);
            }
        }
    }

    @Override // kotlinx.coroutines.flow.SharingStarted
    public Flow<SharingCommand> command(StateFlow<Integer> stateFlow) {
        return FlowKt.flow(new AnonymousClass1(stateFlow, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
