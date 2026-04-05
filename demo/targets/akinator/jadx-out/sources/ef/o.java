package ef;

import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.z0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ee.e0;
import ee.f0;
import ee.l0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import rh.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class o implements ee.p {

    /* renamed from: a, reason: collision with root package name */
    public final k f54324a;

    /* renamed from: d, reason: collision with root package name */
    public final z0 f54327d;

    /* renamed from: g, reason: collision with root package name */
    public ee.s f54330g;

    /* renamed from: h, reason: collision with root package name */
    public l0 f54331h;

    /* renamed from: i, reason: collision with root package name */
    public int f54332i;

    /* renamed from: b, reason: collision with root package name */
    public final d f54325b = new d();

    /* renamed from: c, reason: collision with root package name */
    public final v0 f54326c = new v0();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f54328e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f54329f = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public int f54333j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f54334k = C.TIME_UNSET;

    public o(k kVar, z0 z0Var) {
        this.f54324a = kVar;
        this.f54327d = z0Var.buildUpon().setSampleMimeType("text/x-exoplayer-cues").setCodecs(z0Var.f28802n).build();
    }

    public final void a() {
        com.google.android.exoplayer2.util.a.checkStateNotNull(this.f54331h);
        ArrayList arrayList = this.f54328e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f54329f;
        com.google.android.exoplayer2.util.a.checkState(size == arrayList2.size());
        long j10 = this.f54334k;
        for (int iBinarySearchFloor = j10 == C.TIME_UNSET ? 0 : n1.binarySearchFloor((List<? extends Comparable<? super Long>>) arrayList, Long.valueOf(j10), true, true); iBinarySearchFloor < arrayList2.size(); iBinarySearchFloor++) {
            v0 v0Var = (v0) arrayList2.get(iBinarySearchFloor);
            v0Var.setPosition(0);
            int length = v0Var.getData().length;
            this.f54331h.sampleData(v0Var, length);
            this.f54331h.sampleMetadata(((Long) arrayList.get(iBinarySearchFloor)).longValue(), 1, length, 0, null);
        }
    }

    @Override // ee.p
    public void init(ee.s sVar) {
        com.google.android.exoplayer2.util.a.checkState(this.f54333j == 0);
        this.f54330g = sVar;
        this.f54331h = sVar.track(0, 3);
        this.f54330g.endTracks();
        this.f54330g.seekMap(new e0(new long[]{0}, new long[]{0}, C.TIME_UNSET));
        this.f54331h.format(this.f54327d);
        this.f54333j = 1;
    }

    @Override // ee.p
    public int read(ee.q qVar, f0 f0Var) throws InterruptedException, ce.g, IOException {
        int i10 = this.f54333j;
        com.google.android.exoplayer2.util.a.checkState((i10 == 0 || i10 == 5) ? false : true);
        int i11 = this.f54333j;
        v0 v0Var = this.f54326c;
        if (i11 == 1) {
            v0Var.reset(qVar.getLength() != -1 ? w.checkedCast(qVar.getLength()) : 1024);
            this.f54332i = 0;
            this.f54333j = 2;
        }
        if (this.f54333j == 2) {
            int iCapacity = v0Var.capacity();
            int i12 = this.f54332i;
            if (iCapacity == i12) {
                v0Var.ensureCapacity(i12 + 1024);
            }
            int i13 = qVar.read(v0Var.getData(), this.f54332i, v0Var.capacity() - this.f54332i);
            if (i13 != -1) {
                this.f54332i += i13;
            }
            long length = qVar.getLength();
            if ((length != -1 && this.f54332i == length) || i13 == -1) {
                k kVar = this.f54324a;
                try {
                    p pVar = (p) kVar.dequeueInputBuffer();
                    while (pVar == null) {
                        Thread.sleep(5L);
                        pVar = (p) kVar.dequeueInputBuffer();
                    }
                    pVar.ensureSpaceForWrite(this.f54332i);
                    pVar.f12237e.put(v0Var.getData(), 0, this.f54332i);
                    pVar.f12237e.limit(this.f54332i);
                    kVar.queueInputBuffer(pVar);
                    q qVar2 = (q) kVar.dequeueOutputBuffer();
                    while (qVar2 == null) {
                        Thread.sleep(5L);
                        qVar2 = (q) kVar.dequeueOutputBuffer();
                    }
                    for (int i14 = 0; i14 < qVar2.getEventTimeCount(); i14++) {
                        byte[] bArrEncode = this.f54325b.encode(qVar2.getCues(qVar2.getEventTime(i14)));
                        this.f54328e.add(Long.valueOf(qVar2.getEventTime(i14)));
                        this.f54329f.add(new v0(bArrEncode));
                    }
                    qVar2.release();
                    a();
                    this.f54333j = 4;
                } catch (l e10) {
                    throw h2.createForMalformedContainer("SubtitleDecoder failed.", e10);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            }
        }
        if (this.f54333j == 3) {
            if (qVar.skip(qVar.getLength() != -1 ? w.checkedCast(qVar.getLength()) : 1024) == -1) {
                a();
                this.f54333j = 4;
            }
        }
        return this.f54333j == 4 ? -1 : 0;
    }

    @Override // ee.p
    public void release() {
        if (this.f54333j == 5) {
            return;
        }
        this.f54324a.release();
        this.f54333j = 5;
    }

    @Override // ee.p
    public void seek(long j10, long j11) {
        int i10 = this.f54333j;
        com.google.android.exoplayer2.util.a.checkState((i10 == 0 || i10 == 5) ? false : true);
        this.f54334k = j11;
        if (this.f54333j == 2) {
            this.f54333j = 1;
        }
        if (this.f54333j == 4) {
            this.f54333j = 3;
        }
    }

    @Override // ee.p
    public boolean sniff(ee.q qVar) throws IOException {
        return true;
    }
}
