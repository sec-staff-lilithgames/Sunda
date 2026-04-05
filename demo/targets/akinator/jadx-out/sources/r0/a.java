package r0;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import kv.l;
import uu.u0;
import z.f1;
import z.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: r0.a$a, reason: collision with other inner class name */
    public static final class C0773a implements Comparator {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f83645b;

        public C0773a(l lVar) {
            this.f83645b = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            l lVar = this.f83645b;
            return xu.d.compareValues((Comparable) lVar.invoke(obj), (Comparable) lVar.invoke(obj2));
        }
    }

    public static final <T> boolean all(f1 f1Var, l lVar) {
        Object[] objArr = f1Var.f96812a;
        int i10 = f1Var.f96813b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (!((Boolean) lVar.invoke(objArr[i11])).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> f1 fastFilter(f1 f1Var, l lVar) {
        Object[] objArr = f1Var.f96812a;
        int i10 = f1Var.f96813b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (!((Boolean) lVar.invoke(objArr[i12])).booleanValue()) {
                t0 t0Var = new t0(i11, 1, null);
                Object[] objArr2 = f1Var.f96812a;
                int i13 = f1Var.f96813b;
                while (i11 < i13) {
                    Object obj = objArr2[i11];
                    if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                        t0Var.add(obj);
                    }
                    i11++;
                }
                return t0Var;
            }
        }
        return f1Var;
    }

    public static final <T, R> f1 fastMap(f1 f1Var, l lVar) {
        t0 t0Var = new t0(f1Var.getSize());
        Object[] objArr = f1Var.f96812a;
        int i10 = f1Var.f96813b;
        for (int i11 = 0; i11 < i10; i11++) {
            t0Var.add(lVar.invoke(objArr[i11]));
        }
        return t0Var;
    }

    public static final <T, K extends Comparable<? super K>> boolean isSorted(f1 f1Var, l lVar) {
        if (f1Var.getSize() <= 1) {
            return true;
        }
        Comparable comparable = (Comparable) lVar.invoke(f1Var.get(0));
        if (comparable == null) {
            return false;
        }
        int size = f1Var.getSize();
        int i10 = 1;
        while (i10 < size) {
            Comparable comparable2 = (Comparable) lVar.invoke(f1Var.get(i10));
            if (comparable2 == null || comparable.compareTo(comparable2) > 0) {
                return false;
            }
            i10++;
            comparable = comparable2;
        }
        return true;
    }

    public static final <T> T removeLast(t0 t0Var) {
        if (t0Var.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        int size = t0Var.getSize() - 1;
        T t10 = (T) t0Var.get(size);
        t0Var.removeAt(size);
        return t10;
    }

    public static final <T, K extends Comparable<? super K>> void sortBy(t0 t0Var, l lVar) {
        List<Object> listAsMutableList = t0Var.asMutableList();
        if (listAsMutableList.size() > 1) {
            u0.sortWith(listAsMutableList, new C0773a(lVar));
        }
    }

    public static final <T, K extends Comparable<? super K>> f1 sortedBy(f1 f1Var, l lVar) {
        if (isSorted(f1Var, lVar)) {
            return f1Var;
        }
        t0 mutableObjectList = toMutableObjectList(f1Var);
        sortBy(mutableObjectList, lVar);
        return mutableObjectList;
    }

    public static final <T> t0 toMutableObjectList(f1 f1Var) {
        t0 t0Var = new t0(f1Var.getSize());
        Object[] objArr = f1Var.f96812a;
        int i10 = f1Var.f96813b;
        for (int i11 = 0; i11 < i10; i11++) {
            t0Var.add(objArr[i11]);
        }
        return t0Var;
    }
}
