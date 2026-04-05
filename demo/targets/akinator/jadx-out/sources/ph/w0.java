package ph;

import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w0 extends Reader {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f81363b;

    /* renamed from: c, reason: collision with root package name */
    public Reader f81364c;

    public w0(Iterator it) throws IOException {
        this.f81363b = it;
        d();
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Reader reader = this.f81364c;
        if (reader != null) {
            try {
                reader.close();
            } finally {
                this.f81364c = null;
            }
        }
    }

    public final void d() throws IOException {
        close();
        Iterator it = this.f81363b;
        if (it.hasNext()) {
            this.f81364c = ((m0) it.next()).openStream();
        }
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i10, int i11) throws IOException {
        p1.checkNotNull(cArr);
        Reader reader = this.f81364c;
        if (reader == null) {
            return -1;
        }
        int i12 = reader.read(cArr, i10, i11);
        if (i12 != -1) {
            return i12;
        }
        d();
        return read(cArr, i10, i11);
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        Reader reader = this.f81364c;
        return reader != null && reader.ready();
    }

    @Override // java.io.Reader
    public long skip(long j10) throws IOException {
        p1.checkArgument(j10 >= 0, "n is negative");
        if (j10 > 0) {
            while (true) {
                Reader reader = this.f81364c;
                if (reader == null) {
                    break;
                }
                long jSkip = reader.skip(j10);
                if (jSkip > 0) {
                    return jSkip;
                }
                d();
            }
        }
        return 0L;
    }
}
