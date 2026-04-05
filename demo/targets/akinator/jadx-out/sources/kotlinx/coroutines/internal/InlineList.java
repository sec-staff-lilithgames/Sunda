package kotlinx.coroutines.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class InlineList<E> {
    private final Object holder;

    private /* synthetic */ InlineList(Object obj) {
        this.holder = obj;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InlineList m5186boximpl(Object obj) {
        return new InlineList(obj);
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ Object m5188constructorimpl$default(Object obj, int i10, u uVar) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return m5187constructorimpl(obj);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5189equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof InlineList) && e0.areEqual(obj, ((InlineList) obj2).m5195unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5190equalsimpl0(Object obj, Object obj2) {
        return e0.areEqual(obj, obj2);
    }

    /* renamed from: forEachReversed-impl, reason: not valid java name */
    public static final void m5191forEachReversedimpl(Object obj, l lVar) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            lVar.invoke(obj);
            return;
        }
        e0.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                lVar.invoke(arrayList.get(size));
            }
        }
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5192hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: plus-FjFbRPM, reason: not valid java name */
    public static final Object m5193plusFjFbRPM(Object obj, E e10) {
        if (obj == null) {
            return m5187constructorimpl(e10);
        }
        if (obj instanceof ArrayList) {
            e0.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ((ArrayList) obj).add(e10);
            return m5187constructorimpl(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e10);
        return m5187constructorimpl(arrayList);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5194toStringimpl(Object obj) {
        return "InlineList(holder=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m5189equalsimpl(this.holder, obj);
    }

    public int hashCode() {
        return m5192hashCodeimpl(this.holder);
    }

    public String toString() {
        return m5194toStringimpl(this.holder);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m5195unboximpl() {
        return this.holder;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <E> Object m5187constructorimpl(Object obj) {
        return obj;
    }
}
