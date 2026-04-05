package io.bidmachine.media3.exoplayer.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b1 {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f60906d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f60907e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a, reason: collision with root package name */
    public ByteBuffer f60908a = hn.h.f59042a;

    /* renamed from: c, reason: collision with root package name */
    public int f60910c = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f60909b = 2;

    public static void a(ByteBuffer byteBuffer, long j10, int i10, int i11, boolean z10) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z10 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j10);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i10);
        byteBuffer.putInt(0);
        byteBuffer.put(rh.e0.checkedCast(i11));
    }

    public void packetize(nn.g gVar, List<byte[]> list) {
        int i10;
        io.bidmachine.media3.common.util.a.checkNotNull(gVar.f77080f);
        if (gVar.f77080f.limit() - gVar.f77080f.position() == 0) {
            return;
        }
        byte[] bArr = (this.f60909b == 2 && (list.size() == 1 || list.size() == 3)) ? list.get(0) : null;
        ByteBuffer byteBuffer = gVar.f77080f;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i11 = iLimit - iPosition;
        int i12 = (i11 + 255) / 255;
        int i13 = i12 + 27 + i11;
        if (this.f60909b == 2) {
            int length = bArr != null ? bArr.length + 28 : 47;
            i13 += length + 44;
            i10 = length;
        } else {
            i10 = 0;
        }
        if (this.f60908a.capacity() < i13) {
            this.f60908a = ByteBuffer.allocate(i13).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f60908a.clear();
        }
        ByteBuffer byteBuffer2 = this.f60908a;
        if (this.f60909b == 2) {
            if (bArr != null) {
                a(byteBuffer2, 0L, 0, 1, true);
                byteBuffer2.put(rh.e0.checkedCast(bArr.length));
                byteBuffer2.put(bArr);
                byteBuffer2.putInt(22, io.bidmachine.media3.common.util.a1.crc32(byteBuffer2.array(), byteBuffer2.arrayOffset(), bArr.length + 28, 0));
                byteBuffer2.position(bArr.length + 28);
            } else {
                byteBuffer2.put(f60906d);
            }
            byteBuffer2.put(f60907e);
        }
        int packetAudioSampleCount = this.f60910c + ko.u0.parsePacketAudioSampleCount(byteBuffer);
        this.f60910c = packetAudioSampleCount;
        a(byteBuffer2, packetAudioSampleCount, this.f60909b, i12, false);
        for (int i14 = 0; i14 < i12; i14++) {
            if (i11 >= 255) {
                byteBuffer2.put((byte) -1);
                i11 -= 255;
            } else {
                byteBuffer2.put((byte) i11);
                i11 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBuffer2.put(byteBuffer.get(iPosition));
            iPosition++;
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
        if (this.f60909b == 2) {
            byteBuffer2.putInt(i10 + 66, io.bidmachine.media3.common.util.a1.crc32(byteBuffer2.array(), byteBuffer2.arrayOffset() + i10 + 44, byteBuffer2.limit() - byteBuffer2.position(), 0));
        } else {
            byteBuffer2.putInt(22, io.bidmachine.media3.common.util.a1.crc32(byteBuffer2.array(), byteBuffer2.arrayOffset(), byteBuffer2.limit() - byteBuffer2.position(), 0));
        }
        this.f60909b++;
        this.f60908a = byteBuffer2;
        gVar.clear();
        gVar.ensureSpaceForWrite(this.f60908a.remaining());
        gVar.f77080f.put(this.f60908a);
        gVar.flip();
    }

    public void reset() {
        this.f60908a = hn.h.f59042a;
        this.f60910c = 0;
        this.f60909b = 2;
    }
}
