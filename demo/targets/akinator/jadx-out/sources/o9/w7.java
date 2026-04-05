package o9;

import com.digidust.elokence.akinator.activities.SoundlikeActivity;
import kotlinx.coroutines.CoroutineScope;
import lb.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class w7 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ SoundlikeActivity f78651i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e.c f78652j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(SoundlikeActivity soundlikeActivity, e.c cVar, zu.d dVar) {
        super(2, dVar);
        this.f78651i = soundlikeActivity;
        this.f78652j = cVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new w7(this.f78651i, this.f78652j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        SoundlikeActivity soundlikeActivity = this.f78651i;
        soundlikeActivity.G = (e.g) soundlikeActivity.H;
        e.g gVar = soundlikeActivity.G;
        kotlin.jvm.internal.e0.checkNotNull(gVar);
        int idSession = gVar.getIdSession();
        try {
            lb.e currentSession = ca.o.sharedInstance().getCurrentSession();
            kotlin.jvm.internal.e0.checkNotNull(currentSession);
            return bv.b.boxInt(currentSession.validateObjectWithId(idSession, this.f78652j));
        } catch (NullPointerException unused) {
            return bv.b.boxInt(400);
        }
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((w7) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
