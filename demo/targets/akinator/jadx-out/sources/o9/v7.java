package o9;

import android.app.Dialog;
import android.widget.Toast;
import com.digidust.elokence.akinator.activities.SoundlikeActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlinx.coroutines.CoroutineScope;
import lb.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class v7 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ SoundlikeActivity f78633i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f78634j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e.c f78635k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(SoundlikeActivity soundlikeActivity, int i10, e.c cVar, zu.d dVar) {
        super(2, dVar);
        this.f78633i = soundlikeActivity;
        this.f78634j = i10;
        this.f78635k = cVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new v7(this.f78633i, this.f78634j, this.f78635k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        SoundlikeActivity soundlikeActivity = this.f78633i;
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        try {
            if (soundlikeActivity.J != null) {
                Dialog dialog = soundlikeActivity.J;
                kotlin.jvm.internal.e0.checkNotNull(dialog);
                if (dialog.isShowing()) {
                    Dialog dialog2 = soundlikeActivity.J;
                    kotlin.jvm.internal.e0.checkNotNull(dialog2);
                    dialog2.dismiss();
                }
            }
        } catch (IllegalArgumentException unused) {
            soundlikeActivity.J = null;
        }
        if (this.f78634j == 0) {
            ca.u.sharedInstance().setPersoPropose(soundlikeActivity.G);
            ca.u.sharedInstance().setStats(this.f78635k);
            na.b.playWin();
            ca.v vVarSharedInstance = ca.v.sharedInstance();
            FirebaseAnalytics firebaseAnalytics = soundlikeActivity.K;
            kotlin.jvm.internal.e0.checkNotNull(firebaseAnalytics);
            vVarSharedInstance.stopGameEvents(1, firebaseAnalytics);
            SoundlikeActivity.access$goToLost(soundlikeActivity);
        } else {
            Toast.makeText(soundlikeActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
            soundlikeActivity.goToHome(false);
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((v7) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
