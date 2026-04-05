package ko;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface a0 extends gn.o {
    void advancePeekPosition(int i10) throws IOException;

    boolean advancePeekPosition(int i10, boolean z10) throws IOException;

    long getLength();

    long getPeekPosition();

    long getPosition();

    int peek(byte[] bArr, int i10, int i11) throws IOException;

    void peekFully(byte[] bArr, int i10, int i11) throws IOException;

    boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) throws IOException;

    @Override // gn.o
    int read(byte[] bArr, int i10, int i11) throws IOException;

    void readFully(byte[] bArr, int i10, int i11) throws IOException;

    boolean readFully(byte[] bArr, int i10, int i11, boolean z10) throws IOException;

    void resetPeekPosition();

    <E extends Throwable> void setRetryPosition(long j10, E e10) throws Throwable;

    int skip(int i10) throws IOException;

    void skipFully(int i10) throws IOException;

    boolean skipFully(int i10, boolean z10) throws IOException;
}
