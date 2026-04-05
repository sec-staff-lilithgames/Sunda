package android.support.v4.media;

import android.content.ComponentName;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface f {
    void connect();

    void disconnect();

    Bundle getExtras();

    void getItem(String str, MediaBrowserCompat.c cVar);

    Bundle getNotifyChildrenChangedOptions();

    String getRoot();

    ComponentName getServiceComponent();

    MediaSessionCompat.Token getSessionToken();

    boolean isConnected();

    void search(String str, Bundle bundle, MediaBrowserCompat.d dVar);

    void sendCustomAction(String str, Bundle bundle, MediaBrowserCompat.b bVar);

    void subscribe(String str, Bundle bundle, MediaBrowserCompat.g gVar);

    void unsubscribe(String str, MediaBrowserCompat.g gVar);
}
