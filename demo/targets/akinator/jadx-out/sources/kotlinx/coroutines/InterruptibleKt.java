package kotlinx.coroutines;

import av.e;
import bv.f;
import bv.n;
import java.util.concurrent.CancellationException;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class InterruptibleKt {
    private static final int FINISHED = 1;
    private static final int INTERRUPTED = 3;
    private static final int INTERRUPTING = 2;
    private static final int WORKING = 0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.InterruptibleKt$runInterruptible$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ kv.a $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(kv.a aVar, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$block = aVar;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return InterruptibleKt.runInterruptibleInExpectedContext(((CoroutineScope) this.L$0).getCoroutineContext(), this.$block);
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super T> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public static final <T> Object runInterruptible(m mVar, kv.a aVar, d<? super T> dVar) {
        return BuildersKt.withContext(mVar, new AnonymousClass2(aVar, null), dVar);
    }

    public static /* synthetic */ Object runInterruptible$default(m mVar, kv.a aVar, d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = zu.n.f98854b;
        }
        return runInterruptible(mVar, aVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T runInterruptibleInExpectedContext(m mVar, kv.a aVar) throws Throwable {
        try {
            ThreadState threadState = new ThreadState();
            threadState.setup(JobKt.getJob(mVar));
            try {
                return (T) aVar.invoke();
            } finally {
                threadState.clearInterrupt();
            }
        } catch (InterruptedException e10) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e10);
        }
    }
}
