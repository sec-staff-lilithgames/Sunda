package g5;

import androidx.preference.PreferenceGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PreferenceGroup f57294b;

    public l(PreferenceGroup preferenceGroup) {
        this.f57294b = preferenceGroup;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this) {
            this.f57294b.P.clear();
        }
    }
}
