package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import com.bumptech.glide.manager.e0;
import com.bumptech.glide.manager.w;
import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p8.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class u implements ComponentCallbacks2, com.bumptech.glide.manager.o, k {

    /* renamed from: o, reason: collision with root package name */
    public static final f9.i f16667o = (f9.i) f9.i.decodeTypeOf(Bitmap.class).lock();

    /* renamed from: p, reason: collision with root package name */
    public static final f9.i f16668p = (f9.i) f9.i.decodeTypeOf(b9.d.class).lock();

    /* renamed from: q, reason: collision with root package name */
    public static final f9.i f16669q = (f9.i) ((f9.i) f9.i.diskCacheStrategyOf(z.f80913b).priority(l.f16580f)).skipMemoryCache(true);

    /* renamed from: b, reason: collision with root package name */
    public final c f16670b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f16671c;

    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.manager.m f16672e;

    /* renamed from: f, reason: collision with root package name */
    public final w f16673f;

    /* renamed from: g, reason: collision with root package name */
    public final com.bumptech.glide.manager.v f16674g;

    /* renamed from: h, reason: collision with root package name */
    public final e0 f16675h;

    /* renamed from: i, reason: collision with root package name */
    public final r f16676i;

    /* renamed from: j, reason: collision with root package name */
    public final com.bumptech.glide.manager.c f16677j;

    /* renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArrayList f16678k;

    /* renamed from: l, reason: collision with root package name */
    public f9.i f16679l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16680m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f16681n;

    public u(c cVar, com.bumptech.glide.manager.m mVar, com.bumptech.glide.manager.v vVar, Context context) {
        w wVar = new w();
        com.bumptech.glide.manager.d dVar = cVar.f16540i;
        this.f16675h = new e0();
        r rVar = new r(this);
        this.f16676i = rVar;
        this.f16670b = cVar;
        this.f16672e = mVar;
        this.f16674g = vVar;
        this.f16673f = wVar;
        this.f16671c = context;
        com.bumptech.glide.manager.c cVarBuild = dVar.build(context.getApplicationContext(), new t(this, wVar));
        this.f16677j = cVarBuild;
        synchronized (cVar.f16541j) {
            if (cVar.f16541j.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            cVar.f16541j.add(this);
        }
        if (j9.s.isOnBackgroundThread()) {
            j9.s.postOnUiThread(rVar);
        } else {
            mVar.addListener(this);
        }
        mVar.addListener(cVarBuild);
        this.f16678k = new CopyOnWriteArrayList(cVar.f16537f.getDefaultRequestListeners());
        b(cVar.f16537f.getDefaultRequestOptions());
    }

    public final synchronized void a() {
        try {
            Iterator<g9.n> it = this.f16675h.getAll().iterator();
            while (it.hasNext()) {
                clear(it.next());
            }
            this.f16675h.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public u addDefaultRequestListener(f9.h hVar) {
        this.f16678k.add(hVar);
        return this;
    }

    public synchronized u applyDefaultRequestOptions(f9.i iVar) {
        synchronized (this) {
            this.f16679l = (f9.i) this.f16679l.apply(iVar);
        }
        return this;
        return this;
    }

    public <ResourceType> q as(Class<ResourceType> cls) {
        return new q(this.f16670b, this, cls, this.f16671c);
    }

    public q asBitmap() {
        return as(Bitmap.class).apply((f9.a) f16667o);
    }

    public q asDrawable() {
        return as(Drawable.class);
    }

    public q asFile() {
        return as(File.class).apply((f9.a) f9.i.skipMemoryCacheOf(true));
    }

    public q asGif() {
        return as(b9.d.class).apply((f9.a) f16668p);
    }

    public final synchronized void b(f9.i iVar) {
        this.f16679l = (f9.i) ((f9.i) iVar.mo370clone()).autoClone();
    }

    public final synchronized boolean c(g9.n nVar) {
        f9.e request = nVar.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.f16673f.clearAndRemove(request)) {
            return false;
        }
        this.f16675h.untrack(nVar);
        nVar.setRequest(null);
        return true;
    }

    public void clear(View view) {
        clear(new s(view));
    }

    public synchronized u clearOnStop() {
        this.f16681n = true;
        return this;
    }

    public q download(Object obj) {
        return downloadOnly().load(obj);
    }

    public q downloadOnly() {
        return as(File.class).apply((f9.a) f16669q);
    }

    public synchronized boolean isPaused() {
        return this.f16673f.isPaused();
    }

    @Override // com.bumptech.glide.manager.o
    public synchronized void onDestroy() {
        this.f16675h.onDestroy();
        a();
        this.f16673f.clearRequests();
        this.f16672e.removeListener(this);
        this.f16672e.removeListener(this.f16677j);
        j9.s.removeCallbacksOnUiThread(this.f16676i);
        c cVar = this.f16670b;
        synchronized (cVar.f16541j) {
            if (!cVar.f16541j.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            cVar.f16541j.remove(this);
        }
    }

    @Override // com.bumptech.glide.manager.o
    public synchronized void onStart() {
        resumeRequests();
        this.f16675h.onStart();
    }

    @Override // com.bumptech.glide.manager.o
    public synchronized void onStop() {
        try {
            this.f16675h.onStop();
            if (this.f16681n) {
                a();
            } else {
                pauseRequests();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (i10 == 60 && this.f16680m) {
            pauseAllRequestsRecursive();
        }
    }

    public synchronized void pauseAllRequests() {
        this.f16673f.pauseAllRequests();
    }

    public synchronized void pauseAllRequestsRecursive() {
        pauseAllRequests();
        Iterator<u> it = this.f16674g.getDescendants().iterator();
        while (it.hasNext()) {
            it.next().pauseAllRequests();
        }
    }

    public synchronized void pauseRequests() {
        this.f16673f.pauseRequests();
    }

    public synchronized void pauseRequestsRecursive() {
        pauseRequests();
        Iterator<u> it = this.f16674g.getDescendants().iterator();
        while (it.hasNext()) {
            it.next().pauseRequests();
        }
    }

    public synchronized void resumeRequests() {
        this.f16673f.resumeRequests();
    }

    public synchronized void resumeRequestsRecursive() {
        j9.s.assertMainThread();
        resumeRequests();
        Iterator<u> it = this.f16674g.getDescendants().iterator();
        while (it.hasNext()) {
            it.next().resumeRequests();
        }
    }

    public synchronized u setDefaultRequestOptions(f9.i iVar) {
        b(iVar);
        return this;
    }

    public void setPauseAllRequestsOnTrimMemoryModerate(boolean z10) {
        this.f16680m = z10;
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f16673f + ", treeNode=" + this.f16674g + "}";
    }

    public void clear(g9.n nVar) {
        if (nVar == null) {
            return;
        }
        boolean zC = c(nVar);
        f9.e request = nVar.getRequest();
        if (zC) {
            return;
        }
        c cVar = this.f16670b;
        synchronized (cVar.f16541j) {
            try {
                Iterator it = cVar.f16541j.iterator();
                while (it.hasNext()) {
                    if (((u) it.next()).c(nVar)) {
                        return;
                    }
                }
                if (request != null) {
                    nVar.setRequest(null);
                    request.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.k
    public q load(Bitmap bitmap) {
        return asDrawable().load(bitmap);
    }

    @Override // com.bumptech.glide.k
    public q load(Drawable drawable) {
        return asDrawable().load(drawable);
    }

    @Override // com.bumptech.glide.k
    public q load(String str) {
        return asDrawable().load(str);
    }

    @Override // com.bumptech.glide.k
    public q load(Uri uri) {
        return asDrawable().load(uri);
    }

    @Override // com.bumptech.glide.k
    public q load(File file) {
        return asDrawable().load(file);
    }

    @Override // com.bumptech.glide.k
    public q load(Integer num) {
        return asDrawable().load(num);
    }

    @Override // com.bumptech.glide.k
    @Deprecated
    public q load(URL url) {
        return asDrawable().load(url);
    }

    @Override // com.bumptech.glide.k
    public q load(byte[] bArr) {
        return asDrawable().load(bArr);
    }

    @Override // com.bumptech.glide.k
    public q load(Object obj) {
        return asDrawable().load(obj);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }
}
