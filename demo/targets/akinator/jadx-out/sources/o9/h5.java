package o9;

import com.digidust.elokence.akinator.activities.QuestionActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h5 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public QuestionActivity f78192i;

    /* renamed from: j, reason: collision with root package name */
    public long f78193j;

    /* renamed from: k, reason: collision with root package name */
    public int f78194k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f78195l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78196m;

    /* renamed from: n, reason: collision with root package name */
    public int f78197n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(QuestionActivity questionActivity, zu.d dVar) {
        super(dVar);
        this.f78196m = questionActivity;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f78195l = obj;
        this.f78197n |= Integer.MIN_VALUE;
        return QuestionActivity.access$doAnswearLegacy(this.f78196m, this);
    }
}
