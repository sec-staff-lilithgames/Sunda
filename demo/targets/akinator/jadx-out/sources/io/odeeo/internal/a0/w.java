package io.odeeo.internal.a0;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.a0.r;
import io.odeeo.internal.b.t0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w implements r, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final r[] f62459a;

    /* renamed from: c, reason: collision with root package name */
    public final h f62461c;

    /* renamed from: f, reason: collision with root package name */
    public r.a f62463f;

    /* renamed from: g, reason: collision with root package name */
    public l0 f62464g;

    /* renamed from: i, reason: collision with root package name */
    public e0 f62466i;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList<r> f62462e = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public final IdentityHashMap<d0, Integer> f62460b = new IdentityHashMap<>();

    /* renamed from: h, reason: collision with root package name */
    public r[] f62465h = new r[0];

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements r, r.a {

        /* renamed from: a, reason: collision with root package name */
        public final r f62467a;

        /* renamed from: b, reason: collision with root package name */
        public final long f62468b;

        /* renamed from: c, reason: collision with root package name */
        public r.a f62469c;

        public a(r rVar, long j10) {
            this.f62467a = rVar;
            this.f62468b = j10;
        }

        @Override // io.odeeo.internal.a0.r, io.odeeo.internal.a0.e0
        public boolean continueLoading(long j10) {
            return this.f62467a.continueLoading(j10 - this.f62468b);
        }

        @Override // io.odeeo.internal.a0.r
        public void discardBuffer(long j10, boolean z10) {
            this.f62467a.discardBuffer(j10 - this.f62468b, z10);
        }

        @Override // io.odeeo.internal.a0.r
        public long getAdjustedSeekPositionUs(long j10, t0 t0Var) {
            return this.f62467a.getAdjustedSeekPositionUs(j10 - this.f62468b, t0Var) + this.f62468b;
        }

        @Override // io.odeeo.internal.a0.r, io.odeeo.internal.a0.e0
        public long getBufferedPositionUs() {
            long bufferedPositionUs = this.f62467a.getBufferedPositionUs();
            if (bufferedPositionUs == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return bufferedPositionUs + this.f62468b;
        }

        @Override // io.odeeo.internal.a0.r, io.odeeo.internal.a0.e0
        public long getNextLoadPositionUs() {
            long nextLoadPositionUs = this.f62467a.getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return nextLoadPositionUs + this.f62468b;
        }

        @Override // io.odeeo.internal.a0.r
        public List<Object> getStreamKeys(List<io.odeeo.internal.n0.d> list) {
            return this.f62467a.getStreamKeys(list);
        }

        @Override // io.odeeo.internal.a0.r
        public l0 getTrackGroups() {
            return this.f62467a.getTrackGroups();
        }

        @Override // io.odeeo.internal.a0.r, io.odeeo.internal.a0.e0
        public boolean isLoading() {
            return this.f62467a.isLoading();
        }

        @Override // io.odeeo.internal.a0.r
        public void maybeThrowPrepareError() throws IOException {
            this.f62467a.maybeThrowPrepareError();
        }

        @Override // io.odeeo.internal.a0.r.a
        public void onPrepared(r rVar) {
            ((r.a) io.odeeo.internal.q0.a.checkNotNull(this.f62469c)).onPrepared(this);
        }

        @Override // io.odeeo.internal.a0.r
        public void prepare(r.a aVar, long j10) {
            this.f62469c = aVar;
            this.f62467a.prepare(this, j10 - this.f62468b);
        }

        @Override // io.odeeo.internal.a0.r
        public long readDiscontinuity() {
            long discontinuity = this.f62467a.readDiscontinuity();
            return discontinuity == C.TIME_UNSET ? C.TIME_UNSET : discontinuity + this.f62468b;
        }

        @Override // io.odeeo.internal.a0.r, io.odeeo.internal.a0.e0
        public void reevaluateBuffer(long j10) {
            this.f62467a.reevaluateBuffer(j10 - this.f62468b);
        }

        @Override // io.odeeo.internal.a0.r
        public long seekToUs(long j10) {
            return this.f62467a.seekToUs(j10 - this.f62468b) + this.f62468b;
        }

        @Override // io.odeeo.internal.a0.r
        public long selectTracks(io.odeeo.internal.n0.d[] dVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j10) {
            d0[] d0VarArr2 = new d0[d0VarArr.length];
            int i10 = 0;
            while (true) {
                d0 childStream = null;
                if (i10 >= d0VarArr.length) {
                    break;
                }
                b bVar = (b) d0VarArr[i10];
                if (bVar != null) {
                    childStream = bVar.getChildStream();
                }
                d0VarArr2[i10] = childStream;
                i10++;
            }
            long jSelectTracks = this.f62467a.selectTracks(dVarArr, zArr, d0VarArr2, zArr2, j10 - this.f62468b);
            for (int i11 = 0; i11 < d0VarArr.length; i11++) {
                d0 d0Var = d0VarArr2[i11];
                if (d0Var == null) {
                    d0VarArr[i11] = null;
                } else {
                    d0 d0Var2 = d0VarArr[i11];
                    if (d0Var2 == null || ((b) d0Var2).getChildStream() != d0Var) {
                        d0VarArr[i11] = new b(d0Var, this.f62468b);
                    }
                }
            }
            return jSelectTracks + this.f62468b;
        }

        @Override // io.odeeo.internal.a0.r.a, io.odeeo.internal.a0.e0.a
        public void onContinueLoadingRequested(r rVar) {
            ((r.a) io.odeeo.internal.q0.a.checkNotNull(this.f62469c)).onContinueLoadingRequested(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements d0 {

        /* renamed from: a, reason: collision with root package name */
        public final d0 f62470a;

        /* renamed from: b, reason: collision with root package name */
        public final long f62471b;

        public b(d0 d0Var, long j10) {
            this.f62470a = d0Var;
            this.f62471b = j10;
        }

        public d0 getChildStream() {
            return this.f62470a;
        }

        @Override // io.odeeo.internal.a0.d0
        public boolean isReady() {
            return this.f62470a.isReady();
        }

        @Override // io.odeeo.internal.a0.d0
        public void maybeThrowError() throws IOException {
            this.f62470a.maybeThrowError();
        }

        @Override // io.odeeo.internal.a0.d0
        public int readData(io.odeeo.internal.b.u uVar, io.odeeo.internal.e.g gVar, int i10) {
            int data = this.f62470a.readData(uVar, gVar, i10);
            if (data == -4) {
                gVar.f63707e = Math.max(0L, gVar.f63707e + this.f62471b);
            }
            return data;
        }

        @Override // io.odeeo.internal.a0.d0
        public int skipData(long j10) {
            return this.f62470a.skipData(j10 - this.f62471b);
        }
    }

    public w(h hVar, long[] jArr, r... rVarArr) {
        this.f62461c = hVar;
        this.f62459a = rVarArr;
        this.f62466i = hVar.createCompositeSequenceableLoader(new e0[0]);
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f62459a[i10] = new a(rVarArr[i10], j10);
            }
        }
    }

    @Override // io.odeeo.internal.a0.r, io.odeeo.internal.a0.e0
    public boolean continueLoading(long j10) {
        if (this.f62462e.isEmpty()) {
            return this.f62466i.continueLoading(j10);
        }
        int size = this.f62462e.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f62462e.get(i10).continueLoading(j10);
        }
        return false;
    }

    @Override // io.odeeo.internal.a0.r
    public void discardBuffer(long j10, boolean z10) {
        for (r rVar : this.f62465h) {
            rVar.discardBuffer(j10, z10);
        }
    }

    @Override // io.odeeo.internal.a0.r
    public long getAdjustedSeekPositionUs(long j10, t0 t0Var) {
        r[] rVarArr = this.f62465h;
        return (rVarArr.length > 0 ? rVarArr[0] : this.f62459a[0]).getAdjustedSeekPositionUs(j10, t0Var);
    }

    @Override // io.odeeo.internal.a0.r, io.odeeo.internal.a0.e0
    public long getBufferedPositionUs() {
        return this.f62466i.getBufferedPositionUs();
    }

    public r getChildPeriod(int i10) {
        r rVar = this.f62459a[i10];
        return rVar instanceof a ? ((a) rVar).f62467a : rVar;
    }

    @Override // io.odeeo.internal.a0.r, io.odeeo.internal.a0.e0
    public long getNextLoadPositionUs() {
        return this.f62466i.getNextLoadPositionUs();
    }

    @Override // io.odeeo.internal.a0.r
    public /* bridge */ /* synthetic */ List getStreamKeys(List list) {
        return super.getStreamKeys(list);
    }

    @Override // io.odeeo.internal.a0.r
    public l0 getTrackGroups() {
        return (l0) io.odeeo.internal.q0.a.checkNotNull(this.f62464g);
    }

    @Override // io.odeeo.internal.a0.r, io.odeeo.internal.a0.e0
    public boolean isLoading() {
        return this.f62466i.isLoading();
    }

    @Override // io.odeeo.internal.a0.r
    public void maybeThrowPrepareError() throws IOException {
        for (r rVar : this.f62459a) {
            rVar.maybeThrowPrepareError();
        }
    }

    @Override // io.odeeo.internal.a0.r.a
    public void onPrepared(r rVar) {
        this.f62462e.remove(rVar);
        if (this.f62462e.isEmpty()) {
            int i10 = 0;
            for (r rVar2 : this.f62459a) {
                i10 += rVar2.getTrackGroups().f62401a;
            }
            k0[] k0VarArr = new k0[i10];
            int i11 = 0;
            for (r rVar3 : this.f62459a) {
                l0 trackGroups = rVar3.getTrackGroups();
                int i12 = trackGroups.f62401a;
                int i13 = 0;
                while (i13 < i12) {
                    k0VarArr[i11] = trackGroups.get(i13);
                    i13++;
                    i11++;
                }
            }
            this.f62464g = new l0(k0VarArr);
            ((r.a) io.odeeo.internal.q0.a.checkNotNull(this.f62463f)).onPrepared(this);
        }
    }

    @Override // io.odeeo.internal.a0.r
    public void prepare(r.a aVar, long j10) {
        this.f62463f = aVar;
        Collections.addAll(this.f62462e, this.f62459a);
        for (r rVar : this.f62459a) {
            rVar.prepare(this, j10);
        }
    }

    @Override // io.odeeo.internal.a0.r
    public long readDiscontinuity() {
        long j10 = -9223372036854775807L;
        for (r rVar : this.f62465h) {
            long discontinuity = rVar.readDiscontinuity();
            if (discontinuity == C.TIME_UNSET) {
                if (j10 != C.TIME_UNSET && rVar.seekToUs(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == C.TIME_UNSET) {
                for (r rVar2 : this.f62465h) {
                    if (rVar2 == rVar) {
                        break;
                    }
                    if (rVar2.seekToUs(discontinuity) != discontinuity) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j10 = discontinuity;
            } else if (discontinuity != j10) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j10;
    }

    @Override // io.odeeo.internal.a0.r, io.odeeo.internal.a0.e0
    public void reevaluateBuffer(long j10) {
        this.f62466i.reevaluateBuffer(j10);
    }

    @Override // io.odeeo.internal.a0.r
    public long seekToUs(long j10) {
        long jSeekToUs = this.f62465h[0].seekToUs(j10);
        int i10 = 1;
        while (true) {
            r[] rVarArr = this.f62465h;
            if (i10 >= rVarArr.length) {
                return jSeekToUs;
            }
            if (rVarArr[i10].seekToUs(jSeekToUs) != jSeekToUs) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // io.odeeo.internal.a0.r
    public long selectTracks(io.odeeo.internal.n0.d[] dVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j10) {
        int[] iArr = new int[dVarArr.length];
        int[] iArr2 = new int[dVarArr.length];
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            d0 d0Var = d0VarArr[i10];
            Integer num = d0Var == null ? null : this.f62460b.get(d0Var);
            iArr[i10] = num == null ? -1 : num.intValue();
            iArr2[i10] = -1;
            io.odeeo.internal.n0.d dVar = dVarArr[i10];
            if (dVar != null) {
                k0 trackGroup = dVar.getTrackGroup();
                int i11 = 0;
                while (true) {
                    r[] rVarArr = this.f62459a;
                    if (i11 >= rVarArr.length) {
                        break;
                    }
                    if (rVarArr[i11].getTrackGroups().indexOf(trackGroup) != -1) {
                        iArr2[i10] = i11;
                        break;
                    }
                    i11++;
                }
            }
        }
        this.f62460b.clear();
        int length = dVarArr.length;
        d0[] d0VarArr2 = new d0[length];
        d0[] d0VarArr3 = new d0[dVarArr.length];
        io.odeeo.internal.n0.d[] dVarArr2 = new io.odeeo.internal.n0.d[dVarArr.length];
        ArrayList arrayList = new ArrayList(this.f62459a.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < this.f62459a.length) {
            for (int i13 = 0; i13 < dVarArr.length; i13++) {
                d0VarArr3[i13] = iArr[i13] == i12 ? d0VarArr[i13] : null;
                dVarArr2[i13] = iArr2[i13] == i12 ? dVarArr[i13] : null;
            }
            int i14 = i12;
            long jSelectTracks = this.f62459a[i12].selectTracks(dVarArr2, zArr, d0VarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = jSelectTracks;
            } else if (jSelectTracks != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < dVarArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    d0 d0Var2 = (d0) io.odeeo.internal.q0.a.checkNotNull(d0VarArr3[i15]);
                    d0VarArr2[i15] = d0VarArr3[i15];
                    this.f62460b.put(d0Var2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    io.odeeo.internal.q0.a.checkState(d0VarArr3[i15] == null);
                }
            }
            if (z10) {
                arrayList.add(this.f62459a[i14]);
            }
            i12 = i14 + 1;
        }
        System.arraycopy(d0VarArr2, 0, d0VarArr, 0, length);
        r[] rVarArr2 = (r[]) arrayList.toArray(new r[0]);
        this.f62465h = rVarArr2;
        this.f62466i = this.f62461c.createCompositeSequenceableLoader(rVarArr2);
        return j11;
    }

    @Override // io.odeeo.internal.a0.r.a, io.odeeo.internal.a0.e0.a
    public void onContinueLoadingRequested(r rVar) {
        ((r.a) io.odeeo.internal.q0.a.checkNotNull(this.f62463f)).onContinueLoadingRequested(this);
    }
}
