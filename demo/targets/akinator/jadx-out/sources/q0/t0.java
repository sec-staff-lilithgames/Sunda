package q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f82383a;

    public /* synthetic */ t0(s0 s0Var) {
        this.f82383a = s0Var;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ t0 m5936boximpl(s0 s0Var) {
        return new t0(s0Var);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5938equalsimpl(s0 s0Var, Object obj) {
        return (obj instanceof t0) && kotlin.jvm.internal.e0.areEqual(s0Var, ((t0) obj).m5950unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5939equalsimpl0(s0 s0Var, s0 s0Var2) {
        return kotlin.jvm.internal.e0.areEqual(s0Var, s0Var2);
    }

    /* renamed from: getOperation-impl, reason: not valid java name */
    public static final n0 m5940getOperationimpl(s0 s0Var) {
        return s0Var.f82370a[s0Var.f82371b - 1];
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5941hashCodeimpl(s0 s0Var) {
        return s0Var.hashCode();
    }

    /* renamed from: setInt-impl, reason: not valid java name */
    public static final void m5942setIntimpl(s0 s0Var, int i10, int i11) {
        s0Var.f82372c[(s0Var.f82373d - s0Var.f82370a[s0Var.f82371b - 1].getInts()) + i10] = i11;
    }

    /* renamed from: setInts-impl, reason: not valid java name */
    public static final void m5943setIntsimpl(s0 s0Var, int i10, int i11, int i12, int i13) {
        int ints = s0Var.f82373d - s0Var.f82370a[s0Var.f82371b - 1].getInts();
        int[] iArr = s0Var.f82372c;
        iArr[i10 + ints] = i11;
        iArr[ints + i12] = i13;
    }

    /* renamed from: setObject-DKhxnng, reason: not valid java name */
    public static final <T> void m5945setObjectDKhxnng(s0 s0Var, int i10, T t10) {
        s0Var.f82374e[(s0Var.f82375f - s0Var.f82370a[s0Var.f82371b - 1].getObjects()) + i10] = t10;
    }

    /* renamed from: setObjects-4uCC6AY, reason: not valid java name */
    public static final <T, U> void m5946setObjects4uCC6AY(s0 s0Var, int i10, T t10, int i11, U u10) {
        int objects = s0Var.f82375f - s0Var.f82370a[s0Var.f82371b - 1].getObjects();
        Object[] objArr = s0Var.f82374e;
        objArr[i10 + objects] = t10;
        objArr[objects + i11] = u10;
    }

    /* renamed from: setObjects-OGa0p1M, reason: not valid java name */
    public static final <T, U, V, W> void m5947setObjectsOGa0p1M(s0 s0Var, int i10, T t10, int i11, U u10, int i12, V v10, int i13, W w10) {
        int objects = s0Var.f82375f - s0Var.f82370a[s0Var.f82371b - 1].getObjects();
        Object[] objArr = s0Var.f82374e;
        objArr[i10 + objects] = t10;
        objArr[i11 + objects] = u10;
        objArr[i12 + objects] = v10;
        objArr[objects + i13] = w10;
    }

    /* renamed from: setObjects-t7hvbck, reason: not valid java name */
    public static final <T, U, V> void m5948setObjectst7hvbck(s0 s0Var, int i10, T t10, int i11, U u10, int i12, V v10) {
        int objects = s0Var.f82375f - s0Var.f82370a[s0Var.f82371b - 1].getObjects();
        Object[] objArr = s0Var.f82374e;
        objArr[i10 + objects] = t10;
        objArr[i11 + objects] = u10;
        objArr[objects + i12] = v10;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5949toStringimpl(s0 s0Var) {
        return "WriteScope(stack=" + s0Var + ')';
    }

    public boolean equals(Object obj) {
        return m5938equalsimpl(this.f82383a, obj);
    }

    public int hashCode() {
        return m5941hashCodeimpl(this.f82383a);
    }

    public String toString() {
        return m5949toStringimpl(this.f82383a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ s0 m5950unboximpl() {
        return this.f82383a;
    }

    /* renamed from: setInts-impl, reason: not valid java name */
    public static final void m5944setIntsimpl(s0 s0Var, int i10, int i11, int i12, int i13, int i14, int i15) {
        int ints = s0Var.f82373d - s0Var.f82370a[s0Var.f82371b - 1].getInts();
        int[] iArr = s0Var.f82372c;
        iArr[i10 + ints] = i11;
        iArr[i12 + ints] = i13;
        iArr[ints + i14] = i15;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static s0 m5937constructorimpl(s0 s0Var) {
        return s0Var;
    }
}
