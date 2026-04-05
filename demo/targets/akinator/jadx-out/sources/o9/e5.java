package o9;

import android.graphics.Bitmap;
import androidx.activity.result.ActivityResult;
import com.digidust.elokence.akinator.activities.QuestionActivity;
import java.io.IOException;
import lb.e;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class e5 implements mt.r0, da.p, i.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78116b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78117c;

    public /* synthetic */ e5(QuestionActivity questionActivity, int i10) {
        this.f78116b = i10;
        this.f78117c = questionActivity;
    }

    @Override // i.b
    public void onActivityResult(Object obj) {
        ActivityResult result = (ActivityResult) obj;
        int i10 = QuestionActivity.f21703n0;
        kotlin.jvm.internal.e0.checkNotNullParameter(result, "result");
        int resultCode = result.getResultCode();
        QuestionActivity questionActivity = this.f78117c;
        if (resultCode != -1) {
            questionActivity.goToHome(true);
            return;
        }
        Timber.Forest forest = Timber.Forest;
        forest.tag("QuestionActivity").d("Rare character unlocked, showing proposal", new Object[0]);
        x9.b bVar = questionActivity.I;
        u6 u6VarListWsTransitionAnimated = bVar != null ? bVar.listWsTransitionAnimated() : null;
        if (u6VarListWsTransitionAnimated != null) {
            questionActivity.I(u6VarListWsTransitionAnimated);
        } else {
            forest.tag("QuestionActivity").e("No transition found after rare character unlock", new Object[0]);
            questionActivity.goToHome(true);
        }
    }

    @Override // da.p
    public void onClose() {
        int i10 = this.f78116b;
        QuestionActivity questionActivity = this.f78117c;
        switch (i10) {
            case 1:
                int i11 = QuestionActivity.f21703n0;
                questionActivity.A();
                break;
            case 2:
                int i12 = QuestionActivity.f21703n0;
                questionActivity.v();
                break;
            case 3:
                int i13 = QuestionActivity.f21703n0;
                questionActivity.w();
                break;
            case 4:
                int i14 = QuestionActivity.f21703n0;
                questionActivity.x();
                break;
            default:
                questionActivity.G();
                break;
        }
    }

    @Override // mt.r0
    public void subscribe(mt.p0 p0Var) throws IOException {
        QuestionActivity questionActivity = this.f78117c;
        e.g gVar = questionActivity.R;
        if (gVar == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("proposedCharacter");
            gVar = null;
        }
        Bitmap bitmapDownloadPicture = kb.e.downloadPicture(gVar.getPicturePath(), ca.m.sharedInstance().canDownloadPicture());
        pt.c cVar = questionActivity.Y;
        if (cVar != null) {
            kotlin.jvm.internal.e0.checkNotNull(cVar);
            if (cVar.isDisposed()) {
                return;
            }
            if (bitmapDownloadPicture != null) {
                kotlin.jvm.internal.e0.checkNotNull(p0Var);
                ((du.g) p0Var).onSuccess(bitmapDownloadPicture);
            } else {
                kotlin.jvm.internal.e0.checkNotNull(p0Var);
                ((du.g) p0Var).onError(new NullPointerException());
            }
        }
    }
}
