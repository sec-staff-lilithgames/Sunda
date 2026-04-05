package rp;

import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.u0;
import io.ktor.util.cio.ByteBufferPoolKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f84599a;

    /* renamed from: b, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.m0 f84600b = new io.bidmachine.media3.common.util.m0(32);

    /* renamed from: c, reason: collision with root package name */
    public int f84601c;

    /* renamed from: d, reason: collision with root package name */
    public int f84602d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f84603e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f84604f;

    public e0(d0 d0Var) {
        this.f84599a = d0Var;
    }

    @Override // rp.n0
    public void consume(io.bidmachine.media3.common.util.m0 m0Var, int i10) {
        boolean z10 = (i10 & 1) != 0;
        int position = z10 ? m0Var.getPosition() + m0Var.readUnsignedByte() : -1;
        if (this.f84604f) {
            if (!z10) {
                return;
            }
            this.f84604f = false;
            m0Var.setPosition(position);
            this.f84602d = 0;
        }
        while (m0Var.bytesLeft() > 0) {
            int i11 = this.f84602d;
            io.bidmachine.media3.common.util.m0 m0Var2 = this.f84600b;
            if (i11 < 3) {
                if (i11 == 0) {
                    int unsignedByte = m0Var.readUnsignedByte();
                    m0Var.setPosition(m0Var.getPosition() - 1);
                    if (unsignedByte == 255) {
                        this.f84604f = true;
                        return;
                    }
                }
                int iMin = Math.min(m0Var.bytesLeft(), 3 - this.f84602d);
                m0Var.readBytes(m0Var2.getData(), this.f84602d, iMin);
                int i12 = this.f84602d + iMin;
                this.f84602d = i12;
                if (i12 == 3) {
                    m0Var2.setPosition(0);
                    m0Var2.setLimit(3);
                    m0Var2.skipBytes(1);
                    int unsignedByte2 = m0Var2.readUnsignedByte();
                    int unsignedByte3 = m0Var2.readUnsignedByte();
                    this.f84603e = (unsignedByte2 & 128) != 0;
                    this.f84601c = (((unsignedByte2 & 15) << 8) | unsignedByte3) + 3;
                    int iCapacity = m0Var2.capacity();
                    int i13 = this.f84601c;
                    if (iCapacity < i13) {
                        m0Var2.ensureCapacity(Math.min(ByteBufferPoolKt.DEFAULT_BUFFER_SIZE, Math.max(i13, m0Var2.capacity() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(m0Var.bytesLeft(), this.f84601c - this.f84602d);
                m0Var.readBytes(m0Var2.getData(), this.f84602d, iMin2);
                int i14 = this.f84602d + iMin2;
                this.f84602d = i14;
                int i15 = this.f84601c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f84603e) {
                        m0Var2.setLimit(i15);
                    } else {
                        if (a1.crc32(m0Var2.getData(), 0, this.f84601c, -1) != 0) {
                            this.f84604f = true;
                            return;
                        }
                        m0Var2.setLimit(this.f84601c - 4);
                    }
                    m0Var2.setPosition(0);
                    this.f84599a.consume(m0Var2);
                    this.f84602d = 0;
                }
            }
        }
    }

    @Override // rp.n0
    public void init(u0 u0Var, ko.c0 c0Var, m0 m0Var) {
        this.f84599a.init(u0Var, c0Var, m0Var);
        this.f84604f = true;
    }

    @Override // rp.n0
    public void seek() {
        this.f84604f = true;
    }
}
