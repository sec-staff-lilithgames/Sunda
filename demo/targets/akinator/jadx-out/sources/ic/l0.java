package ic;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f59512a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f59513b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ReferenceQueue f59514c = new ReferenceQueue();

    public static l0 instance() {
        return k0.f59510a;
    }

    public int releaseBuffers() {
        ConcurrentHashMap concurrentHashMap;
        ReentrantLock reentrantLock = this.f59512a;
        reentrantLock.lock();
        while (true) {
            try {
                SoftReference softReference = (SoftReference) this.f59514c.poll();
                concurrentHashMap = this.f59513b;
                if (softReference == null) {
                    break;
                }
                concurrentHashMap.remove(softReference);
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        Iterator it = concurrentHashMap.keySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            ((SoftReference) it.next()).clear();
            i10++;
        }
        concurrentHashMap.clear();
        reentrantLock.unlock();
        return i10;
    }

    public SoftReference<b> wrapAndTrack(b bVar) {
        ReferenceQueue referenceQueue = this.f59514c;
        SoftReference<b> softReference = new SoftReference<>(bVar, referenceQueue);
        Boolean bool = Boolean.TRUE;
        ConcurrentHashMap concurrentHashMap = this.f59513b;
        concurrentHashMap.put(softReference, bool);
        while (true) {
            SoftReference softReference2 = (SoftReference) referenceQueue.poll();
            if (softReference2 == null) {
                return softReference;
            }
            concurrentHashMap.remove(softReference2);
        }
    }
}
