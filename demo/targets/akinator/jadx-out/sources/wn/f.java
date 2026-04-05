package wn;

import nn.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface f extends nn.e {
    @Override // nn.e
    /* synthetic */ Object dequeueInputBuffer() throws nn.f;

    @Override // nn.e
    /* bridge */ /* synthetic */ default Object dequeueOutputBuffer() throws nn.f {
        return ((d) this).dequeueOutputBuffer();
    }

    @Override // nn.e
    i dequeueOutputBuffer() throws g;

    @Override // nn.e
    /* synthetic */ void flush();

    @Override // nn.e, hp.j
    /* synthetic */ String getName();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nn.e
    /* bridge */ /* synthetic */ default void queueInputBuffer(Object obj) throws nn.f {
        ((k) this).queueInputBuffer((nn.g) obj);
    }

    void queueInputBuffer(nn.g gVar) throws g;

    @Override // nn.e
    /* synthetic */ void release();

    @Override // nn.e
    /* synthetic */ void setOutputStartTimeUs(long j10);
}
