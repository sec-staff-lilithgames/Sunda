package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.internal.Segment;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ChannelSegment<E> extends Segment<ChannelSegment<E>> {
    private final BufferedChannel<E> _channel;
    private final /* synthetic */ AtomicReferenceArray data;

    public ChannelSegment(long j10, ChannelSegment<E> channelSegment, BufferedChannel<E> bufferedChannel, int i10) {
        super(j10, channelSegment, i10);
        this._channel = bufferedChannel;
        this.data = new AtomicReferenceArray(BufferedChannelKt.SEGMENT_SIZE * 2);
    }

    private final /* synthetic */ AtomicReferenceArray getData() {
        return this.data;
    }

    private final void setElementLazy(int i10, Object obj) {
        getData().set(i10 * 2, obj);
    }

    public final boolean casState$kotlinx_coroutines_core(int i10, Object obj, Object obj2) {
        AtomicReferenceArray data = getData();
        int i11 = (i10 * 2) + 1;
        while (!data.compareAndSet(i11, obj, obj2)) {
            if (data.get(i11) != obj) {
                return false;
            }
        }
        return true;
    }

    public final void cleanElement$kotlinx_coroutines_core(int i10) {
        setElementLazy(i10, null);
    }

    public final Object getAndSetState$kotlinx_coroutines_core(int i10, Object obj) {
        return getData().getAndSet((i10 * 2) + 1, obj);
    }

    public final BufferedChannel<E> getChannel() {
        BufferedChannel<E> bufferedChannel = this._channel;
        e0.checkNotNull(bufferedChannel);
        return bufferedChannel;
    }

    public final E getElement$kotlinx_coroutines_core(int i10) {
        return (E) getData().get(i10 * 2);
    }

    @Override // kotlinx.coroutines.internal.Segment
    public int getNumberOfSlots() {
        return BufferedChannelKt.SEGMENT_SIZE;
    }

    public final Object getState$kotlinx_coroutines_core(int i10) {
        return getData().get((i10 * 2) + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0053, code lost:
    
        cleanElement$kotlinx_coroutines_core(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0056, code lost:
    
        if (r0 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0058, code lost:
    
        r4 = getChannel().onUndeliveredElement;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005e, code lost:
    
        if (r4 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0060, code lost:
    
        kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0063, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    @Override // kotlinx.coroutines.internal.Segment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCancellation(int r4, java.lang.Throwable r5, zu.m r6) {
        /*
            r3 = this;
            int r5 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.getElement$kotlinx_coroutines_core(r4)
        Le:
            java.lang.Object r1 = r3.getState$kotlinx_coroutines_core(r4)
            boolean r2 = r1 instanceof kotlinx.coroutines.Waiter
            if (r2 != 0) goto L64
            boolean r2 = r1 instanceof kotlinx.coroutines.channels.WaiterEB
            if (r2 == 0) goto L1b
            goto L64
        L1b:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_SEND$p()
            if (r1 == r2) goto L53
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_RCV$p()
            if (r1 != r2) goto L28
            goto L53
        L28:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_EB$p()
            if (r1 == r2) goto Le
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_RCV$p()
            if (r1 != r2) goto L35
            goto Le
        L35:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.channels.BufferedChannelKt.access$getDONE_RCV$p()
            if (r1 == r4) goto L8a
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            if (r1 != r4) goto L40
            goto L8a
        L40:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            if (r1 != r4) goto L47
            goto L8a
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "unexpected state: "
            java.lang.String r5 = p0.o2.o(r1, r5)
            r4.<init>(r5)
            throw r4
        L53:
            r3.cleanElement$kotlinx_coroutines_core(r4)
            if (r0 == 0) goto L8a
            kotlinx.coroutines.channels.BufferedChannel r4 = r3.getChannel()
            kv.l r4 = r4.onUndeliveredElement
            if (r4 == 0) goto L8a
            kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(r4, r5, r6)
            return
        L64:
            if (r0 == 0) goto L6b
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_SEND$p()
            goto L6f
        L6b:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_RCV$p()
        L6f:
            boolean r1 = r3.casState$kotlinx_coroutines_core(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.cleanElement$kotlinx_coroutines_core(r4)
            r1 = r0 ^ 1
            r3.onCancelledRequest(r4, r1)
            if (r0 == 0) goto L8a
            kotlinx.coroutines.channels.BufferedChannel r4 = r3.getChannel()
            kv.l r4 = r4.onUndeliveredElement
            if (r4 == 0) goto L8a
            kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(r4, r5, r6)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelSegment.onCancellation(int, java.lang.Throwable, zu.m):void");
    }

    public final void onCancelledRequest(int i10, boolean z10) {
        if (z10) {
            getChannel().waitExpandBufferCompletion$kotlinx_coroutines_core((this.f71893id * BufferedChannelKt.SEGMENT_SIZE) + i10);
        }
        onSlotCleaned();
    }

    public final E retrieveElement$kotlinx_coroutines_core(int i10) {
        E element$kotlinx_coroutines_core = getElement$kotlinx_coroutines_core(i10);
        cleanElement$kotlinx_coroutines_core(i10);
        return element$kotlinx_coroutines_core;
    }

    public final void setState$kotlinx_coroutines_core(int i10, Object obj) {
        getData().set((i10 * 2) + 1, obj);
    }

    public final void storeElement$kotlinx_coroutines_core(int i10, E e10) {
        setElementLazy(i10, e10);
    }
}
