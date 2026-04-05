package ce;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface e {
    Object dequeueInputBuffer() throws g;

    Object dequeueOutputBuffer() throws g;

    void flush();

    String getName();

    void queueInputBuffer(Object obj) throws g;

    void release();
}
