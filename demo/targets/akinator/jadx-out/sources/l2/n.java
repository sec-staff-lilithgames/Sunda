package l2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Object f72331a;

    public /* synthetic */ n(Object obj) {
        this.f72331a = obj;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ n m5446boximpl(Object obj) {
        return new n(obj);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5448equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof n) && kotlin.jvm.internal.e0.areEqual(obj, ((n) obj2).m5453unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5449equalsimpl0(Object obj, Object obj2) {
        return kotlin.jvm.internal.e0.areEqual(obj, obj2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5450hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: isPermanentFailure-impl, reason: not valid java name */
    public static final boolean m5451isPermanentFailureimpl(Object obj) {
        return obj == null;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5452toStringimpl(Object obj) {
        return "AsyncTypefaceResult(result=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m5448equalsimpl(this.f72331a, obj);
    }

    public final Object getResult() {
        return this.f72331a;
    }

    public int hashCode() {
        return m5450hashCodeimpl(this.f72331a);
    }

    public String toString() {
        return m5452toStringimpl(this.f72331a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m5453unboximpl() {
        return this.f72331a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static Object m5447constructorimpl(Object obj) {
        return obj;
    }
}
