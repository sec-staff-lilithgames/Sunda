package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b0 implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {

    /* renamed from: l, reason: collision with root package name */
    public static final long f25314l = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("AC-3");

    /* renamed from: m, reason: collision with root package name */
    public static final long f25315m = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("EAC3");

    /* renamed from: n, reason: collision with root package name */
    public static final long f25316n = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("HEVC");

    /* renamed from: a, reason: collision with root package name */
    public final int f25317a;

    /* renamed from: b, reason: collision with root package name */
    public final List f25318b;

    /* renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f25319c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f25320d;

    /* renamed from: e, reason: collision with root package name */
    public final e f25321e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseArray f25322f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseBooleanArray f25323g;

    /* renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f25324h;

    /* renamed from: i, reason: collision with root package name */
    public int f25325i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f25326j;

    /* renamed from: k, reason: collision with root package name */
    public f0 f25327k;

    public b0(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, e eVar) {
        this.f25321e = eVar;
        this.f25317a = i10;
        if (i10 == 1 || i10 == 2) {
            this.f25318b = Collections.singletonList(vVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f25318b = arrayList;
            arrayList.add(vVar);
        }
        this.f25319c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(940);
        this.f25323g = new SparseBooleanArray();
        this.f25322f = new SparseArray();
        this.f25320d = new SparseIntArray();
        a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r7) throws java.lang.InterruptedException, java.io.EOFException {
        /*
            r6 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.util.n r0 = r6.f25319c
            byte[] r0 = r0.f26042a
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.a(r0, r2, r1, r2)
            r1 = r2
        Lb:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L27
            r3 = r2
        L10:
            r4 = 5
            if (r3 != r4) goto L18
            r7.a(r1)
            r7 = 1
            return r7
        L18:
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L24
            int r1 = r1 + 1
            goto Lb
        L24:
            int r3 = r3 + 1
            goto L10
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b0.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b):boolean");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.f25324h = jVar;
        jVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(C.TIME_UNSET));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        int size = this.f25318b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.util.v) this.f25318b.get(i10)).f26068c = C.TIME_UNSET;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f25319c;
        nVar.f26043b = 0;
        nVar.f26044c = 0;
        this.f25320d.clear();
        a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, EOFException {
        f0 f0Var;
        int iMin;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar2;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f25319c;
        byte[] bArr = nVar.f26042a;
        int i10 = nVar.f26043b;
        if (940 - i10 < 188) {
            int i11 = nVar.f26044c - i10;
            if (i11 > 0) {
                System.arraycopy(bArr, i10, bArr, 0, i11);
            }
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f25319c;
            nVar2.f26042a = bArr;
            nVar2.f26044c = i11;
            nVar2.f26043b = 0;
        }
        while (true) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.f25319c;
            int i12 = nVar3.f26044c;
            int i13 = nVar3.f26043b;
            if (i12 - i13 < 188) {
                int i14 = 940 - i12;
                int i15 = bVar.f24652f;
                if (i15 == 0) {
                    iMin = 0;
                } else {
                    iMin = Math.min(i15, i14);
                    System.arraycopy(bVar.f24650d, 0, bArr, i12, iMin);
                    bVar.b(iMin);
                }
                if (iMin == 0) {
                    bVar2 = bVar;
                    iMin = bVar2.a(bArr, i12, i14, 0, true);
                } else {
                    bVar2 = bVar;
                }
                if (iMin != -1) {
                    bVar2.f24649c += iMin;
                }
                if (iMin == -1) {
                    return -1;
                }
                this.f25319c.d(i12 + iMin);
                bVar = bVar2;
            } else {
                while (i13 < i12 && bArr[i13] != 71) {
                    i13++;
                }
                this.f25319c.e(i13);
                int i16 = i13 + 188;
                if (i16 > i12) {
                    return 0;
                }
                int iB = this.f25319c.b();
                if ((8388608 & iB) != 0) {
                    this.f25319c.e(i16);
                    return 0;
                }
                boolean z10 = true;
                boolean z11 = (4194304 & iB) != 0;
                int i17 = (2096896 & iB) >> 8;
                boolean z12 = (iB & 32) != 0;
                boolean z13 = (iB & 16) != 0;
                if (this.f25317a != 2) {
                    int i18 = iB & 15;
                    int i19 = this.f25320d.get(i17, i18 - 1);
                    this.f25320d.put(i17, i18);
                    if (i19 == i18) {
                        if (z13) {
                            this.f25319c.e(i16);
                            return 0;
                        }
                    } else if (i18 == ((i19 + 1) & 15)) {
                    }
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (z12) {
                    int iJ = this.f25319c.j();
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = this.f25319c;
                    nVar4.e(nVar4.f26043b + iJ);
                }
                if (z13 && (f0Var = (f0) this.f25322f.get(i17)) != null) {
                    if (z10) {
                        f0Var.a();
                    }
                    this.f25319c.d(i16);
                    f0Var.a(this.f25319c, z11);
                    this.f25319c.d(i12);
                }
                this.f25319c.e(i16);
                return 0;
            }
        }
    }

    public final void a() {
        this.f25323g.clear();
        this.f25322f.clear();
        this.f25321e.getClass();
        SparseArray sparseArray = new SparseArray();
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f25322f.put(sparseArray.keyAt(i10), (f0) sparseArray.valueAt(i10));
        }
        this.f25322f.put(0, new w(new z(this)));
        this.f25327k = null;
    }
}
