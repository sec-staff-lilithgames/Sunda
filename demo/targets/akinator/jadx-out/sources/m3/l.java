package m3;

import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l extends l3.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f74008b;

    public l(m mVar) {
        this.f74008b = mVar;
    }

    @Override // l3.b, l3.c
    public void onIsPermissionRevocationEnabledForAppResult(boolean z10, boolean z11) throws RemoteException {
        m mVar = this.f74008b;
        if (!z10) {
            mVar.f74009b.set(0);
            Log.e("PackageManagerCompat", "Unable to retrieve the permission revocation setting from the backport");
        } else if (z11) {
            mVar.f74009b.set(3);
        } else {
            mVar.f74009b.set(2);
        }
    }
}
