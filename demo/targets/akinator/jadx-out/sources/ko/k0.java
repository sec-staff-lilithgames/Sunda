package ko;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f71689a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71690b;

    /* renamed from: c, reason: collision with root package name */
    public final int f71691c;

    /* renamed from: d, reason: collision with root package name */
    public final int f71692d;

    /* renamed from: e, reason: collision with root package name */
    public final int f71693e;

    /* renamed from: f, reason: collision with root package name */
    public final int f71694f;

    /* renamed from: g, reason: collision with root package name */
    public final int f71695g;

    /* renamed from: h, reason: collision with root package name */
    public final int f71696h;

    /* renamed from: i, reason: collision with root package name */
    public final int f71697i;

    /* renamed from: j, reason: collision with root package name */
    public final long f71698j;

    /* renamed from: k, reason: collision with root package name */
    public final a f71699k;

    /* renamed from: l, reason: collision with root package name */
    public final gn.u0 f71700l;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f71701a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f71702b;

        public a(long[] jArr, long[] jArr2) {
            this.f71701a = jArr;
            this.f71702b = jArr2;
        }
    }

    public k0(byte[] bArr, int i10) {
        io.bidmachine.media3.common.util.l0 l0Var = new io.bidmachine.media3.common.util.l0(bArr);
        l0Var.setPosition(i10 * 8);
        this.f71689a = l0Var.readBits(16);
        this.f71690b = l0Var.readBits(16);
        this.f71691c = l0Var.readBits(24);
        this.f71692d = l0Var.readBits(24);
        int bits = l0Var.readBits(20);
        this.f71693e = bits;
        this.f71694f = b(bits);
        this.f71695g = l0Var.readBits(3) + 1;
        int bits2 = l0Var.readBits(5) + 1;
        this.f71696h = bits2;
        this.f71697i = a(bits2);
        this.f71698j = l0Var.readBitsToLong(36);
        this.f71699k = null;
        this.f71700l = null;
    }

    public static int a(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 20) {
            return 5;
        }
        if (i10 != 24) {
            return i10 != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int b(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public k0 copyWithPictureFrames(List<wo.a> list) {
        gn.u0 metadataCopyWithAppendedEntriesFrom = getMetadataCopyWithAppendedEntriesFrom(new gn.u0(list));
        return new k0(this.f71689a, this.f71690b, this.f71691c, this.f71692d, this.f71693e, this.f71695g, this.f71696h, this.f71698j, this.f71699k, metadataCopyWithAppendedEntriesFrom);
    }

    public k0 copyWithSeekTable(a aVar) {
        return new k0(this.f71689a, this.f71690b, this.f71691c, this.f71692d, this.f71693e, this.f71695g, this.f71696h, this.f71698j, aVar, this.f71700l);
    }

    public k0 copyWithVorbisComments(List<String> list) {
        gn.u0 metadataCopyWithAppendedEntriesFrom = getMetadataCopyWithAppendedEntriesFrom(k1.parseVorbisComments(list));
        return new k0(this.f71689a, this.f71690b, this.f71691c, this.f71692d, this.f71693e, this.f71695g, this.f71696h, this.f71698j, this.f71699k, metadataCopyWithAppendedEntriesFrom);
    }

    public long getApproxBytesPerFrame() {
        long j10;
        long j11;
        int i10 = this.f71692d;
        if (i10 > 0) {
            j10 = (i10 + this.f71691c) / 2;
            j11 = 1;
        } else {
            int i11 = this.f71690b;
            int i12 = this.f71689a;
            j10 = ((((i12 != i11 || i12 <= 0) ? 4096L : i12) * this.f71695g) * this.f71696h) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public int getDecodedBitrate() {
        return this.f71696h * this.f71693e * this.f71695g;
    }

    public long getDurationUs() {
        long j10 = this.f71698j;
        return j10 == 0 ? C.TIME_UNSET : (j10 * 1000000) / this.f71693e;
    }

    public io.bidmachine.media3.common.b getFormat(byte[] bArr, gn.u0 u0Var) {
        bArr[4] = -128;
        int i10 = this.f71692d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new gn.w().setSampleMimeType(MimeTypes.AUDIO_FLAC).setMaxInputSize(i10).setChannelCount(this.f71695g).setSampleRate(this.f71693e).setPcmEncoding(io.bidmachine.media3.common.util.a1.getPcmEncoding(this.f71696h)).setInitializationData(Collections.singletonList(bArr)).setMetadata(getMetadataCopyWithAppendedEntriesFrom(u0Var)).build();
    }

    public int getMaxDecodedFrameSize() {
        return (this.f71696h / 8) * this.f71690b * this.f71695g;
    }

    public gn.u0 getMetadataCopyWithAppendedEntriesFrom(gn.u0 u0Var) {
        gn.u0 u0Var2 = this.f71700l;
        return u0Var2 == null ? u0Var : u0Var2.copyWithAppendedEntriesFrom(u0Var);
    }

    public long getSampleNumber(long j10) {
        return io.bidmachine.media3.common.util.a1.constrainValue((j10 * this.f71693e) / 1000000, 0L, this.f71698j - 1);
    }

    public k0(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, gn.u0 u0Var) {
        this.f71689a = i10;
        this.f71690b = i11;
        this.f71691c = i12;
        this.f71692d = i13;
        this.f71693e = i14;
        this.f71694f = b(i14);
        this.f71695g = i15;
        this.f71696h = i16;
        this.f71697i = a(i16);
        this.f71698j = j10;
        this.f71699k = aVar;
        this.f71700l = u0Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k0(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, ArrayList<String> arrayList, ArrayList<wo.a> arrayList2) {
        gn.u0 vorbisComments = k1.parseVorbisComments(arrayList);
        this(i10, i11, i12, i13, i14, i15, i16, j10, (a) null, (vorbisComments == null && arrayList2.isEmpty()) ? null : new gn.u0(arrayList2).copyWithAppendedEntriesFrom(vorbisComments));
    }
}
