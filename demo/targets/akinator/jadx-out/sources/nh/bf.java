package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class bf extends l0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f76132c;

    /* renamed from: e, reason: collision with root package name */
    public final Comparable f76133e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df f76134f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(df dfVar, Comparable comparable, int i10) {
        super(comparable);
        this.f76132c = i10;
        switch (i10) {
            case 1:
                this.f76134f = dfVar;
                super(comparable);
                this.f76133e = dfVar.first();
                break;
            default:
                this.f76134f = dfVar;
                this.f76133e = dfVar.last();
                break;
        }
    }

    @Override // nh.l0
    public final Comparable a(Object obj) {
        int i10 = this.f76132c;
        df dfVar = this.f76134f;
        Comparable comparable = this.f76133e;
        switch (i10) {
            case 0:
                Comparable comparable2 = (Comparable) obj;
                if (comparable != null) {
                    ze zeVar = ze.f76826e;
                    if (comparable2.compareTo(comparable) == 0) {
                        return null;
                    }
                }
                return dfVar.f76576g.next(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                if (comparable != null) {
                    ze zeVar2 = ze.f76826e;
                    if (comparable3.compareTo(comparable) == 0) {
                        return null;
                    }
                }
                return dfVar.f76576g.previous(comparable3);
        }
    }
}
