package vn;

import android.net.Uri;
import ao.r0;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface q {
    void addListener(m mVar);

    boolean excludeMediaPlaylist(Uri uri, long j10);

    long getInitialStartTimeUs();

    h getMultivariantPlaylist();

    f getPlaylistSnapshot(Uri uri, boolean z10);

    boolean isLive();

    boolean isSnapshotValid(Uri uri);

    void maybeThrowPlaylistRefreshError(Uri uri) throws IOException;

    void maybeThrowPrimaryPlaylistRefreshError() throws IOException;

    void refreshPlaylist(Uri uri);

    void removeListener(m mVar);

    void start(Uri uri, r0 r0Var, p pVar);

    void stop();

    default void deactivatePlaylistForPlayback(Uri uri) {
    }
}
