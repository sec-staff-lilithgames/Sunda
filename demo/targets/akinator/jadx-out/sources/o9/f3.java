package o9;

import com.digidust.elokence.akinator.activities.MenuActivity;
import com.digidust.elokence.akinator.paid.databinding.ActivityMenuBinding;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f3 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f78135i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ MenuActivity f78136j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(int i10, MenuActivity menuActivity, zu.d dVar) {
        super(2, dVar);
        this.f78135i = i10;
        this.f78136j = menuActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new f3(this.f78135i, this.f78136j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        if (this.f78135i == 0) {
            int statusAccount = ca.m.sharedInstance().getStatusAccount();
            ActivityMenuBinding activityMenuBinding = null;
            MenuActivity menuActivity = this.f78136j;
            if (statusAccount == 0) {
                ActivityMenuBinding activityMenuBinding2 = menuActivity.C;
                if (activityMenuBinding2 == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityMenuBinding = activityMenuBinding2;
                }
                activityMenuBinding.connectedLayout.confirmationMailButton.setVisibility(0);
            } else {
                ActivityMenuBinding activityMenuBinding3 = menuActivity.C;
                if (activityMenuBinding3 == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityMenuBinding = activityMenuBinding3;
                }
                activityMenuBinding.connectedLayout.confirmationMailButton.setVisibility(8);
            }
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((f3) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
