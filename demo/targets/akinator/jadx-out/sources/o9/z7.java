package o9;

import com.digidust.elokence.akinator.activities.SoundlikeActivity;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class z7 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ SoundlikeActivity f78718i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(SoundlikeActivity soundlikeActivity, zu.d dVar) {
        super(2, dVar);
        this.f78718i = soundlikeActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new z7(this.f78718i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        if (ca.o.sharedInstance().getCurrentSession() == null) {
            return bv.b.boxInt(-1);
        }
        lb.e currentSession = ca.o.sharedInstance().getCurrentSession();
        kotlin.jvm.internal.e0.checkNotNull(currentSession);
        SoundlikeActivity soundlikeActivity = this.f78718i;
        return bv.b.boxInt(currentSession.newElementWithNameAndDescription(soundlikeActivity.E, ca.m.sharedInstance().isDescriptionEnabledForCurrentInstance() ? soundlikeActivity.F : "---"));
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((z7) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
