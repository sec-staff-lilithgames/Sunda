package io.bidmachine.media3.exoplayer.audio;

import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteBuffer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d1 extends hn.j {

    /* renamed from: i, reason: collision with root package name */
    public final float f60923i;

    /* renamed from: j, reason: collision with root package name */
    public final short f60924j;

    /* renamed from: k, reason: collision with root package name */
    public final int f60925k;

    /* renamed from: l, reason: collision with root package name */
    public final long f60926l;

    /* renamed from: m, reason: collision with root package name */
    public final long f60927m;

    /* renamed from: n, reason: collision with root package name */
    public int f60928n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f60929o;

    /* renamed from: p, reason: collision with root package name */
    public int f60930p;

    /* renamed from: q, reason: collision with root package name */
    public long f60931q;

    /* renamed from: r, reason: collision with root package name */
    public int f60932r;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f60933s;

    /* renamed from: t, reason: collision with root package name */
    public int f60934t;

    /* renamed from: u, reason: collision with root package name */
    public int f60935u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f60936v;

    public d1() {
        this(100000L, 0.2f, 2000000L, 10, (short) 1024);
    }

    public final int b(int i10) {
        int length = ((((int) ((this.f60927m * this.f59043b.f59038a) / 1000000)) - this.f60932r) * this.f60928n) - (this.f60933s.length / 2);
        io.bidmachine.media3.common.util.a.checkState(length >= 0);
        int iMin = (int) Math.min((i10 * this.f60923i) + 0.5f, length);
        int i11 = this.f60928n;
        return (iMin / i11) * i11;
    }

    public final void c(boolean z10) {
        int length;
        int iB;
        int i10 = this.f60935u;
        byte[] bArr = this.f60933s;
        if (i10 == bArr.length || z10) {
            if (this.f60932r == 0) {
                if (z10) {
                    d(i10, 3);
                    length = i10;
                } else {
                    io.bidmachine.media3.common.util.a.checkState(i10 >= bArr.length / 2);
                    length = this.f60933s.length / 2;
                    d(length, 0);
                }
                iB = length;
            } else if (z10) {
                int length2 = i10 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iB2 = b(length2) + (this.f60933s.length / 2);
                d(iB2, 2);
                iB = iB2;
                length = length3;
            } else {
                length = i10 - (bArr.length / 2);
                iB = b(length);
                d(iB, 1);
            }
            io.bidmachine.media3.common.util.a.checkState(length % this.f60928n == 0, "bytesConsumed is not aligned to frame size: %s" + length);
            io.bidmachine.media3.common.util.a.checkState(i10 >= iB);
            this.f60935u -= length;
            int i11 = this.f60934t + length;
            this.f60934t = i11;
            this.f60934t = i11 % this.f60933s.length;
            this.f60932r = (iB / this.f60928n) + this.f60932r;
            this.f60931q += (length - iB) / r2;
        }
    }

    public final void d(int i10, int i11) {
        if (i10 == 0) {
            return;
        }
        io.bidmachine.media3.common.util.a.checkArgument(this.f60935u >= i10);
        if (i11 == 2) {
            int i12 = this.f60934t;
            int i13 = this.f60935u;
            int i14 = i12 + i13;
            byte[] bArr = this.f60933s;
            if (i14 <= bArr.length) {
                System.arraycopy(bArr, i14 - i10, this.f60936v, 0, i10);
            } else {
                int length = i13 - (bArr.length - i12);
                if (length >= i10) {
                    System.arraycopy(bArr, length - i10, this.f60936v, 0, i10);
                } else {
                    int i15 = i10 - length;
                    System.arraycopy(bArr, bArr.length - i15, this.f60936v, 0, i15);
                    System.arraycopy(this.f60933s, 0, this.f60936v, i15, length);
                }
            }
        } else {
            int i16 = this.f60934t;
            int i17 = i16 + i10;
            byte[] bArr2 = this.f60933s;
            if (i17 <= bArr2.length) {
                System.arraycopy(bArr2, i16, this.f60936v, 0, i10);
            } else {
                int length2 = bArr2.length - i16;
                System.arraycopy(bArr2, i16, this.f60936v, 0, length2);
                System.arraycopy(this.f60933s, 0, this.f60936v, length2, i10 - length2);
            }
        }
        io.bidmachine.media3.common.util.a.checkArgument(i10 % this.f60928n == 0, "sizeToOutput is not aligned to frame size: " + i10);
        io.bidmachine.media3.common.util.a.checkState(this.f60934t < this.f60933s.length);
        byte[] bArr3 = this.f60936v;
        io.bidmachine.media3.common.util.a.checkArgument(i10 % this.f60928n == 0, "byteOutput size is not aligned to frame size " + i10);
        if (i11 != 3) {
            for (int i18 = 0; i18 < i10; i18 += 2) {
                int i19 = i18 + 1;
                int i20 = (bArr3[i19] << 8) | (bArr3[i18] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                int i21 = this.f60925k;
                if (i11 == 0) {
                    i21 = ((((i18 * 1000) / (i10 - 1)) * (i21 - 100)) / 1000) + 100;
                } else if (i11 == 2) {
                    i21 += (((i18 * 1000) * (100 - i21)) / (i10 - 1)) / 1000;
                }
                int i22 = (i20 * i21) / 100;
                if (i22 >= 32767) {
                    bArr3[i18] = -1;
                    bArr3[i19] = AbstractJsonLexerKt.TC_INVALID;
                } else if (i22 <= -32768) {
                    bArr3[i18] = 0;
                    bArr3[i19] = -128;
                } else {
                    bArr3[i18] = (byte) (i22 & 255);
                    bArr3[i19] = (byte) (i22 >> 8);
                }
            }
        }
        a(i10).put(bArr3, 0, i10).flip();
    }

    @Override // hn.j, hn.h
    public /* bridge */ /* synthetic */ long getDurationAfterProcessorApplied(long j10) {
        return super.getDurationAfterProcessorApplied(j10);
    }

    public long getSkippedFrames() {
        return this.f60931q;
    }

    @Override // hn.j, hn.h
    public boolean isActive() {
        return super.isActive() && this.f60929o;
    }

    @Override // hn.j
    public final hn.f onConfigure(hn.f fVar) throws hn.g {
        if (fVar.f59040c == 2) {
            return fVar.f59038a == -1 ? hn.f.f59037e : fVar;
        }
        throw new hn.g(fVar);
    }

    @Override // hn.j
    public void onFlush() {
        if (isActive()) {
            int i10 = this.f59043b.f59039b * 2;
            this.f60928n = i10;
            int i11 = ((((int) ((this.f60926l * r0.f59038a) / 1000000)) / 2) / i10) * i10 * 2;
            if (this.f60933s.length != i11) {
                this.f60933s = new byte[i11];
                this.f60936v = new byte[i11];
            }
        }
        this.f60930p = 0;
        this.f60931q = 0L;
        this.f60932r = 0;
        this.f60934t = 0;
        this.f60935u = 0;
    }

    @Override // hn.j
    public void onQueueEndOfStream() {
        if (this.f60935u > 0) {
            c(true);
            this.f60932r = 0;
        }
    }

    @Override // hn.j
    public void onReset() {
        this.f60929o = false;
        byte[] bArr = io.bidmachine.media3.common.util.a1.f60681c;
        this.f60933s = bArr;
        this.f60936v = bArr;
    }

    @Override // hn.j, hn.h
    public void queueInput(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f59048g.hasRemaining()) {
            int i10 = this.f60930p;
            short s10 = this.f60924j;
            if (i10 == 0) {
                int iLimit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit2, byteBuffer.position() + this.f60933s.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3) << 8) | (byteBuffer.get(iLimit3 - 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) > s10) {
                        int i11 = this.f60928n;
                        iPosition = a.b.A(iLimit3, i11, i11, i11);
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f60930p = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    a(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit2);
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException();
                }
                io.bidmachine.media3.common.util.a.checkState(this.f60934t < this.f60933s.length);
                int iLimit4 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) > s10) {
                        int i12 = this.f60928n;
                        iLimit = (iPosition2 / i12) * i12;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int length = this.f60934t;
                int i13 = this.f60935u;
                int length2 = length + i13;
                byte[] bArr = this.f60933s;
                if (length2 < bArr.length) {
                    length = bArr.length;
                } else {
                    length2 = i13 - (bArr.length - length);
                }
                int i14 = length - length2;
                boolean z10 = iLimit < iLimit4;
                int iMin = Math.min(iPosition3, i14);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f60933s, length2, iMin);
                int i15 = this.f60935u + iMin;
                this.f60935u = i15;
                io.bidmachine.media3.common.util.a.checkState(i15 <= this.f60933s.length);
                boolean z11 = z10 && iPosition3 < i14;
                c(z11);
                if (z11) {
                    this.f60930p = 0;
                    this.f60932r = 0;
                }
                byteBuffer.limit(iLimit4);
            }
        }
    }

    public void setEnabled(boolean z10) {
        this.f60929o = z10;
    }

    @Deprecated
    public d1(long j10, long j11, short s10) {
        this(j10, j11 / j10, j10, 0, s10);
    }

    public d1(long j10, float f10, long j11, int i10, short s10) {
        boolean z10 = false;
        this.f60932r = 0;
        this.f60934t = 0;
        this.f60935u = 0;
        if (f10 >= 0.0f && f10 <= 1.0f) {
            z10 = true;
        }
        io.bidmachine.media3.common.util.a.checkArgument(z10);
        this.f60926l = j10;
        this.f60923i = f10;
        this.f60927m = j11;
        this.f60925k = i10;
        this.f60924j = s10;
        byte[] bArr = io.bidmachine.media3.common.util.a1.f60681c;
        this.f60933s = bArr;
        this.f60936v = bArr;
    }
}
