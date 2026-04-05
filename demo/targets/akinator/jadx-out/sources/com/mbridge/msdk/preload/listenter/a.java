package com.mbridge.msdk.preload.listenter;

import com.mbridge.msdk.out.PreloadListener;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a implements PreloadListener {

    /* renamed from: a, reason: collision with root package name */
    WeakReference<PreloadListener> f42177a;

    /* renamed from: b, reason: collision with root package name */
    private int f42178b = 0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f42179c = false;

    public a(PreloadListener preloadListener) {
        if (preloadListener != null) {
            this.f42177a = new WeakReference<>(preloadListener);
        }
    }

    public boolean a() {
        return this.f42179c;
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public void onPreloadFaild(String str) {
        WeakReference<PreloadListener> weakReference = this.f42177a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f42177a.get().onPreloadFaild(str);
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public void onPreloadSucceed() {
        WeakReference<PreloadListener> weakReference = this.f42177a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f42177a.get().onPreloadSucceed();
    }

    public void a(boolean z10) {
        this.f42179c = z10;
    }
}
