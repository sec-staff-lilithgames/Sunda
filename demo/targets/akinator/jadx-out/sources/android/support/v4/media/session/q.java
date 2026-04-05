package android.support.v4.media.session;

import android.media.Rating;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import com.unity3d.services.core.request.NJc.yFkbx;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class q extends p {

    /* renamed from: a, reason: collision with root package name */
    public final MediaController.TransportControls f4619a;

    public q(MediaController.TransportControls transportControls) {
        this.f4619a = transportControls;
    }

    @Override // android.support.v4.media.session.p
    public void fastForward() {
        this.f4619a.fastForward();
    }

    @Override // android.support.v4.media.session.p
    public void pause() {
        this.f4619a.pause();
    }

    @Override // android.support.v4.media.session.p
    public void play() {
        this.f4619a.play();
    }

    @Override // android.support.v4.media.session.p
    public void playFromMediaId(String str, Bundle bundle) {
        this.f4619a.playFromMediaId(str, bundle);
    }

    @Override // android.support.v4.media.session.p
    public void playFromSearch(String str, Bundle bundle) {
        this.f4619a.playFromSearch(str, bundle);
    }

    @Override // android.support.v4.media.session.p
    public void playFromUri(Uri uri, Bundle bundle) {
        if (uri == null || Uri.EMPTY.equals(uri)) {
            throw new IllegalArgumentException("You must specify a non-empty Uri for playFromUri.");
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", uri);
        bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
        sendCustomAction("android.support.v4.media.session.action.PLAY_FROM_URI", bundle2);
    }

    @Override // android.support.v4.media.session.p
    public void prepare() {
        sendCustomAction("android.support.v4.media.session.action.PREPARE", (Bundle) null);
    }

    @Override // android.support.v4.media.session.p
    public void prepareFromSearch(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("android.support.v4.media.session.action.ARGUMENT_QUERY", str);
        bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
        sendCustomAction("android.support.v4.media.session.action.PREPARE_FROM_SEARCH", bundle2);
    }

    @Override // android.support.v4.media.session.p
    public void prepareFromUri(Uri uri, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", uri);
        bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
        sendCustomAction("android.support.v4.media.session.action.PREPARE_FROM_URI", bundle2);
    }

    @Override // android.support.v4.media.session.p
    public void rewind() {
        this.f4619a.rewind();
    }

    @Override // android.support.v4.media.session.p
    public void seekTo(long j10) {
        this.f4619a.seekTo(j10);
    }

    @Override // android.support.v4.media.session.p
    public void sendCustomAction(PlaybackStateCompat.CustomAction customAction, Bundle bundle) {
        j.a(bundle, customAction.getAction());
        this.f4619a.sendCustomAction(customAction.getAction(), bundle);
    }

    @Override // android.support.v4.media.session.p
    public void setCaptioningEnabled(boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED", z10);
        sendCustomAction("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED", bundle);
    }

    @Override // android.support.v4.media.session.p
    public void setPlaybackSpeed(float f10) {
        if (f10 == 0.0f) {
            throw new IllegalArgumentException("speed must not be zero");
        }
        Bundle bundle = new Bundle();
        bundle.putFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", f10);
        sendCustomAction("android.support.v4.media.session.action.SET_PLAYBACK_SPEED", bundle);
    }

    @Override // android.support.v4.media.session.p
    public void setRating(RatingCompat ratingCompat) {
        this.f4619a.setRating(ratingCompat != null ? (Rating) ratingCompat.getRating() : null);
    }

    @Override // android.support.v4.media.session.p
    public void setRepeatMode(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE", i10);
        sendCustomAction("android.support.v4.media.session.action.SET_REPEAT_MODE", bundle);
    }

    @Override // android.support.v4.media.session.p
    public void setShuffleMode(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE", i10);
        sendCustomAction("android.support.v4.media.session.action.SET_SHUFFLE_MODE", bundle);
    }

    @Override // android.support.v4.media.session.p
    public void skipToNext() {
        this.f4619a.skipToNext();
    }

    @Override // android.support.v4.media.session.p
    public void skipToPrevious() {
        this.f4619a.skipToPrevious();
    }

    @Override // android.support.v4.media.session.p
    public void skipToQueueItem(long j10) {
        this.f4619a.skipToQueueItem(j10);
    }

    @Override // android.support.v4.media.session.p
    public void stop() {
        this.f4619a.stop();
    }

    @Override // android.support.v4.media.session.p
    public void prepareFromMediaId(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID", str);
        bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
        sendCustomAction(yFkbx.qWdsRjWyMaFsWl, bundle2);
    }

    @Override // android.support.v4.media.session.p
    public void setRating(RatingCompat ratingCompat, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("android.support.v4.media.session.action.ARGUMENT_RATING", ratingCompat);
        bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
        sendCustomAction("android.support.v4.media.session.action.SET_RATING", bundle2);
    }

    @Override // android.support.v4.media.session.p
    public void sendCustomAction(String str, Bundle bundle) {
        j.a(bundle, str);
        this.f4619a.sendCustomAction(str, bundle);
    }
}
