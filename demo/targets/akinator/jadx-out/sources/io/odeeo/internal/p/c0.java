package io.odeeo.internal.p;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.b.g0;
import io.odeeo.internal.g.v;
import io.odeeo.internal.p.d0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c0 implements io.odeeo.internal.g.h {

    /* renamed from: t, reason: collision with root package name */
    public static final io.odeeo.internal.g.l f65252t = new bt.a(12);

    /* renamed from: a, reason: collision with root package name */
    public final int f65253a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65254b;

    /* renamed from: c, reason: collision with root package name */
    public final List<io.odeeo.internal.q0.e0> f65255c;

    /* renamed from: d, reason: collision with root package name */
    public final io.odeeo.internal.q0.x f65256d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseIntArray f65257e;

    /* renamed from: f, reason: collision with root package name */
    public final d0.c f65258f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseArray<d0> f65259g;

    /* renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f65260h;

    /* renamed from: i, reason: collision with root package name */
    public final SparseBooleanArray f65261i;

    /* renamed from: j, reason: collision with root package name */
    public final b0 f65262j;

    /* renamed from: k, reason: collision with root package name */
    public a0 f65263k;

    /* renamed from: l, reason: collision with root package name */
    public io.odeeo.internal.g.j f65264l;

    /* renamed from: m, reason: collision with root package name */
    public int f65265m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f65266n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f65267o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f65268p;

    /* renamed from: q, reason: collision with root package name */
    public d0 f65269q;

    /* renamed from: r, reason: collision with root package name */
    public int f65270r;

    /* renamed from: s, reason: collision with root package name */
    public int f65271s;

    public c0() {
        this(0);
    }

    public static /* synthetic */ int d(c0 c0Var) {
        int i10 = c0Var.f65265m;
        c0Var.f65265m = i10 + 1;
        return i10;
    }

    @Override // io.odeeo.internal.g.h
    public void init(io.odeeo.internal.g.j jVar) {
        this.f65264l = jVar;
    }

    @Override // io.odeeo.internal.g.h
    public int read(io.odeeo.internal.g.i iVar, io.odeeo.internal.g.u uVar) throws IOException {
        long j10;
        long length = iVar.getLength();
        if (this.f65266n) {
            if (length != -1 && this.f65253a != 2 && !this.f65262j.isDurationReadFinished()) {
                return this.f65262j.readDuration(iVar, uVar, this.f65271s);
            }
            a(length);
            if (this.f65268p) {
                this.f65268p = false;
                seek(0L, 0L);
                if (iVar.getPosition() != 0) {
                    uVar.f64171a = 0L;
                    return 1;
                }
            }
            a0 a0Var = this.f65263k;
            if (a0Var != null && a0Var.isSeeking()) {
                return this.f65263k.handlePendingSeek(iVar, uVar);
            }
        }
        if (!a(iVar)) {
            return -1;
        }
        int iA = a();
        int iLimit = this.f65256d.limit();
        if (iA > iLimit) {
            return 0;
        }
        int i10 = this.f65256d.readInt();
        if ((8388608 & i10) != 0) {
            this.f65256d.setPosition(iA);
            return 0;
        }
        int i11 = (4194304 & i10) != 0 ? 1 : 0;
        int i12 = (2096896 & i10) >> 8;
        boolean z10 = (i10 & 32) != 0;
        d0 d0Var = (i10 & 16) != 0 ? this.f65259g.get(i12) : null;
        if (d0Var == null) {
            this.f65256d.setPosition(iA);
            return 0;
        }
        if (this.f65253a != 2) {
            int i13 = i10 & 15;
            j10 = -1;
            int i14 = this.f65257e.get(i12, i13 - 1);
            this.f65257e.put(i12, i13);
            if (i14 == i13) {
                this.f65256d.setPosition(iA);
                return 0;
            }
            if (i13 != ((i14 + 1) & 15)) {
                d0Var.seek();
            }
        } else {
            j10 = -1;
        }
        if (z10) {
            int unsignedByte = this.f65256d.readUnsignedByte();
            i11 |= (this.f65256d.readUnsignedByte() & 64) != 0 ? 2 : 0;
            this.f65256d.skipBytes(unsignedByte - 1);
        }
        boolean z11 = this.f65266n;
        if (a(i12)) {
            this.f65256d.setLimit(iA);
            d0Var.consume(this.f65256d, i11);
            this.f65256d.setLimit(iLimit);
        }
        if (this.f65253a != 2 && !z11 && this.f65266n && length != j10) {
            this.f65268p = true;
        }
        this.f65256d.setPosition(iA);
        return 0;
    }

    @Override // io.odeeo.internal.g.h
    public void seek(long j10, long j11) {
        a0 a0Var;
        io.odeeo.internal.q0.a.checkState(this.f65253a != 2);
        int size = this.f65255c.size();
        for (int i10 = 0; i10 < size; i10++) {
            io.odeeo.internal.q0.e0 e0Var = this.f65255c.get(i10);
            boolean z10 = e0Var.getTimestampOffsetUs() == C.TIME_UNSET;
            if (!z10) {
                long firstSampleTimestampUs = e0Var.getFirstSampleTimestampUs();
                z10 = (firstSampleTimestampUs == C.TIME_UNSET || firstSampleTimestampUs == 0 || firstSampleTimestampUs == j11) ? false : true;
            }
            if (z10) {
                e0Var.reset(j11);
            }
        }
        if (j11 != 0 && (a0Var = this.f65263k) != null) {
            a0Var.setSeekTargetUs(j11);
        }
        this.f65256d.reset(0);
        this.f65257e.clear();
        for (int i11 = 0; i11 < this.f65259g.size(); i11++) {
            this.f65259g.valueAt(i11).seek();
        }
        this.f65270r = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // io.odeeo.internal.g.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean sniff(io.odeeo.internal.g.i r7) throws java.io.IOException {
        /*
            r6 = this;
            io.odeeo.internal.q0.x r0 = r6.f65256d
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
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.p.c0.sniff(io.odeeo.internal.g.i):boolean");
    }

    public c0(int i10) {
        this(1, i10, 112800);
    }

    public final void c() {
        this.f65260h.clear();
        this.f65259g.clear();
        SparseArray<d0> sparseArrayCreateInitialPayloadReaders = this.f65258f.createInitialPayloadReaders();
        int size = sparseArrayCreateInitialPayloadReaders.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f65259g.put(sparseArrayCreateInitialPayloadReaders.keyAt(i10), sparseArrayCreateInitialPayloadReaders.valueAt(i10));
        }
        this.f65259g.put(0, new y(new a()));
        this.f65269q = null;
    }

    public c0(int i10, int i11, int i12) {
        this(i10, new io.odeeo.internal.q0.e0(0L), new g(i11), i12);
    }

    public static /* synthetic */ io.odeeo.internal.g.h[] b() {
        return new io.odeeo.internal.g.h[]{new c0()};
    }

    public c0(int i10, io.odeeo.internal.q0.e0 e0Var, d0.c cVar) {
        this(i10, e0Var, cVar, 112800);
    }

    public c0(int i10, io.odeeo.internal.q0.e0 e0Var, d0.c cVar, int i11) {
        this.f65258f = (d0.c) io.odeeo.internal.q0.a.checkNotNull(cVar);
        this.f65254b = i11;
        this.f65253a = i10;
        if (i10 != 1 && i10 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f65255c = arrayList;
            arrayList.add(e0Var);
        } else {
            this.f65255c = Collections.singletonList(e0Var);
        }
        this.f65256d = new io.odeeo.internal.q0.x(new byte[9400], 0);
        this.f65260h = new SparseBooleanArray();
        this.f65261i = new SparseBooleanArray();
        this.f65259g = new SparseArray<>();
        this.f65257e = new SparseIntArray();
        this.f65262j = new b0(i11);
        this.f65264l = io.odeeo.internal.g.j.f64142d;
        this.f65271s = -1;
        c();
    }

    public final void a(long j10) {
        if (this.f65267o) {
            return;
        }
        this.f65267o = true;
        if (this.f65262j.getDurationUs() != C.TIME_UNSET) {
            a0 a0Var = new a0(this.f65262j.getPcrTimestampAdjuster(), this.f65262j.getDurationUs(), j10, this.f65271s, this.f65254b);
            this.f65263k = a0Var;
            this.f65264l.seekMap(a0Var.getSeekMap());
            return;
        }
        this.f65264l.seekMap(new v.b(this.f65262j.getDurationUs()));
    }

    public final boolean a(io.odeeo.internal.g.i iVar) throws IOException {
        byte[] data = this.f65256d.getData();
        if (9400 - this.f65256d.getPosition() < 188) {
            int iBytesLeft = this.f65256d.bytesLeft();
            if (iBytesLeft > 0) {
                System.arraycopy(data, this.f65256d.getPosition(), data, 0, iBytesLeft);
            }
            this.f65256d.reset(data, iBytesLeft);
        }
        while (this.f65256d.bytesLeft() < 188) {
            int iLimit = this.f65256d.limit();
            int i10 = iVar.read(data, iLimit, 9400 - iLimit);
            if (i10 == -1) {
                return false;
            }
            this.f65256d.setLimit(iLimit + i10);
        }
        return true;
    }

    @Override // io.odeeo.internal.g.h
    public void release() {
    }

    public final int a() throws g0 {
        int position = this.f65256d.getPosition();
        int iLimit = this.f65256d.limit();
        int iFindSyncBytePosition = e0.findSyncBytePosition(this.f65256d.getData(), position, iLimit);
        this.f65256d.setPosition(iFindSyncBytePosition);
        int i10 = iFindSyncBytePosition + 188;
        if (i10 > iLimit) {
            int i11 = (iFindSyncBytePosition - position) + this.f65270r;
            this.f65270r = i11;
            if (this.f65253a != 2 || i11 <= 376) {
                return i10;
            }
            throw g0.createForMalformedContainer("Cannot find sync byte. Most likely not a Transport Stream.", null);
        }
        this.f65270r = 0;
        return i10;
    }

    public final boolean a(int i10) {
        return this.f65253a == 2 || this.f65266n || !this.f65261i.get(i10, false);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements x {

        /* renamed from: a, reason: collision with root package name */
        public final io.odeeo.internal.q0.w f65272a = new io.odeeo.internal.q0.w(new byte[4]);

        public a() {
        }

        @Override // io.odeeo.internal.p.x
        public void consume(io.odeeo.internal.q0.x xVar) {
            if (xVar.readUnsignedByte() == 0 && (xVar.readUnsignedByte() & 128) != 0) {
                xVar.skipBytes(6);
                int iBytesLeft = xVar.bytesLeft() / 4;
                for (int i10 = 0; i10 < iBytesLeft; i10++) {
                    xVar.readBytes(this.f65272a, 4);
                    int bits = this.f65272a.readBits(16);
                    this.f65272a.skipBits(3);
                    if (bits == 0) {
                        this.f65272a.skipBits(13);
                    } else {
                        int bits2 = this.f65272a.readBits(13);
                        if (c0.this.f65259g.get(bits2) == null) {
                            c0.this.f65259g.put(bits2, new y(c0.this.new b(bits2)));
                            c0.d(c0.this);
                        }
                    }
                }
                if (c0.this.f65253a != 2) {
                    c0.this.f65259g.remove(0);
                }
            }
        }

        @Override // io.odeeo.internal.p.x
        public void init(io.odeeo.internal.q0.e0 e0Var, io.odeeo.internal.g.j jVar, d0.d dVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements x {

        /* renamed from: a, reason: collision with root package name */
        public final io.odeeo.internal.q0.w f65274a = new io.odeeo.internal.q0.w(new byte[5]);

        /* renamed from: b, reason: collision with root package name */
        public final SparseArray<d0> f65275b = new SparseArray<>();

        /* renamed from: c, reason: collision with root package name */
        public final SparseIntArray f65276c = new SparseIntArray();

        /* renamed from: d, reason: collision with root package name */
        public final int f65277d;

        public b(int i10) {
            this.f65277d = i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final io.odeeo.internal.p.d0.b a(io.odeeo.internal.q0.x r12, int r13) {
            /*
                r11 = this;
                int r0 = r12.getPosition()
                int r13 = r13 + r0
                r1 = -1
                r2 = 0
                r3 = r2
            L8:
                int r4 = r12.getPosition()
                if (r4 >= r13) goto Lb9
                int r4 = r12.readUnsignedByte()
                int r5 = r12.readUnsignedByte()
                int r6 = r12.getPosition()
                int r6 = r6 + r5
                if (r6 <= r13) goto L1f
                goto Lb9
            L1f:
                r5 = 5
                if (r4 != r5) goto L49
                long r4 = r12.readUnsignedInt()
                r7 = 1094921523(0x41432d33, double:5.409631094E-315)
                int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r7 != 0) goto L2e
                goto L4d
            L2e:
                r7 = 1161904947(0x45414333, double:5.74057318E-315)
                int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r7 != 0) goto L36
                goto L54
            L36:
                r7 = 1094921524(0x41432d34, double:5.4096311E-315)
                int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r7 != 0) goto L3e
                goto L63
            L3e:
                r7 = 1212503619(0x48455643, double:5.990563836E-315)
                int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r4 != 0) goto Laf
                r1 = 36
                goto Laf
            L49:
                r5 = 106(0x6a, float:1.49E-43)
                if (r4 != r5) goto L50
            L4d:
                r1 = 129(0x81, float:1.81E-43)
                goto Laf
            L50:
                r5 = 122(0x7a, float:1.71E-43)
                if (r4 != r5) goto L57
            L54:
                r1 = 135(0x87, float:1.89E-43)
                goto Laf
            L57:
                r5 = 127(0x7f, float:1.78E-43)
                if (r4 != r5) goto L66
                int r4 = r12.readUnsignedByte()
                r5 = 21
                if (r4 != r5) goto Laf
            L63:
                r1 = 172(0xac, float:2.41E-43)
                goto Laf
            L66:
                r5 = 123(0x7b, float:1.72E-43)
                if (r4 != r5) goto L6d
                r1 = 138(0x8a, float:1.93E-43)
                goto Laf
            L6d:
                r5 = 10
                r7 = 3
                if (r4 != r5) goto L7b
                java.lang.String r2 = r12.readString(r7)
                java.lang.String r2 = r2.trim()
                goto Laf
            L7b:
                r5 = 89
                if (r4 != r5) goto La9
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
            L84:
                int r3 = r12.getPosition()
                if (r3 >= r6) goto La6
                java.lang.String r3 = r12.readString(r7)
                java.lang.String r3 = r3.trim()
                int r4 = r12.readUnsignedByte()
                r8 = 4
                byte[] r9 = new byte[r8]
                r10 = 0
                r12.readBytes(r9, r10, r8)
                io.odeeo.internal.p.d0$a r8 = new io.odeeo.internal.p.d0$a
                r8.<init>(r3, r4, r9)
                r1.add(r8)
                goto L84
            La6:
                r3 = r1
                r1 = r5
                goto Laf
            La9:
                r5 = 111(0x6f, float:1.56E-43)
                if (r4 != r5) goto Laf
                r1 = 257(0x101, float:3.6E-43)
            Laf:
                int r4 = r12.getPosition()
                int r6 = r6 - r4
                r12.skipBytes(r6)
                goto L8
            Lb9:
                r12.setPosition(r13)
                io.odeeo.internal.p.d0$b r4 = new io.odeeo.internal.p.d0$b
                byte[] r12 = r12.getData()
                byte[] r12 = java.util.Arrays.copyOfRange(r12, r0, r13)
                r4.<init>(r1, r2, r3, r12)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.p.c0.b.a(io.odeeo.internal.q0.x, int):io.odeeo.internal.p.d0$b");
        }

        @Override // io.odeeo.internal.p.x
        public void consume(io.odeeo.internal.q0.x xVar) {
            io.odeeo.internal.q0.e0 e0Var;
            if (xVar.readUnsignedByte() != 2) {
                return;
            }
            if (c0.this.f65253a == 1 || c0.this.f65253a == 2 || c0.this.f65265m == 1) {
                e0Var = (io.odeeo.internal.q0.e0) c0.this.f65255c.get(0);
            } else {
                e0Var = new io.odeeo.internal.q0.e0(((io.odeeo.internal.q0.e0) c0.this.f65255c.get(0)).getFirstSampleTimestampUs());
                c0.this.f65255c.add(e0Var);
            }
            if ((xVar.readUnsignedByte() & 128) == 0) {
                return;
            }
            xVar.skipBytes(1);
            int unsignedShort = xVar.readUnsignedShort();
            int i10 = 3;
            xVar.skipBytes(3);
            xVar.readBytes(this.f65274a, 2);
            this.f65274a.skipBits(3);
            int i11 = 13;
            c0.this.f65271s = this.f65274a.readBits(13);
            xVar.readBytes(this.f65274a, 2);
            int i12 = 4;
            this.f65274a.skipBits(4);
            xVar.skipBytes(this.f65274a.readBits(12));
            if (c0.this.f65253a == 2 && c0.this.f65269q == null) {
                d0.b bVar = new d0.b(21, null, null, io.odeeo.internal.q0.g0.f65866f);
                c0 c0Var = c0.this;
                c0Var.f65269q = c0Var.f65258f.createPayloadReader(21, bVar);
                if (c0.this.f65269q != null) {
                    c0.this.f65269q.init(e0Var, c0.this.f65264l, new d0.d(unsignedShort, 21, Segment.SIZE));
                }
            }
            this.f65275b.clear();
            this.f65276c.clear();
            int iBytesLeft = xVar.bytesLeft();
            while (iBytesLeft > 0) {
                xVar.readBytes(this.f65274a, 5);
                int bits = this.f65274a.readBits(8);
                this.f65274a.skipBits(i10);
                int bits2 = this.f65274a.readBits(i11);
                this.f65274a.skipBits(i12);
                int bits3 = this.f65274a.readBits(12);
                d0.b bVarA = a(xVar, bits3);
                if (bits == 6 || bits == 5) {
                    bits = bVarA.f65295a;
                }
                iBytesLeft -= bits3 + 5;
                int i13 = c0.this.f65253a == 2 ? bits : bits2;
                if (!c0.this.f65260h.get(i13)) {
                    d0 d0VarCreatePayloadReader = (c0.this.f65253a == 2 && bits == 21) ? c0.this.f65269q : c0.this.f65258f.createPayloadReader(bits, bVarA);
                    if (c0.this.f65253a != 2 || bits2 < this.f65276c.get(i13, Segment.SIZE)) {
                        this.f65276c.put(i13, bits2);
                        this.f65275b.put(i13, d0VarCreatePayloadReader);
                    }
                }
                i10 = 3;
                i12 = 4;
                i11 = 13;
            }
            int size = this.f65276c.size();
            for (int i14 = 0; i14 < size; i14++) {
                int iKeyAt = this.f65276c.keyAt(i14);
                int iValueAt = this.f65276c.valueAt(i14);
                c0.this.f65260h.put(iKeyAt, true);
                c0.this.f65261i.put(iValueAt, true);
                d0 d0VarValueAt = this.f65275b.valueAt(i14);
                if (d0VarValueAt != null) {
                    if (d0VarValueAt != c0.this.f65269q) {
                        d0VarValueAt.init(e0Var, c0.this.f65264l, new d0.d(unsignedShort, iKeyAt, Segment.SIZE));
                    }
                    c0.this.f65259g.put(iValueAt, d0VarValueAt);
                }
            }
            if (c0.this.f65253a == 2) {
                if (c0.this.f65266n) {
                    return;
                }
                c0.this.f65264l.endTracks();
                c0.this.f65265m = 0;
                c0.this.f65266n = true;
                return;
            }
            c0.this.f65259g.remove(this.f65277d);
            c0 c0Var2 = c0.this;
            c0Var2.f65265m = c0Var2.f65253a == 1 ? 0 : c0.this.f65265m - 1;
            if (c0.this.f65265m == 0) {
                c0.this.f65264l.endTracks();
                c0.this.f65266n = true;
            }
        }

        @Override // io.odeeo.internal.p.x
        public void init(io.odeeo.internal.q0.e0 e0Var, io.odeeo.internal.g.j jVar, d0.d dVar) {
        }
    }
}
