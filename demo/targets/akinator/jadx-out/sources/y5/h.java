package y5;

import java.io.Closeable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface h extends Closeable {
    void bindBlob(int i10, byte[] bArr);

    void bindDouble(int i10, double d10);

    void bindLong(int i10, long j10);

    void bindNull(int i10);

    void bindString(int i10, String str);

    void clearBindings();
}
