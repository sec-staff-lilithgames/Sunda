package nh;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class n extends g implements SortedMap {

    /* renamed from: h, reason: collision with root package name */
    public SortedSet f76486h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w f76487i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(w wVar, SortedMap sortedMap) {
        super(wVar, sortedMap);
        this.f76487i = wVar;
    }

    @Override // java.util.SortedMap
    public Comparator<Object> comparator() {
        return e().comparator();
    }

    @Override // nh.dc
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public SortedSet createKeySet() {
        return new o(this.f76487i, e());
    }

    public SortedMap e() {
        return (SortedMap) this.f76274f;
    }

    @Override // java.util.SortedMap
    public Object firstKey() {
        return e().firstKey();
    }

    public SortedMap<Object, Collection<Object>> headMap(Object obj) {
        return new n(this.f76487i, e().headMap(obj));
    }

    @Override // java.util.SortedMap
    public Object lastKey() {
        return e().lastKey();
    }

    public SortedMap<Object, Collection<Object>> subMap(Object obj, Object obj2) {
        return new n(this.f76487i, e().subMap(obj, obj2));
    }

    public SortedMap<Object, Collection<Object>> tailMap(Object obj) {
        return new n(this.f76487i, e().tailMap(obj));
    }

    @Override // nh.g, nh.dc, java.util.AbstractMap, java.util.Map
    public SortedSet<Object> keySet() {
        SortedSet<Object> sortedSet = this.f76486h;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet<Object> sortedSetCreateKeySet = createKeySet();
        this.f76486h = sortedSetCreateKeySet;
        return sortedSetCreateKeySet;
    }
}
