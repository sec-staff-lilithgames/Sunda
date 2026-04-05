package o9;

import android.app.Dialog;
import android.content.Intent;
import android.widget.Toast;
import com.digidust.elokence.akinator.activities.GameOverSliderActivity;
import com.digidust.elokence.akinator.activities.SoundlikeActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import kotlinx.coroutines.CoroutineScope;
import lb.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class p7 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ SoundlikeActivity f78440i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f78441j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(SoundlikeActivity soundlikeActivity, int i10, zu.d dVar) {
        super(2, dVar);
        this.f78440i = soundlikeActivity;
        this.f78441j = i10;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new p7(this.f78440i, this.f78441j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        SoundlikeActivity soundlikeActivity = this.f78440i;
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
        if (this.f78441j == 0) {
            Intent intent = new Intent(soundlikeActivity, (Class<?>) GameOverSliderActivity.class);
            try {
                ArrayList arrayList = soundlikeActivity.D;
                kotlin.jvm.internal.e0.checkNotNull(arrayList);
                Object obj2 = arrayList.get(soundlikeActivity.I);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(obj2, "get(...)");
                kotlin.jvm.internal.e0.checkNotNull(intent.putExtra("keyAcceptance", ((e.b) obj2).getName()));
            } catch (Exception unused2) {
            }
            ca.o.sharedInstance().addOneLostGame();
            ca.o.sharedInstance().setAkinatorStatus(1);
            ca.o.sharedInstance().setGameOverActivityState(11);
            ca.v vVarSharedInstance = ca.v.sharedInstance();
            FirebaseAnalytics firebaseAnalytics = soundlikeActivity.K;
            kotlin.jvm.internal.e0.checkNotNull(firebaseAnalytics);
            vVarSharedInstance.stopGameEvents(2, firebaseAnalytics);
            soundlikeActivity.startActivity(intent);
            soundlikeActivity.finish();
        } else {
            Toast.makeText(soundlikeActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
            soundlikeActivity.goToHome(false);
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((p7) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
