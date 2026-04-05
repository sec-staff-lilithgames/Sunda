package ef;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface k extends ce.e {
    @Override // ce.e
    /* synthetic */ Object dequeueInputBuffer() throws ce.g;

    @Override // ce.e
    /* synthetic */ Object dequeueOutputBuffer() throws ce.g;

    @Override // ce.e
    /* synthetic */ void flush();

    @Override // ce.e
    /* synthetic */ String getName();

    @Override // ce.e
    /* synthetic */ void queueInputBuffer(Object obj) throws ce.g;

    @Override // ce.e
    /* synthetic */ void release();

    void setPositionUs(long j10);
}
