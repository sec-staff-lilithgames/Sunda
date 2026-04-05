package f1;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f55285a = new f();

    public final AutofillId getAutofillId(ViewStructure structure) {
        e0.checkNotNullParameter(structure, "structure");
        return structure.getAutofillId();
    }

    public final boolean isDate(AutofillValue value) {
        e0.checkNotNullParameter(value, "value");
        return value.isDate();
    }

    public final boolean isList(AutofillValue value) {
        e0.checkNotNullParameter(value, "value");
        return value.isList();
    }

    public final boolean isText(AutofillValue value) {
        e0.checkNotNullParameter(value, "value");
        return value.isText();
    }

    public final boolean isToggle(AutofillValue value) {
        e0.checkNotNullParameter(value, "value");
        return value.isToggle();
    }

    public final void setAutofillHints(ViewStructure structure, String[] hints) {
        e0.checkNotNullParameter(structure, "structure");
        e0.checkNotNullParameter(hints, "hints");
        structure.setAutofillHints(hints);
    }

    public final void setAutofillId(ViewStructure structure, AutofillId parent, int i10) {
        e0.checkNotNullParameter(structure, "structure");
        e0.checkNotNullParameter(parent, "parent");
        structure.setAutofillId(parent, i10);
    }

    public final void setAutofillType(ViewStructure structure, int i10) {
        e0.checkNotNullParameter(structure, "structure");
        structure.setAutofillType(i10);
    }

    public final CharSequence textValue(AutofillValue value) {
        e0.checkNotNullParameter(value, "value");
        CharSequence textValue = value.getTextValue();
        e0.checkNotNullExpressionValue(textValue, "value.textValue");
        return textValue;
    }
}
