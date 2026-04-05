package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class MediaBrowserCompat {

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f4462b = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: a, reason: collision with root package name */
    public final o f4463a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class CustomActionResultReceiver extends ResultReceiver {

        /* renamed from: f, reason: collision with root package name */
        public final String f4464f;

        /* renamed from: g, reason: collision with root package name */
        public final Bundle f4465g;

        /* renamed from: h, reason: collision with root package name */
        public final b f4466h;

        public CustomActionResultReceiver(String str, Bundle bundle, b bVar, Handler handler) {
            super(handler);
            this.f4464f = str;
            this.f4465g = bundle;
            this.f4466h = bVar;
        }

        @Override // android.support.v4.os.ResultReceiver
        public final void a(int i10, Bundle bundle) {
            b bVar = this.f4466h;
            if (bVar == null) {
                return;
            }
            MediaSessionCompat.ensureClassLoader(bundle);
            String str = this.f4464f;
            Bundle bundle2 = this.f4465g;
            if (i10 == -1) {
                bVar.onError(str, bundle2, bundle);
                return;
            }
            if (i10 == 0) {
                bVar.onResult(str, bundle2, bundle);
                return;
            }
            if (i10 == 1) {
                bVar.onProgressUpdate(str, bundle2, bundle);
                return;
            }
            Log.w("MediaBrowserCompat", "Unknown result code: " + i10 + " (extras=" + bundle2 + ", resultData=" + bundle + ")");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class ItemReceiver extends ResultReceiver {

        /* renamed from: f, reason: collision with root package name */
        public final String f4467f;

        /* renamed from: g, reason: collision with root package name */
        public final c f4468g;

        public ItemReceiver(String str, c cVar, Handler handler) {
            super(handler);
            this.f4467f = str;
            this.f4468g = cVar;
        }

        @Override // android.support.v4.os.ResultReceiver
        public final void a(int i10, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.unparcelWithClassLoader(bundle);
            }
            String str = this.f4467f;
            c cVar = this.f4468g;
            if (i10 != 0 || bundle == null || !bundle.containsKey("media_item")) {
                cVar.onError(str);
                return;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                cVar.onItemLoaded((MediaItem) parcelable);
            } else {
                cVar.onError(str);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SearchResultReceiver extends ResultReceiver {

        /* renamed from: f, reason: collision with root package name */
        public final String f4471f;

        /* renamed from: g, reason: collision with root package name */
        public final Bundle f4472g;

        /* renamed from: h, reason: collision with root package name */
        public final d f4473h;

        public SearchResultReceiver(String str, Bundle bundle, d dVar, Handler handler) {
            super(handler);
            this.f4471f = str;
            this.f4472g = bundle;
            this.f4473h = dVar;
        }

        @Override // android.support.v4.os.ResultReceiver
        public final void a(int i10, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.unparcelWithClassLoader(bundle);
            }
            Bundle bundle2 = this.f4472g;
            String str = this.f4471f;
            d dVar = this.f4473h;
            if (i10 != 0 || bundle == null || !bundle.containsKey("search_results")) {
                dVar.onError(str, bundle2);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            if (parcelableArray == null) {
                dVar.onError(str, bundle2);
                return;
            }
            ArrayList arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
            dVar.onSearchResult(str, bundle2, arrayList);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final Messenger f4477a;

        /* renamed from: b, reason: collision with root package name */
        public final Bundle f4478b;

        public e(IBinder iBinder, Bundle bundle) {
            this.f4477a = new Messenger(iBinder);
            this.f4478b = bundle;
        }

        /* JADX WARN: Failed to analyze thrown exceptions
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
        	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
         */
        public final void a(String str, Binder binder, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString("data_media_item_id", str);
            k3.p.putBinder(bundle, "data_callback_token", binder);
            b(4, bundle, messenger);
        }

        public final void b(int i10, Bundle bundle, Messenger messenger) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i10;
            messageObtain.arg1 = 1;
            messageObtain.setData(bundle);
            messageObtain.replyTo = messenger;
            this.f4477a.send(messageObtain);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f4479a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f4480b = new ArrayList();

        public g getCallback(Bundle bundle) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f4480b;
                if (i10 >= arrayList.size()) {
                    return null;
                }
                if (androidx.media.e.areSameOptions((Bundle) arrayList.get(i10), bundle)) {
                    return (g) this.f4479a.get(i10);
                }
                i10++;
            }
        }

        public List<g> getCallbacks() {
            return this.f4479a;
        }

        public List<Bundle> getOptionsList() {
            return this.f4480b;
        }

        public boolean isEmpty() {
            return this.f4479a.isEmpty();
        }

        public void putCallback(Bundle bundle, g gVar) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f4480b;
                int size = arrayList.size();
                ArrayList arrayList2 = this.f4479a;
                if (i10 >= size) {
                    arrayList2.add(gVar);
                    arrayList.add(bundle);
                    return;
                } else {
                    if (androidx.media.e.areSameOptions((Bundle) arrayList.get(i10), bundle)) {
                        arrayList2.set(i10, gVar);
                        return;
                    }
                    i10++;
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class g {

        /* renamed from: a, reason: collision with root package name */
        public final s f4481a;

        /* renamed from: b, reason: collision with root package name */
        public final Binder f4482b = new Binder();

        /* renamed from: c, reason: collision with root package name */
        public WeakReference f4483c;

        public g() {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f4481a = new t(this);
            } else {
                this.f4481a = new s(this);
            }
        }

        public void onChildrenLoaded(String str, List<MediaItem> list) {
        }

        public void onError(String str) {
        }

        public void onChildrenLoaded(String str, List<MediaItem> list, Bundle bundle) {
        }

        public void onError(String str, Bundle bundle) {
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, a aVar, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f4463a = new p(context, componentName, aVar, bundle);
        } else {
            this.f4463a = new o(context, componentName, aVar, bundle);
        }
    }

    public void connect() {
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        this.f4463a.connect();
    }

    public void disconnect() {
        this.f4463a.disconnect();
    }

    public Bundle getExtras() {
        return this.f4463a.getExtras();
    }

    public void getItem(String str, c cVar) {
        this.f4463a.getItem(str, cVar);
    }

    public Bundle getNotifyChildrenChangedOptions() {
        return this.f4463a.getNotifyChildrenChangedOptions();
    }

    public String getRoot() {
        return this.f4463a.getRoot();
    }

    public ComponentName getServiceComponent() {
        return this.f4463a.getServiceComponent();
    }

    public MediaSessionCompat.Token getSessionToken() {
        return this.f4463a.getSessionToken();
    }

    public boolean isConnected() {
        return this.f4463a.isConnected();
    }

    public void search(String str, Bundle bundle, d dVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("query cannot be empty");
        }
        if (dVar == null) {
            throw new IllegalArgumentException("callback cannot be null");
        }
        this.f4463a.search(str, bundle, dVar);
    }

    public void sendCustomAction(String str, Bundle bundle, b bVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("action cannot be empty");
        }
        this.f4463a.sendCustomAction(str, bundle, bVar);
    }

    public void subscribe(String str, g gVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (gVar == null) {
            throw new IllegalArgumentException("callback is null");
        }
        this.f4463a.subscribe(str, null, gVar);
    }

    public void unsubscribe(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        this.f4463a.unsubscribe(str, null);
    }

    public void unsubscribe(String str, g gVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (gVar != null) {
            this.f4463a.unsubscribe(str, gVar);
            return;
        }
        throw new IllegalArgumentException("callback is null");
    }

    public void subscribe(String str, Bundle bundle, g gVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (gVar == null) {
            throw new IllegalArgumentException("callback is null");
        }
        if (bundle != null) {
            this.f4463a.subscribe(str, bundle, gVar);
            return;
        }
        throw new IllegalArgumentException("options are null");
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new r();

        /* renamed from: b, reason: collision with root package name */
        public final int f4469b;

        /* renamed from: c, reason: collision with root package name */
        public final MediaDescriptionCompat f4470c;

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            }
            if (TextUtils.isEmpty(mediaDescriptionCompat.getMediaId())) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            this.f4469b = i10;
            this.f4470c = mediaDescriptionCompat;
        }

        public static MediaItem fromMediaItem(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
            return new MediaItem(MediaDescriptionCompat.fromMediaDescription(android.support.v4.media.a.a(mediaItem)), android.support.v4.media.a.b(mediaItem));
        }

        public static List<MediaItem> fromMediaItemList(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(fromMediaItem(it.next()));
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public MediaDescriptionCompat getDescription() {
            return this.f4470c;
        }

        public int getFlags() {
            return this.f4469b;
        }

        public String getMediaId() {
            return this.f4470c.getMediaId();
        }

        public boolean isBrowsable() {
            return (this.f4469b & 1) != 0;
        }

        public boolean isPlayable() {
            return (this.f4469b & 2) != 0;
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.f4469b + ", mDescription=" + this.f4470c + AbstractJsonLexerKt.END_OBJ;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f4469b);
            this.f4470c.writeToParcel(parcel, i10);
        }

        public MediaItem(Parcel parcel) {
            this.f4469b = parcel.readInt();
            this.f4470c = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final android.support.v4.media.c f4474a = new android.support.v4.media.c(this);

        /* renamed from: b, reason: collision with root package name */
        public n f4475b;

        public void onConnected() {
        }

        public void onConnectionFailed() {
        }

        public void onConnectionSuspended() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final android.support.v4.media.e f4476a = new android.support.v4.media.e(this);

        public void onError(String str) {
        }

        public void onItemLoaded(MediaItem mediaItem) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class d {
        public void onError(String str, Bundle bundle) {
        }

        public void onSearchResult(String str, Bundle bundle, List<MediaItem> list) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class b {
        public void onError(String str, Bundle bundle, Bundle bundle2) {
        }

        public void onProgressUpdate(String str, Bundle bundle, Bundle bundle2) {
        }

        public void onResult(String str, Bundle bundle, Bundle bundle2) {
        }
    }
}
