package io.odeeo.internal.l;

import android.util.Pair;
import android.util.SparseArray;
import b0.e2;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.sfbx.appconsent.core.BuildConfig;
import io.odeeo.internal.f.e;
import io.odeeo.internal.g.h;
import io.odeeo.internal.g.i;
import io.odeeo.internal.g.j;
import io.odeeo.internal.g.l;
import io.odeeo.internal.g.u;
import io.odeeo.internal.g.v;
import io.odeeo.internal.g.x;
import io.odeeo.internal.g.y;
import io.odeeo.internal.p0.g;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.p;
import io.odeeo.internal.q0.q;
import io.odeeo.internal.q0.x;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class d implements h {

    /* renamed from: b0, reason: collision with root package name */
    public static final l f64519b0 = new bt.a(5);

    /* renamed from: c0, reason: collision with root package name */
    public static final byte[] f64520c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: d0, reason: collision with root package name */
    public static final byte[] f64521d0 = g0.getUtf8Bytes("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: e0, reason: collision with root package name */
    public static final byte[] f64522e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: f0, reason: collision with root package name */
    public static final UUID f64523f0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: g0, reason: collision with root package name */
    public static final Map<String, Integer> f64524g0;
    public long A;
    public long B;
    public q C;
    public q D;
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
    public int R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public byte Y;
    public boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.l.c f64525a;

    /* renamed from: a0, reason: collision with root package name */
    public j f64526a0;

    /* renamed from: b, reason: collision with root package name */
    public final f f64527b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray<c> f64528c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f64529d;

    /* renamed from: e, reason: collision with root package name */
    public final x f64530e;

    /* renamed from: f, reason: collision with root package name */
    public final x f64531f;

    /* renamed from: g, reason: collision with root package name */
    public final x f64532g;

    /* renamed from: h, reason: collision with root package name */
    public final x f64533h;

    /* renamed from: i, reason: collision with root package name */
    public final x f64534i;

    /* renamed from: j, reason: collision with root package name */
    public final x f64535j;

    /* renamed from: k, reason: collision with root package name */
    public final x f64536k;

    /* renamed from: l, reason: collision with root package name */
    public final x f64537l;

    /* renamed from: m, reason: collision with root package name */
    public final x f64538m;

    /* renamed from: n, reason: collision with root package name */
    public final x f64539n;

    /* renamed from: o, reason: collision with root package name */
    public ByteBuffer f64540o;

    /* renamed from: p, reason: collision with root package name */
    public long f64541p;

    /* renamed from: q, reason: collision with root package name */
    public long f64542q;

    /* renamed from: r, reason: collision with root package name */
    public long f64543r;

    /* renamed from: s, reason: collision with root package name */
    public long f64544s;

    /* renamed from: t, reason: collision with root package name */
    public long f64545t;

    /* renamed from: u, reason: collision with root package name */
    public c f64546u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f64547v;

    /* renamed from: w, reason: collision with root package name */
    public int f64548w;

    /* renamed from: x, reason: collision with root package name */
    public long f64549x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f64550y;

    /* renamed from: z, reason: collision with root package name */
    public long f64551z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b implements io.odeeo.internal.l.b {
        public b() {
        }

        @Override // io.odeeo.internal.l.b
        public void binaryElement(int i10, int i11, i iVar) throws IOException {
            d.this.a(i10, i11, iVar);
        }

        @Override // io.odeeo.internal.l.b
        public void endMasterElement(int i10) throws io.odeeo.internal.b.g0 {
            d.this.c(i10);
        }

        @Override // io.odeeo.internal.l.b
        public void floatElement(int i10, double d10) throws io.odeeo.internal.b.g0 {
            d.this.a(i10, d10);
        }

        @Override // io.odeeo.internal.l.b
        public int getElementType(int i10) {
            return d.this.e(i10);
        }

        @Override // io.odeeo.internal.l.b
        public void integerElement(int i10, long j10) throws io.odeeo.internal.b.g0 {
            d.this.a(i10, j10);
        }

        @Override // io.odeeo.internal.l.b
        public boolean isLevel1Element(int i10) {
            return d.this.f(i10);
        }

        @Override // io.odeeo.internal.l.b
        public void startMasterElement(int i10, long j10, long j11) throws io.odeeo.internal.b.g0 {
            d.this.a(i10, j10, j11);
        }

        @Override // io.odeeo.internal.l.b
        public void stringElement(int i10, String str) throws io.odeeo.internal.b.g0 {
            d.this.a(i10, str);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {
        public int A;
        public int B;
        public int C;
        public float D;
        public float E;
        public float F;
        public float G;
        public float H;
        public float I;
        public float J;
        public float K;
        public float L;
        public float M;
        public byte[] N;
        public int O;
        public int P;
        public int Q;
        public long R;
        public long S;
        public y T;
        public boolean U;
        public boolean V;
        public String W;
        public io.odeeo.internal.g.x X;
        public int Y;

        /* renamed from: a, reason: collision with root package name */
        public String f64553a;

        /* renamed from: b, reason: collision with root package name */
        public String f64554b;

        /* renamed from: c, reason: collision with root package name */
        public int f64555c;

        /* renamed from: d, reason: collision with root package name */
        public int f64556d;

        /* renamed from: e, reason: collision with root package name */
        public int f64557e;

        /* renamed from: f, reason: collision with root package name */
        public int f64558f;

        /* renamed from: g, reason: collision with root package name */
        public int f64559g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f64560h;

        /* renamed from: i, reason: collision with root package name */
        public byte[] f64561i;

        /* renamed from: j, reason: collision with root package name */
        public x.a f64562j;

        /* renamed from: k, reason: collision with root package name */
        public byte[] f64563k;

        /* renamed from: l, reason: collision with root package name */
        public io.odeeo.internal.f.e f64564l;

        /* renamed from: m, reason: collision with root package name */
        public int f64565m;

        /* renamed from: n, reason: collision with root package name */
        public int f64566n;

        /* renamed from: o, reason: collision with root package name */
        public int f64567o;

        /* renamed from: p, reason: collision with root package name */
        public int f64568p;

        /* renamed from: q, reason: collision with root package name */
        public int f64569q;

        /* renamed from: r, reason: collision with root package name */
        public int f64570r;

        /* renamed from: s, reason: collision with root package name */
        public float f64571s;

        /* renamed from: t, reason: collision with root package name */
        public float f64572t;

        /* renamed from: u, reason: collision with root package name */
        public float f64573u;

        /* renamed from: v, reason: collision with root package name */
        public byte[] f64574v;

        /* renamed from: w, reason: collision with root package name */
        public int f64575w;

        /* renamed from: x, reason: collision with root package name */
        public boolean f64576x;

        /* renamed from: y, reason: collision with root package name */
        public int f64577y;

        /* renamed from: z, reason: collision with root package name */
        public int f64578z;

        public c() {
            this.f64565m = -1;
            this.f64566n = -1;
            this.f64567o = -1;
            this.f64568p = -1;
            this.f64569q = 0;
            this.f64570r = -1;
            this.f64571s = 0.0f;
            this.f64572t = 0.0f;
            this.f64573u = 0.0f;
            this.f64574v = null;
            this.f64575w = -1;
            this.f64576x = false;
            this.f64577y = -1;
            this.f64578z = -1;
            this.A = -1;
            this.B = 1000;
            this.C = 200;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = -1.0f;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = -1.0f;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = -1.0f;
            this.O = 1;
            this.P = -1;
            this.Q = 8000;
            this.R = 0L;
            this.S = 0L;
            this.V = true;
            this.W = "eng";
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:199:0x03de  */
        /* JADX WARN: Removed duplicated region for block: B:204:0x03f3  */
        /* JADX WARN: Removed duplicated region for block: B:205:0x03f5  */
        /* JADX WARN: Removed duplicated region for block: B:208:0x0402  */
        /* JADX WARN: Removed duplicated region for block: B:209:0x0414  */
        /* JADX WARN: Removed duplicated region for block: B:256:0x04c7  */
        /* JADX WARN: Removed duplicated region for block: B:273:0x0518  */
        /* JADX WARN: Removed duplicated region for block: B:4:0x0016  */
        @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.output"})
        @org.checkerframework.checker.nullness.qual.RequiresNonNull({"codecId"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void initializeOutput(io.odeeo.internal.g.j r20, int r21) throws io.odeeo.internal.b.g0 {
            /*
                Method dump skipped, instructions count: 1576
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.l.d.c.initializeOutput(io.odeeo.internal.g.j, int):void");
        }

        @RequiresNonNull({"output"})
        public void outputPendingSampleMetadata() {
            y yVar = this.T;
            if (yVar != null) {
                yVar.outputPendingSampleMetadata(this.X, this.f64562j);
            }
        }

        public void reset() {
            y yVar = this.T;
            if (yVar != null) {
                yVar.reset();
            }
        }

        public final byte[] b() {
            if (this.D == -1.0f || this.E == -1.0f || this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f || this.M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.D * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.E * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.F * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.G * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.H * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.I * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.J * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.K * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.L + 0.5f));
            byteBufferOrder.putShort((short) (this.M + 0.5f));
            byteBufferOrder.putShort((short) this.B);
            byteBufferOrder.putShort((short) this.C);
            return bArr;
        }

        public static Pair<String, List<byte[]>> a(io.odeeo.internal.q0.x xVar) throws io.odeeo.internal.b.g0 {
            try {
                xVar.skipBytes(16);
                long littleEndianUnsignedInt = xVar.readLittleEndianUnsignedInt();
                if (littleEndianUnsignedInt == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (littleEndianUnsignedInt == 859189832) {
                    return new Pair<>(MimeTypes.VIDEO_H263, null);
                }
                if (littleEndianUnsignedInt == 826496599) {
                    byte[] data = xVar.getData();
                    for (int position = xVar.getPosition() + 20; position < data.length - 4; position++) {
                        if (data[position] == 0 && data[position + 1] == 0 && data[position + 2] == 1 && data[position + 3] == 15) {
                            return new Pair<>(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(data, position, data.length)));
                        }
                    }
                    throw io.odeeo.internal.b.g0.createForMalformedContainer("Failed to find FourCC VC1 initialization data", null);
                }
                p.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>(MimeTypes.VIDEO_UNKNOWN, null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw io.odeeo.internal.b.g0.createForMalformedContainer("Error parsing FourCC private data", null);
            }
        }

        public static List<byte[]> a(byte[] bArr) throws io.odeeo.internal.b.g0 {
            int i10;
            int i11;
            try {
                if (bArr[0] == 2) {
                    int i12 = 0;
                    int i13 = 1;
                    while (true) {
                        i10 = bArr[i13] & 255;
                        if (i10 != 255) {
                            break;
                        }
                        i12 += 255;
                        i13++;
                    }
                    int i14 = i13 + 1;
                    int i15 = i12 + i10;
                    int i16 = 0;
                    while (true) {
                        i11 = bArr[i14] & 255;
                        if (i11 != 255) {
                            break;
                        }
                        i16 += 255;
                        i14++;
                    }
                    int i17 = i14 + 1;
                    int i18 = i16 + i11;
                    if (bArr[i17] == 1) {
                        byte[] bArr2 = new byte[i15];
                        System.arraycopy(bArr, i17, bArr2, 0, i15);
                        int i19 = i17 + i15;
                        if (bArr[i19] == 3) {
                            int i20 = i19 + i18;
                            if (bArr[i20] == 5) {
                                byte[] bArr3 = new byte[bArr.length - i20];
                                System.arraycopy(bArr, i20, bArr3, 0, bArr.length - i20);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw io.odeeo.internal.b.g0.createForMalformedContainer("Error parsing vorbis codec private", null);
                        }
                        throw io.odeeo.internal.b.g0.createForMalformedContainer("Error parsing vorbis codec private", null);
                    }
                    throw io.odeeo.internal.b.g0.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                throw io.odeeo.internal.b.g0.createForMalformedContainer("Error parsing vorbis codec private", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw io.odeeo.internal.b.g0.createForMalformedContainer("Error parsing vorbis codec private", null);
            }
        }

        public static boolean b(io.odeeo.internal.q0.x xVar) throws io.odeeo.internal.b.g0 {
            try {
                int littleEndianUnsignedShort = xVar.readLittleEndianUnsignedShort();
                if (littleEndianUnsignedShort == 1) {
                    return true;
                }
                if (littleEndianUnsignedShort == 65534) {
                    xVar.setPosition(24);
                    if (xVar.readLong() == d.f64523f0.getMostSignificantBits()) {
                        if (xVar.readLong() == d.f64523f0.getLeastSignificantBits()) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw io.odeeo.internal.b.g0.createForMalformedContainer("Error parsing MS/ACM codec private", null);
            }
        }

        @EnsuresNonNull({"output"})
        public final void a() {
            io.odeeo.internal.q0.a.checkNotNull(this.X);
        }

        @EnsuresNonNull({"codecPrivate"})
        public final byte[] a(String str) throws io.odeeo.internal.b.g0 {
            byte[] bArr = this.f64563k;
            if (bArr != null) {
                return bArr;
            }
            throw io.odeeo.internal.b.g0.createForMalformedContainer("Missing CodecPrivate for codec " + str, null);
        }
    }

    static {
        HashMap map = new HashMap();
        e2.v(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        e2.v(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f64524g0 = Collections.unmodifiableMap(map);
    }

    public d() {
        this(0);
    }

    public final c d(int i10) throws io.odeeo.internal.b.g0 {
        b(i10);
        return this.f64546u;
    }

    public int e(int i10) {
        switch (i10) {
            case MRAID_JS_WRITE_FAILED_VALUE:
            case PRIVACY_URL_ERROR_VALUE:
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
            case 159:
            case 176:
            case 179:
            case 186:
            case AD_RESPONSE_EMPTY_VALUE:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    public boolean f(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    public final void g() {
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = 0;
        this.Y = (byte) 0;
        this.Z = false;
        this.f64535j.reset(0);
    }

    @Override // io.odeeo.internal.g.h
    public final void init(j jVar) {
        this.f64526a0 = jVar;
    }

    @Override // io.odeeo.internal.g.h
    public final int read(i iVar, u uVar) throws IOException {
        this.F = false;
        boolean z10 = true;
        while (z10 && !this.F) {
            z10 = this.f64525a.read(iVar);
            if (z10 && a(uVar, iVar.getPosition())) {
                return 1;
            }
        }
        if (z10) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f64528c.size(); i10++) {
            c cVarValueAt = this.f64528c.valueAt(i10);
            cVarValueAt.a();
            cVarValueAt.outputPendingSampleMetadata();
        }
        return -1;
    }

    @Override // io.odeeo.internal.g.h
    public void seek(long j10, long j11) {
        this.B = C.TIME_UNSET;
        this.G = 0;
        this.f64525a.reset();
        this.f64527b.reset();
        g();
        for (int i10 = 0; i10 < this.f64528c.size(); i10++) {
            this.f64528c.valueAt(i10).reset();
        }
    }

    @Override // io.odeeo.internal.g.h
    public final boolean sniff(i iVar) throws IOException {
        return new e().sniff(iVar);
    }

    public d(int i10) {
        this(new io.odeeo.internal.l.a(), i10);
    }

    public static /* synthetic */ h[] f() {
        return new h[]{new d()};
    }

    public void a(int i10, long j10, long j11) throws io.odeeo.internal.b.g0 {
        d();
        if (i10 == 160) {
            this.Q = false;
            return;
        }
        if (i10 == 174) {
            this.f64546u = new c();
            return;
        }
        if (i10 == 187) {
            this.E = false;
            return;
        }
        if (i10 == 19899) {
            this.f64548w = -1;
            this.f64549x = -1L;
            return;
        }
        if (i10 == 20533) {
            d(i10).f64560h = true;
            return;
        }
        if (i10 == 21968) {
            d(i10).f64576x = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.f64542q;
            if (j12 != -1 && j12 != j10) {
                throw io.odeeo.internal.b.g0.createForMalformedContainer("Multiple Segment elements not supported", null);
            }
            this.f64542q = j10;
            this.f64541p = j11;
            return;
        }
        if (i10 == 475249515) {
            this.C = new q();
            this.D = new q();
        } else if (i10 == 524531317 && !this.f64547v) {
            if (this.f64529d && this.f64551z != -1) {
                this.f64550y = true;
            } else {
                this.f64526a0.seekMap(new v.b(this.f64545t));
                this.f64547v = true;
            }
        }
    }

    @EnsuresNonNull({"currentTrack"})
    public final void b(int i10) throws io.odeeo.internal.b.g0 {
        if (this.f64546u != null) {
            return;
        }
        throw io.odeeo.internal.b.g0.createForMalformedContainer("Element " + i10 + " must be in a TrackEntry", null);
    }

    public void c(int i10) throws io.odeeo.internal.b.g0 {
        d();
        if (i10 == 160) {
            if (this.G != 2) {
                return;
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.K; i12++) {
                i11 += this.L[i12];
            }
            c cVar = this.f64528c.get(this.M);
            cVar.a();
            int i13 = 0;
            while (i13 < this.K) {
                long j10 = this.H + ((cVar.f64557e * i13) / 1000);
                int i14 = this.O;
                if (i13 == 0 && !this.Q) {
                    i14 |= 1;
                }
                int i15 = this.L[i13];
                int i16 = i11 - i15;
                a(cVar, j10, i14, i15, i16);
                i13++;
                i11 = i16;
            }
            this.G = 0;
            return;
        }
        if (i10 == 174) {
            c cVar2 = (c) io.odeeo.internal.q0.a.checkStateNotNull(this.f64546u);
            String str = cVar2.f64554b;
            if (str == null) {
                throw io.odeeo.internal.b.g0.createForMalformedContainer("CodecId is missing in TrackEntry element", null);
            }
            if (a(str)) {
                cVar2.initializeOutput(this.f64526a0, cVar2.f64555c);
                this.f64528c.put(cVar2.f64555c, cVar2);
            }
            this.f64546u = null;
            return;
        }
        if (i10 == 19899) {
            int i17 = this.f64548w;
            if (i17 != -1) {
                long j11 = this.f64549x;
                if (j11 != -1) {
                    if (i17 == 475249515) {
                        this.f64551z = j11;
                        return;
                    }
                    return;
                }
            }
            throw io.odeeo.internal.b.g0.createForMalformedContainer("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i10 == 25152) {
            b(i10);
            c cVar3 = this.f64546u;
            if (cVar3.f64560h) {
                if (cVar3.f64562j == null) {
                    throw io.odeeo.internal.b.g0.createForMalformedContainer("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                cVar3.f64564l = new io.odeeo.internal.f.e(new e.b(io.odeeo.internal.b.h.f62709a, "video/webm", this.f64546u.f64562j.f64180b));
                return;
            }
            return;
        }
        if (i10 == 28032) {
            b(i10);
            c cVar4 = this.f64546u;
            if (cVar4.f64560h && cVar4.f64561i != null) {
                throw io.odeeo.internal.b.g0.createForMalformedContainer("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i10 == 357149030) {
            if (this.f64543r == C.TIME_UNSET) {
                this.f64543r = 1000000L;
            }
            long j12 = this.f64544s;
            if (j12 != C.TIME_UNSET) {
                this.f64545t = a(j12);
                return;
            }
            return;
        }
        if (i10 == 374648427) {
            if (this.f64528c.size() == 0) {
                throw io.odeeo.internal.b.g0.createForMalformedContainer("No valid tracks were found", null);
            }
            this.f64526a0.endTracks();
        } else {
            if (i10 != 475249515) {
                return;
            }
            if (!this.f64547v) {
                this.f64526a0.seekMap(a(this.C, this.D));
                this.f64547v = true;
            }
            this.C = null;
            this.D = null;
        }
    }

    public final int e() {
        int i10 = this.S;
        g();
        return i10;
    }

    public d(io.odeeo.internal.l.c cVar, int i10) {
        this.f64542q = -1L;
        this.f64543r = C.TIME_UNSET;
        this.f64544s = C.TIME_UNSET;
        this.f64545t = C.TIME_UNSET;
        this.f64551z = -1L;
        this.A = -1L;
        this.B = C.TIME_UNSET;
        this.f64525a = cVar;
        cVar.init(new b());
        this.f64529d = (i10 & 1) == 0;
        this.f64527b = new f();
        this.f64528c = new SparseArray<>();
        this.f64532g = new io.odeeo.internal.q0.x(4);
        this.f64533h = new io.odeeo.internal.q0.x(ByteBuffer.allocate(4).putInt(-1).array());
        this.f64534i = new io.odeeo.internal.q0.x(4);
        this.f64530e = new io.odeeo.internal.q0.x(io.odeeo.internal.q0.u.f65926a);
        this.f64531f = new io.odeeo.internal.q0.x(4);
        this.f64535j = new io.odeeo.internal.q0.x();
        this.f64536k = new io.odeeo.internal.q0.x();
        this.f64537l = new io.odeeo.internal.q0.x(8);
        this.f64538m = new io.odeeo.internal.q0.x();
        this.f64539n = new io.odeeo.internal.q0.x();
        this.L = new int[1];
    }

    @EnsuresNonNull({"extractorOutput"})
    public final void d() {
        io.odeeo.internal.q0.a.checkStateNotNull(this.f64526a0);
    }

    public void a(int i10, long j10) throws io.odeeo.internal.b.g0 {
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw io.odeeo.internal.b.g0.createForMalformedContainer("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw io.odeeo.internal.b.g0.createForMalformedContainer("ContentEncodingScope " + j10 + " not supported", null);
        }
        switch (i10) {
            case MRAID_JS_WRITE_FAILED_VALUE:
                d(i10).f64556d = (int) j10;
                return;
            case PRIVACY_URL_ERROR_VALUE:
                d(i10).V = j10 == 1;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                this.I = a(j10);
                return;
            case 159:
                d(i10).O = (int) j10;
                return;
            case 176:
                d(i10).f64565m = (int) j10;
                return;
            case 179:
                a(i10);
                this.C.add(a(j10));
                return;
            case 186:
                d(i10).f64566n = (int) j10;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                d(i10).f64555c = (int) j10;
                return;
            case 231:
                this.B = a(j10);
                return;
            case 238:
                this.P = (int) j10;
                return;
            case 241:
                if (this.E) {
                    return;
                }
                a(i10);
                this.D.add(j10);
                this.E = true;
                return;
            case 251:
                this.Q = true;
                return;
            case 16871:
                d(i10).f64559g = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw io.odeeo.internal.b.g0.createForMalformedContainer("ContentCompAlgo " + j10 + " not supported", null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw io.odeeo.internal.b.g0.createForMalformedContainer("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw io.odeeo.internal.b.g0.createForMalformedContainer("EBMLReadVersion " + j10 + " not supported", null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw io.odeeo.internal.b.g0.createForMalformedContainer("ContentEncAlgo " + j10 + " not supported", null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw io.odeeo.internal.b.g0.createForMalformedContainer("AESSettingsCipherMode " + j10 + " not supported", null);
            case 21420:
                this.f64549x = j10 + this.f64542q;
                return;
            case 21432:
                int i11 = (int) j10;
                b(i10);
                if (i11 == 0) {
                    this.f64546u.f64575w = 0;
                    return;
                }
                if (i11 == 1) {
                    this.f64546u.f64575w = 2;
                    return;
                } else if (i11 == 3) {
                    this.f64546u.f64575w = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.f64546u.f64575w = 3;
                    return;
                }
            case 21680:
                d(i10).f64567o = (int) j10;
                return;
            case 21682:
                d(i10).f64569q = (int) j10;
                return;
            case 21690:
                d(i10).f64568p = (int) j10;
                return;
            case 21930:
                d(i10).U = j10 == 1;
                return;
            case 21998:
                d(i10).f64558f = (int) j10;
                return;
            case 22186:
                d(i10).R = j10;
                return;
            case 22203:
                d(i10).S = j10;
                return;
            case 25188:
                d(i10).P = (int) j10;
                return;
            case 30321:
                b(i10);
                int i12 = (int) j10;
                if (i12 == 0) {
                    this.f64546u.f64570r = 0;
                    return;
                }
                if (i12 == 1) {
                    this.f64546u.f64570r = 1;
                    return;
                } else if (i12 == 2) {
                    this.f64546u.f64570r = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f64546u.f64570r = 3;
                    return;
                }
            case 2352003:
                d(i10).f64557e = (int) j10;
                return;
            case 2807729:
                this.f64543r = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        b(i10);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            this.f64546u.A = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.f64546u.A = 1;
                            return;
                        }
                    case 21946:
                        b(i10);
                        int iIsoTransferCharacteristicsToColorTransfer = io.odeeo.internal.r0.b.isoTransferCharacteristicsToColorTransfer((int) j10);
                        if (iIsoTransferCharacteristicsToColorTransfer != -1) {
                            this.f64546u.f64578z = iIsoTransferCharacteristicsToColorTransfer;
                            return;
                        }
                        return;
                    case 21947:
                        b(i10);
                        this.f64546u.f64576x = true;
                        int iIsoColorPrimariesToColorSpace = io.odeeo.internal.r0.b.isoColorPrimariesToColorSpace((int) j10);
                        if (iIsoColorPrimariesToColorSpace != -1) {
                            this.f64546u.f64577y = iIsoColorPrimariesToColorSpace;
                            return;
                        }
                        return;
                    case 21948:
                        d(i10).B = (int) j10;
                        return;
                    case 21949:
                        d(i10).C = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // io.odeeo.internal.g.h
    public final void release() {
    }

    public void a(int i10, double d10) throws io.odeeo.internal.b.g0 {
        if (i10 == 181) {
            d(i10).Q = (int) d10;
            return;
        }
        if (i10 != 17545) {
            switch (i10) {
                case 21969:
                    d(i10).D = (float) d10;
                    break;
                case 21970:
                    d(i10).E = (float) d10;
                    break;
                case 21971:
                    d(i10).F = (float) d10;
                    break;
                case 21972:
                    d(i10).G = (float) d10;
                    break;
                case 21973:
                    d(i10).H = (float) d10;
                    break;
                case 21974:
                    d(i10).I = (float) d10;
                    break;
                case 21975:
                    d(i10).J = (float) d10;
                    break;
                case 21976:
                    d(i10).K = (float) d10;
                    break;
                case 21977:
                    d(i10).L = (float) d10;
                    break;
                case 21978:
                    d(i10).M = (float) d10;
                    break;
                default:
                    switch (i10) {
                        case 30323:
                            d(i10).f64571s = (float) d10;
                            break;
                        case 30324:
                            d(i10).f64572t = (float) d10;
                            break;
                        case 30325:
                            d(i10).f64573u = (float) d10;
                            break;
                    }
            }
            return;
        }
        this.f64544s = (long) d10;
    }

    public void a(int i10, String str) throws io.odeeo.internal.b.g0 {
        if (i10 == 134) {
            d(i10).f64554b = str;
            return;
        }
        if (i10 != 17026) {
            if (i10 == 21358) {
                d(i10).f64553a = str;
                return;
            } else {
                if (i10 != 2274716) {
                    return;
                }
                d(i10).W = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        throw io.odeeo.internal.b.g0.createForMalformedContainer("DocType " + str + " not supported", null);
    }

    public void a(int i10, int i11, i iVar) throws IOException {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j10;
        int i17;
        int i18;
        int i19;
        i iVar2 = iVar;
        int i20 = 1;
        int i21 = 0;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (this.G != 2) {
                    return;
                }
                a(this.f64528c.get(this.M), this.P, iVar2, i11);
                return;
            }
            if (i10 == 16877) {
                a(d(i10), iVar2, i11);
                return;
            }
            if (i10 == 16981) {
                b(i10);
                byte[] bArr = new byte[i11];
                this.f64546u.f64561i = bArr;
                iVar2.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr2 = new byte[i11];
                iVar2.readFully(bArr2, 0, i11);
                d(i10).f64562j = new x.a(1, bArr2, 0, 0);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(this.f64534i.getData(), (byte) 0);
                iVar2.readFully(this.f64534i.getData(), 4 - i11, i11);
                this.f64534i.setPosition(0);
                this.f64548w = (int) this.f64534i.readUnsignedInt();
                return;
            }
            if (i10 == 25506) {
                b(i10);
                byte[] bArr3 = new byte[i11];
                this.f64546u.f64563k = bArr3;
                iVar2.readFully(bArr3, 0, i11);
                return;
            }
            if (i10 == 30322) {
                b(i10);
                byte[] bArr4 = new byte[i11];
                this.f64546u.f64574v = bArr4;
                iVar2.readFully(bArr4, 0, i11);
                return;
            }
            throw io.odeeo.internal.b.g0.createForMalformedContainer("Unexpected id: " + i10, null);
        }
        int i22 = 8;
        if (this.G == 0) {
            this.M = (int) this.f64527b.readUnsignedVarint(iVar2, false, true, 8);
            this.N = this.f64527b.getLastLength();
            this.I = C.TIME_UNSET;
            this.G = 1;
            this.f64532g.reset(0);
        }
        c cVar = this.f64528c.get(this.M);
        if (cVar != null) {
            cVar.a();
            if (this.G == 1) {
                a(iVar2, 3);
                int i23 = (this.f64532g.getData()[2] & 6) >> 1;
                if (i23 == 0) {
                    this.K = 1;
                    int[] iArrA = a(this.L, 1);
                    this.L = iArrA;
                    iArrA[0] = (i11 - this.N) - 3;
                } else {
                    a(iVar2, 4);
                    int i24 = (this.f64532g.getData()[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + 1;
                    this.K = i24;
                    int[] iArrA2 = a(this.L, i24);
                    this.L = iArrA2;
                    if (i23 == 2) {
                        int i25 = (i11 - this.N) - 4;
                        int i26 = this.K;
                        Arrays.fill(iArrA2, 0, i26, i25 / i26);
                    } else {
                        if (i23 != 1) {
                            if (i23 == 3) {
                                int i27 = 0;
                                int i28 = 0;
                                int i29 = 4;
                                while (true) {
                                    int i30 = this.K - i20;
                                    if (i27 < i30) {
                                        this.L[i27] = i21;
                                        int i31 = i29 + 1;
                                        a(iVar2, i31);
                                        int i32 = i20;
                                        if (this.f64532g.getData()[i29] == 0) {
                                            throw io.odeeo.internal.b.g0.createForMalformedContainer("No valid varint length mask found", null);
                                        }
                                        int i33 = i21;
                                        while (true) {
                                            if (i33 >= i22) {
                                                i15 = i21;
                                                i16 = i22;
                                                j10 = 0;
                                                break;
                                            }
                                            i16 = i22;
                                            int i34 = i32 << (7 - i33);
                                            i15 = i21;
                                            if ((this.f64532g.getData()[i29] & i34) != 0) {
                                                i31 += i33;
                                                a(iVar2, i31);
                                                j10 = this.f64532g.getData()[i29] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED & (~i34);
                                                for (int i35 = i29 + 1; i35 < i31; i35++) {
                                                    j10 = (j10 << i16) | (this.f64532g.getData()[i35] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                                }
                                                if (i27 > 0) {
                                                    j10 -= (1 << ((i33 * 7) + 6)) - 1;
                                                }
                                            } else {
                                                i33++;
                                                iVar2 = iVar;
                                                i21 = i15;
                                                i22 = i16;
                                            }
                                        }
                                        i29 = i31;
                                        if (j10 < -2147483648L || j10 > 2147483647L) {
                                            break;
                                        }
                                        int i36 = (int) j10;
                                        int[] iArr = this.L;
                                        if (i27 != 0) {
                                            i36 += iArr[i27 - 1];
                                        }
                                        iArr[i27] = i36;
                                        i28 += i36;
                                        i27++;
                                        iVar2 = iVar;
                                        i20 = i32;
                                        i21 = i15;
                                        i22 = i16;
                                    } else {
                                        i13 = i20;
                                        i14 = i21;
                                        this.L[i30] = ((i11 - this.N) - i29) - i28;
                                        break;
                                    }
                                }
                                throw io.odeeo.internal.b.g0.createForMalformedContainer("EBML lacing sample size out of range.", null);
                            }
                            throw io.odeeo.internal.b.g0.createForMalformedContainer("Unexpected lacing value: " + i23, null);
                        }
                        int i37 = 0;
                        int i38 = 0;
                        int i39 = 4;
                        while (true) {
                            i17 = this.K - 1;
                            if (i37 >= i17) {
                                break;
                            }
                            this.L[i37] = 0;
                            while (true) {
                                i18 = i39 + 1;
                                a(iVar2, i18);
                                int i40 = this.f64532g.getData()[i39] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                int[] iArr2 = this.L;
                                i19 = iArr2[i37] + i40;
                                iArr2[i37] = i19;
                                if (i40 != 255) {
                                    break;
                                } else {
                                    i39 = i18;
                                }
                            }
                            i38 += i19;
                            i37++;
                            i39 = i18;
                        }
                        this.L[i17] = ((i11 - this.N) - i39) - i38;
                    }
                }
                i13 = 1;
                i14 = 0;
                this.H = a((this.f64532g.getData()[i14] << 8) | (this.f64532g.getData()[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) + this.B;
                this.O = (cVar.f64556d == 2 || (i10 == 163 && (this.f64532g.getData()[2] & 128) == 128)) ? i13 : i14;
                this.G = 2;
                this.J = i14;
                i12 = 163;
            } else {
                i12 = 163;
            }
            if (i10 == i12) {
                while (true) {
                    int i41 = this.J;
                    if (i41 < this.K) {
                        int iA = a(iVar, cVar, this.L[i41]);
                        c cVar2 = cVar;
                        a(cVar2, this.H + ((this.J * cVar.f64557e) / 1000), this.O, iA, 0);
                        this.J++;
                        cVar = cVar2;
                    } else {
                        this.G = 0;
                        return;
                    }
                }
            } else {
                while (true) {
                    int i42 = this.J;
                    if (i42 >= this.K) {
                        return;
                    }
                    int[] iArr3 = this.L;
                    iArr3[i42] = a(iVar, cVar, iArr3[i42]);
                    this.J++;
                }
            }
        } else {
            iVar2.skipFully(i11 - this.N);
            this.G = 0;
        }
    }

    public void a(c cVar, i iVar, int i10) throws IOException {
        if (cVar.f64559g != 1685485123 && cVar.f64559g != 1685480259) {
            iVar.skipFully(i10);
            return;
        }
        byte[] bArr = new byte[i10];
        cVar.N = bArr;
        iVar.readFully(bArr, 0, i10);
    }

    public void a(c cVar, int i10, i iVar, int i11) throws IOException {
        if (i10 == 4 && "V_VP9".equals(cVar.f64554b)) {
            this.f64539n.reset(i11);
            iVar.readFully(this.f64539n.getData(), 0, i11);
        } else {
            iVar.skipFully(i11);
        }
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    public final void a(int i10) throws io.odeeo.internal.b.g0 {
        if (this.C == null || this.D == null) {
            throw io.odeeo.internal.b.g0.createForMalformedContainer("Element " + i10 + " must be in a Cues", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af A[PHI: r2
      0x00af: PHI (r2v17 int) = (r2v16 int), (r2v18 int) binds: [B:25:0x0092, B:29:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(io.odeeo.internal.l.d.c r18, long r19, int r21, int r22, int r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            io.odeeo.internal.g.y r2 = r1.T
            r9 = 1
            if (r2 == 0) goto L1c
            r3 = r2
            io.odeeo.internal.g.x r2 = r1.X
            io.odeeo.internal.g.x$a r8 = r1.f64562j
            r5 = r21
            r6 = r22
            r7 = r23
            r1 = r3
            r3 = r19
            r1.sampleMetadata(r2, r3, r5, r6, r7, r8)
            goto Lbf
        L1c:
            java.lang.String r2 = r1.f64554b
            java.lang.String r3 = "S_TEXT/UTF8"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L30
            java.lang.String r2 = r1.f64554b
            java.lang.String r3 = "S_TEXT/ASS"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L4c
        L30:
            int r2 = r0.K
            java.lang.String r3 = "MatroskaExtractor"
            if (r2 <= r9) goto L3c
            java.lang.String r2 = "Skipping subtitle sample in laced block."
            io.odeeo.internal.q0.p.w(r3, r2)
            goto L4c
        L3c:
            long r4 = r0.I
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L4f
            java.lang.String r2 = "Skipping subtitle sample with no duration."
            io.odeeo.internal.q0.p.w(r3, r2)
        L4c:
            r2 = r22
            goto L8e
        L4f:
            java.lang.String r2 = r1.f64554b
            io.odeeo.internal.q0.x r3 = r0.f64536k
            byte[] r3 = r3.getData()
            a(r2, r4, r3)
            io.odeeo.internal.q0.x r2 = r0.f64536k
            int r2 = r2.getPosition()
        L60:
            io.odeeo.internal.q0.x r3 = r0.f64536k
            int r3 = r3.limit()
            if (r2 >= r3) goto L7b
            io.odeeo.internal.q0.x r3 = r0.f64536k
            byte[] r3 = r3.getData()
            r3 = r3[r2]
            if (r3 != 0) goto L78
            io.odeeo.internal.q0.x r3 = r0.f64536k
            r3.setLimit(r2)
            goto L7b
        L78:
            int r2 = r2 + 1
            goto L60
        L7b:
            io.odeeo.internal.g.x r2 = r1.X
            io.odeeo.internal.q0.x r3 = r0.f64536k
            int r4 = r3.limit()
            r2.sampleData(r3, r4)
            io.odeeo.internal.q0.x r2 = r0.f64536k
            int r2 = r2.limit()
            int r2 = r2 + r22
        L8e:
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r3 = r21 & r3
            if (r3 == 0) goto Laf
            int r3 = r0.K
            if (r3 <= r9) goto La0
            r3 = -268435457(0xffffffffefffffff, float:-1.5845632E29)
            r3 = r21 & r3
            r14 = r2
            r13 = r3
            goto Lb2
        La0:
            io.odeeo.internal.q0.x r3 = r0.f64539n
            int r3 = r3.limit()
            io.odeeo.internal.g.x r4 = r1.X
            io.odeeo.internal.q0.x r5 = r0.f64539n
            r6 = 2
            r4.sampleData(r5, r3, r6)
            int r2 = r2 + r3
        Laf:
            r13 = r21
            r14 = r2
        Lb2:
            io.odeeo.internal.g.x r10 = r1.X
            io.odeeo.internal.g.x$a r1 = r1.f64562j
            r11 = r19
            r15 = r23
            r16 = r1
            r10.sampleMetadata(r11, r13, r14, r15, r16)
        Lbf:
            r0.F = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.l.d.a(io.odeeo.internal.l.d$c, long, int, int, int):void");
    }

    public final void a(i iVar, int i10) throws IOException {
        if (this.f64532g.limit() >= i10) {
            return;
        }
        if (this.f64532g.capacity() < i10) {
            io.odeeo.internal.q0.x xVar = this.f64532g;
            xVar.ensureCapacity(Math.max(xVar.capacity() * 2, i10));
        }
        iVar.readFully(this.f64532g.getData(), this.f64532g.limit(), i10 - this.f64532g.limit());
        this.f64532g.setLimit(i10);
    }

    @RequiresNonNull({"#2.output"})
    public final int a(i iVar, c cVar, int i10) throws IOException {
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f64554b)) {
            a(iVar, f64520c0, i10);
            return e();
        }
        if ("S_TEXT/ASS".equals(cVar.f64554b)) {
            a(iVar, f64522e0, i10);
            return e();
        }
        io.odeeo.internal.g.x xVar = cVar.X;
        if (!this.U) {
            if (cVar.f64560h) {
                this.O &= -1073741825;
                if (!this.V) {
                    iVar.readFully(this.f64532g.getData(), 0, 1);
                    this.R++;
                    if ((this.f64532g.getData()[0] & 128) != 128) {
                        this.Y = this.f64532g.getData()[0];
                        this.V = true;
                    } else {
                        throw io.odeeo.internal.b.g0.createForMalformedContainer("Extension bit is set in signal byte", null);
                    }
                }
                byte b10 = this.Y;
                if ((b10 & 1) == 1) {
                    boolean z10 = (b10 & 2) == 2;
                    this.O |= 1073741824;
                    if (!this.Z) {
                        iVar.readFully(this.f64537l.getData(), 0, 8);
                        this.R += 8;
                        this.Z = true;
                        this.f64532g.getData()[0] = (byte) ((z10 ? 128 : 0) | 8);
                        this.f64532g.setPosition(0);
                        xVar.sampleData(this.f64532g, 1, 1);
                        this.S++;
                        this.f64537l.setPosition(0);
                        xVar.sampleData(this.f64537l, 8, 1);
                        this.S += 8;
                    }
                    if (z10) {
                        if (!this.W) {
                            iVar.readFully(this.f64532g.getData(), 0, 1);
                            this.R++;
                            this.f64532g.setPosition(0);
                            this.X = this.f64532g.readUnsignedByte();
                            this.W = true;
                        }
                        int i12 = this.X * 4;
                        this.f64532g.reset(i12);
                        iVar.readFully(this.f64532g.getData(), 0, i12);
                        this.R += i12;
                        short s10 = (short) ((this.X / 2) + 1);
                        int i13 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f64540o;
                        if (byteBuffer == null || byteBuffer.capacity() < i13) {
                            this.f64540o = ByteBuffer.allocate(i13);
                        }
                        this.f64540o.position(0);
                        this.f64540o.putShort(s10);
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            i11 = this.X;
                            if (i14 >= i11) {
                                break;
                            }
                            int unsignedIntToInt = this.f64532g.readUnsignedIntToInt();
                            if (i14 % 2 == 0) {
                                this.f64540o.putShort((short) (unsignedIntToInt - i15));
                            } else {
                                this.f64540o.putInt(unsignedIntToInt - i15);
                            }
                            i14++;
                            i15 = unsignedIntToInt;
                        }
                        int i16 = (i10 - this.R) - i15;
                        if (i11 % 2 == 1) {
                            this.f64540o.putInt(i16);
                        } else {
                            this.f64540o.putShort((short) i16);
                            this.f64540o.putInt(0);
                        }
                        this.f64538m.reset(this.f64540o.array(), i13);
                        xVar.sampleData(this.f64538m, i13, 1);
                        this.S += i13;
                    }
                }
            } else {
                byte[] bArr = cVar.f64561i;
                if (bArr != null) {
                    this.f64535j.reset(bArr, bArr.length);
                }
            }
            if (cVar.f64558f > 0) {
                this.O |= 268435456;
                this.f64539n.reset(0);
                this.f64532g.reset(4);
                this.f64532g.getData()[0] = (byte) ((i10 >> 24) & 255);
                this.f64532g.getData()[1] = (byte) ((i10 >> 16) & 255);
                this.f64532g.getData()[2] = (byte) ((i10 >> 8) & 255);
                this.f64532g.getData()[3] = (byte) (i10 & 255);
                xVar.sampleData(this.f64532g, 4, 2);
                this.S += 4;
            }
            this.U = true;
        }
        int iLimit = this.f64535j.limit() + i10;
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f64554b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f64554b)) {
            if (cVar.T != null) {
                io.odeeo.internal.q0.a.checkState(this.f64535j.limit() == 0);
                cVar.T.startSample(iVar);
            }
            while (true) {
                int i17 = this.R;
                if (i17 >= iLimit) {
                    break;
                }
                int iA = a(iVar, xVar, iLimit - i17);
                this.R += iA;
                this.S += iA;
            }
        } else {
            byte[] data = this.f64531f.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i18 = cVar.Y;
            int i19 = 4 - i18;
            while (this.R < iLimit) {
                int i20 = this.T;
                if (i20 == 0) {
                    a(iVar, data, i19, i18);
                    this.R += i18;
                    this.f64531f.setPosition(0);
                    this.T = this.f64531f.readUnsignedIntToInt();
                    this.f64530e.setPosition(0);
                    xVar.sampleData(this.f64530e, 4);
                    this.S += 4;
                } else {
                    int iA2 = a(iVar, xVar, i20);
                    this.R += iA2;
                    this.S += iA2;
                    this.T -= iA2;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f64554b)) {
            this.f64533h.setPosition(0);
            xVar.sampleData(this.f64533h, 4);
            this.S += 4;
        }
        return e();
    }

    public final void a(i iVar, byte[] bArr, int i10) throws IOException {
        int length = bArr.length + i10;
        if (this.f64536k.capacity() < length) {
            this.f64536k.reset(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f64536k.getData(), 0, bArr.length);
        }
        iVar.readFully(this.f64536k.getData(), bArr.length, i10);
        this.f64536k.setPosition(0);
        this.f64536k.setLimit(length);
    }

    public static void a(String str, long j10, byte[] bArr) {
        byte[] bArrA;
        int i10;
        str.getClass();
        if (str.equals("S_TEXT/ASS")) {
            bArrA = a(j10, "%01d:%02d:%02d:%02d", 10000L);
            i10 = 21;
        } else if (str.equals("S_TEXT/UTF8")) {
            bArrA = a(j10, "%02d:%02d:%02d,%03d", 1000L);
            i10 = 19;
        } else {
            throw new IllegalArgumentException();
        }
        System.arraycopy(bArrA, 0, bArr, i10, bArrA.length);
    }

    public static byte[] a(long j10, String str, long j11) {
        io.odeeo.internal.q0.a.checkArgument(j10 != C.TIME_UNSET);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - ((i10 * BuildConfig.VERSION_CODE) * 1000000);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - ((i11 * 60) * 1000000);
        int i12 = (int) (j13 / 1000000);
        return g0.getUtf8Bytes(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11))));
    }

    public final void a(i iVar, byte[] bArr, int i10, int i11) throws IOException {
        int iMin = Math.min(i11, this.f64535j.bytesLeft());
        iVar.readFully(bArr, i10 + iMin, i11 - iMin);
        if (iMin > 0) {
            this.f64535j.readBytes(bArr, i10, iMin);
        }
    }

    public final int a(i iVar, io.odeeo.internal.g.x xVar, int i10) throws IOException {
        int iBytesLeft = this.f64535j.bytesLeft();
        if (iBytesLeft > 0) {
            int iMin = Math.min(i10, iBytesLeft);
            xVar.sampleData(this.f64535j, iMin);
            return iMin;
        }
        return xVar.sampleData((g) iVar, i10, false);
    }

    public final v a(q qVar, q qVar2) {
        int i10;
        if (this.f64542q != -1 && this.f64545t != C.TIME_UNSET && qVar != null && qVar.size() != 0 && qVar2 != null && qVar2.size() == qVar.size()) {
            int size = qVar.size();
            int[] iArrCopyOf = new int[size];
            long[] jArrCopyOf = new long[size];
            long[] jArrCopyOf2 = new long[size];
            long[] jArrCopyOf3 = new long[size];
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                jArrCopyOf3[i12] = qVar.get(i12);
                jArrCopyOf[i12] = qVar2.get(i12) + this.f64542q;
            }
            while (true) {
                i10 = size - 1;
                if (i11 >= i10) {
                    break;
                }
                int i13 = i11 + 1;
                iArrCopyOf[i11] = (int) (jArrCopyOf[i13] - jArrCopyOf[i11]);
                jArrCopyOf2[i11] = jArrCopyOf3[i13] - jArrCopyOf3[i11];
                i11 = i13;
            }
            iArrCopyOf[i10] = (int) ((this.f64542q + this.f64541p) - jArrCopyOf[i10]);
            long j10 = this.f64545t - jArrCopyOf3[i10];
            jArrCopyOf2[i10] = j10;
            if (j10 <= 0) {
                p.w("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j10);
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i10);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i10);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i10);
                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i10);
            }
            return new io.odeeo.internal.g.c(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }
        return new v.b(this.f64545t);
    }

    public final boolean a(u uVar, long j10) {
        if (this.f64550y) {
            this.A = j10;
            uVar.f64171a = this.f64551z;
            this.f64550y = false;
            return true;
        }
        if (this.f64547v) {
            long j11 = this.A;
            if (j11 != -1) {
                uVar.f64171a = j11;
                this.A = -1L;
                return true;
            }
        }
        return false;
    }

    public final long a(long j10) throws io.odeeo.internal.b.g0 {
        long j11 = this.f64543r;
        if (j11 != C.TIME_UNSET) {
            return g0.scaleLargeTimestamp(j10, j11, 1000L);
        }
        throw io.odeeo.internal.b.g0.createForMalformedContainer("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public static boolean a(String str) {
        str.getClass();
        switch (str) {
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/SP":
            case "A_MS/ACM":
            case "A_TRUEHD":
            case "A_VORBIS":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "V_MS/VFW/FOURCC":
            case "S_DVBSUB":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AVC":
            case "S_VOBSUB":
            case "A_DTS/LOSSLESS":
            case "A_AAC":
            case "A_AC3":
            case "A_DTS":
            case "V_AV1":
            case "V_VP8":
            case "V_VP9":
            case "S_HDMV/PGS":
            case "V_THEORA":
            case "A_DTS/EXPRESS":
            case "A_PCM/FLOAT/IEEE":
            case "A_PCM/INT/BIG":
            case "A_PCM/INT/LIT":
            case "S_TEXT/ASS":
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                return true;
            default:
                return false;
        }
    }

    public static int[] a(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        return iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }
}
