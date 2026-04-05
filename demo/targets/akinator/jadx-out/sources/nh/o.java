package nh;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class o extends j implements SortedSet {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f76517e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(w wVar, SortedMap sortedMap) {
        super(wVar, sortedMap);
        this.f76517e = wVar;
    }

    @Override // java.util.SortedSet
    public Comparator<Object> comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f76503b;
    }

    @Override // java.util.SortedSet
    public Object first() {
        return d().firstKey();
    }

    public SortedSet<Object> headSet(Object obj) {
        return new o(this.f76517e, d().headMap(obj));
    }

    @Override // java.util.SortedSet
    public Object last() {
        return d().lastKey();
    }

    public SortedSet<Object> subSet(Object obj, Object obj2) {
        return new o(this.f76517e, d().subMap(obj, obj2));
    }

    public SortedSet<Object> tailSet(Object obj) {
        return new o(this.f76517e, d().tailMap(obj));
    }
}
