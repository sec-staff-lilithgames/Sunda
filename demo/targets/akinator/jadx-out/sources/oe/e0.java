package oe;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.util.h1;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e0 implements ee.p {

    /* renamed from: a, reason: collision with root package name */
    public final int f79034a;

    /* renamed from: b, reason: collision with root package name */
    public final int f79035b;

    /* renamed from: c, reason: collision with root package name */
    public final List f79036c;

    /* renamed from: d, reason: collision with root package name */
    public final v0 f79037d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseIntArray f79038e;

    /* renamed from: f, reason: collision with root package name */
    public final h0 f79039f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseArray f79040g;

    /* renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f79041h;

    /* renamed from: i, reason: collision with root package name */
    public final SparseBooleanArray f79042i;

    /* renamed from: j, reason: collision with root package name */
    public final d0 f79043j;

    /* renamed from: k, reason: collision with root package name */
    public c0 f79044k;

    /* renamed from: l, reason: collision with root package name */
    public ee.s f79045l;

    /* renamed from: m, reason: collision with root package name */
    public int f79046m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f79047n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f79048o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f79049p;

    /* renamed from: q, reason: collision with root package name */
    public j0 f79050q;

    /* renamed from: r, reason: collision with root package name */
    public int f79051r;

    /* renamed from: s, reason: collision with root package name */
    public int f79052s;

    public e0() {
        this(0);
    }

    @Override // ee.p
    public void init(ee.s sVar) {
        this.f79045l = sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    @Override // ee.p
    public int read(ee.q qVar, ee.f0 f0Var) throws IOException {
        long j10;
        ?? r11;
        boolean z10;
        boolean z11;
        long length = qVar.getLength();
        boolean z12 = this.f79047n;
        int i10 = this.f79034a;
        if (z12) {
            d0 d0Var = this.f79043j;
            if (length != -1 && i10 != 2 && !d0Var.isDurationReadFinished()) {
                return d0Var.readDuration(qVar, f0Var, this.f79052s);
            }
            if (this.f79048o) {
                j10 = -1;
                z11 = false;
            } else {
                this.f79048o = true;
                if (d0Var.getDurationUs() != C.TIME_UNSET) {
                    j10 = -1;
                    z11 = false;
                    c0 c0Var = new c0(d0Var.getPcrTimestampAdjuster(), d0Var.getDurationUs(), length, this.f79052s, this.f79035b);
                    this.f79044k = c0Var;
                    this.f79045l.seekMap(c0Var.getSeekMap());
                } else {
                    j10 = -1;
                    z11 = false;
                    this.f79045l.seekMap(new ee.h0(d0Var.getDurationUs()));
                }
            }
            if (this.f79049p) {
                this.f79049p = z11;
                seek(0L, 0L);
                if (qVar.getPosition() != 0) {
                    f0Var.f54188a = 0L;
                    return 1;
                }
            }
            c0 c0Var2 = this.f79044k;
            r11 = z11;
            if (c0Var2 != null) {
                r11 = z11;
                if (c0Var2.isSeeking()) {
                    return this.f79044k.handlePendingSeek(qVar, f0Var);
                }
            }
        } else {
            j10 = -1;
            r11 = 0;
        }
        v0 v0Var = this.f79037d;
        byte[] data = v0Var.getData();
        if (9400 - v0Var.getPosition() < 188) {
            int iBytesLeft = v0Var.bytesLeft();
            if (iBytesLeft > 0) {
                System.arraycopy(data, v0Var.getPosition(), data, r11, iBytesLeft);
            }
            v0Var.reset(data, iBytesLeft);
        }
        while (v0Var.bytesLeft() < 188) {
            int iLimit = v0Var.limit();
            int i11 = qVar.read(data, iLimit, 9400 - iLimit);
            if (i11 == -1) {
                return -1;
            }
            v0Var.setLimit(iLimit + i11);
        }
        int position = v0Var.getPosition();
        int iLimit2 = v0Var.limit();
        int iFindSyncBytePosition = k0.findSyncBytePosition(v0Var.getData(), position, iLimit2);
        v0Var.setPosition(iFindSyncBytePosition);
        int i12 = iFindSyncBytePosition + 188;
        if (i12 > iLimit2) {
            int i13 = (iFindSyncBytePosition - position) + this.f79051r;
            this.f79051r = i13;
            if (i10 == 2 && i13 > 376) {
                throw h2.createForMalformedContainer("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.f79051r = r11;
        }
        int iLimit3 = v0Var.limit();
        if (i12 > iLimit3) {
            return r11;
        }
        int i14 = v0Var.readInt();
        if ((8388608 & i14) != 0) {
            v0Var.setPosition(i12);
            return r11;
        }
        int i15 = (4194304 & i14) != 0 ? 1 : r11;
        int i16 = (2096896 & i14) >> 8;
        boolean z13 = (i14 & 32) != 0 ? true : r11;
        j0 j0Var = (i14 & 16) != 0 ? (j0) this.f79040g.get(i16) : null;
        if (j0Var == null) {
            v0Var.setPosition(i12);
            return r11;
        }
        if (i10 != 2) {
            int i17 = i14 & 15;
            z10 = true;
            SparseIntArray sparseIntArray = this.f79038e;
            int i18 = sparseIntArray.get(i16, i17 - 1);
            sparseIntArray.put(i16, i17);
            if (i18 == i17) {
                v0Var.setPosition(i12);
                return r11;
            }
            if (i17 != ((i18 + 1) & 15)) {
                j0Var.seek();
            }
        } else {
            z10 = true;
        }
        if (z13) {
            int unsignedByte = v0Var.readUnsignedByte();
            i15 |= (v0Var.readUnsignedByte() & 64) != 0 ? 2 : r11;
            v0Var.skipBytes(unsignedByte - 1);
        }
        boolean z14 = this.f79047n;
        if (i10 == 2 || z14 || !this.f79042i.get(i16, r11)) {
            v0Var.setLimit(i12);
            j0Var.consume(v0Var, i15);
            v0Var.setLimit(iLimit3);
        }
        if (i10 != 2 && !z14 && this.f79047n && length != j10) {
            this.f79049p = z10;
        }
        v0Var.setPosition(i12);
        return r11;
    }

    @Override // ee.p
    public void seek(long j10, long j11) {
        c0 c0Var;
        com.google.android.exoplayer2.util.a.checkState(this.f79034a != 2);
        List list = this.f79036c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            h1 h1Var = (h1) list.get(i10);
            boolean z10 = h1Var.getTimestampOffsetUs() == C.TIME_UNSET;
            if (!z10) {
                long firstSampleTimestampUs = h1Var.getFirstSampleTimestampUs();
                z10 = (firstSampleTimestampUs == C.TIME_UNSET || firstSampleTimestampUs == 0 || firstSampleTimestampUs == j11) ? false : true;
            }
            if (z10) {
                h1Var.reset(j11);
            }
        }
        if (j11 != 0 && (c0Var = this.f79044k) != null) {
            c0Var.setSeekTargetUs(j11);
        }
        this.f79037d.reset(0);
        this.f79038e.clear();
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.f79040g;
            if (i11 >= sparseArray.size()) {
                this.f79051r = 0;
                return;
            } else {
                ((j0) sparseArray.valueAt(i11)).seek();
                i11++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // ee.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean sniff(ee.q r7) throws java.io.IOException {
        /*
            r6 = this;
            com.google.android.exoplayer2.util.v0 r0 = r6.f79037d
            byte[] r0 = r0.getData()
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.peekFully(r0, r2, r1)
            r1 = r2
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L29
            r3 = r2
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r1 = r1 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.skipFully(r1)
            r7 = 1
            return r7
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.e0.sniff(ee.q):boolean");
    }

    public e0(int i10) {
        this(1, i10, 112800);
    }

    public e0(int i10, int i11, int i12) {
        this(i10, new h1(0L), new g(i11), i12);
    }

    public e0(int i10, h1 h1Var, h0 h0Var) {
        this(i10, h1Var, h0Var, 112800);
    }

    public e0(int i10, h1 h1Var, h0 h0Var, int i11) {
        h0 h0Var2 = (h0) com.google.android.exoplayer2.util.a.checkNotNull(h0Var);
        this.f79039f = h0Var2;
        this.f79035b = i11;
        this.f79034a = i10;
        if (i10 != 1 && i10 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f79036c = arrayList;
            arrayList.add(h1Var);
        } else {
            this.f79036c = Collections.singletonList(h1Var);
        }
        this.f79037d = new v0(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f79041h = sparseBooleanArray;
        this.f79042i = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f79040g = sparseArray;
        this.f79038e = new SparseIntArray();
        this.f79043j = new d0(i11);
        this.f79045l = ee.s.K8;
        this.f79052s = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray<j0> sparseArrayCreateInitialPayloadReaders = h0Var2.createInitialPayloadReaders();
        int size = sparseArrayCreateInitialPayloadReaders.size();
        for (int i12 = 0; i12 < size; i12++) {
            sparseArray.put(sparseArrayCreateInitialPayloadReaders.keyAt(i12), sparseArrayCreateInitialPayloadReaders.valueAt(i12));
        }
        sparseArray.put(0, new a0(new a()));
        this.f79050q = null;
    }

    @Override // ee.p
    public void release() {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements z {

        /* renamed from: a, reason: collision with root package name */
        public final u0 f79053a = new u0(new byte[4]);

        public a() {
        }

        @Override // oe.z
        public void consume(v0 v0Var) {
            e0 e0Var;
            if (v0Var.readUnsignedByte() == 0 && (v0Var.readUnsignedByte() & 128) != 0) {
                v0Var.skipBytes(6);
                int iBytesLeft = v0Var.bytesLeft() / 4;
                int i10 = 0;
                while (true) {
                    e0Var = e0.this;
                    if (i10 >= iBytesLeft) {
                        break;
                    }
                    u0 u0Var = this.f79053a;
                    v0Var.readBytes(u0Var, 4);
                    int bits = u0Var.readBits(16);
                    u0Var.skipBits(3);
                    if (bits == 0) {
                        u0Var.skipBits(13);
                    } else {
                        int bits2 = u0Var.readBits(13);
                        if (e0Var.f79040g.get(bits2) == null) {
                            e0Var.f79040g.put(bits2, new a0(e0Var.new b(bits2)));
                            e0Var.f79046m++;
                        }
                    }
                    i10++;
                }
                if (e0Var.f79034a != 2) {
                    e0Var.f79040g.remove(0);
                }
            }
        }

        @Override // oe.z
        public void init(h1 h1Var, ee.s sVar, i0 i0Var) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements z {

        /* renamed from: a, reason: collision with root package name */
        public final u0 f79055a = new u0(new byte[5]);

        /* renamed from: b, reason: collision with root package name */
        public final SparseArray f79056b = new SparseArray();

        /* renamed from: c, reason: collision with root package name */
        public final SparseIntArray f79057c = new SparseIntArray();

        /* renamed from: d, reason: collision with root package name */
        public final int f79058d;

        public b(int i10) {
            this.f79058d = i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x0124  */
        @Override // oe.z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void consume(com.google.android.exoplayer2.util.v0 r30) {
            /*
                Method dump skipped, instructions count: 724
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: oe.e0.b.consume(com.google.android.exoplayer2.util.v0):void");
        }

        @Override // oe.z
        public void init(h1 h1Var, ee.s sVar, i0 i0Var) {
        }
    }
}
