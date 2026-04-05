package ep;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j implements g {

    /* renamed from: a, reason: collision with root package name */
    public final int f54874a;

    /* renamed from: b, reason: collision with root package name */
    public final int f54875b;

    /* renamed from: c, reason: collision with root package name */
    public final m0 f54876c;

    public j(jn.d dVar, io.bidmachine.media3.common.b bVar) {
        m0 m0Var = dVar.f69729b;
        this.f54876c = m0Var;
        m0Var.setPosition(12);
        int unsignedIntToInt = m0Var.readUnsignedIntToInt();
        if (MimeTypes.AUDIO_RAW.equals(bVar.f60665o)) {
            int pcmFrameSize = a1.getPcmFrameSize(bVar.G, bVar.E);
            if (unsignedIntToInt == 0 || unsignedIntToInt % pcmFrameSize != 0) {
                io.bidmachine.media3.common.util.b0.w("BoxParsers", "Audio sample size mismatch. stsd sample size: " + pcmFrameSize + ", stsz sample size: " + unsignedIntToInt);
                unsignedIntToInt = pcmFrameSize;
            }
        }
        this.f54874a = unsignedIntToInt == 0 ? -1 : unsignedIntToInt;
        this.f54875b = m0Var.readUnsignedIntToInt();
    }

    @Override // ep.g
    public int getFixedSampleSize() {
        return this.f54874a;
    }

    @Override // ep.g
    public int getSampleCount() {
        return this.f54875b;
    }

    @Override // ep.g
    public int readNextSampleSize() {
        int i10 = this.f54874a;
        return i10 == -1 ? this.f54876c.readUnsignedIntToInt() : i10;
    }
}
