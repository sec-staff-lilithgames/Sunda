package a4;

import android.view.autofill.AutofillId;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4063a;

    public a(AutofillId autofillId) {
        this.f4063a = autofillId;
    }

    public static a toAutofillIdCompat(AutofillId autofillId) {
        return new a(autofillId);
    }

    public AutofillId toAutofillId() {
        return (AutofillId) this.f4063a;
    }
}
