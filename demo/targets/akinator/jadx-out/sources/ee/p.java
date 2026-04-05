package ee;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface p {
    void init(s sVar);

    int read(q qVar, f0 f0Var) throws IOException;

    void release();

    void seek(long j10, long j11);

    boolean sniff(q qVar) throws IOException;
}
