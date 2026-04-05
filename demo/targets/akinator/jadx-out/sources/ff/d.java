package ff;

import af.g;
import ce.i;
import com.google.android.exoplayer2.util.n1;
import ef.k;
import ef.l;
import ef.p;
import ef.q;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class d implements k {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f55698a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f55699b;

    /* renamed from: c, reason: collision with root package name */
    public final PriorityQueue f55700c;

    /* renamed from: d, reason: collision with root package name */
    public c f55701d;

    /* renamed from: e, reason: collision with root package name */
    public long f55702e;

    /* renamed from: f, reason: collision with root package name */
    public long f55703f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends q {

        /* renamed from: g, reason: collision with root package name */
        public final i f55704g;

        public a(i iVar) {
            this.f55704g = iVar;
        }

        @Override // ce.j
        public final void release() {
            ((g) this.f55704g).releaseOutputBuffer(this);
        }
    }

    public d() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f55698a.add(new c());
        }
        this.f55699b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f55699b.add(new a(new g(this, 27)));
        }
        this.f55700c = new PriorityQueue();
    }

    public abstract e a();

    public abstract void b(c cVar);

    public abstract boolean c();

    @Override // ef.k, ce.e
    public void flush() {
        ArrayDeque arrayDeque;
        this.f55703f = 0L;
        this.f55702e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.f55700c;
            boolean zIsEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f55698a;
            if (zIsEmpty) {
                break;
            }
            c cVar = (c) n1.castNonNull((c) priorityQueue.poll());
            cVar.clear();
            arrayDeque.add(cVar);
        }
        c cVar2 = this.f55701d;
        if (cVar2 != null) {
            cVar2.clear();
            arrayDeque.add(cVar2);
            this.f55701d = null;
        }
    }

    @Override // ef.k, ce.e
    public abstract String getName();

    @Override // ef.k
    public void setPositionUs(long j10) {
        this.f55702e = j10;
    }

    @Override // ef.k, ce.e
    public p dequeueInputBuffer() throws l {
        com.google.android.exoplayer2.util.a.checkState(this.f55701d == null);
        ArrayDeque arrayDeque = this.f55698a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        c cVar = (c) arrayDeque.pollFirst();
        this.f55701d = cVar;
        return cVar;
    }

    @Override // ef.k, ce.e
    public q dequeueOutputBuffer() throws l {
        ArrayDeque arrayDeque = this.f55699b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.f55700c;
            if (priorityQueue.isEmpty() || ((c) n1.castNonNull((c) priorityQueue.peek())).f12239g > this.f55702e) {
                return null;
            }
            c cVar = (c) n1.castNonNull((c) priorityQueue.poll());
            boolean zIsEndOfStream = cVar.isEndOfStream();
            ArrayDeque arrayDeque2 = this.f55698a;
            if (zIsEndOfStream) {
                q qVar = (q) n1.castNonNull((q) arrayDeque.pollFirst());
                qVar.addFlag(4);
                cVar.clear();
                arrayDeque2.add(cVar);
                return qVar;
            }
            b(cVar);
            if (c()) {
                e eVarA = a();
                q qVar2 = (q) n1.castNonNull((q) arrayDeque.pollFirst());
                qVar2.setContent(cVar.f12239g, eVarA, Long.MAX_VALUE);
                cVar.clear();
                arrayDeque2.add(cVar);
                return qVar2;
            }
            cVar.clear();
            arrayDeque2.add(cVar);
        }
    }

    @Override // ef.k, ce.e
    public void queueInputBuffer(p pVar) throws l {
        com.google.android.exoplayer2.util.a.checkArgument(pVar == this.f55701d);
        c cVar = (c) pVar;
        if (cVar.isDecodeOnly()) {
            cVar.clear();
            this.f55698a.add(cVar);
        } else {
            long j10 = this.f55703f;
            this.f55703f = 1 + j10;
            cVar.f55697l = j10;
            this.f55700c.add(cVar);
        }
        this.f55701d = null;
    }

    @Override // ef.k, ce.e
    public void release() {
    }
}
