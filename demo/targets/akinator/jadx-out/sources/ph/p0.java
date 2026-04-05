package ph;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f81342a = Logger.getLogger(p0.class.getName());

    public static void close(Closeable closeable, boolean z10) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e10) {
            if (!z10) {
                throw e10;
            }
            f81342a.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e10);
        }
    }

    public static void closeQuietly(InputStream inputStream) {
        try {
            close(inputStream, true);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public static void closeQuietly(Reader reader) {
        try {
            close(reader, true);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
