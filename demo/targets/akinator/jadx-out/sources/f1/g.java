package f1;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends AutofillManager$AutofillCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final g f55286a = new g();

    public void onAutofillEvent(View view, int i10, int i11) {
        e0.checkNotNullParameter(view, "view");
        super.onAutofillEvent(view, i10, i11);
        Log.d("Autofill Status", i11 != 1 ? i11 != 2 ? i11 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account" : "Autofill popup was hidden." : "Autofill popup was shown.");
    }

    public final void register(a autofill) {
        e0.checkNotNullParameter(autofill, "autofill");
        autofill.getAutofillManager().registerCallback(this);
    }

    public final void unregister(a autofill) {
        e0.checkNotNullParameter(autofill, "autofill");
        autofill.getAutofillManager().unregisterCallback(this);
    }
}
