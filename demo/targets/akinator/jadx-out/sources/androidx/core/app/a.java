package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a {
    public static Bundle a(Notification.Action action) {
        return action.getExtras();
    }

    public static RemoteInput[] b(Notification.Action action) {
        return action.getRemoteInputs();
    }
}
