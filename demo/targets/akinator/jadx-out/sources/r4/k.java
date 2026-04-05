package r4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f83760a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b0 b0Var) {
        super("FloatValueHolder");
        this.f83760a = b0Var;
    }

    @Override // r4.a0
    public float getValue(Object obj) {
        return this.f83760a.getValue();
    }

    @Override // r4.a0
    public void setValue(Object obj, float f10) {
        this.f83760a.setValue(f10);
    }
}
