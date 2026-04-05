package com.bumptech.glide;

import android.os.Build;
import androidx.recyclerview.widget.l1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p8.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public e0 f16548c;

    /* renamed from: d, reason: collision with root package name */
    public q8.d f16549d;

    /* renamed from: e, reason: collision with root package name */
    public q8.b f16550e;

    /* renamed from: f, reason: collision with root package name */
    public r8.o f16551f;

    /* renamed from: g, reason: collision with root package name */
    public s8.h f16552g;

    /* renamed from: h, reason: collision with root package name */
    public s8.h f16553h;

    /* renamed from: i, reason: collision with root package name */
    public r8.a f16554i;

    /* renamed from: j, reason: collision with root package name */
    public r8.s f16555j;

    /* renamed from: k, reason: collision with root package name */
    public com.bumptech.glide.manager.d f16556k;

    /* renamed from: n, reason: collision with root package name */
    public s8.h f16559n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f16560o;

    /* renamed from: p, reason: collision with root package name */
    public List f16561p;

    /* renamed from: a, reason: collision with root package name */
    public final z.f f16546a = new z.f();

    /* renamed from: b, reason: collision with root package name */
    public final l1 f16547b = new l1(3);

    /* renamed from: l, reason: collision with root package name */
    public int f16557l = 4;

    /* renamed from: m, reason: collision with root package name */
    public b f16558m = new d();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
    }

    public g addGlobalRequestListener(f9.h hVar) {
        if (this.f16561p == null) {
            this.f16561p = new ArrayList();
        }
        this.f16561p.add(hVar);
        return this;
    }

    public g setAnimationExecutor(s8.h hVar) {
        this.f16559n = hVar;
        return this;
    }

    public g setArrayPool(q8.b bVar) {
        this.f16550e = bVar;
        return this;
    }

    public g setBitmapPool(q8.d dVar) {
        this.f16549d = dVar;
        return this;
    }

    public g setConnectivityMonitorFactory(com.bumptech.glide.manager.d dVar) {
        this.f16556k = dVar;
        return this;
    }

    public g setDefaultRequestOptions(f9.i iVar) {
        return setDefaultRequestOptions(new e(iVar));
    }

    public <T> g setDefaultTransitionOptions(Class<T> cls, v vVar) {
        this.f16546a.put(cls, vVar);
        return this;
    }

    public g setDiskCache(r8.a aVar) {
        this.f16554i = aVar;
        return this;
    }

    public g setDiskCacheExecutor(s8.h hVar) {
        this.f16553h = hVar;
        return this;
    }

    public g setImageDecoderEnabledForBitmaps(boolean z10) {
        f fVar = new f();
        boolean z11 = z10 && Build.VERSION.SDK_INT >= 29;
        HashMap map = (HashMap) this.f16547b.f7184a;
        if (z11) {
            map.put(f.class, fVar);
            return this;
        }
        map.remove(f.class);
        return this;
    }

    public g setIsActiveResourceRetentionAllowed(boolean z10) {
        this.f16560o = z10;
        return this;
    }

    public g setLogLevel(int i10) {
        if (i10 < 2 || i10 > 6) {
            throw new IllegalArgumentException("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
        }
        this.f16557l = i10;
        return this;
    }

    public g setLogRequestOrigins(boolean z10) {
        a aVar = new a();
        HashMap map = (HashMap) this.f16547b.f7184a;
        if (z10) {
            map.put(a.class, aVar);
            return this;
        }
        map.remove(a.class);
        return this;
    }

    public g setMemoryCache(r8.o oVar) {
        this.f16551f = oVar;
        return this;
    }

    public g setMemorySizeCalculator(r8.p pVar) {
        return setMemorySizeCalculator(pVar.build());
    }

    @Deprecated
    public g setResizeExecutor(s8.h hVar) {
        return setSourceExecutor(hVar);
    }

    public g setSourceExecutor(s8.h hVar) {
        this.f16552g = hVar;
        return this;
    }

    public g setDefaultRequestOptions(b bVar) {
        this.f16558m = (b) j9.q.checkNotNull(bVar);
        return this;
    }

    public g setMemorySizeCalculator(r8.s sVar) {
        this.f16555j = sVar;
        return this;
    }

    @Deprecated
    public g setDisableHardwareBitmapsOnO(boolean z10) {
        return this;
    }
}
