package android.support.v4.media;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f4510a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f4511b;

    public b(q qVar) {
        this.f4510a = new WeakReference(qVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        WeakReference weakReference = this.f4511b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        WeakReference weakReference2 = this.f4510a;
        if (weakReference2.get() == null) {
            return;
        }
        Bundle data = message.getData();
        MediaSessionCompat.ensureClassLoader(data);
        q qVar = (q) weakReference2.get();
        Messenger messenger = (Messenger) this.f4511b.get();
        try {
            int i10 = message.what;
            if (i10 == 1) {
                Bundle bundle = data.getBundle("data_root_hints");
                MediaSessionCompat.ensureClassLoader(bundle);
                qVar.onServiceConnected(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                return;
            }
            if (i10 == 2) {
                qVar.onConnectionFailed(messenger);
                return;
            }
            if (i10 != 3) {
                Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                return;
            }
            Bundle bundle2 = data.getBundle("data_options");
            MediaSessionCompat.ensureClassLoader(bundle2);
            Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
            MediaSessionCompat.ensureClassLoader(bundle3);
            qVar.onLoadChildren(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
        } catch (BadParcelableException unused) {
            Log.e("MediaBrowserCompat", "Could not unparcel the data.");
            if (message.what == 1) {
                qVar.onConnectionFailed(messenger);
            }
        }
    }
}
