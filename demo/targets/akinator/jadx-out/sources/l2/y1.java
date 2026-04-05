package l2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y1 implements z1 {

    /* renamed from: b, reason: collision with root package name */
    public final Object f72398b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f72399c;

    public y1(Object value, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        this.f72398b = value;
        this.f72399c = z10;
    }

    @Override // l2.z1
    public boolean getCacheable() {
        return this.f72399c;
    }

    @Override // l2.z1, p0.v5
    public Object getValue() {
        return this.f72398b;
    }

    public /* synthetic */ y1(Object obj, boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this(obj, (i10 & 2) != 0 ? true : z10);
    }
}
