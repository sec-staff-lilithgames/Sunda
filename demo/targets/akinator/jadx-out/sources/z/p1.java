package z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class p1 {

    /* renamed from: a, reason: collision with root package name */
    public static final v0 f96897a = new v0(0);

    public static final <E> o1 emptyScatterSet() {
        v0 v0Var = f96897a;
        kotlin.jvm.internal.e0.checkNotNull(v0Var, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        return v0Var;
    }

    public static final <E> v0 mutableScatterSetOf() {
        return new v0(0, 1, null);
    }

    public static final <E> o1 scatterSetOf() {
        v0 v0Var = f96897a;
        kotlin.jvm.internal.e0.checkNotNull(v0Var, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.scatterSetOf>");
        return v0Var;
    }

    public static final <E> v0 mutableScatterSetOf(E e10) {
        v0 v0Var = new v0(1);
        v0Var.plusAssign(e10);
        return v0Var;
    }

    public static final <E> o1 scatterSetOf(E e10) {
        return mutableScatterSetOf(e10);
    }

    public static final <E> v0 mutableScatterSetOf(E e10, E e11) {
        v0 v0Var = new v0(2);
        v0Var.plusAssign(e10);
        v0Var.plusAssign(e11);
        return v0Var;
    }

    public static final <E> o1 scatterSetOf(E e10, E e11) {
        return mutableScatterSetOf(e10, e11);
    }

    public static final <E> o1 scatterSetOf(E e10, E e11, E e12) {
        return mutableScatterSetOf(e10, e11, e12);
    }

    public static final <E> o1 scatterSetOf(E... elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        v0 v0Var = new v0(elements.length);
        v0Var.plusAssign((Object[]) elements);
        return v0Var;
    }

    public static final <E> v0 mutableScatterSetOf(E e10, E e11, E e12) {
        v0 v0Var = new v0(3);
        v0Var.plusAssign(e10);
        v0Var.plusAssign(e11);
        v0Var.plusAssign(e12);
        return v0Var;
    }

    public static final <E> v0 mutableScatterSetOf(E... elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        v0 v0Var = new v0(elements.length);
        v0Var.plusAssign((Object[]) elements);
        return v0Var;
    }
}
