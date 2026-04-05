package qv;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p extends n implements h, t {

    /* renamed from: g, reason: collision with root package name */
    public static final a f83547g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final p f83548h = new p(1, 0);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final p getEMPTY() {
            return p.f83548h;
        }
    }

    public p(long j10, long j11) {
        super(j10, j11, 1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qv.h, qv.t
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).longValue());
    }

    @Override // qv.n
    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        if (isEmpty() && ((p) obj).isEmpty()) {
            return true;
        }
        p pVar = (p) obj;
        return getFirst() == pVar.getFirst() && getLast() == pVar.getLast();
    }

    @Override // qv.n
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (getFirst() ^ (getFirst() >>> 32))) + (getLast() ^ (getLast() >>> 32)));
    }

    @Override // qv.n, qv.h, qv.t
    public boolean isEmpty() {
        return getFirst() > getLast();
    }

    @Override // qv.n
    public String toString() {
        return getFirst() + ".." + getLast();
    }

    public boolean contains(long j10) {
        return getFirst() <= j10 && j10 <= getLast();
    }

    @Override // qv.t
    public Long getEndExclusive() {
        if (getLast() != Long.MAX_VALUE) {
            return Long.valueOf(getLast() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    @Override // qv.h
    public Long getEndInclusive() {
        return Long.valueOf(getLast());
    }

    @Override // qv.h, qv.t
    public Long getStart() {
        return Long.valueOf(getFirst());
    }

    @tu.f
    public static /* synthetic */ void getEndExclusive$annotations() {
    }
}
