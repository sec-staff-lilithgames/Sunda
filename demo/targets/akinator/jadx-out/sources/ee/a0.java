package ee;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.y0;
import com.google.android.exoplayer2.z0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f54153a;

    /* renamed from: b, reason: collision with root package name */
    public final int f54154b;

    /* renamed from: c, reason: collision with root package name */
    public final int f54155c;

    /* renamed from: d, reason: collision with root package name */
    public final int f54156d;

    /* renamed from: e, reason: collision with root package name */
    public final int f54157e;

    /* renamed from: f, reason: collision with root package name */
    public final int f54158f;

    /* renamed from: g, reason: collision with root package name */
    public final int f54159g;

    /* renamed from: h, reason: collision with root package name */
    public final int f54160h;

    /* renamed from: i, reason: collision with root package name */
    public final int f54161i;

    /* renamed from: j, reason: collision with root package name */
    public final long f54162j;

    /* renamed from: k, reason: collision with root package name */
    public final a f54163k;

    /* renamed from: l, reason: collision with root package name */
    public final Metadata f54164l;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f54165a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f54166b;

        public a(long[] jArr, long[] jArr2) {
            this.f54165a = jArr;
            this.f54166b = jArr2;
        }
    }

    public a0(byte[] bArr, int i10) {
        u0 u0Var = new u0(bArr);
        u0Var.setPosition(i10 * 8);
        this.f54153a = u0Var.readBits(16);
        this.f54154b = u0Var.readBits(16);
        this.f54155c = u0Var.readBits(24);
        this.f54156d = u0Var.readBits(24);
        int bits = u0Var.readBits(20);
        this.f54157e = bits;
        this.f54158f = b(bits);
        this.f54159g = u0Var.readBits(3) + 1;
        int bits2 = u0Var.readBits(5) + 1;
        this.f54160h = bits2;
        this.f54161i = a(bits2);
        this.f54162j = u0Var.readBitsToLong(36);
        this.f54163k = null;
        this.f54164l = null;
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
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
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

    public a0 copyWithPictureFrames(List<PictureFrame> list) {
        Metadata metadataCopyWithAppendedEntriesFrom = getMetadataCopyWithAppendedEntriesFrom(new Metadata(list));
        return new a0(this.f54153a, this.f54154b, this.f54155c, this.f54156d, this.f54157e, this.f54159g, this.f54160h, this.f54162j, this.f54163k, metadataCopyWithAppendedEntriesFrom);
    }

    public a0 copyWithSeekTable(a aVar) {
        return new a0(this.f54153a, this.f54154b, this.f54155c, this.f54156d, this.f54157e, this.f54159g, this.f54160h, this.f54162j, aVar, this.f54164l);
    }

    public a0 copyWithVorbisComments(List<String> list) {
        Metadata metadataCopyWithAppendedEntriesFrom = getMetadataCopyWithAppendedEntriesFrom(r0.parseVorbisComments(list));
        return new a0(this.f54153a, this.f54154b, this.f54155c, this.f54156d, this.f54157e, this.f54159g, this.f54160h, this.f54162j, this.f54163k, metadataCopyWithAppendedEntriesFrom);
    }

    public long getApproxBytesPerFrame() {
        long j10;
        long j11;
        int i10 = this.f54156d;
        if (i10 > 0) {
            j10 = (i10 + this.f54155c) / 2;
            j11 = 1;
        } else {
            int i11 = this.f54154b;
            int i12 = this.f54153a;
            j10 = ((((i12 != i11 || i12 <= 0) ? 4096L : i12) * this.f54159g) * this.f54160h) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public int getDecodedBitrate() {
        return this.f54160h * this.f54157e * this.f54159g;
    }

    public long getDurationUs() {
        long j10 = this.f54162j;
        return j10 == 0 ? C.TIME_UNSET : (j10 * 1000000) / this.f54157e;
    }

    public z0 getFormat(byte[] bArr, Metadata metadata) {
        bArr[4] = -128;
        int i10 = this.f54156d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new y0().setSampleMimeType(MimeTypes.AUDIO_FLAC).setMaxInputSize(i10).setChannelCount(this.f54159g).setSampleRate(this.f54157e).setInitializationData(Collections.singletonList(bArr)).setMetadata(getMetadataCopyWithAppendedEntriesFrom(metadata)).build();
    }

    public int getMaxDecodedFrameSize() {
        return (this.f54160h / 8) * this.f54154b * this.f54159g;
    }

    public Metadata getMetadataCopyWithAppendedEntriesFrom(Metadata metadata) {
        Metadata metadata2 = this.f54164l;
        return metadata2 == null ? metadata : metadata2.copyWithAppendedEntriesFrom(metadata);
    }

    public long getSampleNumber(long j10) {
        return n1.constrainValue((j10 * this.f54157e) / 1000000, 0L, this.f54162j - 1);
    }

    public a0(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, Metadata metadata) {
        this.f54153a = i10;
        this.f54154b = i11;
        this.f54155c = i12;
        this.f54156d = i13;
        this.f54157e = i14;
        this.f54158f = b(i14);
        this.f54159g = i15;
        this.f54160h = i16;
        this.f54161i = a(i16);
        this.f54162j = j10;
        this.f54163k = aVar;
        this.f54164l = metadata;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a0(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, ArrayList<String> arrayList, ArrayList<PictureFrame> arrayList2) {
        Metadata vorbisComments = r0.parseVorbisComments(arrayList);
        this(i10, i11, i12, i13, i14, i15, i16, j10, (a) null, (vorbisComments == null && arrayList2.isEmpty()) ? null : new Metadata(arrayList2).copyWithAppendedEntriesFrom(vorbisComments));
    }
}
