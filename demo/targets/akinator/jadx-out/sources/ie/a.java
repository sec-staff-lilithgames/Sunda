package ie;

import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.y0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import ee.l0;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a extends e {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f59543e = {5512, 11025, 22050, 44100};

    /* renamed from: b, reason: collision with root package name */
    public boolean f59544b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f59545c;

    /* renamed from: d, reason: collision with root package name */
    public int f59546d;

    public a(l0 l0Var) {
        super(l0Var);
    }

    @Override // ie.e
    public final boolean a(v0 v0Var) throws d {
        if (this.f59544b) {
            v0Var.skipBytes(1);
            return true;
        }
        int unsignedByte = v0Var.readUnsignedByte();
        int i10 = (unsignedByte >> 4) & 15;
        this.f59546d = i10;
        l0 l0Var = this.f59566a;
        if (i10 == 2) {
            l0Var.format(new y0().setSampleMimeType(MimeTypes.AUDIO_MPEG).setChannelCount(1).setSampleRate(f59543e[(unsignedByte >> 2) & 3]).build());
            this.f59545c = true;
        } else if (i10 == 7 || i10 == 8) {
            l0Var.format(new y0().setSampleMimeType(i10 == 7 ? MimeTypes.AUDIO_ALAW : MimeTypes.AUDIO_MLAW).setChannelCount(1).setSampleRate(8000).build());
            this.f59545c = true;
        } else if (i10 != 10) {
            throw new d("Audio format not supported: " + this.f59546d);
        }
        this.f59544b = true;
        return true;
    }

    @Override // ie.e
    public final boolean b(v0 v0Var, long j10) throws h2 {
        int i10 = this.f59546d;
        l0 l0Var = this.f59566a;
        if (i10 == 2) {
            int iBytesLeft = v0Var.bytesLeft();
            l0Var.sampleData(v0Var, iBytesLeft);
            this.f59566a.sampleMetadata(j10, 1, iBytesLeft, 0, null);
            return true;
        }
        int unsignedByte = v0Var.readUnsignedByte();
        if (unsignedByte != 0 || this.f59545c) {
            if (this.f59546d == 10 && unsignedByte != 1) {
                return false;
            }
            int iBytesLeft2 = v0Var.bytesLeft();
            l0Var.sampleData(v0Var, iBytesLeft2);
            this.f59566a.sampleMetadata(j10, 1, iBytesLeft2, 0, null);
            return true;
        }
        int iBytesLeft3 = v0Var.bytesLeft();
        byte[] bArr = new byte[iBytesLeft3];
        v0Var.readBytes(bArr, 0, iBytesLeft3);
        com.google.android.exoplayer2.audio.a audioSpecificConfig = com.google.android.exoplayer2.audio.b.parseAudioSpecificConfig(bArr);
        l0Var.format(new y0().setSampleMimeType(MimeTypes.AUDIO_AAC).setCodecs(audioSpecificConfig.f27045c).setChannelCount(audioSpecificConfig.f27044b).setSampleRate(audioSpecificConfig.f27043a).setInitializationData(Collections.singletonList(bArr)).build());
        this.f59545c = true;
        return false;
    }

    @Override // ie.e
    public void seek() {
    }
}
