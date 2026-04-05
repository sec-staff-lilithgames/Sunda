package kotlinx.coroutines.flow;

import av.e;
import bv.f;
import bv.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.internal.Symbol;
import tu.t;
import tu.x0;
import tu.z;
import uu.p0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class SharedFlowImpl<T> extends AbstractSharedFlow<SharedFlowSlot> implements MutableSharedFlow<T>, CancellableFlow<T>, FusibleFlow<T> {
    private Object[] buffer;
    private final int bufferCapacity;
    private int bufferSize;
    private long minCollectorIndex;
    private final BufferOverflow onBufferOverflow;
    private int queueSize;
    private final int replay;
    private long replayIndex;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Emitter implements DisposableHandle {
        public final zu.d<x0> cont;
        public final SharedFlowImpl<?> flow;
        public long index;
        public final Object value;

        /* JADX WARN: Multi-variable type inference failed */
        public Emitter(SharedFlowImpl<?> sharedFlowImpl, long j10, Object obj, zu.d<? super x0> dVar) {
            this.flow = sharedFlowImpl;
            this.index = j10;
            this.value = obj;
            this.cont = dVar;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
            this.flow.cancelEmitter(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            try {
                iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {387, 394, 397}, m = "collect$suspendImpl", n = {"$this", "collector", "slot", "$this", "collector", "slot", "collectorJob", "$this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: kotlinx.coroutines.flow.SharedFlowImpl$collect$1, reason: invalid class name */
    public static final class AnonymousClass1<T> extends bv.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SharedFlowImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SharedFlowImpl<T> sharedFlowImpl, zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
            this.this$0 = sharedFlowImpl;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedFlowImpl.collect$suspendImpl(this.this$0, null, this);
        }
    }

    public SharedFlowImpl(int i10, int i11, BufferOverflow bufferOverflow) {
        this.replay = i10;
        this.bufferCapacity = i11;
        this.onBufferOverflow = bufferOverflow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitValue(SharedFlowSlot sharedFlowSlot, zu.d<? super x0> dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        synchronized (this) {
            try {
                if (tryPeekLocked(sharedFlowSlot) < 0) {
                    sharedFlowSlot.cont = cancellableContinuationImpl;
                } else {
                    int i10 = z.f87419c;
                    cancellableContinuationImpl.resumeWith(z.m7131constructorimpl(x0.f87415a));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return result == e.getCOROUTINE_SUSPENDED() ? result : x0.f87415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelEmitter(Emitter emitter) {
        synchronized (this) {
            if (emitter.index < getHead()) {
                return;
            }
            Object[] objArr = this.buffer;
            e0.checkNotNull(objArr);
            if (SharedFlowKt.getBufferAt(objArr, emitter.index) != emitter) {
                return;
            }
            SharedFlowKt.setBufferAt(objArr, emitter.index, SharedFlowKt.NO_VALUE);
            cleanupTailLocked();
        }
    }

    private final void cleanupTailLocked() {
        if (this.bufferCapacity != 0 || this.queueSize > 1) {
            Object[] objArr = this.buffer;
            e0.checkNotNull(objArr);
            while (this.queueSize > 0 && SharedFlowKt.getBufferAt(objArr, (getHead() + getTotalSize()) - 1) == SharedFlowKt.NO_VALUE) {
                this.queueSize--;
                SharedFlowKt.setBufferAt(objArr, getHead() + getTotalSize(), null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (((kotlinx.coroutines.flow.SubscribedFlowCollector) r9).onSubscription(r0) == r1) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ <T> java.lang.Object collect$suspendImpl(kotlinx.coroutines.flow.SharedFlowImpl<T> r8, kotlinx.coroutines.flow.FlowCollector<? super T> r9, zu.d<?> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.collect$suspendImpl(kotlinx.coroutines.flow.SharedFlowImpl, kotlinx.coroutines.flow.FlowCollector, zu.d):java.lang.Object");
    }

    private final void correctCollectorIndexesOnDropOldest(long j10) {
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        if (((AbstractSharedFlow) this).nCollectors != 0 && (abstractSharedFlowSlotArr = ((AbstractSharedFlow) this).slots) != null) {
            for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                if (abstractSharedFlowSlot != null) {
                    SharedFlowSlot sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot;
                    long j11 = sharedFlowSlot.index;
                    if (j11 >= 0 && j11 < j10) {
                        sharedFlowSlot.index = j10;
                    }
                }
            }
        }
        this.minCollectorIndex = j10;
    }

    private final void dropOldestLocked() {
        Object[] objArr = this.buffer;
        e0.checkNotNull(objArr);
        SharedFlowKt.setBufferAt(objArr, getHead(), null);
        this.bufferSize--;
        long head = getHead() + 1;
        if (this.replayIndex < head) {
            this.replayIndex = head;
        }
        if (this.minCollectorIndex < head) {
            correctCollectorIndexesOnDropOldest(head);
        }
    }

    public static /* synthetic */ <T> Object emit$suspendImpl(SharedFlowImpl<T> sharedFlowImpl, T t10, zu.d<? super x0> dVar) {
        Object objEmitSuspend;
        boolean zTryEmit = sharedFlowImpl.tryEmit(t10);
        x0 x0Var = x0.f87415a;
        return (!zTryEmit && (objEmitSuspend = sharedFlowImpl.emitSuspend(t10, dVar)) == e.getCOROUTINE_SUSPENDED()) ? objEmitSuspend : x0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object emitSuspend(T t10, zu.d<? super x0> dVar) throws Throwable {
        Throwable th2;
        zu.d<x0>[] dVarArrFindSlotsToResumeLocked;
        Emitter emitter;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        zu.d<x0>[] dVarArrFindSlotsToResumeLocked2 = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            try {
                if (tryEmitLocked(t10)) {
                    try {
                        int i10 = z.f87419c;
                        cancellableContinuationImpl.resumeWith(z.m7131constructorimpl(x0.f87415a));
                        dVarArrFindSlotsToResumeLocked = findSlotsToResumeLocked(dVarArrFindSlotsToResumeLocked2);
                        emitter = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    try {
                        emitter = new Emitter(this, getHead() + getTotalSize(), t10, cancellableContinuationImpl);
                        enqueueLocked(emitter);
                        this.queueSize++;
                        if (this.bufferCapacity == 0) {
                            dVarArrFindSlotsToResumeLocked2 = findSlotsToResumeLocked(dVarArrFindSlotsToResumeLocked2);
                        }
                        dVarArrFindSlotsToResumeLocked = dVarArrFindSlotsToResumeLocked2;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        throw th2;
                    }
                }
                if (emitter != null) {
                    CancellableContinuationKt.disposeOnCancellation(cancellableContinuationImpl, emitter);
                }
                for (zu.d<x0> dVar2 : dVarArrFindSlotsToResumeLocked) {
                    if (dVar2 != null) {
                        int i11 = z.f87419c;
                        dVar2.resumeWith(z.m7131constructorimpl(x0.f87415a));
                    }
                }
                Object result = cancellableContinuationImpl.getResult();
                if (result == e.getCOROUTINE_SUSPENDED()) {
                    h.probeCoroutineSuspended(dVar);
                }
                return result == e.getCOROUTINE_SUSPENDED() ? result : x0.f87415a;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enqueueLocked(Object obj) {
        int totalSize = getTotalSize();
        Object[] objArrGrowBuffer = this.buffer;
        if (objArrGrowBuffer == null) {
            objArrGrowBuffer = growBuffer(null, 0, 2);
        } else if (totalSize >= objArrGrowBuffer.length) {
            objArrGrowBuffer = growBuffer(objArrGrowBuffer, totalSize, objArrGrowBuffer.length * 2);
        }
        SharedFlowKt.setBufferAt(objArrGrowBuffer, getHead() + totalSize, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final zu.d<x0>[] findSlotsToResumeLocked(zu.d<x0>[] dVarArr) {
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        SharedFlowSlot sharedFlowSlot;
        zu.d<? super x0> dVar;
        int length = dVarArr.length;
        if (((AbstractSharedFlow) this).nCollectors != 0 && (abstractSharedFlowSlotArr = ((AbstractSharedFlow) this).slots) != null) {
            int length2 = abstractSharedFlowSlotArr.length;
            int i10 = 0;
            dVarArr = dVarArr;
            while (i10 < length2) {
                AbstractSharedFlowSlot abstractSharedFlowSlot = abstractSharedFlowSlotArr[i10];
                if (abstractSharedFlowSlot != null && (dVar = (sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot).cont) != null && tryPeekLocked(sharedFlowSlot) >= 0) {
                    int length3 = dVarArr.length;
                    dVarArr = dVarArr;
                    if (length >= length3) {
                        ?? CopyOf = Arrays.copyOf(dVarArr, Math.max(2, dVarArr.length * 2));
                        e0.checkNotNullExpressionValue(CopyOf, "copyOf(...)");
                        dVarArr = CopyOf;
                    }
                    dVarArr[length] = dVar;
                    sharedFlowSlot.cont = null;
                    length++;
                }
                i10++;
                dVarArr = dVarArr;
            }
        }
        return dVarArr;
    }

    private final long getBufferEndIndex() {
        return getHead() + this.bufferSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getHead() {
        return Math.min(this.minCollectorIndex, this.replayIndex);
    }

    private final Object getPeekedValueLockedAt(long j10) {
        Object[] objArr = this.buffer;
        e0.checkNotNull(objArr);
        Object bufferAt = SharedFlowKt.getBufferAt(objArr, j10);
        return bufferAt instanceof Emitter ? ((Emitter) bufferAt).value : bufferAt;
    }

    private final long getQueueEndIndex() {
        return getHead() + this.bufferSize + this.queueSize;
    }

    private final int getReplaySize() {
        return (int) ((getHead() + this.bufferSize) - this.replayIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTotalSize() {
        return this.bufferSize + this.queueSize;
    }

    private final Object[] growBuffer(Object[] objArr, int i10, int i11) {
        if (i11 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i11];
        this.buffer = objArr2;
        if (objArr != null) {
            long head = getHead();
            for (int i12 = 0; i12 < i10; i12++) {
                long j10 = i12 + head;
                SharedFlowKt.setBufferAt(objArr2, j10, SharedFlowKt.getBufferAt(objArr, j10));
            }
        }
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean tryEmitLocked(T t10) {
        if (getNCollectors() == 0) {
            return tryEmitNoCollectorsLocked(t10);
        }
        if (this.bufferSize >= this.bufferCapacity && this.minCollectorIndex <= this.replayIndex) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[this.onBufferOverflow.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
            if (i10 != 3) {
                throw new t();
            }
        }
        enqueueLocked(t10);
        int i11 = this.bufferSize + 1;
        this.bufferSize = i11;
        if (i11 > this.bufferCapacity) {
            dropOldestLocked();
        }
        if (getReplaySize() > this.replay) {
            updateBufferLocked(this.replayIndex + 1, this.minCollectorIndex, getBufferEndIndex(), getQueueEndIndex());
        }
        return true;
    }

    private final boolean tryEmitNoCollectorsLocked(T t10) {
        if (this.replay == 0) {
            return true;
        }
        enqueueLocked(t10);
        int i10 = this.bufferSize + 1;
        this.bufferSize = i10;
        if (i10 > this.replay) {
            dropOldestLocked();
        }
        this.minCollectorIndex = getHead() + this.bufferSize;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long tryPeekLocked(SharedFlowSlot sharedFlowSlot) {
        long j10 = sharedFlowSlot.index;
        if (j10 >= getBufferEndIndex() && (this.bufferCapacity > 0 || j10 > getHead() || this.queueSize == 0)) {
            return -1L;
        }
        return j10;
    }

    private final Object tryTakeValue(SharedFlowSlot sharedFlowSlot) {
        Object obj;
        zu.d<x0>[] dVarArrUpdateCollectorIndexLocked$kotlinx_coroutines_core = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            try {
                long jTryPeekLocked = tryPeekLocked(sharedFlowSlot);
                if (jTryPeekLocked < 0) {
                    obj = SharedFlowKt.NO_VALUE;
                } else {
                    long j10 = sharedFlowSlot.index;
                    Object peekedValueLockedAt = getPeekedValueLockedAt(jTryPeekLocked);
                    sharedFlowSlot.index = jTryPeekLocked + 1;
                    dVarArrUpdateCollectorIndexLocked$kotlinx_coroutines_core = updateCollectorIndexLocked$kotlinx_coroutines_core(j10);
                    obj = peekedValueLockedAt;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (zu.d<x0> dVar : dVarArrUpdateCollectorIndexLocked$kotlinx_coroutines_core) {
            if (dVar != null) {
                int i10 = z.f87419c;
                dVar.resumeWith(z.m7131constructorimpl(x0.f87415a));
            }
        }
        return obj;
    }

    private final void updateBufferLocked(long j10, long j11, long j12, long j13) {
        long jMin = Math.min(j11, j10);
        for (long head = getHead(); head < jMin; head++) {
            Object[] objArr = this.buffer;
            e0.checkNotNull(objArr);
            SharedFlowKt.setBufferAt(objArr, head, null);
        }
        this.replayIndex = j10;
        this.minCollectorIndex = j11;
        this.bufferSize = (int) (j12 - jMin);
        this.queueSize = (int) (j13 - j12);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, zu.d<?> dVar) {
        return collect$suspendImpl(this, flowCollector, dVar);
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t10, zu.d<? super x0> dVar) {
        return emit$suspendImpl(this, t10, dVar);
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public Flow<T> fuse(m mVar, int i10, BufferOverflow bufferOverflow) {
        return SharedFlowKt.fuseSharedFlow(this, mVar, i10, bufferOverflow);
    }

    public final T getLastReplayedLocked() {
        Object[] objArr = this.buffer;
        e0.checkNotNull(objArr);
        return (T) SharedFlowKt.getBufferAt(objArr, (this.replayIndex + getReplaySize()) - 1);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<T> getReplayCache() {
        synchronized (this) {
            int replaySize = getReplaySize();
            if (replaySize == 0) {
                return p0.emptyList();
            }
            ArrayList arrayList = new ArrayList(replaySize);
            Object[] objArr = this.buffer;
            e0.checkNotNull(objArr);
            for (int i10 = 0; i10 < replaySize; i10++) {
                arrayList.add(SharedFlowKt.getBufferAt(objArr, this.replayIndex + i10));
            }
            return arrayList;
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() throws Throwable {
        synchronized (this) {
            try {
                try {
                    updateBufferLocked(getBufferEndIndex(), this.minCollectorIndex, getBufferEndIndex(), getQueueEndIndex());
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T t10) {
        int i10;
        boolean z10;
        zu.d<x0>[] dVarArrFindSlotsToResumeLocked = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            if (tryEmitLocked(t10)) {
                dVarArrFindSlotsToResumeLocked = findSlotsToResumeLocked(dVarArrFindSlotsToResumeLocked);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (zu.d<x0> dVar : dVarArrFindSlotsToResumeLocked) {
            if (dVar != null) {
                int i11 = z.f87419c;
                dVar.resumeWith(z.m7131constructorimpl(x0.f87415a));
            }
        }
        return z10;
    }

    public final zu.d<x0>[] updateCollectorIndexLocked$kotlinx_coroutines_core(long j10) {
        long j11;
        long j12;
        long j13;
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        if (j10 > this.minCollectorIndex) {
            return AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long head = getHead();
        long j14 = this.bufferSize + head;
        if (this.bufferCapacity == 0 && this.queueSize > 0) {
            j14++;
        }
        if (((AbstractSharedFlow) this).nCollectors != 0 && (abstractSharedFlowSlotArr = ((AbstractSharedFlow) this).slots) != null) {
            for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                if (abstractSharedFlowSlot != null) {
                    long j15 = ((SharedFlowSlot) abstractSharedFlowSlot).index;
                    if (j15 >= 0 && j15 < j14) {
                        j14 = j15;
                    }
                }
            }
        }
        if (j14 <= this.minCollectorIndex) {
            return AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long bufferEndIndex = getBufferEndIndex();
        int iMin = getNCollectors() > 0 ? Math.min(this.queueSize, this.bufferCapacity - ((int) (bufferEndIndex - j14))) : this.queueSize;
        zu.d<x0>[] dVarArr = AbstractSharedFlowKt.EMPTY_RESUMES;
        long j16 = this.queueSize + bufferEndIndex;
        if (iMin > 0) {
            dVarArr = new zu.d[iMin];
            Object[] objArr = this.buffer;
            e0.checkNotNull(objArr);
            j13 = 1;
            long j17 = bufferEndIndex;
            int i10 = 0;
            while (true) {
                if (bufferEndIndex >= j16) {
                    j11 = head;
                    j12 = j14;
                    bufferEndIndex = j17;
                    break;
                }
                Object bufferAt = SharedFlowKt.getBufferAt(objArr, bufferEndIndex);
                j11 = head;
                Symbol symbol = SharedFlowKt.NO_VALUE;
                if (bufferAt != symbol) {
                    e0.checkNotNull(bufferAt, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    Emitter emitter = (Emitter) bufferAt;
                    int i11 = i10 + 1;
                    j12 = j14;
                    dVarArr[i10] = emitter.cont;
                    SharedFlowKt.setBufferAt(objArr, bufferEndIndex, symbol);
                    SharedFlowKt.setBufferAt(objArr, j17, emitter.value);
                    long j18 = j17 + 1;
                    if (i11 >= iMin) {
                        bufferEndIndex = j18;
                        break;
                    }
                    i10 = i11;
                    j17 = j18;
                } else {
                    j12 = j14;
                }
                bufferEndIndex++;
                head = j11;
                j14 = j12;
            }
        } else {
            j11 = head;
            j12 = j14;
            j13 = 1;
        }
        zu.d<x0>[] dVarArr2 = dVarArr;
        int i12 = (int) (bufferEndIndex - j11);
        long j19 = getNCollectors() == 0 ? bufferEndIndex : j12;
        long jMax = Math.max(this.replayIndex, bufferEndIndex - Math.min(this.replay, i12));
        if (this.bufferCapacity == 0 && jMax < j16) {
            Object[] objArr2 = this.buffer;
            e0.checkNotNull(objArr2);
            if (e0.areEqual(SharedFlowKt.getBufferAt(objArr2, jMax), SharedFlowKt.NO_VALUE)) {
                bufferEndIndex += j13;
                jMax += j13;
            }
        }
        updateBufferLocked(jMax, j19, bufferEndIndex, j16);
        cleanupTailLocked();
        return !(dVarArr2.length == 0) ? findSlotsToResumeLocked(dVarArr2) : dVarArr2;
    }

    public final long updateNewCollectorIndexLocked$kotlinx_coroutines_core() {
        long j10 = this.replayIndex;
        if (j10 < this.minCollectorIndex) {
            this.minCollectorIndex = j10;
        }
        return j10;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public SharedFlowSlot createSlot() {
        return new SharedFlowSlot();
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public SharedFlowSlot[] createSlotArray(int i10) {
        return new SharedFlowSlot[i10];
    }

    public static /* synthetic */ void getLastReplayedLocked$annotations() {
    }
}
