package lb;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class v extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f73005i;

    /* renamed from: j, reason: collision with root package name */
    public qb.t f73006j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f73007k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f73008l;

    /* renamed from: m, reason: collision with root package name */
    public int f73009m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(e eVar, zu.d dVar) {
        super(dVar);
        this.f73008l = eVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f73007k = obj;
        this.f73009m |= Integer.MIN_VALUE;
        return this.f73008l.getAutocompletionSuggestionsFromStringAsync(null, null, this);
    }
}
