package ep;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import io.bidmachine.media3.common.util.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k implements g {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f54877a;

    /* renamed from: b, reason: collision with root package name */
    public final int f54878b;

    /* renamed from: c, reason: collision with root package name */
    public final int f54879c;

    /* renamed from: d, reason: collision with root package name */
    public int f54880d;

    /* renamed from: e, reason: collision with root package name */
    public int f54881e;

    public k(jn.d dVar) {
        m0 m0Var = dVar.f69729b;
        this.f54877a = m0Var;
        m0Var.setPosition(12);
        this.f54879c = m0Var.readUnsignedIntToInt() & 255;
        this.f54878b = m0Var.readUnsignedIntToInt();
    }

    @Override // ep.g
    public int getFixedSampleSize() {
        return -1;
    }

    @Override // ep.g
    public int getSampleCount() {
        return this.f54878b;
    }

    @Override // ep.g
    public int readNextSampleSize() {
        m0 m0Var = this.f54877a;
        int i10 = this.f54879c;
        if (i10 == 8) {
            return m0Var.readUnsignedByte();
        }
        if (i10 == 16) {
            return m0Var.readUnsignedShort();
        }
        int i11 = this.f54880d;
        this.f54880d = i11 + 1;
        if (i11 % 2 != 0) {
            return this.f54881e & 15;
        }
        int unsignedByte = m0Var.readUnsignedByte();
        this.f54881e = unsignedByte;
        return (unsignedByte & PsExtractor.VIDEO_STREAM_MASK) >> 4;
    }
}
