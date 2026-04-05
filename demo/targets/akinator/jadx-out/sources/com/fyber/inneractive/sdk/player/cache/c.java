package com.fyber.inneractive.sdk.player.cache;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f24346a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, FileOutputStream fileOutputStream) {
        super(fileOutputStream);
        this.f24346a = dVar;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            ((FilterOutputStream) this).out.close();
        } catch (IOException unused) {
            this.f24346a.f24349c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            ((FilterOutputStream) this).out.flush();
        } catch (IOException unused) {
            this.f24346a.f24349c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i10) throws IOException {
        try {
            ((FilterOutputStream) this).out.write(i10);
        } catch (IOException unused) {
            this.f24346a.f24349c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        try {
            ((FilterOutputStream) this).out.write(bArr, i10, i11);
        } catch (IOException unused) {
            this.f24346a.f24349c = true;
        }
    }
}
