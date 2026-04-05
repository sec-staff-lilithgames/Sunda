package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
final class c implements com.bykv.vk.openvk.preload.geckox.buffer.a {

    /* renamed from: a, reason: collision with root package name */
    private long f17105a;

    /* renamed from: b, reason: collision with root package name */
    private long f17106b;

    /* renamed from: c, reason: collision with root package name */
    private RandomAccessFile f17107c;

    /* renamed from: d, reason: collision with root package name */
    private AtomicBoolean f17108d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private File f17109e;

    public c(long j10, File file) throws IOException {
        this.f17105a = j10;
        this.f17109e = file;
        file.getParentFile().mkdirs();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            this.f17107c = randomAccessFile;
            randomAccessFile.setLength(j10);
        } catch (Exception e10) {
            CloseableUtils.close(this.f17107c);
            throw new IOException("create raf swap failed! path: " + file.getAbsolutePath() + " caused by: " + e10.getMessage(), e10);
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a() throws IOException {
        if (this.f17108d.get()) {
            throw new IOException("released!");
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long b() {
        return this.f17105a;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long c() throws IOException {
        if (this.f17108d.get()) {
            throw new IOException("released!");
        }
        return this.f17106b;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int d() throws IOException {
        byte[] bArr = new byte[1];
        if (b(bArr) == 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void e() throws IOException {
        if (this.f17108d.getAndSet(true)) {
            return;
        }
        CloseableUtils.close(this.f17107c);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final File f() {
        return this.f17109e;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000e A[PHI: r0
      0x000e: PHI (r0v5 long) = (r0v2 long), (r0v3 long) binds: [B:5:0x000c, B:8:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r4) throws java.io.IOException {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f17108d
            boolean r0 = r0.get()
            if (r0 != 0) goto L1f
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L10
        Le:
            r4 = r0
            goto L17
        L10:
            long r0 = r3.f17105a
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L17
            goto Le
        L17:
            r3.f17106b = r4
            java.io.RandomAccessFile r0 = r3.f17107c
            r0.seek(r4)
            return
        L1f:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "released!"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.geckox.buffer.a.c.b(long):void");
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a(int i10) throws IOException {
        a(new byte[]{(byte) i10});
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a(byte[] bArr) throws IOException {
        a(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final synchronized long a(long j10) throws IOException {
        int iSkipBytes;
        if (this.f17108d.get()) {
            throw new IOException("released!");
        }
        int i10 = (int) j10;
        if (i10 == j10) {
            iSkipBytes = this.f17107c.skipBytes(i10);
            this.f17106b = this.f17107c.getFilePointer();
        } else {
            throw new IOException("too large:".concat(String.valueOf(j10)));
        }
        return iSkipBytes;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr) throws IOException {
        return b(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.f17108d.get()) {
            if (bArr == null || i11 <= 0 || i10 < 0 || i10 >= bArr.length) {
                return 0;
            }
            if (i10 + i11 > bArr.length) {
                i11 = bArr.length - i10;
            }
            synchronized (this) {
                try {
                    long j10 = this.f17106b;
                    long j11 = this.f17105a;
                    if (j10 == j11) {
                        return -1;
                    }
                    if (i11 + j10 > j11) {
                        i11 = (int) (j11 - j10);
                    }
                    int i12 = this.f17107c.read(bArr, i10, i11);
                    if (i12 == -1) {
                        return -1;
                    }
                    this.f17106b += i12;
                    return i12;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new IOException("released!");
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int a(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.f17108d.get()) {
            if (bArr == null || bArr.length == 0 || i11 <= 0 || i10 < 0 || i10 >= bArr.length) {
                return 0;
            }
            if (i10 + i11 > bArr.length) {
                i11 = bArr.length - i10;
            }
            synchronized (this) {
                try {
                    long j10 = this.f17106b;
                    long j11 = this.f17105a;
                    if (j10 == j11) {
                        return 0;
                    }
                    if (i11 + j10 > j11) {
                        i11 = (int) (j11 - j10);
                    }
                    this.f17107c.write(bArr, i10, i11);
                    this.f17106b += i11;
                    return i11;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new IOException("released!");
    }
}
