package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v implements c {

    /* renamed from: b, reason: collision with root package name */
    public int f24570b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f24571c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f24572d = 0;

    /* renamed from: e, reason: collision with root package name */
    public ByteBuffer f24573e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f24574f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24575g;

    public v() {
        ByteBuffer byteBuffer = c.f24494a;
        this.f24573e = byteBuffer;
        this.f24574f = byteBuffer;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean a(int i10, int i11, int i12) throws b {
        if (i12 != 3 && i12 != 2 && i12 != Integer.MIN_VALUE && i12 != 1073741824) {
            throw new b(i10, i11, i12);
        }
        if (this.f24570b == i10 && this.f24571c == i11 && this.f24572d == i12) {
            return false;
        }
        this.f24570b = i10;
        this.f24571c = i11;
        this.f24572d = i12;
        if (i12 != 2) {
            return true;
        }
        this.f24573e = c.f24494a;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void b() {
        this.f24575g = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean c() {
        return this.f24575g && this.f24574f == c.f24494a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean d() {
        int i10 = this.f24572d;
        return (i10 == 0 || i10 == 2) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final int e() {
        return this.f24571c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void f() {
        ByteBuffer byteBuffer = c.f24494a;
        this.f24574f = byteBuffer;
        this.f24575g = false;
        this.f24573e = byteBuffer;
        this.f24570b = -1;
        this.f24571c = -1;
        this.f24572d = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void flush() {
        this.f24574f = c.f24494a;
        this.f24575g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083 A[ADDED_TO_REGION, LOOP:2: B:25:0x0083->B:26:0x0085, LOOP_START, PHI: r0
      0x0083: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:16:0x0043, B:26:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.f24572d
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 3
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r6) goto L23
            if (r3 == r5) goto L20
            if (r3 != r4) goto L1a
            int r2 = r2 / 2
            goto L25
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L20:
            int r2 = r2 * 2
            goto L25
        L23:
            int r2 = r2 / r5
            goto L20
        L25:
            java.nio.ByteBuffer r3 = r7.f24573e
            int r3 = r3.capacity()
            if (r3 >= r2) goto L3c
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.f24573e = r2
            goto L41
        L3c:
            java.nio.ByteBuffer r2 = r7.f24573e
            r2.clear()
        L41:
            int r2 = r7.f24572d
            if (r2 == r6) goto L83
            if (r2 == r5) goto L6a
            if (r2 != r4) goto L64
        L49:
            if (r0 >= r1) goto L9e
            java.nio.ByteBuffer r2 = r7.f24573e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f24573e
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L49
        L64:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L6a:
            if (r0 >= r1) goto L9e
            java.nio.ByteBuffer r2 = r7.f24573e
            r3 = 0
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f24573e
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + (-128)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L6a
        L83:
            if (r0 >= r1) goto L9e
            java.nio.ByteBuffer r2 = r7.f24573e
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f24573e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L83
        L9e:
            int r0 = r8.limit()
            r8.position(r0)
            java.nio.ByteBuffer r8 = r7.f24573e
            r8.flip()
            java.nio.ByteBuffer r8 = r7.f24573e
            r7.f24574f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.v.a(java.nio.ByteBuffer):void");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final ByteBuffer a() {
        ByteBuffer byteBuffer = this.f24574f;
        this.f24574f = c.f24494a;
        return byteBuffer;
    }
}
