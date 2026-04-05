package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface t2 extends vt.o {
    @Override // vt.o
    /* synthetic */ void clear();

    int consumerIndex();

    void drop();

    @Override // vt.o
    /* synthetic */ boolean isEmpty();

    @Override // java.util.Queue, zt.t2, vt.o
    /* synthetic */ boolean offer(Object obj);

    @Override // vt.o
    /* synthetic */ boolean offer(Object obj, Object obj2);

    Object peek();

    @Override // java.util.Queue, zt.t2, vt.o
    Object poll();

    int producerIndex();
}
