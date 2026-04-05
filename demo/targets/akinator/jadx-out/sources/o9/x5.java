package o9;

import com.digidust.elokence.akinator.activities.QuestionActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class x5 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public QuestionActivity f78664i;

    /* renamed from: j, reason: collision with root package name */
    public ka.a f78665j;

    /* renamed from: k, reason: collision with root package name */
    public int f78666k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f78667l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78668m;

    /* renamed from: n, reason: collision with root package name */
    public int f78669n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(QuestionActivity questionActivity, zu.d dVar) {
        super(dVar);
        this.f78668m = questionActivity;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f78667l = obj;
        this.f78669n |= Integer.MIN_VALUE;
        return QuestionActivity.access$goToProposalScreen(this.f78668m, this);
    }
}
