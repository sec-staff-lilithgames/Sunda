package io.odeeo.internal.e0;

import io.odeeo.internal.d0.f;
import io.odeeo.internal.d0.g;
import io.odeeo.internal.d0.k;
import io.odeeo.internal.d0.l;
import io.odeeo.internal.e.h;
import io.odeeo.internal.q0.g0;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque<b> f63818a = new ArrayDeque<>();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque<l> f63819b;

    /* renamed from: c, reason: collision with root package name */
    public final PriorityQueue<b> f63820c;

    /* renamed from: d, reason: collision with root package name */
    public b f63821d;

    /* renamed from: e, reason: collision with root package name */
    public long f63822e;

    /* renamed from: f, reason: collision with root package name */
    public long f63823f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends k implements Comparable<b> {

        /* renamed from: j, reason: collision with root package name */
        public long f63824j;

        public b() {
        }

        @Override // java.lang.Comparable
        public int compareTo(b bVar) {
            if (isEndOfStream() != bVar.isEndOfStream()) {
                return isEndOfStream() ? 1 : -1;
            }
            long j10 = this.f63707e - bVar.f63707e;
            if (j10 == 0) {
                j10 = this.f63824j - bVar.f63824j;
                if (j10 == 0) {
                    return 0;
                }
            }
            return j10 > 0 ? 1 : -1;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.e0.c$c, reason: collision with other inner class name */
    public static final class C0607c extends l {

        /* renamed from: f, reason: collision with root package name */
        public h.a<C0607c> f63825f;

        public C0607c(h.a<C0607c> aVar) {
            this.f63825f = aVar;
        }

        @Override // io.odeeo.internal.e.h
        public final void release() {
            this.f63825f.releaseOutputBuffer(this);
        }
    }

    public c() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f63818a.add(new b());
        }
        this.f63819b = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f63819b.add(new C0607c(new ha.a(this, 25)));
        }
        this.f63820c = new PriorityQueue<>();
    }

    public abstract f a();

    public abstract void a(k kVar);

    public final void a(b bVar) {
        bVar.clear();
        this.f63818a.add(bVar);
    }

    public final l b() {
        return this.f63819b.pollFirst();
    }

    public final long c() {
        return this.f63822e;
    }

    public abstract boolean d();

    @Override // io.odeeo.internal.d0.g, io.odeeo.internal.e.d
    public void flush() {
        this.f63823f = 0L;
        this.f63822e = 0L;
        while (!this.f63820c.isEmpty()) {
            a((b) g0.castNonNull(this.f63820c.poll()));
        }
        b bVar = this.f63821d;
        if (bVar != null) {
            a(bVar);
            this.f63821d = null;
        }
    }

    @Override // io.odeeo.internal.d0.g, io.odeeo.internal.e.d
    public abstract String getName();

    @Override // io.odeeo.internal.d0.g
    public void setPositionUs(long j10) {
        this.f63822e = j10;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.odeeo.internal.d0.g, io.odeeo.internal.e.d
    public k dequeueInputBuffer() throws io.odeeo.internal.d0.h {
        io.odeeo.internal.q0.a.checkState(this.f63821d == null);
        if (this.f63818a.isEmpty()) {
            return null;
        }
        b bVarPollFirst = this.f63818a.pollFirst();
        this.f63821d = bVarPollFirst;
        return bVarPollFirst;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.odeeo.internal.d0.g, io.odeeo.internal.e.d
    public l dequeueOutputBuffer() throws io.odeeo.internal.d0.h {
        if (this.f63819b.isEmpty()) {
            return null;
        }
        while (!this.f63820c.isEmpty() && ((b) g0.castNonNull(this.f63820c.peek())).f63707e <= this.f63822e) {
            b bVar = (b) g0.castNonNull(this.f63820c.poll());
            if (bVar.isEndOfStream()) {
                l lVar = (l) g0.castNonNull(this.f63819b.pollFirst());
                lVar.addFlag(4);
                a(bVar);
                return lVar;
            }
            a((k) bVar);
            if (d()) {
                f fVarA = a();
                l lVar2 = (l) g0.castNonNull(this.f63819b.pollFirst());
                lVar2.setContent(bVar.f63707e, fVarA, Long.MAX_VALUE);
                a(bVar);
                return lVar2;
            }
            a(bVar);
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.odeeo.internal.d0.g, io.odeeo.internal.e.d
    public void queueInputBuffer(k kVar) throws io.odeeo.internal.d0.h {
        io.odeeo.internal.q0.a.checkArgument(kVar == this.f63821d);
        b bVar = (b) kVar;
        if (bVar.isDecodeOnly()) {
            a(bVar);
        } else {
            long j10 = this.f63823f;
            this.f63823f = 1 + j10;
            bVar.f63824j = j10;
            this.f63820c.add(bVar);
        }
        this.f63821d = null;
    }

    public void a(l lVar) {
        lVar.clear();
        this.f63819b.add(lVar);
    }

    @Override // io.odeeo.internal.d0.g, io.odeeo.internal.e.d
    public void release() {
    }
}
