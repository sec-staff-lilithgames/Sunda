package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public final z.i0 f80160a;

    public /* synthetic */ b3(z.i0 i0Var) {
        this.f80160a = i0Var;
    }

    /* renamed from: add-impl, reason: not valid java name */
    public static final void m5792addimpl(z.i0 i0Var, int i10) {
        if (i0Var.f96886b == 0 || !(i0Var.get(0) == i10 || i0Var.get(i0Var.f96886b - 1) == i10)) {
            int i11 = i0Var.f96886b;
            i0Var.add(i10);
            while (i11 > 0) {
                int i12 = ((i11 + 1) >>> 1) - 1;
                int i13 = i0Var.get(i12);
                if (i10 <= i13) {
                    break;
                }
                i0Var.set(i11, i13);
                i11 = i12;
            }
            i0Var.set(i11, i10);
        }
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ b3 m5793boximpl(z.i0 i0Var) {
        return new b3(i0Var);
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ z.i0 m5795constructorimpl$default(z.i0 i0Var, int i10, kotlin.jvm.internal.u uVar) {
        int i11 = 1;
        if ((i10 & 1) != 0) {
            i0Var = new z.i0(0, i11, null);
        }
        return m5794constructorimpl(i0Var);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5796equalsimpl(z.i0 i0Var, Object obj) {
        return (obj instanceof b3) && kotlin.jvm.internal.e0.areEqual(i0Var, ((b3) obj).m5805unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5797equalsimpl0(z.i0 i0Var, z.i0 i0Var2) {
        return kotlin.jvm.internal.e0.areEqual(i0Var, i0Var2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5798hashCodeimpl(z.i0 i0Var) {
        return i0Var.hashCode();
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m5799isEmptyimpl(z.i0 i0Var) {
        return i0Var.f96886b == 0;
    }

    /* renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m5800isNotEmptyimpl(z.i0 i0Var) {
        return i0Var.f96886b != 0;
    }

    /* renamed from: peek-impl, reason: not valid java name */
    public static final int m5801peekimpl(z.i0 i0Var) {
        return i0Var.first();
    }

    /* renamed from: takeMax-impl, reason: not valid java name */
    public static final int m5802takeMaximpl(z.i0 i0Var) {
        int i10;
        int i11 = i0Var.f96886b;
        int i12 = i0Var.get(0);
        while (i0Var.f96886b != 0 && i0Var.get(0) == i12) {
            i0Var.set(0, i0Var.last());
            i0Var.removeAt(i0Var.f96886b - 1);
            int i13 = i0Var.f96886b;
            int i14 = i13 >>> 1;
            int i15 = 0;
            while (i15 < i14) {
                int i16 = i0Var.get(i15);
                int i17 = (i15 + 1) * 2;
                int i18 = i17 - 1;
                int i19 = i0Var.get(i18);
                if (i17 >= i13 || (i10 = i0Var.get(i17)) <= i19) {
                    if (i19 > i16) {
                        i0Var.set(i15, i19);
                        i0Var.set(i18, i16);
                        i15 = i18;
                    }
                } else if (i10 > i16) {
                    i0Var.set(i15, i10);
                    i0Var.set(i17, i16);
                    i15 = i17;
                }
            }
        }
        return i12;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5803toStringimpl(z.i0 i0Var) {
        return "PrioritySet(list=" + i0Var + ')';
    }

    /* renamed from: validateHeap-impl, reason: not valid java name */
    public static final void m5804validateHeapimpl(z.i0 i0Var) {
        int i10 = i0Var.f96886b;
        int i11 = i10 / 2;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = i12 + 1;
            int i14 = i13 * 2;
            boolean z10 = true;
            if (!(i0Var.get(i12) >= i0Var.get(i14 + (-1)))) {
                a3.throwIllegalStateException("Check failed.");
            }
            if (i14 < i10 && i0Var.get(i12) < i0Var.get(i14)) {
                z10 = false;
            }
            if (!z10) {
                a3.throwIllegalStateException("Check failed.");
            }
            i12 = i13;
        }
    }

    public boolean equals(Object obj) {
        return m5796equalsimpl(this.f80160a, obj);
    }

    public int hashCode() {
        return m5798hashCodeimpl(this.f80160a);
    }

    public String toString() {
        return m5803toStringimpl(this.f80160a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ z.i0 m5805unboximpl() {
        return this.f80160a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static z.i0 m5794constructorimpl(z.i0 i0Var) {
        return i0Var;
    }
}
