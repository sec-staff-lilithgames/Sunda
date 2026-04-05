package z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final k0 f96915a = new k0(0);

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f96916b = new int[0];

    public static final q buildIntSet(kv.l builderAction) {
        kotlin.jvm.internal.e0.checkNotNullParameter(builderAction, "builderAction");
        k0 k0Var = new k0(0, 1, null);
        builderAction.invoke(k0Var);
        return k0Var;
    }

    public static final q emptyIntSet() {
        return f96915a;
    }

    public static final int[] getEmptyIntArray() {
        return f96916b;
    }

    public static final int hash(int i10) {
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        return iHashCode ^ (iHashCode << 16);
    }

    public static final q intSetOf() {
        return f96915a;
    }

    public static final k0 mutableIntSetOf() {
        return new k0(0, 1, null);
    }

    public static final q buildIntSet(int i10, kv.l builderAction) {
        kotlin.jvm.internal.e0.checkNotNullParameter(builderAction, "builderAction");
        k0 k0Var = new k0(i10);
        builderAction.invoke(k0Var);
        return k0Var;
    }

    public static final q intSetOf(int i10) {
        return mutableIntSetOf(i10);
    }

    public static final k0 mutableIntSetOf(int i10) {
        k0 k0Var = new k0(1);
        k0Var.plusAssign(i10);
        return k0Var;
    }

    public static final q intSetOf(int i10, int i11) {
        return mutableIntSetOf(i10, i11);
    }

    public static final k0 mutableIntSetOf(int i10, int i11) {
        k0 k0Var = new k0(2);
        k0Var.plusAssign(i10);
        k0Var.plusAssign(i11);
        return k0Var;
    }

    public static final q intSetOf(int i10, int i11, int i12) {
        return mutableIntSetOf(i10, i11, i12);
    }

    public static final q intSetOf(int... elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        k0 k0Var = new k0(elements.length);
        k0Var.plusAssign(elements);
        return k0Var;
    }

    public static final k0 mutableIntSetOf(int i10, int i11, int i12) {
        k0 k0Var = new k0(3);
        k0Var.plusAssign(i10);
        k0Var.plusAssign(i11);
        k0Var.plusAssign(i12);
        return k0Var;
    }

    public static final k0 mutableIntSetOf(int... elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        k0 k0Var = new k0(elements.length);
        k0Var.plusAssign(elements);
        return k0Var;
    }
}
