package com.bumptech.glide.load.data;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    public final OutputStream f16588b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f16589c;

    /* renamed from: e, reason: collision with root package name */
    public final q8.b f16590e;

    /* renamed from: f, reason: collision with root package name */
    public int f16591f;

    public c(OutputStream outputStream, q8.b bVar) {
        this.f16588b = outputStream;
        this.f16590e = bVar;
        this.f16589c = (byte[]) bVar.get(C.DEFAULT_BUFFER_SEGMENT_SIZE, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        OutputStream outputStream = this.f16588b;
        try {
            flush();
            outputStream.close();
            byte[] bArr = this.f16589c;
            if (bArr != null) {
                this.f16590e.put(bArr);
                this.f16589c = null;
            }
        } catch (Throwable th2) {
            outputStream.close();
            throw th2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        int i10 = this.f16591f;
        OutputStream outputStream = this.f16588b;
        if (i10 > 0) {
            outputStream.write(this.f16589c, 0, i10);
            this.f16591f = 0;
        }
        outputStream.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f16589c;
        int i11 = this.f16591f;
        int i12 = i11 + 1;
        this.f16591f = i12;
        bArr[i11] = (byte) i10;
        if (i12 != bArr.length || i12 <= 0) {
            return;
        }
        this.f16588b.write(bArr, 0, i12);
        this.f16591f = 0;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f16591f;
            OutputStream outputStream = this.f16588b;
            if (i15 == 0 && i13 >= this.f16589c.length) {
                outputStream.write(bArr, i14, i13);
                return;
            }
            int iMin = Math.min(i13, this.f16589c.length - i15);
            System.arraycopy(bArr, i14, this.f16589c, this.f16591f, iMin);
            int i16 = this.f16591f + iMin;
            this.f16591f = i16;
            i12 += iMin;
            byte[] bArr2 = this.f16589c;
            if (i16 == bArr2.length && i16 > 0) {
                outputStream.write(bArr2, 0, i16);
                this.f16591f = 0;
            }
        } while (i12 < i11);
    }
}
