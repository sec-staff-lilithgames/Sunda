package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class n implements f, q, d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4532a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaBrowser f4533b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f4534c;

    /* renamed from: d, reason: collision with root package name */
    public final b f4535d = new b(this);

    /* renamed from: e, reason: collision with root package name */
    public final z.f f4536e = new z.f();

    /* renamed from: f, reason: collision with root package name */
    public int f4537f;

    /* renamed from: g, reason: collision with root package name */
    public MediaBrowserCompat.e f4538g;

    /* renamed from: h, reason: collision with root package name */
    public Messenger f4539h;

    /* renamed from: i, reason: collision with root package name */
    public MediaSessionCompat.Token f4540i;

    /* renamed from: j, reason: collision with root package name */
    public Bundle f4541j;

    public n(Context context, ComponentName componentName, MediaBrowserCompat.a aVar, Bundle bundle) {
        this.f4532a = context;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        this.f4534c = bundle2;
        bundle2.putInt("extra_client_version", 1);
        bundle2.putInt("extra_calling_pid", Process.myPid());
        aVar.f4475b = this;
        this.f4533b = new MediaBrowser(context, componentName, aVar.f4474a, bundle2);
    }

    @Override // android.support.v4.media.f
    public void connect() {
        this.f4533b.connect();
    }

    @Override // android.support.v4.media.f
    public void disconnect() {
        Messenger messenger;
        MediaBrowserCompat.e eVar = this.f4538g;
        if (eVar != null && (messenger = this.f4539h) != null) {
            try {
                eVar.b(7, null, messenger);
            } catch (RemoteException unused) {
                Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
            }
        }
        this.f4533b.disconnect();
    }

    @Override // android.support.v4.media.f
    public Bundle getExtras() {
        return this.f4533b.getExtras();
    }

    @Override // android.support.v4.media.f
    public void getItem(String str, MediaBrowserCompat.c cVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("mediaId is empty");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("cb is null");
        }
        boolean zIsConnected = this.f4533b.isConnected();
        b bVar = this.f4535d;
        if (!zIsConnected) {
            Log.i("MediaBrowserCompat", "Not connected, unable to retrieve the MediaItem.");
            bVar.post(new g(str, cVar));
            return;
        }
        if (this.f4538g == null) {
            bVar.post(new h(str, cVar));
            return;
        }
        MediaBrowserCompat.ItemReceiver itemReceiver = new MediaBrowserCompat.ItemReceiver(str, cVar, bVar);
        try {
            MediaBrowserCompat.e eVar = this.f4538g;
            Messenger messenger = this.f4539h;
            eVar.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("data_media_item_id", str);
            bundle.putParcelable("data_result_receiver", itemReceiver);
            eVar.b(5, bundle, messenger);
        } catch (RemoteException unused) {
            Log.i("MediaBrowserCompat", "Remote error getting media item: " + str);
            bVar.post(new i(str, cVar));
        }
    }

    @Override // android.support.v4.media.f
    public Bundle getNotifyChildrenChangedOptions() {
        return this.f4541j;
    }

    @Override // android.support.v4.media.f
    public String getRoot() {
        return this.f4533b.getRoot();
    }

    @Override // android.support.v4.media.f
    public ComponentName getServiceComponent() {
        return this.f4533b.getServiceComponent();
    }

    @Override // android.support.v4.media.f
    public MediaSessionCompat.Token getSessionToken() {
        if (this.f4540i == null) {
            this.f4540i = MediaSessionCompat.Token.fromToken(this.f4533b.getSessionToken());
        }
        return this.f4540i;
    }

    @Override // android.support.v4.media.f
    public boolean isConnected() {
        return this.f4533b.isConnected();
    }

    @Override // android.support.v4.media.d
    public void onConnected() {
        MediaBrowser mediaBrowser = this.f4533b;
        try {
            Bundle extras = mediaBrowser.getExtras();
            if (extras == null) {
                return;
            }
            this.f4537f = extras.getInt("extra_service_version", 0);
            IBinder binder = k3.p.getBinder(extras, "extra_messenger");
            if (binder != null) {
                this.f4538g = new MediaBrowserCompat.e(binder, this.f4534c);
                b bVar = this.f4535d;
                Messenger messenger = new Messenger(bVar);
                this.f4539h = messenger;
                bVar.getClass();
                bVar.f4511b = new WeakReference(messenger);
                try {
                    MediaBrowserCompat.e eVar = this.f4538g;
                    Context context = this.f4532a;
                    Messenger messenger2 = this.f4539h;
                    eVar.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("data_package_name", context.getPackageName());
                    bundle.putInt("data_calling_pid", Process.myPid());
                    bundle.putBundle("data_root_hints", eVar.f4478b);
                    eVar.b(6, bundle, messenger2);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                }
            }
            android.support.v4.media.session.f fVarAsInterface = android.support.v4.media.session.e.asInterface(k3.p.getBinder(extras, "extra_session_binder"));
            if (fVarAsInterface != null) {
                this.f4540i = MediaSessionCompat.Token.fromToken(mediaBrowser.getSessionToken(), fVarAsInterface);
            }
        } catch (IllegalStateException e10) {
            Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e10);
        }
    }

    @Override // android.support.v4.media.d
    public void onConnectionFailed() {
    }

    @Override // android.support.v4.media.d
    public void onConnectionSuspended() {
        this.f4538g = null;
        this.f4539h = null;
        this.f4540i = null;
        b bVar = this.f4535d;
        bVar.getClass();
        bVar.f4511b = new WeakReference(null);
    }

    @Override // android.support.v4.media.q
    public void onLoadChildren(Messenger messenger, String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) {
        if (this.f4539h != messenger) {
            return;
        }
        MediaBrowserCompat.f fVar = (MediaBrowserCompat.f) this.f4536e.get(str);
        if (fVar == null) {
            if (MediaBrowserCompat.f4462b) {
                Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                return;
            }
            return;
        }
        MediaBrowserCompat.g callback = fVar.getCallback(bundle);
        if (callback != null) {
            if (bundle == null) {
                if (list == null) {
                    callback.onError(str);
                    return;
                }
                this.f4541j = bundle2;
                callback.onChildrenLoaded(str, list);
                this.f4541j = null;
                return;
            }
            if (list == null) {
                callback.onError(str, bundle);
                return;
            }
            this.f4541j = bundle2;
            callback.onChildrenLoaded(str, list, bundle);
            this.f4541j = null;
        }
    }

    @Override // android.support.v4.media.f
    public void search(String str, Bundle bundle, MediaBrowserCompat.d dVar) {
        if (!isConnected()) {
            throw new IllegalStateException("search() called while not connected");
        }
        MediaBrowserCompat.e eVar = this.f4538g;
        b bVar = this.f4535d;
        if (eVar == null) {
            Log.i("MediaBrowserCompat", "The connected service doesn't support search.");
            bVar.post(new j(str, bundle, dVar));
            return;
        }
        MediaBrowserCompat.SearchResultReceiver searchResultReceiver = new MediaBrowserCompat.SearchResultReceiver(str, bundle, dVar, bVar);
        try {
            MediaBrowserCompat.e eVar2 = this.f4538g;
            Messenger messenger = this.f4539h;
            eVar2.getClass();
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_search_query", str);
            bundle2.putBundle("data_search_extras", bundle);
            bundle2.putParcelable("data_result_receiver", searchResultReceiver);
            eVar2.b(8, bundle2, messenger);
        } catch (RemoteException e10) {
            Log.i("MediaBrowserCompat", "Remote error searching items with query: " + str, e10);
            bVar.post(new k(str, bundle, dVar));
        }
    }

    @Override // android.support.v4.media.f
    public void sendCustomAction(String str, Bundle bundle, MediaBrowserCompat.b bVar) {
        if (!isConnected()) {
            throw new IllegalStateException("Cannot send a custom action (" + str + ") with extras " + bundle + " because the browser is not connected to the service.");
        }
        MediaBrowserCompat.e eVar = this.f4538g;
        b bVar2 = this.f4535d;
        if (eVar == null) {
            Log.i("MediaBrowserCompat", "The connected service doesn't support sendCustomAction.");
            if (bVar != null) {
                bVar2.post(new l(str, bundle, bVar));
            }
        }
        MediaBrowserCompat.CustomActionResultReceiver customActionResultReceiver = new MediaBrowserCompat.CustomActionResultReceiver(str, bundle, bVar, bVar2);
        try {
            MediaBrowserCompat.e eVar2 = this.f4538g;
            Messenger messenger = this.f4539h;
            eVar2.getClass();
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_custom_action", str);
            bundle2.putBundle("data_custom_action_extras", bundle);
            bundle2.putParcelable("data_result_receiver", customActionResultReceiver);
            eVar2.b(9, bundle2, messenger);
        } catch (RemoteException e10) {
            Log.i("MediaBrowserCompat", "Remote error sending a custom action: action=" + str + ", extras=" + bundle, e10);
            if (bVar != null) {
                bVar2.post(new m(str, bundle, bVar));
            }
        }
    }

    @Override // android.support.v4.media.f
    public void subscribe(String str, Bundle bundle, MediaBrowserCompat.g gVar) {
        z.f fVar = this.f4536e;
        MediaBrowserCompat.f fVar2 = (MediaBrowserCompat.f) fVar.get(str);
        if (fVar2 == null) {
            fVar2 = new MediaBrowserCompat.f();
            fVar.put(str, fVar2);
        }
        gVar.getClass();
        gVar.f4483c = new WeakReference(fVar2);
        Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        fVar2.putCallback(bundle2, gVar);
        MediaBrowserCompat.e eVar = this.f4538g;
        if (eVar == null) {
            this.f4533b.subscribe(str, gVar.f4481a);
            return;
        }
        try {
            Binder binder = gVar.f4482b;
            Messenger messenger = this.f4539h;
            eVar.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            k3.p.putBinder(bundle3, "data_callback_token", binder);
            bundle3.putBundle("data_options", bundle2);
            eVar.b(3, bundle3, messenger);
        } catch (RemoteException unused) {
            Log.i("MediaBrowserCompat", "Remote error subscribing media item: " + str);
        }
    }

    @Override // android.support.v4.media.f
    public void unsubscribe(String str, MediaBrowserCompat.g gVar) {
        z.f fVar = this.f4536e;
        MediaBrowserCompat.f fVar2 = (MediaBrowserCompat.f) fVar.get(str);
        if (fVar2 == null) {
            return;
        }
        MediaBrowserCompat.e eVar = this.f4538g;
        if (eVar == null) {
            MediaBrowser mediaBrowser = this.f4533b;
            if (gVar == null) {
                mediaBrowser.unsubscribe(str);
            } else {
                List<MediaBrowserCompat.g> callbacks = fVar2.getCallbacks();
                List<Bundle> optionsList = fVar2.getOptionsList();
                for (int size = callbacks.size() - 1; size >= 0; size--) {
                    if (callbacks.get(size) == gVar) {
                        callbacks.remove(size);
                        optionsList.remove(size);
                    }
                }
                if (callbacks.size() == 0) {
                    mediaBrowser.unsubscribe(str);
                }
            }
        } else {
            try {
                if (gVar == null) {
                    eVar.a(str, null, this.f4539h);
                } else {
                    List<MediaBrowserCompat.g> callbacks2 = fVar2.getCallbacks();
                    List<Bundle> optionsList2 = fVar2.getOptionsList();
                    for (int size2 = callbacks2.size() - 1; size2 >= 0; size2--) {
                        if (callbacks2.get(size2) == gVar) {
                            this.f4538g.a(str, gVar.f4482b, this.f4539h);
                            callbacks2.remove(size2);
                            optionsList2.remove(size2);
                        }
                    }
                }
            } catch (RemoteException unused) {
                Log.d("MediaBrowserCompat", "removeSubscription failed with RemoteException parentId=" + str);
            }
        }
        if (fVar2.isEmpty() || gVar == null) {
            fVar.remove(str);
        }
    }

    @Override // android.support.v4.media.q
    public void onConnectionFailed(Messenger messenger) {
    }

    @Override // android.support.v4.media.q
    public void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
    }
}
