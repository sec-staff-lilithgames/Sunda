package mh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z0 extends d1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f74727b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f74728c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(d1 d1Var, d1 d1Var2, String str) {
        super(d1Var2);
        this.f74727b = str;
        this.f74728c = d1Var;
    }

    @Override // mh.d1
    public final CharSequence a(Object obj) {
        return obj == null ? this.f74727b : this.f74728c.a(obj);
    }

    @Override // mh.d1
    public d1 skipNulls() {
        throw new UnsupportedOperationException("already specified useForNull");
    }

    @Override // mh.d1
    public d1 useForNull(String str) {
        throw new UnsupportedOperationException("already specified useForNull");
    }
}
