package com.google.android.gms.common.api.internal;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zaa extends LifecycleCallback {
    private List zaa;

    private zaa(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.zaa = new ArrayList();
        this.mLifecycleFragment.addCallback("LifecycleObserverOnStop", this);
    }

    public static /* bridge */ /* synthetic */ zaa zaa(Activity activity) {
        zaa zaaVar;
        synchronized (activity) {
            try {
                LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
                zaaVar = (zaa) fragment.getCallbackOrNull("LifecycleObserverOnStop", zaa.class);
                if (zaaVar == null) {
                    zaaVar = new zaa(fragment);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zaaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zac(Runnable runnable) {
        this.zaa.add(runnable);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        List list;
        synchronized (this) {
            list = this.zaa;
            this.zaa = new ArrayList();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }
}
