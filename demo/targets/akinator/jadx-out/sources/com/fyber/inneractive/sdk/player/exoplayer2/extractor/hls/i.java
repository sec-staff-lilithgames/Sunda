package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.os.Handler;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.source.r;
import com.fyber.inneractive.sdk.player.exoplayer2.source.s;
import com.fyber.inneractive.sdk.player.exoplayer2.source.v;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;
import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i implements s {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k f24762a;

    /* renamed from: b, reason: collision with root package name */
    public final b f24763b;

    /* renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.f f24765d;

    /* renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b f24766e;

    /* renamed from: i, reason: collision with root package name */
    public final long f24770i;

    /* renamed from: j, reason: collision with root package name */
    public r f24771j;

    /* renamed from: k, reason: collision with root package name */
    public int f24772k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f24773l;

    /* renamed from: m, reason: collision with root package name */
    public z f24774m;

    /* renamed from: n, reason: collision with root package name */
    public n[] f24775n;

    /* renamed from: o, reason: collision with root package name */
    public n[] f24776o;

    /* renamed from: p, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.source.h f24777p;

    /* renamed from: c, reason: collision with root package name */
    public final int f24764c = 3;

    /* renamed from: f, reason: collision with root package name */
    public final IdentityHashMap f24767f = new IdentityHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final o f24768g = new o();

    /* renamed from: h, reason: collision with root package name */
    public final Handler f24769h = new Handler();

    public i(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar, b bVar, com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar2, long j10) {
        this.f24762a = kVar;
        this.f24763b = bVar;
        this.f24765d = fVar;
        this.f24766e = bVar2;
        this.f24770i = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final void a(r rVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar;
        this.f24762a.f24893g.add(this);
        this.f24771j = rVar;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b bVar = this.f24762a.f24896j;
        ArrayList arrayList = new ArrayList(bVar.f24822b);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a) arrayList.get(i10);
            com.fyber.inneractive.sdk.player.exoplayer2.o oVar = aVar.f24821b;
            if (oVar.f25706k > 0) {
                arrayList2.add(aVar);
                break;
                break;
            }
            String str = oVar.f25698c;
            if (!TextUtils.isEmpty(str)) {
                for (String str2 : str.split("(\\s*,\\s*)|(\\s*$)")) {
                    if (str2.startsWith("avc")) {
                        arrayList2.add(aVar);
                        break;
                    }
                }
            }
            String str3 = aVar.f24821b.f25698c;
            if (!TextUtils.isEmpty(str3)) {
                String[] strArrSplit = str3.split("(\\s*,\\s*)|(\\s*$)");
                int length = strArrSplit.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    }
                    if (strArrSplit[i11].startsWith("mp4a")) {
                        arrayList3.add(aVar);
                        break;
                    }
                    i11++;
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        } else if (arrayList3.size() < arrayList.size()) {
            arrayList.removeAll(arrayList3);
        }
        List list = bVar.f24823c;
        List list2 = bVar.f24824d;
        int size = list2.size() + list.size() + 1;
        this.f24775n = new n[size];
        this.f24772k = size;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException();
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[] aVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[arrayList.size()];
        arrayList.toArray(aVarArr);
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = bVar.f24825e;
        f fVar = new f(this.f24762a, aVarArr, this.f24763b, this.f24768g, bVar.f24826f);
        n nVar = new n(0, this, fVar, this.f24766e, this.f24770i, oVar2, this.f24764c, this.f24765d);
        this.f24775n[0] = nVar;
        fVar.f24736h = true;
        if (!nVar.f24800o) {
            nVar.b(nVar.f24808w);
        }
        int i12 = 0;
        int i13 = 1;
        while (i12 < list.size()) {
            n nVar2 = new n(1, this, new f(this.f24762a, new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[]{(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a) list.get(i12)}, this.f24763b, this.f24768g, Collections.EMPTY_LIST), this.f24766e, this.f24770i, null, this.f24764c, this.f24765d);
            int i14 = i13 + 1;
            this.f24775n[i13] = nVar2;
            if (!nVar2.f24800o) {
                nVar2.b(nVar2.f24808w);
            }
            i12++;
            i13 = i14;
        }
        int i15 = 0;
        while (i15 < list2.size()) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a) list2.get(i15);
            f fVar2 = new f(this.f24762a, new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[]{aVar2}, this.f24763b, this.f24768g, Collections.EMPTY_LIST);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar2 = this.f24766e;
            n nVar3 = new n(3, this, fVar2, bVar2, this.f24770i, null, this.f24764c, this.f24765d);
            com.fyber.inneractive.sdk.player.exoplayer2.o oVar3 = aVar2.f24821b;
            if (nVar3.f24795j.indexOfKey(0) >= 0) {
                gVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar3.f24795j.get(0);
            } else {
                gVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.g(bVar2);
                gVar.f24714n = nVar3;
                gVar.f24703c.f24675r = nVar3.f24803r;
                nVar3.f24795j.put(0, gVar);
            }
            gVar.a(oVar3);
            nVar3.f24799n = true;
            nVar3.h();
            this.f24775n[i13] = nVar3;
            i15++;
            i13++;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final boolean b(long j10) {
        return this.f24777p.b(j10);
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long c() {
        /*
            r18 = this;
            r0 = r18
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.n[] r1 = r0.f24776o
            int r2 = r1.length
            r5 = 0
            r6 = r5
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        Lc:
            r9 = -9223372036854775808
            if (r6 >= r2) goto L85
            r11 = r1[r6]
            boolean r12 = r11.f24810y
            if (r12 == 0) goto L1d
            r12 = r9
        L17:
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L7a
        L1d:
            long r12 = r11.f24809x
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 == 0) goto L29
            goto L17
        L29:
            long r12 = r11.f24808w
            java.util.LinkedList r14 = r11.f24796k
            java.lang.Object r14 = r14.getLast()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h r14 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h) r14
            boolean r15 = r14.F
            if (r15 == 0) goto L38
            goto L51
        L38:
            java.util.LinkedList r14 = r11.f24796k
            int r14 = r14.size()
            r15 = 1
            if (r14 <= r15) goto L50
            java.util.LinkedList r14 = r11.f24796k
            int r15 = r14.size()
            int r15 = r15 + (-2)
            java.lang.Object r14 = r14.get(r15)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h r14 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h) r14
            goto L51
        L50:
            r14 = 0
        L51:
            if (r14 == 0) goto L59
            long r14 = r14.f25745g
            long r12 = java.lang.Math.max(r12, r14)
        L59:
            android.util.SparseArray r14 = r11.f24795j
            int r14 = r14.size()
            r15 = r5
        L60:
            if (r15 >= r14) goto L17
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            android.util.SparseArray r3 = r11.f24795j
            java.lang.Object r3 = r3.valueAt(r15)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) r3
            long r3 = r3.d()
            long r12 = java.lang.Math.max(r12, r3)
            int r15 = r15 + 1
            goto L60
        L7a:
            int r3 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r3 == 0) goto L82
            long r7 = java.lang.Math.min(r7, r12)
        L82:
            int r6 = r6 + 1
            goto Lc
        L85:
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 != 0) goto L8f
            return r9
        L8f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i.c():long");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final void d() throws IOException {
        n[] nVarArr = this.f24775n;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                nVar.f24792g.b();
                f fVar = nVar.f24788c;
                com.fyber.inneractive.sdk.player.exoplayer2.source.g gVar = fVar.f24738j;
                if (gVar != null) {
                    throw gVar;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar = fVar.f24739k;
                if (aVar != null) {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h hVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) fVar.f24733e.f24890d.get(aVar);
                    hVar.f24877b.b();
                    IOException iOException = hVar.f24885j;
                    if (iOException != null) {
                        throw iOException;
                    }
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final long f() {
        return this.f24777p.f();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long g() {
        return C.TIME_UNSET;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final z a() {
        return this.f24774m;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[] bVarArr, boolean[] zArr, v[] vVarArr, boolean[] zArr2, long j10) {
        int[] iArr;
        int i10;
        boolean z10;
        v[] vVarArr2;
        int i11;
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[] bVarArr2;
        int i12;
        int[] iArr2;
        int[] iArr3 = new int[bVarArr.length];
        int[] iArr4 = new int[bVarArr.length];
        for (int i13 = 0; i13 < bVarArr.length; i13++) {
            v vVar = vVarArr[i13];
            iArr3[i13] = vVar == null ? -1 : ((Integer) this.f24767f.get(vVar)).intValue();
            iArr4[i13] = -1;
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = bVarArr[i13];
            if (bVar != null) {
                y yVar = bVar.f25833a;
                int i14 = 0;
                while (true) {
                    n[] nVarArr = this.f24775n;
                    if (i14 < nVarArr.length) {
                        z zVar = nVarArr[i14].f24805t;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= zVar.f25825a) {
                                i15 = -1;
                                break;
                            }
                            if (zVar.f25826b[i15] == yVar) {
                                break;
                            }
                            i15++;
                        }
                        if (i15 != -1) {
                            iArr4[i13] = i14;
                            break;
                        }
                        i14++;
                    }
                }
            }
        }
        this.f24767f.clear();
        int length = bVarArr.length;
        v[] vVarArr3 = new v[length];
        v[] vVarArr4 = new v[bVarArr.length];
        int length2 = bVarArr.length;
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[] bVarArr3 = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[length2];
        ArrayList arrayList = new ArrayList(this.f24775n.length);
        int i16 = 0;
        boolean z11 = false;
        while (i16 < this.f24775n.length) {
            int i17 = 0;
            while (true) {
                iArr = iArr3;
                if (i17 >= bVarArr.length) {
                    break;
                }
                vVarArr4[i17] = iArr[i17] == i16 ? vVarArr[i17] : null;
                bVarArr3[i17] = iArr4[i17] == i16 ? bVarArr[i17] : null;
                i17++;
                iArr3 = iArr;
            }
            n nVar = this.f24775n[i16];
            boolean z12 = this.f24773l;
            if (nVar.f24800o) {
                int i18 = 0;
                while (i18 < length2) {
                    v vVar2 = vVarArr4[i18];
                    if (vVar2 == null || (bVarArr3[i18] != null && zArr[i18])) {
                        i12 = i18;
                        iArr2 = iArr4;
                    } else {
                        i12 = i18;
                        int i19 = ((k) vVar2).f24783a;
                        iArr2 = iArr4;
                        boolean[] zArr3 = nVar.f24807v;
                        if (zArr3[i19]) {
                            zArr3[i19] = false;
                            nVar.f24801p--;
                            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f24795j.valueAt(i19)).b();
                            vVarArr4[i12] = null;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    i18 = i12 + 1;
                    iArr4 = iArr2;
                }
                int[] iArr5 = iArr4;
                int i20 = 0;
                boolean z13 = false;
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar2 = null;
                while (i20 < length2) {
                    if (vVarArr4[i20] == null) {
                        i10 = i20;
                        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar3 = bVarArr3[i10];
                        z10 = z12;
                        if (bVar3 != null) {
                            z zVar2 = nVar.f24805t;
                            vVarArr2 = vVarArr4;
                            y yVar2 = bVar3.f25833a;
                            i11 = length2;
                            bVarArr2 = bVarArr3;
                            int i21 = 0;
                            while (true) {
                                if (i21 >= zVar2.f25825a) {
                                    i21 = -1;
                                    break;
                                }
                                if (zVar2.f25826b[i21] == yVar2) {
                                    break;
                                }
                                i21++;
                            }
                            boolean[] zArr4 = nVar.f24807v;
                            if (!zArr4[i21]) {
                                zArr4[i21] = true;
                                nVar.f24801p++;
                                if (i21 == nVar.f24806u) {
                                    nVar.f24788c.f24744p = bVar3;
                                    bVar2 = bVar3;
                                }
                                vVarArr2[i10] = new k(nVar, i21);
                                zArr2[i10] = true;
                                z13 = true;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        i20 = i10 + 1;
                        z12 = z10;
                        vVarArr4 = vVarArr2;
                        length2 = i11;
                        bVarArr3 = bVarArr2;
                    } else {
                        i10 = i20;
                        z10 = z12;
                    }
                    vVarArr2 = vVarArr4;
                    i11 = length2;
                    bVarArr2 = bVarArr3;
                    i20 = i10 + 1;
                    z12 = z10;
                    vVarArr4 = vVarArr2;
                    length2 = i11;
                    bVarArr3 = bVarArr2;
                }
                v[] vVarArr5 = vVarArr4;
                int i22 = length2;
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[] bVarArr4 = bVarArr3;
                if (!z12) {
                    int size = nVar.f24795j.size();
                    for (int i23 = 0; i23 < size; i23++) {
                        if (!nVar.f24807v[i23]) {
                            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f24795j.valueAt(i23)).b();
                        }
                    }
                    if (bVar2 != null && !nVar.f24796k.isEmpty()) {
                        bVar2.d();
                        if (bVar2.f25835c[bVar2.a()] != nVar.f24788c.f24734f.a(((h) nVar.f24796k.getLast()).f25741c)) {
                            nVar.c(nVar.f24808w);
                        }
                    }
                }
                if (nVar.f24801p == 0) {
                    nVar.f24788c.f24738j = null;
                    nVar.f24802q = null;
                    nVar.f24796k.clear();
                    if (nVar.f24792g.a()) {
                        nVar.f24792g.f25852b.a(false);
                    }
                }
                z11 |= z13;
                boolean z14 = false;
                for (int i24 = 0; i24 < bVarArr.length; i24++) {
                    if (iArr5[i24] == i16) {
                        v vVar3 = vVarArr5[i24];
                        if (vVar3 != null) {
                            vVarArr3[i24] = vVar3;
                            this.f24767f.put(vVarArr5[i24], Integer.valueOf(i16));
                            z14 = true;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else if (iArr[i24] == i16 && vVarArr5[i24] != null) {
                        throw new IllegalStateException();
                    }
                }
                if (z14) {
                    arrayList.add(this.f24775n[i16]);
                }
                i16++;
                iArr3 = iArr;
                iArr4 = iArr5;
                vVarArr4 = vVarArr5;
                length2 = i22;
                bVarArr3 = bVarArr4;
            } else {
                throw new IllegalStateException();
            }
        }
        System.arraycopy(vVarArr3, 0, vVarArr, 0, length);
        n[] nVarArr2 = new n[arrayList.size()];
        this.f24776o = nVarArr2;
        arrayList.toArray(nVarArr2);
        n[] nVarArr3 = this.f24776o;
        if (nVarArr3.length > 0) {
            nVarArr3[0].f24788c.f24736h = true;
            int i25 = 1;
            while (true) {
                n[] nVarArr4 = this.f24776o;
                if (i25 >= nVarArr4.length) {
                    break;
                }
                nVarArr4[i25].f24788c.f24736h = false;
                i25++;
            }
        }
        this.f24777p = new com.fyber.inneractive.sdk.player.exoplayer2.source.h(this.f24776o);
        if (this.f24773l && z11) {
            a(j10);
            for (int i26 = 0; i26 < bVarArr.length; i26++) {
                if (vVarArr[i26] != null) {
                    zArr2[i26] = true;
                }
            }
        }
        this.f24773l = true;
        return j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long a(long j10) {
        this.f24768g.f24811a.clear();
        for (n nVar : this.f24776o) {
            nVar.c(j10);
        }
        return j10;
    }
}
