package o9;

import com.digidust.elokence.akinator.activities.QuestionActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class n5 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public QuestionActivity f78393i;

    /* renamed from: j, reason: collision with root package name */
    public int f78394j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f78395k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78396l;

    /* renamed from: m, reason: collision with root package name */
    public int f78397m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(QuestionActivity questionActivity, zu.d dVar) {
        super(dVar);
        this.f78396l = questionActivity;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f78395k = obj;
        this.f78397m |= Integer.MIN_VALUE;
        return QuestionActivity.access$doCancelAnswer(this.f78396l, this);
    }
}
