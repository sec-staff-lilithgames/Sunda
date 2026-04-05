package d;

import android.app.Notification;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface c extends IInterface {
    public static final String C8 = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    void cancel(String str, int i10, String str2) throws RemoteException;

    void cancelAll(String str) throws RemoteException;

    void notify(String str, int i10, String str2, Notification notification) throws RemoteException;
}
