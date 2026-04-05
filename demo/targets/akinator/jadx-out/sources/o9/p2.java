package o9;

import android.widget.Toast;
import com.digidust.elokence.akinator.activities.HomeActivity;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class p2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f78429i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f78430j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(int i10, HomeActivity homeActivity, zu.d dVar) {
        super(2, dVar);
        this.f78429i = i10;
        this.f78430j = homeActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new p2(this.f78429i, this.f78430j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        if (this.f78429i == 400) {
            ca.m.sharedInstance().setUserConnectionStatus(false);
            Toast.makeText(this.f78430j, lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((p2) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
