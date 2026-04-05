package pe;

import android.util.Pair;
import com.google.android.exoplayer2.audio.t1;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.y0;
import com.google.android.exoplayer2.z0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import ee.f0;
import ee.l0;
import ee.p;
import ee.q;
import ee.s;
import java.io.IOException;
import qf.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements p {

    /* renamed from: a, reason: collision with root package name */
    public s f80954a;

    /* renamed from: b, reason: collision with root package name */
    public l0 f80955b;

    /* renamed from: e, reason: collision with root package name */
    public c f80958e;

    /* renamed from: c, reason: collision with root package name */
    public int f80956c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f80957d = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f80959f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f80960g = -1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements c {

        /* renamed from: m, reason: collision with root package name */
        public static final int[] f80961m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n, reason: collision with root package name */
        public static final int[] f80962n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a, reason: collision with root package name */
        public final s f80963a;

        /* renamed from: b, reason: collision with root package name */
        public final l0 f80964b;

        /* renamed from: c, reason: collision with root package name */
        public final d f80965c;

        /* renamed from: d, reason: collision with root package name */
        public final int f80966d;

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f80967e;

        /* renamed from: f, reason: collision with root package name */
        public final v0 f80968f;

        /* renamed from: g, reason: collision with root package name */
        public final int f80969g;

        /* renamed from: h, reason: collision with root package name */
        public final z0 f80970h;

        /* renamed from: i, reason: collision with root package name */
        public int f80971i;

        /* renamed from: j, reason: collision with root package name */
        public long f80972j;

        /* renamed from: k, reason: collision with root package name */
        public int f80973k;

        /* renamed from: l, reason: collision with root package name */
        public long f80974l;

        public a(s sVar, l0 l0Var, d dVar) throws h2 {
            this.f80963a = sVar;
            this.f80964b = l0Var;
            this.f80965c = dVar;
            int i10 = dVar.f80985c;
            int i11 = dVar.f80985c;
            int iMax = Math.max(1, i10 / 10);
            this.f80969g = iMax;
            v0 v0Var = new v0(dVar.f80988f);
            v0Var.readLittleEndianUnsignedShort();
            int littleEndianUnsignedShort = v0Var.readLittleEndianUnsignedShort();
            this.f80966d = littleEndianUnsignedShort;
            int i12 = dVar.f80984b;
            int i13 = dVar.f80986d;
            int i14 = (((i13 - (i12 * 4)) * 8) / (dVar.f80987e * i12)) + 1;
            if (littleEndianUnsignedShort != i14) {
                throw h2.createForMalformedContainer("Expected frames per block: " + i14 + "; got: " + littleEndianUnsignedShort, null);
            }
            int iCeilDivide = n1.ceilDivide(iMax, littleEndianUnsignedShort);
            this.f80967e = new byte[iCeilDivide * i13];
            this.f80968f = new v0(littleEndianUnsignedShort * 2 * i12 * iCeilDivide);
            int i15 = ((i13 * i11) * 8) / littleEndianUnsignedShort;
            this.f80970h = new y0().setSampleMimeType(MimeTypes.AUDIO_RAW).setAverageBitrate(i15).setPeakBitrate(i15).setMaxInputSize(iMax * 2 * i12).setChannelCount(i12).setSampleRate(i11).setPcmEncoding(2).build();
        }

        public final void a(int i10) {
            long j10 = this.f80972j;
            long j11 = this.f80974l;
            d dVar = this.f80965c;
            long jScaleLargeTimestamp = j10 + n1.scaleLargeTimestamp(j11, 1000000L, dVar.f80985c);
            int i11 = i10 * 2 * dVar.f80984b;
            this.f80964b.sampleMetadata(jScaleLargeTimestamp, 1, i11, this.f80973k - i11, null);
            this.f80974l += i10;
            this.f80973k -= i11;
        }

        @Override // pe.c
        public void init(int i10, long j10) {
            this.f80963a.seekMap(new g(this.f80965c, this.f80966d, i10, j10));
            this.f80964b.format(this.f80970h);
        }

        @Override // pe.c
        public void reset(long j10) {
            this.f80971i = 0;
            this.f80972j = j10;
            this.f80973k = 0;
            this.f80974l = 0L;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0049 A[ADDED_TO_REGION, EDGE_INSN: B:43:0x0049->B:14:0x0049 BREAK  A[LOOP:0: B:6:0x0027->B:13:0x0043], REMOVE, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0040 -> B:4:0x0024). Please report as a decompilation issue!!! */
        @Override // pe.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean sampleData(ee.q r25, long r26) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 368
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pe.b.a.sampleData(ee.q, long):boolean");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: pe.b$b, reason: collision with other inner class name */
    public static final class C0761b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final s f80975a;

        /* renamed from: b, reason: collision with root package name */
        public final l0 f80976b;

        /* renamed from: c, reason: collision with root package name */
        public final d f80977c;

        /* renamed from: d, reason: collision with root package name */
        public final z0 f80978d;

        /* renamed from: e, reason: collision with root package name */
        public final int f80979e;

        /* renamed from: f, reason: collision with root package name */
        public long f80980f;

        /* renamed from: g, reason: collision with root package name */
        public int f80981g;

        /* renamed from: h, reason: collision with root package name */
        public long f80982h;

        public C0761b(s sVar, l0 l0Var, d dVar, String str, int i10) throws h2 {
            this.f80975a = sVar;
            this.f80976b = l0Var;
            this.f80977c = dVar;
            int i11 = dVar.f80984b;
            int i12 = dVar.f80985c;
            int i13 = (i11 * dVar.f80987e) / 8;
            int i14 = dVar.f80986d;
            if (i14 == i13) {
                int i15 = i12 * i13 * 8;
                int iMax = Math.max(i13, (i12 * i13) / 10);
                this.f80979e = iMax;
                this.f80978d = new y0().setSampleMimeType(str).setAverageBitrate(i15).setPeakBitrate(i15).setMaxInputSize(iMax).setChannelCount(dVar.f80984b).setSampleRate(i12).setPcmEncoding(i10).build();
                return;
            }
            throw h2.createForMalformedContainer("Expected block size: " + i13 + "; got: " + i14, null);
        }

        @Override // pe.c
        public void init(int i10, long j10) {
            this.f80975a.seekMap(new g(this.f80977c, 1, i10, j10));
            this.f80976b.format(this.f80978d);
        }

        @Override // pe.c
        public void reset(long j10) {
            this.f80980f = j10;
            this.f80981g = 0;
            this.f80982h = 0L;
        }

        @Override // pe.c
        public boolean sampleData(q qVar, long j10) throws IOException {
            int i10;
            int i11;
            long j11 = j10;
            while (j11 > 0 && (i10 = this.f80981g) < (i11 = this.f80979e)) {
                int iSampleData = this.f80976b.sampleData((k) qVar, (int) Math.min(i11 - i10, j11), true);
                if (iSampleData == -1) {
                    j11 = 0;
                } else {
                    this.f80981g += iSampleData;
                    j11 -= iSampleData;
                }
            }
            int i12 = this.f80977c.f80986d;
            int i13 = this.f80981g / i12;
            if (i13 > 0) {
                long jScaleLargeTimestamp = this.f80980f + n1.scaleLargeTimestamp(this.f80982h, 1000000L, r1.f80985c);
                int i14 = i13 * i12;
                int i15 = this.f80981g - i14;
                this.f80976b.sampleMetadata(jScaleLargeTimestamp, 1, i14, i15, null);
                this.f80982h += i13;
                this.f80981g = i15;
            }
            return j11 <= 0;
        }
    }

    @Override // ee.p
    public void init(s sVar) {
        this.f80954a = sVar;
        this.f80955b = sVar.track(0, 1);
        sVar.endTracks();
    }

    @Override // ee.p
    public int read(q qVar, f0 f0Var) throws IOException {
        com.google.android.exoplayer2.util.a.checkStateNotNull(this.f80955b);
        n1.castNonNull(this.f80954a);
        int i10 = this.f80956c;
        if (i10 == 0) {
            com.google.android.exoplayer2.util.a.checkState(qVar.getPosition() == 0);
            int i11 = this.f80959f;
            if (i11 != -1) {
                qVar.skipFully(i11);
                this.f80956c = 4;
            } else {
                if (!f.checkFileType(qVar)) {
                    throw h2.createForMalformedContainer("Unsupported or unrecognized wav file type.", null);
                }
                qVar.skipFully((int) (qVar.getPeekPosition() - qVar.getPosition()));
                this.f80956c = 1;
            }
            return 0;
        }
        if (i10 == 1) {
            this.f80957d = f.readRf64SampleDataSize(qVar);
            this.f80956c = 2;
            return 0;
        }
        if (i10 == 2) {
            d format = f.readFormat(qVar);
            int i12 = format.f80983a;
            if (i12 == 17) {
                this.f80958e = new a(this.f80954a, this.f80955b, format);
            } else if (i12 == 6) {
                this.f80958e = new C0761b(this.f80954a, this.f80955b, format, MimeTypes.AUDIO_ALAW, -1);
            } else if (i12 == 7) {
                this.f80958e = new C0761b(this.f80954a, this.f80955b, format, MimeTypes.AUDIO_MLAW, -1);
            } else {
                int pcmEncodingForType = t1.getPcmEncodingForType(i12, format.f80987e);
                if (pcmEncodingForType == 0) {
                    throw h2.createForUnsupportedContainerFeature("Unsupported WAV format type: " + format.f80983a);
                }
                this.f80958e = new C0761b(this.f80954a, this.f80955b, format, MimeTypes.AUDIO_RAW, pcmEncodingForType);
            }
            this.f80956c = 3;
            return 0;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            com.google.android.exoplayer2.util.a.checkState(this.f80960g != -1);
            return ((c) com.google.android.exoplayer2.util.a.checkNotNull(this.f80958e)).sampleData(qVar, this.f80960g - qVar.getPosition()) ? -1 : 0;
        }
        Pair<Long, Long> pairSkipToSampleData = f.skipToSampleData(qVar);
        this.f80959f = ((Long) pairSkipToSampleData.first).intValue();
        long jLongValue = ((Long) pairSkipToSampleData.second).longValue();
        long j10 = this.f80957d;
        if (j10 != -1 && jLongValue == 4294967295L) {
            jLongValue = j10;
        }
        this.f80960g = this.f80959f + jLongValue;
        long length = qVar.getLength();
        if (length != -1 && this.f80960g > length) {
            com.google.android.exoplayer2.util.f0.w("WavExtractor", "Data exceeds input length: " + this.f80960g + ", " + length);
            this.f80960g = length;
        }
        ((c) com.google.android.exoplayer2.util.a.checkNotNull(this.f80958e)).init(this.f80959f, this.f80960g);
        this.f80956c = 4;
        return 0;
    }

    @Override // ee.p
    public void seek(long j10, long j11) {
        this.f80956c = j10 == 0 ? 0 : 4;
        c cVar = this.f80958e;
        if (cVar != null) {
            cVar.reset(j11);
        }
    }

    @Override // ee.p
    public boolean sniff(q qVar) throws IOException {
        return f.checkFileType(qVar);
    }

    @Override // ee.p
    public void release() {
    }
}
