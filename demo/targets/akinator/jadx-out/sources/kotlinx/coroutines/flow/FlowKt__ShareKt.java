package kotlinx.coroutines.flow;

import bv.f;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kv.p;
import tu.z;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final /* synthetic */ class FlowKt__ShareKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt", f = "Share.kt", i = {}, l = {326}, m = "stateIn", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$stateIn$1, reason: invalid class name */
    public static final class AnonymousClass1<T> extends bv.d {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.stateIn(null, null, this);
        }
    }

    public static final <T> SharedFlow<T> asSharedFlow(MutableSharedFlow<T> mutableSharedFlow) {
        return new ReadonlySharedFlow(mutableSharedFlow, null);
    }

    public static final <T> StateFlow<T> asStateFlow(MutableStateFlow<T> mutableStateFlow) {
        return new ReadonlyStateFlow(mutableStateFlow, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final <T> kotlinx.coroutines.flow.SharingConfig<T> configureSharing$FlowKt__ShareKt(kotlinx.coroutines.flow.Flow<? extends T> r7, int r8) {
        /*
            kotlinx.coroutines.channels.Channel$Factory r0 = kotlinx.coroutines.channels.Channel.Factory
            int r0 = r0.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core()
            int r0 = qv.v.coerceAtLeast(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof kotlinx.coroutines.flow.internal.ChannelFlow
            if (r1 == 0) goto L3c
            r1 = r7
            kotlinx.coroutines.flow.internal.ChannelFlow r1 = (kotlinx.coroutines.flow.internal.ChannelFlow) r1
            kotlinx.coroutines.flow.Flow r2 = r1.dropChannelOperators()
            if (r2 == 0) goto L3c
            kotlinx.coroutines.flow.SharingConfig r7 = new kotlinx.coroutines.flow.SharingConfig
            int r3 = r1.capacity
            r4 = -3
            if (r3 == r4) goto L26
            r4 = -2
            if (r3 == r4) goto L26
            if (r3 == 0) goto L26
            r0 = r3
            goto L34
        L26:
            kotlinx.coroutines.channels.BufferOverflow r4 = r1.onBufferOverflow
            kotlinx.coroutines.channels.BufferOverflow r5 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            r6 = 0
            if (r4 != r5) goto L31
            if (r3 != 0) goto L34
        L2f:
            r0 = r6
            goto L34
        L31:
            if (r8 != 0) goto L2f
            r0 = 1
        L34:
            kotlinx.coroutines.channels.BufferOverflow r8 = r1.onBufferOverflow
            zu.m r1 = r1.context
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3c:
            kotlinx.coroutines.flow.SharingConfig r8 = new kotlinx.coroutines.flow.SharingConfig
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            zu.n r2 = zu.n.f98854b
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt.configureSharing$FlowKt__ShareKt(kotlinx.coroutines.flow.Flow, int):kotlinx.coroutines.flow.SharingConfig");
    }

    private static final <T> Job launchSharing$FlowKt__ShareKt(CoroutineScope coroutineScope, m mVar, Flow<? extends T> flow, MutableSharedFlow<T> mutableSharedFlow, SharingStarted sharingStarted, T t10) {
        return BuildersKt.launch(coroutineScope, mVar, e0.areEqual(sharingStarted, SharingStarted.Companion.getEagerly()) ? CoroutineStart.DEFAULT : CoroutineStart.UNDISPATCHED, new FlowKt__ShareKt$launchSharing$1(sharingStarted, flow, mutableSharedFlow, t10, null));
    }

    private static final <T> void launchSharingDeferred$FlowKt__ShareKt(CoroutineScope coroutineScope, m mVar, Flow<? extends T> flow, CompletableDeferred<z> completableDeferred) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, mVar, null, new FlowKt__ShareKt$launchSharingDeferred$1(flow, completableDeferred, null), 2, null);
    }

    public static final <T> SharedFlow<T> onSubscription(SharedFlow<? extends T> sharedFlow, p pVar) {
        return new SubscribedSharedFlow(sharedFlow, pVar);
    }

    public static final <T> SharedFlow<T> shareIn(Flow<? extends T> flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, int i10) {
        SharingConfig sharingConfigConfigureSharing$FlowKt__ShareKt = configureSharing$FlowKt__ShareKt(flow, i10);
        MutableSharedFlow MutableSharedFlow = SharedFlowKt.MutableSharedFlow(i10, sharingConfigConfigureSharing$FlowKt__ShareKt.extraBufferCapacity, sharingConfigConfigureSharing$FlowKt__ShareKt.onBufferOverflow);
        return new ReadonlySharedFlow(MutableSharedFlow, launchSharing$FlowKt__ShareKt(coroutineScope, sharingConfigConfigureSharing$FlowKt__ShareKt.context, sharingConfigConfigureSharing$FlowKt__ShareKt.upstream, MutableSharedFlow, sharingStarted, SharedFlowKt.NO_VALUE));
    }

    public static /* synthetic */ SharedFlow shareIn$default(Flow flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return FlowKt.shareIn(flow, coroutineScope, sharingStarted, i10);
    }

    public static final <T> StateFlow<T> stateIn(Flow<? extends T> flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, T t10) {
        SharingConfig sharingConfigConfigureSharing$FlowKt__ShareKt = configureSharing$FlowKt__ShareKt(flow, 1);
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(t10);
        return new ReadonlyStateFlow(MutableStateFlow, launchSharing$FlowKt__ShareKt(coroutineScope, sharingConfigConfigureSharing$FlowKt__ShareKt.context, sharingConfigConfigureSharing$FlowKt__ShareKt.upstream, MutableStateFlow, sharingStarted, t10));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object stateIn(kotlinx.coroutines.flow.Flow<? extends T> r4, kotlinx.coroutines.CoroutineScope r5, zu.d<? super kotlinx.coroutines.flow.StateFlow<? extends T>> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ShareKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ShareKt$stateIn$1 r0 = (kotlinx.coroutines.flow.FlowKt__ShareKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ShareKt$stateIn$1 r0 = new kotlinx.coroutines.flow.FlowKt__ShareKt$stateIn$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r6)
            goto L58
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            tu.a0.throwOnFailure(r6)
            kotlinx.coroutines.flow.SharingConfig r4 = configureSharing$FlowKt__ShareKt(r4, r3)
            zu.m r6 = r5.getCoroutineContext()
            kotlinx.coroutines.Job$Key r2 = kotlinx.coroutines.Job.Key
            zu.k r6 = r6.get(r2)
            kotlinx.coroutines.Job r6 = (kotlinx.coroutines.Job) r6
            kotlinx.coroutines.CompletableDeferred r6 = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred(r6)
            zu.m r2 = r4.context
            kotlinx.coroutines.flow.Flow<T> r4 = r4.upstream
            launchSharingDeferred$FlowKt__ShareKt(r5, r2, r4, r6)
            r0.label = r3
            java.lang.Object r6 = r6.await(r0)
            if (r6 != r1) goto L58
            return r1
        L58:
            tu.z r6 = (tu.z) r6
            java.lang.Object r4 = r6.m7139unboximpl()
            tu.a0.throwOnFailure(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt.stateIn(kotlinx.coroutines.flow.Flow, kotlinx.coroutines.CoroutineScope, zu.d):java.lang.Object");
    }
}
