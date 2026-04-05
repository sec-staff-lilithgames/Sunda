package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class s extends MediaBrowser.SubscriptionCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserCompat.g f4542a;

    public s(MediaBrowserCompat.g gVar) {
        this.f4542a = gVar;
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
        List<MediaBrowserCompat.MediaItem> listSubList;
        MediaBrowserCompat.g gVar = this.f4542a;
        WeakReference weakReference = gVar.f4483c;
        MediaBrowserCompat.f fVar = weakReference == null ? null : (MediaBrowserCompat.f) weakReference.get();
        if (fVar == null) {
            gVar.onChildrenLoaded(str, MediaBrowserCompat.MediaItem.fromMediaItemList(list));
            return;
        }
        List<MediaBrowserCompat.MediaItem> listFromMediaItemList = MediaBrowserCompat.MediaItem.fromMediaItemList(list);
        List<MediaBrowserCompat.g> callbacks = fVar.getCallbacks();
        List<Bundle> optionsList = fVar.getOptionsList();
        for (int i10 = 0; i10 < callbacks.size(); i10++) {
            Bundle bundle = optionsList.get(i10);
            if (bundle == null) {
                gVar.onChildrenLoaded(str, listFromMediaItemList);
            } else {
                if (listFromMediaItemList == null) {
                    listSubList = null;
                } else {
                    int i11 = bundle.getInt("android.media.browse.extra.PAGE", -1);
                    int i12 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                    if (i11 == -1 && i12 == -1) {
                        listSubList = listFromMediaItemList;
                    } else {
                        int i13 = i12 * i11;
                        int size = i13 + i12;
                        if (i11 < 0 || i12 < 1 || i13 >= listFromMediaItemList.size()) {
                            listSubList = Collections.EMPTY_LIST;
                        } else {
                            if (size > listFromMediaItemList.size()) {
                                size = listFromMediaItemList.size();
                            }
                            listSubList = listFromMediaItemList.subList(i13, size);
                        }
                    }
                }
                gVar.onChildrenLoaded(str, listSubList, bundle);
            }
        }
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public void onError(String str) {
        this.f4542a.onError(str);
    }
}
