package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f6 extends b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f76251e;

    /* renamed from: f, reason: collision with root package name */
    public final ej f76252f;

    /* renamed from: g, reason: collision with root package name */
    public ej f76253g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g6 f76254h;

    public f6(g6 g6Var, int i10) {
        this.f76251e = i10;
        switch (i10) {
            case 1:
                this.f76254h = g6Var;
                this.f76252f = g6Var.f76291i.f76388b.reverse().iterator();
                this.f76253g = s7.f76631f;
                break;
            default:
                this.f76254h = g6Var;
                this.f76252f = g6Var.f76291i.f76388b.iterator();
                this.f76253g = s7.f76631f;
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // nh.b
    public final Object computeNext() {
        switch (this.f76251e) {
            case 0:
                while (!this.f76253g.hasNext()) {
                    ej ejVar = this.f76252f;
                    if (!ejVar.hasNext()) {
                        this.f76111b = 3;
                        break;
                    } else {
                        this.f76253g = q2.create((ze) ejVar.next(), this.f76254h.f76289g).iterator();
                    }
                }
                break;
            default:
                while (!this.f76253g.hasNext()) {
                    ej ejVar2 = this.f76252f;
                    if (!ejVar2.hasNext()) {
                        this.f76111b = 3;
                        break;
                    } else {
                        this.f76253g = q2.create((ze) ejVar2.next(), this.f76254h.f76289g).descendingIterator();
                    }
                }
                break;
        }
        return (Comparable) this.f76253g.next();
    }
}
