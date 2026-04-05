package io.odeeo.internal.d0;

import io.odeeo.internal.u0.h1;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.d0.b f63580a = new io.odeeo.internal.d0.b();

    /* renamed from: b, reason: collision with root package name */
    public final k f63581b = new k();

    /* renamed from: c, reason: collision with root package name */
    public final Deque<l> f63582c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public int f63583d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f63584e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends l {
        public a() {
        }

        @Override // io.odeeo.internal.e.h
        public void release() {
            d.this.a(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements f {

        /* renamed from: a, reason: collision with root package name */
        public final long f63586a;

        /* renamed from: b, reason: collision with root package name */
        public final h1<io.odeeo.internal.d0.a> f63587b;

        public b(long j10, h1<io.odeeo.internal.d0.a> h1Var) {
            this.f63586a = j10;
            this.f63587b = h1Var;
        }

        @Override // io.odeeo.internal.d0.f
        public List<io.odeeo.internal.d0.a> getCues(long j10) {
            return j10 >= this.f63586a ? this.f63587b : h1.of();
        }

        @Override // io.odeeo.internal.d0.f
        public long getEventTime(int i10) {
            io.odeeo.internal.q0.a.checkArgument(i10 == 0);
            return this.f63586a;
        }

        @Override // io.odeeo.internal.d0.f
        public int getEventTimeCount() {
            return 1;
        }

        @Override // io.odeeo.internal.d0.f
        public int getNextEventTimeIndex(long j10) {
            return this.f63586a > j10 ? 0 : -1;
        }
    }

    public d() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f63582c.addFirst(new a());
        }
        this.f63583d = 0;
    }

    @Override // io.odeeo.internal.d0.g, io.odeeo.internal.e.d
    public void flush() {
        io.odeeo.internal.q0.a.checkState(!this.f63584e);
        this.f63581b.clear();
        this.f63583d = 0;
    }

    @Override // io.odeeo.internal.d0.g, io.odeeo.internal.e.d
    public String getName() {
        return "ExoplayerCuesDecoder";
    }

    @Override // io.odeeo.internal.d0.g, io.odeeo.internal.e.d
    public void release() {
        this.f63584e = true;
    }

    public final void a(l lVar) {
        io.odeeo.internal.q0.a.checkState(this.f63582c.size() < 2);
        io.odeeo.internal.q0.a.checkArgument(!this.f63582c.contains(lVar));
        lVar.clear();
        this.f63582c.addFirst(lVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.odeeo.internal.d0.g, io.odeeo.internal.e.d
    public k dequeueInputBuffer() throws h {
        io.odeeo.internal.q0.a.checkState(!this.f63584e);
        if (this.f63583d != 0) {
            return null;
        }
        this.f63583d = 1;
        return this.f63581b;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.odeeo.internal.d0.g, io.odeeo.internal.e.d
    public l dequeueOutputBuffer() throws h {
        io.odeeo.internal.q0.a.checkState(!this.f63584e);
        if (this.f63583d != 2 || this.f63582c.isEmpty()) {
            return null;
        }
        l lVarRemoveFirst = this.f63582c.removeFirst();
        if (this.f63581b.isEndOfStream()) {
            lVarRemoveFirst.addFlag(4);
        } else {
            k kVar = this.f63581b;
            lVarRemoveFirst.setContent(this.f63581b.f63707e, new b(kVar.f63707e, this.f63580a.decode(((ByteBuffer) io.odeeo.internal.q0.a.checkNotNull(kVar.f63705c)).array())), 0L);
        }
        this.f63581b.clear();
        this.f63583d = 0;
        return lVarRemoveFirst;
    }

    @Override // io.odeeo.internal.d0.g, io.odeeo.internal.e.d
    public void queueInputBuffer(k kVar) throws h {
        io.odeeo.internal.q0.a.checkState(!this.f63584e);
        io.odeeo.internal.q0.a.checkState(this.f63583d == 1);
        io.odeeo.internal.q0.a.checkArgument(this.f63581b == kVar);
        this.f63583d = 2;
    }

    @Override // io.odeeo.internal.d0.g
    public void setPositionUs(long j10) {
    }
}
