package o9;

import com.digidust.elokence.akinator.activities.SelectLanguageActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g7 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public SelectLanguageActivity f78165i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f78166j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ SelectLanguageActivity f78167k;

    /* renamed from: l, reason: collision with root package name */
    public int f78168l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(SelectLanguageActivity selectLanguageActivity, zu.d dVar) {
        super(dVar);
        this.f78167k = selectLanguageActivity;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f78166j = obj;
        this.f78168l |= Integer.MIN_VALUE;
        return SelectLanguageActivity.access$refreshUserInfos(this.f78167k, this);
    }
}
