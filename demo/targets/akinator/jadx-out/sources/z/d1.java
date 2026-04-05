package z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final s0 f96791a = new s0(0);

    public static final <K> c1 buildObjectIntMap(kv.l builderAction) {
        kotlin.jvm.internal.e0.checkNotNullParameter(builderAction, "builderAction");
        s0 s0Var = new s0(0, 1, null);
        builderAction.invoke(s0Var);
        return s0Var;
    }

    public static final <K> c1 emptyObjectIntMap() {
        s0 s0Var = f96791a;
        kotlin.jvm.internal.e0.checkNotNull(s0Var, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        return s0Var;
    }

    public static final <K> s0 mutableObjectIntMapOf() {
        return new s0(0, 1, null);
    }

    public static final <K> c1 objectIntMap() {
        s0 s0Var = f96791a;
        kotlin.jvm.internal.e0.checkNotNull(s0Var, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.objectIntMap>");
        return s0Var;
    }

    public static final <K> c1 objectIntMapOf(K k10, int i10) {
        s0 s0Var = new s0(0, 1, null);
        s0Var.set(k10, i10);
        return s0Var;
    }

    public static final <K> c1 buildObjectIntMap(int i10, kv.l builderAction) {
        kotlin.jvm.internal.e0.checkNotNullParameter(builderAction, "builderAction");
        s0 s0Var = new s0(i10);
        builderAction.invoke(s0Var);
        return s0Var;
    }

    public static final <K> s0 mutableObjectIntMapOf(K k10, int i10) {
        s0 s0Var = new s0(0, 1, null);
        s0Var.set(k10, i10);
        return s0Var;
    }

    public static final <K> c1 objectIntMapOf(K k10, int i10, K k11, int i11) {
        s0 s0Var = new s0(0, 1, null);
        s0Var.set(k10, i10);
        s0Var.set(k11, i11);
        return s0Var;
    }

    public static final <K> s0 mutableObjectIntMapOf(K k10, int i10, K k11, int i11) {
        s0 s0Var = new s0(0, 1, null);
        s0Var.set(k10, i10);
        s0Var.set(k11, i11);
        return s0Var;
    }

    public static final <K> c1 objectIntMapOf(K k10, int i10, K k11, int i11, K k12, int i12) {
        s0 s0Var = new s0(0, 1, null);
        s0Var.set(k10, i10);
        s0Var.set(k11, i11);
        s0Var.set(k12, i12);
        return s0Var;
    }

    public static final <K> s0 mutableObjectIntMapOf(K k10, int i10, K k11, int i11, K k12, int i12) {
        s0 s0Var = new s0(0, 1, null);
        s0Var.set(k10, i10);
        s0Var.set(k11, i11);
        s0Var.set(k12, i12);
        return s0Var;
    }

    public static final <K> c1 objectIntMapOf(K k10, int i10, K k11, int i11, K k12, int i12, K k13, int i13) {
        s0 s0Var = new s0(0, 1, null);
        s0Var.set(k10, i10);
        s0Var.set(k11, i11);
        s0Var.set(k12, i12);
        s0Var.set(k13, i13);
        return s0Var;
    }

    public static final <K> s0 mutableObjectIntMapOf(K k10, int i10, K k11, int i11, K k12, int i12, K k13, int i13) {
        s0 s0Var = new s0(0, 1, null);
        s0Var.set(k10, i10);
        s0Var.set(k11, i11);
        s0Var.set(k12, i12);
        s0Var.set(k13, i13);
        return s0Var;
    }

    public static final <K> c1 objectIntMapOf(K k10, int i10, K k11, int i11, K k12, int i12, K k13, int i13, K k14, int i14) {
        s0 s0Var = new s0(0, 1, null);
        s0Var.set(k10, i10);
        s0Var.set(k11, i11);
        s0Var.set(k12, i12);
        s0Var.set(k13, i13);
        s0Var.set(k14, i14);
        return s0Var;
    }

    public static final <K> s0 mutableObjectIntMapOf(K k10, int i10, K k11, int i11, K k12, int i12, K k13, int i13, K k14, int i14) {
        s0 s0Var = new s0(0, 1, null);
        s0Var.set(k10, i10);
        s0Var.set(k11, i11);
        s0Var.set(k12, i12);
        s0Var.set(k13, i13);
        s0Var.set(k14, i14);
        return s0Var;
    }
}
