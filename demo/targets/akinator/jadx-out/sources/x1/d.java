package x1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final x f91341a = new x(b.f91331b);

    /* renamed from: b, reason: collision with root package name */
    public static final x f91342b = new x(c.f91335b);

    public static final x getFirstBaseline() {
        return f91341a;
    }

    public static final x getLastBaseline() {
        return f91342b;
    }

    public static final int merge(a aVar, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<this>");
        return ((Number) aVar.getMerger$ui_release().invoke(Integer.valueOf(i10), Integer.valueOf(i11))).intValue();
    }
}
