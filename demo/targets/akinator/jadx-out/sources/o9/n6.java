package o9;

import com.digidust.elokence.akinator.activities.QuestionActivity;
import lb.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class n6 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public QuestionActivity f78398i;

    /* renamed from: j, reason: collision with root package name */
    public e.i f78399j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f78400k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78401l;

    /* renamed from: m, reason: collision with root package name */
    public int f78402m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(QuestionActivity questionActivity, zu.d dVar) {
        super(dVar);
        this.f78401l = questionActivity;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f78400k = obj;
        this.f78402m |= Integer.MIN_VALUE;
        return this.f78401l.J(this);
    }
}
