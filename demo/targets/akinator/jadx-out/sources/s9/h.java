package s9;

import com.digidust.elokence.akinator.activities.AkActivity;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import lb.e;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f85535i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e.b f85536j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, e.b bVar, zu.d dVar) {
        super(2, dVar);
        this.f85535i = gVar;
        this.f85536j = bVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new h(this.f85535i, this.f85536j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) throws nb.b {
        lb.b duelPhoto;
        av.e.getCOROUTINE_SUSPENDED();
        a0.throwOnFailure(obj);
        g gVar = this.f85535i;
        AkActivity akActivity = gVar.f85527e;
        e0.checkNotNull(akActivity);
        akActivity.displayLoader();
        try {
            try {
                lb.e currentSession = ca.o.sharedInstance().getCurrentSession();
                if (currentSession != null) {
                    e.b bVar = this.f85536j;
                    e0.checkNotNull(bVar);
                    duelPhoto = currentSession.getDuelPhoto(bVar.getIdBase());
                } else {
                    duelPhoto = null;
                }
                AkActivity akActivity2 = gVar.f85527e;
                e0.checkNotNull(akActivity2);
                akActivity2.hideLoader();
                gVar.f85531i = duelPhoto;
                if (gVar.f85531i != null) {
                    return bv.b.boxInt(0);
                }
                throw new nb.b();
            } catch (nb.b e10) {
                throw e10;
            }
        } catch (Throwable th2) {
            AkActivity akActivity3 = gVar.f85527e;
            e0.checkNotNull(akActivity3);
            akActivity3.hideLoader();
            throw th2;
        }
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((h) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
