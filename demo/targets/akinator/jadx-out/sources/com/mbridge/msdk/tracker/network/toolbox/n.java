package com.mbridge.msdk.tracker.network.toolbox;

import androidx.core.app.NotificationCompat;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class n extends ByteArrayOutputStream {

    /* renamed from: a, reason: collision with root package name */
    private final c f44064a;

    public n(c cVar, int i10) {
        this.f44064a = cVar;
        ((ByteArrayOutputStream) this).buf = cVar.a(Math.max(i10, NotificationCompat.FLAG_LOCAL_ONLY));
    }

    private void a(int i10) {
        int i11 = ((ByteArrayOutputStream) this).count + i10;
        if (i11 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        byte[] bArrA = this.f44064a.a(i11 * 2);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrA, 0, ((ByteArrayOutputStream) this).count);
        this.f44064a.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrA;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f44064a.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public void finalize() {
        this.f44064a.a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i10, int i11) {
        a(i11);
        if (bArr != null) {
            super.write(bArr, i10, i11);
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i10) {
        a(1);
        super.write(i10);
    }
}
