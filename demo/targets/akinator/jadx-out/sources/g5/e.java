package g5;

import android.text.TextUtils;
import androidx.preference.ListPreference;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e implements j {

    /* renamed from: a, reason: collision with root package name */
    public static e f57291a;

    public static e getInstance() {
        if (f57291a == null) {
            f57291a = new e();
        }
        return f57291a;
    }

    @Override // g5.j
    public CharSequence provideSummary(ListPreference listPreference) {
        return TextUtils.isEmpty(listPreference.getEntry()) ? listPreference.getContext().getString(R.string.not_set) : listPreference.getEntry();
    }
}
