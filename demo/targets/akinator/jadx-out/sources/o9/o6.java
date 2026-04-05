package o9;

import android.graphics.Bitmap;
import com.digidust.elokence.akinator.activities.QuestionActivity;
import com.digidust.elokence.akinator.freemium.R;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class o6 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78414i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Bitmap f78415j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Bitmap f78416k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Bitmap f78417l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(QuestionActivity questionActivity, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, zu.d dVar) {
        super(2, dVar);
        this.f78414i = questionActivity;
        this.f78415j = bitmap;
        this.f78416k = bitmap2;
        this.f78417l = bitmap3;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new o6(this.f78414i, this.f78415j, this.f78416k, this.f78417l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        Bitmap bitmap = this.f78415j;
        QuestionActivity questionActivity = this.f78414i;
        questionActivity.q(R.id.akinatorImage, bitmap);
        questionActivity.q(R.id.akinatorTenue, this.f78416k);
        return bv.b.boxBoolean(questionActivity.q(R.id.akinatorChapeau, this.f78417l));
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Boolean> dVar) {
        return ((o6) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
