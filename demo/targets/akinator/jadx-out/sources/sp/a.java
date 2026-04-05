package sp;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import gn.o;
import gn.w;
import gn.z0;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.b0;
import io.bidmachine.media3.common.util.m0;
import java.io.IOException;
import java.util.List;
import ko.a0;
import ko.c0;
import ko.e1;
import ko.l1;
import ko.v0;
import ko.z;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements z {

    /* renamed from: a, reason: collision with root package name */
    public c0 f86069a;

    /* renamed from: b, reason: collision with root package name */
    public e1 f86070b;

    /* renamed from: e, reason: collision with root package name */
    public sp.b f86073e;

    /* renamed from: c, reason: collision with root package name */
    public int f86071c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f86072d = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f86074f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f86075g = -1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: sp.a$a, reason: collision with other inner class name */
    public static final class C0781a implements sp.b {

        /* renamed from: m, reason: collision with root package name */
        public static final int[] f86076m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n, reason: collision with root package name */
        public static final int[] f86077n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a, reason: collision with root package name */
        public final c0 f86078a;

        /* renamed from: b, reason: collision with root package name */
        public final e1 f86079b;

        /* renamed from: c, reason: collision with root package name */
        public final c f86080c;

        /* renamed from: d, reason: collision with root package name */
        public final int f86081d;

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f86082e;

        /* renamed from: f, reason: collision with root package name */
        public final m0 f86083f;

        /* renamed from: g, reason: collision with root package name */
        public final int f86084g;

        /* renamed from: h, reason: collision with root package name */
        public final io.bidmachine.media3.common.b f86085h;

        /* renamed from: i, reason: collision with root package name */
        public int f86086i;

        /* renamed from: j, reason: collision with root package name */
        public long f86087j;

        /* renamed from: k, reason: collision with root package name */
        public int f86088k;

        /* renamed from: l, reason: collision with root package name */
        public long f86089l;

        public C0781a(c0 c0Var, e1 e1Var, c cVar) throws z0 {
            this.f86078a = c0Var;
            this.f86079b = e1Var;
            this.f86080c = cVar;
            int i10 = cVar.f86100c;
            int i11 = cVar.f86100c;
            int iMax = Math.max(1, i10 / 10);
            this.f86084g = iMax;
            m0 m0Var = new m0(cVar.f86103f);
            m0Var.readLittleEndianUnsignedShort();
            int littleEndianUnsignedShort = m0Var.readLittleEndianUnsignedShort();
            this.f86081d = littleEndianUnsignedShort;
            int i12 = cVar.f86099b;
            int i13 = cVar.f86101d;
            int i14 = (((i13 - (i12 * 4)) * 8) / (cVar.f86102e * i12)) + 1;
            if (littleEndianUnsignedShort != i14) {
                throw z0.createForMalformedContainer("Expected frames per block: " + i14 + "; got: " + littleEndianUnsignedShort, null);
            }
            int iCeilDivide = a1.ceilDivide(iMax, littleEndianUnsignedShort);
            this.f86082e = new byte[iCeilDivide * i13];
            this.f86083f = new m0(littleEndianUnsignedShort * 2 * i12 * iCeilDivide);
            int i15 = ((i13 * i11) * 8) / littleEndianUnsignedShort;
            this.f86085h = new w().setSampleMimeType(MimeTypes.AUDIO_RAW).setAverageBitrate(i15).setPeakBitrate(i15).setMaxInputSize(iMax * 2 * i12).setChannelCount(i12).setSampleRate(i11).setPcmEncoding(2).build();
        }

        public final void a(int i10) {
            long j10 = this.f86087j;
            long j11 = this.f86089l;
            c cVar = this.f86080c;
            long jScaleLargeTimestamp = j10 + a1.scaleLargeTimestamp(j11, 1000000L, cVar.f86100c);
            int i11 = i10 * 2 * cVar.f86099b;
            this.f86079b.sampleMetadata(jScaleLargeTimestamp, 1, i11, this.f86088k - i11, null);
            this.f86089l += i10;
            this.f86088k -= i11;
        }

        @Override // sp.b
        public void init(int i10, long j10) {
            f fVar = new f(this.f86080c, this.f86081d, i10, j10);
            this.f86078a.seekMap(fVar);
            io.bidmachine.media3.common.b bVar = this.f86085h;
            e1 e1Var = this.f86079b;
            e1Var.format(bVar);
            e1Var.durationUs(fVar.getDurationUs());
        }

        @Override // sp.b
        public void reset(long j10) {
            this.f86086i = 0;
            this.f86087j = j10;
            this.f86088k = 0;
            this.f86089l = 0L;
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
        @Override // sp.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean sampleData(ko.a0 r25, long r26) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 368
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: sp.a.C0781a.sampleData(ko.a0, long):boolean");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements sp.b {

        /* renamed from: a, reason: collision with root package name */
        public final c0 f86090a;

        /* renamed from: b, reason: collision with root package name */
        public final e1 f86091b;

        /* renamed from: c, reason: collision with root package name */
        public final c f86092c;

        /* renamed from: d, reason: collision with root package name */
        public final io.bidmachine.media3.common.b f86093d;

        /* renamed from: e, reason: collision with root package name */
        public final int f86094e;

        /* renamed from: f, reason: collision with root package name */
        public long f86095f;

        /* renamed from: g, reason: collision with root package name */
        public int f86096g;

        /* renamed from: h, reason: collision with root package name */
        public long f86097h;

        public b(c0 c0Var, e1 e1Var, c cVar, String str, int i10) throws z0 {
            this.f86090a = c0Var;
            this.f86091b = e1Var;
            this.f86092c = cVar;
            int i11 = cVar.f86099b;
            int i12 = cVar.f86100c;
            int i13 = (i11 * cVar.f86102e) / 8;
            int i14 = cVar.f86101d;
            if (i14 == i13) {
                int i15 = i12 * i13 * 8;
                int iMax = Math.max(i13, (i12 * i13) / 10);
                this.f86094e = iMax;
                this.f86093d = new w().setContainerMimeType("audio/wav").setSampleMimeType(str).setAverageBitrate(i15).setPeakBitrate(i15).setMaxInputSize(iMax).setChannelCount(cVar.f86099b).setSampleRate(i12).setPcmEncoding(i10).build();
                return;
            }
            throw z0.createForMalformedContainer("Expected block size: " + i13 + "; got: " + i14, null);
        }

        @Override // sp.b
        public void init(int i10, long j10) {
            f fVar = new f(this.f86092c, 1, i10, j10);
            this.f86090a.seekMap(fVar);
            io.bidmachine.media3.common.b bVar = this.f86093d;
            e1 e1Var = this.f86091b;
            e1Var.format(bVar);
            e1Var.durationUs(fVar.getDurationUs());
        }

        @Override // sp.b
        public void reset(long j10) {
            this.f86095f = j10;
            this.f86096g = 0;
            this.f86097h = 0L;
        }

        @Override // sp.b
        public boolean sampleData(a0 a0Var, long j10) throws IOException {
            int i10;
            int i11;
            long j11 = j10;
            while (j11 > 0 && (i10 = this.f86096g) < (i11 = this.f86094e)) {
                int iSampleData = this.f86091b.sampleData((o) a0Var, (int) Math.min(i11 - i10, j11), true);
                if (iSampleData == -1) {
                    j11 = 0;
                } else {
                    this.f86096g += iSampleData;
                    j11 -= iSampleData;
                }
            }
            int i12 = this.f86092c.f86101d;
            int i13 = this.f86096g / i12;
            if (i13 > 0) {
                long jScaleLargeTimestamp = this.f86095f + a1.scaleLargeTimestamp(this.f86097h, 1000000L, r1.f86100c);
                int i14 = i13 * i12;
                int i15 = this.f86096g - i14;
                this.f86091b.sampleMetadata(jScaleLargeTimestamp, 1, i14, i15, null);
                this.f86097h += i13;
                this.f86096g = i15;
            }
            return j11 <= 0;
        }
    }

    @Override // ko.z
    public /* bridge */ /* synthetic */ List getSniffFailureDetails() {
        return super.getSniffFailureDetails();
    }

    @Override // ko.z
    @SideEffectFree
    public /* bridge */ /* synthetic */ z getUnderlyingImplementation() {
        return super.getUnderlyingImplementation();
    }

    @Override // ko.z
    public void init(c0 c0Var) {
        this.f86069a = c0Var;
        this.f86070b = c0Var.track(0, 1);
        c0Var.endTracks();
    }

    @Override // ko.z
    public int read(a0 a0Var, v0 v0Var) throws IOException {
        io.bidmachine.media3.common.util.a.checkStateNotNull(this.f86070b);
        a1.castNonNull(this.f86069a);
        int i10 = this.f86071c;
        if (i10 == 0) {
            io.bidmachine.media3.common.util.a.checkState(a0Var.getPosition() == 0);
            int i11 = this.f86074f;
            if (i11 != -1) {
                a0Var.skipFully(i11);
                this.f86071c = 4;
            } else {
                if (!e.checkFileType(a0Var)) {
                    throw z0.createForMalformedContainer("Unsupported or unrecognized wav file type.", null);
                }
                a0Var.skipFully((int) (a0Var.getPeekPosition() - a0Var.getPosition()));
                this.f86071c = 1;
            }
            return 0;
        }
        if (i10 == 1) {
            this.f86072d = e.readRf64SampleDataSize(a0Var);
            this.f86071c = 2;
            return 0;
        }
        if (i10 == 2) {
            c format = e.readFormat(a0Var);
            int i12 = format.f86098a;
            if (i12 == 17) {
                this.f86073e = new C0781a(this.f86069a, this.f86070b, format);
            } else if (i12 == 6) {
                this.f86073e = new b(this.f86069a, this.f86070b, format, MimeTypes.AUDIO_ALAW, -1);
            } else if (i12 == 7) {
                this.f86073e = new b(this.f86069a, this.f86070b, format, MimeTypes.AUDIO_MLAW, -1);
            } else {
                int pcmEncodingForType = l1.getPcmEncodingForType(i12, format.f86102e);
                if (pcmEncodingForType == 0) {
                    throw z0.createForUnsupportedContainerFeature("Unsupported WAV format type: " + format.f86098a);
                }
                this.f86073e = new b(this.f86069a, this.f86070b, format, MimeTypes.AUDIO_RAW, pcmEncodingForType);
            }
            this.f86071c = 3;
            return 0;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            io.bidmachine.media3.common.util.a.checkState(this.f86075g != -1);
            return ((sp.b) io.bidmachine.media3.common.util.a.checkNotNull(this.f86073e)).sampleData(a0Var, this.f86075g - a0Var.getPosition()) ? -1 : 0;
        }
        Pair<Long, Long> pairSkipToSampleData = e.skipToSampleData(a0Var);
        this.f86074f = ((Long) pairSkipToSampleData.first).intValue();
        long jLongValue = ((Long) pairSkipToSampleData.second).longValue();
        long j10 = this.f86072d;
        if (j10 != -1 && jLongValue == 4294967295L) {
            jLongValue = j10;
        }
        this.f86075g = this.f86074f + jLongValue;
        long length = a0Var.getLength();
        if (length != -1 && this.f86075g > length) {
            b0.w("WavExtractor", "Data exceeds input length: " + this.f86075g + ", " + length);
            this.f86075g = length;
        }
        ((sp.b) io.bidmachine.media3.common.util.a.checkNotNull(this.f86073e)).init(this.f86074f, this.f86075g);
        this.f86071c = 4;
        return 0;
    }

    @Override // ko.z
    public void seek(long j10, long j11) {
        this.f86071c = j10 == 0 ? 0 : 4;
        sp.b bVar = this.f86073e;
        if (bVar != null) {
            bVar.reset(j11);
        }
    }

    @Override // ko.z
    public boolean sniff(a0 a0Var) throws IOException {
        return e.checkFileType(a0Var);
    }

    @Override // ko.z
    public void release() {
    }
}
