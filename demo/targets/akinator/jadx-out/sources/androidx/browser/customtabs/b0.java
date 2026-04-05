package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b0 extends b.j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CustomTabsService f5203b;

    public b0(CustomTabsService customTabsService) {
        this.f5203b = customTabsService;
    }

    public static PendingIntent a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
        bundle.remove("android.support.customtabs.extra.SESSION_ID");
        return pendingIntent;
    }

    public final boolean b(b.h hVar, PendingIntent pendingIntent) {
        n0 n0Var = new n0(hVar, pendingIntent);
        try {
            a0 a0Var = new a0(this, n0Var, 0);
            synchronized (this.f5203b.mDeathRecipientMap) {
                hVar.asBinder().linkToDeath(a0Var, 0);
                this.f5203b.mDeathRecipientMap.put(hVar.asBinder(), a0Var);
            }
            return this.f5203b.newSession(n0Var);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // b.j, b.l
    public Bundle extraCommand(String str, Bundle bundle) {
        return this.f5203b.extraCommand(str, bundle);
    }

    @Override // b.j, b.l
    public boolean isEngagementSignalsApiAvailable(b.h hVar, Bundle bundle) {
        return this.f5203b.isEngagementSignalsApiAvailable(new n0(hVar, a(bundle)), bundle);
    }

    @Override // b.j, b.l
    public boolean mayLaunchUrl(b.h hVar, Uri uri, Bundle bundle, List<Bundle> list) {
        return this.f5203b.mayLaunchUrl(new n0(hVar, a(bundle)), uri, bundle, list);
    }

    @Override // b.j, b.l
    public boolean newAuthTabSession(b.d dVar, Bundle bundle) {
        u.d dVar2 = new u.d(dVar, a(bundle));
        try {
            a0 a0Var = new a0(this, dVar2, 1);
            synchronized (this.f5203b.mDeathRecipientMap) {
                dVar.asBinder().linkToDeath(a0Var, 0);
                this.f5203b.mDeathRecipientMap.put(dVar.asBinder(), a0Var);
            }
            return this.f5203b.registerAuthTabSession(dVar2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // b.j, b.l
    public boolean newSession(b.h hVar) {
        return b(hVar, null);
    }

    @Override // b.j, b.l
    public boolean newSessionWithExtras(b.h hVar, Bundle bundle) {
        return b(hVar, a(bundle));
    }

    @Override // b.j, b.l
    public int postMessage(b.h hVar, String str, Bundle bundle) {
        return this.f5203b.postMessage(new n0(hVar, a(bundle)), str, bundle);
    }

    @Override // b.j, b.l
    public void prefetch(b.h hVar, Uri uri, Bundle bundle) {
        n0 n0Var = new n0(hVar, a(bundle));
        Object[] objArr = {uri};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        this.f5203b.prefetch(n0Var, Collections.unmodifiableList(arrayList), r0.a(bundle));
    }

    @Override // b.j, b.l
    public void prefetchWithMultipleUrls(b.h hVar, List<Uri> list, Bundle bundle) {
        this.f5203b.prefetch(new n0(hVar, a(bundle)), list, r0.a(bundle));
    }

    @Override // b.j, b.l
    public boolean receiveFile(b.h hVar, Uri uri, int i10, Bundle bundle) {
        return this.f5203b.receiveFile(new n0(hVar, a(bundle)), uri, i10, bundle);
    }

    @Override // b.j, b.l
    public boolean requestPostMessageChannel(b.h hVar, Uri uri) {
        return this.f5203b.requestPostMessageChannel(new n0(hVar, null), uri, null, new Bundle());
    }

    @Override // b.j, b.l
    public boolean requestPostMessageChannelWithExtras(b.h hVar, Uri uri, Bundle bundle) {
        return this.f5203b.requestPostMessageChannel(new n0(hVar, a(bundle)), uri, bundle == null ? null : Build.VERSION.SDK_INT >= 33 ? (Uri) a.b(bundle, "target_origin") : (Uri) bundle.getParcelable("target_origin"), bundle);
    }

    @Override // b.j, b.l
    public boolean setEngagementSignalsCallback(b.h hVar, IBinder iBinder, Bundle bundle) {
        p0 p0Var = new p0(b.n.asInterface(iBinder));
        return this.f5203b.setEngagementSignalsCallback(new n0(hVar, a(bundle)), p0Var, bundle);
    }

    @Override // b.j, b.l
    public boolean updateVisuals(b.h hVar, Bundle bundle) {
        return this.f5203b.updateVisuals(new n0(hVar, a(bundle)), bundle);
    }

    @Override // b.j, b.l
    public boolean validateRelationship(b.h hVar, int i10, Uri uri, Bundle bundle) {
        return this.f5203b.validateRelationship(new n0(hVar, a(bundle)), i10, uri, bundle);
    }

    @Override // b.j, b.l
    public boolean warmup(long j10) {
        return this.f5203b.warmup(j10);
    }
}
