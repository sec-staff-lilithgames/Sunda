package cp;

import android.util.SparseArray;
import ao.kwoC.zAQQWzBxnS;
import b0.e2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.o;
import gn.z0;
import hp.q;
import hp.t;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.c0;
import io.bidmachine.media3.common.util.m0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import jn.u;
import ko.a0;
import ko.e0;
import ko.e1;
import ko.v0;
import ko.z;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class h implements z {

    /* renamed from: f0, reason: collision with root package name */
    public static final byte[] f50827f0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: g0, reason: collision with root package name */
    public static final byte[] f50828g0 = a1.getUtf8Bytes("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: h0, reason: collision with root package name */
    public static final byte[] f50829h0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: i0, reason: collision with root package name */
    public static final byte[] f50830i0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* renamed from: j0, reason: collision with root package name */
    public static final UUID f50831j0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: k0, reason: collision with root package name */
    public static final Map f50832k0;
    public long A;
    public boolean B;
    public long C;
    public long D;
    public long E;
    public c0 F;
    public c0 G;
    public boolean H;
    public boolean I;
    public int J;
    public long K;
    public long L;
    public int M;
    public int N;
    public int[] O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public long U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public final b f50833a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f50834a0;

    /* renamed from: b, reason: collision with root package name */
    public final j f50835b;

    /* renamed from: b0, reason: collision with root package name */
    public int f50836b0;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f50837c;

    /* renamed from: c0, reason: collision with root package name */
    public byte f50838c0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f50839d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f50840d0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f50841e;

    /* renamed from: e0, reason: collision with root package name */
    public ko.c0 f50842e0;

    /* renamed from: f, reason: collision with root package name */
    public final q f50843f;

    /* renamed from: g, reason: collision with root package name */
    public final m0 f50844g;

    /* renamed from: h, reason: collision with root package name */
    public final m0 f50845h;

    /* renamed from: i, reason: collision with root package name */
    public final m0 f50846i;

    /* renamed from: j, reason: collision with root package name */
    public final m0 f50847j;

    /* renamed from: k, reason: collision with root package name */
    public final m0 f50848k;

    /* renamed from: l, reason: collision with root package name */
    public final m0 f50849l;

    /* renamed from: m, reason: collision with root package name */
    public final m0 f50850m;

    /* renamed from: n, reason: collision with root package name */
    public final m0 f50851n;

    /* renamed from: o, reason: collision with root package name */
    public final m0 f50852o;

    /* renamed from: p, reason: collision with root package name */
    public final m0 f50853p;

    /* renamed from: q, reason: collision with root package name */
    public ByteBuffer f50854q;

    /* renamed from: r, reason: collision with root package name */
    public long f50855r;

    /* renamed from: s, reason: collision with root package name */
    public long f50856s;

    /* renamed from: t, reason: collision with root package name */
    public long f50857t;

    /* renamed from: u, reason: collision with root package name */
    public long f50858u;

    /* renamed from: v, reason: collision with root package name */
    public long f50859v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f50860w;

    /* renamed from: x, reason: collision with root package name */
    public g f50861x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f50862y;

    /* renamed from: z, reason: collision with root package name */
    public int f50863z;

    @Deprecated
    public h() {
        this(new b(), 2, q.f59124a);
    }

    public static byte[] d(long j10, long j11, String str) {
        io.bidmachine.media3.common.util.a.checkArgument(j10 != C.TIME_UNSET);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (i10 * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (i11 * 60000000);
        int i12 = (int) (j13 / 1000000);
        return a1.getUtf8Bytes(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11))));
    }

    public static e0 newFactory(q qVar) {
        return new e(qVar, 0);
    }

    public final void a(int i10) throws z0 {
        if (this.F == null || this.G == null) {
            throw z0.createForMalformedContainer("Element " + i10 + " must be in a Cues", null);
        }
    }

    public final void b(int i10) throws z0 {
        if (this.f50861x != null) {
            return;
        }
        throw z0.createForMalformedContainer("Element " + i10 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(cp.g r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cp.h.c(cp.g, long, int, int, int):void");
    }

    public final void e(a0 a0Var, int i10) throws IOException {
        m0 m0Var = this.f50846i;
        if (m0Var.limit() >= i10) {
            return;
        }
        if (m0Var.capacity() < i10) {
            m0Var.ensureCapacity(Math.max(m0Var.capacity() * 2, i10));
        }
        a0Var.readFully(m0Var.getData(), m0Var.limit(), i10 - m0Var.limit());
        m0Var.setLimit(i10);
    }

    public final void f() {
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = false;
        this.Z = false;
        this.f50834a0 = false;
        this.f50836b0 = 0;
        this.f50838c0 = (byte) 0;
        this.f50840d0 = false;
        this.f50849l.reset(0);
    }

    public final long g(long j10) throws z0 {
        long j11 = this.f50857t;
        if (j11 != C.TIME_UNSET) {
            return a1.scaleLargeTimestamp(j10, j11, 1000L);
        }
        throw z0.createForMalformedContainer("Can't scale timecode prior to timecodeScale being set.", null);
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

    public final int h(a0 a0Var, g gVar, int i10, boolean z10) throws IOException {
        int iSampleData;
        int iSampleData2;
        int i11;
        if ("S_TEXT/UTF8".equals(gVar.f50803c)) {
            i(a0Var, f50827f0, i10);
            int i12 = this.W;
            f();
            return i12;
        }
        if ("S_TEXT/ASS".equals(gVar.f50803c)) {
            i(a0Var, f50829h0, i10);
            int i13 = this.W;
            f();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(gVar.f50803c)) {
            i(a0Var, f50830i0, i10);
            int i14 = this.W;
            f();
            return i14;
        }
        e1 e1Var = gVar.Z;
        boolean z11 = this.Y;
        m0 m0Var = this.f50849l;
        if (!z11) {
            boolean z12 = gVar.f50809i;
            m0 m0Var2 = this.f50846i;
            if (z12) {
                this.R &= -1073741825;
                if (!this.Z) {
                    a0Var.readFully(m0Var2.getData(), 0, 1);
                    this.V++;
                    if ((m0Var2.getData()[0] & 128) == 128) {
                        throw z0.createForMalformedContainer("Extension bit is set in signal byte", null);
                    }
                    this.f50838c0 = m0Var2.getData()[0];
                    this.Z = true;
                }
                byte b10 = this.f50838c0;
                if ((b10 & 1) == 1) {
                    boolean z13 = (b10 & 2) == 2;
                    this.R |= 1073741824;
                    if (!this.f50840d0) {
                        m0 m0Var3 = this.f50851n;
                        a0Var.readFully(m0Var3.getData(), 0, 8);
                        this.V += 8;
                        this.f50840d0 = true;
                        m0Var2.getData()[0] = (byte) ((z13 ? 128 : 0) | 8);
                        m0Var2.setPosition(0);
                        e1Var.sampleData(m0Var2, 1, 1);
                        this.W++;
                        m0Var3.setPosition(0);
                        e1Var.sampleData(m0Var3, 8, 1);
                        this.W += 8;
                    }
                    if (z13) {
                        if (!this.f50834a0) {
                            a0Var.readFully(m0Var2.getData(), 0, 1);
                            this.V++;
                            m0Var2.setPosition(0);
                            this.f50836b0 = m0Var2.readUnsignedByte();
                            this.f50834a0 = true;
                        }
                        int i15 = this.f50836b0 * 4;
                        m0Var2.reset(i15);
                        a0Var.readFully(m0Var2.getData(), 0, i15);
                        this.V += i15;
                        short s10 = (short) ((this.f50836b0 / 2) + 1);
                        int i16 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f50854q;
                        if (byteBuffer == null || byteBuffer.capacity() < i16) {
                            this.f50854q = ByteBuffer.allocate(i16);
                        }
                        this.f50854q.position(0);
                        this.f50854q.putShort(s10);
                        int i17 = 0;
                        int i18 = 0;
                        while (true) {
                            i11 = this.f50836b0;
                            if (i17 >= i11) {
                                break;
                            }
                            int unsignedIntToInt = m0Var2.readUnsignedIntToInt();
                            if (i17 % 2 == 0) {
                                this.f50854q.putShort((short) (unsignedIntToInt - i18));
                            } else {
                                this.f50854q.putInt(unsignedIntToInt - i18);
                            }
                            i17++;
                            i18 = unsignedIntToInt;
                        }
                        int i19 = (i10 - this.V) - i18;
                        if (i11 % 2 == 1) {
                            this.f50854q.putInt(i19);
                        } else {
                            this.f50854q.putShort((short) i19);
                            this.f50854q.putInt(0);
                        }
                        byte[] bArrArray = this.f50854q.array();
                        m0 m0Var4 = this.f50852o;
                        m0Var4.reset(bArrArray, i16);
                        e1Var.sampleData(m0Var4, i16, 1);
                        this.W += i16;
                    }
                }
            } else {
                byte[] bArr = gVar.f50810j;
                if (bArr != null) {
                    m0Var.reset(bArr, bArr.length);
                }
            }
            if ("A_OPUS".equals(gVar.f50803c) ? z10 : gVar.f50807g > 0) {
                this.R |= 268435456;
                this.f50853p.reset(0);
                int iLimit = (m0Var.limit() + i10) - this.V;
                m0Var2.reset(4);
                m0Var2.getData()[0] = (byte) ((iLimit >> 24) & 255);
                m0Var2.getData()[1] = (byte) ((iLimit >> 16) & 255);
                m0Var2.getData()[2] = (byte) ((iLimit >> 8) & 255);
                m0Var2.getData()[3] = (byte) (iLimit & 255);
                e1Var.sampleData(m0Var2, 4, 2);
                this.W += 4;
            }
            this.Y = true;
        }
        int iLimit2 = m0Var.limit() + i10;
        if (!"V_MPEG4/ISO/AVC".equals(gVar.f50803c) && !"V_MPEGH/ISO/HEVC".equals(gVar.f50803c)) {
            if (gVar.V != null) {
                io.bidmachine.media3.common.util.a.checkState(m0Var.limit() == 0);
                gVar.V.startSample(a0Var);
            }
            while (true) {
                int i20 = this.V;
                if (i20 >= iLimit2) {
                    break;
                }
                int i21 = iLimit2 - i20;
                int iBytesLeft = m0Var.bytesLeft();
                if (iBytesLeft > 0) {
                    iSampleData2 = Math.min(i21, iBytesLeft);
                    e1Var.sampleData(m0Var, iSampleData2);
                } else {
                    iSampleData2 = e1Var.sampleData((o) a0Var, i21, false);
                }
                this.V += iSampleData2;
                this.W += iSampleData2;
            }
        } else {
            m0 m0Var5 = this.f50845h;
            byte[] data = m0Var5.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i22 = gVar.f50801a0;
            int i23 = 4 - i22;
            while (this.V < iLimit2) {
                int i24 = this.X;
                if (i24 == 0) {
                    int iMin = Math.min(i22, m0Var.bytesLeft());
                    a0Var.readFully(data, i23 + iMin, i22 - iMin);
                    if (iMin > 0) {
                        m0Var.readBytes(data, i23, iMin);
                    }
                    this.V += i22;
                    m0Var5.setPosition(0);
                    this.X = m0Var5.readUnsignedIntToInt();
                    m0 m0Var6 = this.f50844g;
                    m0Var6.setPosition(0);
                    e1Var.sampleData(m0Var6, 4);
                    this.W += 4;
                } else {
                    int iBytesLeft2 = m0Var.bytesLeft();
                    if (iBytesLeft2 > 0) {
                        iSampleData = Math.min(i24, iBytesLeft2);
                        e1Var.sampleData(m0Var, iSampleData);
                    } else {
                        iSampleData = e1Var.sampleData((o) a0Var, i24, false);
                    }
                    this.V += iSampleData;
                    this.W += iSampleData;
                    this.X -= iSampleData;
                }
            }
        }
        if ("A_VORBIS".equals(gVar.f50803c)) {
            m0 m0Var7 = this.f50847j;
            m0Var7.setPosition(0);
            e1Var.sampleData(m0Var7, 4);
            this.W += 4;
        }
        int i25 = this.W;
        f();
        return i25;
    }

    public final void i(a0 a0Var, byte[] bArr, int i10) throws IOException {
        int length = bArr.length + i10;
        m0 m0Var = this.f50850m;
        if (m0Var.capacity() < length) {
            m0Var.reset(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, m0Var.getData(), 0, bArr.length);
        }
        a0Var.readFully(m0Var.getData(), bArr.length, i10);
        m0Var.setPosition(0);
        m0Var.setLimit(length);
    }

    @Override // ko.z
    public final void init(ko.c0 c0Var) {
        if (this.f50841e) {
            c0Var = new t(c0Var, this.f50843f);
        }
        this.f50842e0 = c0Var;
    }

    @Override // ko.z
    public final int read(a0 a0Var, v0 v0Var) throws IOException {
        int i10 = 0;
        this.I = false;
        boolean z10 = true;
        while (z10 && !this.I) {
            z10 = this.f50833a.read(a0Var);
            if (z10) {
                long position = a0Var.getPosition();
                if (this.B) {
                    this.D = position;
                    v0Var.f71790a = this.C;
                    this.B = false;
                    return 1;
                }
                if (this.f50862y) {
                    long j10 = this.D;
                    if (j10 != -1) {
                        v0Var.f71790a = j10;
                        this.D = -1L;
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
            SparseArray sparseArray = this.f50837c;
            if (i10 >= sparseArray.size()) {
                return -1;
            }
            g gVar = (g) sparseArray.valueAt(i10);
            io.bidmachine.media3.common.util.a.checkNotNull(gVar.Z);
            gVar.outputPendingSampleMetadata();
            i10++;
        }
    }

    @Override // ko.z
    public final void release() {
    }

    @Override // ko.z
    public void seek(long j10, long j11) {
        this.E = C.TIME_UNSET;
        int i10 = 0;
        this.J = 0;
        this.f50833a.reset();
        this.f50835b.reset();
        f();
        while (true) {
            SparseArray sparseArray = this.f50837c;
            if (i10 >= sparseArray.size()) {
                return;
            }
            ((g) sparseArray.valueAt(i10)).reset();
            i10++;
        }
    }

    @Override // ko.z
    public final boolean sniff(a0 a0Var) throws IOException {
        return new i().sniff(a0Var);
    }

    static {
        HashMap map = new HashMap();
        e2.v(0, map, zAQQWzBxnS.OAaJIMU, 90, "htc_video_rotA-090");
        e2.v(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f50832k0 = Collections.unmodifiableMap(map);
    }

    @Deprecated
    public h(int i10) {
        this(new b(), i10 | 2, q.f59124a);
    }

    public h(q qVar) {
        this(new b(), 0, qVar);
    }

    public h(q qVar, int i10) {
        this(new b(), i10, qVar);
    }

    public h(b bVar, int i10, q qVar) {
        this.f50856s = -1L;
        this.f50857t = C.TIME_UNSET;
        this.f50858u = C.TIME_UNSET;
        this.f50859v = C.TIME_UNSET;
        this.C = -1L;
        this.D = -1L;
        this.E = C.TIME_UNSET;
        this.f50833a = bVar;
        bVar.init(new f(this));
        this.f50843f = qVar;
        this.f50839d = (i10 & 1) == 0;
        this.f50841e = (i10 & 2) == 0;
        this.f50835b = new j();
        this.f50837c = new SparseArray();
        this.f50846i = new m0(4);
        this.f50847j = new m0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f50848k = new m0(4);
        this.f50844g = new m0(u.f69799a);
        this.f50845h = new m0(4);
        this.f50849l = new m0();
        this.f50850m = new m0();
        this.f50851n = new m0(8);
        this.f50852o = new m0();
        this.f50853p = new m0();
        this.O = new int[1];
    }
}
