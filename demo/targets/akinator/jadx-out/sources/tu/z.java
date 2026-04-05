package tu;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f87419c = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f87420b;

    static {
        new x(null);
    }

    public /* synthetic */ z(Object obj) {
        this.f87420b = obj;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ z m7130boximpl(Object obj) {
        return new z(obj);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7132equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof z) && kotlin.jvm.internal.e0.areEqual(obj, ((z) obj2).m7139unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7133equalsimpl0(Object obj, Object obj2) {
        return kotlin.jvm.internal.e0.areEqual(obj, obj2);
    }

    /* renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final Throwable m7134exceptionOrNullimpl(Object obj) {
        if (obj instanceof y) {
            return ((y) obj).f87416b;
        }
        return null;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7135hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: isFailure-impl, reason: not valid java name */
    public static final boolean m7136isFailureimpl(Object obj) {
        return obj instanceof y;
    }

    /* renamed from: isSuccess-impl, reason: not valid java name */
    public static final boolean m7137isSuccessimpl(Object obj) {
        return !(obj instanceof y);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7138toStringimpl(Object obj) {
        if (obj instanceof y) {
            return ((y) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m7132equalsimpl(this.f87420b, obj);
    }

    public int hashCode() {
        return m7135hashCodeimpl(this.f87420b);
    }

    public String toString() {
        return m7138toStringimpl(this.f87420b);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m7139unboximpl() {
        return this.f87420b;
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m7131constructorimpl(Object obj) {
        return obj;
    }
}
