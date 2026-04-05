package kotlinx.coroutines.flow.internal;

import a1.a;
import av.e;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kv.p;
import tu.x0;
import zu.d;
import zu.k;
import zu.l;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class SafeCollector_commonKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$unsafeFlow$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements Flow<T> {
        final /* synthetic */ p $block;

        public AnonymousClass1(p pVar) {
            this.$block = pVar;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super T> flowCollector, d<? super x0> dVar) {
            Object objInvoke = this.$block.invoke(flowCollector, dVar);
            return objInvoke == e.getCOROUTINE_SUSPENDED() ? objInvoke : x0.f87415a;
        }

        public Object collect$$forInline(FlowCollector<? super T> flowCollector, final d<? super x0> dVar) {
            b0.mark(4);
            new bv.d(dVar) { // from class: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$unsafeFlow$1$collect$1
                int label;
                /* synthetic */ Object result;

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.collect(null, this);
                }
            };
            b0.mark(5);
            this.$block.invoke(flowCollector, dVar);
            return x0.f87415a;
        }
    }

    public static final void checkContext(SafeCollector<?> safeCollector, m mVar) {
        if (((Number) mVar.fold(0, new a(safeCollector, 7))).intValue() == safeCollector.collectContextSize) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + safeCollector.collectContext + ",\n\t\tbut emission happened in " + mVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int checkContext$lambda$0(SafeCollector safeCollector, int i10, k kVar) {
        l key = kVar.getKey();
        k kVar2 = safeCollector.collectContext.get(key);
        if (key != Job.Key) {
            if (kVar != kVar2) {
                return Integer.MIN_VALUE;
            }
            return i10 + 1;
        }
        Job job = (Job) kVar2;
        e0.checkNotNull(kVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        Job jobTransitiveCoroutineParent = transitiveCoroutineParent((Job) kVar, job);
        if (jobTransitiveCoroutineParent == job) {
            return job == null ? i10 : i10 + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + jobTransitiveCoroutineParent + ", expected child of " + job + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    public static final Job transitiveCoroutineParent(Job job, Job job2) {
        while (job != null) {
            if (job == job2 || !(job instanceof ScopeCoroutine)) {
                return job;
            }
            job = ((ScopeCoroutine) job).getParent();
        }
        return null;
    }

    public static final <T> Flow<T> unsafeFlow(p pVar) {
        return new AnonymousClass1(pVar);
    }
}
