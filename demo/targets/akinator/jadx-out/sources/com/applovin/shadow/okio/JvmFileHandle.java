package com.applovin.shadow.okio;

import java.io.RandomAccessFile;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class JvmFileHandle extends FileHandle {
    private final RandomAccessFile randomAccessFile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmFileHandle(boolean z10, RandomAccessFile randomAccessFile) {
        super(z10);
        e0.checkNotNullParameter(randomAccessFile, "randomAccessFile");
        this.randomAccessFile = randomAccessFile;
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized void protectedClose() {
        this.randomAccessFile.close();
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized void protectedFlush() {
        this.randomAccessFile.getFD().sync();
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized int protectedRead(long j10, byte[] array, int i10, int i11) {
        e0.checkNotNullParameter(array, "array");
        this.randomAccessFile.seek(j10);
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            int i13 = this.randomAccessFile.read(array, i10, i11 - i12);
            if (i13 != -1) {
                i12 += i13;
            } else if (i12 == 0) {
                return -1;
            }
        }
        return i12;
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized void protectedResize(long j10) throws Throwable {
        try {
            try {
                long size = size();
                long j11 = j10 - size;
                if (j11 > 0) {
                    int i10 = (int) j11;
                    protectedWrite(size, new byte[i10], 0, i10);
                } else {
                    this.randomAccessFile.setLength(j10);
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized long protectedSize() {
        return this.randomAccessFile.length();
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized void protectedWrite(long j10, byte[] array, int i10, int i11) {
        e0.checkNotNullParameter(array, "array");
        this.randomAccessFile.seek(j10);
        this.randomAccessFile.write(array, i10, i11);
    }
}
