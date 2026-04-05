package com.pgl.ssdk;

import b0.e2;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class m implements q {

    /* renamed from: a, reason: collision with root package name */
    private final FileChannel f50475a;

    /* renamed from: b, reason: collision with root package name */
    private final long f50476b;

    /* renamed from: c, reason: collision with root package name */
    private final long f50477c;

    public m(FileChannel fileChannel, long j10, long j11) {
        if (j10 < 0) {
            throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j11)));
        }
        if (j11 < 0) {
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j11)));
        }
        this.f50475a = fileChannel;
        this.f50476b = j10;
        this.f50477c = j11;
    }

    @Override // com.pgl.ssdk.q
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m a(long j10, long j11) {
        long jA = a();
        a(j10, j11, jA);
        return (j10 == 0 && j11 == jA) ? this : new m(this.f50475a, this.f50476b + j10, j11);
    }

    private static void a(long j10, long j11, long j12) {
        if (j10 < 0) {
            throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j10)));
        }
        if (j11 < 0) {
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j11)));
        }
        if (j10 > j12) {
            throw new IndexOutOfBoundsException(a.b.g(j12, ")", e2.r(j10, "offset (", ") > source size (")));
        }
        long j13 = j10 + j11;
        if (j13 < j10) {
            throw new IndexOutOfBoundsException(a.b.g(j11, ") overflow", e2.r(j10, "offset (", ") + size (")));
        }
        if (j13 <= j12) {
            return;
        }
        StringBuilder sbR = e2.r(j10, "offset (", ") + size (");
        sbR.append(j11);
        sbR.append(") > source size (");
        sbR.append(j12);
        sbR.append(")");
        throw new IndexOutOfBoundsException(sbR.toString());
    }

    @Override // com.pgl.ssdk.q
    public long a() {
        long j10 = this.f50477c;
        if (j10 != -1) {
            return j10;
        }
        try {
            return this.f50475a.size();
        } catch (IOException unused) {
            return 0L;
        }
    }

    public void a(long j10, int i10, ByteBuffer byteBuffer) throws IOException {
        int i11;
        a(j10, i10, a());
        if (i10 == 0) {
            return;
        }
        if (i10 <= byteBuffer.remaining()) {
            long j11 = this.f50476b + j10;
            int iLimit = byteBuffer.limit();
            try {
                byteBuffer.limit(byteBuffer.position() + i10);
                while (i10 > 0) {
                    synchronized (this.f50475a) {
                        this.f50475a.position(j11);
                        i11 = this.f50475a.read(byteBuffer);
                    }
                    j11 += i11;
                    i10 -= i11;
                }
                return;
            } finally {
                byteBuffer.limit(iLimit);
            }
        }
        throw new BufferOverflowException();
    }

    @Override // com.pgl.ssdk.q
    public ByteBuffer a(long j10, int i10) throws IOException {
        if (i10 >= 0) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
            a(j10, i10, byteBufferAllocate);
            byteBufferAllocate.flip();
            return byteBufferAllocate;
        }
        throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(i10)));
    }
}
