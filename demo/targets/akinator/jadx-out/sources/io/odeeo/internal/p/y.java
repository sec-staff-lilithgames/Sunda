package io.odeeo.internal.p;

import io.ktor.util.cio.ByteBufferPoolKt;
import io.odeeo.internal.p.d0;
import io.odeeo.internal.q0.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final x f65573a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.q0.x f65574b = new io.odeeo.internal.q0.x(32);

    /* renamed from: c, reason: collision with root package name */
    public int f65575c;

    /* renamed from: d, reason: collision with root package name */
    public int f65576d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f65577e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f65578f;

    public y(x xVar) {
        this.f65573a = xVar;
    }

    @Override // io.odeeo.internal.p.d0
    public void consume(io.odeeo.internal.q0.x xVar, int i10) {
        boolean z10 = (i10 & 1) != 0;
        int position = z10 ? xVar.getPosition() + xVar.readUnsignedByte() : -1;
        if (this.f65578f) {
            if (!z10) {
                return;
            }
            this.f65578f = false;
            xVar.setPosition(position);
            this.f65576d = 0;
        }
        while (xVar.bytesLeft() > 0) {
            int i11 = this.f65576d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int unsignedByte = xVar.readUnsignedByte();
                    xVar.setPosition(xVar.getPosition() - 1);
                    if (unsignedByte == 255) {
                        this.f65578f = true;
                        return;
                    }
                }
                int iMin = Math.min(xVar.bytesLeft(), 3 - this.f65576d);
                xVar.readBytes(this.f65574b.getData(), this.f65576d, iMin);
                int i12 = this.f65576d + iMin;
                this.f65576d = i12;
                if (i12 == 3) {
                    this.f65574b.setPosition(0);
                    this.f65574b.setLimit(3);
                    this.f65574b.skipBytes(1);
                    int unsignedByte2 = this.f65574b.readUnsignedByte();
                    int unsignedByte3 = this.f65574b.readUnsignedByte();
                    this.f65577e = (unsignedByte2 & 128) != 0;
                    this.f65575c = (((unsignedByte2 & 15) << 8) | unsignedByte3) + 3;
                    int iCapacity = this.f65574b.capacity();
                    int i13 = this.f65575c;
                    if (iCapacity < i13) {
                        this.f65574b.ensureCapacity(Math.min(ByteBufferPoolKt.DEFAULT_BUFFER_SIZE, Math.max(i13, this.f65574b.capacity() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(xVar.bytesLeft(), this.f65575c - this.f65576d);
                xVar.readBytes(this.f65574b.getData(), this.f65576d, iMin2);
                int i14 = this.f65576d + iMin2;
                this.f65576d = i14;
                int i15 = this.f65575c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f65577e) {
                        this.f65574b.setLimit(i15);
                    } else {
                        if (g0.crc32(this.f65574b.getData(), 0, this.f65575c, -1) != 0) {
                            this.f65578f = true;
                            return;
                        }
                        this.f65574b.setLimit(this.f65575c - 4);
                    }
                    this.f65574b.setPosition(0);
                    this.f65573a.consume(this.f65574b);
                    this.f65576d = 0;
                }
            }
        }
    }

    @Override // io.odeeo.internal.p.d0
    public void init(io.odeeo.internal.q0.e0 e0Var, io.odeeo.internal.g.j jVar, d0.d dVar) {
        this.f65573a.init(e0Var, jVar, dVar);
        this.f65578f = true;
    }

    @Override // io.odeeo.internal.p.d0
    public void seek() {
        this.f65578f = true;
    }
}
