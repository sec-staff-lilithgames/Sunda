package me;

import android.util.SparseArray;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.h1;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.p0;
import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.y0;
import com.google.android.exoplayer2.z0;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import ee.l0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import me.a;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class o implements ee.p {
    public static final byte[] I = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final z0 J = new y0().setSampleMimeType(MimeTypes.APPLICATION_EMSG).build();
    public int A;
    public int B;
    public int C;
    public boolean D;
    public ee.s E;
    public l0[] F;
    public l0[] G;
    public boolean H;

    /* renamed from: a, reason: collision with root package name */
    public final int f74391a;

    /* renamed from: b, reason: collision with root package name */
    public final v f74392b;

    /* renamed from: c, reason: collision with root package name */
    public final List f74393c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f74394d;

    /* renamed from: e, reason: collision with root package name */
    public final v0 f74395e;

    /* renamed from: f, reason: collision with root package name */
    public final v0 f74396f;

    /* renamed from: g, reason: collision with root package name */
    public final v0 f74397g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f74398h;

    /* renamed from: i, reason: collision with root package name */
    public final v0 f74399i;

    /* renamed from: j, reason: collision with root package name */
    public final h1 f74400j;

    /* renamed from: k, reason: collision with root package name */
    public final te.c f74401k;

    /* renamed from: l, reason: collision with root package name */
    public final v0 f74402l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayDeque f74403m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayDeque f74404n;

    /* renamed from: o, reason: collision with root package name */
    public final l0 f74405o;

    /* renamed from: p, reason: collision with root package name */
    public int f74406p;

    /* renamed from: q, reason: collision with root package name */
    public int f74407q;

    /* renamed from: r, reason: collision with root package name */
    public long f74408r;

    /* renamed from: s, reason: collision with root package name */
    public int f74409s;

    /* renamed from: t, reason: collision with root package name */
    public v0 f74410t;

    /* renamed from: u, reason: collision with root package name */
    public long f74411u;

    /* renamed from: v, reason: collision with root package name */
    public int f74412v;

    /* renamed from: w, reason: collision with root package name */
    public long f74413w;

    /* renamed from: x, reason: collision with root package name */
    public long f74414x;

    /* renamed from: y, reason: collision with root package name */
    public long f74415y;

    /* renamed from: z, reason: collision with root package name */
    public b f74416z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f74417a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f74418b;

        /* renamed from: c, reason: collision with root package name */
        public final int f74419c;

        public a(long j10, boolean z10, int i10) {
            this.f74417a = j10;
            this.f74418b = z10;
            this.f74419c = i10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final l0 f74420a;

        /* renamed from: d, reason: collision with root package name */
        public y f74423d;

        /* renamed from: e, reason: collision with root package name */
        public l f74424e;

        /* renamed from: f, reason: collision with root package name */
        public int f74425f;

        /* renamed from: g, reason: collision with root package name */
        public int f74426g;

        /* renamed from: h, reason: collision with root package name */
        public int f74427h;

        /* renamed from: i, reason: collision with root package name */
        public int f74428i;

        /* renamed from: l, reason: collision with root package name */
        public boolean f74431l;

        /* renamed from: b, reason: collision with root package name */
        public final x f74421b = new x();

        /* renamed from: c, reason: collision with root package name */
        public final v0 f74422c = new v0();

        /* renamed from: j, reason: collision with root package name */
        public final v0 f74429j = new v0(1);

        /* renamed from: k, reason: collision with root package name */
        public final v0 f74430k = new v0();

        public b(l0 l0Var, y yVar, l lVar) {
            this.f74420a = l0Var;
            this.f74423d = yVar;
            this.f74424e = lVar;
            reset(yVar, lVar);
        }

        public int getCurrentSampleFlags() {
            int i10 = !this.f74431l ? this.f74423d.f74513g[this.f74425f] : this.f74421b.f74499j[this.f74425f] ? 1 : 0;
            return getEncryptionBoxIfEncrypted() != null ? i10 | 1073741824 : i10;
        }

        public long getCurrentSampleOffset() {
            return !this.f74431l ? this.f74423d.f74509c[this.f74425f] : this.f74421b.f74495f[this.f74427h];
        }

        public long getCurrentSamplePresentationTimeUs() {
            return !this.f74431l ? this.f74423d.f74512f[this.f74425f] : this.f74421b.getSamplePresentationTimeUs(this.f74425f);
        }

        public int getCurrentSampleSize() {
            return !this.f74431l ? this.f74423d.f74510d[this.f74425f] : this.f74421b.f74497h[this.f74425f];
        }

        public w getEncryptionBoxIfEncrypted() {
            if (!this.f74431l) {
                return null;
            }
            x xVar = this.f74421b;
            int i10 = ((l) n1.castNonNull(xVar.f74490a)).f74381a;
            w sampleDescriptionEncryptionBox = xVar.f74502m;
            if (sampleDescriptionEncryptionBox == null) {
                sampleDescriptionEncryptionBox = this.f74423d.f74507a.getSampleDescriptionEncryptionBox(i10);
            }
            if (sampleDescriptionEncryptionBox == null || !sampleDescriptionEncryptionBox.f74485a) {
                return null;
            }
            return sampleDescriptionEncryptionBox;
        }

        public boolean next() {
            this.f74425f++;
            if (!this.f74431l) {
                return false;
            }
            int i10 = this.f74426g + 1;
            this.f74426g = i10;
            int[] iArr = this.f74421b.f74496g;
            int i11 = this.f74427h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f74427h = i11 + 1;
            this.f74426g = 0;
            return false;
        }

        public int outputSampleEncryptionData(int i10, int i11) {
            v0 v0Var;
            w encryptionBoxIfEncrypted = getEncryptionBoxIfEncrypted();
            if (encryptionBoxIfEncrypted == null) {
                return 0;
            }
            int length = encryptionBoxIfEncrypted.f74488d;
            x xVar = this.f74421b;
            if (length != 0) {
                v0Var = xVar.f74503n;
            } else {
                byte[] bArr = (byte[]) n1.castNonNull(encryptionBoxIfEncrypted.f74489e);
                int length2 = bArr.length;
                v0 v0Var2 = this.f74430k;
                v0Var2.reset(bArr, length2);
                length = bArr.length;
                v0Var = v0Var2;
            }
            boolean zSampleHasSubsampleEncryptionTable = xVar.sampleHasSubsampleEncryptionTable(this.f74425f);
            boolean z10 = zSampleHasSubsampleEncryptionTable || i11 != 0;
            v0 v0Var3 = this.f74429j;
            v0Var3.getData()[0] = (byte) ((z10 ? 128 : 0) | length);
            v0Var3.setPosition(0);
            l0 l0Var = this.f74420a;
            l0Var.sampleData(v0Var3, 1, 1);
            l0Var.sampleData(v0Var, length, 1);
            if (!z10) {
                return length + 1;
            }
            v0 v0Var4 = this.f74422c;
            if (!zSampleHasSubsampleEncryptionTable) {
                v0Var4.reset(8);
                byte[] data = v0Var4.getData();
                data[0] = 0;
                data[1] = 1;
                data[2] = (byte) ((i11 >> 8) & 255);
                data[3] = (byte) (i11 & 255);
                data[4] = (byte) ((i10 >> 24) & 255);
                data[5] = (byte) ((i10 >> 16) & 255);
                data[6] = (byte) ((i10 >> 8) & 255);
                data[7] = (byte) (i10 & 255);
                l0Var.sampleData(v0Var4, 8, 1);
                return length + 9;
            }
            v0 v0Var5 = xVar.f74503n;
            int unsignedShort = v0Var5.readUnsignedShort();
            v0Var5.skipBytes(-2);
            int i12 = (unsignedShort * 6) + 2;
            if (i11 != 0) {
                v0Var4.reset(i12);
                byte[] data2 = v0Var4.getData();
                v0Var5.readBytes(data2, 0, i12);
                int i13 = (((data2[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (data2[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) + i11;
                data2[2] = (byte) ((i13 >> 8) & 255);
                data2[3] = (byte) (i13 & 255);
            } else {
                v0Var4 = v0Var5;
            }
            l0Var.sampleData(v0Var4, i12, 1);
            return length + 1 + i12;
        }

        public void reset(y yVar, l lVar) {
            this.f74423d = yVar;
            this.f74424e = lVar;
            this.f74420a.format(yVar.f74507a.f74479f);
            resetFragmentInfo();
        }

        public void resetFragmentInfo() {
            this.f74421b.reset();
            this.f74425f = 0;
            this.f74427h = 0;
            this.f74426g = 0;
            this.f74428i = 0;
            this.f74431l = false;
        }

        public void seek(long j10) {
            int i10 = this.f74425f;
            while (true) {
                x xVar = this.f74421b;
                if (i10 >= xVar.f74494e || xVar.getSamplePresentationTimeUs(i10) > j10) {
                    return;
                }
                if (xVar.f74499j[i10]) {
                    this.f74428i = i10;
                }
                i10++;
            }
        }

        public void skipSampleEncryptionData() {
            w encryptionBoxIfEncrypted = getEncryptionBoxIfEncrypted();
            if (encryptionBoxIfEncrypted == null) {
                return;
            }
            x xVar = this.f74421b;
            v0 v0Var = xVar.f74503n;
            int i10 = encryptionBoxIfEncrypted.f74488d;
            if (i10 != 0) {
                v0Var.skipBytes(i10);
            }
            if (xVar.sampleHasSubsampleEncryptionTable(this.f74425f)) {
                v0Var.skipBytes(v0Var.readUnsignedShort() * 6);
            }
        }

        public void updateDrmInitData(DrmInitData drmInitData) {
            w sampleDescriptionEncryptionBox = this.f74423d.f74507a.getSampleDescriptionEncryptionBox(((l) n1.castNonNull(this.f74421b.f74490a)).f74381a);
            this.f74420a.format(this.f74423d.f74507a.f74479f.buildUpon().setDrmInitData(drmInitData.copyWithSchemeType(sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.f74486b : null)).build());
        }
    }

    public o() {
        this(0);
    }

    public static DrmInitData a(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            a.b bVar = (a.b) list.get(i10);
            if (bVar.f74342a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] data = bVar.f74346b.getData();
                UUID uuid = s.parseUuid(data);
                if (uuid == null) {
                    f0.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
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

    public static void b(v0 v0Var, int i10, x xVar) throws h2 {
        v0Var.setPosition(i10 + 8);
        int fullAtomFlags = me.a.parseFullAtomFlags(v0Var.readInt());
        if ((fullAtomFlags & 1) != 0) {
            throw h2.createForUnsupportedContainerFeature("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (fullAtomFlags & 2) != 0;
        int unsignedIntToInt = v0Var.readUnsignedIntToInt();
        if (unsignedIntToInt == 0) {
            Arrays.fill(xVar.f74501l, 0, xVar.f74494e, false);
            return;
        }
        if (unsignedIntToInt != xVar.f74494e) {
            StringBuilder sbT = o2.t(unsignedIntToInt, "Senc sample count ", " is different from fragment sample count");
            sbT.append(xVar.f74494e);
            throw h2.createForMalformedContainer(sbT.toString(), null);
        }
        Arrays.fill(xVar.f74501l, 0, unsignedIntToInt, z10);
        xVar.initEncryptionData(v0Var.bytesLeft());
        xVar.fillEncryptionData(v0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:319:0x0712, code lost:
    
        r53.f74406p = 0;
        r53.f74409s = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0717, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x066e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(long r54) throws com.google.android.exoplayer2.h2 {
        /*
            Method dump skipped, instructions count: 1816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: me.o.c(long):void");
    }

    @Override // ee.p
    public void init(ee.s sVar) {
        int i10;
        this.E = sVar;
        this.f74406p = 0;
        this.f74409s = 0;
        l0[] l0VarArr = new l0[2];
        this.F = l0VarArr;
        l0 l0Var = this.f74405o;
        if (l0Var != null) {
            l0VarArr[0] = l0Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i11 = 100;
        if ((this.f74391a & 4) != 0) {
            l0VarArr[i10] = sVar.track(100, 5);
            i11 = 101;
            i10++;
        }
        l0[] l0VarArr2 = (l0[]) n1.nullSafeArrayCopy(this.F, i10);
        this.F = l0VarArr2;
        for (l0 l0Var2 : l0VarArr2) {
            l0Var2.format(J);
        }
        List list = this.f74393c;
        this.G = new l0[list.size()];
        int i12 = 0;
        while (i12 < this.G.length) {
            l0 l0VarTrack = this.E.track(i11, 3);
            l0VarTrack.format((z0) list.get(i12));
            this.G[i12] = l0VarTrack;
            i12++;
            i11++;
        }
        v vVar = this.f74392b;
        if (vVar != null) {
            this.f74394d.put(0, new b(sVar.track(0, vVar.f74475b), new y(this.f74392b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new l(0, 0, 0, 0)));
            this.E.endTracks();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0246, code lost:
    
        r2[r11].sampleMetadata(r5, 1, r1.f74419c, r39.f74412v, null);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0258, code lost:
    
        if (r19.next() != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x025a, code lost:
    
        r39.f74416z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x025d, code lost:
    
        r39.f74406p = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0262, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a7, code lost:
    
        if (r39.f74406p != 3) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
    
        r3 = r2.getCurrentSampleSize();
        r39.A = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b3, code lost:
    
        if (r2.f74425f >= r2.f74428i) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b5, code lost:
    
        r40.skipFully(r3);
        r2.skipSampleEncryptionData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bf, code lost:
    
        if (r2.next() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c1, code lost:
    
        r39.f74416z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c3, code lost:
    
        r39.f74406p = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c5, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
    
        if (r2.f74423d.f74507a.f74480g != 1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cf, code lost:
    
        r39.A = r3 - 8;
        r40.skipFully(r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e6, code lost:
    
        if ("audio/ac4".equals(r2.f74423d.f74507a.f74479f.f28802n) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e8, code lost:
    
        r39.B = r2.outputSampleEncryptionData(r39.A, 7);
        r3 = r39.A;
        r6 = r39.f74399i;
        com.google.android.exoplayer2.audio.f.getAc4SampleHeader(r3, r6);
        r2.f74420a.sampleData(r6, 7);
        r39.B += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0103, code lost:
    
        r39.B = r2.outputSampleEncryptionData(r39.A, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010b, code lost:
    
        r39.A += r39.B;
        r39.f74406p = 4;
        r39.C = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0117, code lost:
    
        r3 = r2.f74423d.f74507a;
        r4 = r2.f74420a;
        r6 = r2.getCurrentSamplePresentationTimeUs();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0121, code lost:
    
        if (r15 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0123, code lost:
    
        r6 = r15.adjustSampleTimestamp(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0127, code lost:
    
        r9 = r3.f74483j;
        r11 = r3.f74479f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012b, code lost:
    
        if (r9 == 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012d, code lost:
    
        r9 = r39.f74396f;
        r13 = r9.getData();
        r13[0] = 0;
        r13[1] = 0;
        r13[r41] = 0;
        r3 = r3.f74483j;
        r14 = r3 + 1;
        r3 = 4 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0147, code lost:
    
        if (r39.B >= r39.A) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0149, code lost:
    
        r5 = r39.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014b, code lost:
    
        if (r5 != 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014d, code lost:
    
        r40.readFully(r13, r3, r14);
        r9.setPosition(r10);
        r5 = r9.readInt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0158, code lost:
    
        if (r5 < 1) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015a, code lost:
    
        r39.C = r5 - 1;
        r5 = r39.f74395e;
        r5.setPosition(r10);
        r4.sampleData(r5, 4);
        r4.sampleData(r9, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016d, code lost:
    
        if (r39.G.length <= 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0177, code lost:
    
        if (com.google.android.exoplayer2.util.p0.isNalUnitSei(r11.f28802n, r13[4]) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0179, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017b, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017c, code lost:
    
        r39.D = r5;
        r39.B += 5;
        r39.A += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0189, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0193, code lost:
    
        throw com.google.android.exoplayer2.h2.createForMalformedContainer("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0196, code lost:
    
        if (r39.D == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0198, code lost:
    
        r8 = r39.f74397g;
        r8.reset(r5);
        r19 = r2;
        r40.readFully(r8.getData(), 0, r39.C);
        r4.sampleData(r8, r39.C);
        r2 = r39.C;
        r5 = com.google.android.exoplayer2.util.p0.unescapeStream(r8.getData(), r8.limit());
        r8.setPosition("video/hevc".equals(r11.f28802n) ? 1 : 0);
        r8.setLimit(r5);
        ee.h.consume(r6, r8, r39.G);
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01d4, code lost:
    
        r19 = r2;
        r2 = r4.sampleData((qf.k) r40, r5, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01dc, code lost:
    
        r39.B += r2;
        r39.C -= r2;
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e9, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ec, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ee, code lost:
    
        r2 = r39.B;
        r3 = r39.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01f2, code lost:
    
        if (r2 >= r3) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01f4, code lost:
    
        r39.B += r4.sampleData((qf.k) r40, r3 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0200, code lost:
    
        r24 = r19.getCurrentSampleFlags();
        r1 = r19.getEncryptionBoxIfEncrypted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0208, code lost:
    
        if (r1 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x020a, code lost:
    
        r27 = r1.f74487c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x020f, code lost:
    
        r27 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0211, code lost:
    
        r22 = r6;
        r4.sampleMetadata(r22, r24, r39.A, 0, r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0222, code lost:
    
        if (r12.isEmpty() != false) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0224, code lost:
    
        r1 = (me.o.a) r12.removeFirst();
        r39.f74412v -= r1.f74419c;
        r2 = r1.f74417a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0235, code lost:
    
        if (r1.f74418b == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0237, code lost:
    
        r2 = r2 + r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0239, code lost:
    
        if (r15 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x023b, code lost:
    
        r2 = r15.adjustSampleTimestamp(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x023f, code lost:
    
        r5 = r2;
        r2 = r39.F;
        r3 = r2.length;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0244, code lost:
    
        if (r11 >= r3) goto L398;
     */
    @Override // ee.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(ee.q r40, ee.f0 r41) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: me.o.read(ee.q, ee.f0):int");
    }

    @Override // ee.p
    public void seek(long j10, long j11) {
        SparseArray sparseArray = this.f74394d;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) sparseArray.valueAt(i10)).resetFragmentInfo();
        }
        this.f74404n.clear();
        this.f74412v = 0;
        this.f74413w = j11;
        this.f74403m.clear();
        this.f74406p = 0;
        this.f74409s = 0;
    }

    @Override // ee.p
    public boolean sniff(ee.q qVar) throws IOException {
        return u.sniffFragmented(qVar);
    }

    public o(int i10) {
        this(i10, null);
    }

    public o(int i10, h1 h1Var) {
        this(i10, h1Var, null, Collections.EMPTY_LIST);
    }

    public o(int i10, h1 h1Var, v vVar) {
        this(i10, h1Var, vVar, Collections.EMPTY_LIST);
    }

    public o(int i10, h1 h1Var, v vVar, List<z0> list) {
        this(i10, h1Var, vVar, list, null);
    }

    public o(int i10, h1 h1Var, v vVar, List<z0> list, l0 l0Var) {
        this.f74391a = i10;
        this.f74400j = h1Var;
        this.f74392b = vVar;
        this.f74393c = Collections.unmodifiableList(list);
        this.f74405o = l0Var;
        this.f74401k = new te.c();
        this.f74402l = new v0(16);
        this.f74395e = new v0(p0.f28540a);
        this.f74396f = new v0(5);
        this.f74397g = new v0();
        byte[] bArr = new byte[16];
        this.f74398h = bArr;
        this.f74399i = new v0(bArr);
        this.f74403m = new ArrayDeque();
        this.f74404n = new ArrayDeque();
        this.f74394d = new SparseArray();
        this.f74414x = C.TIME_UNSET;
        this.f74413w = C.TIME_UNSET;
        this.f74415y = C.TIME_UNSET;
        this.E = ee.s.K8;
        this.F = new l0[0];
        this.G = new l0[0];
    }

    @Override // ee.p
    public void release() {
    }
}
