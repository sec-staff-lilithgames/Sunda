package j9;

import android.text.TextUtils;
import android.util.Log;
import b0.e2;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public final long f69180b;

    /* renamed from: c, reason: collision with root package name */
    public int f69181c;

    public d(InputStream inputStream, long j10) {
        super(inputStream);
        this.f69180b = j10;
    }

    public static InputStream obtain(InputStream inputStream, long j10) {
        return new d(inputStream, j10);
    }

    public final void a(int i10) throws IOException {
        if (i10 >= 0) {
            this.f69181c += i10;
            return;
        }
        long j10 = this.f69181c;
        long j11 = this.f69180b;
        if (j11 - j10 <= 0) {
            return;
        }
        StringBuilder sbR = e2.r(j11, "Failed to read all expected data, expected: ", ", but read: ");
        sbR.append(this.f69181c);
        throw new IOException(sbR.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f69180b - this.f69181c, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int i10;
        i10 = super.read();
        a(i10 >= 0 ? 1 : -1);
        return i10;
    }

    public static InputStream obtain(InputStream inputStream, String str) throws NumberFormatException {
        int i10;
        if (TextUtils.isEmpty(str)) {
            i10 = -1;
        } else {
            try {
                i10 = Integer.parseInt(str);
            } catch (NumberFormatException e10) {
                if (Log.isLoggable("ContentLengthStream", 3)) {
                    Log.d("ContentLengthStream", "failed to parse content length header: " + str, e10);
                }
            }
        }
        return obtain(inputStream, i10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        i12 = super.read(bArr, i10, i11);
        a(i12);
        return i12;
    }
}
