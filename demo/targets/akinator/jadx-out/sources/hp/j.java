package hp;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface j extends nn.e {
    @Override // nn.e
    /* synthetic */ Object dequeueInputBuffer() throws nn.f;

    @Override // nn.e
    /* synthetic */ Object dequeueOutputBuffer() throws nn.f;

    @Override // nn.e
    /* synthetic */ void flush();

    /* synthetic */ String getName();

    @Override // nn.e
    /* synthetic */ void queueInputBuffer(Object obj) throws nn.f;

    @Override // nn.e
    /* synthetic */ void release();

    @Override // nn.e
    /* synthetic */ void setOutputStartTimeUs(long j10);

    void setPositionUs(long j10);
}
