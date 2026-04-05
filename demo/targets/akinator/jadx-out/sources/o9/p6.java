package o9;

import android.widget.Toast;
import com.digidust.elokence.akinator.activities.QuestionActivity;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class p6 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78439i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(QuestionActivity questionActivity, zu.d dVar) {
        super(2, dVar);
        this.f78439i = questionActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new p6(this.f78439i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        String traductionFromToken = lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD");
        QuestionActivity questionActivity = this.f78439i;
        Toast.makeText(questionActivity, traductionFromToken, 0).show();
        questionActivity.goToHome(false);
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((p6) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
