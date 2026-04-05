package t4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public int f86321a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f86322b;

    /* renamed from: c, reason: collision with root package name */
    public int f86323c;

    /* renamed from: d, reason: collision with root package name */
    public int f86324d;

    /* renamed from: e, reason: collision with root package name */
    public final i f86325e = i.getDefault();

    public void __reset() {
        b(0, null);
    }

    public final int a(int i10) {
        if (i10 < this.f86324d) {
            return this.f86322b.getShort(this.f86323c + i10);
        }
        return 0;
    }

    public final void b(int i10, ByteBuffer byteBuffer) {
        this.f86322b = byteBuffer;
        if (byteBuffer == null) {
            this.f86321a = 0;
            this.f86323c = 0;
            this.f86324d = 0;
        } else {
            this.f86321a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f86323c = i11;
            this.f86324d = this.f86322b.getShort(i11);
        }
    }

    public final int c(int i10) {
        int i11 = i10 + this.f86321a;
        return this.f86322b.getInt(i11) + i11 + 4;
    }

    public final ByteBuffer d(int i10, int i11) {
        int iA = a(i10);
        if (iA == 0) {
            return null;
        }
        ByteBuffer byteBufferOrder = this.f86322b.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int iC = c(iA);
        byteBufferOrder.position(iC);
        byteBufferOrder.limit((e(iA) * i11) + iC);
        return byteBufferOrder;
    }

    public final int e(int i10) {
        int i11 = i10 + this.f86321a;
        return this.f86322b.getInt(this.f86322b.getInt(i11) + i11);
    }

    public ByteBuffer getByteBuffer() {
        return this.f86322b;
    }
}
