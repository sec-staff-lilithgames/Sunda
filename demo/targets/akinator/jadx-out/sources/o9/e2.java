package o9;

import com.digidust.elokence.akinator.activities.HomeActivity;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.paid.databinding.ActivityHomeBinding;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f78110i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f78111j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(int i10, HomeActivity homeActivity, zu.d dVar) {
        super(2, dVar);
        this.f78110i = i10;
        this.f78111j = homeActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new e2(this.f78110i, this.f78111j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        if (this.f78110i == 0) {
            int statusAccount = ca.m.sharedInstance().getStatusAccount();
            ActivityHomeBinding activityHomeBinding = null;
            HomeActivity homeActivity = this.f78111j;
            if (statusAccount == 0) {
                ActivityHomeBinding activityHomeBinding2 = homeActivity.D;
                if (activityHomeBinding2 == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    activityHomeBinding = activityHomeBinding2;
                }
                activityHomeBinding.buttonOpenMenu.setImageResource(R.drawable.menu_icon_alert);
            } else {
                ActivityHomeBinding activityHomeBinding3 = homeActivity.D;
                if (activityHomeBinding3 == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    activityHomeBinding = activityHomeBinding3;
                }
                activityHomeBinding.buttonOpenMenu.setImageResource(R.drawable.home_param_button);
            }
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((e2) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
