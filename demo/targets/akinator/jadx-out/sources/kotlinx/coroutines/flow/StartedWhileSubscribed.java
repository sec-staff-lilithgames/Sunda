package kotlinx.coroutines.flow;

import av.e;
import bv.f;
import bv.n;
import java.util.List;
import kv.p;
import kv.q;
import p0.o2;
import tu.a0;
import tu.x0;
import uu.o0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class StartedWhileSubscribed implements SharingStarted {
    private final long replayExpiration;
    private final long stopTimeout;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {174, 176, 178, 179, 181}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
    /* renamed from: kotlinx.coroutines.flow.StartedWhileSubscribed$command$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements q {
        /* synthetic */ int I$0;
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(3, dVar);
        }

        @Override // kv.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((FlowCollector<? super SharingCommand>) obj, ((Number) obj2).intValue(), (zu.d<? super x0>) obj3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        
            if (r1.emit(r10, r9) == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
        
            if (r1.emit(r10, r9) != r0) goto L35;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[PHI: r1
          0x008e: PHI (r1v5 kotlinx.coroutines.flow.FlowCollector) = 
          (r1v3 kotlinx.coroutines.flow.FlowCollector)
          (r1v4 kotlinx.coroutines.flow.FlowCollector)
          (r1v11 kotlinx.coroutines.flow.FlowCollector)
         binds: [B:25:0x006e, B:30:0x008b, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3c
                if (r1 == r6) goto L38
                if (r1 == r5) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L38
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                java.lang.Object r1 = r9.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                tu.a0.throwOnFailure(r10)
                goto L8e
            L28:
                java.lang.Object r1 = r9.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                tu.a0.throwOnFailure(r10)
                goto L7d
            L30:
                java.lang.Object r1 = r9.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                tu.a0.throwOnFailure(r10)
                goto L64
            L38:
                tu.a0.throwOnFailure(r10)
                goto L9c
            L3c:
                tu.a0.throwOnFailure(r10)
                java.lang.Object r10 = r9.L$0
                r1 = r10
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                int r10 = r9.I$0
                if (r10 <= 0) goto L53
                kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.START
                r9.label = r6
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
                goto L9b
            L53:
                kotlinx.coroutines.flow.StartedWhileSubscribed r10 = kotlinx.coroutines.flow.StartedWhileSubscribed.this
                long r6 = kotlinx.coroutines.flow.StartedWhileSubscribed.access$getStopTimeout$p(r10)
                r9.L$0 = r1
                r9.label = r5
                java.lang.Object r10 = kotlinx.coroutines.DelayKt.delay(r6, r9)
                if (r10 != r0) goto L64
                goto L9b
            L64:
                kotlinx.coroutines.flow.StartedWhileSubscribed r10 = kotlinx.coroutines.flow.StartedWhileSubscribed.this
                long r5 = kotlinx.coroutines.flow.StartedWhileSubscribed.access$getReplayExpiration$p(r10)
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L8e
                kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.STOP
                r9.L$0 = r1
                r9.label = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L7d
                goto L9b
            L7d:
                kotlinx.coroutines.flow.StartedWhileSubscribed r10 = kotlinx.coroutines.flow.StartedWhileSubscribed.this
                long r4 = kotlinx.coroutines.flow.StartedWhileSubscribed.access$getReplayExpiration$p(r10)
                r9.L$0 = r1
                r9.label = r3
                java.lang.Object r10 = kotlinx.coroutines.DelayKt.delay(r4, r9)
                if (r10 != r0) goto L8e
                goto L9b
            L8e:
                kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE
                r3 = 0
                r9.L$0 = r3
                r9.label = r2
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
            L9b:
                return r0
            L9c:
                tu.x0 r10 = tu.x0.f87415a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StartedWhileSubscribed.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(FlowCollector<? super SharingCommand> flowCollector, int i10, zu.d<? super x0> dVar) {
            AnonymousClass1 anonymousClass1 = StartedWhileSubscribed.this.new AnonymousClass1(dVar);
            anonymousClass1.L$0 = flowCollector;
            anonymousClass1.I$0 = i10;
            return anonymousClass1.invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.StartedWhileSubscribed$command$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(zu.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar);
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
            return bv.b.boxBoolean(((SharingCommand) this.L$0) != SharingCommand.START);
        }

        @Override // kv.p
        public final Object invoke(SharingCommand sharingCommand, zu.d<? super Boolean> dVar) {
            return ((AnonymousClass2) create(sharingCommand, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public StartedWhileSubscribed(long j10, long j11) {
        this.stopTimeout = j10;
        this.replayExpiration = j11;
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.n(j10, "stopTimeout(", " ms) cannot be negative").toString());
        }
        if (j11 < 0) {
            throw new IllegalArgumentException(o2.n(j11, "replayExpiration(", " ms) cannot be negative").toString());
        }
    }

    @Override // kotlinx.coroutines.flow.SharingStarted
    public Flow<SharingCommand> command(StateFlow<Integer> stateFlow) {
        return FlowKt.distinctUntilChanged(FlowKt.dropWhile(FlowKt.transformLatest(stateFlow, new AnonymousClass1(null)), new AnonymousClass2(null)));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StartedWhileSubscribed)) {
            return false;
        }
        StartedWhileSubscribed startedWhileSubscribed = (StartedWhileSubscribed) obj;
        return this.stopTimeout == startedWhileSubscribed.stopTimeout && this.replayExpiration == startedWhileSubscribed.replayExpiration;
    }

    public int hashCode() {
        return Long.hashCode(this.replayExpiration) + (Long.hashCode(this.stopTimeout) * 31);
    }

    public String toString() {
        List listCreateListBuilder = o0.createListBuilder(2);
        if (this.stopTimeout > 0) {
            listCreateListBuilder.add("stopTimeout=" + this.stopTimeout + "ms");
        }
        if (this.replayExpiration < Long.MAX_VALUE) {
            listCreateListBuilder.add("replayExpiration=" + this.replayExpiration + "ms");
        }
        return o2.q(new StringBuilder("SharingStarted.WhileSubscribed("), y0.joinToString$default(o0.build(listCreateListBuilder), null, null, null, 0, null, null, 63, null), ')');
    }
}
