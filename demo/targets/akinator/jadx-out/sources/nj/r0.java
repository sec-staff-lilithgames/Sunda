package nj;

import android.app.Application;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f77003a;

    public r0(Application application) {
        this.f77003a = application;
    }

    public void install() {
        try {
            ProviderInstaller.installIfNeeded(this.f77003a);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException e10) {
            e10.printStackTrace();
        }
    }
}
