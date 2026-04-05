package n1;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f75464a;

    public /* synthetic */ k(ArrayList arrayList) {
        this.f75464a = arrayList;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ k m5729boximpl(ArrayList arrayList) {
        return new k(arrayList);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> ArrayList<T> m5730constructorimpl(ArrayList<T> backing) {
        kotlin.jvm.internal.e0.checkNotNullParameter(backing, "backing");
        return backing;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ ArrayList m5731constructorimpl$default(ArrayList arrayList, int i10, kotlin.jvm.internal.u uVar) {
        if ((i10 & 1) != 0) {
            arrayList = new ArrayList();
        }
        return m5730constructorimpl(arrayList);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5732equalsimpl(ArrayList<Object> arrayList, Object obj) {
        return (obj instanceof k) && kotlin.jvm.internal.e0.areEqual(arrayList, ((k) obj).m5740unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5733equalsimpl0(ArrayList<?> arrayList, ArrayList<?> arrayList2) {
        return kotlin.jvm.internal.e0.areEqual(arrayList, arrayList2);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m5734getSizeimpl(ArrayList<Object> arrayList) {
        return arrayList.size();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5735hashCodeimpl(ArrayList<Object> arrayList) {
        return arrayList.hashCode();
    }

    /* renamed from: peek-impl, reason: not valid java name */
    public static final Object m5736peekimpl(ArrayList<Object> arrayList) {
        return arrayList.get(m5734getSizeimpl(arrayList) - 1);
    }

    /* renamed from: pop-impl, reason: not valid java name */
    public static final Object m5737popimpl(ArrayList<Object> arrayList) {
        return arrayList.remove(m5734getSizeimpl(arrayList) - 1);
    }

    /* renamed from: push-impl, reason: not valid java name */
    public static final boolean m5738pushimpl(ArrayList<Object> arrayList, Object obj) {
        return arrayList.add(obj);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5739toStringimpl(ArrayList<Object> arrayList) {
        return "Stack(backing=" + arrayList + ')';
    }

    public boolean equals(Object obj) {
        return m5732equalsimpl(this.f75464a, obj);
    }

    public int hashCode() {
        return m5735hashCodeimpl(this.f75464a);
    }

    public String toString() {
        return m5739toStringimpl(this.f75464a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ ArrayList m5740unboximpl() {
        return this.f75464a;
    }
}
