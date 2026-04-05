package pq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class b implements ir.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f81624b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f81625c;

    public /* synthetic */ b(e eVar, int i10) {
        this.f81624b = i10;
        this.f81625c = eVar;
    }

    @Override // ir.d
    public final void execute(Object obj) {
        switch (this.f81624b) {
            case 0:
                this.f81625c.f81634g.remove((i) obj);
                break;
            case 1:
                e eVar = this.f81625c;
                if (eVar.f81633f.i()) {
                    ir.q.ifNotNull(eVar.f81639l, new b(eVar, 2));
                    eVar.f81631d.c(eVar);
                    break;
                }
                break;
            case 2:
                e eVar2 = this.f81625c;
                i iVar = (i) obj;
                ir.q.ifNotNull(eVar2.f81640m, new b(eVar2, 3));
                eVar2.f81632e.a(iVar.e(), br.i.Appear, false, (Runnable) null, (Runnable) new cq.b(iVar, 2));
                break;
            default:
                e eVar3 = this.f81625c;
                i iVar2 = (i) obj;
                bq.c cVar = new bq.c(8, eVar3, iVar2);
                iVar2.a(true);
                eVar3.f81632e.a(iVar2.e(), br.i.Disappear, false, (Runnable) null, (Runnable) cVar);
                break;
        }
    }
}
