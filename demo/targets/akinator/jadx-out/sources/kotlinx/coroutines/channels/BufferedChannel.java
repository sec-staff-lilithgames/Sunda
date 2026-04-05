package kotlinx.coroutines.channels;

import bv.h;
import com.ironsource.C3191e4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.h1;
import kotlin.jvm.internal.u;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause1Impl;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import kv.l;
import kv.p;
import kv.q;
import kv.r;
import p0.o2;
import tu.a0;
import tu.x0;
import tu.z;
import uu.p0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class BufferedChannel<E> implements Channel<E> {
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private final int capacity;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final l onUndeliveredElement;
    private final q onUndeliveredElementReceiveCancellationConstructor;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    private static final /* synthetic */ AtomicLongFieldUpdater sendersAndCloseStatus$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "sendersAndCloseStatus$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater receivers$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "receivers$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater bufferEnd$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "bufferEnd$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater completedExpandBuffersAndPauseFlag$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "completedExpandBuffersAndPauseFlag$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater sendSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "sendSegment$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater receiveSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "receiveSegment$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater bufferEndSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "bufferEndSegment$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater _closeCause$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "_closeCause$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater closeHandler$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "closeHandler$volatile");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class BufferedChannelIterator implements ChannelIterator<E>, Waiter {
        private CancellableContinuationImpl<? super Boolean> continuation;
        private Object receiveResult = BufferedChannelKt.NO_RECEIVE_RESULT;

        public BufferedChannelIterator() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object hasNextOnNoWaiterSuspend(ChannelSegment<E> channelSegment, int i10, long j10, zu.d<? super Boolean> dVar) throws Throwable {
            Boolean boolBoxBoolean;
            l lVar;
            ChannelSegment channelSegmentFindSegmentReceive;
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(av.b.intercepted(dVar));
            try {
                this.continuation = orCreateCancellableContinuation;
                try {
                    Object objUpdateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i10, j10, this);
                    if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                        bufferedChannel.prepareReceiverForSuspension(this, channelSegment, i10);
                    } else {
                        q qVarBindCancellationFun = null;
                        if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                            if (j10 < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                                channelSegment.cleanPrev();
                            }
                            ChannelSegment channelSegment2 = (ChannelSegment) BufferedChannel.getReceiveSegment$volatile$FU().get(bufferedChannel);
                            while (true) {
                                if (bufferedChannel.isClosedForReceive()) {
                                    onClosedHasNextNoWaiterSuspend();
                                    break;
                                }
                                long andIncrement = BufferedChannel.getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
                                int i11 = BufferedChannelKt.SEGMENT_SIZE;
                                long j11 = andIncrement / i11;
                                int i12 = (int) (andIncrement % i11);
                                if (channelSegment2.f71893id != j11) {
                                    channelSegmentFindSegmentReceive = bufferedChannel.findSegmentReceive(j11, channelSegment2);
                                    if (channelSegmentFindSegmentReceive == null) {
                                    }
                                } else {
                                    channelSegmentFindSegmentReceive = channelSegment2;
                                }
                                objUpdateCellReceive = bufferedChannel.updateCellReceive(channelSegmentFindSegmentReceive, i12, andIncrement, this);
                                if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                                    bufferedChannel.prepareReceiverForSuspension(this, channelSegmentFindSegmentReceive, i12);
                                    break;
                                }
                                if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                                    if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                                        channelSegmentFindSegmentReceive.cleanPrev();
                                    }
                                    channelSegment2 = channelSegmentFindSegmentReceive;
                                } else {
                                    if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    channelSegmentFindSegmentReceive.cleanPrev();
                                    this.receiveResult = objUpdateCellReceive;
                                    this.continuation = null;
                                    boolBoxBoolean = bv.b.boxBoolean(true);
                                    lVar = bufferedChannel.onUndeliveredElement;
                                    if (lVar != null) {
                                    }
                                }
                            }
                            orCreateCancellableContinuation.resume((CancellableContinuationImpl) boolBoxBoolean, qVarBindCancellationFun);
                        } else {
                            channelSegment.cleanPrev();
                            this.receiveResult = objUpdateCellReceive;
                            this.continuation = null;
                            boolBoxBoolean = bv.b.boxBoolean(true);
                            lVar = bufferedChannel.onUndeliveredElement;
                            if (lVar != null) {
                                qVarBindCancellationFun = bufferedChannel.bindCancellationFun(lVar, objUpdateCellReceive);
                            }
                            orCreateCancellableContinuation.resume((CancellableContinuationImpl) boolBoxBoolean, qVarBindCancellationFun);
                        }
                    }
                    Object result = orCreateCancellableContinuation.getResult();
                    if (result == av.e.getCOROUTINE_SUSPENDED()) {
                        h.probeCoroutineSuspended(dVar);
                    }
                    return result;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }

        private final boolean onClosedHasNext() throws Throwable {
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                return false;
            }
            throw StackTraceRecoveryKt.recoverStackTrace(closeCause);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void onClosedHasNextNoWaiterSuspend() {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            e0.checkNotNull(cancellableContinuationImpl);
            this.continuation = null;
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                int i10 = z.f87419c;
                cancellableContinuationImpl.resumeWith(z.m7131constructorimpl(Boolean.FALSE));
            } else {
                int i11 = z.f87419c;
                cancellableContinuationImpl.resumeWith(z.m7131constructorimpl(a0.createFailure(closeCause)));
            }
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public Object hasNext(zu.d<? super Boolean> dVar) throws Throwable {
            ChannelSegment<E> channelSegmentFindSegmentReceive;
            boolean zOnClosedHasNext = true;
            if (this.receiveResult == BufferedChannelKt.NO_RECEIVE_RESULT || this.receiveResult == BufferedChannelKt.getCHANNEL_CLOSED()) {
                BufferedChannel<E> bufferedChannel = BufferedChannel.this;
                ChannelSegment<E> channelSegment = (ChannelSegment) BufferedChannel.getReceiveSegment$volatile$FU().get(bufferedChannel);
                while (!bufferedChannel.isClosedForReceive()) {
                    long andIncrement = BufferedChannel.getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
                    int i10 = BufferedChannelKt.SEGMENT_SIZE;
                    long j10 = andIncrement / i10;
                    int i11 = (int) (andIncrement % i10);
                    if (channelSegment.f71893id != j10) {
                        channelSegmentFindSegmentReceive = bufferedChannel.findSegmentReceive(j10, channelSegment);
                        if (channelSegmentFindSegmentReceive == null) {
                            continue;
                        }
                    } else {
                        channelSegmentFindSegmentReceive = channelSegment;
                    }
                    Object objUpdateCellReceive = bufferedChannel.updateCellReceive(channelSegmentFindSegmentReceive, i11, andIncrement, null);
                    if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                        throw new IllegalStateException("unreachable");
                    }
                    if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                        if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                            channelSegmentFindSegmentReceive.cleanPrev();
                        }
                        channelSegment = channelSegmentFindSegmentReceive;
                    } else {
                        if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                            return hasNextOnNoWaiterSuspend(channelSegmentFindSegmentReceive, i11, andIncrement, dVar);
                        }
                        channelSegmentFindSegmentReceive.cleanPrev();
                        this.receiveResult = objUpdateCellReceive;
                    }
                }
                zOnClosedHasNext = onClosedHasNext();
            }
            return bv.b.boxBoolean(zOnClosedHasNext);
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> segment, int i10) {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            if (cancellableContinuationImpl != null) {
                cancellableContinuationImpl.invokeOnCancellation(segment, i10);
            }
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        @tu.f
        public /* synthetic */ Object next(zu.d dVar) {
            return ChannelIterator.DefaultImpls.next(this, dVar);
        }

        public final boolean tryResumeHasNext(E e10) {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            e0.checkNotNull(cancellableContinuationImpl);
            this.continuation = null;
            this.receiveResult = e10;
            Boolean bool = Boolean.TRUE;
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            l lVar = bufferedChannel.onUndeliveredElement;
            return BufferedChannelKt.tryResume0(cancellableContinuationImpl, bool, lVar != null ? bufferedChannel.bindCancellationFun(lVar, e10) : null);
        }

        public final void tryResumeHasNextOnClosedChannel() {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            e0.checkNotNull(cancellableContinuationImpl);
            this.continuation = null;
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                int i10 = z.f87419c;
                cancellableContinuationImpl.resumeWith(z.m7131constructorimpl(Boolean.FALSE));
            } else {
                int i11 = z.f87419c;
                cancellableContinuationImpl.resumeWith(z.m7131constructorimpl(a0.createFailure(closeCause)));
            }
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public E next() throws Throwable {
            E e10 = (E) this.receiveResult;
            if (e10 == BufferedChannelKt.NO_RECEIVE_RESULT) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.receiveResult = BufferedChannelKt.NO_RECEIVE_RESULT;
            if (e10 != BufferedChannelKt.getCHANNEL_CLOSED()) {
                return e10;
            }
            throw StackTraceRecoveryKt.recoverStackTrace(BufferedChannel.this.getReceiveException());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class SendBroadcast implements Waiter {
        private final /* synthetic */ CancellableContinuationImpl<Boolean> $$delegate_0;
        private final CancellableContinuation<Boolean> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public SendBroadcast(CancellableContinuation<? super Boolean> cancellableContinuation) {
            e0.checkNotNull(cancellableContinuation, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlin.Boolean>");
            this.$$delegate_0 = (CancellableContinuationImpl) cancellableContinuation;
            this.cont = cancellableContinuation;
        }

        public final CancellableContinuation<Boolean> getCont() {
            return this.cont;
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> segment, int i10) {
            this.$$delegate_0.invokeOnCancellation(segment, i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: kotlinx.coroutines.channels.BufferedChannel$bindCancellationFun$2, reason: invalid class name */
    public /* synthetic */ class AnonymousClass2 extends kotlin.jvm.internal.a0 implements q {
        public AnonymousClass2(Object obj) {
            super(3, obj, BufferedChannel.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        @Override // kv.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((Throwable) obj, (Throwable) obj2, (m) obj3);
            return x0.f87415a;
        }

        public final void invoke(Throwable th2, E e10, m mVar) {
            ((BufferedChannel) this.receiver).onCancellationImplDoNotCall(th2, e10, mVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: kotlinx.coroutines.channels.BufferedChannel$bindCancellationFunResult$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.a0 implements q {
        public AnonymousClass1(Object obj) {
            super(3, obj, BufferedChannel.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        @Override // kv.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m5148invoke5_sEAP8((Throwable) obj, ((ChannelResult) obj2).m5165unboximpl(), (m) obj3);
            return x0.f87415a;
        }

        /* renamed from: invoke-5_sEAP8, reason: not valid java name */
        public final void m5148invoke5_sEAP8(Throwable th2, Object obj, m mVar) {
            ((BufferedChannel) this.receiver).m5142onCancellationChannelResultImplDoNotCall5_sEAP8(th2, obj, mVar);
        }
    }

    public BufferedChannel(int i10, l lVar) {
        this.capacity = i10;
        this.onUndeliveredElement = lVar;
        if (i10 < 0) {
            throw new IllegalArgumentException(o2.k(i10, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        this.bufferEnd$volatile = BufferedChannelKt.initialBufferEnd(i10);
        this.completedExpandBuffersAndPauseFlag$volatile = getBufferEndCounter();
        ChannelSegment channelSegment = new ChannelSegment(0L, null, this, 3);
        this.sendSegment$volatile = channelSegment;
        this.receiveSegment$volatile = channelSegment;
        if (isRendezvousOrUnlimited()) {
            channelSegment = BufferedChannelKt.NULL_SEGMENT;
            e0.checkNotNull(channelSegment, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = channelSegment;
        this.onUndeliveredElementReceiveCancellationConstructor = lVar != null ? new q() { // from class: kotlinx.coroutines.channels.b
            @Override // kv.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BufferedChannel.onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56(this.f71881b, (SelectInstance) obj, obj2, obj3);
            }
        } : null;
        this._closeCause$volatile = BufferedChannelKt.NO_CLOSE_CAUSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q bindCancellationFun(final l lVar, final E e10) {
        return new q() { // from class: kotlinx.coroutines.channels.c
            @Override // kv.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BufferedChannel.bindCancellationFun$lambda$89(lVar, e10, (Throwable) obj, obj2, (m) obj3);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 bindCancellationFun$lambda$89(l lVar, Object obj, Throwable th2, Object obj2, m mVar) {
        OnUndeliveredElementKt.callUndeliveredElement(lVar, obj, mVar);
        return x0.f87415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KFunction<x0> bindCancellationFunResult(l lVar) {
        return new AnonymousClass1(this);
    }

    private final boolean bufferOrRendezvousSend(long j10) {
        return j10 < getBufferEndCounter() || j10 < getReceiversCounter$kotlinx_coroutines_core() + ((long) this.capacity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void cancelSuspendedReceiveRequests(ChannelSegment<E> channelSegment, long j10) {
        Object objM5188constructorimpl$default = InlineList.m5188constructorimpl$default(null, 1, null);
        loop0: while (channelSegment != null) {
            for (int i10 = BufferedChannelKt.SEGMENT_SIZE - 1; -1 < i10; i10--) {
                if ((channelSegment.f71893id * BufferedChannelKt.SEGMENT_SIZE) + i10 < j10) {
                    break loop0;
                }
                while (true) {
                    Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i10);
                    if (state$kotlinx_coroutines_core != null && state$kotlinx_coroutines_core != BufferedChannelKt.IN_BUFFER) {
                        if (!(state$kotlinx_coroutines_core instanceof WaiterEB)) {
                            if (!(state$kotlinx_coroutines_core instanceof Waiter)) {
                                break;
                            }
                            if (channelSegment.casState$kotlinx_coroutines_core(i10, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                objM5188constructorimpl$default = InlineList.m5193plusFjFbRPM(objM5188constructorimpl$default, state$kotlinx_coroutines_core);
                                channelSegment.onCancelledRequest(i10, true);
                                break;
                            }
                        } else {
                            if (channelSegment.casState$kotlinx_coroutines_core(i10, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                objM5188constructorimpl$default = InlineList.m5193plusFjFbRPM(objM5188constructorimpl$default, ((WaiterEB) state$kotlinx_coroutines_core).waiter);
                                channelSegment.onCancelledRequest(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (channelSegment.casState$kotlinx_coroutines_core(i10, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                            channelSegment.onSlotCleaned();
                            break;
                        }
                    }
                }
            }
            channelSegment = (ChannelSegment) channelSegment.getPrev();
        }
        if (objM5188constructorimpl$default != null) {
            if (!(objM5188constructorimpl$default instanceof ArrayList)) {
                resumeReceiverOnClosedChannel((Waiter) objM5188constructorimpl$default);
                return;
            }
            e0.checkNotNull(objM5188constructorimpl$default, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) objM5188constructorimpl$default;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                resumeReceiverOnClosedChannel((Waiter) arrayList.get(size));
            }
        }
    }

    private final ChannelSegment<E> closeLinkedList() {
        Object obj = bufferEndSegment$volatile$FU.get(this);
        ChannelSegment channelSegment = (ChannelSegment) sendSegment$volatile$FU.get(this);
        if (channelSegment.f71893id > ((ChannelSegment) obj).f71893id) {
            obj = channelSegment;
        }
        ChannelSegment channelSegment2 = (ChannelSegment) receiveSegment$volatile$FU.get(this);
        if (channelSegment2.f71893id > ((ChannelSegment) obj).f71893id) {
            obj = channelSegment2;
        }
        return (ChannelSegment) ConcurrentLinkedListKt.close((ConcurrentLinkedListNode) obj);
    }

    private final void completeCancel(long j10) {
        removeUnprocessedElements(completeClose(j10));
    }

    private final ChannelSegment<E> completeClose(long j10) {
        ChannelSegment<E> channelSegmentCloseLinkedList = closeLinkedList();
        if (isConflatedDropOldest()) {
            long jMarkAllEmptyCellsAsClosed = markAllEmptyCellsAsClosed(channelSegmentCloseLinkedList);
            if (jMarkAllEmptyCellsAsClosed != -1) {
                dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(jMarkAllEmptyCellsAsClosed);
            }
        }
        cancelSuspendedReceiveRequests(channelSegmentCloseLinkedList, j10);
        return channelSegmentCloseLinkedList;
    }

    private final void completeCloseOrCancel() {
        isClosedForSend();
    }

    private final void expandBuffer() {
        if (isRendezvousOrUnlimited()) {
            return;
        }
        ChannelSegment<E> channelSegment = (ChannelSegment) bufferEndSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = bufferEnd$volatile$FU.getAndIncrement(this);
            int i10 = BufferedChannelKt.SEGMENT_SIZE;
            long j10 = andIncrement / i10;
            if (getSendersCounter$kotlinx_coroutines_core() <= andIncrement) {
                if (channelSegment.f71893id < j10 && channelSegment.getNext() != 0) {
                    moveSegmentBufferEndToSpecifiedOrLast(j10, channelSegment);
                }
                incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
                return;
            }
            if (channelSegment.f71893id != j10) {
                ChannelSegment<E> channelSegmentFindSegmentBufferEnd = findSegmentBufferEnd(j10, channelSegment, andIncrement);
                if (channelSegmentFindSegmentBufferEnd == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentBufferEnd;
                }
            }
            if (updateCellExpandBuffer(channelSegment, (int) (andIncrement % i10), andIncrement)) {
                incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
                return;
            }
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
        }
    }

    private final ChannelSegment<E> findSegmentBufferEnd(long j10, ChannelSegment<E> channelSegment, long j11) {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bufferEndSegment$volatile$FU;
        p pVar = (p) BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(channelSegment, j10, pVar);
            if (!SegmentOrClosed.m5205isClosedimpl(objFindSegmentInternal)) {
                Segment segmentM5203getSegmentimpl = SegmentOrClosed.m5203getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.f71893id >= segmentM5203getSegmentimpl.f71893id) {
                        break loop0;
                    }
                    if (!segmentM5203getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, segment, segmentM5203getSegmentimpl)) {
                        if (atomicReferenceFieldUpdater.get(this) != segment) {
                            if (segmentM5203getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                                segmentM5203getSegmentimpl.remove();
                            }
                        }
                    }
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (SegmentOrClosed.m5205isClosedimpl(objFindSegmentInternal)) {
            completeCloseOrCancel();
            moveSegmentBufferEndToSpecifiedOrLast(j10, channelSegment);
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
            return null;
        }
        ChannelSegment<E> channelSegment2 = (ChannelSegment) SegmentOrClosed.m5203getSegmentimpl(objFindSegmentInternal);
        if (channelSegment2.f71893id <= j10) {
            return channelSegment2;
        }
        long j12 = channelSegment2.f71893id;
        int i10 = BufferedChannelKt.SEGMENT_SIZE;
        if (bufferEnd$volatile$FU.compareAndSet(this, j11 + 1, j12 * i10)) {
            incCompletedExpandBufferAttempts((channelSegment2.f71893id * i10) - j11);
        } else {
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChannelSegment<E> findSegmentReceive(long j10, ChannelSegment<E> channelSegment) {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = receiveSegment$volatile$FU;
        p pVar = (p) BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(channelSegment, j10, pVar);
            if (!SegmentOrClosed.m5205isClosedimpl(objFindSegmentInternal)) {
                Segment segmentM5203getSegmentimpl = SegmentOrClosed.m5203getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.f71893id >= segmentM5203getSegmentimpl.f71893id) {
                        break loop0;
                    }
                    if (!segmentM5203getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, segment, segmentM5203getSegmentimpl)) {
                        if (atomicReferenceFieldUpdater.get(this) != segment) {
                            if (segmentM5203getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                                segmentM5203getSegmentimpl.remove();
                            }
                        }
                    }
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (SegmentOrClosed.m5205isClosedimpl(objFindSegmentInternal)) {
            completeCloseOrCancel();
            if (channelSegment.f71893id * BufferedChannelKt.SEGMENT_SIZE < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
            return null;
        }
        ChannelSegment<E> channelSegment2 = (ChannelSegment) SegmentOrClosed.m5203getSegmentimpl(objFindSegmentInternal);
        if (!isRendezvousOrUnlimited() && j10 <= getBufferEndCounter() / BufferedChannelKt.SEGMENT_SIZE) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = bufferEndSegment$volatile$FU;
            while (true) {
                Segment segment2 = (Segment) atomicReferenceFieldUpdater2.get(this);
                if (segment2.f71893id >= channelSegment2.f71893id || !channelSegment2.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, segment2, channelSegment2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != segment2) {
                        if (channelSegment2.decPointers$kotlinx_coroutines_core()) {
                            channelSegment2.remove();
                        }
                    }
                }
                if (segment2.decPointers$kotlinx_coroutines_core()) {
                    segment2.remove();
                }
            }
        }
        long j11 = channelSegment2.f71893id;
        if (j11 <= j10) {
            return channelSegment2;
        }
        int i10 = BufferedChannelKt.SEGMENT_SIZE;
        updateReceiversCounterIfLower(j11 * i10);
        if (channelSegment2.f71893id * i10 < getSendersCounter$kotlinx_coroutines_core()) {
            channelSegment2.cleanPrev();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChannelSegment<E> findSegmentSend(long j10, ChannelSegment<E> channelSegment) {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sendSegment$volatile$FU;
        p pVar = (p) BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(channelSegment, j10, pVar);
            if (!SegmentOrClosed.m5205isClosedimpl(objFindSegmentInternal)) {
                Segment segmentM5203getSegmentimpl = SegmentOrClosed.m5203getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.f71893id >= segmentM5203getSegmentimpl.f71893id) {
                        break loop0;
                    }
                    if (!segmentM5203getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, segment, segmentM5203getSegmentimpl)) {
                        if (atomicReferenceFieldUpdater.get(this) != segment) {
                            if (segmentM5203getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                                segmentM5203getSegmentimpl.remove();
                            }
                        }
                    }
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (SegmentOrClosed.m5205isClosedimpl(objFindSegmentInternal)) {
            completeCloseOrCancel();
            if (channelSegment.f71893id * BufferedChannelKt.SEGMENT_SIZE < getReceiversCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
            return null;
        }
        ChannelSegment<E> channelSegment2 = (ChannelSegment) SegmentOrClosed.m5203getSegmentimpl(objFindSegmentInternal);
        long j11 = channelSegment2.f71893id;
        if (j11 <= j10) {
            return channelSegment2;
        }
        int i10 = BufferedChannelKt.SEGMENT_SIZE;
        updateSendersCounterIfLower(j11 * i10);
        if (channelSegment2.f71893id * i10 < getReceiversCounter$kotlinx_coroutines_core()) {
            channelSegment2.cleanPrev();
        }
        return null;
    }

    private final /* synthetic */ Object getAndUpdate$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, l lVar) {
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(obj);
            Object objInvoke = lVar.invoke(obj2);
            while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                    break;
                }
            }
            return obj2;
        }
    }

    private final /* synthetic */ long getBufferEnd$volatile() {
        return this.bufferEnd$volatile;
    }

    private final long getBufferEndCounter() {
        return bufferEnd$volatile$FU.get(this);
    }

    private final /* synthetic */ Object getBufferEndSegment$volatile() {
        return this.bufferEndSegment$volatile;
    }

    private final /* synthetic */ Object getCloseHandler$volatile() {
        return this.closeHandler$volatile;
    }

    private final /* synthetic */ long getCompletedExpandBuffersAndPauseFlag$volatile() {
        return this.completedExpandBuffersAndPauseFlag$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable getReceiveException() {
        Throwable closeCause = getCloseCause();
        return closeCause == null ? new ClosedReceiveChannelException(ChannelsKt.DEFAULT_CLOSE_MESSAGE) : closeCause;
    }

    private final /* synthetic */ Object getReceiveSegment$volatile() {
        return this.receiveSegment$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater getReceiveSegment$volatile$FU() {
        return receiveSegment$volatile$FU;
    }

    private final /* synthetic */ long getReceivers$volatile() {
        return this.receivers$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater getReceivers$volatile$FU() {
        return receivers$volatile$FU;
    }

    private final /* synthetic */ Object getSendSegment$volatile() {
        return this.sendSegment$volatile;
    }

    private final /* synthetic */ long getSendersAndCloseStatus$volatile() {
        return this.sendersAndCloseStatus$volatile;
    }

    private final /* synthetic */ Object get_closeCause$volatile() {
        return this._closeCause$volatile;
    }

    private final void incCompletedExpandBufferAttempts(long j10) {
        if ((completedExpandBuffersAndPauseFlag$volatile$FU.addAndGet(this, j10) & 4611686018427387904L) != 0) {
            while ((completedExpandBuffersAndPauseFlag$volatile$FU.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static /* synthetic */ void incCompletedExpandBufferAttempts$default(BufferedChannel bufferedChannel, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i10 & 1) != 0) {
            j10 = 1;
        }
        bufferedChannel.incCompletedExpandBufferAttempts(j10);
    }

    private final void invokeCloseHandler() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = closeHandler$volatile$FU;
        loop0: while (true) {
            obj = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = obj == null ? BufferedChannelKt.CLOSE_HANDLER_CLOSED : BufferedChannelKt.CLOSE_HANDLER_INVOKED;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, symbol)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
        }
        if (obj == null) {
            return;
        }
        ((l) obj).invoke(getCloseCause());
    }

    private final boolean isCellNonEmpty(ChannelSegment<E> channelSegment, int i10, long j10) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i10);
            if (state$kotlinx_coroutines_core != null && state$kotlinx_coroutines_core != BufferedChannelKt.IN_BUFFER) {
                if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED) {
                    return true;
                }
                if (state$kotlinx_coroutines_core == BufferedChannelKt.INTERRUPTED_SEND || state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED() || state$kotlinx_coroutines_core == BufferedChannelKt.DONE_RCV || state$kotlinx_coroutines_core == BufferedChannelKt.POISONED) {
                    return false;
                }
                if (state$kotlinx_coroutines_core == BufferedChannelKt.RESUMING_BY_EB) {
                    return true;
                }
                return state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_RCV && j10 == getReceiversCounter$kotlinx_coroutines_core();
            }
        } while (!channelSegment.casState$kotlinx_coroutines_core(i10, state$kotlinx_coroutines_core, BufferedChannelKt.POISONED));
        expandBuffer();
        return false;
    }

    private final boolean isClosed(long j10, boolean z10) {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            completeClose(j10 & 1152921504606846975L);
            return (z10 && hasElements$kotlinx_coroutines_core()) ? false : true;
        }
        if (i10 != 3) {
            throw new IllegalStateException(a.b.e(i10, "unexpected close status: ").toString());
        }
        completeCancel(j10 & 1152921504606846975L);
        return true;
    }

    private final boolean isClosedForReceive0(long j10) {
        return isClosed(j10, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isClosedForSend0(long j10) {
        return isClosed(j10, false);
    }

    private final boolean isRendezvousOrUnlimited() {
        long bufferEndCounter = getBufferEndCounter();
        return bufferEndCounter == 0 || bufferEndCounter == Long.MAX_VALUE;
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, l lVar) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Long(AtomicLongFieldUpdater atomicLongFieldUpdater, Object obj, l lVar) {
        while (true) {
            lVar.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r8 = (kotlinx.coroutines.channels.ChannelSegment) r8.getPrev();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long markAllEmptyCellsAsClosed(kotlinx.coroutines.channels.ChannelSegment<E> r8) {
        /*
            r7 = this;
        L0:
            int r0 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.f71893id
            int r5 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.getReceiversCounter$kotlinx_coroutines_core()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.getState$kotlinx_coroutines_core(r0)
            if (r1 == 0) goto L2c
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getIN_BUFFER$p()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            if (r1 != r2) goto L39
            return r3
        L2c:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r1 = r8.casState$kotlinx_coroutines_core(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.onSlotCleaned()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r8 = r8.getPrev()
            kotlinx.coroutines.channels.ChannelSegment r8 = (kotlinx.coroutines.channels.ChannelSegment) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.markAllEmptyCellsAsClosed(kotlinx.coroutines.channels.ChannelSegment):long");
    }

    private final void markCancellationStarted() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j10, 1)));
    }

    private final void markCancelled() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j10 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j10, 3)));
    }

    private final void markClosed() {
        long j10;
        long jConstructSendersAndCloseStatus;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 >> 60);
            if (i10 == 0) {
                jConstructSendersAndCloseStatus = BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j10, 2);
            } else if (i10 != 1) {
                return;
            } else {
                jConstructSendersAndCloseStatus = BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j10, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, jConstructSendersAndCloseStatus));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0011, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void moveSegmentBufferEndToSpecifiedOrLast(long r5, kotlinx.coroutines.channels.ChannelSegment<E> r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f71893id
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = r7.getNext()
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.isRemoved()
            if (r5 == 0) goto L22
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r5 = r7.getNext()
            kotlinx.coroutines.channels.ChannelSegment r5 = (kotlinx.coroutines.channels.ChannelSegment) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = getBufferEndSegment$volatile$FU()
        L26:
            java.lang.Object r6 = r5.get(r4)
            kotlinx.coroutines.internal.Segment r6 = (kotlinx.coroutines.internal.Segment) r6
            long r0 = r6.f71893id
            long r2 = r7.f71893id
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L35
            return
        L35:
            boolean r0 = r7.tryIncPointers$kotlinx_coroutines_core()
            if (r0 != 0) goto L3c
            goto L11
        L3c:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4c
            boolean r5 = r6.decPointers$kotlinx_coroutines_core()
            if (r5 == 0) goto L4b
            r6.remove()
        L4b:
            return
        L4c:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3c
            boolean r6 = r7.decPointers$kotlinx_coroutines_core()
            if (r6 == 0) goto L26
            r7.remove()
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.moveSegmentBufferEndToSpecifiedOrLast(long, kotlinx.coroutines.channels.ChannelSegment):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCancellationChannelResultImplDoNotCall-5_sEAP8, reason: not valid java name */
    public final void m5142onCancellationChannelResultImplDoNotCall5_sEAP8(Throwable th2, Object obj, m mVar) {
        l lVar = this.onUndeliveredElement;
        e0.checkNotNull(lVar);
        Object objM5158getOrNullimpl = ChannelResult.m5158getOrNullimpl(obj);
        e0.checkNotNull(objM5158getOrNullimpl);
        OnUndeliveredElementKt.callUndeliveredElement(lVar, objM5158getOrNullimpl, mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCancellationImplDoNotCall(Throwable th2, E e10, m mVar) {
        l lVar = this.onUndeliveredElement;
        e0.checkNotNull(lVar);
        OnUndeliveredElementKt.callUndeliveredElement(lVar, e10, mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedReceiveCatchingOnNoWaiterSuspend(CancellableContinuation<? super ChannelResult<? extends E>> cancellableContinuation) {
        int i10 = z.f87419c;
        cancellableContinuation.resumeWith(z.m7131constructorimpl(ChannelResult.m5153boximpl(ChannelResult.Companion.m5166closedJP2dKIU(getCloseCause()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedReceiveOnNoWaiterSuspend(CancellableContinuation<? super E> cancellableContinuation) {
        int i10 = z.f87419c;
        cancellableContinuation.resumeWith(z.m7131constructorimpl(a0.createFailure(getReceiveException())));
    }

    private final void onClosedSelectOnReceive(SelectInstance<?> selectInstance) {
        selectInstance.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
    }

    private final void onClosedSelectOnSend(E e10, SelectInstance<?> selectInstance) {
        l lVar = this.onUndeliveredElement;
        if (lVar != null) {
            OnUndeliveredElementKt.callUndeliveredElement(lVar, e10, selectInstance.getContext());
        }
        selectInstance.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onClosedSend(E e10, zu.d<? super x0> dVar) {
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        l lVar = this.onUndeliveredElement;
        if (lVar == null || (undeliveredElementExceptionCallUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(lVar, e10, null, 2, null)) == null) {
            Throwable sendException = getSendException();
            int i10 = z.f87419c;
            cancellableContinuationImpl.resumeWith(z.m7131constructorimpl(a0.createFailure(sendException)));
        } else {
            tu.h.addSuppressed(undeliveredElementExceptionCallUndeliveredElementCatchingException$default, getSendException());
            int i11 = z.f87419c;
            cancellableContinuationImpl.resumeWith(z.m7131constructorimpl(a0.createFailure(undeliveredElementExceptionCallUndeliveredElementCatchingException$default)));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == av.e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return result == av.e.getCOROUTINE_SUSPENDED() ? result : x0.f87415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedSendOnNoWaiterSuspend(E e10, CancellableContinuation<? super x0> cancellableContinuation) {
        l lVar = this.onUndeliveredElement;
        if (lVar != null) {
            OnUndeliveredElementKt.callUndeliveredElement(lVar, e10, cancellableContinuation.getContext());
        }
        Throwable sendException = getSendException();
        int i10 = z.f87419c;
        cancellableContinuation.resumeWith(z.m7131constructorimpl(a0.createFailure(sendException)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56(final BufferedChannel bufferedChannel, final SelectInstance selectInstance, Object obj, final Object obj2) {
        return new q(bufferedChannel) { // from class: kotlinx.coroutines.channels.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BufferedChannel f71879c;

            {
                this.f71879c = bufferedChannel;
            }

            @Override // kv.q
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return BufferedChannel.onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56$lambda$55(obj2, this.f71879c, selectInstance, (Throwable) obj3, obj4, (m) obj5);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56$lambda$55(Object obj, BufferedChannel bufferedChannel, SelectInstance selectInstance, Throwable th2, Object obj2, m mVar) {
        if (obj != BufferedChannelKt.getCHANNEL_CLOSED()) {
            OnUndeliveredElementKt.callUndeliveredElement(bufferedChannel.onUndeliveredElement, obj, selectInstance.getContext());
        }
        return x0.f87415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareReceiverForSuspension(Waiter waiter, ChannelSegment<E> channelSegment, int i10) {
        onReceiveEnqueued();
        waiter.invokeOnCancellation(channelSegment, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareSenderForSuspension(Waiter waiter, ChannelSegment<E> channelSegment, int i10) {
        waiter.invokeOnCancellation(channelSegment, i10 + BufferedChannelKt.SEGMENT_SIZE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectReceive(Object obj, Object obj2) throws Throwable {
        if (obj2 != BufferedChannelKt.getCHANNEL_CLOSED()) {
            return obj2;
        }
        throw getReceiveException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectReceiveCatching(Object obj, Object obj2) {
        return ChannelResult.m5153boximpl(obj2 == BufferedChannelKt.getCHANNEL_CLOSED() ? ChannelResult.Companion.m5166closedJP2dKIU(getCloseCause()) : ChannelResult.Companion.m5168successJP2dKIU(obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectReceiveOrNull(Object obj, Object obj2) throws Throwable {
        if (obj2 != BufferedChannelKt.getCHANNEL_CLOSED()) {
            return obj2;
        }
        if (getCloseCause() == null) {
            return null;
        }
        throw getReceiveException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectSend(Object obj, Object obj2) throws Throwable {
        if (obj2 != BufferedChannelKt.getCHANNEL_CLOSED()) {
            return this;
        }
        throw getSendException();
    }

    public static /* synthetic */ <E> Object receive$suspendImpl(BufferedChannel<E> bufferedChannel, zu.d<? super E> dVar) throws Throwable {
        ChannelSegment<E> channelSegment;
        ChannelSegment<E> channelSegment2 = (ChannelSegment) getReceiveSegment$volatile$FU().get(bufferedChannel);
        while (!bufferedChannel.isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
            int i10 = BufferedChannelKt.SEGMENT_SIZE;
            long j10 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (channelSegment2.f71893id != j10) {
                ChannelSegment<E> channelSegmentFindSegmentReceive = bufferedChannel.findSegmentReceive(j10, channelSegment2);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            BufferedChannel<E> bufferedChannel2 = bufferedChannel;
            Object objUpdateCellReceive = bufferedChannel2.updateCellReceive(channelSegment, i11, andIncrement, null);
            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                throw new IllegalStateException("unexpected");
            }
            if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                    return bufferedChannel2.receiveOnNoWaiterSuspend(channelSegment, i11, andIncrement, dVar);
                }
                channelSegment.cleanPrev();
                return objUpdateCellReceive;
            }
            if (andIncrement < bufferedChannel2.getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
            bufferedChannel = bufferedChannel2;
            channelSegment2 = channelSegment;
        }
        throw StackTraceRecoveryKt.recoverStackTrace(bufferedChannel.getReceiveException());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Type inference failed for: r14v12, types: [kotlinx.coroutines.channels.ChannelResult$Companion] */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.channels.BufferedChannel] */
    /* renamed from: receiveCatching-JP2dKIU$suspendImpl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ <E> java.lang.Object m5143receiveCatchingJP2dKIU$suspendImpl(kotlinx.coroutines.channels.BufferedChannel<E> r13, zu.d<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> r14) throws java.lang.Throwable {
        /*
            boolean r0 = r14 instanceof kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            if (r0 == 0) goto L14
            r0 = r14
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = (kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = new kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.result
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            tu.a0.throwOnFailure(r14)
            kotlinx.coroutines.channels.ChannelResult r14 = (kotlinx.coroutines.channels.ChannelResult) r14
            java.lang.Object r13 = r14.m5165unboximpl()
            return r13
        L31:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L39:
            tu.a0.throwOnFailure(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = access$getReceiveSegment$volatile$FU()
            java.lang.Object r14 = r14.get(r13)
            kotlinx.coroutines.channels.ChannelSegment r14 = (kotlinx.coroutines.channels.ChannelSegment) r14
        L46:
            boolean r1 = r13.isClosedForReceive()
            if (r1 == 0) goto L57
            kotlinx.coroutines.channels.ChannelResult$Companion r14 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Throwable r13 = r13.getCloseCause()
            java.lang.Object r13 = r14.m5166closedJP2dKIU(r13)
            return r13
        L57:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = access$getReceivers$volatile$FU()
            long r4 = r1.getAndIncrement(r13)
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r7 = (long) r1
            long r7 = r4 / r7
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.f71893id
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L77
            kotlinx.coroutines.channels.ChannelSegment r1 = access$findSegmentReceive(r13, r7, r14)
            if (r1 != 0) goto L75
            goto L46
        L75:
            r8 = r1
            goto L78
        L77:
            r8 = r14
        L78:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = access$updateCellReceive(r7, r8, r9, r10, r12)
            r1 = r7
            kotlinx.coroutines.internal.Symbol r14 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND$p()
            if (r13 == r14) goto Lb6
            kotlinx.coroutines.internal.Symbol r14 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()
            if (r13 != r14) goto L9b
            long r13 = r1.getSendersCounter$kotlinx_coroutines_core()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L98
            r8.cleanPrev()
        L98:
            r13 = r1
            r14 = r8
            goto L46
        L9b:
            kotlinx.coroutines.internal.Symbol r14 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()
            if (r13 != r14) goto Lac
            r6.label = r2
            r2 = r8
            java.lang.Object r13 = r1.m5144receiveCatchingOnNoWaiterSuspendGKJJFZk(r2, r3, r4, r6)
            if (r13 != r0) goto Lab
            return r0
        Lab:
            return r13
        Lac:
            r8.cleanPrev()
            kotlinx.coroutines.channels.ChannelResult$Companion r14 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r13 = r14.m5168successJP2dKIU(r13)
            return r13
        Lb6:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.m5143receiveCatchingJP2dKIU$suspendImpl(kotlinx.coroutines.channels.BufferedChannel, zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: receiveCatchingOnNoWaiterSuspend-GKJJFZk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5144receiveCatchingOnNoWaiterSuspendGKJJFZk(kotlinx.coroutines.channels.ChannelSegment<E> r11, int r12, long r13, zu.d<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.m5144receiveCatchingOnNoWaiterSuspendGKJJFZk(kotlinx.coroutines.channels.ChannelSegment, int, long, zu.d):java.lang.Object");
    }

    private final <R> R receiveImpl(Object obj, l lVar, q qVar, kv.a aVar, q qVar2) {
        ChannelSegment channelSegment;
        ChannelSegment channelSegment2 = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
        while (!isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
            int i10 = BufferedChannelKt.SEGMENT_SIZE;
            long j10 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (channelSegment2.f71893id != j10) {
                ChannelSegment channelSegmentFindSegmentReceive = findSegmentReceive(j10, channelSegment2);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            Object obj2 = obj;
            Object objUpdateCellReceive = updateCellReceive(channelSegment, i11, andIncrement, obj2);
            channelSegment2 = channelSegment;
            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                Waiter waiter = obj2 instanceof Waiter ? (Waiter) obj2 : null;
                if (waiter != null) {
                    prepareReceiverForSuspension(waiter, channelSegment2, i11);
                }
                return (R) qVar.invoke(channelSegment2, Integer.valueOf(i11), Long.valueOf(andIncrement));
            }
            if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                    return (R) qVar2.invoke(channelSegment2, Integer.valueOf(i11), Long.valueOf(andIncrement));
                }
                channelSegment2.cleanPrev();
                return (R) lVar.invoke(objUpdateCellReceive);
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment2.cleanPrev();
            }
            obj = obj2;
        }
        return (R) aVar.invoke();
    }

    public static /* synthetic */ Object receiveImpl$default(BufferedChannel bufferedChannel, Object obj, l lVar, q qVar, kv.a aVar, q qVar2, int i10, Object obj2) {
        ChannelSegment channelSegment;
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: receiveImpl");
        }
        if ((i10 & 16) != 0) {
            qVar2 = new q() { // from class: kotlinx.coroutines.channels.BufferedChannel.receiveImpl.1
                @Override // kv.q
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                    return invoke((ChannelSegment) obj3, ((Number) obj4).intValue(), ((Number) obj5).longValue());
                }

                public final Void invoke(ChannelSegment<E> channelSegment2, int i11, long j10) {
                    throw new IllegalStateException("unexpected");
                }
            };
        }
        ChannelSegment channelSegment2 = (ChannelSegment) getReceiveSegment$volatile$FU().get(bufferedChannel);
        while (!bufferedChannel.isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
            int i11 = BufferedChannelKt.SEGMENT_SIZE;
            long j10 = andIncrement / i11;
            int i12 = (int) (andIncrement % i11);
            if (channelSegment2.f71893id != j10) {
                ChannelSegment channelSegmentFindSegmentReceive = bufferedChannel.findSegmentReceive(j10, channelSegment2);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            BufferedChannel bufferedChannel2 = bufferedChannel;
            Object obj3 = obj;
            Object objUpdateCellReceive = bufferedChannel2.updateCellReceive(channelSegment, i12, andIncrement, obj3);
            channelSegment2 = channelSegment;
            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                Waiter waiter = obj3 instanceof Waiter ? (Waiter) obj3 : null;
                if (waiter != null) {
                    bufferedChannel2.prepareReceiverForSuspension(waiter, channelSegment2, i12);
                }
                return qVar.invoke(channelSegment2, Integer.valueOf(i12), Long.valueOf(andIncrement));
            }
            if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                    return qVar2.invoke(channelSegment2, Integer.valueOf(i12), Long.valueOf(andIncrement));
                }
                channelSegment2.cleanPrev();
                return lVar.invoke(objUpdateCellReceive);
            }
            if (andIncrement < bufferedChannel2.getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment2.cleanPrev();
            }
            bufferedChannel = bufferedChannel2;
            obj = obj3;
        }
        return aVar.invoke();
    }

    private final void receiveImplOnNoWaiter(ChannelSegment<E> channelSegment, int i10, long j10, Waiter waiter, l lVar, kv.a aVar) {
        ChannelSegment channelSegment2;
        Object objUpdateCellReceive = updateCellReceive(channelSegment, i10, j10, waiter);
        BufferedChannel<E> bufferedChannel = this;
        if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
            prepareReceiverForSuspension(waiter, channelSegment, i10);
            return;
        }
        if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
            channelSegment.cleanPrev();
            lVar.invoke(objUpdateCellReceive);
            return;
        }
        if (j10 < getSendersCounter$kotlinx_coroutines_core()) {
            channelSegment.cleanPrev();
        }
        ChannelSegment channelSegment3 = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
        while (!isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
            int i11 = BufferedChannelKt.SEGMENT_SIZE;
            long j11 = andIncrement / i11;
            int i12 = (int) (andIncrement % i11);
            if (channelSegment3.f71893id != j11) {
                ChannelSegment channelSegmentFindSegmentReceive = findSegmentReceive(j11, channelSegment3);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment2 = channelSegmentFindSegmentReceive;
                }
            } else {
                channelSegment2 = channelSegment3;
            }
            BufferedChannel<E> bufferedChannel2 = bufferedChannel;
            Object objUpdateCellReceive2 = bufferedChannel2.updateCellReceive(channelSegment2, i12, andIncrement, waiter);
            channelSegment3 = channelSegment2;
            if (objUpdateCellReceive2 == BufferedChannelKt.SUSPEND) {
                Waiter waiter2 = waiter != null ? waiter : null;
                if (waiter2 != null) {
                    prepareReceiverForSuspension(waiter2, channelSegment3, i12);
                    return;
                }
                return;
            }
            if (objUpdateCellReceive2 != BufferedChannelKt.FAILED) {
                if (objUpdateCellReceive2 == BufferedChannelKt.SUSPEND_NO_WAITER) {
                    throw new IllegalStateException("unexpected");
                }
                channelSegment3.cleanPrev();
                lVar.invoke(objUpdateCellReceive2);
                return;
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment3.cleanPrev();
            }
            bufferedChannel = bufferedChannel2;
        }
        aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object receiveOnNoWaiterSuspend(ChannelSegment<E> channelSegment, int i10, long j10, zu.d<? super E> dVar) {
        ChannelSegment channelSegment2;
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(av.b.intercepted(dVar));
        try {
            Object objUpdateCellReceive = updateCellReceive(channelSegment, i10, j10, orCreateCancellableContinuation);
            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                prepareReceiverForSuspension(orCreateCancellableContinuation, channelSegment, i10);
            } else {
                KFunction kFunctionBindCancellationFun = null;
                kFunctionBindCancellationFun = null;
                if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                    if (j10 < getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    ChannelSegment channelSegment3 = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
                    while (true) {
                        if (isClosedForReceive()) {
                            onClosedReceiveOnNoWaiterSuspend(orCreateCancellableContinuation);
                            break;
                        }
                        long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
                        int i11 = BufferedChannelKt.SEGMENT_SIZE;
                        long j11 = andIncrement / i11;
                        int i12 = (int) (andIncrement % i11);
                        if (channelSegment3.f71893id != j11) {
                            ChannelSegment channelSegmentFindSegmentReceive = findSegmentReceive(j11, channelSegment3);
                            if (channelSegmentFindSegmentReceive != null) {
                                channelSegment2 = channelSegmentFindSegmentReceive;
                            }
                        } else {
                            channelSegment2 = channelSegment3;
                        }
                        objUpdateCellReceive = updateCellReceive(channelSegment2, i12, andIncrement, orCreateCancellableContinuation);
                        ChannelSegment channelSegment4 = channelSegment2;
                        if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                            CancellableContinuationImpl cancellableContinuationImpl = orCreateCancellableContinuation != null ? orCreateCancellableContinuation : null;
                            if (cancellableContinuationImpl != null) {
                                prepareReceiverForSuspension(cancellableContinuationImpl, channelSegment4, i12);
                            }
                        } else if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                                channelSegment4.cleanPrev();
                            }
                            channelSegment3 = channelSegment4;
                        } else {
                            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                                throw new IllegalStateException("unexpected");
                            }
                            channelSegment4.cleanPrev();
                            l lVar = this.onUndeliveredElement;
                            if (lVar != null) {
                                kFunctionBindCancellationFun = bindCancellationFun(lVar);
                            }
                        }
                    }
                } else {
                    channelSegment.cleanPrev();
                    l lVar2 = this.onUndeliveredElement;
                    if (lVar2 != null) {
                        kFunctionBindCancellationFun = bindCancellationFun(lVar2);
                    }
                }
                orCreateCancellableContinuation.resume((CancellableContinuationImpl) objUpdateCellReceive, (q) kFunctionBindCancellationFun);
            }
            Object result = orCreateCancellableContinuation.getResult();
            if (result == av.e.getCOROUTINE_SUSPENDED()) {
                h.probeCoroutineSuspended(dVar);
            }
            return result;
        } catch (Throwable th2) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerSelectForReceive(SelectInstance<?> selectInstance, Object obj) {
        ChannelSegment channelSegment;
        ChannelSegment channelSegment2 = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
        while (!isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
            int i10 = BufferedChannelKt.SEGMENT_SIZE;
            long j10 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (channelSegment2.f71893id != j10) {
                ChannelSegment channelSegmentFindSegmentReceive = findSegmentReceive(j10, channelSegment2);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            SelectInstance<?> selectInstance2 = selectInstance;
            Object objUpdateCellReceive = updateCellReceive(channelSegment, i11, andIncrement, selectInstance2);
            channelSegment2 = channelSegment;
            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                Waiter waiter = selectInstance2 instanceof Waiter ? (Waiter) selectInstance2 : null;
                if (waiter != null) {
                    prepareReceiverForSuspension(waiter, channelSegment2, i11);
                    return;
                }
                return;
            }
            if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                    throw new IllegalStateException("unexpected");
                }
                channelSegment2.cleanPrev();
                selectInstance2.selectInRegistrationPhase(objUpdateCellReceive);
                return;
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment2.cleanPrev();
            }
            selectInstance = selectInstance2;
        }
        onClosedSelectOnReceive(selectInstance);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
    
        r12 = (kotlinx.coroutines.channels.ChannelSegment) r12.getPrev();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void removeUnprocessedElements(kotlinx.coroutines.channels.ChannelSegment<E> r12) {
        /*
            r11 = this;
            kv.l r0 = r11.onUndeliveredElement
            r1 = 0
            r2 = 1
            java.lang.Object r3 = kotlinx.coroutines.internal.InlineList.m5188constructorimpl$default(r1, r2, r1)
        L8:
            int r4 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Lb3
            long r6 = r12.f71893id
            int r8 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L16:
            java.lang.Object r8 = r12.getState$kotlinx_coroutines_core(r4)
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getDONE_RCV$p()
            if (r8 == r9) goto Lbb
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            if (r8 != r9) goto L48
            long r9 = r11.getReceiversCounter$kotlinx_coroutines_core()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r8 = r12.casState$kotlinx_coroutines_core(r4, r8, r9)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L40
            java.lang.Object r5 = r12.getElement$kotlinx_coroutines_core(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(r0, r5, r1)
        L40:
            r12.cleanElement$kotlinx_coroutines_core(r4)
            r12.onSlotCleaned()
            goto Laf
        L48:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getIN_BUFFER$p()
            if (r8 == r9) goto La2
            if (r8 != 0) goto L51
            goto La2
        L51:
            boolean r9 = r8 instanceof kotlinx.coroutines.Waiter
            if (r9 != 0) goto L6e
            boolean r9 = r8 instanceof kotlinx.coroutines.channels.WaiterEB
            if (r9 == 0) goto L5a
            goto L6e
        L5a:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_EB$p()
            if (r8 == r9) goto Lbb
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_RCV$p()
            if (r8 != r9) goto L67
            goto Lbb
        L67:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_EB$p()
            if (r8 == r9) goto L16
            goto Laf
        L6e:
            long r9 = r11.getReceiversCounter$kotlinx_coroutines_core()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            boolean r9 = r8 instanceof kotlinx.coroutines.channels.WaiterEB
            if (r9 == 0) goto L80
            r9 = r8
            kotlinx.coroutines.channels.WaiterEB r9 = (kotlinx.coroutines.channels.WaiterEB) r9
            kotlinx.coroutines.Waiter r9 = r9.waiter
            goto L83
        L80:
            r9 = r8
            kotlinx.coroutines.Waiter r9 = (kotlinx.coroutines.Waiter) r9
        L83:
            kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r8 = r12.casState$kotlinx_coroutines_core(r4, r8, r10)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L97
            java.lang.Object r5 = r12.getElement$kotlinx_coroutines_core(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(r0, r5, r1)
        L97:
            java.lang.Object r3 = kotlinx.coroutines.internal.InlineList.m5193plusFjFbRPM(r3, r9)
            r12.cleanElement$kotlinx_coroutines_core(r4)
            r12.onSlotCleaned()
            goto Laf
        La2:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r8 = r12.casState$kotlinx_coroutines_core(r4, r8, r9)
            if (r8 == 0) goto L16
            r12.onSlotCleaned()
        Laf:
            int r4 = r4 + (-1)
            goto Lb
        Lb3:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r12 = r12.getPrev()
            kotlinx.coroutines.channels.ChannelSegment r12 = (kotlinx.coroutines.channels.ChannelSegment) r12
            if (r12 != 0) goto L8
        Lbb:
            if (r3 == 0) goto Le1
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto Lc7
            kotlinx.coroutines.Waiter r3 = (kotlinx.coroutines.Waiter) r3
            r11.resumeSenderOnCancelledChannel(r3)
            goto Le1
        Lc7:
            java.lang.String r12 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>"
            kotlin.jvm.internal.e0.checkNotNull(r3, r12)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        Ld3:
            if (r5 >= r12) goto Le1
            java.lang.Object r0 = r3.get(r12)
            kotlinx.coroutines.Waiter r0 = (kotlinx.coroutines.Waiter) r0
            r11.resumeSenderOnCancelledChannel(r0)
            int r12 = r12 + (-1)
            goto Ld3
        Le1:
            if (r1 != 0) goto Le4
            return
        Le4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.removeUnprocessedElements(kotlinx.coroutines.channels.ChannelSegment):void");
    }

    private final void resumeReceiverOnClosedChannel(Waiter waiter) {
        resumeWaiterOnClosedChannel(waiter, true);
    }

    private final void resumeSenderOnCancelledChannel(Waiter waiter) {
        resumeWaiterOnClosedChannel(waiter, false);
    }

    private final void resumeWaiterOnClosedChannel(Waiter waiter, boolean z10) {
        if (waiter instanceof SendBroadcast) {
            CancellableContinuation<Boolean> cont = ((SendBroadcast) waiter).getCont();
            int i10 = z.f87419c;
            cont.resumeWith(z.m7131constructorimpl(Boolean.FALSE));
            return;
        }
        if (waiter instanceof CancellableContinuation) {
            zu.d dVar = (zu.d) waiter;
            int i11 = z.f87419c;
            dVar.resumeWith(z.m7131constructorimpl(a0.createFailure(z10 ? getReceiveException() : getSendException())));
        } else if (waiter instanceof ReceiveCatching) {
            CancellableContinuationImpl<ChannelResult<? extends E>> cancellableContinuationImpl = ((ReceiveCatching) waiter).cont;
            int i12 = z.f87419c;
            cancellableContinuationImpl.resumeWith(z.m7131constructorimpl(ChannelResult.m5153boximpl(ChannelResult.Companion.m5166closedJP2dKIU(getCloseCause()))));
        } else if (waiter instanceof BufferedChannelIterator) {
            ((BufferedChannelIterator) waiter).tryResumeHasNextOnClosedChannel();
        } else if (waiter instanceof SelectInstance) {
            ((SelectInstance) waiter).trySelect(this, BufferedChannelKt.getCHANNEL_CLOSED());
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + waiter).toString());
        }
    }

    public static /* synthetic */ <E> Object send$suspendImpl(BufferedChannel<E> bufferedChannel, E e10, zu.d<? super x0> dVar) {
        ChannelSegment<E> channelSegment;
        ChannelSegment<E> channelSegment2 = (ChannelSegment) sendSegment$volatile$FU.get(bufferedChannel);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(bufferedChannel);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zIsClosedForSend0 = bufferedChannel.isClosedForSend0(andIncrement);
            int i10 = BufferedChannelKt.SEGMENT_SIZE;
            long j11 = j10 / i10;
            int i11 = (int) (j10 % i10);
            if (channelSegment2.f71893id != j11) {
                ChannelSegment<E> channelSegmentFindSegmentSend = bufferedChannel.findSegmentSend(j11, channelSegment2);
                if (channelSegmentFindSegmentSend != null) {
                    channelSegment = channelSegmentFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    Object objOnClosedSend = bufferedChannel.onClosedSend(e10, dVar);
                    if (objOnClosedSend == av.e.getCOROUTINE_SUSPENDED()) {
                        return objOnClosedSend;
                    }
                }
            } else {
                channelSegment = channelSegment2;
            }
            BufferedChannel<E> bufferedChannel2 = bufferedChannel;
            E e11 = e10;
            int iUpdateCellSend = bufferedChannel2.updateCellSend(channelSegment, i11, e11, j10, null, zIsClosedForSend0);
            if (iUpdateCellSend == 0) {
                channelSegment.cleanPrev();
                break;
            }
            if (iUpdateCellSend == 1) {
                break;
            }
            if (iUpdateCellSend != 2) {
                if (iUpdateCellSend == 3) {
                    Object objSendOnNoWaiterSuspend = bufferedChannel2.sendOnNoWaiterSuspend(channelSegment, i11, e11, j10, dVar);
                    if (objSendOnNoWaiterSuspend == av.e.getCOROUTINE_SUSPENDED()) {
                        return objSendOnNoWaiterSuspend;
                    }
                } else if (iUpdateCellSend != 4) {
                    if (iUpdateCellSend == 5) {
                        channelSegment.cleanPrev();
                    }
                    bufferedChannel = bufferedChannel2;
                    channelSegment2 = channelSegment;
                    e10 = e11;
                } else {
                    if (j10 < bufferedChannel2.getReceiversCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    Object objOnClosedSend2 = bufferedChannel2.onClosedSend(e11, dVar);
                    if (objOnClosedSend2 == av.e.getCOROUTINE_SUSPENDED()) {
                        return objOnClosedSend2;
                    }
                }
            } else if (zIsClosedForSend0) {
                channelSegment.onSlotCleaned();
                Object objOnClosedSend3 = bufferedChannel2.onClosedSend(e11, dVar);
                if (objOnClosedSend3 == av.e.getCOROUTINE_SUSPENDED()) {
                    return objOnClosedSend3;
                }
            }
        }
        return x0.f87415a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0099, code lost:
    
        r13 = tu.z.f87419c;
        r0.resumeWith(tu.z.m7131constructorimpl(bv.b.boxBoolean(true)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ <E> java.lang.Object sendBroadcast$suspendImpl(kotlinx.coroutines.channels.BufferedChannel<E> r13, E r14, zu.d<? super java.lang.Boolean> r15) {
        /*
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            zu.d r1 = av.b.intercepted(r15)
            r2 = 1
            r0.<init>(r1, r2)
            r0.initCancellability()
            kv.l r1 = r13.onUndeliveredElement
            if (r1 != 0) goto Lb9
            kotlinx.coroutines.channels.BufferedChannel$SendBroadcast r9 = new kotlinx.coroutines.channels.BufferedChannel$SendBroadcast
            r9.<init>(r0)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = access$getSendSegment$volatile$FU()
            java.lang.Object r1 = r1.get(r13)
            kotlinx.coroutines.channels.ChannelSegment r1 = (kotlinx.coroutines.channels.ChannelSegment) r1
        L20:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = access$getSendersAndCloseStatus$volatile$FU()
            long r3 = r3.getAndIncrement(r13)
            r5 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r7 = r3 & r5
            boolean r10 = access$isClosedForSend0(r13, r3)
            int r3 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r4 = (long) r3
            long r4 = r7 / r4
            long r11 = (long) r3
            long r11 = r7 % r11
            int r3 = (int) r11
            long r11 = r1.f71893id
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            r11 = 0
            if (r6 == 0) goto L5d
            kotlinx.coroutines.channels.ChannelSegment r4 = access$findSegmentSend(r13, r4, r1)
            if (r4 != 0) goto L59
            if (r10 == 0) goto L20
        L4b:
            int r13 = tu.z.f87419c
            java.lang.Boolean r13 = bv.b.boxBoolean(r11)
            java.lang.Object r13 = tu.z.m7131constructorimpl(r13)
            r0.resumeWith(r13)
            goto Lab
        L59:
            r6 = r14
            r5 = r3
            r3 = r13
            goto L5f
        L5d:
            r4 = r1
            goto L59
        L5f:
            int r13 = access$updateCellSend(r3, r4, r5, r6, r7, r9, r10)
            r1 = r4
            if (r13 == 0) goto La7
            if (r13 == r2) goto L99
            r14 = 2
            if (r13 == r14) goto L8f
            r14 = 3
            if (r13 == r14) goto L87
            r14 = 4
            if (r13 == r14) goto L7b
            r14 = 5
            if (r13 == r14) goto L75
            goto L78
        L75:
            r1.cleanPrev()
        L78:
            r13 = r3
            r14 = r6
            goto L20
        L7b:
            long r13 = r3.getReceiversCounter$kotlinx_coroutines_core()
            int r13 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r13 >= 0) goto L4b
            r1.cleanPrev()
            goto L4b
        L87:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        L8f:
            if (r10 == 0) goto L95
            r1.onSlotCleaned()
            goto L4b
        L95:
            access$prepareSenderForSuspension(r3, r9, r1, r5)
            goto Lab
        L99:
            int r13 = tu.z.f87419c
            java.lang.Boolean r13 = bv.b.boxBoolean(r2)
            java.lang.Object r13 = tu.z.m7131constructorimpl(r13)
            r0.resumeWith(r13)
            goto Lab
        La7:
            r1.cleanPrev()
            goto L99
        Lab:
            java.lang.Object r13 = r0.getResult()
            java.lang.Object r14 = av.e.getCOROUTINE_SUSPENDED()
            if (r13 != r14) goto Lb8
            bv.h.probeCoroutineSuspended(r15)
        Lb8:
            return r13
        Lb9:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "the `onUndeliveredElement` feature is unsupported for `sendBroadcast(e)`"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.sendBroadcast$suspendImpl(kotlinx.coroutines.channels.BufferedChannel, java.lang.Object, zu.d):java.lang.Object");
    }

    private final <R> R sendImpl(E e10, Object obj, kv.a aVar, p pVar, kv.a aVar2, r rVar) {
        BufferedChannel<E> bufferedChannel;
        E e11;
        Object obj2;
        ChannelSegment channelSegment = (ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j10 = 1152921504606846975L & andIncrement;
            boolean zIsClosedForSend0 = isClosedForSend0(andIncrement);
            int i10 = BufferedChannelKt.SEGMENT_SIZE;
            long j11 = j10 / i10;
            int i11 = (int) (j10 % i10);
            if (channelSegment.f71893id != j11) {
                ChannelSegment channelSegmentFindSegmentSend = findSegmentSend(j11, channelSegment);
                if (channelSegmentFindSegmentSend != null) {
                    channelSegment = channelSegmentFindSegmentSend;
                    bufferedChannel = this;
                    obj2 = obj;
                    e11 = e10;
                } else if (zIsClosedForSend0) {
                    return (R) aVar2.invoke();
                }
            } else {
                bufferedChannel = this;
                e11 = e10;
                obj2 = obj;
            }
            int iUpdateCellSend = bufferedChannel.updateCellSend(channelSegment, i11, e11, j10, obj2, zIsClosedForSend0);
            if (iUpdateCellSend == 0) {
                channelSegment.cleanPrev();
                return (R) aVar.invoke();
            }
            if (iUpdateCellSend == 1) {
                return (R) aVar.invoke();
            }
            if (iUpdateCellSend == 2) {
                if (zIsClosedForSend0) {
                    channelSegment.onSlotCleaned();
                    return (R) aVar2.invoke();
                }
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    prepareSenderForSuspension(waiter, channelSegment, i11);
                }
                return (R) pVar.invoke(channelSegment, Integer.valueOf(i11));
            }
            if (iUpdateCellSend == 3) {
                return (R) rVar.invoke(channelSegment, Integer.valueOf(i11), e10, Long.valueOf(j10));
            }
            if (iUpdateCellSend == 4) {
                if (j10 < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                return (R) aVar2.invoke();
            }
            if (iUpdateCellSend == 5) {
                channelSegment.cleanPrev();
            }
        }
    }

    public static /* synthetic */ Object sendImpl$default(BufferedChannel bufferedChannel, Object obj, Object obj2, kv.a aVar, p pVar, kv.a aVar2, r rVar, int i10, Object obj3) {
        BufferedChannel bufferedChannel2;
        Object obj4;
        Object obj5;
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendImpl");
        }
        r rVar2 = (i10 & 32) != 0 ? new r() { // from class: kotlinx.coroutines.channels.BufferedChannel.sendImpl.1
            @Override // kv.r
            public /* bridge */ /* synthetic */ Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                return invoke((ChannelSegment<int>) obj6, ((Number) obj7).intValue(), (int) obj8, ((Number) obj9).longValue());
            }

            public final Void invoke(ChannelSegment<E> channelSegment, int i11, E e10, long j10) {
                throw new IllegalStateException("unexpected");
            }
        } : rVar;
        ChannelSegment channelSegment = (ChannelSegment) sendSegment$volatile$FU.get(bufferedChannel);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(bufferedChannel);
            long j10 = 1152921504606846975L & andIncrement;
            boolean zIsClosedForSend0 = bufferedChannel.isClosedForSend0(andIncrement);
            int i11 = BufferedChannelKt.SEGMENT_SIZE;
            long j11 = j10 / i11;
            int i12 = (int) (j10 % i11);
            if (channelSegment.f71893id != j11) {
                ChannelSegment channelSegmentFindSegmentSend = bufferedChannel.findSegmentSend(j11, channelSegment);
                if (channelSegmentFindSegmentSend != null) {
                    channelSegment = channelSegmentFindSegmentSend;
                    bufferedChannel2 = bufferedChannel;
                    obj5 = obj2;
                    obj4 = obj;
                } else if (zIsClosedForSend0) {
                    return aVar2.invoke();
                }
            } else {
                bufferedChannel2 = bufferedChannel;
                obj4 = obj;
                obj5 = obj2;
            }
            int iUpdateCellSend = bufferedChannel2.updateCellSend(channelSegment, i12, obj4, j10, obj5, zIsClosedForSend0);
            if (iUpdateCellSend == 0) {
                channelSegment.cleanPrev();
                return aVar.invoke();
            }
            if (iUpdateCellSend == 1) {
                return aVar.invoke();
            }
            if (iUpdateCellSend == 2) {
                if (zIsClosedForSend0) {
                    channelSegment.onSlotCleaned();
                    return aVar2.invoke();
                }
                Waiter waiter = obj2 instanceof Waiter ? (Waiter) obj2 : null;
                if (waiter != null) {
                    bufferedChannel.prepareSenderForSuspension(waiter, channelSegment, i12);
                }
                return pVar.invoke(channelSegment, Integer.valueOf(i12));
            }
            if (iUpdateCellSend == 3) {
                return rVar2.invoke(channelSegment, Integer.valueOf(i12), obj, Long.valueOf(j10));
            }
            if (iUpdateCellSend == 4) {
                if (j10 < bufferedChannel.getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                return aVar2.invoke();
            }
            if (iUpdateCellSend == 5) {
                channelSegment.cleanPrev();
            }
        }
    }

    private final void sendImplOnNoWaiter(ChannelSegment<E> channelSegment, int i10, E e10, long j10, Waiter waiter, kv.a aVar, kv.a aVar2) {
        BufferedChannel<E> bufferedChannel;
        E e11;
        Waiter waiter2;
        Object objInvoke;
        int iUpdateCellSend = updateCellSend(channelSegment, i10, e10, j10, waiter, false);
        if (iUpdateCellSend == 0) {
            channelSegment.cleanPrev();
            aVar.invoke();
            return;
        }
        if (iUpdateCellSend == 1) {
            aVar.invoke();
            return;
        }
        if (iUpdateCellSend == 2) {
            prepareSenderForSuspension(waiter, channelSegment, i10);
            return;
        }
        if (iUpdateCellSend == 4) {
            if (j10 < getReceiversCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
            aVar2.invoke();
            return;
        }
        String str = "unexpected";
        if (iUpdateCellSend != 5) {
            throw new IllegalStateException("unexpected");
        }
        channelSegment.cleanPrev();
        ChannelSegment channelSegment2 = (ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j11 = 1152921504606846975L & andIncrement;
            boolean zIsClosedForSend0 = isClosedForSend0(andIncrement);
            int i11 = BufferedChannelKt.SEGMENT_SIZE;
            long j12 = j11 / i11;
            int i12 = (int) (j11 % i11);
            String str2 = str;
            if (channelSegment2.f71893id != j12) {
                ChannelSegment channelSegmentFindSegmentSend = findSegmentSend(j12, channelSegment2);
                if (channelSegmentFindSegmentSend != null) {
                    channelSegment2 = channelSegmentFindSegmentSend;
                    bufferedChannel = this;
                    waiter2 = waiter;
                    e11 = e10;
                } else {
                    if (zIsClosedForSend0) {
                        objInvoke = aVar2.invoke();
                        break;
                    }
                    str = str2;
                }
            } else {
                bufferedChannel = this;
                e11 = e10;
                waiter2 = waiter;
            }
            int iUpdateCellSend2 = bufferedChannel.updateCellSend(channelSegment2, i12, e11, j11, waiter2, zIsClosedForSend0);
            if (iUpdateCellSend2 == 0) {
                channelSegment2.cleanPrev();
                objInvoke = aVar.invoke();
                break;
            }
            if (iUpdateCellSend2 == 1) {
                objInvoke = aVar.invoke();
                break;
            }
            if (iUpdateCellSend2 != 2) {
                if (iUpdateCellSend2 == 3) {
                    throw new IllegalStateException(str2);
                }
                if (iUpdateCellSend2 != 4) {
                    if (iUpdateCellSend2 == 5) {
                        channelSegment2.cleanPrev();
                    }
                    str = str2;
                } else {
                    if (j11 < getReceiversCounter$kotlinx_coroutines_core()) {
                        channelSegment2.cleanPrev();
                    }
                    objInvoke = aVar2.invoke();
                }
            } else if (zIsClosedForSend0) {
                channelSegment2.onSlotCleaned();
                objInvoke = aVar2.invoke();
            } else {
                Waiter waiter3 = waiter2 != null ? waiter2 : null;
                if (waiter3 != null) {
                    prepareSenderForSuspension(waiter3, channelSegment2, i12);
                }
                objInvoke = x0.f87415a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fb A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendOnNoWaiterSuspend(kotlinx.coroutines.channels.ChannelSegment<E> r17, int r18, E r19, long r20, zu.d<? super tu.x0> r22) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.sendOnNoWaiterSuspend(kotlinx.coroutines.channels.ChannelSegment, int, java.lang.Object, long, zu.d):java.lang.Object");
    }

    private final /* synthetic */ void setBufferEnd$volatile(long j10) {
        this.bufferEnd$volatile = j10;
    }

    private final /* synthetic */ void setBufferEndSegment$volatile(Object obj) {
        this.bufferEndSegment$volatile = obj;
    }

    private final /* synthetic */ void setCloseHandler$volatile(Object obj) {
        this.closeHandler$volatile = obj;
    }

    private final /* synthetic */ void setCompletedExpandBuffersAndPauseFlag$volatile(long j10) {
        this.completedExpandBuffersAndPauseFlag$volatile = j10;
    }

    private final /* synthetic */ void setReceiveSegment$volatile(Object obj) {
        this.receiveSegment$volatile = obj;
    }

    private final /* synthetic */ void setReceivers$volatile(long j10) {
        this.receivers$volatile = j10;
    }

    private final /* synthetic */ void setSendSegment$volatile(Object obj) {
        this.sendSegment$volatile = obj;
    }

    private final /* synthetic */ void setSendersAndCloseStatus$volatile(long j10) {
        this.sendersAndCloseStatus$volatile = j10;
    }

    private final /* synthetic */ void set_closeCause$volatile(Object obj) {
        this._closeCause$volatile = obj;
    }

    private final boolean shouldSendSuspend(long j10) {
        if (isClosedForSend0(j10)) {
            return false;
        }
        return !bufferOrRendezvousSend(j10 & 1152921504606846975L);
    }

    private final boolean tryResumeReceiver(Object obj, E e10) {
        if (obj instanceof SelectInstance) {
            return ((SelectInstance) obj).trySelect(this, e10);
        }
        if (obj instanceof ReceiveCatching) {
            e0.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            CancellableContinuationImpl<ChannelResult<? extends E>> cancellableContinuationImpl = ((ReceiveCatching) obj).cont;
            ChannelResult channelResultM5153boximpl = ChannelResult.m5153boximpl(ChannelResult.Companion.m5168successJP2dKIU(e10));
            l lVar = this.onUndeliveredElement;
            return BufferedChannelKt.tryResume0(cancellableContinuationImpl, channelResultM5153boximpl, (q) (lVar != null ? bindCancellationFunResult(lVar) : null));
        }
        if (obj instanceof BufferedChannelIterator) {
            e0.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((BufferedChannelIterator) obj).tryResumeHasNext(e10);
        }
        if (!(obj instanceof CancellableContinuation)) {
            throw new IllegalStateException(o2.o(obj, "Unexpected receiver type: "));
        }
        e0.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
        CancellableContinuation cancellableContinuation = (CancellableContinuation) obj;
        l lVar2 = this.onUndeliveredElement;
        return BufferedChannelKt.tryResume0(cancellableContinuation, e10, (q) (lVar2 != null ? bindCancellationFun(lVar2) : null));
    }

    private final boolean tryResumeSender(Object obj, ChannelSegment<E> channelSegment, int i10) {
        boolean z10 = obj instanceof CancellableContinuation;
        x0 x0Var = x0.f87415a;
        if (z10) {
            e0.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return BufferedChannelKt.tryResume0$default((CancellableContinuation) obj, x0Var, null, 2, null);
        }
        if (!(obj instanceof SelectInstance)) {
            if (obj instanceof SendBroadcast) {
                return BufferedChannelKt.tryResume0$default(((SendBroadcast) obj).getCont(), Boolean.TRUE, null, 2, null);
            }
            throw new IllegalStateException(o2.o(obj, "Unexpected waiter: "));
        }
        e0.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        TrySelectDetailedResult trySelectDetailedResultTrySelectDetailed = ((SelectImplementation) obj).trySelectDetailed(this, x0Var);
        if (trySelectDetailedResultTrySelectDetailed == TrySelectDetailedResult.REREGISTER) {
            channelSegment.cleanElement$kotlinx_coroutines_core(i10);
        }
        return trySelectDetailedResultTrySelectDetailed == TrySelectDetailedResult.SUCCESSFUL;
    }

    private final /* synthetic */ void update$atomicfu$ATOMIC_FIELD_UPDATER$Long(AtomicLongFieldUpdater atomicLongFieldUpdater, Object obj, l lVar) {
        while (true) {
            long j10 = atomicLongFieldUpdater.get(obj);
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
            Object obj2 = obj;
            if (atomicLongFieldUpdater2.compareAndSet(obj2, j10, ((Number) lVar.invoke(Long.valueOf(j10))).longValue())) {
                return;
            }
            atomicLongFieldUpdater = atomicLongFieldUpdater2;
            obj = obj2;
        }
    }

    private final boolean updateCellExpandBuffer(ChannelSegment<E> channelSegment, int i10, long j10) {
        Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i10);
        if (!(state$kotlinx_coroutines_core instanceof Waiter) || j10 < receivers$volatile$FU.get(this) || !channelSegment.casState$kotlinx_coroutines_core(i10, state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_EB)) {
            return updateCellExpandBufferSlow(channelSegment, i10, j10);
        }
        if (tryResumeSender(state$kotlinx_coroutines_core, channelSegment, i10)) {
            channelSegment.setState$kotlinx_coroutines_core(i10, BufferedChannelKt.BUFFERED);
            return true;
        }
        channelSegment.setState$kotlinx_coroutines_core(i10, BufferedChannelKt.INTERRUPTED_SEND);
        channelSegment.onCancelledRequest(i10, false);
        return false;
    }

    private final boolean updateCellExpandBufferSlow(ChannelSegment<E> channelSegment, int i10, long j10) {
        while (true) {
            Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i10);
            if (state$kotlinx_coroutines_core instanceof Waiter) {
                if (j10 < receivers$volatile$FU.get(this)) {
                    if (channelSegment.casState$kotlinx_coroutines_core(i10, state$kotlinx_coroutines_core, new WaiterEB((Waiter) state$kotlinx_coroutines_core))) {
                        return true;
                    }
                } else if (channelSegment.casState$kotlinx_coroutines_core(i10, state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_EB)) {
                    if (tryResumeSender(state$kotlinx_coroutines_core, channelSegment, i10)) {
                        channelSegment.setState$kotlinx_coroutines_core(i10, BufferedChannelKt.BUFFERED);
                        return true;
                    }
                    channelSegment.setState$kotlinx_coroutines_core(i10, BufferedChannelKt.INTERRUPTED_SEND);
                    channelSegment.onCancelledRequest(i10, false);
                    return false;
                }
            } else {
                if (state$kotlinx_coroutines_core == BufferedChannelKt.INTERRUPTED_SEND) {
                    return false;
                }
                if (state$kotlinx_coroutines_core == null) {
                    if (channelSegment.casState$kotlinx_coroutines_core(i10, state$kotlinx_coroutines_core, BufferedChannelKt.IN_BUFFER)) {
                        return true;
                    }
                } else {
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED || state$kotlinx_coroutines_core == BufferedChannelKt.POISONED || state$kotlinx_coroutines_core == BufferedChannelKt.DONE_RCV || state$kotlinx_coroutines_core == BufferedChannelKt.INTERRUPTED_RCV || state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                        return true;
                    }
                    if (state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_RCV) {
                        throw new IllegalStateException(o2.o(state$kotlinx_coroutines_core, "Unexpected cell state: "));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateCellReceive(ChannelSegment<E> channelSegment, int i10, long j10, Object obj) {
        Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i10);
        if (state$kotlinx_coroutines_core == null) {
            if (j10 >= (sendersAndCloseStatus$volatile$FU.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return BufferedChannelKt.SUSPEND_NO_WAITER;
                }
                if (channelSegment.casState$kotlinx_coroutines_core(i10, state$kotlinx_coroutines_core, obj)) {
                    expandBuffer();
                    return BufferedChannelKt.SUSPEND;
                }
            }
        } else if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED && channelSegment.casState$kotlinx_coroutines_core(i10, state$kotlinx_coroutines_core, BufferedChannelKt.DONE_RCV)) {
            expandBuffer();
            return channelSegment.retrieveElement$kotlinx_coroutines_core(i10);
        }
        return updateCellReceiveSlow(channelSegment, i10, j10, obj);
    }

    private final Object updateCellReceiveSlow(ChannelSegment<E> channelSegment, int i10, long j10, Object obj) {
        while (true) {
            Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i10);
            if (state$kotlinx_coroutines_core == null || state$kotlinx_coroutines_core == BufferedChannelKt.IN_BUFFER) {
                if (j10 < (sendersAndCloseStatus$volatile$FU.get(this) & 1152921504606846975L)) {
                    if (channelSegment.casState$kotlinx_coroutines_core(i10, state$kotlinx_coroutines_core, BufferedChannelKt.POISONED)) {
                        expandBuffer();
                        return BufferedChannelKt.FAILED;
                    }
                } else {
                    if (obj == null) {
                        return BufferedChannelKt.SUSPEND_NO_WAITER;
                    }
                    if (channelSegment.casState$kotlinx_coroutines_core(i10, state$kotlinx_coroutines_core, obj)) {
                        expandBuffer();
                        return BufferedChannelKt.SUSPEND;
                    }
                }
            } else {
                if (state$kotlinx_coroutines_core != BufferedChannelKt.BUFFERED) {
                    if (state$kotlinx_coroutines_core != BufferedChannelKt.INTERRUPTED_SEND && state$kotlinx_coroutines_core != BufferedChannelKt.POISONED) {
                        if (state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                            expandBuffer();
                            return BufferedChannelKt.FAILED;
                        }
                        if (state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_EB && channelSegment.casState$kotlinx_coroutines_core(i10, state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_RCV)) {
                            boolean z10 = state$kotlinx_coroutines_core instanceof WaiterEB;
                            if (z10) {
                                state$kotlinx_coroutines_core = ((WaiterEB) state$kotlinx_coroutines_core).waiter;
                            }
                            if (tryResumeSender(state$kotlinx_coroutines_core, channelSegment, i10)) {
                                channelSegment.setState$kotlinx_coroutines_core(i10, BufferedChannelKt.DONE_RCV);
                                expandBuffer();
                                return channelSegment.retrieveElement$kotlinx_coroutines_core(i10);
                            }
                            channelSegment.setState$kotlinx_coroutines_core(i10, BufferedChannelKt.INTERRUPTED_SEND);
                            channelSegment.onCancelledRequest(i10, false);
                            if (z10) {
                                expandBuffer();
                            }
                            return BufferedChannelKt.FAILED;
                        }
                    }
                    return BufferedChannelKt.FAILED;
                }
                if (channelSegment.casState$kotlinx_coroutines_core(i10, state$kotlinx_coroutines_core, BufferedChannelKt.DONE_RCV)) {
                    expandBuffer();
                    return channelSegment.retrieveElement$kotlinx_coroutines_core(i10);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int updateCellSend(ChannelSegment<E> channelSegment, int i10, E e10, long j10, Object obj, boolean z10) {
        channelSegment.storeElement$kotlinx_coroutines_core(i10, e10);
        if (z10) {
            return updateCellSendSlow(channelSegment, i10, e10, j10, obj, z10);
        }
        Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i10);
        if (state$kotlinx_coroutines_core == null) {
            if (bufferOrRendezvousSend(j10)) {
                if (channelSegment.casState$kotlinx_coroutines_core(i10, null, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else {
                if (obj == null) {
                    return 3;
                }
                if (channelSegment.casState$kotlinx_coroutines_core(i10, null, obj)) {
                    return 2;
                }
            }
        } else if (state$kotlinx_coroutines_core instanceof Waiter) {
            channelSegment.cleanElement$kotlinx_coroutines_core(i10);
            if (tryResumeReceiver(state$kotlinx_coroutines_core, e10)) {
                channelSegment.setState$kotlinx_coroutines_core(i10, BufferedChannelKt.DONE_RCV);
                onReceiveDequeued();
                return 0;
            }
            if (channelSegment.getAndSetState$kotlinx_coroutines_core(i10, BufferedChannelKt.INTERRUPTED_RCV) == BufferedChannelKt.INTERRUPTED_RCV) {
                return 5;
            }
            channelSegment.onCancelledRequest(i10, true);
            return 5;
        }
        return updateCellSendSlow(channelSegment, i10, e10, j10, obj, z10);
    }

    private final int updateCellSendSlow(ChannelSegment<E> channelSegment, int i10, E e10, long j10, Object obj, boolean z10) {
        while (true) {
            Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i10);
            if (state$kotlinx_coroutines_core == null) {
                if (!bufferOrRendezvousSend(j10) || z10) {
                    if (z10) {
                        if (channelSegment.casState$kotlinx_coroutines_core(i10, null, BufferedChannelKt.INTERRUPTED_SEND)) {
                            channelSegment.onCancelledRequest(i10, false);
                            return 4;
                        }
                    } else {
                        if (obj == null) {
                            return 3;
                        }
                        if (channelSegment.casState$kotlinx_coroutines_core(i10, null, obj)) {
                            return 2;
                        }
                    }
                } else if (channelSegment.casState$kotlinx_coroutines_core(i10, null, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else {
                if (state$kotlinx_coroutines_core != BufferedChannelKt.IN_BUFFER) {
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.INTERRUPTED_RCV) {
                        channelSegment.cleanElement$kotlinx_coroutines_core(i10);
                        return 5;
                    }
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.POISONED) {
                        channelSegment.cleanElement$kotlinx_coroutines_core(i10);
                        return 5;
                    }
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                        channelSegment.cleanElement$kotlinx_coroutines_core(i10);
                        completeCloseOrCancel();
                        return 4;
                    }
                    channelSegment.cleanElement$kotlinx_coroutines_core(i10);
                    if (state$kotlinx_coroutines_core instanceof WaiterEB) {
                        state$kotlinx_coroutines_core = ((WaiterEB) state$kotlinx_coroutines_core).waiter;
                    }
                    if (tryResumeReceiver(state$kotlinx_coroutines_core, e10)) {
                        channelSegment.setState$kotlinx_coroutines_core(i10, BufferedChannelKt.DONE_RCV);
                        onReceiveDequeued();
                        return 0;
                    }
                    if (channelSegment.getAndSetState$kotlinx_coroutines_core(i10, BufferedChannelKt.INTERRUPTED_RCV) != BufferedChannelKt.INTERRUPTED_RCV) {
                        channelSegment.onCancelledRequest(i10, true);
                    }
                    return 5;
                }
                if (channelSegment.casState$kotlinx_coroutines_core(i10, state$kotlinx_coroutines_core, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            }
        }
    }

    private final void updateReceiversCounterIfLower(long j10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = receivers$volatile$FU;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= j10) {
                return;
            }
            long j12 = j10;
            if (receivers$volatile$FU.compareAndSet(this, j11, j12)) {
                return;
            } else {
                j10 = j12;
            }
        }
    }

    private final void updateSendersCounterIfLower(long j10) {
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            j12 = 1152921504606846975L & j11;
            if (j12 >= j10) {
                return;
            }
        } while (!sendersAndCloseStatus$volatile$FU.compareAndSet(this, j11, BufferedChannelKt.constructSendersAndCloseStatus(j12, (int) (j11 >> 60))));
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final boolean cancel(Throwable th2) {
        return cancelImpl$kotlinx_coroutines_core(th2);
    }

    public boolean cancelImpl$kotlinx_coroutines_core(Throwable th2) {
        if (th2 == null) {
            th2 = new CancellationException("Channel was cancelled");
        }
        return closeOrCancelImpl(th2, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void checkSegmentStructureInvariants() {
        if (isRendezvousOrUnlimited()) {
            if (bufferEndSegment$volatile$FU.get(this) != BufferedChannelKt.NULL_SEGMENT) {
                throw new IllegalStateException(("bufferEndSegment must be NULL_SEGMENT for rendezvous and unlimited channels; they do not manipulate it.\nChannel state: " + this).toString());
            }
        } else if (((ChannelSegment) receiveSegment$volatile$FU.get(this)).f71893id > ((ChannelSegment) bufferEndSegment$volatile$FU.get(this)).f71893id) {
            throw new IllegalStateException(("bufferEndSegment should not have lower id than receiveSegment.\nChannel state: " + this).toString());
        }
        List listListOf = p0.listOf((Object[]) new ChannelSegment[]{receiveSegment$volatile$FU.get(this), sendSegment$volatile$FU.get(this), bufferEndSegment$volatile$FU.get(this)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            if (((ChannelSegment) obj) != BufferedChannelKt.NULL_SEGMENT) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j10 = ((ChannelSegment) next).f71893id;
            do {
                Object next2 = it.next();
                long j11 = ((ChannelSegment) next2).f71893id;
                if (j10 > j11) {
                    next = next2;
                    j10 = j11;
                }
            } while (it.hasNext());
        }
        ChannelSegment channelSegment = (ChannelSegment) next;
        if (channelSegment.getPrev() != 0) {
            throw new IllegalStateException(("All processed segments should be unreachable from the data structure, but the `prev` link of the leftmost segment is non-null.\nChannel state: " + this).toString());
        }
        while (channelSegment.getNext() != 0) {
            S next3 = channelSegment.getNext();
            e0.checkNotNull(next3);
            if (((ChannelSegment) next3).getPrev() != 0) {
                S next4 = channelSegment.getNext();
                e0.checkNotNull(next4);
                if (((ChannelSegment) next4).getPrev() != channelSegment) {
                    throw new IllegalStateException(("The `segment.next.prev === segment` invariant is violated.\nChannel state: " + this).toString());
                }
            }
            int i10 = BufferedChannelKt.SEGMENT_SIZE;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i12);
                if (!e0.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.BUFFERED) && !(state$kotlinx_coroutines_core instanceof Waiter)) {
                    if (e0.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.INTERRUPTED_RCV) || e0.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.INTERRUPTED_SEND) || e0.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                        if (channelSegment.getElement$kotlinx_coroutines_core(i12) != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        i11++;
                    } else {
                        if (!e0.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.POISONED) && !e0.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.DONE_RCV)) {
                            throw new IllegalStateException(("Unexpected segment cell state: " + state$kotlinx_coroutines_core + ".\nChannel state: " + this).toString());
                        }
                        if (channelSegment.getElement$kotlinx_coroutines_core(i12) != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                    }
                }
            }
            if (i11 == BufferedChannelKt.SEGMENT_SIZE && channelSegment != receiveSegment$volatile$FU.get(this) && channelSegment != sendSegment$volatile$FU.get(this) && channelSegment != bufferEndSegment$volatile$FU.get(this)) {
                throw new IllegalStateException(("Logically removed segment is reachable.\nChannel state: " + this).toString());
            }
            S next5 = channelSegment.getNext();
            e0.checkNotNull(next5);
            channelSegment = (ChannelSegment) next5;
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable th2) {
        return closeOrCancelImpl(th2, false);
    }

    public boolean closeOrCancelImpl(Throwable th2, boolean z10) {
        boolean z11;
        if (z10) {
            markCancellationStarted();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _closeCause$volatile$FU;
        Symbol symbol = BufferedChannelKt.NO_CLOSE_CAUSE;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, symbol, th2)) {
                z11 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != symbol) {
                z11 = false;
                break;
            }
        }
        if (z10) {
            markCancelled();
        } else {
            markClosed();
        }
        completeCloseOrCancel();
        onClosedIdempotent();
        if (z11) {
            invokeCloseHandler();
        }
        return z11;
    }

    public final void dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(long j10) {
        ChannelSegment<E> channelSegmentFindSegmentReceive;
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
        ChannelSegment<E> channelSegment = (ChannelSegment) receiveSegment$volatile$FU.get(this);
        while (true) {
            long j11 = receivers$volatile$FU.get(this);
            if (j10 < Math.max(this.capacity + j11, getBufferEndCounter())) {
                return;
            }
            if (receivers$volatile$FU.compareAndSet(this, j11, 1 + j11)) {
                int i10 = BufferedChannelKt.SEGMENT_SIZE;
                long j12 = j11 / i10;
                int i11 = (int) (j11 % i10);
                if (channelSegment.f71893id != j12) {
                    channelSegmentFindSegmentReceive = findSegmentReceive(j12, channelSegment);
                    if (channelSegmentFindSegmentReceive == null) {
                        continue;
                    }
                } else {
                    channelSegmentFindSegmentReceive = channelSegment;
                }
                Object objUpdateCellReceive = updateCellReceive(channelSegmentFindSegmentReceive, i11, j11, null);
                if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                    channelSegmentFindSegmentReceive.cleanPrev();
                    l lVar = this.onUndeliveredElement;
                    if (lVar != null && (undeliveredElementExceptionCallUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(lVar, objUpdateCellReceive, null, 2, null)) != null) {
                        throw undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
                    }
                } else if (j11 < getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegmentFindSegmentReceive.cleanPrev();
                }
                channelSegment = channelSegmentFindSegmentReceive;
            }
        }
    }

    public final Throwable getCloseCause() {
        return (Throwable) _closeCause$volatile$FU.get(this);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<E> getOnReceive() {
        BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = BufferedChannel$onReceive$1.INSTANCE;
        e0.checkNotNull(bufferedChannel$onReceive$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        q qVar = (q) h1.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceive$1, 3);
        BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = BufferedChannel$onReceive$2.INSTANCE;
        e0.checkNotNull(bufferedChannel$onReceive$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new SelectClause1Impl(this, qVar, (q) h1.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceive$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<ChannelResult<E>> getOnReceiveCatching() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.INSTANCE;
        e0.checkNotNull(bufferedChannel$onReceiveCatching$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        q qVar = (q) h1.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveCatching$1, 3);
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.INSTANCE;
        e0.checkNotNull(bufferedChannel$onReceiveCatching$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new SelectClause1Impl(this, qVar, (q) h1.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveCatching$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<E> getOnReceiveOrNull() {
        BufferedChannel$onReceiveOrNull$1 bufferedChannel$onReceiveOrNull$1 = BufferedChannel$onReceiveOrNull$1.INSTANCE;
        e0.checkNotNull(bufferedChannel$onReceiveOrNull$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        q qVar = (q) h1.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveOrNull$1, 3);
        BufferedChannel$onReceiveOrNull$2 bufferedChannel$onReceiveOrNull$2 = BufferedChannel$onReceiveOrNull$2.INSTANCE;
        e0.checkNotNull(bufferedChannel$onReceiveOrNull$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new SelectClause1Impl(this, qVar, (q) h1.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveOrNull$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public SelectClause2<E, BufferedChannel<E>> getOnSend() {
        BufferedChannel$onSend$1 bufferedChannel$onSend$1 = BufferedChannel$onSend$1.INSTANCE;
        e0.checkNotNull(bufferedChannel$onSend$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        q qVar = (q) h1.beforeCheckcastToFunctionOfArity(bufferedChannel$onSend$1, 3);
        BufferedChannel$onSend$2 bufferedChannel$onSend$2 = BufferedChannel$onSend$2.INSTANCE;
        e0.checkNotNull(bufferedChannel$onSend$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new SelectClause2Impl(this, qVar, (q) h1.beforeCheckcastToFunctionOfArity(bufferedChannel$onSend$2, 3), null, 8, null);
    }

    public final long getReceiversCounter$kotlinx_coroutines_core() {
        return receivers$volatile$FU.get(this);
    }

    public final Throwable getSendException() {
        Throwable closeCause = getCloseCause();
        return closeCause == null ? new ClosedSendChannelException(ChannelsKt.DEFAULT_CLOSE_MESSAGE) : closeCause;
    }

    public final long getSendersCounter$kotlinx_coroutines_core() {
        return sendersAndCloseStatus$volatile$FU.get(this) & 1152921504606846975L;
    }

    public final boolean hasElements$kotlinx_coroutines_core() {
        while (true) {
            ChannelSegment<E> channelSegmentFindSegmentReceive = (ChannelSegment) receiveSegment$volatile$FU.get(this);
            long receiversCounter$kotlinx_coroutines_core = getReceiversCounter$kotlinx_coroutines_core();
            if (getSendersCounter$kotlinx_coroutines_core() <= receiversCounter$kotlinx_coroutines_core) {
                return false;
            }
            int i10 = BufferedChannelKt.SEGMENT_SIZE;
            long j10 = receiversCounter$kotlinx_coroutines_core / i10;
            if (channelSegmentFindSegmentReceive.f71893id == j10 || (channelSegmentFindSegmentReceive = findSegmentReceive(j10, channelSegmentFindSegmentReceive)) != null) {
                channelSegmentFindSegmentReceive.cleanPrev();
                if (isCellNonEmpty(channelSegmentFindSegmentReceive, (int) (receiversCounter$kotlinx_coroutines_core % i10), receiversCounter$kotlinx_coroutines_core)) {
                    return true;
                }
                receivers$volatile$FU.compareAndSet(this, receiversCounter$kotlinx_coroutines_core, 1 + receiversCounter$kotlinx_coroutines_core);
            } else if (((ChannelSegment) receiveSegment$volatile$FU.get(this)).f71893id < j10) {
                return false;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(l lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = closeHandler$volatile$FU;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, lVar)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = closeHandler$volatile$FU;
                while (true) {
                    Object obj = atomicReferenceFieldUpdater2.get(this);
                    if (obj != BufferedChannelKt.CLOSE_HANDLER_CLOSED) {
                        if (obj != BufferedChannelKt.CLOSE_HANDLER_INVOKED) {
                            throw new IllegalStateException(o2.o(obj, "Another handler is already registered: "));
                        }
                        throw new IllegalStateException("Another handler was already registered and successfully invoked");
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = closeHandler$volatile$FU;
                    Symbol symbol = BufferedChannelKt.CLOSE_HANDLER_CLOSED;
                    Symbol symbol2 = BufferedChannelKt.CLOSE_HANDLER_INVOKED;
                    while (!atomicReferenceFieldUpdater3.compareAndSet(this, symbol, symbol2)) {
                        if (atomicReferenceFieldUpdater3.get(this) != symbol) {
                            break;
                        }
                    }
                    lVar.invoke(getCloseCause());
                    return;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
        return isClosedForReceive0(sendersAndCloseStatus$volatile$FU.get(this));
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return isClosedForSend0(sendersAndCloseStatus$volatile$FU.get(this));
    }

    public boolean isConflatedDropOldest() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
        if (isClosedForReceive() || hasElements$kotlinx_coroutines_core()) {
            return false;
        }
        return !isClosedForReceive();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public ChannelIterator<E> iterator() {
        return new BufferedChannelIterator();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @tu.f
    public boolean offer(E e10) {
        return Channel.DefaultImpls.offer(this, e10);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @tu.f
    public E poll() {
        return (E) Channel.DefaultImpls.poll(this);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public Object receive(zu.d<? super E> dVar) {
        return receive$suspendImpl(this, dVar);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: receiveCatching-JP2dKIU, reason: not valid java name */
    public Object mo5145receiveCatchingJP2dKIU(zu.d<? super ChannelResult<? extends E>> dVar) {
        return m5143receiveCatchingJP2dKIU$suspendImpl(this, dVar);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @tu.f
    public Object receiveOrNull(zu.d<? super E> dVar) {
        return Channel.DefaultImpls.receiveOrNull(this, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void registerSelectForSend(SelectInstance<?> selectInstance, Object obj) {
        ChannelSegment channelSegment;
        ChannelSegment channelSegment2 = (ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zIsClosedForSend0 = isClosedForSend0(andIncrement);
            int i10 = BufferedChannelKt.SEGMENT_SIZE;
            long j11 = j10 / i10;
            int i11 = (int) (j10 % i10);
            if (channelSegment2.f71893id != j11) {
                ChannelSegment channelSegmentFindSegmentSend = findSegmentSend(j11, channelSegment2);
                if (channelSegmentFindSegmentSend != null) {
                    channelSegment = channelSegmentFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    onClosedSelectOnSend(obj, selectInstance);
                    return;
                }
            } else {
                channelSegment = channelSegment2;
            }
            SelectInstance<?> selectInstance2 = selectInstance;
            Object obj2 = obj;
            int iUpdateCellSend = updateCellSend(channelSegment, i11, obj2, j10, selectInstance2, zIsClosedForSend0);
            channelSegment2 = channelSegment;
            x0 x0Var = x0.f87415a;
            if (iUpdateCellSend == 0) {
                channelSegment2.cleanPrev();
                selectInstance2.selectInRegistrationPhase(x0Var);
                return;
            }
            if (iUpdateCellSend == 1) {
                selectInstance2.selectInRegistrationPhase(x0Var);
                return;
            }
            if (iUpdateCellSend == 2) {
                if (zIsClosedForSend0) {
                    channelSegment2.onSlotCleaned();
                    onClosedSelectOnSend(obj2, selectInstance2);
                    return;
                } else {
                    Waiter waiter = selectInstance2 instanceof Waiter ? (Waiter) selectInstance2 : null;
                    if (waiter != null) {
                        prepareSenderForSuspension(waiter, channelSegment2, i11);
                        return;
                    }
                    return;
                }
            }
            if (iUpdateCellSend == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iUpdateCellSend == 4) {
                if (j10 < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment2.cleanPrev();
                }
                onClosedSelectOnSend(obj2, selectInstance2);
                return;
            } else {
                if (iUpdateCellSend == 5) {
                    channelSegment2.cleanPrev();
                }
                obj = obj2;
                selectInstance = selectInstance2;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public Object send(E e10, zu.d<? super x0> dVar) {
        return send$suspendImpl(this, e10, dVar);
    }

    public Object sendBroadcast$kotlinx_coroutines_core(E e10, zu.d<? super Boolean> dVar) {
        return sendBroadcast$suspendImpl(this, e10, dVar);
    }

    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        return shouldSendSuspend(sendersAndCloseStatus$volatile$FU.get(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d6, code lost:
    
        r16 = r7;
        r3 = (kotlinx.coroutines.channels.ChannelSegment) r3.getNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01df, code lost:
    
        if (r3 != null) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.toString():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toStringDebug$kotlinx_coroutines_core() {
        String strValueOf;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("S=" + getSendersCounter$kotlinx_coroutines_core() + ",R=" + getReceiversCounter$kotlinx_coroutines_core() + ",B=" + getBufferEndCounter() + ",B'=" + completedExpandBuffersAndPauseFlag$volatile$FU.get(this) + ",C=" + ((int) (sendersAndCloseStatus$volatile$FU.get(this) >> 60)) + AbstractJsonLexerKt.COMMA);
        int i10 = (int) (sendersAndCloseStatus$volatile$FU.get(this) >> 60);
        if (i10 == 1) {
            sb2.append("CANCELLATION_STARTED,");
        } else if (i10 == 2) {
            sb2.append("CLOSED,");
        } else if (i10 == 3) {
            sb2.append("CANCELLED,");
        }
        sb2.append("SEND_SEGM=" + DebugStringsKt.getHexAddress(sendSegment$volatile$FU.get(this)) + ",RCV_SEGM=" + DebugStringsKt.getHexAddress(receiveSegment$volatile$FU.get(this)));
        if (!isRendezvousOrUnlimited()) {
            sb2.append(",EB_SEGM=" + DebugStringsKt.getHexAddress(bufferEndSegment$volatile$FU.get(this)));
        }
        sb2.append("  ");
        List listListOf = p0.listOf((Object[]) new ChannelSegment[]{receiveSegment$volatile$FU.get(this), sendSegment$volatile$FU.get(this), bufferEndSegment$volatile$FU.get(this)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            if (((ChannelSegment) obj) != BufferedChannelKt.NULL_SEGMENT) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j10 = ((ChannelSegment) next).f71893id;
            do {
                Object next2 = it.next();
                long j11 = ((ChannelSegment) next2).f71893id;
                if (j10 > j11) {
                    next = next2;
                    j10 = j11;
                }
            } while (it.hasNext());
        }
        ChannelSegment channelSegment = (ChannelSegment) next;
        do {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(DebugStringsKt.getHexAddress(channelSegment));
            sb3.append("=[");
            sb3.append(channelSegment.isRemoved() ? "*" : "");
            sb3.append(channelSegment.f71893id);
            sb3.append(",prev=");
            ChannelSegment channelSegment2 = (ChannelSegment) channelSegment.getPrev();
            sb3.append(channelSegment2 != null ? DebugStringsKt.getHexAddress(channelSegment2) : null);
            sb3.append(AbstractJsonLexerKt.COMMA);
            sb2.append(sb3.toString());
            int i11 = BufferedChannelKt.SEGMENT_SIZE;
            for (int i12 = 0; i12 < i11; i12++) {
                Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i12);
                Object element$kotlinx_coroutines_core = channelSegment.getElement$kotlinx_coroutines_core(i12);
                if (state$kotlinx_coroutines_core instanceof CancellableContinuation) {
                    strValueOf = "cont";
                } else if (state$kotlinx_coroutines_core instanceof SelectInstance) {
                    strValueOf = "select";
                } else if (state$kotlinx_coroutines_core instanceof ReceiveCatching) {
                    strValueOf = "receiveCatching";
                } else if (state$kotlinx_coroutines_core instanceof SendBroadcast) {
                    strValueOf = "send(broadcast)";
                } else if (state$kotlinx_coroutines_core instanceof WaiterEB) {
                    strValueOf = "EB(" + state$kotlinx_coroutines_core + ')';
                } else {
                    strValueOf = String.valueOf(state$kotlinx_coroutines_core);
                }
                sb2.append(C3191e4.i.f36529d + i12 + "]=(" + strValueOf + AbstractJsonLexerKt.COMMA + element$kotlinx_coroutines_core + "),");
            }
            StringBuilder sb4 = new StringBuilder("next=");
            ChannelSegment channelSegment3 = (ChannelSegment) channelSegment.getNext();
            sb4.append(channelSegment3 != null ? DebugStringsKt.getHexAddress(channelSegment3) : null);
            sb4.append("]  ");
            sb2.append(sb4.toString());
            channelSegment = (ChannelSegment) channelSegment.getNext();
        } while (channelSegment != null);
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: tryReceive-PtdJZtk, reason: not valid java name */
    public Object mo5146tryReceivePtdJZtk() {
        ChannelSegment channelSegmentFindSegmentReceive;
        long j10 = receivers$volatile$FU.get(this);
        long j11 = sendersAndCloseStatus$volatile$FU.get(this);
        if (isClosedForReceive0(j11)) {
            return ChannelResult.Companion.m5166closedJP2dKIU(getCloseCause());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return ChannelResult.Companion.m5167failurePtdJZtk();
        }
        Object obj = BufferedChannelKt.INTERRUPTED_RCV;
        ChannelSegment channelSegment = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
        while (!isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
            int i10 = BufferedChannelKt.SEGMENT_SIZE;
            long j12 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (channelSegment.f71893id != j12) {
                channelSegmentFindSegmentReceive = findSegmentReceive(j12, channelSegment);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                }
            } else {
                channelSegmentFindSegmentReceive = channelSegment;
            }
            Object objUpdateCellReceive = updateCellReceive(channelSegmentFindSegmentReceive, i11, andIncrement, obj);
            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    prepareReceiverForSuspension(waiter, channelSegmentFindSegmentReceive, i11);
                }
                waitExpandBufferCompletion$kotlinx_coroutines_core(andIncrement);
                channelSegmentFindSegmentReceive.onSlotCleaned();
                return ChannelResult.Companion.m5167failurePtdJZtk();
            }
            if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                    throw new IllegalStateException("unexpected");
                }
                channelSegmentFindSegmentReceive.cleanPrev();
                return ChannelResult.Companion.m5168successJP2dKIU(objUpdateCellReceive);
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegmentFindSegmentReceive.cleanPrev();
            }
            channelSegment = channelSegmentFindSegmentReceive;
        }
        return ChannelResult.Companion.m5166closedJP2dKIU(getCloseCause());
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU */
    public Object mo5139trySendJP2dKIU(E e10) {
        E e11;
        int i10;
        ChannelSegment channelSegment;
        BufferedChannel<E> bufferedChannel;
        if (shouldSendSuspend(sendersAndCloseStatus$volatile$FU.get(this))) {
            return ChannelResult.Companion.m5167failurePtdJZtk();
        }
        Object obj = BufferedChannelKt.INTERRUPTED_SEND;
        ChannelSegment channelSegment2 = (ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zIsClosedForSend0 = isClosedForSend0(andIncrement);
            int i11 = BufferedChannelKt.SEGMENT_SIZE;
            long j11 = j10 / i11;
            int i12 = (int) (j10 % i11);
            if (channelSegment2.f71893id != j11) {
                ChannelSegment channelSegmentFindSegmentSend = findSegmentSend(j11, channelSegment2);
                if (channelSegmentFindSegmentSend != null) {
                    i10 = i12;
                    channelSegment = channelSegmentFindSegmentSend;
                    bufferedChannel = this;
                    e11 = e10;
                } else if (zIsClosedForSend0) {
                    return ChannelResult.Companion.m5166closedJP2dKIU(getSendException());
                }
            } else {
                e11 = e10;
                i10 = i12;
                channelSegment = channelSegment2;
                bufferedChannel = this;
            }
            int iUpdateCellSend = bufferedChannel.updateCellSend(channelSegment, i10, e11, j10, obj, zIsClosedForSend0);
            channelSegment2 = channelSegment;
            x0 x0Var = x0.f87415a;
            if (iUpdateCellSend == 0) {
                channelSegment2.cleanPrev();
                return ChannelResult.Companion.m5168successJP2dKIU(x0Var);
            }
            if (iUpdateCellSend == 1) {
                return ChannelResult.Companion.m5168successJP2dKIU(x0Var);
            }
            if (iUpdateCellSend == 2) {
                if (zIsClosedForSend0) {
                    channelSegment2.onSlotCleaned();
                    return ChannelResult.Companion.m5166closedJP2dKIU(getSendException());
                }
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    prepareSenderForSuspension(waiter, channelSegment2, i10);
                }
                channelSegment2.onSlotCleaned();
                return ChannelResult.Companion.m5167failurePtdJZtk();
            }
            if (iUpdateCellSend == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iUpdateCellSend == 4) {
                if (j10 < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment2.cleanPrev();
                }
                return ChannelResult.Companion.m5166closedJP2dKIU(getSendException());
            }
            if (iUpdateCellSend == 5) {
                channelSegment2.cleanPrev();
            }
            e10 = e11;
        }
    }

    /* renamed from: trySendDropOldest-JP2dKIU, reason: not valid java name */
    public final Object m5147trySendDropOldestJP2dKIU(E e10) {
        ChannelSegment channelSegmentFindSegmentSend;
        int i10;
        BufferedChannel<E> bufferedChannel;
        Object obj = BufferedChannelKt.BUFFERED;
        ChannelSegment channelSegment = (ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zIsClosedForSend0 = isClosedForSend0(andIncrement);
            int i11 = BufferedChannelKt.SEGMENT_SIZE;
            long j11 = j10 / i11;
            int i12 = (int) (j10 % i11);
            if (channelSegment.f71893id != j11) {
                channelSegmentFindSegmentSend = findSegmentSend(j11, channelSegment);
                if (channelSegmentFindSegmentSend != null) {
                    bufferedChannel = this;
                    i10 = i12;
                } else if (zIsClosedForSend0) {
                    return ChannelResult.Companion.m5166closedJP2dKIU(getSendException());
                }
            } else {
                channelSegmentFindSegmentSend = channelSegment;
                i10 = i12;
                bufferedChannel = this;
            }
            E e11 = e10;
            int iUpdateCellSend = bufferedChannel.updateCellSend(channelSegmentFindSegmentSend, i10, e11, j10, obj, zIsClosedForSend0);
            channelSegment = channelSegmentFindSegmentSend;
            x0 x0Var = x0.f87415a;
            if (iUpdateCellSend == 0) {
                channelSegment.cleanPrev();
                return ChannelResult.Companion.m5168successJP2dKIU(x0Var);
            }
            if (iUpdateCellSend == 1) {
                return ChannelResult.Companion.m5168successJP2dKIU(x0Var);
            }
            if (iUpdateCellSend == 2) {
                if (zIsClosedForSend0) {
                    channelSegment.onSlotCleaned();
                    return ChannelResult.Companion.m5166closedJP2dKIU(getSendException());
                }
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    prepareSenderForSuspension(waiter, channelSegment, i10);
                }
                dropFirstElementUntilTheSpecifiedCellIsInTheBuffer((channelSegment.f71893id * i11) + i10);
                return ChannelResult.Companion.m5168successJP2dKIU(x0Var);
            }
            if (iUpdateCellSend == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iUpdateCellSend == 4) {
                if (j10 < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                return ChannelResult.Companion.m5166closedJP2dKIU(getSendException());
            }
            if (iUpdateCellSend == 5) {
                channelSegment.cleanPrev();
            }
            e10 = e11;
        }
    }

    public final void waitExpandBufferCompletion$kotlinx_coroutines_core(long j10) {
        BufferedChannel<E> bufferedChannel = this;
        if (bufferedChannel.isRendezvousOrUnlimited()) {
            return;
        }
        while (bufferedChannel.getBufferEndCounter() <= j10) {
            bufferedChannel = this;
        }
        int i10 = BufferedChannelKt.EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS;
        for (int i11 = 0; i11 < i10; i11++) {
            long bufferEndCounter = bufferedChannel.getBufferEndCounter();
            if (bufferEndCounter == (4611686018427387903L & completedExpandBuffersAndPauseFlag$volatile$FU.get(bufferedChannel)) && bufferEndCounter == bufferedChannel.getBufferEndCounter()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = completedExpandBuffersAndPauseFlag$volatile$FU;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(bufferedChannel);
            if (atomicLongFieldUpdater.compareAndSet(bufferedChannel, j11, BufferedChannelKt.constructEBCompletedAndPauseFlag(j11 & 4611686018427387903L, true))) {
                break;
            } else {
                bufferedChannel = this;
            }
        }
        while (true) {
            long bufferEndCounter2 = bufferedChannel.getBufferEndCounter();
            long j12 = completedExpandBuffersAndPauseFlag$volatile$FU.get(bufferedChannel);
            long j13 = j12 & 4611686018427387903L;
            boolean z10 = (4611686018427387904L & j12) != 0;
            if (bufferEndCounter2 == j13 && bufferEndCounter2 == bufferedChannel.getBufferEndCounter()) {
                break;
            }
            if (z10) {
                bufferedChannel = this;
            } else {
                bufferedChannel = this;
                completedExpandBuffersAndPauseFlag$volatile$FU.compareAndSet(bufferedChannel, j12, BufferedChannelKt.constructEBCompletedAndPauseFlag(j13, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = completedExpandBuffersAndPauseFlag$volatile$FU;
        while (true) {
            long j14 = atomicLongFieldUpdater2.get(bufferedChannel);
            boolean zCompareAndSet = atomicLongFieldUpdater2.compareAndSet(bufferedChannel, j14, BufferedChannelKt.constructEBCompletedAndPauseFlag(j14 & 4611686018427387903L, false));
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
            if (zCompareAndSet) {
                return;
            }
            atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
            bufferedChannel = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KFunction<x0> bindCancellationFun(l lVar) {
        return new AnonymousClass2(this);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel() {
        cancelImpl$kotlinx_coroutines_core(null);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel(CancellationException cancellationException) {
        cancelImpl$kotlinx_coroutines_core(cancellationException);
    }

    public /* synthetic */ BufferedChannel(int i10, l lVar, int i11, u uVar) {
        this(i10, (i11 & 2) != 0 ? null : lVar);
    }

    public static /* synthetic */ void getOnReceive$annotations() {
    }

    public static /* synthetic */ void getOnReceiveCatching$annotations() {
    }

    public static /* synthetic */ void getOnReceiveOrNull$annotations() {
    }

    public static /* synthetic */ void getOnSend$annotations() {
    }

    private static /* synthetic */ void getOnUndeliveredElementReceiveCancellationConstructor$annotations() {
    }

    public static /* synthetic */ void isClosedForReceive$annotations() {
    }

    public static /* synthetic */ void isClosedForSend$annotations() {
    }

    public static /* synthetic */ void isEmpty$annotations() {
    }

    public void onClosedIdempotent() {
    }

    public void onReceiveDequeued() {
    }

    public void onReceiveEnqueued() {
    }
}
