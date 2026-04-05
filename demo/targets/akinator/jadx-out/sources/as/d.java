package as;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface d extends Closeable {
    void ackSettings(p pVar) throws IOException;

    void connectionPreface() throws IOException;

    void data(boolean z10, int i10, pw.g gVar, int i11) throws IOException;

    void flush() throws IOException;

    void goAway(int i10, a aVar, byte[] bArr) throws IOException;

    void headers(int i10, List<e> list) throws IOException;

    int maxDataLength();

    void ping(boolean z10, int i10, int i11) throws IOException;

    void pushPromise(int i10, int i11, List<e> list) throws IOException;

    void rstStream(int i10, a aVar) throws IOException;

    void settings(p pVar) throws IOException;

    void synReply(boolean z10, int i10, List<e> list) throws IOException;

    void synStream(boolean z10, boolean z11, int i10, int i11, List<e> list) throws IOException;

    void windowUpdate(int i10, long j10) throws IOException;
}
