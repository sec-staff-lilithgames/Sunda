package rp;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.z0;
import io.bidmachine.media3.common.util.u0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ko.v0;
import ko.x0;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i0 implements ko.z {

    /* renamed from: a, reason: collision with root package name */
    public final int f84672a;

    /* renamed from: b, reason: collision with root package name */
    public final int f84673b;

    /* renamed from: c, reason: collision with root package name */
    public final int f84674c;

    /* renamed from: d, reason: collision with root package name */
    public final List f84675d;

    /* renamed from: e, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.m0 f84676e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseIntArray f84677f;

    /* renamed from: g, reason: collision with root package name */
    public final l0 f84678g;

    /* renamed from: h, reason: collision with root package name */
    public final hp.q f84679h;

    /* renamed from: i, reason: collision with root package name */
    public final SparseArray f84680i;

    /* renamed from: j, reason: collision with root package name */
    public final SparseBooleanArray f84681j;

    /* renamed from: k, reason: collision with root package name */
    public final SparseBooleanArray f84682k;

    /* renamed from: l, reason: collision with root package name */
    public final h0 f84683l;

    /* renamed from: m, reason: collision with root package name */
    public g0 f84684m;

    /* renamed from: n, reason: collision with root package name */
    public ko.c0 f84685n;

    /* renamed from: o, reason: collision with root package name */
    public int f84686o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f84687p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f84688q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f84689r;

    /* renamed from: s, reason: collision with root package name */
    public n0 f84690s;

    /* renamed from: t, reason: collision with root package name */
    public int f84691t;

    /* renamed from: u, reason: collision with root package name */
    public int f84692u;

    @Deprecated
    public i0() {
        this(1, 1, hp.q.f59124a, new u0(0L), new g(0), 112800);
    }

    public static ko.e0 newFactory(hp.q qVar) {
        return new cp.e(qVar, 3);
    }

    @Override // ko.z
    public /* bridge */ /* synthetic */ List getSniffFailureDetails() {
        return super.getSniffFailureDetails();
    }

    @Override // ko.z
    @SideEffectFree
    public /* bridge */ /* synthetic */ ko.z getUnderlyingImplementation() {
        return super.getUnderlyingImplementation();
    }

    @Override // ko.z
    public void init(ko.c0 c0Var) {
        if ((this.f84673b & 1) == 0) {
            c0Var = new hp.t(c0Var, this.f84679h);
        }
        this.f84685n = c0Var;
    }

    @Override // ko.z
    public int read(ko.a0 a0Var, v0 v0Var) throws IOException {
        boolean z10;
        long length = a0Var.getLength();
        int i10 = this.f84672a;
        boolean z11 = i10 == 2;
        if (this.f84687p) {
            h0 h0Var = this.f84683l;
            if (length != -1 && !z11 && !h0Var.isDurationReadFinished()) {
                return h0Var.readDuration(a0Var, v0Var, this.f84692u);
            }
            if (!this.f84688q) {
                this.f84688q = true;
                if (h0Var.getDurationUs() != C.TIME_UNSET) {
                    g0 g0Var = new g0(h0Var.getPcrTimestampAdjuster(), h0Var.getDurationUs(), length, this.f84692u, this.f84674c);
                    this.f84684m = g0Var;
                    this.f84685n.seekMap(g0Var.getSeekMap());
                } else {
                    this.f84685n.seekMap(new x0(h0Var.getDurationUs()));
                }
            }
            if (this.f84689r) {
                this.f84689r = false;
                seek(0L, 0L);
                if (a0Var.getPosition() != 0) {
                    v0Var.f71790a = 0L;
                    return 1;
                }
            }
            g0 g0Var2 = this.f84684m;
            if (g0Var2 != null && g0Var2.isSeeking()) {
                return this.f84684m.handlePendingSeek(a0Var, v0Var);
            }
        }
        io.bidmachine.media3.common.util.m0 m0Var = this.f84676e;
        byte[] data = m0Var.getData();
        if (9400 - m0Var.getPosition() < 188) {
            int iBytesLeft = m0Var.bytesLeft();
            if (iBytesLeft > 0) {
                System.arraycopy(data, m0Var.getPosition(), data, 0, iBytesLeft);
            }
            m0Var.reset(data, iBytesLeft);
        }
        while (true) {
            int iBytesLeft2 = m0Var.bytesLeft();
            SparseArray sparseArray = this.f84680i;
            if (iBytesLeft2 >= 188) {
                int position = m0Var.getPosition();
                int iLimit = m0Var.limit();
                int iFindSyncBytePosition = o0.findSyncBytePosition(m0Var.getData(), position, iLimit);
                m0Var.setPosition(iFindSyncBytePosition);
                int i11 = iFindSyncBytePosition + 188;
                if (i11 > iLimit) {
                    int i12 = (iFindSyncBytePosition - position) + this.f84691t;
                    this.f84691t = i12;
                    if (i10 == 2 && i12 > 376) {
                        throw z0.createForMalformedContainer("Cannot find sync byte. Most likely not a Transport Stream.", null);
                    }
                } else {
                    this.f84691t = 0;
                }
                int iLimit2 = m0Var.limit();
                if (i11 > iLimit2) {
                    return 0;
                }
                int i13 = m0Var.readInt();
                if ((8388608 & i13) != 0) {
                    m0Var.setPosition(i11);
                    return 0;
                }
                int i14 = (4194304 & i13) != 0 ? 1 : 0;
                int i15 = (2096896 & i13) >> 8;
                boolean z12 = (i13 & 32) != 0;
                n0 n0Var = (i13 & 16) != 0 ? (n0) sparseArray.get(i15) : null;
                if (n0Var == null) {
                    m0Var.setPosition(i11);
                    return 0;
                }
                if (i10 != 2) {
                    int i16 = i13 & 15;
                    z10 = true;
                    SparseIntArray sparseIntArray = this.f84677f;
                    int i17 = sparseIntArray.get(i15, i16 - 1);
                    sparseIntArray.put(i15, i16);
                    if (i17 == i16) {
                        m0Var.setPosition(i11);
                        return 0;
                    }
                    if (i16 != ((i17 + 1) & 15)) {
                        n0Var.seek();
                    }
                } else {
                    z10 = true;
                }
                if (z12) {
                    int unsignedByte = m0Var.readUnsignedByte();
                    i14 |= (m0Var.readUnsignedByte() & 64) != 0 ? 2 : 0;
                    m0Var.skipBytes(unsignedByte - 1);
                }
                boolean z13 = this.f84687p;
                if (i10 == 2 || z13 || !this.f84682k.get(i15, false)) {
                    m0Var.setLimit(i11);
                    n0Var.consume(m0Var, i14);
                    m0Var.setLimit(iLimit2);
                }
                if (i10 != 2 && !z13 && this.f84687p && length != -1) {
                    this.f84689r = z10;
                }
                m0Var.setPosition(i11);
                return 0;
            }
            int iLimit3 = m0Var.limit();
            int i18 = a0Var.read(data, iLimit3, 9400 - iLimit3);
            if (i18 == -1) {
                for (int i19 = 0; i19 < sparseArray.size(); i19++) {
                    n0 n0Var2 = (n0) sparseArray.valueAt(i19);
                    if (n0Var2 instanceof y) {
                        y yVar = (y) n0Var2;
                        if (yVar.canConsumeSynthesizedEmptyPusi(z11)) {
                            yVar.consume(new io.bidmachine.media3.common.util.m0(), 1);
                        }
                    }
                }
                return -1;
            }
            m0Var.setLimit(iLimit3 + i18);
        }
    }

    @Override // ko.z
    public void seek(long j10, long j11) {
        g0 g0Var;
        io.bidmachine.media3.common.util.a.checkState(this.f84672a != 2);
        List list = this.f84675d;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            u0 u0Var = (u0) list.get(i10);
            boolean z10 = u0Var.getTimestampOffsetUs() == C.TIME_UNSET;
            if (!z10) {
                long firstSampleTimestampUs = u0Var.getFirstSampleTimestampUs();
                z10 = (firstSampleTimestampUs == C.TIME_UNSET || firstSampleTimestampUs == 0 || firstSampleTimestampUs == j11) ? false : true;
            }
            if (z10) {
                u0Var.reset(j11);
            }
        }
        if (j11 != 0 && (g0Var = this.f84684m) != null) {
            g0Var.setSeekTargetUs(j11);
        }
        this.f84676e.reset(0);
        this.f84677f.clear();
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.f84680i;
            if (i11 >= sparseArray.size()) {
                this.f84691t = 0;
                return;
            } else {
                ((n0) sparseArray.valueAt(i11)).seek();
                i11++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // ko.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean sniff(ko.a0 r7) throws java.io.IOException {
        /*
            r6 = this;
            io.bidmachine.media3.common.util.m0 r0 = r6.f84676e
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
        throw new UnsupportedOperationException("Method not decompiled: rp.i0.sniff(ko.a0):boolean");
    }

    public i0(hp.q qVar) {
        this(1, 0, qVar, new u0(0L), new g(0), 112800);
    }

    public i0(int i10, hp.q qVar) {
        this(1, i10, qVar, new u0(0L), new g(0), 112800);
    }

    @Deprecated
    public i0(int i10) {
        this(1, 1, hp.q.f59124a, new u0(0L), new g(i10), 112800);
    }

    @Deprecated
    public i0(int i10, int i11, int i12) {
        this(i10, 1, hp.q.f59124a, new u0(0L), new g(i11), i12);
    }

    @Deprecated
    public i0(int i10, u0 u0Var, l0 l0Var) {
        this(i10, 1, hp.q.f59124a, u0Var, l0Var, 112800);
    }

    @Deprecated
    public i0(int i10, u0 u0Var, l0 l0Var, int i11) {
        this(i10, 1, hp.q.f59124a, u0Var, l0Var, i11);
    }

    public i0(int i10, int i11, hp.q qVar, u0 u0Var, l0 l0Var, int i12) {
        l0 l0Var2 = (l0) io.bidmachine.media3.common.util.a.checkNotNull(l0Var);
        this.f84678g = l0Var2;
        this.f84674c = i12;
        this.f84672a = i10;
        this.f84673b = i11;
        this.f84679h = qVar;
        if (i10 != 1 && i10 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f84675d = arrayList;
            arrayList.add(u0Var);
        } else {
            this.f84675d = Collections.singletonList(u0Var);
        }
        this.f84676e = new io.bidmachine.media3.common.util.m0(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f84681j = sparseBooleanArray;
        this.f84682k = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f84680i = sparseArray;
        this.f84677f = new SparseIntArray();
        this.f84683l = new h0(i12);
        this.f84685n = ko.c0.N8;
        this.f84692u = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray<n0> sparseArrayCreateInitialPayloadReaders = l0Var2.createInitialPayloadReaders();
        int size = sparseArrayCreateInitialPayloadReaders.size();
        for (int i13 = 0; i13 < size; i13++) {
            sparseArray.put(sparseArrayCreateInitialPayloadReaders.keyAt(i13), sparseArrayCreateInitialPayloadReaders.valueAt(i13));
        }
        sparseArray.put(0, new e0(new a()));
        this.f84690s = null;
    }

    @Override // ko.z
    public void release() {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements d0 {

        /* renamed from: a, reason: collision with root package name */
        public final io.bidmachine.media3.common.util.l0 f84693a = new io.bidmachine.media3.common.util.l0(new byte[4]);

        public a() {
        }

        @Override // rp.d0
        public void consume(io.bidmachine.media3.common.util.m0 m0Var) {
            i0 i0Var;
            if (m0Var.readUnsignedByte() == 0 && (m0Var.readUnsignedByte() & 128) != 0) {
                m0Var.skipBytes(6);
                int iBytesLeft = m0Var.bytesLeft() / 4;
                int i10 = 0;
                while (true) {
                    i0Var = i0.this;
                    if (i10 >= iBytesLeft) {
                        break;
                    }
                    io.bidmachine.media3.common.util.l0 l0Var = this.f84693a;
                    m0Var.readBytes(l0Var, 4);
                    int bits = l0Var.readBits(16);
                    l0Var.skipBits(3);
                    if (bits == 0) {
                        l0Var.skipBits(13);
                    } else {
                        int bits2 = l0Var.readBits(13);
                        if (i0Var.f84680i.get(bits2) == null) {
                            i0Var.f84680i.put(bits2, new e0(i0Var.new b(bits2)));
                            i0Var.f84686o++;
                        }
                    }
                    i10++;
                }
                if (i0Var.f84672a != 2) {
                    i0Var.f84680i.remove(0);
                }
            }
        }

        @Override // rp.d0
        public void init(u0 u0Var, ko.c0 c0Var, m0 m0Var) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements d0 {

        /* renamed from: a, reason: collision with root package name */
        public final io.bidmachine.media3.common.util.l0 f84695a = new io.bidmachine.media3.common.util.l0(new byte[5]);

        /* renamed from: b, reason: collision with root package name */
        public final SparseArray f84696b = new SparseArray();

        /* renamed from: c, reason: collision with root package name */
        public final SparseIntArray f84697c = new SparseIntArray();

        /* renamed from: d, reason: collision with root package name */
        public final int f84698d;

        public b(int i10) {
            this.f84698d = i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x012f  */
        @Override // rp.d0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void consume(io.bidmachine.media3.common.util.m0 r38) {
            /*
                Method dump skipped, instructions count: 778
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rp.i0.b.consume(io.bidmachine.media3.common.util.m0):void");
        }

        @Override // rp.d0
        public void init(u0 u0Var, ko.c0 c0Var, m0 m0Var) {
        }
    }
}
