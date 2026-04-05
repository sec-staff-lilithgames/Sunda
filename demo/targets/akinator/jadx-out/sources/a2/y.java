package a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y implements u1.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f3886a;

    public y(t tVar) {
        this.f3886a = tVar;
    }

    @Override // u1.z
    public u1.t getCurrent() {
        u1.t tVar = this.f3886a.f3830p0;
        return tVar == null ? u1.u.f87675a.getDefault() : tVar;
    }

    @Override // u1.z
    public void setCurrent(u1.t value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        this.f3886a.f3830p0 = value;
    }
}
