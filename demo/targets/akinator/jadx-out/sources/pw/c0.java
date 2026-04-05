package pw;

import java.io.RandomAccessFile;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c0 extends p {

    /* renamed from: g, reason: collision with root package name */
    public final RandomAccessFile f81880g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(boolean z10, RandomAccessFile randomAccessFile) {
        super(z10);
        kotlin.jvm.internal.e0.checkNotNullParameter(randomAccessFile, "randomAccessFile");
        this.f81880g = randomAccessFile;
    }

    @Override // pw.p
    public final synchronized void d() {
        this.f81880g.close();
    }

    @Override // pw.p
    public final synchronized void h() {
        this.f81880g.getFD().sync();
    }

    @Override // pw.p
    public final synchronized int i(long j10, byte[] array, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        this.f81880g.seek(j10);
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            int i13 = this.f81880g.read(array, i10, i11 - i12);
            if (i13 != -1) {
                i12 += i13;
            } else if (i12 == 0) {
                return -1;
            }
        }
        return i12;
    }

    @Override // pw.p
    public final synchronized void j(long j10) throws Throwable {
        try {
            try {
                long size = size();
                long j11 = j10 - size;
                if (j11 > 0) {
                    int i10 = (int) j11;
                    l(size, new byte[i10], 0, i10);
                } else {
                    this.f81880g.setLength(j10);
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

    @Override // pw.p
    public final synchronized long k() {
        return this.f81880g.length();
    }

    @Override // pw.p
    public final synchronized void l(long j10, byte[] array, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        this.f81880g.seek(j10);
        this.f81880g.write(array, i10, i11);
    }
}
