package androidx.media;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.util.Log;
import tv.Mu.QpyI;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class k0 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f6840a;

    public k0(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        this.f6840a = new h0(mediaBrowserServiceCompat);
    }

    public void postOrRun(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(Message message, long j10) {
        Bundle data = message.getData();
        data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
        data.putInt("data_calling_uid", Binder.getCallingUid());
        int callingPid = Binder.getCallingPid();
        if (callingPid > 0) {
            data.putInt("data_calling_pid", callingPid);
        } else if (!data.containsKey("data_calling_pid")) {
            data.putInt("data_calling_pid", -1);
        }
        return super.sendMessageAtTime(message, j10);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Bundle data = message.getData();
        int i10 = message.what;
        h0 h0Var = this.f6840a;
        switch (i10) {
            case 1:
                Bundle bundle = data.getBundle("data_root_hints");
                MediaSessionCompat.ensureClassLoader(bundle);
                this.f6840a.connect(data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, new j0(message.replyTo));
                break;
            case 2:
                h0Var.disconnect(new j0(message.replyTo));
                break;
            case 3:
                Bundle bundle2 = data.getBundle("data_options");
                MediaSessionCompat.ensureClassLoader(bundle2);
                h0Var.addSubscription(data.getString("data_media_item_id"), k3.p.getBinder(data, "data_callback_token"), bundle2, new j0(message.replyTo));
                break;
            case 4:
                h0Var.removeSubscription(data.getString("data_media_item_id"), k3.p.getBinder(data, "data_callback_token"), new j0(message.replyTo));
                break;
            case 5:
                h0Var.getMediaItem(data.getString("data_media_item_id"), (ResultReceiver) data.getParcelable("data_result_receiver"), new j0(message.replyTo));
                break;
            case 6:
                Bundle bundle3 = data.getBundle("data_root_hints");
                MediaSessionCompat.ensureClassLoader(bundle3);
                this.f6840a.registerCallbacks(new j0(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                break;
            case 7:
                h0Var.unregisterCallbacks(new j0(message.replyTo));
                break;
            case 8:
                Bundle bundle4 = data.getBundle("data_search_extras");
                MediaSessionCompat.ensureClassLoader(bundle4);
                h0Var.search(data.getString("data_search_query"), bundle4, (ResultReceiver) data.getParcelable("data_result_receiver"), new j0(message.replyTo));
                break;
            case 9:
                Bundle bundle5 = data.getBundle(QpyI.msTP);
                MediaSessionCompat.ensureClassLoader(bundle5);
                h0Var.sendCustomAction(data.getString("data_custom_action"), bundle5, (ResultReceiver) data.getParcelable("data_result_receiver"), new j0(message.replyTo));
                break;
            default:
                Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                break;
        }
    }
}
