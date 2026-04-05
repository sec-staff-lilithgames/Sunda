package co;

import java.io.IOException;
import ko.a0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface h {
    ko.q getChunkIndex();

    io.bidmachine.media3.common.b[] getSampleFormats();

    void init(g gVar, long j10, long j11);

    boolean read(a0 a0Var) throws IOException;

    void release();
}
