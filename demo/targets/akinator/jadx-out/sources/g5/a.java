package g5;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CheckBoxPreference f57288b;

    public a(CheckBoxPreference checkBoxPreference) {
        this.f57288b = checkBoxPreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        CheckBoxPreference checkBoxPreference = this.f57288b;
        if (checkBoxPreference.callChangeListener(boolValueOf)) {
            checkBoxPreference.setChecked(z10);
        } else {
            compoundButton.setChecked(!z10);
        }
    }
}
