package s9;

import android.graphics.Bitmap;
import com.digidust.elokence.akinator.activities.AkActivity;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import lb.e;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class o extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f85548i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f85549j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e.g f85550k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(g gVar, e.g gVar2, zu.d dVar) {
        super(2, dVar);
        this.f85549j = gVar;
        this.f85550k = gVar2;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new o(this.f85549j, this.f85550k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f85548i;
        g gVar = this.f85549j;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            AkActivity akActivity = gVar.f85527e;
            e0.checkNotNull(akActivity);
            akActivity.displayLoader();
            int i11 = gVar.f85532j;
            String str = i11 != 0 ? i11 != 1 ? "0" : "2" : "1";
            if (ca.o.sharedInstance().getCurrentSession() == null) {
                iIntValue = -1;
                AkActivity akActivity2 = gVar.f85527e;
                e0.checkNotNull(akActivity2);
                akActivity2.hideLoader();
                return bv.b.boxInt(iIntValue);
            }
            lb.e currentSession = ca.o.sharedInstance().getCurrentSession();
            e0.checkNotNull(currentSession);
            String idBase = this.f85550k.getIdBase();
            Bitmap bitmap = gVar.f85528f;
            String nomJoueur = gVar.f85529g ? ca.r.sharedInstance().getNomJoueur() : null;
            this.f85548i = 1;
            obj = currentSession.addPhotoToObjectWithIdAsync(idBase, bitmap, str, nomJoueur, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
        }
        iIntValue = ((Number) obj).intValue();
        AkActivity akActivity22 = gVar.f85527e;
        e0.checkNotNull(akActivity22);
        akActivity22.hideLoader();
        return bv.b.boxInt(iIntValue);
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((o) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
