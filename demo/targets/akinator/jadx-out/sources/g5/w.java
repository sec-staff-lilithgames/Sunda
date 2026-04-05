package g5;

import android.widget.CompoundButton;
import androidx.preference.SwitchPreference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwitchPreference f57328b;

    public w(SwitchPreference switchPreference) {
        this.f57328b = switchPreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        SwitchPreference switchPreference = this.f57328b;
        if (switchPreference.callChangeListener(boolValueOf)) {
            switchPreference.setChecked(z10);
        } else {
            compoundButton.setChecked(!z10);
        }
    }
}
