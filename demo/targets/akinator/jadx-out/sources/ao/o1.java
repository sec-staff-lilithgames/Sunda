package ao;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface o1 {
    boolean isReady();

    void maybeThrowError() throws IOException;

    int readData(io.bidmachine.media3.exoplayer.r0 r0Var, nn.g gVar, int i10);

    int skipData(long j10);
}
