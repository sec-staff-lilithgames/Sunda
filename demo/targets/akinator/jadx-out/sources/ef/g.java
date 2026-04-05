package ef;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.List;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g implements k {

    /* renamed from: a, reason: collision with root package name */
    public final c f54314a = new c();

    /* renamed from: b, reason: collision with root package name */
    public final p f54315b = new p();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f54316c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public int f54317d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f54318e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements j {

        /* renamed from: b, reason: collision with root package name */
        public final long f54319b;

        /* renamed from: c, reason: collision with root package name */
        public final b5 f54320c;

        public a(long j10, b5 b5Var) {
            this.f54319b = j10;
            this.f54320c = b5Var;
        }

        @Override // ef.j
        public List<b> getCues(long j10) {
            return j10 >= this.f54319b ? this.f54320c : b5.of();
        }

        @Override // ef.j
        public long getEventTime(int i10) {
            com.google.android.exoplayer2.util.a.checkArgument(i10 == 0);
            return this.f54319b;
        }

        @Override // ef.j
        public int getEventTimeCount() {
            return 1;
        }

        @Override // ef.j
        public int getNextEventTimeIndex(long j10) {
            return this.f54319b > j10 ? 0 : -1;
        }
    }

    public g() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f54316c.addFirst(new f(this));
        }
        this.f54317d = 0;
    }

    @Override // ef.k, ce.e
    public void flush() {
        com.google.android.exoplayer2.util.a.checkState(!this.f54318e);
        this.f54315b.clear();
        this.f54317d = 0;
    }

    @Override // ef.k, ce.e
    public String getName() {
        return "ExoplayerCuesDecoder";
    }

    @Override // ef.k, ce.e
    public void release() {
        this.f54318e = true;
    }

    @Override // ef.k, ce.e
    public p dequeueInputBuffer() throws l {
        com.google.android.exoplayer2.util.a.checkState(!this.f54318e);
        if (this.f54317d != 0) {
            return null;
        }
        this.f54317d = 1;
        return this.f54315b;
    }

    @Override // ef.k, ce.e
    public q dequeueOutputBuffer() throws l {
        com.google.android.exoplayer2.util.a.checkState(!this.f54318e);
        if (this.f54317d != 2) {
            return null;
        }
        ArrayDeque arrayDeque = this.f54316c;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        q qVar = (q) arrayDeque.removeFirst();
        p pVar = this.f54315b;
        if (pVar.isEndOfStream()) {
            qVar.addFlag(4);
        } else {
            qVar.setContent(pVar.f12239g, new a(pVar.f12239g, this.f54314a.decode(((ByteBuffer) com.google.android.exoplayer2.util.a.checkNotNull(pVar.f12237e)).array())), 0L);
        }
        pVar.clear();
        this.f54317d = 0;
        return qVar;
    }

    @Override // ef.k, ce.e
    public void queueInputBuffer(p pVar) throws l {
        com.google.android.exoplayer2.util.a.checkState(!this.f54318e);
        com.google.android.exoplayer2.util.a.checkState(this.f54317d == 1);
        com.google.android.exoplayer2.util.a.checkArgument(this.f54315b == pVar);
        this.f54317d = 2;
    }

    @Override // ef.k
    public void setPositionUs(long j10) {
    }
}
