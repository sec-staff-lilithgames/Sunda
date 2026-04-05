package f5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.j;
import android.view.KeyEvent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a extends MediaBrowserCompat.a {

    /* renamed from: c, reason: collision with root package name */
    public final Context f55355c;

    /* renamed from: d, reason: collision with root package name */
    public final Intent f55356d;

    /* renamed from: e, reason: collision with root package name */
    public final BroadcastReceiver.PendingResult f55357e;

    /* renamed from: f, reason: collision with root package name */
    public MediaBrowserCompat f55358f;

    public a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        this.f55355c = context;
        this.f55356d = intent;
        this.f55357e = pendingResult;
    }

    @Override // android.support.v4.media.MediaBrowserCompat.a
    public void onConnected() {
        new j(this.f55355c, this.f55358f.getSessionToken()).dispatchMediaButtonEvent((KeyEvent) this.f55356d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
        this.f55358f.disconnect();
        this.f55357e.finish();
    }

    @Override // android.support.v4.media.MediaBrowserCompat.a
    public void onConnectionFailed() {
        this.f55358f.disconnect();
        this.f55357e.finish();
    }

    @Override // android.support.v4.media.MediaBrowserCompat.a
    public void onConnectionSuspended() {
        this.f55358f.disconnect();
        this.f55357e.finish();
    }
}
