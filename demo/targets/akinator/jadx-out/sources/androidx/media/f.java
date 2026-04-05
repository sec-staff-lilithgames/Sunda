package androidx.media;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.util.Log;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f extends w {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f6810f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f6811g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Bundle f6812h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Bundle f6813i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat f6814j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(MediaBrowserServiceCompat mediaBrowserServiceCompat, String str, k kVar, String str2, Bundle bundle, Bundle bundle2) {
        super(str);
        this.f6814j = mediaBrowserServiceCompat;
        this.f6810f = kVar;
        this.f6811g = str2;
        this.f6812h = bundle;
        this.f6813i = bundle2;
    }

    @Override // androidx.media.w
    public final void d(Object obj) {
        List<MediaBrowserCompat.MediaItem> listA = (List) obj;
        z.f fVar = this.f6814j.f6775f;
        k kVar = this.f6810f;
        i0 i0Var = kVar.f6836f;
        String str = kVar.f6831a;
        Object obj2 = fVar.get(((j0) i0Var).asBinder());
        String str2 = this.f6811g;
        if (obj2 != kVar) {
            if (MediaBrowserServiceCompat.f6771j) {
                Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + str + " id=" + str2);
                return;
            }
            return;
        }
        int i10 = this.f6877e & 1;
        Bundle bundle = this.f6812h;
        if (i10 != 0) {
            listA = MediaBrowserServiceCompat.a(listA, bundle);
        }
        try {
            ((j0) kVar.f6836f).onLoadChildren(str2, listA, bundle, this.f6813i);
        } catch (RemoteException unused) {
            Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + str2 + " package=" + str);
        }
    }
}
