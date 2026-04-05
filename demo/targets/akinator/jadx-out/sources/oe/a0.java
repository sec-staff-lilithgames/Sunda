package oe;

import com.google.android.exoplayer2.util.h1;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.v0;
import io.ktor.util.cio.ByteBufferPoolKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final z f78973a;

    /* renamed from: b, reason: collision with root package name */
    public final v0 f78974b = new v0(32);

    /* renamed from: c, reason: collision with root package name */
    public int f78975c;

    /* renamed from: d, reason: collision with root package name */
    public int f78976d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f78977e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f78978f;

    public a0(z zVar) {
        this.f78973a = zVar;
    }

    @Override // oe.j0
    public void consume(v0 v0Var, int i10) {
        boolean z10 = (i10 & 1) != 0;
        int position = z10 ? v0Var.getPosition() + v0Var.readUnsignedByte() : -1;
        if (this.f78978f) {
            if (!z10) {
                return;
            }
            this.f78978f = false;
            v0Var.setPosition(position);
            this.f78976d = 0;
        }
        while (v0Var.bytesLeft() > 0) {
            int i11 = this.f78976d;
            v0 v0Var2 = this.f78974b;
            if (i11 < 3) {
                if (i11 == 0) {
                    int unsignedByte = v0Var.readUnsignedByte();
                    v0Var.setPosition(v0Var.getPosition() - 1);
                    if (unsignedByte == 255) {
                        this.f78978f = true;
                        return;
                    }
                }
                int iMin = Math.min(v0Var.bytesLeft(), 3 - this.f78976d);
                v0Var.readBytes(v0Var2.getData(), this.f78976d, iMin);
                int i12 = this.f78976d + iMin;
                this.f78976d = i12;
                if (i12 == 3) {
                    v0Var2.setPosition(0);
                    v0Var2.setLimit(3);
                    v0Var2.skipBytes(1);
                    int unsignedByte2 = v0Var2.readUnsignedByte();
                    int unsignedByte3 = v0Var2.readUnsignedByte();
                    this.f78977e = (unsignedByte2 & 128) != 0;
                    this.f78975c = (((unsignedByte2 & 15) << 8) | unsignedByte3) + 3;
                    int iCapacity = v0Var2.capacity();
                    int i13 = this.f78975c;
                    if (iCapacity < i13) {
                        v0Var2.ensureCapacity(Math.min(ByteBufferPoolKt.DEFAULT_BUFFER_SIZE, Math.max(i13, v0Var2.capacity() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(v0Var.bytesLeft(), this.f78975c - this.f78976d);
                v0Var.readBytes(v0Var2.getData(), this.f78976d, iMin2);
                int i14 = this.f78976d + iMin2;
                this.f78976d = i14;
                int i15 = this.f78975c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f78977e) {
                        v0Var2.setLimit(i15);
                    } else {
                        if (n1.crc32(v0Var2.getData(), 0, this.f78975c, -1) != 0) {
                            this.f78978f = true;
                            return;
                        }
                        v0Var2.setLimit(this.f78975c - 4);
                    }
                    v0Var2.setPosition(0);
                    this.f78973a.consume(v0Var2);
                    this.f78976d = 0;
                }
            }
        }
    }

    @Override // oe.j0
    public void init(h1 h1Var, ee.s sVar, i0 i0Var) {
        this.f78973a.init(h1Var, sVar, i0Var);
        this.f78978f = true;
    }

    @Override // oe.j0
    public void seek() {
        this.f78978f = true;
    }
}
