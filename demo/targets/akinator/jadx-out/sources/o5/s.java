package o5;

import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface s extends IInterface {
    public static final String S8 = "androidx$room$IMultiInstanceInvalidationCallback".replace('$', '.');

    void onInvalidation(String[] strArr) throws RemoteException;
}
