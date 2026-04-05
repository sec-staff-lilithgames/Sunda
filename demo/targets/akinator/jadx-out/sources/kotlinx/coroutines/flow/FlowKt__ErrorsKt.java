package kotlinx.coroutines.flow;

import av.e;
import bv.f;
import bv.n;
import kotlin.jvm.internal.b1;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.Job;
import kv.p;
import kv.q;
import kv.r;
import p0.o2;
import tu.a0;
import tu.x0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final /* synthetic */ class FlowKt__ErrorsKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", i = {0}, l = {152}, m = "catchImpl", n = {"fromDownstream"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1, reason: invalid class name */
    public static final class AnonymousClass1<T> extends bv.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.catchImpl(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ FlowCollector<T> $collector;
        final /* synthetic */ b1 $fromDownstream;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(FlowCollector<? super T> flowCollector, b1 b1Var) {
            this.$collector = flowCollector;
            this.$fromDownstream = b1Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r5, zu.d<? super tu.x0> r6) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.L$0
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2 r5 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt.AnonymousClass2) r5
                tu.a0.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2d
                goto L47
            L2d:
                r6 = move-exception
                goto L4c
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                tu.a0.throwOnFailure(r6)
                kotlinx.coroutines.flow.FlowCollector<T> r6 = r4.$collector     // Catch: java.lang.Throwable -> L4a
                r0.L$0 = r4     // Catch: java.lang.Throwable -> L4a
                r0.label = r3     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L4a
                if (r5 != r1) goto L47
                return r1
            L47:
                tu.x0 r5 = tu.x0.f87415a
                return r5
            L4a:
                r6 = move-exception
                r5 = r4
            L4c:
                kotlin.jvm.internal.b1 r5 = r5.$fromDownstream
                r5.f71816b = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", f = "Errors.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41541 extends n implements p {
        int label;

        public C41541(zu.d<? super C41541> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new C41541(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return bv.b.boxBoolean(true);
        }

        @Override // kv.p
        public final Object invoke(Throwable th2, zu.d<? super Boolean> dVar) {
            return ((C41541) create(th2, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3, reason: invalid class name */
    public static final class AnonymousClass3 extends n implements r {
        final /* synthetic */ p $predicate;
        final /* synthetic */ long $retries;
        /* synthetic */ long J$0;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(long j10, p pVar, zu.d<? super AnonymousClass3> dVar) {
            super(4, dVar);
            this.$retries = j10;
            this.$predicate = pVar;
        }

        @Override // kv.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((FlowCollector) obj, (Throwable) obj2, ((Number) obj3).longValue(), (zu.d<? super Boolean>) obj4);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                Throwable th2 = (Throwable) this.L$0;
                if (this.J$0 < this.$retries) {
                    p pVar = this.$predicate;
                    this.label = 1;
                    obj = pVar.invoke(th2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return bv.b.boxBoolean(z);
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            boolean z10 = ((Boolean) obj).booleanValue();
            return bv.b.boxBoolean(z10);
        }

        public final Object invoke(FlowCollector<? super T> flowCollector, Throwable th2, long j10, zu.d<? super Boolean> dVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$retries, this.$predicate, dVar);
            anonymousClass3.L$0 = th2;
            anonymousClass3.J$0 = j10;
            return anonymousClass3.invokeSuspend(x0.f87415a);
        }
    }

    /* renamed from: catch, reason: not valid java name */
    public static final <T> Flow<T> m5182catch(Flow<? extends T> flow, q qVar) {
        return new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(flow, qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object catchImpl(kotlinx.coroutines.flow.Flow<? extends T> r4, kotlinx.coroutines.flow.FlowCollector<? super T> r5, zu.d<? super java.lang.Throwable> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$0
            kotlin.jvm.internal.b1 r4 = (kotlin.jvm.internal.b1) r4
            tu.a0.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4b
        L2d:
            r5 = move-exception
            goto L4f
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.jvm.internal.b1 r6 = com.google.android.gms.internal.play_billing.a.m(r6)
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2 r2 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2     // Catch: java.lang.Throwable -> L4d
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4d
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L4d
            r0.label = r3     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: java.lang.Throwable -> L4d
            if (r4 != r1) goto L4b
            return r1
        L4b:
            r4 = 0
            return r4
        L4d:
            r5 = move-exception
            r4 = r6
        L4f:
            java.lang.Object r4 = r4.f71816b
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = isSameExceptionAs$FlowKt__ErrorsKt(r5, r4)
            if (r6 != 0) goto L72
            zu.m r6 = r0.getContext()
            boolean r6 = isCancellationCause$FlowKt__ErrorsKt(r5, r6)
            if (r6 != 0) goto L72
            if (r4 != 0) goto L66
            return r5
        L66:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L6e
            tu.h.addSuppressed(r4, r5)
            throw r4
        L6e:
            tu.h.addSuppressed(r5, r4)
            throw r5
        L72:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt.catchImpl(kotlinx.coroutines.flow.Flow, kotlinx.coroutines.flow.FlowCollector, zu.d):java.lang.Object");
    }

    private static final boolean isCancellationCause$FlowKt__ErrorsKt(Throwable th2, m mVar) {
        Job job = (Job) mVar.get(Job.Key);
        if (job == null || !job.isCancelled()) {
            return false;
        }
        return isSameExceptionAs$FlowKt__ErrorsKt(th2, job.getCancellationException());
    }

    private static final boolean isSameExceptionAs$FlowKt__ErrorsKt(Throwable th2, Throwable th3) {
        return th3 != null && e0.areEqual(th3, th2);
    }

    public static final <T> Flow<T> retry(Flow<? extends T> flow, long j10, p pVar) {
        if (j10 > 0) {
            return FlowKt.retryWhen(flow, new AnonymousClass3(j10, pVar, null));
        }
        throw new IllegalArgumentException(o2.m(j10, "Expected positive amount of retries, but had ").toString());
    }

    public static /* synthetic */ Flow retry$default(Flow flow, long j10, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = Long.MAX_VALUE;
        }
        if ((i10 & 2) != 0) {
            pVar = new C41541(null);
        }
        return FlowKt.retry(flow, j10, pVar);
    }

    public static final <T> Flow<T> retryWhen(Flow<? extends T> flow, r rVar) {
        return new FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(flow, rVar);
    }
}
