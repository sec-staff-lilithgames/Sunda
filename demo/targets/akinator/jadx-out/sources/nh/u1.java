package nh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u1 extends b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f76677e;

    /* renamed from: f, reason: collision with root package name */
    public Object f76678f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f76679g;

    public /* synthetic */ u1(j0 j0Var, Iterator it, int i10) {
        this.f76677e = i10;
        this.f76678f = it;
        this.f76679g = j0Var;
    }

    @Override // nh.b
    public final Object computeNext() {
        switch (this.f76677e) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f76678f;
                if (arrayList == null) {
                    this.f76111b = 3;
                    return null;
                }
                b5 b5VarCopyOf = b5.copyOf((Collection) arrayList);
                Comparator comparator = (Comparator) this.f76679g;
                Objects.requireNonNull((ArrayList) this.f76678f);
                int size = ((ArrayList) this.f76678f).size() - 2;
                while (true) {
                    if (size < 0) {
                        size = -1;
                    } else if (comparator.compare(((ArrayList) this.f76678f).get(size), ((ArrayList) this.f76678f).get(size + 1)) >= 0) {
                        size--;
                    }
                }
                if (size != -1) {
                    Objects.requireNonNull((ArrayList) this.f76678f);
                    Objects.requireNonNull((ArrayList) this.f76678f);
                    Object obj = ((ArrayList) this.f76678f).get(size);
                    for (int size2 = ((ArrayList) this.f76678f).size() - 1; size2 > size; size2--) {
                        if (comparator.compare(obj, ((ArrayList) this.f76678f).get(size2)) < 0) {
                            Collections.swap((ArrayList) this.f76678f, size, size2);
                            Collections.reverse(((ArrayList) this.f76678f).subList(size + 1, ((ArrayList) this.f76678f).size()));
                        }
                    }
                    throw new AssertionError("this statement should be unreachable");
                }
                this.f76678f = null;
                return b5VarCopyOf;
            case 1:
                Iterator it = (Iterator) this.f76678f;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    Collection collectionG = n3.g((Collection) entry.getValue(), new m3(((f3) this.f76679g).f76247b.f76349f, key));
                    if (!collectionG.isEmpty()) {
                        return ec.immutableEntry(key, collectionG);
                    }
                }
                this.f76111b = 3;
                return null;
            case 2:
                Iterator it2 = (Iterator) this.f76678f;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (((mh.q1) this.f76679g).apply(next)) {
                        return next;
                    }
                }
                this.f76111b = 3;
                return null;
            case 3:
                Iterator it3 = (Iterator) this.f76678f;
                if (!it3.hasNext()) {
                    this.f76111b = 3;
                    return null;
                }
                ze zeVar = (ze) it3.next();
                if (!((aj) this.f76679g).f76110c.f76828c.g(zeVar.f76828c)) {
                    return ec.immutableEntry(zeVar.f76828c, zeVar);
                }
                this.f76111b = 3;
                return null;
            case 4:
                x7 x7Var = (x7) this.f76678f;
                if (!x7Var.hasNext()) {
                    this.f76111b = 3;
                    return null;
                }
                ze zeVar2 = (ze) x7Var.next();
                if (((aj) this.f76679g).f76110c.f76827b.g(zeVar2.f76828c)) {
                    return ec.immutableEntry(zeVar2.f76828c, zeVar2);
                }
                this.f76111b = 3;
                return null;
            default:
                cj cjVar = (cj) this.f76679g;
                ze zeVar3 = cjVar.f76162c;
                Iterator it4 = (Iterator) this.f76678f;
                if (!it4.hasNext()) {
                    this.f76111b = 3;
                    return null;
                }
                ze zeVar4 = (ze) it4.next();
                if (zeVar3.f76827b.compareTo(zeVar4.f76828c) >= 0) {
                    this.f76111b = 3;
                    return null;
                }
                ze zeVarIntersection = zeVar4.intersection(zeVar3);
                if (cjVar.f76161b.contains(zeVarIntersection.f76827b)) {
                    return ec.immutableEntry(zeVarIntersection.f76827b, zeVarIntersection);
                }
                this.f76111b = 3;
                return null;
        }
    }

    public u1(f3 f3Var) {
        this.f76677e = 1;
        this.f76679g = f3Var;
        this.f76678f = f3Var.f76247b.f76349f.f76492h.asMap().entrySet().iterator();
    }

    public u1(List list, Comparator comparator) {
        this.f76677e = 0;
        this.f76678f = new ArrayList(list);
        this.f76679g = comparator;
    }

    public u1(Iterator it, mh.q1 q1Var) {
        this.f76677e = 2;
        this.f76678f = it;
        this.f76679g = q1Var;
    }
}
