package k7;

import android.content.Context;
import android.net.ConnectivityManager;
import q7.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i {
    public static final h NetworkObserver(Context context, g gVar, v vVar) {
        ConnectivityManager connectivityManager = (ConnectivityManager) m3.a.getSystemService(context, ConnectivityManager.class);
        if (connectivityManager == null || !q7.d.isPermissionGranted(context, "android.permission.ACCESS_NETWORK_STATE")) {
            if (vVar != null && vVar.getLevel() <= 5) {
                vVar.a();
            }
            return new e();
        }
        try {
            return new k(connectivityManager, gVar);
        } catch (Exception e10) {
            if (vVar != null) {
                q7.j.log(vVar, "NetworkObserver", new RuntimeException("Failed to register network observer.", e10));
            }
            return new e();
        }
    }
}
