package zt;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q2 extends ConcurrentLinkedQueue implements t2 {

    /* renamed from: b, reason: collision with root package name */
    public int f98735b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f98736c = new AtomicInteger();

    @Override // zt.t2
    public int consumerIndex() {
        return this.f98735b;
    }

    @Override // zt.t2
    public void drop() {
        poll();
    }

    @Override // zt.t2, vt.o
    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, zt.t2, vt.o
    public Object poll() {
        Object objPoll = super.poll();
        if (objPoll != null) {
            this.f98735b++;
        }
        return objPoll;
    }

    @Override // zt.t2
    public int producerIndex() {
        return this.f98736c.get();
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, zt.t2, vt.o
    public boolean offer(Object obj) {
        this.f98736c.getAndIncrement();
        return super.offer(obj);
    }
}
