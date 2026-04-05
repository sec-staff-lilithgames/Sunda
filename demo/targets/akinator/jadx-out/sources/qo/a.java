package qo;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gn.w;
import gn.z0;
import io.bidmachine.media3.common.util.m0;
import java.util.Collections;
import ko.e1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a extends e {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f83392e = {5512, 11025, 22050, 44100};

    /* renamed from: b, reason: collision with root package name */
    public boolean f83393b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f83394c;

    /* renamed from: d, reason: collision with root package name */
    public int f83395d;

    public a(e1 e1Var) {
        super(e1Var);
    }

    @Override // qo.e
    public final boolean a(m0 m0Var) throws d {
        if (this.f83393b) {
            m0Var.skipBytes(1);
            return true;
        }
        int unsignedByte = m0Var.readUnsignedByte();
        int i10 = (unsignedByte >> 4) & 15;
        this.f83395d = i10;
        e1 e1Var = this.f83415a;
        if (i10 == 2) {
            e1Var.format(new w().setContainerMimeType("video/x-flv").setSampleMimeType(MimeTypes.AUDIO_MPEG).setChannelCount(1).setSampleRate(f83392e[(unsignedByte >> 2) & 3]).build());
            this.f83394c = true;
        } else if (i10 == 7 || i10 == 8) {
            e1Var.format(new w().setContainerMimeType("video/x-flv").setSampleMimeType(i10 == 7 ? MimeTypes.AUDIO_ALAW : MimeTypes.AUDIO_MLAW).setChannelCount(1).setSampleRate(8000).build());
            this.f83394c = true;
        } else if (i10 != 10) {
            throw new d("Audio format not supported: " + this.f83395d);
        }
        this.f83393b = true;
        return true;
    }

    @Override // qo.e
    public final boolean b(long j10, m0 m0Var) throws z0 {
        int i10 = this.f83395d;
        e1 e1Var = this.f83415a;
        if (i10 == 2) {
            int iBytesLeft = m0Var.bytesLeft();
            e1Var.sampleData(m0Var, iBytesLeft);
            this.f83415a.sampleMetadata(j10, 1, iBytesLeft, 0, null);
            return true;
        }
        int unsignedByte = m0Var.readUnsignedByte();
        if (unsignedByte != 0 || this.f83394c) {
            if (this.f83395d == 10 && unsignedByte != 1) {
                return false;
            }
            int iBytesLeft2 = m0Var.bytesLeft();
            e1Var.sampleData(m0Var, iBytesLeft2);
            this.f83415a.sampleMetadata(j10, 1, iBytesLeft2, 0, null);
            return true;
        }
        int iBytesLeft3 = m0Var.bytesLeft();
        byte[] bArr = new byte[iBytesLeft3];
        m0Var.readBytes(bArr, 0, iBytesLeft3);
        ko.a audioSpecificConfig = ko.b.parseAudioSpecificConfig(bArr);
        e1Var.format(new w().setContainerMimeType("video/x-flv").setSampleMimeType(MimeTypes.AUDIO_AAC).setCodecs(audioSpecificConfig.f71600c).setChannelCount(audioSpecificConfig.f71599b).setSampleRate(audioSpecificConfig.f71598a).setInitializationData(Collections.singletonList(bArr)).build());
        this.f83394c = true;
        return false;
    }

    @Override // qo.e
    public void seek() {
    }
}
