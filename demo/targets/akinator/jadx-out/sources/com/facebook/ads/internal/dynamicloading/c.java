package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f22991b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f22992c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MultithreadedBundleWrapper f22993e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AudienceNetworkAds.InitListener f22994f;

    public c(Context context, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, boolean z10) {
        this.f22991b = context;
        this.f22992c = z10;
        this.f22993e = multithreadedBundleWrapper;
        this.f22994f = initListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        Throwable th2;
        DynamicLoader dynamicLoader;
        int i10;
        ANActivityLifecycleCallbacksListener.registerActivityCallbacks(this.f22991b);
        synchronized (DynamicLoaderFactory.class) {
            DynamicLoader dynamicLoaderDoMakeLoader = null;
            th2 = null;
            int i11 = 0;
            while (i11 < 3) {
                try {
                    dynamicLoaderDoMakeLoader = DynamicLoaderFactory.doMakeLoader(this.f22991b, false);
                    break;
                } finally {
                    if (i11 == i10) {
                        try {
                        } catch (Throwable th3) {
                        }
                    }
                }
            }
            dynamicLoader = dynamicLoaderDoMakeLoader;
        }
        DynamicLoaderFactory.doCallInitialize(this.f22991b, dynamicLoader, th2, this.f22992c, this.f22993e, this.f22994f);
        DynamicLoaderFactory.sInitializing.set(false);
    }
}
