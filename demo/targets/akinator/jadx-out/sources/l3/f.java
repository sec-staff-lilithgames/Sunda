package l3;

import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface f extends IInterface {
    public static final String Q8 = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportService".replace('$', '.');

    void isPermissionRevocationEnabledForApp(c cVar) throws RemoteException;
}
