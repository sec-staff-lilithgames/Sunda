package bf;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface b1 {
    boolean isReady();

    void maybeThrowError() throws IOException;

    int readData(com.google.android.exoplayer2.a1 a1Var, ce.h hVar, int i10);

    int skipData(long j10);
}
