package android.support.v4.media;

import android.os.Bundle;
import android.os.Messenger;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface q {
    void onConnectionFailed(Messenger messenger);

    void onLoadChildren(Messenger messenger, String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2);

    void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);
}
