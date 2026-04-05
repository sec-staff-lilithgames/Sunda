package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s implements c {

    /* renamed from: b, reason: collision with root package name */
    public int f24558b;

    /* renamed from: c, reason: collision with root package name */
    public int f24559c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f24560d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24561e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f24562f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f24563g;

    /* renamed from: h, reason: collision with root package name */
    public ByteBuffer f24564h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f24565i;

    public s() {
        ByteBuffer byteBuffer = c.f24494a;
        this.f24563g = byteBuffer;
        this.f24564h = byteBuffer;
        this.f24558b = -1;
        this.f24559c = -1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean a(int i10, int i11, int i12) throws b {
        boolean zEquals = Arrays.equals(this.f24560d, this.f24562f);
        boolean z10 = !zEquals;
        int[] iArr = this.f24560d;
        this.f24562f = iArr;
        if (iArr == null) {
            this.f24561e = false;
            return z10;
        }
        if (i12 != 2) {
            throw new b(i10, i11, i12);
        }
        if (zEquals && this.f24559c == i10 && this.f24558b == i11) {
            return false;
        }
        this.f24559c = i10;
        this.f24558b = i11;
        this.f24561e = i11 != iArr.length;
        int i13 = 0;
        while (true) {
            int[] iArr2 = this.f24562f;
            if (i13 >= iArr2.length) {
                return true;
            }
            int i14 = iArr2[i13];
            if (i14 >= i11) {
                throw new b(i10, i11, i12);
            }
            this.f24561e = (i14 != i13) | this.f24561e;
            i13++;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void b() {
        this.f24565i = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean c() {
        return this.f24565i && this.f24564h == c.f24494a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean d() {
        return this.f24561e;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final int e() {
        int[] iArr = this.f24562f;
        return iArr == null ? this.f24558b : iArr.length;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void f() {
        ByteBuffer byteBuffer = c.f24494a;
        this.f24564h = byteBuffer;
        this.f24565i = false;
        this.f24563g = byteBuffer;
        this.f24558b = -1;
        this.f24559c = -1;
        this.f24562f = null;
        this.f24561e = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void flush() {
        this.f24564h = c.f24494a;
        this.f24565i = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int length = ((iLimit - iPosition) / (this.f24558b * 2)) * this.f24562f.length * 2;
        if (this.f24563g.capacity() < length) {
            this.f24563g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f24563g.clear();
        }
        while (iPosition < iLimit) {
            for (int i10 : this.f24562f) {
                this.f24563g.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.f24558b * 2;
        }
        byteBuffer.position(iLimit);
        this.f24563g.flip();
        this.f24564h = this.f24563g;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final ByteBuffer a() {
        ByteBuffer byteBuffer = this.f24564h;
        this.f24564h = c.f24494a;
        return byteBuffer;
    }
}
