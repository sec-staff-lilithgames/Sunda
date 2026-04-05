package qv;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class i implements t {

    /* renamed from: b, reason: collision with root package name */
    public final Comparable f83525b;

    /* renamed from: c, reason: collision with root package name */
    public final Comparable f83526c;

    public i(Comparable<Object> start, Comparable<Object> endExclusive) {
        e0.checkNotNullParameter(start, "start");
        e0.checkNotNullParameter(endExclusive, "endExclusive");
        this.f83525b = start;
        this.f83526c = endExclusive;
    }

    @Override // qv.t
    public boolean contains(Comparable<Object> comparable) {
        return s.contains(this, comparable);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (isEmpty() && ((i) obj).isEmpty()) {
            return true;
        }
        i iVar = (i) obj;
        return e0.areEqual(getStart(), iVar.getStart()) && e0.areEqual(getEndExclusive(), iVar.getEndExclusive());
    }

    @Override // qv.t
    public Comparable<Object> getEndExclusive() {
        return this.f83526c;
    }

    @Override // qv.t
    public Comparable<Object> getStart() {
        return this.f83525b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return getEndExclusive().hashCode() + (getStart().hashCode() * 31);
    }

    @Override // qv.t
    public boolean isEmpty() {
        return s.isEmpty(this);
    }

    public String toString() {
        return getStart() + "..<" + getEndExclusive();
    }
}
