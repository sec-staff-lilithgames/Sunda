package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(g6.d dVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f5728a = (IconCompat) dVar.readVersionedParcelable(remoteActionCompat.f5728a, 1);
        remoteActionCompat.f5729b = dVar.readCharSequence(remoteActionCompat.f5729b, 2);
        remoteActionCompat.f5730c = dVar.readCharSequence(remoteActionCompat.f5730c, 3);
        remoteActionCompat.f5731d = (PendingIntent) dVar.readParcelable(remoteActionCompat.f5731d, 4);
        remoteActionCompat.f5732e = dVar.readBoolean(remoteActionCompat.f5732e, 5);
        remoteActionCompat.f5733f = dVar.readBoolean(remoteActionCompat.f5733f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, g6.d dVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        dVar.setSerializationFlags(false, false);
        dVar.writeVersionedParcelable(remoteActionCompat.f5728a, 1);
        dVar.writeCharSequence(remoteActionCompat.f5729b, 2);
        dVar.writeCharSequence(remoteActionCompat.f5730c, 3);
        dVar.writeParcelable(remoteActionCompat.f5731d, 4);
        dVar.writeBoolean(remoteActionCompat.f5732e, 5);
        dVar.writeBoolean(remoteActionCompat.f5733f, 6);
    }
}
