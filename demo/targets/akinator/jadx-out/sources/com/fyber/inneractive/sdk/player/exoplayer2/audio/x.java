package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x implements c {

    /* renamed from: d, reason: collision with root package name */
    public w f24602d;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f24605g;

    /* renamed from: h, reason: collision with root package name */
    public ShortBuffer f24606h;

    /* renamed from: i, reason: collision with root package name */
    public ByteBuffer f24607i;

    /* renamed from: j, reason: collision with root package name */
    public long f24608j;

    /* renamed from: k, reason: collision with root package name */
    public long f24609k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f24610l;

    /* renamed from: e, reason: collision with root package name */
    public float f24603e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f24604f = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    public int f24600b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f24601c = -1;

    public x() {
        ByteBuffer byteBuffer = c.f24494a;
        this.f24605g = byteBuffer;
        this.f24606h = byteBuffer.asShortBuffer();
        this.f24607i = byteBuffer;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean a(int i10, int i11, int i12) throws b {
        if (i12 != 2) {
            throw new b(i10, i11, i12);
        }
        if (this.f24601c == i10 && this.f24600b == i11) {
            return false;
        }
        this.f24601c = i10;
        this.f24600b = i11;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void b() {
        int i10;
        w wVar = this.f24602d;
        int i11 = wVar.f24592q;
        float f10 = wVar.f24590o;
        float f11 = wVar.f24591p;
        int i12 = wVar.f24593r + ((int) ((((i11 / (f10 / f11)) + wVar.f24594s) / f11) + 0.5f));
        wVar.a((wVar.f24580e * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = wVar.f24580e * 2;
            int i14 = wVar.f24577b;
            if (i13 >= i10 * i14) {
                break;
            }
            wVar.f24583h[(i14 * i11) + i13] = 0;
            i13++;
        }
        wVar.f24592q = i10 + wVar.f24592q;
        wVar.a();
        if (wVar.f24593r > i12) {
            wVar.f24593r = i12;
        }
        wVar.f24592q = 0;
        wVar.f24595t = 0;
        wVar.f24594s = 0;
        this.f24610l = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean c() {
        if (!this.f24610l) {
            return false;
        }
        w wVar = this.f24602d;
        return wVar == null || wVar.f24593r == 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean d() {
        return Math.abs(this.f24603e - 1.0f) >= 0.01f || Math.abs(this.f24604f - 1.0f) >= 0.01f;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final int e() {
        return this.f24600b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void f() {
        this.f24602d = null;
        ByteBuffer byteBuffer = c.f24494a;
        this.f24605g = byteBuffer;
        this.f24606h = byteBuffer.asShortBuffer();
        this.f24607i = byteBuffer;
        this.f24600b = -1;
        this.f24601c = -1;
        this.f24608j = 0L;
        this.f24609k = 0L;
        this.f24610l = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void flush() {
        w wVar = new w(this.f24601c, this.f24600b);
        this.f24602d = wVar;
        wVar.f24590o = this.f24603e;
        wVar.f24591p = this.f24604f;
        this.f24607i = c.f24494a;
        this.f24608j = 0L;
        this.f24609k = 0L;
        this.f24610l = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f24608j += iRemaining;
            w wVar = this.f24602d;
            wVar.getClass();
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i10 = wVar.f24577b;
            int i11 = iRemaining2 / i10;
            wVar.a(i11);
            shortBufferAsShortBuffer.get(wVar.f24583h, wVar.f24592q * wVar.f24577b, ((i10 * i11) * 2) / 2);
            wVar.f24592q += i11;
            wVar.a();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
        int i12 = this.f24602d.f24593r * this.f24600b * 2;
        if (i12 > 0) {
            if (this.f24605g.capacity() < i12) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i12).order(ByteOrder.nativeOrder());
                this.f24605g = byteBufferOrder;
                this.f24606h = byteBufferOrder.asShortBuffer();
            } else {
                this.f24605g.clear();
                this.f24606h.clear();
            }
            w wVar2 = this.f24602d;
            ShortBuffer shortBuffer = this.f24606h;
            wVar2.getClass();
            int iMin = Math.min(shortBuffer.remaining() / wVar2.f24577b, wVar2.f24593r);
            shortBuffer.put(wVar2.f24585j, 0, wVar2.f24577b * iMin);
            int i13 = wVar2.f24593r - iMin;
            wVar2.f24593r = i13;
            short[] sArr = wVar2.f24585j;
            int i14 = wVar2.f24577b;
            System.arraycopy(sArr, iMin * i14, sArr, 0, i13 * i14);
            this.f24609k += i12;
            this.f24605g.limit(i12);
            this.f24607i = this.f24605g;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final ByteBuffer a() {
        ByteBuffer byteBuffer = this.f24607i;
        this.f24607i = c.f24494a;
        return byteBuffer;
    }
}
