package android.support.v4.media;

import android.media.MediaDescription;
import android.media.browse.MediaBrowser;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a {
    public static MediaDescription a(MediaBrowser.MediaItem mediaItem) {
        return mediaItem.getDescription();
    }

    public static int b(MediaBrowser.MediaItem mediaItem) {
        return mediaItem.getFlags();
    }
}
