package nh;

import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class v extends q implements SortedSet {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w f76702h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, Object obj, SortedSet sortedSet, q qVar) {
        super(wVar, obj, sortedSet, qVar);
        this.f76702h = wVar;
    }

    @Override // java.util.SortedSet
    public Comparator<Object> comparator() {
        return f().comparator();
    }

    public SortedSet f() {
        return (SortedSet) this.f76572c;
    }

    @Override // java.util.SortedSet
    public Object first() {
        d();
        return f().first();
    }

    @Override // java.util.SortedSet
    public SortedSet<Object> headSet(Object obj) {
        d();
        SortedSet sortedSetHeadSet = f().headSet(obj);
        q qVar = this.f76573e;
        if (qVar == null) {
            qVar = this;
        }
        return new v(this.f76702h, this.f76571b, sortedSetHeadSet, qVar);
    }

    @Override // java.util.SortedSet
    public Object last() {
        d();
        return f().last();
    }

    @Override // java.util.SortedSet
    public SortedSet<Object> subSet(Object obj, Object obj2) {
        d();
        SortedSet sortedSetSubSet = f().subSet(obj, obj2);
        q qVar = this.f76573e;
        if (qVar == null) {
            qVar = this;
        }
        return new v(this.f76702h, this.f76571b, sortedSetSubSet, qVar);
    }

    @Override // java.util.SortedSet
    public SortedSet<Object> tailSet(Object obj) {
        d();
        SortedSet sortedSetTailSet = f().tailSet(obj);
        q qVar = this.f76573e;
        if (qVar == null) {
            qVar = this;
        }
        return new v(this.f76702h, this.f76571b, sortedSetTailSet, qVar);
    }
}
