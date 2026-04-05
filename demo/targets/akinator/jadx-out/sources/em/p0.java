package em;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class p0 implements rr.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f54726b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0 f54727c;

    public /* synthetic */ p0(r0 r0Var, int i10) {
        this.f54726b = i10;
        this.f54727c = r0Var;
    }

    @Override // rr.b
    public final Object get() {
        switch (this.f54726b) {
            case 0:
                return "(" + this.f54727c.f54734d + ") Fail to start loading waterfall";
            case 1:
                return "(" + this.f54727c.f54734d + ") Request next waterfall";
            case 2:
                return "(" + this.f54727c.f54734d + ") Loading completed";
            default:
                return "(" + this.f54727c.f54734d + ") onWaterfallRequestSuccess";
        }
    }
}
