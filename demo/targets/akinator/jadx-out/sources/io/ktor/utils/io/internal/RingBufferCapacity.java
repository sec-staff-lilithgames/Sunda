package io.ktor.utils.io.internal;

import e3.g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import tu.k;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class RingBufferCapacity {
    public static final /* synthetic */ AtomicIntegerFieldUpdater _availableForRead$FU$internal = AtomicIntegerFieldUpdater.newUpdater(RingBufferCapacity.class, "_availableForRead$internal");
    public static final /* synthetic */ AtomicIntegerFieldUpdater _availableForWrite$FU$internal = AtomicIntegerFieldUpdater.newUpdater(RingBufferCapacity.class, "_availableForWrite$internal");
    static final /* synthetic */ AtomicIntegerFieldUpdater _pendingToFlush$FU = AtomicIntegerFieldUpdater.newUpdater(RingBufferCapacity.class, "_pendingToFlush");
    public volatile /* synthetic */ int _availableForWrite$internal;
    private final int totalCapacity;
    public volatile /* synthetic */ int _availableForRead$internal = 0;
    volatile /* synthetic */ int _pendingToFlush = 0;

    public RingBufferCapacity(int i10) {
        this.totalCapacity = i10;
        this._availableForWrite$internal = i10;
    }

    private final Void completeReadOverflow(int i10, int i11, int i12) {
        StringBuilder sbF = i.f(i10, i12, "Completed read overflow: ", " + ", " = ");
        sbF.append(i11);
        sbF.append(" > ");
        sbF.append(this.totalCapacity);
        throw new IllegalArgumentException(sbF.toString());
    }

    private final Void completeWriteOverflow(int i10, int i11) {
        StringBuilder sbF = i.f(i10, i11, "Complete write overflow: ", " + ", " > ");
        sbF.append(this.totalCapacity);
        throw new IllegalArgumentException(sbF.toString());
    }

    private final void setAvailableForRead(int i10) {
        this._availableForRead$internal = i10;
    }

    private final void setAvailableForWrite(int i10) {
        this._availableForWrite$internal = i10;
    }

    public final void completeRead(int i10) {
        int i11;
        int i12;
        do {
            i11 = this._availableForWrite$internal;
            i12 = i11 + i10;
            if (i12 > this.totalCapacity) {
                completeReadOverflow(i11, i12, i10);
                throw new k();
            }
        } while (!_availableForWrite$FU$internal.compareAndSet(this, i11, i12));
    }

    public final void completeWrite(int i10) {
        int i11;
        int i12;
        do {
            i11 = this._pendingToFlush;
            i12 = i11 + i10;
            if (i12 > this.totalCapacity) {
                completeWriteOverflow(i11, i10);
                throw new k();
            }
        } while (!_pendingToFlush$FU.compareAndSet(this, i11, i12));
    }

    public final boolean flush() {
        int andSet = _pendingToFlush$FU.getAndSet(this, 0);
        return andSet == 0 ? this._availableForRead$internal > 0 : _availableForRead$FU$internal.addAndGet(this, andSet) > 0;
    }

    public final void forceLockForRelease() {
        _availableForWrite$FU$internal.getAndSet(this, 0);
    }

    public final int getAvailableForRead() {
        return this._availableForRead$internal;
    }

    public final int getAvailableForWrite() {
        return this._availableForWrite$internal;
    }

    public final int getPendingToFlush() {
        return this._pendingToFlush;
    }

    public final boolean isEmpty() {
        return this._availableForWrite$internal == this.totalCapacity;
    }

    public final boolean isFull() {
        return this._availableForWrite$internal == 0;
    }

    public final void resetForRead() {
        this._availableForRead$internal = this.totalCapacity;
        this._availableForWrite$internal = 0;
        this._pendingToFlush = 0;
    }

    public final void resetForWrite() {
        this._availableForRead$internal = 0;
        this._pendingToFlush = 0;
        this._availableForWrite$internal = this.totalCapacity;
    }

    public final void setPendingToFlush(int i10) {
        this._pendingToFlush = i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RingBufferCapacity[read: ");
        sb2.append(this._availableForRead$internal);
        sb2.append(", write: ");
        sb2.append(this._availableForWrite$internal);
        sb2.append(", flush: ");
        sb2.append(this._pendingToFlush);
        sb2.append(", capacity: ");
        return g.m(sb2, this.totalCapacity, AbstractJsonLexerKt.END_LIST);
    }

    public final boolean tryLockForRelease() {
        int i10;
        do {
            i10 = this._availableForWrite$internal;
            if (this._pendingToFlush > 0 || this._availableForRead$internal > 0 || i10 != this.totalCapacity) {
                return false;
            }
        } while (!_availableForWrite$FU$internal.compareAndSet(this, i10, 0));
        return true;
    }

    public final int tryReadAtLeast(int i10) {
        int i11;
        do {
            i11 = this._availableForRead$internal;
            if (i11 < i10) {
                return 0;
            }
        } while (!_availableForRead$FU$internal.compareAndSet(this, i11, 0));
        return i11;
    }

    public final int tryReadAtMost(int i10) {
        int i11;
        int iMin;
        do {
            i11 = this._availableForRead$internal;
            iMin = Math.min(i10, i11);
            if (iMin == 0) {
                return 0;
            }
        } while (!_availableForRead$FU$internal.compareAndSet(this, i11, i11 - iMin));
        return Math.min(i10, i11);
    }

    public final boolean tryReadExact(int i10) {
        int i11;
        do {
            i11 = this._availableForRead$internal;
            if (i11 < i10) {
                return false;
            }
        } while (!_availableForRead$FU$internal.compareAndSet(this, i11, i11 - i10));
        return true;
    }

    public final int tryWriteAtLeast(int i10) {
        int i11;
        do {
            i11 = this._availableForWrite$internal;
            if (i11 < i10) {
                return 0;
            }
        } while (!_availableForWrite$FU$internal.compareAndSet(this, i11, 0));
        return i11;
    }

    public final int tryWriteAtMost(int i10) {
        int i11;
        int iMin;
        do {
            i11 = this._availableForWrite$internal;
            iMin = Math.min(i10, i11);
            if (iMin == 0) {
                return 0;
            }
        } while (!_availableForWrite$FU$internal.compareAndSet(this, i11, i11 - iMin));
        return Math.min(i10, i11);
    }

    public final boolean tryWriteExact(int i10) {
        int i11;
        do {
            i11 = this._availableForWrite$internal;
            if (i11 < i10) {
                return false;
            }
        } while (!_availableForWrite$FU$internal.compareAndSet(this, i11, i11 - i10));
        return true;
    }
}
