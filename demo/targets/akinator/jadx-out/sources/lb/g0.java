package lb;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g0 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f72871i;

    /* renamed from: j, reason: collision with root package name */
    public qb.u f72872j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f72873k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f72874l;

    /* renamed from: m, reason: collision with root package name */
    public int f72875m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(e eVar, zu.d dVar) {
        super(dVar);
        this.f72874l = eVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f72873k = obj;
        this.f72875m |= Integer.MIN_VALUE;
        return this.f72874l.getQuestionsFromStringAsync(null, null, this);
    }
}
