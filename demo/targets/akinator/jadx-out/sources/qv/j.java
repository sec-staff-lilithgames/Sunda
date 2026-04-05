package qv;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class j implements h {

    /* renamed from: b, reason: collision with root package name */
    public final Comparable f83527b;

    /* renamed from: c, reason: collision with root package name */
    public final Comparable f83528c;

    public j(Comparable<Object> start, Comparable<Object> endInclusive) {
        e0.checkNotNullParameter(start, "start");
        e0.checkNotNullParameter(endInclusive, "endInclusive");
        this.f83527b = start;
        this.f83528c = endInclusive;
    }

    @Override // qv.h, qv.t
    public boolean contains(Comparable<Object> comparable) {
        return g.contains(this, comparable);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (isEmpty() && ((j) obj).isEmpty()) {
            return true;
        }
        j jVar = (j) obj;
        return e0.areEqual(getStart(), jVar.getStart()) && e0.areEqual(getEndInclusive(), jVar.getEndInclusive());
    }

    @Override // qv.h
    public Comparable<Object> getEndInclusive() {
        return this.f83528c;
    }

    @Override // qv.h, qv.t
    public Comparable<Object> getStart() {
        return this.f83527b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return getEndInclusive().hashCode() + (getStart().hashCode() * 31);
    }

    @Override // qv.h, qv.t
    public boolean isEmpty() {
        return g.isEmpty(this);
    }

    public String toString() {
        return getStart() + ".." + getEndInclusive();
    }
}
