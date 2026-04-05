package z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final p0 f96958a = new p0(0);

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f96959b = new long[0];

    public static final v buildLongSet(kv.l builderAction) {
        kotlin.jvm.internal.e0.checkNotNullParameter(builderAction, "builderAction");
        p0 p0Var = new p0(0, 1, null);
        builderAction.invoke(p0Var);
        return p0Var;
    }

    public static final v emptyLongSet() {
        return f96958a;
    }

    public static final long[] getEmptyLongArray() {
        return f96959b;
    }

    public static final int hash(long j10) {
        int iHashCode = Long.hashCode(j10) * (-862048943);
        return iHashCode ^ (iHashCode << 16);
    }

    public static final v longSetOf() {
        return f96958a;
    }

    public static final p0 mutableLongSetOf() {
        return new p0(0, 1, null);
    }

    public static final v buildLongSet(int i10, kv.l builderAction) {
        kotlin.jvm.internal.e0.checkNotNullParameter(builderAction, "builderAction");
        p0 p0Var = new p0(i10);
        builderAction.invoke(p0Var);
        return p0Var;
    }

    public static final v longSetOf(long j10) {
        return mutableLongSetOf(j10);
    }

    public static final p0 mutableLongSetOf(long j10) {
        p0 p0Var = new p0(1);
        p0Var.plusAssign(j10);
        return p0Var;
    }

    public static final v longSetOf(long j10, long j11) {
        return mutableLongSetOf(j10, j11);
    }

    public static final p0 mutableLongSetOf(long j10, long j11) {
        p0 p0Var = new p0(2);
        p0Var.plusAssign(j10);
        p0Var.plusAssign(j11);
        return p0Var;
    }

    public static final v longSetOf(long j10, long j11, long j12) {
        return mutableLongSetOf(j10, j11, j12);
    }

    public static final v longSetOf(long... elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        p0 p0Var = new p0(elements.length);
        p0Var.plusAssign(elements);
        return p0Var;
    }

    public static final p0 mutableLongSetOf(long j10, long j11, long j12) {
        p0 p0Var = new p0(3);
        p0Var.plusAssign(j10);
        p0Var.plusAssign(j11);
        p0Var.plusAssign(j12);
        return p0Var;
    }

    public static final p0 mutableLongSetOf(long... elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        p0 p0Var = new p0(elements.length);
        p0Var.plusAssign(elements);
        return p0Var;
    }
}
