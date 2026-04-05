package em;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class b implements rr.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f54692b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f54693c;

    public /* synthetic */ b(u uVar, int i10) {
        this.f54692b = i10;
        this.f54693c = uVar;
    }

    @Override // rr.b
    public final Object get() {
        switch (this.f54692b) {
            case 0:
                return String.format("Remove cheapest ad (%s)", this.f54693c);
            case 1:
                return a.b.l("onExpired (", s.toString(this.f54693c.f54764d), ")");
            case 2:
                return a.b.l("destroy (", s.toString(this.f54693c.f54764d), ")");
            case 3:
                return a.b.l("onAdShown (", s.toString(this.f54693c.f54764d), ")");
            default:
                return a.b.l("load (", s.toString(this.f54693c.f54764d), ")");
        }
    }
}
