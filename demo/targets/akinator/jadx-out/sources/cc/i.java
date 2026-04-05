package cc;

import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class i implements Serializable {
    public DataInput decorate(h hVar, DataInput dataInput) throws IOException {
        throw new UnsupportedOperationException();
    }

    public abstract InputStream decorate(h hVar, InputStream inputStream) throws IOException;

    public abstract InputStream decorate(h hVar, byte[] bArr, int i10, int i11) throws IOException;

    public abstract Reader decorate(h hVar, Reader reader) throws IOException;
}
