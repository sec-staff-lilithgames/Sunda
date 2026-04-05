package d7;

import java.io.Closeable;
import pw.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface c extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    b closeAndEdit();

    n0 getData();

    n0 getMetadata();
}
