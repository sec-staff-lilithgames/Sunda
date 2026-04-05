package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p1 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public static final p1 f56553e = new p1(2);

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((x1.y) obj, ((Number) obj2).intValue());
    }

    public final Integer invoke(x1.y intrinsicSize, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(intrinsicSize, "$this$intrinsicSize");
        return Integer.valueOf(intrinsicSize.maxIntrinsicWidth(i10));
    }
}
