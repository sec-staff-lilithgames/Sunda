package z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b extends m {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f96772f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f96773g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, int i10) {
        super(fVar.size());
        this.f96772f = i10;
        switch (i10) {
            case 1:
                this.f96773g = fVar;
                super(fVar.size());
                break;
            default:
                this.f96773g = fVar;
                break;
        }
    }

    @Override // z.m
    public final Object a(int i10) {
        switch (this.f96772f) {
            case 0:
                return this.f96773g.keyAt(i10);
            default:
                return this.f96773g.valueAt(i10);
        }
    }

    @Override // z.m
    public final void b(int i10) {
        switch (this.f96772f) {
            case 0:
                this.f96773g.removeAt(i10);
                break;
            default:
                this.f96773g.removeAt(i10);
                break;
        }
    }
}
