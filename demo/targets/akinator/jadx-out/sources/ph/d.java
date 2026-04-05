package ph;

import java.io.IOException;
import java.io.Reader;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d extends Reader {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Reader f81287b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f81288c;

    public d(Reader reader, String str) {
        this.f81287b = reader;
        this.f81288c = str;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f81287b.close();
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        int i10;
        do {
            i10 = this.f81287b.read();
            if (i10 == -1) {
                break;
            }
        } while (this.f81288c.indexOf((char) i10) >= 0);
        return i10;
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i10, int i11) throws IOException {
        throw new UnsupportedOperationException();
    }
}
