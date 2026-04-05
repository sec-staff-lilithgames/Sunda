package z;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object[] f96819a = new Object[0];

    /* renamed from: b, reason: collision with root package name */
    public static final t0 f96820b = new t0(0);

    public static final void access$checkIndex(List list, int i10) {
        int size = list.size();
        if (i10 < 0 || i10 >= size) {
            a0.d.throwIndexOutOfBoundsException("Index " + i10 + " is out of bounds. The list has " + size + " elements.");
        }
    }

    public static final void access$checkSubIndex(List list, int i10, int i11) {
        int size = list.size();
        if (i10 > i11) {
            a0.d.throwIllegalArgumentException("Indices are out of order. fromIndex (" + i10 + ") is greater than toIndex (" + i11 + ").");
        }
        if (i10 < 0) {
            a0.d.throwIndexOutOfBoundsException("fromIndex (" + i10 + ") is less than 0.");
        }
        if (i11 > size) {
            a0.d.throwIndexOutOfBoundsException("toIndex (" + i11 + ") is more than than the list size (" + size + ')');
        }
    }

    public static final <E> f1 emptyObjectList() {
        t0 t0Var = f96820b;
        kotlin.jvm.internal.e0.checkNotNull(t0Var, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
        return t0Var;
    }

    public static final <E> t0 mutableObjectListOf() {
        return new t0(0, 1, null);
    }

    public static final <E> f1 objectListOf() {
        t0 t0Var = f96820b;
        kotlin.jvm.internal.e0.checkNotNull(t0Var, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.objectListOf>");
        return t0Var;
    }

    public static final <E> t0 mutableObjectListOf(E e10) {
        t0 t0Var = new t0(1);
        t0Var.add(e10);
        return t0Var;
    }

    public static final <E> f1 objectListOf(E e10) {
        return mutableObjectListOf(e10);
    }

    public static final <E> f1 objectListOf(E e10, E e11) {
        return mutableObjectListOf(e10, e11);
    }

    public static final <E> t0 mutableObjectListOf(E e10, E e11) {
        t0 t0Var = new t0(2);
        t0Var.add(e10);
        t0Var.add(e11);
        return t0Var;
    }

    public static final <E> f1 objectListOf(E e10, E e11, E e12) {
        return mutableObjectListOf(e10, e11, e12);
    }

    public static final <E> f1 objectListOf(E... elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        t0 t0Var = new t0(elements.length);
        t0Var.plusAssign((Object[]) elements);
        return t0Var;
    }

    public static final <E> t0 mutableObjectListOf(E e10, E e11, E e12) {
        t0 t0Var = new t0(3);
        t0Var.add(e10);
        t0Var.add(e11);
        t0Var.add(e12);
        return t0Var;
    }

    public static final <E> t0 mutableObjectListOf(E... elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        t0 t0Var = new t0(elements.length);
        t0Var.plusAssign((Object[]) elements);
        return t0Var;
    }
}
