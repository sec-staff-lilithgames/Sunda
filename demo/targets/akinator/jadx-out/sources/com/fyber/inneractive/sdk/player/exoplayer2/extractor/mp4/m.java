package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Log;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {
    public static final int A = z.a("seig");
    public static final byte[] B = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: f, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.v f25099f;

    /* renamed from: l, reason: collision with root package name */
    public int f25105l;

    /* renamed from: m, reason: collision with root package name */
    public long f25106m;

    /* renamed from: o, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.n f25108o;

    /* renamed from: p, reason: collision with root package name */
    public long f25109p;

    /* renamed from: q, reason: collision with root package name */
    public int f25110q;

    /* renamed from: t, reason: collision with root package name */
    public l f25113t;

    /* renamed from: u, reason: collision with root package name */
    public int f25114u;

    /* renamed from: v, reason: collision with root package name */
    public int f25115v;

    /* renamed from: w, reason: collision with root package name */
    public int f25116w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f25117x;

    /* renamed from: y, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f25118y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f25119z;

    /* renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f25100g = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(16);

    /* renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f25095b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(com.fyber.inneractive.sdk.player.exoplayer2.util.l.f26034a);

    /* renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f25096c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(5);

    /* renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f25097d = new com.fyber.inneractive.sdk.player.exoplayer2.util.n();

    /* renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f25098e = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(1);

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f25101h = new byte[16];

    /* renamed from: i, reason: collision with root package name */
    public final Stack f25102i = new Stack();

    /* renamed from: j, reason: collision with root package name */
    public final LinkedList f25103j = new LinkedList();

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f25094a = new SparseArray();

    /* renamed from: r, reason: collision with root package name */
    public long f25111r = C.TIME_UNSET;

    /* renamed from: s, reason: collision with root package name */
    public long f25112s = C.TIME_UNSET;

    /* renamed from: k, reason: collision with root package name */
    public int f25104k = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f25107n = 0;

    public m(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar) {
        this.f25099f = vVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        return r.a(bVar, true);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.f25118y = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        int size = this.f25094a.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((l) this.f25094a.valueAt(i10)).a();
        }
        this.f25103j.clear();
        this.f25110q = 0;
        this.f25102i.clear();
        this.f25104k = 0;
        this.f25107n = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        r2 = r27.f25113t;
        r3 = r2.f25087a;
        r4 = r3.f25187h;
        r9 = r2.f25091e;
        r27.f25114u = r4[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0091, code lost:
    
        if (r3.f25191l == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
    
        r4 = r3.f25195p;
        r10 = r3.f25180a.f25081a;
        r11 = r3.f25193n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009b, code lost:
    
        if (r11 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
    
        r11 = r2.f25089c.f25174h[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a4, code lost:
    
        r10 = r11.f25178a;
        r3 = r3.f25192m[r9];
        r9 = r27.f25098e;
        r11 = r9.f26042a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ae, code lost:
    
        if (r3 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b0, code lost:
    
        r12 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b4, code lost:
    
        r11[0] = (byte) (r12 | r10);
        r9.e(0);
        r2 = r2.f25088b;
        r2.a(1, r27.f25098e);
        r2.a(r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c5, code lost:
    
        if (r3 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c7, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c9, code lost:
    
        r3 = r4.o();
        r4.e(r4.f26043b - 2);
        r3 = (r3 * 6) + 2;
        r2.a(r3, r4);
        r10 = (r10 + 1) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dd, code lost:
    
        r27.f25115v = r10;
        r27.f25114u += r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e5, code lost:
    
        r27.f25115v = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ed, code lost:
    
        if (r27.f25113t.f25089c.f25173g != 1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ef, code lost:
    
        r27.f25114u -= 8;
        r28.a(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f7, code lost:
    
        r27.f25104k = 4;
        r27.f25116w = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fe, code lost:
    
        r2 = r27.f25113t;
        r3 = r2.f25087a;
        r4 = r2.f25089c;
        r9 = r2.f25088b;
        r2 = r2.f25091e;
        r5 = r4.f25177k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010a, code lost:
    
        if (r5 == 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010c, code lost:
    
        r12 = r27.f25096c.f26042a;
        r12[0] = 0;
        r12[1] = 0;
        r12[r29] = 0;
        r13 = r5 + 1;
        r5 = 4 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011e, code lost:
    
        if (r27.f25115v >= r27.f25114u) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0120, code lost:
    
        r14 = r27.f25116w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0122, code lost:
    
        if (r14 != 0) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0124, code lost:
    
        r28.b(r12, r5, r13, r7);
        r27.f25096c.e(r7 ? 1 : 0);
        r27.f25116w = r27.f25096c.m() - r6;
        r27.f25095b.e(r7 ? 1 : 0);
        r9.a(r8, r27.f25095b);
        r9.a(r6, r27.f25096c);
        r27.f25117x = r7;
        r27.f25115v += 5;
        r27.f25114u += r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0154, code lost:
    
        if (r27.f25117x == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0156, code lost:
    
        r27.f25097d.c(r14);
        r28.b(r27.f25097d.f26042a, r7 ? 1 : 0, r27.f25116w, r7);
        r9.a(r27.f25116w, r27.f25097d);
        r14 = r27.f25116w;
        r15 = r27.f25097d;
        r18 = r8;
        r8 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(r15.f26044c, r15.f26042a);
        r27.f25097d.e("video/hevc".equals(r4.f25172f.f25701f) ? 1 : 0);
        r27.f25097d.d(r8);
        r21 = r6;
        com.fyber.inneractive.sdk.player.exoplayer2.text.cea.a.a((r3.f25189j[r2] + r3.f25188i[r2]) * 1000, r27.f25097d, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a4, code lost:
    
        r21 = r6;
        r18 = r8;
        r14 = r9.a(r28, r14, r7 ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01af, code lost:
    
        r27.f25115v += r14;
        r27.f25116w -= r14;
        r8 = r18;
        r6 = r21;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01c0, code lost:
    
        r19 = 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01c5, code lost:
    
        r19 = 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01c9, code lost:
    
        r5 = r27.f25115v;
        r6 = r27.f25114u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01cd, code lost:
    
        if (r5 >= r6) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01cf, code lost:
    
        r27.f25115v += r9.a(r28, r6 - r5, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01db, code lost:
    
        r5 = (r3.f25189j[r2] + r3.f25188i[r2]) * r19;
        r1 = r3.f25191l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e9, code lost:
    
        if (r1 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01eb, code lost:
    
        r7 = 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ee, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ef, code lost:
    
        r12 = r7 | (r3.f25190k[r2] ? 1 : 0);
        r2 = r3.f25180a.f25081a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01f9, code lost:
    
        if (r1 == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01fb, code lost:
    
        r1 = r3.f25193n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01fd, code lost:
    
        if (r1 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ff, code lost:
    
        r1 = r1.f25179b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0201, code lost:
    
        r15 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0203, code lost:
    
        r1 = r4.f25174h[r2].f25179b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x020a, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x020b, code lost:
    
        r1 = r27.f25099f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x020d, code lost:
    
        if (r1 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x020f, code lost:
    
        r5 = r1.a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0213, code lost:
    
        r9.a(r5, r12, r27.f25114u, 0, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0220, code lost:
    
        if (r27.f25103j.isEmpty() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0222, code lost:
    
        r1 = r27.f25113t;
        r1.f25091e++;
        r2 = r1.f25092f + 1;
        r1.f25092f = r2;
        r3 = r3.f25186g;
        r4 = r1.f25093g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0236, code lost:
    
        if (r2 != r3[r4]) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0238, code lost:
    
        r1.f25093g = r4 + 1;
        r5 = 0;
        r1.f25092f = 0;
        r27.f25113t = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0244, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0246, code lost:
    
        r27.f25104k = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0248, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0249, code lost:
    
        r27.f25110q -= ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k) r27.f25103j.removeFirst()).f25086b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x025a, code lost:
    
        throw null;
     */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r28, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o r29) throws java.lang.InterruptedException, com.fyber.inneractive.sdk.player.exoplayer2.r, java.io.EOFException {
        /*
            Method dump skipped, instructions count: 1367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.m.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:214:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r52) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        /*
            Method dump skipped, instructions count: 1705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.m.a(long):void");
    }

    public static void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i10, u uVar) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        nVar.e(i10 + 8);
        int iB = nVar.b();
        int i11 = c.f25001b;
        if ((iB & 1) == 0) {
            boolean z10 = (iB & 2) != 0;
            int iM = nVar.m();
            if (iM == uVar.f25184e) {
                Arrays.fill(uVar.f25192m, 0, iM, z10);
                int i12 = nVar.f26044c - nVar.f26043b;
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = uVar.f25195p;
                if (nVar2 == null || nVar2.f26044c < i12) {
                    uVar.f25195p = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(i12);
                }
                uVar.f25194o = i12;
                uVar.f25191l = true;
                uVar.f25196q = true;
                nVar.a(uVar.f25195p.f26042a, 0, i12);
                uVar.f25195p.e(0);
                uVar.f25196q = false;
                return;
            }
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Length mismatch: ", iM, ", ");
            sbA.append(uVar.f25184e);
            throw new com.fyber.inneractive.sdk.player.exoplayer2.r(sbA.toString());
        }
        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.drm.d a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) arrayList.get(i10);
            if (bVar.f25051a == c.V) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = bVar.P0.f26042a;
                UUID uuidA = q.a(bArr);
                if (uuidA == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new com.fyber.inneractive.sdk.player.exoplayer2.drm.c(uuidA, MimeTypes.VIDEO_MP4, bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new com.fyber.inneractive.sdk.player.exoplayer2.drm.d(false, (com.fyber.inneractive.sdk.player.exoplayer2.drm.c[]) arrayList2.toArray(new com.fyber.inneractive.sdk.player.exoplayer2.drm.c[arrayList2.size()]));
    }
}
