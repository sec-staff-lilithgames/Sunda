package lb;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i0 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f72888i;

    /* renamed from: j, reason: collision with root package name */
    public qb.s f72889j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f72890k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f72891l;

    /* renamed from: m, reason: collision with root package name */
    public int f72892m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(e eVar, zu.d dVar) {
        super(dVar);
        this.f72891l = eVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f72890k = obj;
        this.f72892m |= Integer.MIN_VALUE;
        return this.f72891l.getReportAsync(null, this);
    }
}
