package io.odeeo.internal.e;

import io.odeeo.internal.e.h;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class k extends h {

    /* renamed from: d, reason: collision with root package name */
    public int f63734d;

    /* renamed from: e, reason: collision with root package name */
    public ByteBuffer f63735e;

    /* renamed from: f, reason: collision with root package name */
    public int f63736f;

    /* renamed from: g, reason: collision with root package name */
    public int f63737g;

    /* renamed from: h, reason: collision with root package name */
    public ByteBuffer[] f63738h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f63739i;

    /* renamed from: j, reason: collision with root package name */
    public int f63740j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f63741k;

    /* renamed from: l, reason: collision with root package name */
    public final h.a<k> f63742l;

    public k(h.a<k> aVar) {
        this.f63742l = aVar;
    }

    public static boolean a(int i10, int i11) {
        if (i10 < 0 || i11 < 0) {
            return false;
        }
        return i11 <= 0 || i10 < Integer.MAX_VALUE / i11;
    }

    public void init(long j10, int i10, ByteBuffer byteBuffer) {
        this.f63713b = j10;
        this.f63734d = i10;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            this.f63741k = null;
            return;
        }
        addFlag(268435456);
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBuffer2 = this.f63741k;
        if (byteBuffer2 == null || byteBuffer2.capacity() < iLimit) {
            this.f63741k = ByteBuffer.allocate(iLimit);
        } else {
            this.f63741k.clear();
        }
        this.f63741k.put(byteBuffer);
        this.f63741k.flip();
        byteBuffer.position(0);
    }

    public void initForPrivateFrame(int i10, int i11) {
        this.f63736f = i10;
        this.f63737g = i11;
    }

    public boolean initForYuvFrame(int i10, int i11, int i12, int i13, int i14) {
        this.f63736f = i10;
        this.f63737g = i11;
        this.f63740j = i14;
        int i15 = (int) ((i11 + 1) / 2);
        if (a(i12, i11) && a(i13, i15)) {
            int i16 = i11 * i12;
            int i17 = i15 * i13;
            int i18 = (i17 * 2) + i16;
            if (a(i17, 2) && i18 >= i16) {
                ByteBuffer byteBuffer = this.f63735e;
                if (byteBuffer == null || byteBuffer.capacity() < i18) {
                    this.f63735e = ByteBuffer.allocateDirect(i18);
                } else {
                    this.f63735e.position(0);
                    this.f63735e.limit(i18);
                }
                if (this.f63738h == null) {
                    this.f63738h = new ByteBuffer[3];
                }
                ByteBuffer byteBuffer2 = this.f63735e;
                ByteBuffer[] byteBufferArr = this.f63738h;
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferArr[0] = byteBufferSlice;
                byteBufferSlice.limit(i16);
                byteBuffer2.position(i16);
                ByteBuffer byteBufferSlice2 = byteBuffer2.slice();
                byteBufferArr[1] = byteBufferSlice2;
                byteBufferSlice2.limit(i17);
                byteBuffer2.position(i16 + i17);
                ByteBuffer byteBufferSlice3 = byteBuffer2.slice();
                byteBufferArr[2] = byteBufferSlice3;
                byteBufferSlice3.limit(i17);
                if (this.f63739i == null) {
                    this.f63739i = new int[3];
                }
                int[] iArr = this.f63739i;
                iArr[0] = i12;
                iArr[1] = i13;
                iArr[2] = i13;
                return true;
            }
        }
        return false;
    }

    @Override // io.odeeo.internal.e.h
    public void release() {
        this.f63742l.releaseOutputBuffer(this);
    }
}
