package e;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface c extends IInterface {
    public static final String E8 = "android$support$v4$os$IResultReceiver".replace('$', '.');

    void send(int i10, Bundle bundle) throws RemoteException;
}
