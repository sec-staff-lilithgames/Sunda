package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f6784b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6785c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ IBinder f6786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f6787f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h0 f6788g;

    public a0(h0 h0Var, i0 i0Var, String str, IBinder iBinder, Bundle bundle) {
        this.f6788g = h0Var;
        this.f6784b = i0Var;
        this.f6785c = str;
        this.f6786e = iBinder;
        this.f6787f = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        IBinder iBinderAsBinder = ((j0) this.f6784b).asBinder();
        h0 h0Var = this.f6788g;
        k kVar = (k) h0Var.f6827a.f6775f.get(iBinderAsBinder);
        String str = this.f6785c;
        if (kVar == null) {
            Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + str);
            return;
        }
        HashMap map = kVar.f6837g;
        MediaBrowserServiceCompat mediaBrowserServiceCompat = h0Var.f6827a;
        mediaBrowserServiceCompat.getClass();
        List arrayList = (List) map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            IBinder iBinder = this.f6786e;
            Bundle bundle = this.f6787f;
            if (!zHasNext) {
                arrayList.add(new w3.e(iBinder, bundle));
                map.put(str, arrayList);
                mediaBrowserServiceCompat.b(str, kVar, bundle, null);
                mediaBrowserServiceCompat.f6776g = kVar;
                mediaBrowserServiceCompat.onSubscribe(str, bundle);
                mediaBrowserServiceCompat.f6776g = null;
                return;
            }
            w3.e eVar = (w3.e) it.next();
            if (iBinder == eVar.f90368a && e.areSameOptions(bundle, (Bundle) eVar.f90369b)) {
                return;
            }
        }
    }
}
