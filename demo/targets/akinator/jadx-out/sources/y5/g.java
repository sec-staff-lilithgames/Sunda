package y5;

import java.io.Closeable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface g extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    c getReadableDatabase();

    c getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z10);
}
