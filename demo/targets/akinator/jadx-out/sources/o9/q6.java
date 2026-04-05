package o9;

import kotlinx.coroutines.CoroutineScope;
import lb.e;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class q6 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e.i f78464i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(e.i iVar, zu.d dVar) {
        super(2, dVar);
        this.f78464i = iVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new q6(this.f78464i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        if (ca.m.sharedInstance().isTTSEnabled()) {
            try {
                w9.e eVar = w9.e.getInstance();
                String question = this.f78464i.getQuestion();
                kotlin.jvm.internal.e0.checkNotNull(question);
                eVar.speak(question);
            } catch (Exception e10) {
                Timber.Forest.tag("QuestionActivity").e(e10, "Error while trying to speak the question", new Object[0]);
            }
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((q6) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
