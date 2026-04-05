package o9;

import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.digidust.elokence.akinator.activities.InscriptionActivity;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.paid.databinding.ActivityInscriptionBinding;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class a3 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78027b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InscriptionActivity f78028c;

    public /* synthetic */ a3(InscriptionActivity inscriptionActivity, int i10) {
        this.f78027b = i10;
        this.f78028c = inscriptionActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f78027b;
        InscriptionActivity inscriptionActivity = this.f78028c;
        switch (i10) {
            case 0:
                int i11 = InscriptionActivity.J;
                inscriptionActivity.w(true);
                break;
            case 1:
                int i12 = InscriptionActivity.J;
                inscriptionActivity.v(false);
                break;
            case 2:
                int i13 = InscriptionActivity.J;
                inscriptionActivity.v(true);
                break;
            default:
                ActivityInscriptionBinding activityInscriptionBinding = null;
                if (!inscriptionActivity.E) {
                    ActivityInscriptionBinding activityInscriptionBinding2 = inscriptionActivity.F;
                    if (activityInscriptionBinding2 == null) {
                        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                        activityInscriptionBinding2 = null;
                    }
                    activityInscriptionBinding2.eyeButton.setBackgroundResource(R.drawable.btn_hidden_eye);
                    ActivityInscriptionBinding activityInscriptionBinding3 = inscriptionActivity.F;
                    if (activityInscriptionBinding3 == null) {
                        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                        activityInscriptionBinding3 = null;
                    }
                    activityInscriptionBinding3.passwordEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    inscriptionActivity.E = true;
                    ActivityInscriptionBinding activityInscriptionBinding4 = inscriptionActivity.F;
                    if (activityInscriptionBinding4 == null) {
                        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                        activityInscriptionBinding4 = null;
                    }
                    EditText editText = activityInscriptionBinding4.passwordEditText;
                    ActivityInscriptionBinding activityInscriptionBinding5 = inscriptionActivity.F;
                    if (activityInscriptionBinding5 == null) {
                        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityInscriptionBinding = activityInscriptionBinding5;
                    }
                    editText.setSelection(activityInscriptionBinding.passwordEditText.getText().length());
                    break;
                } else {
                    ActivityInscriptionBinding activityInscriptionBinding6 = inscriptionActivity.F;
                    if (activityInscriptionBinding6 == null) {
                        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                        activityInscriptionBinding6 = null;
                    }
                    activityInscriptionBinding6.eyeButton.setBackgroundResource(R.drawable.btn_visible_eye);
                    ActivityInscriptionBinding activityInscriptionBinding7 = inscriptionActivity.F;
                    if (activityInscriptionBinding7 == null) {
                        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                        activityInscriptionBinding7 = null;
                    }
                    activityInscriptionBinding7.passwordEditText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    inscriptionActivity.E = false;
                    ActivityInscriptionBinding activityInscriptionBinding8 = inscriptionActivity.F;
                    if (activityInscriptionBinding8 == null) {
                        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                        activityInscriptionBinding8 = null;
                    }
                    EditText editText2 = activityInscriptionBinding8.passwordEditText;
                    ActivityInscriptionBinding activityInscriptionBinding9 = inscriptionActivity.F;
                    if (activityInscriptionBinding9 == null) {
                        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityInscriptionBinding = activityInscriptionBinding9;
                    }
                    editText2.setSelection(activityInscriptionBinding.passwordEditText.getText().length());
                    break;
                }
        }
    }
}
