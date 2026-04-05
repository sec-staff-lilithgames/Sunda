package g5;

import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d implements j {

    /* renamed from: a, reason: collision with root package name */
    public static d f57290a;

    public static d getInstance() {
        if (f57290a == null) {
            f57290a = new d();
        }
        return f57290a;
    }

    @Override // g5.j
    public CharSequence provideSummary(EditTextPreference editTextPreference) {
        return TextUtils.isEmpty(editTextPreference.getText()) ? editTextPreference.getContext().getString(R.string.not_set) : editTextPreference.getText();
    }
}
