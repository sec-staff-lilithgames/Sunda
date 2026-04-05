package o9;

import android.widget.Toast;
import com.digidust.elokence.akinator.activities.SoundlikeActivity;
import com.digidust.elokence.akinator.freemium.R;
import java.util.ArrayList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class t7 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ArrayList f78569i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.h2 f78570j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j8 f78571k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g8 f78572l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l8 f78573m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ SoundlikeActivity f78574n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(ArrayList arrayList, androidx.fragment.app.h2 h2Var, j8 j8Var, g8 g8Var, l8 l8Var, SoundlikeActivity soundlikeActivity, zu.d dVar) {
        super(2, dVar);
        this.f78569i = arrayList;
        this.f78570j = h2Var;
        this.f78571k = j8Var;
        this.f78572l = g8Var;
        this.f78573m = l8Var;
        this.f78574n = soundlikeActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new t7(this.f78569i, this.f78570j, this.f78571k, this.f78572l, this.f78573m, this.f78574n, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        int iCommit;
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        try {
            boolean zIsEmpty = this.f78569i.isEmpty();
            androidx.fragment.app.h2 h2Var = this.f78570j;
            if (!zIsEmpty) {
                h2Var.setCustomAnimations(R.animator.enter_from_right, R.animator.exit_to_left);
                h2Var.replace(R.id.layoutFragmentContainer, this.f78571k);
                iCommit = h2Var.commit();
            } else if (ca.m.sharedInstance().isAddObjectEnabledForCurrentInstance()) {
                h2Var.setCustomAnimations(R.animator.enter_from_right, R.animator.exit_to_left);
                h2Var.replace(R.id.layoutFragmentContainer, this.f78572l);
                iCommit = h2Var.commit();
            } else {
                h2Var.setCustomAnimations(R.animator.enter_from_right, R.animator.exit_to_left);
                h2Var.replace(R.id.layoutFragmentContainer, this.f78573m);
                iCommit = h2Var.commit();
            }
            return bv.b.boxInt(iCommit);
        } catch (Exception unused) {
            String traductionFromToken = lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD");
            SoundlikeActivity soundlikeActivity = this.f78574n;
            Toast.makeText(soundlikeActivity, traductionFromToken, 0).show();
            soundlikeActivity.goToHome(false);
            return tu.x0.f87415a;
        }
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<Object> dVar) {
        return ((t7) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
