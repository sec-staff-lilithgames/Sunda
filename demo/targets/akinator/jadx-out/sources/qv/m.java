package qv;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m extends k implements h, t {

    /* renamed from: g, reason: collision with root package name */
    public static final a f83537g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final m f83538h = new m(1, 0);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final m getEMPTY() {
            return m.f83538h;
        }
    }

    public m(int i10, int i11) {
        super(i10, i11, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qv.h, qv.t
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).intValue());
    }

    @Override // qv.k
    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        if (isEmpty() && ((m) obj).isEmpty()) {
            return true;
        }
        m mVar = (m) obj;
        return getFirst() == mVar.getFirst() && getLast() == mVar.getLast();
    }

    @Override // qv.k
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return getLast() + (getFirst() * 31);
    }

    @Override // qv.k, qv.h, qv.t
    public boolean isEmpty() {
        return getFirst() > getLast();
    }

    @Override // qv.k
    public String toString() {
        return getFirst() + ".." + getLast();
    }

    public boolean contains(int i10) {
        return getFirst() <= i10 && i10 <= getLast();
    }

    @Override // qv.t
    public Integer getEndExclusive() {
        if (getLast() != Integer.MAX_VALUE) {
            return Integer.valueOf(getLast() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    @Override // qv.h
    public Integer getEndInclusive() {
        return Integer.valueOf(getLast());
    }

    @Override // qv.h, qv.t
    public Integer getStart() {
        return Integer.valueOf(getFirst());
    }

    @tu.f
    public static /* synthetic */ void getEndExclusive$annotations() {
    }
}
