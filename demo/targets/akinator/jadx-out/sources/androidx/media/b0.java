package androidx.media;

import android.os.IBinder;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f6790b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6791c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ IBinder f6792e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h0 f6793f;

    public b0(h0 h0Var, i0 i0Var, String str, IBinder iBinder) {
        this.f6793f = h0Var;
        this.f6790b = i0Var;
        this.f6791c = str;
        this.f6792e = iBinder;
    }

    @Override // java.lang.Runnable
    public void run() {
        IBinder iBinderAsBinder = ((j0) this.f6790b).asBinder();
        h0 h0Var = this.f6793f;
        k kVar = (k) h0Var.f6827a.f6775f.get(iBinderAsBinder);
        String str = this.f6791c;
        if (kVar == null) {
            Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + str);
            return;
        }
        HashMap map = kVar.f6837g;
        MediaBrowserServiceCompat mediaBrowserServiceCompat = h0Var.f6827a;
        mediaBrowserServiceCompat.getClass();
        IBinder iBinder = this.f6792e;
        boolean z10 = false;
        try {
            if (iBinder != null) {
                List list = (List) map.get(str);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (iBinder == ((w3.e) it.next()).f90368a) {
                            it.remove();
                            z10 = true;
                        }
                    }
                    if (list.size() == 0) {
                        map.remove(str);
                    }
                }
            } else if (map.remove(str) != null) {
                z10 = true;
            }
            if (z10) {
                return;
            }
            Log.w("MBServiceCompat", "removeSubscription called for " + str + " which is not subscribed");
        } finally {
            mediaBrowserServiceCompat.f6776g = kVar;
            mediaBrowserServiceCompat.onUnsubscribe(str);
            mediaBrowserServiceCompat.f6776g = null;
        }
    }
}
