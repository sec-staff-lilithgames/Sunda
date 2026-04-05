package g5;

import android.widget.CompoundButton;
import androidx.preference.SwitchPreferenceCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwitchPreferenceCompat f57329b;

    public x(SwitchPreferenceCompat switchPreferenceCompat) {
        this.f57329b = switchPreferenceCompat;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        SwitchPreferenceCompat switchPreferenceCompat = this.f57329b;
        if (switchPreferenceCompat.callChangeListener(boolValueOf)) {
            switchPreferenceCompat.setChecked(z10);
        } else {
            compoundButton.setChecked(!z10);
        }
    }
}
