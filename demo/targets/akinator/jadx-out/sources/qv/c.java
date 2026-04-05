package qv;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c extends qv.a implements h, t {

    /* renamed from: g, reason: collision with root package name */
    public static final a f83519g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final c f83520h = new c(1, 0);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final c getEMPTY() {
            return c.f83520h;
        }
    }

    public c(char c10, char c11) {
        super(c10, c11, 1);
    }

    @Override // qv.h, qv.t
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Character) comparable).charValue());
    }

    @Override // qv.a
    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return getFirst() == cVar.getFirst() && getLast() == cVar.getLast();
    }

    @Override // qv.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return getLast() + (getFirst() * 31);
    }

    @Override // qv.a, qv.h, qv.t
    public boolean isEmpty() {
        return e0.compare((int) getFirst(), (int) getLast()) > 0;
    }

    @Override // qv.a
    public String toString() {
        return getFirst() + ".." + getLast();
    }

    public boolean contains(char c10) {
        return e0.compare((int) getFirst(), (int) c10) <= 0 && e0.compare((int) c10, (int) getLast()) <= 0;
    }

    @Override // qv.t
    public Character getEndExclusive() {
        if (getLast() != 65535) {
            return Character.valueOf((char) (getLast() + 1));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    @Override // qv.h
    public Character getEndInclusive() {
        return Character.valueOf(getLast());
    }

    @Override // qv.h, qv.t
    public Character getStart() {
        return Character.valueOf(getFirst());
    }

    @tu.f
    public static /* synthetic */ void getEndExclusive$annotations() {
    }
}
