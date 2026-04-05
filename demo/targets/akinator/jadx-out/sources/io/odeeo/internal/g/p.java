package io.odeeo.internal.g;

import com.ironsource.C3191e4;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.odeeo.internal.b.t;
import io.odeeo.internal.q0.g0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f64148a;

    /* renamed from: b, reason: collision with root package name */
    public final int f64149b;

    /* renamed from: c, reason: collision with root package name */
    public final int f64150c;

    /* renamed from: d, reason: collision with root package name */
    public final int f64151d;

    /* renamed from: e, reason: collision with root package name */
    public final int f64152e;

    /* renamed from: f, reason: collision with root package name */
    public final int f64153f;

    /* renamed from: g, reason: collision with root package name */
    public final int f64154g;

    /* renamed from: h, reason: collision with root package name */
    public final int f64155h;

    /* renamed from: i, reason: collision with root package name */
    public final int f64156i;

    /* renamed from: j, reason: collision with root package name */
    public final long f64157j;

    /* renamed from: k, reason: collision with root package name */
    public final a f64158k;

    /* renamed from: l, reason: collision with root package name */
    public final io.odeeo.internal.s.a f64159l;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f64160a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f64161b;

        public a(long[] jArr, long[] jArr2) {
            this.f64160a = jArr;
            this.f64161b = jArr2;
        }
    }

    public p(byte[] bArr, int i10) {
        io.odeeo.internal.q0.w wVar = new io.odeeo.internal.q0.w(bArr);
        wVar.setPosition(i10 * 8);
        this.f64148a = wVar.readBits(16);
        this.f64149b = wVar.readBits(16);
        this.f64150c = wVar.readBits(24);
        this.f64151d = wVar.readBits(24);
        int bits = wVar.readBits(20);
        this.f64152e = bits;
        this.f64153f = b(bits);
        this.f64154g = wVar.readBits(3) + 1;
        int bits2 = wVar.readBits(5) + 1;
        this.f64155h = bits2;
        this.f64156i = a(bits2);
        this.f64157j = wVar.readBitsToLong(36);
        this.f64158k = null;
        this.f64159l = null;
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

    public p copyWithPictureFrames(List<io.odeeo.internal.v.a> list) {
        return new p(this.f64148a, this.f64149b, this.f64150c, this.f64151d, this.f64152e, this.f64154g, this.f64155h, this.f64157j, this.f64158k, getMetadataCopyWithAppendedEntriesFrom(a(Collections.EMPTY_LIST, list)));
    }

    public p copyWithSeekTable(a aVar) {
        return new p(this.f64148a, this.f64149b, this.f64150c, this.f64151d, this.f64152e, this.f64154g, this.f64155h, this.f64157j, aVar, this.f64159l);
    }

    public p copyWithVorbisComments(List<String> list) {
        return new p(this.f64148a, this.f64149b, this.f64150c, this.f64151d, this.f64152e, this.f64154g, this.f64155h, this.f64157j, this.f64158k, getMetadataCopyWithAppendedEntriesFrom(a(list, Collections.EMPTY_LIST)));
    }

    public long getApproxBytesPerFrame() {
        long j10;
        long j11;
        int i10 = this.f64151d;
        if (i10 > 0) {
            j10 = (i10 + this.f64150c) / 2;
            j11 = 1;
        } else {
            int i11 = this.f64148a;
            j10 = ((((i11 != this.f64149b || i11 <= 0) ? 4096L : i11) * this.f64154g) * this.f64155h) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public int getDecodedBitrate() {
        return this.f64155h * this.f64152e * this.f64154g;
    }

    public long getDurationUs() {
        long j10 = this.f64157j;
        return j10 == 0 ? C.TIME_UNSET : (j10 * 1000000) / this.f64152e;
    }

    public io.odeeo.internal.b.t getFormat(byte[] bArr, io.odeeo.internal.s.a aVar) {
        bArr[4] = -128;
        int i10 = this.f64151d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new t.b().setSampleMimeType(MimeTypes.AUDIO_FLAC).setMaxInputSize(i10).setChannelCount(this.f64154g).setSampleRate(this.f64152e).setInitializationData(Collections.singletonList(bArr)).setMetadata(getMetadataCopyWithAppendedEntriesFrom(aVar)).build();
    }

    public int getMaxDecodedFrameSize() {
        return (this.f64155h / 8) * this.f64149b * this.f64154g;
    }

    public io.odeeo.internal.s.a getMetadataCopyWithAppendedEntriesFrom(io.odeeo.internal.s.a aVar) {
        io.odeeo.internal.s.a aVar2 = this.f64159l;
        return aVar2 == null ? aVar : aVar2.copyWithAppendedEntriesFrom(aVar);
    }

    public long getSampleNumber(long j10) {
        return g0.constrainValue((j10 * this.f64152e) / 1000000, 0L, this.f64157j - 1);
    }

    public static io.odeeo.internal.s.a a(List<String> list, List<io.odeeo.internal.v.a> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            String[] strArrSplitAtFirst = g0.splitAtFirst(str, C3191e4.i.f36525b);
            if (strArrSplitAtFirst.length != 2) {
                o2.A("Failed to parse Vorbis comment: ", str, "FlacStreamMetadata");
            } else {
                arrayList.add(new io.odeeo.internal.v.b(strArrSplitAtFirst[0], strArrSplitAtFirst[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new io.odeeo.internal.s.a(arrayList);
    }

    public p(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, ArrayList<String> arrayList, ArrayList<io.odeeo.internal.v.a> arrayList2) {
        this(i10, i11, i12, i13, i14, i15, i16, j10, (a) null, a(arrayList, arrayList2));
    }

    public p(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, io.odeeo.internal.s.a aVar2) {
        this.f64148a = i10;
        this.f64149b = i11;
        this.f64150c = i12;
        this.f64151d = i13;
        this.f64152e = i14;
        this.f64153f = b(i14);
        this.f64154g = i15;
        this.f64155h = i16;
        this.f64156i = a(i16);
        this.f64157j = j10;
        this.f64158k = aVar;
        this.f64159l = aVar2;
    }
}
