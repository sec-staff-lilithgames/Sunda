package o9;

import com.digidust.elokence.akinator.activities.SelectLanguageActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i7 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f78226i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SelectLanguageActivity f78227j;

    /* renamed from: k, reason: collision with root package name */
    public int f78228k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(SelectLanguageActivity selectLanguageActivity, zu.d dVar) {
        super(dVar);
        this.f78227j = selectLanguageActivity;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f78226i = obj;
        this.f78228k |= Integer.MIN_VALUE;
        return SelectLanguageActivity.access$setupAnalyticsIfNeeded(this.f78227j, this);
    }
}
