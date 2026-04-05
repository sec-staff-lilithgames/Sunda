package o9;

import com.digidust.elokence.akinator.activities.QuestionActivity;
import kotlinx.coroutines.Job;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k5 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public QuestionActivity f78289i;

    /* renamed from: j, reason: collision with root package name */
    public ka.c f78290j;

    /* renamed from: k, reason: collision with root package name */
    public Job f78291k;

    /* renamed from: l, reason: collision with root package name */
    public int f78292l;

    /* renamed from: m, reason: collision with root package name */
    public int f78293m;

    /* renamed from: n, reason: collision with root package name */
    public long f78294n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f78295o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78296p;

    /* renamed from: q, reason: collision with root package name */
    public int f78297q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(QuestionActivity questionActivity, zu.d dVar) {
        super(dVar);
        this.f78296p = questionActivity;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f78295o = obj;
        this.f78297q |= Integer.MIN_VALUE;
        return QuestionActivity.access$doAnswer(this.f78296p, this);
    }
}
