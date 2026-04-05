package p0;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u5 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f80514a;

    public /* synthetic */ u5(ArrayList arrayList) {
        this.f80514a = arrayList;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ u5 m5838boximpl(ArrayList arrayList) {
        return new u5(arrayList);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m5839clearimpl(ArrayList<Object> arrayList) {
        arrayList.clear();
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ ArrayList m5841constructorimpl$default(ArrayList arrayList, int i10, kotlin.jvm.internal.u uVar) {
        if ((i10 & 1) != 0) {
            arrayList = new ArrayList();
        }
        return m5840constructorimpl(arrayList);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5842equalsimpl(ArrayList<Object> arrayList, Object obj) {
        return (obj instanceof u5) && kotlin.jvm.internal.e0.areEqual(arrayList, ((u5) obj).m5854unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5843equalsimpl0(ArrayList<Object> arrayList, ArrayList<Object> arrayList2) {
        return kotlin.jvm.internal.e0.areEqual(arrayList, arrayList2);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m5844getSizeimpl(ArrayList<Object> arrayList) {
        return arrayList.size();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5845hashCodeimpl(ArrayList<Object> arrayList) {
        return arrayList.hashCode();
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m5846isEmptyimpl(ArrayList<Object> arrayList) {
        return arrayList.isEmpty();
    }

    /* renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m5847isNotEmptyimpl(ArrayList<Object> arrayList) {
        return !m5846isEmptyimpl(arrayList);
    }

    /* renamed from: peek-impl, reason: not valid java name */
    public static final Object m5848peekimpl(ArrayList<Object> arrayList) {
        return arrayList.get(m5844getSizeimpl(arrayList) - 1);
    }

    /* renamed from: pop-impl, reason: not valid java name */
    public static final Object m5850popimpl(ArrayList<Object> arrayList) {
        return arrayList.remove(m5844getSizeimpl(arrayList) - 1);
    }

    /* renamed from: push-impl, reason: not valid java name */
    public static final boolean m5851pushimpl(ArrayList<Object> arrayList, Object obj) {
        return arrayList.add(obj);
    }

    /* renamed from: toArray-impl, reason: not valid java name */
    public static final Object[] m5852toArrayimpl(ArrayList<Object> arrayList) {
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = arrayList.get(i10);
        }
        return objArr;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5853toStringimpl(ArrayList<Object> arrayList) {
        return "Stack(backing=" + arrayList + ')';
    }

    public boolean equals(Object obj) {
        return m5842equalsimpl(this.f80514a, obj);
    }

    public int hashCode() {
        return m5845hashCodeimpl(this.f80514a);
    }

    public String toString() {
        return m5853toStringimpl(this.f80514a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ ArrayList m5854unboximpl() {
        return this.f80514a;
    }

    /* renamed from: peek-impl, reason: not valid java name */
    public static final Object m5849peekimpl(ArrayList<Object> arrayList, int i10) {
        return arrayList.get(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> ArrayList<T> m5840constructorimpl(ArrayList<T> arrayList) {
        return arrayList;
    }
}
