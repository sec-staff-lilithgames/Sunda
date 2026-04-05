package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class ThreadSafeHeap<T extends ThreadSafeHeapNode & Comparable<? super T>> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater _size$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(ThreadSafeHeap.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    private T[] f71894a;

    private final /* synthetic */ int get_size$volatile() {
        return this._size$volatile;
    }

    private final T[] realloc() {
        T[] tArr = this.f71894a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new ThreadSafeHeapNode[4];
            this.f71894a = tArr2;
            return tArr2;
        }
        if (getSize() < tArr.length) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, getSize() * 2);
        e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        T[] tArr3 = (T[]) ((ThreadSafeHeapNode[]) objArrCopyOf);
        this.f71894a = tArr3;
        return tArr3;
    }

    private final void setSize(int i10) {
        _size$volatile$FU.set(this, i10);
    }

    private final /* synthetic */ void set_size$volatile(int i10) {
        this._size$volatile = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void siftDownFrom(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.getSize()
            if (r1 < r2) goto Lb
            goto L3e
        Lb:
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r2 = r5.f71894a
            kotlin.jvm.internal.e0.checkNotNull(r2)
            int r0 = r0 + 2
            int r3 = r5.getSize()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            kotlin.jvm.internal.e0.checkNotNull(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            kotlin.jvm.internal.e0.checkNotNull(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            kotlin.jvm.internal.e0.checkNotNull(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            kotlin.jvm.internal.e0.checkNotNull(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
        L3e:
            return
        L3f:
            r5.swap(r6, r0)
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.ThreadSafeHeap.siftDownFrom(int):void");
    }

    private final void siftUpFrom(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f71894a;
            e0.checkNotNull(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            e0.checkNotNull(t10);
            T t11 = tArr[i10];
            e0.checkNotNull(t11);
            if (((Comparable) t10).compareTo(t11) <= 0) {
                return;
            }
            swap(i10, i11);
            i10 = i11;
        }
    }

    private final void swap(int i10, int i11) {
        T[] tArr = this.f71894a;
        e0.checkNotNull(tArr);
        T t10 = tArr[i11];
        e0.checkNotNull(t10);
        T t11 = tArr[i10];
        e0.checkNotNull(t11);
        tArr[i10] = t10;
        tArr[i11] = t11;
        t10.setIndex(i10);
        t11.setIndex(i11);
    }

    public final void addImpl(T t10) {
        t10.setHeap(this);
        ThreadSafeHeapNode[] threadSafeHeapNodeArrRealloc = realloc();
        int size = getSize();
        setSize(size + 1);
        threadSafeHeapNodeArrRealloc[size] = t10;
        t10.setIndex(size);
        siftUpFrom(size);
    }

    public final void addLast(T t10) {
        synchronized (this) {
            addImpl(t10);
        }
    }

    public final boolean addLastIf(T t10, l lVar) {
        boolean z10;
        synchronized (this) {
            try {
                if (((Boolean) lVar.invoke(firstImpl())).booleanValue()) {
                    addImpl(t10);
                    z10 = true;
                } else {
                    z10 = false;
                }
                b0.finallyStart(1);
            } catch (Throwable th2) {
                b0.finallyStart(1);
                b0.finallyEnd(1);
                throw th2;
            }
        }
        b0.finallyEnd(1);
        return z10;
    }

    public final T find(l lVar) {
        T t10;
        synchronized (this) {
            try {
                int size = getSize();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    T[] tArr = this.f71894a;
                    t10 = tArr != null ? tArr[i10] : null;
                    e0.checkNotNull(t10);
                    if (((Boolean) lVar.invoke(t10)).booleanValue()) {
                        break;
                    }
                    i10++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }

    public final T firstImpl() {
        T[] tArr = this.f71894a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int getSize() {
        return _size$volatile$FU.get(this);
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final T peek() {
        T t10;
        synchronized (this) {
            t10 = (T) firstImpl();
        }
        return t10;
    }

    public final boolean remove(T t10) {
        boolean z10;
        synchronized (this) {
            if (t10.getHeap() == null) {
                z10 = false;
            } else {
                removeAtImpl(t10.getIndex());
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T removeAtImpl(int r6) {
        /*
            r5 = this;
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r0 = r5.f71894a
            kotlin.jvm.internal.e0.checkNotNull(r0)
            int r1 = r5.getSize()
            r2 = -1
            int r1 = r1 + r2
            r5.setSize(r1)
            int r1 = r5.getSize()
            if (r6 >= r1) goto L3d
            int r1 = r5.getSize()
            r5.swap(r6, r1)
            int r1 = r6 + (-1)
            int r1 = r1 / 2
            if (r6 <= 0) goto L3a
            r3 = r0[r6]
            kotlin.jvm.internal.e0.checkNotNull(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            kotlin.jvm.internal.e0.checkNotNull(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3a
            r5.swap(r6, r1)
            r5.siftUpFrom(r1)
            goto L3d
        L3a:
            r5.siftDownFrom(r6)
        L3d:
            int r6 = r5.getSize()
            r6 = r0[r6]
            kotlin.jvm.internal.e0.checkNotNull(r6)
            r1 = 0
            r6.setHeap(r1)
            r6.setIndex(r2)
            int r2 = r5.getSize()
            r0[r2] = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.ThreadSafeHeap.removeAtImpl(int):kotlinx.coroutines.internal.ThreadSafeHeapNode");
    }

    public final T removeFirstIf(l lVar) {
        synchronized (this) {
            try {
                ThreadSafeHeapNode threadSafeHeapNodeFirstImpl = firstImpl();
                T t10 = null;
                if (threadSafeHeapNodeFirstImpl == null) {
                    b0.finallyStart(2);
                    b0.finallyEnd(2);
                    return null;
                }
                if (((Boolean) lVar.invoke(threadSafeHeapNodeFirstImpl)).booleanValue()) {
                    t10 = (T) removeAtImpl(0);
                }
                b0.finallyStart(1);
                b0.finallyEnd(1);
                return t10;
            } catch (Throwable th2) {
                b0.finallyStart(1);
                b0.finallyEnd(1);
                throw th2;
            }
        }
    }

    public final T removeFirstOrNull() {
        T t10;
        synchronized (this) {
            t10 = getSize() > 0 ? (T) removeAtImpl(0) : null;
        }
        return t10;
    }
}
