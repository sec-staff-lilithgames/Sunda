package o9;

import android.widget.Toast;
import com.digidust.elokence.akinator.activities.QuestionActivity;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i5 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78222i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Throwable f78223j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(QuestionActivity questionActivity, Throwable th2, zu.d dVar) {
        super(2, dVar);
        this.f78222i = questionActivity;
        this.f78223j = th2;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new i5(this.f78222i, this.f78223j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        String message = this.f78223j.getMessage();
        if (message == null) {
            message = "Erreur inconnue";
        }
        Toast.makeText(this.f78222i, message, 0).show();
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((i5) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
