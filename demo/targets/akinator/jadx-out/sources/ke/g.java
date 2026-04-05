package ke;

import android.util.SparseArray;
import b0.e2;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.util.g0;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.p0;
import com.google.android.exoplayer2.util.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ee.f0;
import ee.l0;
import ee.p;
import ee.q;
import ee.s;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import qf.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class g implements p {

    /* renamed from: c0, reason: collision with root package name */
    public static final byte[] f70858c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: d0, reason: collision with root package name */
    public static final byte[] f70859d0 = n1.getUtf8Bytes("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: e0, reason: collision with root package name */
    public static final byte[] f70860e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: f0, reason: collision with root package name */
    public static final byte[] f70861f0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* renamed from: g0, reason: collision with root package name */
    public static final UUID f70862g0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: h0, reason: collision with root package name */
    public static final Map f70863h0;
    public long A;
    public long B;
    public g0 C;
    public g0 D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public long R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public byte Z;

    /* renamed from: a, reason: collision with root package name */
    public final b f70864a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f70865a0;

    /* renamed from: b, reason: collision with root package name */
    public final i f70866b;

    /* renamed from: b0, reason: collision with root package name */
    public s f70867b0;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f70868c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f70869d;

    /* renamed from: e, reason: collision with root package name */
    public final v0 f70870e;

    /* renamed from: f, reason: collision with root package name */
    public final v0 f70871f;

    /* renamed from: g, reason: collision with root package name */
    public final v0 f70872g;

    /* renamed from: h, reason: collision with root package name */
    public final v0 f70873h;

    /* renamed from: i, reason: collision with root package name */
    public final v0 f70874i;

    /* renamed from: j, reason: collision with root package name */
    public final v0 f70875j;

    /* renamed from: k, reason: collision with root package name */
    public final v0 f70876k;

    /* renamed from: l, reason: collision with root package name */
    public final v0 f70877l;

    /* renamed from: m, reason: collision with root package name */
    public final v0 f70878m;

    /* renamed from: n, reason: collision with root package name */
    public final v0 f70879n;

    /* renamed from: o, reason: collision with root package name */
    public ByteBuffer f70880o;

    /* renamed from: p, reason: collision with root package name */
    public long f70881p;

    /* renamed from: q, reason: collision with root package name */
    public long f70882q;

    /* renamed from: r, reason: collision with root package name */
    public long f70883r;

    /* renamed from: s, reason: collision with root package name */
    public long f70884s;

    /* renamed from: t, reason: collision with root package name */
    public long f70885t;

    /* renamed from: u, reason: collision with root package name */
    public f f70886u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f70887v;

    /* renamed from: w, reason: collision with root package name */
    public int f70888w;

    /* renamed from: x, reason: collision with root package name */
    public long f70889x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f70890y;

    /* renamed from: z, reason: collision with root package name */
    public long f70891z;

    static {
        HashMap map = new HashMap();
        e2.v(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        e2.v(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f70863h0 = Collections.unmodifiableMap(map);
    }

    public g() {
        this(0);
    }

    public static byte[] d(long j10, long j11, String str) {
        com.google.android.exoplayer2.util.a.checkArgument(j10 != C.TIME_UNSET);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (i10 * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (i11 * 60000000);
        int i12 = (int) (j13 / 1000000);
        return n1.getUtf8Bytes(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11))));
    }

    public final void a(int i10) throws h2 {
        if (this.C == null || this.D == null) {
            throw h2.createForMalformedContainer("Element " + i10 + " must be in a Cues", null);
        }
    }

    public final void b(int i10) throws h2 {
        if (this.f70886u != null) {
            return;
        }
        throw h2.createForMalformedContainer("Element " + i10 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(ke.f r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ke.g.c(ke.f, long, int, int, int):void");
    }

    public final void e(q qVar, int i10) throws IOException {
        v0 v0Var = this.f70872g;
        if (v0Var.limit() >= i10) {
            return;
        }
        if (v0Var.capacity() < i10) {
            v0Var.ensureCapacity(Math.max(v0Var.capacity() * 2, i10));
        }
        qVar.readFully(v0Var.getData(), v0Var.limit(), i10 - v0Var.limit());
        v0Var.setLimit(i10);
    }

    public final void f() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.f70865a0 = false;
        this.f70875j.reset(0);
    }

    public final long g(long j10) throws h2 {
        long j11 = this.f70883r;
        if (j11 != C.TIME_UNSET) {
            return n1.scaleLargeTimestamp(j10, j11, 1000L);
        }
        throw h2.createForMalformedContainer("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public final int h(q qVar, f fVar, int i10, boolean z10) throws IOException {
        int iSampleData;
        int iSampleData2;
        int i11;
        if ("S_TEXT/UTF8".equals(fVar.f70833b)) {
            i(qVar, f70858c0, i10);
            int i12 = this.T;
            f();
            return i12;
        }
        if ("S_TEXT/ASS".equals(fVar.f70833b)) {
            i(qVar, f70860e0, i10);
            int i13 = this.T;
            f();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(fVar.f70833b)) {
            i(qVar, f70861f0, i10);
            int i14 = this.T;
            f();
            return i14;
        }
        l0 l0Var = fVar.X;
        boolean z11 = this.V;
        v0 v0Var = this.f70875j;
        if (!z11) {
            boolean z12 = fVar.f70839h;
            v0 v0Var2 = this.f70872g;
            if (z12) {
                this.O &= -1073741825;
                if (!this.W) {
                    qVar.readFully(v0Var2.getData(), 0, 1);
                    this.S++;
                    if ((v0Var2.getData()[0] & 128) == 128) {
                        throw h2.createForMalformedContainer("Extension bit is set in signal byte", null);
                    }
                    this.Z = v0Var2.getData()[0];
                    this.W = true;
                }
                byte b10 = this.Z;
                if ((b10 & 1) == 1) {
                    boolean z13 = (b10 & 2) == 2;
                    this.O |= 1073741824;
                    if (!this.f70865a0) {
                        v0 v0Var3 = this.f70877l;
                        qVar.readFully(v0Var3.getData(), 0, 8);
                        this.S += 8;
                        this.f70865a0 = true;
                        v0Var2.getData()[0] = (byte) ((z13 ? 128 : 0) | 8);
                        v0Var2.setPosition(0);
                        l0Var.sampleData(v0Var2, 1, 1);
                        this.T++;
                        v0Var3.setPosition(0);
                        l0Var.sampleData(v0Var3, 8, 1);
                        this.T += 8;
                    }
                    if (z13) {
                        if (!this.X) {
                            qVar.readFully(v0Var2.getData(), 0, 1);
                            this.S++;
                            v0Var2.setPosition(0);
                            this.Y = v0Var2.readUnsignedByte();
                            this.X = true;
                        }
                        int i15 = this.Y * 4;
                        v0Var2.reset(i15);
                        qVar.readFully(v0Var2.getData(), 0, i15);
                        this.S += i15;
                        short s10 = (short) ((this.Y / 2) + 1);
                        int i16 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f70880o;
                        if (byteBuffer == null || byteBuffer.capacity() < i16) {
                            this.f70880o = ByteBuffer.allocate(i16);
                        }
                        this.f70880o.position(0);
                        this.f70880o.putShort(s10);
                        int i17 = 0;
                        int i18 = 0;
                        while (true) {
                            i11 = this.Y;
                            if (i17 >= i11) {
                                break;
                            }
                            int unsignedIntToInt = v0Var2.readUnsignedIntToInt();
                            if (i17 % 2 == 0) {
                                this.f70880o.putShort((short) (unsignedIntToInt - i18));
                            } else {
                                this.f70880o.putInt(unsignedIntToInt - i18);
                            }
                            i17++;
                            i18 = unsignedIntToInt;
                        }
                        int i19 = (i10 - this.S) - i18;
                        if (i11 % 2 == 1) {
                            this.f70880o.putInt(i19);
                        } else {
                            this.f70880o.putShort((short) i19);
                            this.f70880o.putInt(0);
                        }
                        byte[] bArrArray = this.f70880o.array();
                        v0 v0Var4 = this.f70878m;
                        v0Var4.reset(bArrArray, i16);
                        l0Var.sampleData(v0Var4, i16, 1);
                        this.T += i16;
                    }
                }
            } else {
                byte[] bArr = fVar.f70840i;
                if (bArr != null) {
                    v0Var.reset(bArr, bArr.length);
                }
            }
            if ("A_OPUS".equals(fVar.f70833b) ? z10 : fVar.f70837f > 0) {
                this.O |= 268435456;
                this.f70879n.reset(0);
                int iLimit = (v0Var.limit() + i10) - this.S;
                v0Var2.reset(4);
                v0Var2.getData()[0] = (byte) ((iLimit >> 24) & 255);
                v0Var2.getData()[1] = (byte) ((iLimit >> 16) & 255);
                v0Var2.getData()[2] = (byte) ((iLimit >> 8) & 255);
                v0Var2.getData()[3] = (byte) (iLimit & 255);
                l0Var.sampleData(v0Var2, 4, 2);
                this.T += 4;
            }
            this.V = true;
        }
        int iLimit2 = v0Var.limit() + i10;
        if (!"V_MPEG4/ISO/AVC".equals(fVar.f70833b) && !"V_MPEGH/ISO/HEVC".equals(fVar.f70833b)) {
            if (fVar.T != null) {
                com.google.android.exoplayer2.util.a.checkState(v0Var.limit() == 0);
                fVar.T.startSample(qVar);
            }
            while (true) {
                int i20 = this.S;
                if (i20 >= iLimit2) {
                    break;
                }
                int i21 = iLimit2 - i20;
                int iBytesLeft = v0Var.bytesLeft();
                if (iBytesLeft > 0) {
                    iSampleData2 = Math.min(i21, iBytesLeft);
                    l0Var.sampleData(v0Var, iSampleData2);
                } else {
                    iSampleData2 = l0Var.sampleData((k) qVar, i21, false);
                }
                this.S += iSampleData2;
                this.T += iSampleData2;
            }
        } else {
            v0 v0Var5 = this.f70871f;
            byte[] data = v0Var5.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i22 = fVar.Y;
            int i23 = 4 - i22;
            while (this.S < iLimit2) {
                int i24 = this.U;
                if (i24 == 0) {
                    int iMin = Math.min(i22, v0Var.bytesLeft());
                    qVar.readFully(data, i23 + iMin, i22 - iMin);
                    if (iMin > 0) {
                        v0Var.readBytes(data, i23, iMin);
                    }
                    this.S += i22;
                    v0Var5.setPosition(0);
                    this.U = v0Var5.readUnsignedIntToInt();
                    v0 v0Var6 = this.f70870e;
                    v0Var6.setPosition(0);
                    l0Var.sampleData(v0Var6, 4);
                    this.T += 4;
                } else {
                    int iBytesLeft2 = v0Var.bytesLeft();
                    if (iBytesLeft2 > 0) {
                        iSampleData = Math.min(i24, iBytesLeft2);
                        l0Var.sampleData(v0Var, iSampleData);
                    } else {
                        iSampleData = l0Var.sampleData((k) qVar, i24, false);
                    }
                    this.S += iSampleData;
                    this.T += iSampleData;
                    this.U -= iSampleData;
                }
            }
        }
        if ("A_VORBIS".equals(fVar.f70833b)) {
            v0 v0Var7 = this.f70873h;
            v0Var7.setPosition(0);
            l0Var.sampleData(v0Var7, 4);
            this.T += 4;
        }
        int i25 = this.T;
        f();
        return i25;
    }

    public final void i(q qVar, byte[] bArr, int i10) throws IOException {
        int length = bArr.length + i10;
        v0 v0Var = this.f70876k;
        if (v0Var.capacity() < length) {
            v0Var.reset(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, v0Var.getData(), 0, bArr.length);
        }
        qVar.readFully(v0Var.getData(), bArr.length, i10);
        v0Var.setPosition(0);
        v0Var.setLimit(length);
    }

    @Override // ee.p
    public final void init(s sVar) {
        this.f70867b0 = sVar;
    }

    @Override // ee.p
    public final int read(q qVar, f0 f0Var) throws IOException {
        int i10 = 0;
        this.F = false;
        boolean z10 = true;
        while (z10 && !this.F) {
            z10 = this.f70864a.read(qVar);
            if (z10) {
                long position = qVar.getPosition();
                if (this.f70890y) {
                    this.A = position;
                    f0Var.f54188a = this.f70891z;
                    this.f70890y = false;
                    return 1;
                }
                if (this.f70887v) {
                    long j10 = this.A;
                    if (j10 != -1) {
                        f0Var.f54188a = j10;
                        this.A = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            }
        }
        if (z10) {
            return 0;
        }
        while (true) {
            SparseArray sparseArray = this.f70868c;
            if (i10 >= sparseArray.size()) {
                return -1;
            }
            f fVar = (f) sparseArray.valueAt(i10);
            com.google.android.exoplayer2.util.a.checkNotNull(fVar.X);
            fVar.outputPendingSampleMetadata();
            i10++;
        }
    }

    @Override // ee.p
    public void seek(long j10, long j11) {
        this.B = C.TIME_UNSET;
        int i10 = 0;
        this.G = 0;
        this.f70864a.reset();
        this.f70866b.reset();
        f();
        while (true) {
            SparseArray sparseArray = this.f70868c;
            if (i10 >= sparseArray.size()) {
                return;
            }
            ((f) sparseArray.valueAt(i10)).reset();
            i10++;
        }
    }

    @Override // ee.p
    public final boolean sniff(q qVar) throws IOException {
        return new h().sniff(qVar);
    }

    public g(int i10) {
        b bVar = new b();
        this.f70882q = -1L;
        this.f70883r = C.TIME_UNSET;
        this.f70884s = C.TIME_UNSET;
        this.f70885t = C.TIME_UNSET;
        this.f70891z = -1L;
        this.A = -1L;
        this.B = C.TIME_UNSET;
        this.f70864a = bVar;
        bVar.init(new e(this));
        this.f70869d = (i10 & 1) == 0;
        this.f70866b = new i();
        this.f70868c = new SparseArray();
        this.f70872g = new v0(4);
        this.f70873h = new v0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f70874i = new v0(4);
        this.f70870e = new v0(p0.f28540a);
        this.f70871f = new v0(4);
        this.f70875j = new v0();
        this.f70876k = new v0();
        this.f70877l = new v0(8);
        this.f70878m = new v0();
        this.f70879n = new v0();
        this.L = new int[1];
    }

    @Override // ee.p
    public final void release() {
    }
}
