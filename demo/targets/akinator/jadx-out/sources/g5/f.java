package g5;

import android.view.View;
import androidx.preference.Preference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Preference f57292b;

    public f(Preference preference) {
        this.f57292b = preference;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f57292b.k(view);
    }
}
