package io.odeeo.internal.j;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.odeeo.internal.b.g0;
import io.odeeo.internal.b.t;
import io.odeeo.internal.d.a;
import io.odeeo.internal.g.x;
import io.odeeo.internal.j.d;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends d {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f64340e = {5512, 11025, 22050, 44100};

    /* renamed from: b, reason: collision with root package name */
    public boolean f64341b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f64342c;

    /* renamed from: d, reason: collision with root package name */
    public int f64343d;

    public a(x xVar) {
        super(xVar);
    }

    @Override // io.odeeo.internal.j.d
    public boolean a(io.odeeo.internal.q0.x xVar) throws d.a {
        if (this.f64341b) {
            xVar.skipBytes(1);
        } else {
            int unsignedByte = xVar.readUnsignedByte();
            int i10 = (unsignedByte >> 4) & 15;
            this.f64343d = i10;
            if (i10 == 2) {
                this.f64364a.format(new t.b().setSampleMimeType(MimeTypes.AUDIO_MPEG).setChannelCount(1).setSampleRate(f64340e[(unsignedByte >> 2) & 3]).build());
                this.f64342c = true;
            } else if (i10 == 7 || i10 == 8) {
                this.f64364a.format(new t.b().setSampleMimeType(i10 == 7 ? MimeTypes.AUDIO_ALAW : MimeTypes.AUDIO_MLAW).setChannelCount(1).setSampleRate(8000).build());
                this.f64342c = true;
            } else if (i10 != 10) {
                throw new d.a("Audio format not supported: " + this.f64343d);
            }
            this.f64341b = true;
        }
        return true;
    }

    @Override // io.odeeo.internal.j.d
    public void seek() {
    }

    @Override // io.odeeo.internal.j.d
    public boolean a(io.odeeo.internal.q0.x xVar, long j10) throws g0 {
        if (this.f64343d == 2) {
            int iBytesLeft = xVar.bytesLeft();
            this.f64364a.sampleData(xVar, iBytesLeft);
            this.f64364a.sampleMetadata(j10, 1, iBytesLeft, 0, null);
            return true;
        }
        int unsignedByte = xVar.readUnsignedByte();
        if (unsignedByte == 0 && !this.f64342c) {
            int iBytesLeft2 = xVar.bytesLeft();
            byte[] bArr = new byte[iBytesLeft2];
            xVar.readBytes(bArr, 0, iBytesLeft2);
            a.b audioSpecificConfig = io.odeeo.internal.d.a.parseAudioSpecificConfig(bArr);
            this.f64364a.format(new t.b().setSampleMimeType(MimeTypes.AUDIO_AAC).setCodecs(audioSpecificConfig.f63315c).setChannelCount(audioSpecificConfig.f63314b).setSampleRate(audioSpecificConfig.f63313a).setInitializationData(Collections.singletonList(bArr)).build());
            this.f64342c = true;
            return false;
        }
        if (this.f64343d == 10 && unsignedByte != 1) {
            return false;
        }
        int iBytesLeft3 = xVar.bytesLeft();
        this.f64364a.sampleData(xVar, iBytesLeft3);
        this.f64364a.sampleMetadata(j10, 1, iBytesLeft3, 0, null);
        return true;
    }
}
