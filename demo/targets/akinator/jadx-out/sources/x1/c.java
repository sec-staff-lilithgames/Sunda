package x1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.a0 implements kv.p {

    /* renamed from: b, reason: collision with root package name */
    public static final c f91335b = new c(2, mv.b.class, "max", "max(II)I", 1);

    public final Integer invoke(int i10, int i11) {
        return Integer.valueOf(Math.max(i10, i11));
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
    }
}
