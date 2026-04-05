package v4;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends b {
    public g(byte[] bArr) {
        super(bArr);
        this.f88984b.mark(Integer.MAX_VALUE);
    }

    public void seek(long j10) throws IOException {
        int i10 = this.f88986e;
        if (i10 > j10) {
            this.f88986e = 0;
            this.f88984b.reset();
        } else {
            j10 -= i10;
        }
        skipFully((int) j10);
    }

    public g(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f88984b.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
