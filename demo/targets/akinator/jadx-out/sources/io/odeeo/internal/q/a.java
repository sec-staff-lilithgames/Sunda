package io.odeeo.internal.q;

import android.util.Pair;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.ads.beta.xyn.RnJusJ;
import com.vungle.ads.internal.protos.Sdk;
import io.odeeo.internal.b.g0;
import io.odeeo.internal.b.t;
import io.odeeo.internal.d.y;
import io.odeeo.internal.g.h;
import io.odeeo.internal.g.i;
import io.odeeo.internal.g.j;
import io.odeeo.internal.g.l;
import io.odeeo.internal.g.u;
import io.odeeo.internal.g.x;
import io.odeeo.internal.p0.g;
import io.odeeo.internal.q0.p;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a implements h {

    /* renamed from: h, reason: collision with root package name */
    public static final l f65789h = new bt.a(0);

    /* renamed from: a, reason: collision with root package name */
    public j f65790a;

    /* renamed from: b, reason: collision with root package name */
    public x f65791b;

    /* renamed from: e, reason: collision with root package name */
    public b f65794e;

    /* renamed from: c, reason: collision with root package name */
    public int f65792c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f65793d = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f65795f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f65796g = -1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.q.a$a, reason: collision with other inner class name */
    public static final class C0637a implements b {

        /* renamed from: m, reason: collision with root package name */
        public static final int[] f65797m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n, reason: collision with root package name */
        public static final int[] f65798n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a, reason: collision with root package name */
        public final j f65799a;

        /* renamed from: b, reason: collision with root package name */
        public final x f65800b;

        /* renamed from: c, reason: collision with root package name */
        public final io.odeeo.internal.q.b f65801c;

        /* renamed from: d, reason: collision with root package name */
        public final int f65802d;

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f65803e;

        /* renamed from: f, reason: collision with root package name */
        public final io.odeeo.internal.q0.x f65804f;

        /* renamed from: g, reason: collision with root package name */
        public final int f65805g;

        /* renamed from: h, reason: collision with root package name */
        public final t f65806h;

        /* renamed from: i, reason: collision with root package name */
        public int f65807i;

        /* renamed from: j, reason: collision with root package name */
        public long f65808j;

        /* renamed from: k, reason: collision with root package name */
        public int f65809k;

        /* renamed from: l, reason: collision with root package name */
        public long f65810l;

        public C0637a(j jVar, x xVar, io.odeeo.internal.q.b bVar) throws g0 {
            this.f65799a = jVar;
            this.f65800b = xVar;
            this.f65801c = bVar;
            int iMax = Math.max(1, bVar.f65821c / 10);
            this.f65805g = iMax;
            io.odeeo.internal.q0.x xVar2 = new io.odeeo.internal.q0.x(bVar.f65825g);
            xVar2.readLittleEndianUnsignedShort();
            int littleEndianUnsignedShort = xVar2.readLittleEndianUnsignedShort();
            this.f65802d = littleEndianUnsignedShort;
            int i10 = bVar.f65820b;
            int i11 = (((bVar.f65823e - (i10 * 4)) * 8) / (bVar.f65824f * i10)) + 1;
            if (littleEndianUnsignedShort != i11) {
                throw g0.createForMalformedContainer("Expected frames per block: " + i11 + "; got: " + littleEndianUnsignedShort, null);
            }
            int iCeilDivide = io.odeeo.internal.q0.g0.ceilDivide(iMax, littleEndianUnsignedShort);
            this.f65803e = new byte[bVar.f65823e * iCeilDivide];
            this.f65804f = new io.odeeo.internal.q0.x(a(littleEndianUnsignedShort, i10) * iCeilDivide);
            int i12 = ((bVar.f65821c * bVar.f65823e) * 8) / littleEndianUnsignedShort;
            this.f65806h = new t.b().setSampleMimeType(MimeTypes.AUDIO_RAW).setAverageBitrate(i12).setPeakBitrate(i12).setMaxInputSize(a(iMax, i10)).setChannelCount(bVar.f65820b).setSampleRate(bVar.f65821c).setPcmEncoding(2).build();
        }

        public static int a(int i10, int i11) {
            return i10 * 2 * i11;
        }

        public final int b(int i10) {
            return a(i10, this.f65801c.f65820b);
        }

        public final void c(int i10) {
            long jScaleLargeTimestamp = this.f65808j + io.odeeo.internal.q0.g0.scaleLargeTimestamp(this.f65810l, 1000000L, this.f65801c.f65821c);
            int iB = b(i10);
            this.f65800b.sampleMetadata(jScaleLargeTimestamp, 1, iB, this.f65809k - iB, null);
            this.f65810l += i10;
            this.f65809k -= iB;
        }

        @Override // io.odeeo.internal.q.a.b
        public void init(int i10, long j10) {
            this.f65799a.seekMap(new d(this.f65801c, this.f65802d, i10, j10));
            this.f65800b.format(this.f65806h);
        }

        @Override // io.odeeo.internal.q.a.b
        public void reset(long j10) {
            this.f65807i = 0;
            this.f65808j = j10;
            this.f65809k = 0;
            this.f65810l = 0L;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x001c, code lost:
        
            r1 = true;
         */
        @Override // io.odeeo.internal.q.a.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean sampleData(io.odeeo.internal.g.i r6, long r7) throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f65805g
                int r1 = r5.f65809k
                int r1 = r5.a(r1)
                int r0 = r0 - r1
                int r1 = r5.f65802d
                int r0 = io.odeeo.internal.q0.g0.ceilDivide(r0, r1)
                io.odeeo.internal.q.b r1 = r5.f65801c
                int r1 = r1.f65823e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r1 != 0) goto L1b
                goto L35
            L1b:
                r1 = 0
            L1c:
                if (r1 != 0) goto L3d
                int r2 = r5.f65807i
                if (r2 >= r0) goto L3d
                int r2 = r0 - r2
                long r2 = (long) r2
                long r2 = java.lang.Math.min(r2, r7)
                int r2 = (int) r2
                byte[] r3 = r5.f65803e
                int r4 = r5.f65807i
                int r2 = r6.read(r3, r4, r2)
                r3 = -1
                if (r2 != r3) goto L37
            L35:
                r1 = 1
                goto L1c
            L37:
                int r3 = r5.f65807i
                int r3 = r3 + r2
                r5.f65807i = r3
                goto L1c
            L3d:
                int r6 = r5.f65807i
                io.odeeo.internal.q.b r7 = r5.f65801c
                int r7 = r7.f65823e
                int r6 = r6 / r7
                if (r6 <= 0) goto L74
                byte[] r7 = r5.f65803e
                io.odeeo.internal.q0.x r8 = r5.f65804f
                r5.a(r7, r6, r8)
                int r7 = r5.f65807i
                io.odeeo.internal.q.b r8 = r5.f65801c
                int r8 = r8.f65823e
                int r6 = r6 * r8
                int r7 = r7 - r6
                r5.f65807i = r7
                io.odeeo.internal.q0.x r6 = r5.f65804f
                int r6 = r6.limit()
                io.odeeo.internal.g.x r7 = r5.f65800b
                io.odeeo.internal.q0.x r8 = r5.f65804f
                r7.sampleData(r8, r6)
                int r7 = r5.f65809k
                int r7 = r7 + r6
                r5.f65809k = r7
                int r6 = r5.a(r7)
                int r7 = r5.f65805g
                if (r6 < r7) goto L74
                r5.c(r7)
            L74:
                if (r1 == 0) goto L81
                int r6 = r5.f65809k
                int r6 = r5.a(r6)
                if (r6 <= 0) goto L81
                r5.c(r6)
            L81:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.q.a.C0637a.sampleData(io.odeeo.internal.g.i, long):boolean");
        }

        public final void a(byte[] bArr, int i10, io.odeeo.internal.q0.x xVar) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f65801c.f65820b; i12++) {
                    a(bArr, i11, i12, xVar.getData());
                }
            }
            int iB = b(this.f65802d * i10);
            xVar.setPosition(0);
            xVar.setLimit(iB);
        }

        public final void a(byte[] bArr, int i10, int i11, byte[] bArr2) {
            io.odeeo.internal.q.b bVar = this.f65801c;
            int i12 = bVar.f65823e;
            int i13 = bVar.f65820b;
            int i14 = (i11 * 4) + (i10 * i12);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int iConstrainValue = (short) (((bArr[i14 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
            int iMin = Math.min(bArr[i14 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, 88);
            int i17 = f65798n[iMin];
            int i18 = ((i10 * this.f65802d * i13) + i11) * 2;
            bArr2[i18] = (byte) (iConstrainValue & 255);
            bArr2[i18 + 1] = (byte) (iConstrainValue >> 8);
            for (int i19 = 0; i19 < i16 * 2; i19++) {
                byte b10 = bArr[((i19 / 8) * i13 * 4) + i15 + ((i19 / 2) % 4)];
                int i20 = i19 % 2 == 0 ? b10 & 15 : (b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4;
                int iB = o2.B(i20 & 7, 2, 1, i17) >> 3;
                if ((i20 & 8) != 0) {
                    iB = -iB;
                }
                iConstrainValue = io.odeeo.internal.q0.g0.constrainValue(iConstrainValue + iB, -32768, 32767);
                i18 += i13 * 2;
                bArr2[i18] = (byte) (iConstrainValue & 255);
                bArr2[i18 + 1] = (byte) (iConstrainValue >> 8);
                int i21 = iMin + f65797m[i20];
                int[] iArr = f65798n;
                iMin = io.odeeo.internal.q0.g0.constrainValue(i21, 0, iArr.length - 1);
                i17 = iArr[iMin];
            }
        }

        public final int a(int i10) {
            return i10 / (this.f65801c.f65820b * 2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {
        void init(int i10, long j10) throws g0;

        void reset(long j10);

        boolean sampleData(i iVar, long j10) throws IOException;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final j f65811a;

        /* renamed from: b, reason: collision with root package name */
        public final x f65812b;

        /* renamed from: c, reason: collision with root package name */
        public final io.odeeo.internal.q.b f65813c;

        /* renamed from: d, reason: collision with root package name */
        public final t f65814d;

        /* renamed from: e, reason: collision with root package name */
        public final int f65815e;

        /* renamed from: f, reason: collision with root package name */
        public long f65816f;

        /* renamed from: g, reason: collision with root package name */
        public int f65817g;

        /* renamed from: h, reason: collision with root package name */
        public long f65818h;

        public c(j jVar, x xVar, io.odeeo.internal.q.b bVar, String str, int i10) throws g0 {
            this.f65811a = jVar;
            this.f65812b = xVar;
            this.f65813c = bVar;
            int i11 = (bVar.f65820b * bVar.f65824f) / 8;
            if (bVar.f65823e != i11) {
                StringBuilder sbT = o2.t(i11, "Expected block size: ", "; got: ");
                sbT.append(bVar.f65823e);
                throw g0.createForMalformedContainer(sbT.toString(), null);
            }
            int i12 = bVar.f65821c * i11;
            int i13 = i12 * 8;
            int iMax = Math.max(i11, i12 / 10);
            this.f65815e = iMax;
            this.f65814d = new t.b().setSampleMimeType(str).setAverageBitrate(i13).setPeakBitrate(i13).setMaxInputSize(iMax).setChannelCount(bVar.f65820b).setSampleRate(bVar.f65821c).setPcmEncoding(i10).build();
        }

        @Override // io.odeeo.internal.q.a.b
        public void init(int i10, long j10) {
            this.f65811a.seekMap(new d(this.f65813c, 1, i10, j10));
            this.f65812b.format(this.f65814d);
        }

        @Override // io.odeeo.internal.q.a.b
        public void reset(long j10) {
            this.f65816f = j10;
            this.f65817g = 0;
            this.f65818h = 0L;
        }

        @Override // io.odeeo.internal.q.a.b
        public boolean sampleData(i iVar, long j10) throws IOException {
            int i10;
            int i11;
            long j11 = j10;
            while (j11 > 0 && (i10 = this.f65817g) < (i11 = this.f65815e)) {
                int iSampleData = this.f65812b.sampleData((g) iVar, (int) Math.min(i11 - i10, j11), true);
                if (iSampleData == -1) {
                    j11 = 0;
                } else {
                    this.f65817g += iSampleData;
                    j11 -= iSampleData;
                }
            }
            int i12 = this.f65813c.f65823e;
            int i13 = this.f65817g / i12;
            if (i13 > 0) {
                long jScaleLargeTimestamp = this.f65816f + io.odeeo.internal.q0.g0.scaleLargeTimestamp(this.f65818h, 1000000L, r1.f65821c);
                int i14 = i13 * i12;
                int i15 = this.f65817g - i14;
                this.f65812b.sampleMetadata(jScaleLargeTimestamp, 1, i14, i15, null);
                this.f65818h += i13;
                this.f65817g = i15;
            }
            return j11 <= 0;
        }
    }

    public static /* synthetic */ h[] b() {
        return new h[]{new a()};
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    public final void a() {
        io.odeeo.internal.q0.a.checkStateNotNull(this.f65791b);
        io.odeeo.internal.q0.g0.castNonNull(this.f65790a);
    }

    public final void c(i iVar) throws IOException {
        this.f65793d = io.odeeo.internal.q.c.readRf64SampleDataSize(iVar);
        this.f65792c = 2;
    }

    public final int d(i iVar) throws IOException {
        io.odeeo.internal.q0.a.checkState(this.f65796g != -1);
        return ((b) io.odeeo.internal.q0.a.checkNotNull(this.f65794e)).sampleData(iVar, this.f65796g - iVar.getPosition()) ? -1 : 0;
    }

    public final void e(i iVar) throws IOException {
        Pair<Long, Long> pairSkipToSampleData = io.odeeo.internal.q.c.skipToSampleData(iVar);
        this.f65795f = ((Long) pairSkipToSampleData.first).intValue();
        long jLongValue = ((Long) pairSkipToSampleData.second).longValue();
        long j10 = this.f65793d;
        if (j10 != -1 && jLongValue == 4294967295L) {
            jLongValue = j10;
        }
        this.f65796g = this.f65795f + jLongValue;
        long length = iVar.getLength();
        if (length != -1 && this.f65796g > length) {
            p.w("WavExtractor", "Data exceeds input length: " + this.f65796g + ", " + length);
            this.f65796g = length;
        }
        ((b) io.odeeo.internal.q0.a.checkNotNull(this.f65794e)).init(this.f65795f, this.f65796g);
        this.f65792c = 4;
    }

    @Override // io.odeeo.internal.g.h
    public void init(j jVar) {
        this.f65790a = jVar;
        this.f65791b = jVar.track(0, 1);
        jVar.endTracks();
    }

    @Override // io.odeeo.internal.g.h
    public int read(i iVar, u uVar) throws IOException {
        a();
        int i10 = this.f65792c;
        if (i10 == 0) {
            a(iVar);
            return 0;
        }
        if (i10 == 1) {
            c(iVar);
            return 0;
        }
        if (i10 == 2) {
            b(iVar);
            return 0;
        }
        if (i10 == 3) {
            e(iVar);
            return 0;
        }
        if (i10 == 4) {
            return d(iVar);
        }
        throw new IllegalStateException();
    }

    @Override // io.odeeo.internal.g.h
    public void release() {
    }

    @Override // io.odeeo.internal.g.h
    public void seek(long j10, long j11) {
        this.f65792c = j10 == 0 ? 0 : 4;
        b bVar = this.f65794e;
        if (bVar != null) {
            bVar.reset(j11);
        }
    }

    @Override // io.odeeo.internal.g.h
    public boolean sniff(i iVar) throws IOException {
        return io.odeeo.internal.q.c.checkFileType(iVar);
    }

    @RequiresNonNull({"extractorOutput", "trackOutput"})
    public final void b(i iVar) throws IOException {
        io.odeeo.internal.q.b format = io.odeeo.internal.q.c.readFormat(iVar);
        int i10 = format.f65819a;
        if (i10 == 17) {
            this.f65794e = new C0637a(this.f65790a, this.f65791b, format);
        } else if (i10 == 6) {
            this.f65794e = new c(this.f65790a, this.f65791b, format, MimeTypes.AUDIO_ALAW, -1);
        } else if (i10 == 7) {
            this.f65794e = new c(this.f65790a, this.f65791b, format, MimeTypes.AUDIO_MLAW, -1);
        } else {
            int pcmEncodingForType = y.getPcmEncodingForType(i10, format.f65824f);
            if (pcmEncodingForType == 0) {
                throw g0.createForUnsupportedContainerFeature(RnJusJ.XiNXcZ + format.f65819a);
            }
            this.f65794e = new c(this.f65790a, this.f65791b, format, MimeTypes.AUDIO_RAW, pcmEncodingForType);
        }
        this.f65792c = 3;
    }

    public final void a(i iVar) throws IOException {
        io.odeeo.internal.q0.a.checkState(iVar.getPosition() == 0);
        int i10 = this.f65795f;
        if (i10 != -1) {
            iVar.skipFully(i10);
            this.f65792c = 4;
        } else {
            if (io.odeeo.internal.q.c.checkFileType(iVar)) {
                iVar.skipFully((int) (iVar.getPeekPosition() - iVar.getPosition()));
                this.f65792c = 1;
                return;
            }
            throw g0.createForMalformedContainer("Unsupported or unrecognized wav file type.", null);
        }
    }
}
