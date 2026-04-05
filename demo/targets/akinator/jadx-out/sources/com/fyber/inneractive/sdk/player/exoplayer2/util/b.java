package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final FileOutputStream f26008a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f26009b = false;

    public b(File file) {
        this.f26008a = new FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f26009b) {
            return;
        }
        this.f26009b = true;
        this.f26008a.flush();
        try {
            this.f26008a.getFD().sync();
        } catch (IOException e10) {
            Log.w("AtomicFile", "Failed to sync file descriptor:", e10);
        }
        this.f26008a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f26008a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        this.f26008a.write(i10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f26008a.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f26008a.write(bArr, i10, i11);
    }
}
