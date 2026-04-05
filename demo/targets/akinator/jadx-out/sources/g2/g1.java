package g2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g1 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public static final g1 f56758e = new g1(2);

    @Override // kv.p
    public final Object invoke(a1.r Saver, r2.v it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(Saver, "$this$Saver");
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        return uu.p0.arrayListOf(Float.valueOf(it.getScaleX()), Float.valueOf(it.getSkewX()));
    }
}
