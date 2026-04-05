package o9;

import android.app.Dialog;
import android.content.Intent;
import android.widget.Toast;
import com.digidust.elokence.akinator.activities.PostProposeActivity;
import com.digidust.elokence.akinator.activities.QuestionActivity;
import com.digidust.elokence.akinator.activities.ReportActivity;
import com.digidust.elokence.akinator.db.accountdb.AccountDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import lb.e;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class p3 implements st.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78431b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f78432c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f78433e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Serializable f78434f;

    public /* synthetic */ p3(Object obj, Object obj2, Serializable serializable, int i10) {
        this.f78431b = i10;
        this.f78432c = obj;
        this.f78433e = obj2;
        this.f78434f = serializable;
    }

    @Override // st.g
    public final void accept(Object obj) {
        int i10 = this.f78431b;
        Serializable serializable = this.f78434f;
        Object obj2 = this.f78433e;
        Object obj3 = this.f78432c;
        switch (i10) {
            case 0:
                s3 s3Var = (s3) obj3;
                Dialog dialog = (Dialog) obj2;
                ArrayList arrayList = (ArrayList) serializable;
                Integer num = (Integer) obj;
                s3Var.getClass();
                if (dialog != null) {
                    try {
                        if (dialog.isShowing()) {
                            dialog.dismiss();
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
                if (num.intValue() != 0) {
                    Toast.makeText(s3Var.f78517e, lb.b1.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                    s3Var.f78517e.goToHome(false);
                    break;
                } else {
                    jb.h.sharedInstance().incMetricCompteur("game_reports");
                    s3Var.f78517e.disableAdOneTime();
                    Intent intent = new Intent(s3Var.f78517e, (Class<?>) ReportActivity.class);
                    intent.putExtra("report", arrayList);
                    s3Var.startActivity(intent);
                    break;
                }
            case 1:
                PostProposeActivity postProposeActivity = (PostProposeActivity) obj3;
                AccountDatabase accountDatabase = (AccountDatabase) obj2;
                e.g gVar = (e.g) serializable;
                if (postProposeActivity.W == null) {
                    postProposeActivity.P = false;
                } else {
                    postProposeActivity.P = true;
                }
                accountDatabase.close();
                postProposeActivity.z(gVar);
                break;
            default:
                QuestionActivity questionActivity = (QuestionActivity) obj3;
                e.g gVar2 = (e.g) obj2;
                ArrayList arrayList2 = (ArrayList) serializable;
                Integer num2 = (Integer) obj;
                int i11 = QuestionActivity.f21703n0;
                Timber.Forest forest = Timber.Forest;
                forest.tag("QuestionActivity").d("doNotContinue result : " + num2, new Object[0]);
                if (num2 == null || num2.intValue() != 0) {
                    if ((num2 == null || num2.intValue() != -1) && ((num2 == null || num2.intValue() != 610) && (num2 == null || num2.intValue() != 600))) {
                        forest.tag("QuestionActivity").d("Error", new Object[0]);
                        Toast.makeText(questionActivity, lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                        questionActivity.goToHome(false);
                        break;
                    } else {
                        forest.tag("QuestionActivity").d("No internet", new Object[0]);
                        da.q.f51970b.show(questionActivity, 1, new e5(questionActivity, 2));
                        break;
                    }
                } else {
                    forest.tag("TAG").d("doNotContinue OK ", new Object[0]);
                    BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.c1.getLifecycleScope(questionActivity), null, null, new q5(questionActivity, gVar2, arrayList2, null), 3, null);
                    break;
                }
                break;
        }
    }
}
