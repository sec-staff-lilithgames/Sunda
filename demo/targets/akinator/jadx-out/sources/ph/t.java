package ph;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class t {
    public g0 asCharSink(Charset charset) {
        return new s(this, charset);
    }

    public OutputStream openBufferedStream() throws IOException {
        OutputStream outputStreamOpenStream = openStream();
        return outputStreamOpenStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStreamOpenStream : new BufferedOutputStream(outputStreamOpenStream);
    }

    public abstract OutputStream openStream() throws IOException;

    public void write(byte[] bArr) throws IOException {
        p1.checkNotNull(bArr);
        OutputStream outputStreamOpenStream = openStream();
        try {
            outputStreamOpenStream.write(bArr);
            outputStreamOpenStream.close();
        } catch (Throwable th2) {
            if (outputStreamOpenStream != null) {
                try {
                    outputStreamOpenStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public long writeFrom(InputStream inputStream) throws IOException {
        p1.checkNotNull(inputStream);
        OutputStream outputStreamOpenStream = openStream();
        try {
            long jCopy = e0.copy(inputStream, outputStreamOpenStream);
            if (outputStreamOpenStream != null) {
                outputStreamOpenStream.close();
            }
            return jCopy;
        } catch (Throwable th2) {
            if (outputStreamOpenStream != null) {
                try {
                    outputStreamOpenStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
