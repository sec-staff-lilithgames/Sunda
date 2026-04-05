package o9;

import com.digidust.elokence.akinator.activities.QuestionActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class m6 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public QuestionActivity f78362i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f78363j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78364k;

    /* renamed from: l, reason: collision with root package name */
    public int f78365l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(QuestionActivity questionActivity, zu.d dVar) {
        super(dVar);
        this.f78364k = questionActivity;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f78363j = obj;
        this.f78365l |= Integer.MIN_VALUE;
        return QuestionActivity.access$showTrappedAnimation(this.f78364k, null, this);
    }
}
