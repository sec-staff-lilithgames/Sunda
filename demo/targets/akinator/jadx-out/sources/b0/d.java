package b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8347e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i10) {
        super(1);
        this.f8347e = i10;
    }

    @Override // kv.l
    public final Integer invoke(x1.y it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.maxIntrinsicWidth(this.f8347e));
    }
}
