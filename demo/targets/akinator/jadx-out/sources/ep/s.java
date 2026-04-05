package ep;

import android.util.SparseArray;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gn.z0;
import io.bidmachine.media3.common.DrmInitData;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.m0;
import io.bidmachine.media3.common.util.u0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import ko.c1;
import ko.e1;
import nh.b5;
import org.checkerframework.dataflow.qual.SideEffectFree;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class s implements ko.z {
    public static final byte[] M = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final io.bidmachine.media3.common.b N = new gn.w().setSampleMimeType(MimeTypes.APPLICATION_EMSG).build();
    public long A;
    public long B;
    public b C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public ko.c0 I;
    public e1[] J;
    public e1[] K;
    public boolean L;

    /* renamed from: a, reason: collision with root package name */
    public final hp.q f54901a;

    /* renamed from: b, reason: collision with root package name */
    public final int f54902b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f54903c;

    /* renamed from: d, reason: collision with root package name */
    public final List f54904d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f54905e;

    /* renamed from: f, reason: collision with root package name */
    public final m0 f54906f;

    /* renamed from: g, reason: collision with root package name */
    public final m0 f54907g;

    /* renamed from: h, reason: collision with root package name */
    public final m0 f54908h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f54909i;

    /* renamed from: j, reason: collision with root package name */
    public final m0 f54910j;

    /* renamed from: k, reason: collision with root package name */
    public final u0 f54911k;

    /* renamed from: l, reason: collision with root package name */
    public final vo.c f54912l;

    /* renamed from: m, reason: collision with root package name */
    public final m0 f54913m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayDeque f54914n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayDeque f54915o;

    /* renamed from: p, reason: collision with root package name */
    public final jn.b0 f54916p;

    /* renamed from: q, reason: collision with root package name */
    public final e1 f54917q;

    /* renamed from: r, reason: collision with root package name */
    public b5 f54918r;

    /* renamed from: s, reason: collision with root package name */
    public int f54919s;

    /* renamed from: t, reason: collision with root package name */
    public int f54920t;

    /* renamed from: u, reason: collision with root package name */
    public long f54921u;

    /* renamed from: v, reason: collision with root package name */
    public int f54922v;

    /* renamed from: w, reason: collision with root package name */
    public m0 f54923w;

    /* renamed from: x, reason: collision with root package name */
    public long f54924x;

    /* renamed from: y, reason: collision with root package name */
    public int f54925y;

    /* renamed from: z, reason: collision with root package name */
    public long f54926z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f54927a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f54928b;

        /* renamed from: c, reason: collision with root package name */
        public final int f54929c;

        public a(long j10, boolean z10, int i10) {
            this.f54927a = j10;
            this.f54928b = z10;
            this.f54929c = i10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final e1 f54930a;

        /* renamed from: d, reason: collision with root package name */
        public f0 f54933d;

        /* renamed from: e, reason: collision with root package name */
        public o f54934e;

        /* renamed from: f, reason: collision with root package name */
        public int f54935f;

        /* renamed from: g, reason: collision with root package name */
        public int f54936g;

        /* renamed from: h, reason: collision with root package name */
        public int f54937h;

        /* renamed from: i, reason: collision with root package name */
        public int f54938i;

        /* renamed from: j, reason: collision with root package name */
        public final String f54939j;

        /* renamed from: m, reason: collision with root package name */
        public boolean f54942m;

        /* renamed from: b, reason: collision with root package name */
        public final e0 f54931b = new e0();

        /* renamed from: c, reason: collision with root package name */
        public final m0 f54932c = new m0();

        /* renamed from: k, reason: collision with root package name */
        public final m0 f54940k = new m0(1);

        /* renamed from: l, reason: collision with root package name */
        public final m0 f54941l = new m0();

        public b(e1 e1Var, f0 f0Var, o oVar, String str) {
            this.f54930a = e1Var;
            this.f54933d = f0Var;
            this.f54934e = oVar;
            this.f54939j = str;
            reset(f0Var, oVar);
        }

        public int getCurrentSampleFlags() {
            int i10 = !this.f54942m ? this.f54933d.f54865g[this.f54935f] : this.f54931b.f54848j[this.f54935f] ? 1 : 0;
            return getEncryptionBoxIfEncrypted() != null ? i10 | 1073741824 : i10;
        }

        public long getCurrentSampleOffset() {
            return !this.f54942m ? this.f54933d.f54861c[this.f54935f] : this.f54931b.f54844f[this.f54937h];
        }

        public long getCurrentSamplePresentationTimeUs() {
            return !this.f54942m ? this.f54933d.f54864f[this.f54935f] : this.f54931b.getSamplePresentationTimeUs(this.f54935f);
        }

        public int getCurrentSampleSize() {
            return !this.f54942m ? this.f54933d.f54862d[this.f54935f] : this.f54931b.f54846h[this.f54935f];
        }

        public d0 getEncryptionBoxIfEncrypted() {
            if (!this.f54942m) {
                return null;
            }
            e0 e0Var = this.f54931b;
            int i10 = ((o) a1.castNonNull(e0Var.f54839a)).f54888a;
            d0 sampleDescriptionEncryptionBox = e0Var.f54851m;
            if (sampleDescriptionEncryptionBox == null) {
                sampleDescriptionEncryptionBox = this.f54933d.f54859a.getSampleDescriptionEncryptionBox(i10);
            }
            if (sampleDescriptionEncryptionBox == null || !sampleDescriptionEncryptionBox.f54833a) {
                return null;
            }
            return sampleDescriptionEncryptionBox;
        }

        public boolean next() {
            this.f54935f++;
            if (!this.f54942m) {
                return false;
            }
            int i10 = this.f54936g + 1;
            this.f54936g = i10;
            int[] iArr = this.f54931b.f54845g;
            int i11 = this.f54937h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f54937h = i11 + 1;
            this.f54936g = 0;
            return false;
        }

        public int outputSampleEncryptionData(int i10, int i11) {
            m0 m0Var;
            d0 encryptionBoxIfEncrypted = getEncryptionBoxIfEncrypted();
            if (encryptionBoxIfEncrypted == null) {
                return 0;
            }
            int length = encryptionBoxIfEncrypted.f54836d;
            e0 e0Var = this.f54931b;
            if (length != 0) {
                m0Var = e0Var.f54852n;
            } else {
                byte[] bArr = (byte[]) a1.castNonNull(encryptionBoxIfEncrypted.f54837e);
                int length2 = bArr.length;
                m0 m0Var2 = this.f54941l;
                m0Var2.reset(bArr, length2);
                length = bArr.length;
                m0Var = m0Var2;
            }
            boolean zSampleHasSubsampleEncryptionTable = e0Var.sampleHasSubsampleEncryptionTable(this.f54935f);
            boolean z10 = zSampleHasSubsampleEncryptionTable || i11 != 0;
            m0 m0Var3 = this.f54940k;
            m0Var3.getData()[0] = (byte) ((z10 ? 128 : 0) | length);
            m0Var3.setPosition(0);
            e1 e1Var = this.f54930a;
            e1Var.sampleData(m0Var3, 1, 1);
            e1Var.sampleData(m0Var, length, 1);
            if (!z10) {
                return length + 1;
            }
            m0 m0Var4 = this.f54932c;
            if (!zSampleHasSubsampleEncryptionTable) {
                m0Var4.reset(8);
                byte[] data = m0Var4.getData();
                data[0] = 0;
                data[1] = 1;
                data[2] = (byte) ((i11 >> 8) & 255);
                data[3] = (byte) (i11 & 255);
                data[4] = (byte) ((i10 >> 24) & 255);
                data[5] = (byte) ((i10 >> 16) & 255);
                data[6] = (byte) ((i10 >> 8) & 255);
                data[7] = (byte) (i10 & 255);
                e1Var.sampleData(m0Var4, 8, 1);
                return length + 9;
            }
            m0 m0Var5 = e0Var.f54852n;
            int unsignedShort = m0Var5.readUnsignedShort();
            m0Var5.skipBytes(-2);
            int i12 = (unsignedShort * 6) + 2;
            if (i11 != 0) {
                m0Var4.reset(i12);
                byte[] data2 = m0Var4.getData();
                m0Var5.readBytes(data2, 0, i12);
                int i13 = (((data2[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (data2[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) + i11;
                data2[2] = (byte) ((i13 >> 8) & 255);
                data2[3] = (byte) (i13 & 255);
            } else {
                m0Var4 = m0Var5;
            }
            e1Var.sampleData(m0Var4, i12, 1);
            return length + 1 + i12;
        }

        public void reset(f0 f0Var, o oVar) {
            this.f54933d = f0Var;
            this.f54934e = oVar;
            this.f54930a.format(f0Var.f54859a.f54823g.buildUpon().setContainerMimeType(this.f54939j).build());
            resetFragmentInfo();
        }

        public void resetFragmentInfo() {
            this.f54931b.reset();
            this.f54935f = 0;
            this.f54937h = 0;
            this.f54936g = 0;
            this.f54938i = 0;
            this.f54942m = false;
        }

        public void seek(long j10) {
            int i10 = this.f54935f;
            while (true) {
                e0 e0Var = this.f54931b;
                if (i10 >= e0Var.f54843e || e0Var.getSamplePresentationTimeUs(i10) > j10) {
                    return;
                }
                if (e0Var.f54848j[i10]) {
                    this.f54938i = i10;
                }
                i10++;
            }
        }

        public void skipSampleEncryptionData() {
            d0 encryptionBoxIfEncrypted = getEncryptionBoxIfEncrypted();
            if (encryptionBoxIfEncrypted == null) {
                return;
            }
            e0 e0Var = this.f54931b;
            m0 m0Var = e0Var.f54852n;
            int i10 = encryptionBoxIfEncrypted.f54836d;
            if (i10 != 0) {
                m0Var.skipBytes(i10);
            }
            if (e0Var.sampleHasSubsampleEncryptionTable(this.f54935f)) {
                m0Var.skipBytes(m0Var.readUnsignedShort() * 6);
            }
        }

        public void updateDrmInitData(DrmInitData drmInitData) {
            d0 sampleDescriptionEncryptionBox = this.f54933d.f54859a.getSampleDescriptionEncryptionBox(((o) a1.castNonNull(this.f54931b.f54839a)).f54888a);
            this.f54930a.format(this.f54933d.f54859a.f54823g.buildUpon().setContainerMimeType(this.f54939j).setDrmInitData(drmInitData.copyWithSchemeType(sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.f54834b : null)).build());
        }
    }

    @Deprecated
    public s() {
        this(hp.q.f59124a, 32, null, null, b5.of(), null);
    }

    public static DrmInitData a(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            jn.d dVar = (jn.d) list.get(i10);
            if (dVar.f69730a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] data = dVar.f69729b.getData();
                UUID uuid = y.parseUuid(data);
                if (uuid == null) {
                    io.bidmachine.media3.common.util.b0.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuid, MimeTypes.VIDEO_MP4, data));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    public static void b(m0 m0Var, int i10, e0 e0Var) throws z0 {
        m0Var.setPosition(i10 + 8);
        int fullBoxFlags = n.parseFullBoxFlags(m0Var.readInt());
        if ((fullBoxFlags & 1) != 0) {
            throw z0.createForUnsupportedContainerFeature("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (fullBoxFlags & 2) != 0;
        int unsignedIntToInt = m0Var.readUnsignedIntToInt();
        if (unsignedIntToInt == 0) {
            Arrays.fill(e0Var.f54850l, 0, e0Var.f54843e, false);
            return;
        }
        if (unsignedIntToInt != e0Var.f54843e) {
            StringBuilder sbT = o2.t(unsignedIntToInt, "Senc sample count ", " is different from fragment sample count");
            sbT.append(e0Var.f54843e);
            throw z0.createForMalformedContainer(sbT.toString(), null);
        }
        Arrays.fill(e0Var.f54850l, 0, unsignedIntToInt, z10);
        e0Var.initEncryptionData(m0Var.bytesLeft());
        e0Var.fillEncryptionData(m0Var);
    }

    public static int codecsToParseWithinGopSampleDependenciesAsFlags(int i10) {
        int i11 = (i10 & 1) != 0 ? 64 : 0;
        return (i10 & 2) != 0 ? i11 | 128 : i11;
    }

    public static ko.e0 newFactory(hp.q qVar) {
        return new cp.e(qVar, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:321:0x0725, code lost:
    
        r51.f54919s = 0;
        r51.f54922v = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x072a, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0685  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(long r52) throws gn.z0 {
        /*
            Method dump skipped, instructions count: 1835
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.s.c(long):void");
    }

    @Override // ko.z
    @SideEffectFree
    public /* bridge */ /* synthetic */ ko.z getUnderlyingImplementation() {
        return super.getUnderlyingImplementation();
    }

    @Override // ko.z
    public void init(ko.c0 c0Var) {
        int i10;
        int i11 = this.f54902b;
        if ((i11 & 32) == 0) {
            c0Var = new hp.t(c0Var, this.f54901a);
        }
        this.I = c0Var;
        this.f54919s = 0;
        this.f54922v = 0;
        e1[] e1VarArr = new e1[2];
        this.J = e1VarArr;
        e1 e1Var = this.f54917q;
        if (e1Var != null) {
            e1VarArr[0] = e1Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((i11 & 4) != 0) {
            e1VarArr[i10] = c0Var.track(100, 5);
            i12 = 101;
            i10++;
        }
        e1[] e1VarArr2 = (e1[]) a1.nullSafeArrayCopy(this.J, i10);
        this.J = e1VarArr2;
        for (e1 e1Var2 : e1VarArr2) {
            e1Var2.format(N);
        }
        List list = this.f54904d;
        this.K = new e1[list.size()];
        int i13 = 0;
        while (i13 < this.K.length) {
            e1 e1VarTrack = this.I.track(i12, 3);
            e1VarTrack.format((io.bidmachine.media3.common.b) list.get(i13));
            this.K[i13] = e1VarTrack;
            i13++;
            i12++;
        }
        c0 c0Var2 = this.f54903c;
        if (c0Var2 != null) {
            this.f54905e.put(0, new b(this.I.track(0, c0Var2.f54818b), new f0(this.f54903c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new o(0, 0, 0, 0), v.getContainerMimeType(c0Var2.f54823g)));
            this.I.endTracks();
        }
    }

    @Override // ko.z
    public void release() {
    }

    @Override // ko.z
    public void seek(long j10, long j11) {
        SparseArray sparseArray = this.f54905e;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) sparseArray.valueAt(i10)).resetFragmentInfo();
        }
        this.f54915o.clear();
        this.f54925y = 0;
        this.f54916p.clear();
        this.f54926z = j11;
        this.f54914n.clear();
        this.f54919s = 0;
        this.f54922v = 0;
    }

    @Override // ko.z
    public boolean sniff(ko.a0 a0Var) throws IOException {
        c1 c1VarSniffFragmented = b0.sniffFragmented(a0Var);
        this.f54918r = c1VarSniffFragmented != null ? b5.of(c1VarSniffFragmented) : b5.of();
        return c1VarSniffFragmented == null;
    }

    @Override // ko.z
    public b5 getSniffFailureDetails() {
        return this.f54918r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e6, code lost:
    
        r36.G = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e9, code lost:
    
        r2 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f4, code lost:
    
        throw gn.z0.createForMalformedContainer("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f5, code lost:
    
        r16 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f9, code lost:
    
        if (r36.H == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01fb, code lost:
    
        r2 = r36.f54908h;
        r2.reset(r10);
        r17 = r6;
        r37.readFully(r2.getData(), 0, r36.F);
        r5.sampleData(r2, r36.F);
        r10 = r36.F;
        r10 = jn.u.unescapeStream(r2.getData(), r2.limit());
        r2.setPosition(0);
        r2.setLimit(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x022a, code lost:
    
        if (r3.f60667q != (-1)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0230, code lost:
    
        if (r7.getMaxSize() == 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0232, code lost:
    
        r7.setMaxSize(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0236, code lost:
    
        r6 = r7.getMaxSize();
        r10 = r3.f60667q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x023c, code lost:
    
        if (r6 == r10) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x023e, code lost:
    
        r7.setMaxSize(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0241, code lost:
    
        r7.add(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x024c, code lost:
    
        if ((r16.getCurrentSampleFlags() & 4) == 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x024e, code lost:
    
        r7.flush();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0251, code lost:
    
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0254, code lost:
    
        r17 = r6;
        r10 = r5.sampleData((gn.o) r37, r10, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x025b, code lost:
    
        r36.E += r10;
        r36.F -= r10;
        r2 = r16;
        r6 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x026a, code lost:
    
        r16 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x026d, code lost:
    
        r16 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x026f, code lost:
    
        r2 = r36.E;
        r3 = r36.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0273, code lost:
    
        if (r2 >= r3) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0275, code lost:
    
        r36.E += r5.sampleData((gn.o) r37, r3 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0281, code lost:
    
        r1 = r16.getCurrentSampleFlags();
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0287, code lost:
    
        if (r36.G != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0289, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x028c, code lost:
    
        r26 = r1;
        r1 = r16.getEncryptionBoxIfEncrypted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0292, code lost:
    
        if (r1 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0294, code lost:
    
        r29 = r1.f54835c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0299, code lost:
    
        r29 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x029b, code lost:
    
        r24 = r8;
        r5.sampleMetadata(r24, r26, r36.D, 0, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02ac, code lost:
    
        if (r14.isEmpty() != false) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02ae, code lost:
    
        r1 = (ep.s.a) r14.removeFirst();
        r36.f54925y -= r1.f54929c;
        r2 = r1.f54927a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02bf, code lost:
    
        if (r1.f54928b == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02c1, code lost:
    
        r2 = r2 + r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02c3, code lost:
    
        if (r4 == null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02c5, code lost:
    
        r2 = r4.adjustSampleTimestamp(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02c9, code lost:
    
        r6 = r2;
        r2 = r36.J;
        r3 = r2.length;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02ce, code lost:
    
        if (r12 >= r3) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02d0, code lost:
    
        r2[r12].sampleMetadata(r6, 1, r1.f54929c, r36.f54925y, null);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02e2, code lost:
    
        if (r16.next() != false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02e4, code lost:
    
        r36.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02e7, code lost:
    
        r36.f54919s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02ec, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a3, code lost:
    
        if (r36.f54919s != 3) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
    
        r36.D = r2.getCurrentSampleSize();
        r3 = r2.f54933d.f54859a.f54823g;
        r5 = java.util.Objects.equals(r3.f60665o, "video/avc");
        r6 = r36.f54902b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bb, code lost:
    
        if (r5 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bf, code lost:
    
        if ((r6 & 64) == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c1, code lost:
    
        r3 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c4, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
    
        if (java.util.Objects.equals(r3.f60665o, "video/hevc") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d2, code lost:
    
        if ((r6 & 128) == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d5, code lost:
    
        r36.G = !r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dd, code lost:
    
        if (r2.f54935f >= r2.f54938i) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00df, code lost:
    
        r37.skipFully(r36.D);
        r2.skipSampleEncryptionData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00eb, code lost:
    
        if (r2.next() != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ed, code lost:
    
        r36.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ef, code lost:
    
        r36.f54919s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f2, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fb, code lost:
    
        if (r2.f54933d.f54859a.f54824h != r22) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fd, code lost:
    
        r36.D -= 8;
        r37.skipFully(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0116, code lost:
    
        if ("audio/ac4".equals(r2.f54933d.f54859a.f54823g.f60665o) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0118, code lost:
    
        r36.E = r2.outputSampleEncryptionData(r36.D, 7);
        r3 = r36.D;
        r6 = r36.f54910j;
        ko.g.getAc4SampleHeader(r3, r6);
        r2.f54930a.sampleData(r6, 7);
        r36.E += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0133, code lost:
    
        r36.E = r2.outputSampleEncryptionData(r36.D, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013b, code lost:
    
        r36.D += r36.E;
        r36.f54919s = 4;
        r36.F = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0147, code lost:
    
        r3 = r2.f54933d.f54859a;
        r5 = r2.f54930a;
        r8 = r2.getCurrentSamplePresentationTimeUs();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0151, code lost:
    
        if (r4 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0153, code lost:
    
        r8 = r4.adjustSampleTimestamp(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0157, code lost:
    
        r6 = r3.f54827k;
        r3 = r3.f54823g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015b, code lost:
    
        if (r6 == 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015d, code lost:
    
        r11 = r36.f54907g;
        r13 = r11.getData();
        r13[0] = 0;
        r13[1] = 0;
        r13[r18] = 0;
        r15 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0171, code lost:
    
        if (r36.E >= r36.D) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0173, code lost:
    
        r10 = r36.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0175, code lost:
    
        if (r10 != 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017a, code lost:
    
        if (r36.K.length > 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017e, code lost:
    
        if (r36.G != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0181, code lost:
    
        r16 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0184, code lost:
    
        r10 = jn.u.numberOfBytesInNalUnitHeader(r3);
        r16 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0194, code lost:
    
        if ((r6 + r10) > (r36.D - r36.E)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0197, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0198, code lost:
    
        r37.readFully(r13, r15, r6 + r10);
        r11.setPosition(0);
        r12 = r11.readInt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a5, code lost:
    
        if (r12 < 0) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a7, code lost:
    
        r36.F = r12 - r10;
        r12 = r36.f54906f;
        r12.setPosition(0);
        r5.sampleData(r12, 4);
        r36.E += 4;
        r36.D += r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c0, code lost:
    
        if (r36.K.length <= 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c2, code lost:
    
        if (r10 <= 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ca, code lost:
    
        if (jn.u.isNalUnitSei(r3, r13[4]) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01cc, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ce, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01cf, code lost:
    
        r36.H = r2;
        r5.sampleData(r11, r10);
        r36.E += r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d9, code lost:
    
        if (r10 <= 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01dd, code lost:
    
        if (r36.G != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e4, code lost:
    
        if (jn.u.isDependedOn(r13, 4, r10, r3) == false) goto L101;
     */
    @Override // ko.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(ko.a0 r37, ko.v0 r38) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.s.read(ko.a0, ko.v0):int");
    }

    public s(hp.q qVar) {
        this(qVar, 0, null, null, b5.of(), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public s(int i10) {
        b5 b5VarOf = b5.of();
        this(hp.q.f59124a, i10 | 32, null, null, b5VarOf, null);
    }

    public s(hp.q qVar, int i10) {
        this(qVar, i10, null, null, b5.of(), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public s(int i10, u0 u0Var) {
        b5 b5VarOf = b5.of();
        this(hp.q.f59124a, i10 | 32, u0Var, null, b5VarOf, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public s(int i10, u0 u0Var, c0 c0Var) {
        b5 b5VarOf = b5.of();
        this(hp.q.f59124a, i10 | 32, u0Var, c0Var, b5VarOf, null);
    }

    @Deprecated
    public s(int i10, u0 u0Var, c0 c0Var, List<io.bidmachine.media3.common.b> list) {
        this(hp.q.f59124a, i10 | 32, u0Var, c0Var, list, null);
    }

    @Deprecated
    public s(int i10, u0 u0Var, c0 c0Var, List<io.bidmachine.media3.common.b> list, e1 e1Var) {
        this(hp.q.f59124a, i10 | 32, u0Var, c0Var, list, e1Var);
    }

    public s(hp.q qVar, int i10, u0 u0Var, c0 c0Var, List<io.bidmachine.media3.common.b> list, e1 e1Var) {
        this.f54901a = qVar;
        this.f54902b = i10;
        this.f54911k = u0Var;
        this.f54903c = c0Var;
        this.f54904d = Collections.unmodifiableList(list);
        this.f54917q = e1Var;
        this.f54912l = new vo.c();
        this.f54913m = new m0(16);
        this.f54906f = new m0(jn.u.f69799a);
        this.f54907g = new m0(6);
        this.f54908h = new m0();
        byte[] bArr = new byte[16];
        this.f54909i = bArr;
        this.f54910j = new m0(bArr);
        this.f54914n = new ArrayDeque();
        this.f54915o = new ArrayDeque();
        this.f54905e = new SparseArray();
        this.f54918r = b5.of();
        this.A = C.TIME_UNSET;
        this.f54926z = C.TIME_UNSET;
        this.B = C.TIME_UNSET;
        this.I = ko.c0.N8;
        this.J = new e1[0];
        this.K = new e1[0];
        this.f54916p = new jn.b0(new af.g(this, 25));
    }
}
