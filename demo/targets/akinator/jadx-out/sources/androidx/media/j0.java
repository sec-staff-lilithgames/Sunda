package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Messenger f6830a;

    public j0(Messenger messenger) {
        this.f6830a = messenger;
    }

    public final void a(int i10, Bundle bundle) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i10;
        messageObtain.arg1 = 2;
        messageObtain.setData(bundle);
        this.f6830a.send(messageObtain);
    }

    @Override // androidx.media.i0
    public IBinder asBinder() {
        return this.f6830a.getBinder();
    }

    @Override // androidx.media.i0
    public void onConnect(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("extra_service_version", 2);
        Bundle bundle2 = new Bundle();
        bundle2.putString("data_media_item_id", str);
        bundle2.putParcelable("data_media_session_token", token);
        bundle2.putBundle("data_root_hints", bundle);
        a(1, bundle2);
    }

    @Override // androidx.media.i0
    public void onConnectFailed() throws RemoteException {
        a(2, null);
    }

    @Override // androidx.media.i0
    public void onLoadChildren(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
        Bundle bundle3 = new Bundle();
        bundle3.putString("data_media_item_id", str);
        bundle3.putBundle("data_options", bundle);
        bundle3.putBundle("data_notify_children_changed_options", bundle2);
        if (list != null) {
            bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        }
        a(3, bundle3);
    }
}
