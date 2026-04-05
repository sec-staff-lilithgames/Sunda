package o9;

import android.graphics.drawable.BitmapDrawable;
import com.digidust.elokence.akinator.activities.HomeActivity;
import com.digidust.elokence.akinator.paid.databinding.ActivityHomeBinding;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f78314i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ BitmapDrawable f78315j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(HomeActivity homeActivity, BitmapDrawable bitmapDrawable, zu.d dVar) {
        super(2, dVar);
        this.f78314i = homeActivity;
        this.f78315j = bitmapDrawable;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new l2(this.f78314i, this.f78315j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        ActivityHomeBinding activityHomeBinding = this.f78314i.D;
        if (activityHomeBinding == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("mBinding");
            activityHomeBinding = null;
        }
        activityHomeBinding.overlayThemeSelection.setBackground(this.f78315j);
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((l2) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
