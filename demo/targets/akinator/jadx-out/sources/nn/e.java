package nn;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface e {
    Object dequeueInputBuffer() throws f;

    Object dequeueOutputBuffer() throws f;

    void flush();

    String getName();

    void queueInputBuffer(Object obj) throws f;

    void release();

    void setOutputStartTimeUs(long j10);
}
