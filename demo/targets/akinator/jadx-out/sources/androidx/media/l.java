package androidx.media;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.session.MediaSessionCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface l {
    Bundle getBrowserRootHints();

    l0 getCurrentBrowserInfo();

    void notifyChildrenChanged(l0 l0Var, String str, Bundle bundle);

    void notifyChildrenChanged(String str, Bundle bundle);

    IBinder onBind(Intent intent);

    void onCreate();

    void setSessionToken(MediaSessionCompat.Token token);
}
