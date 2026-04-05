package com.bumptech.glide;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.l1;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p8.e0;
import x8.a0;
import x8.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c implements ComponentCallbacks2 {

    /* renamed from: n, reason: collision with root package name */
    public static volatile c f16532n;

    /* renamed from: o, reason: collision with root package name */
    public static volatile boolean f16533o;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f16534b;

    /* renamed from: c, reason: collision with root package name */
    public final q8.d f16535c;

    /* renamed from: e, reason: collision with root package name */
    public final r8.o f16536e;

    /* renamed from: f, reason: collision with root package name */
    public final h f16537f;

    /* renamed from: g, reason: collision with root package name */
    public final q8.b f16538g;

    /* renamed from: h, reason: collision with root package name */
    public final com.bumptech.glide.manager.u f16539h;

    /* renamed from: i, reason: collision with root package name */
    public final com.bumptech.glide.manager.d f16540i;

    /* renamed from: k, reason: collision with root package name */
    public final b f16542k;

    /* renamed from: m, reason: collision with root package name */
    public t8.c f16544m;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f16541j = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public j f16543l = j.NORMAL;

    public c(Context context, e0 e0Var, r8.o oVar, q8.d dVar, q8.b bVar, com.bumptech.glide.manager.u uVar, com.bumptech.glide.manager.d dVar2, int i10, b bVar2, z.f fVar, List list, List list2, d9.a aVar, i iVar) {
        this.f16534b = e0Var;
        this.f16535c = dVar;
        this.f16538g = bVar;
        this.f16536e = oVar;
        this.f16539h = uVar;
        this.f16540i = dVar2;
        this.f16542k = bVar2;
        this.f16537f = new h(context, bVar, new n(this, list2, aVar), new g9.j(), bVar2, fVar, list, e0Var, iVar, i10);
    }

    public static GeneratedAppGlideModule a(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
        } catch (InstantiationException e11) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
        } catch (NoSuchMethodException e12) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e12);
        } catch (InvocationTargetException e13) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e13);
        }
    }

    public static void b(Context context, g gVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<Object> list = Collections.EMPTY_LIST;
        List<Object> list2 = (generatedAppGlideModule == null || generatedAppGlideModule.isManifestParsingEnabled()) ? new d9.d(applicationContext).parse() : list;
        if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
            new HashSet();
            Iterator<Object> it = list2.iterator();
            if (it.hasNext()) {
                throw a.b.c(it);
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<Object> it2 = list2.iterator();
            if (it2.hasNext()) {
                throw a.b.c(it2);
            }
        }
        gVar.getClass();
        Iterator<Object> it3 = list2.iterator();
        if (it3.hasNext()) {
            throw a.b.c(it3);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.applyOptions(applicationContext, gVar);
        }
        if (gVar.f16552g == null) {
            gVar.f16552g = s8.h.newSourceExecutor();
        }
        if (gVar.f16553h == null) {
            gVar.f16553h = s8.h.newDiskCacheExecutor();
        }
        if (gVar.f16559n == null) {
            gVar.f16559n = s8.h.newAnimationExecutor();
        }
        if (gVar.f16555j == null) {
            gVar.f16555j = new r8.p(applicationContext).build();
        }
        if (gVar.f16556k == null) {
            gVar.f16556k = new com.bumptech.glide.manager.f();
        }
        if (gVar.f16549d == null) {
            int bitmapPoolSize = gVar.f16555j.getBitmapPoolSize();
            if (bitmapPoolSize > 0) {
                gVar.f16549d = new q8.o(bitmapPoolSize);
            } else {
                gVar.f16549d = new q8.e();
            }
        }
        if (gVar.f16550e == null) {
            gVar.f16550e = new q8.l(gVar.f16555j.getArrayPoolSizeInBytes());
        }
        if (gVar.f16551f == null) {
            gVar.f16551f = new r8.m(gVar.f16555j.getMemoryCacheSize());
        }
        if (gVar.f16554i == null) {
            gVar.f16554i = new r8.l(applicationContext);
        }
        if (gVar.f16548c == null) {
            gVar.f16548c = new e0(gVar.f16551f, gVar.f16554i, gVar.f16553h, gVar.f16552g, s8.h.newUnlimitedSourceExecutor(), gVar.f16559n, gVar.f16560o);
        }
        List list3 = gVar.f16561p;
        if (list3 == null) {
            gVar.f16561p = list;
        } else {
            gVar.f16561p = Collections.unmodifiableList(list3);
        }
        l1 l1Var = gVar.f16547b;
        l1Var.getClass();
        c cVar = new c(applicationContext, gVar.f16548c, gVar.f16551f, gVar.f16549d, gVar.f16550e, new com.bumptech.glide.manager.u(null), gVar.f16556k, gVar.f16557l, gVar.f16558m, gVar.f16546a, gVar.f16561p, list2, generatedAppGlideModule, new i(l1Var));
        applicationContext.registerComponentCallbacks(cVar);
        f16532n = cVar;
    }

    public static void enableHardwareBitmaps() {
        g0.getInstance().unblockHardwareBitmaps();
    }

    public static c get(Context context) {
        if (f16532n == null) {
            GeneratedAppGlideModule generatedAppGlideModuleA = a(context.getApplicationContext());
            synchronized (c.class) {
                if (f16532n == null) {
                    if (f16533o) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f16533o = true;
                    try {
                        b(context, new g(), generatedAppGlideModuleA);
                        f16533o = false;
                    } catch (Throwable th2) {
                        f16533o = false;
                        throw th2;
                    }
                }
            }
        }
        return f16532n;
    }

    public static File getPhotoCacheDir(Context context) {
        return getPhotoCacheDir(context, "image_manager_disk_cache");
    }

    @Deprecated
    public static synchronized void init(c cVar) {
        try {
            if (f16532n != null) {
                tearDown();
            }
            f16532n = cVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized boolean isInitialized() {
        return f16532n != null;
    }

    public static void tearDown() {
        synchronized (c.class) {
            try {
                if (f16532n != null) {
                    f16532n.getContext().getApplicationContext().unregisterComponentCallbacks(f16532n);
                    f16532n.f16534b.shutdown();
                }
                f16532n = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static u with(Context context) {
        j9.q.checkNotNull(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return get(context).getRequestManagerRetriever().get(context);
    }

    public void clearDiskCache() {
        j9.s.assertBackgroundThread();
        this.f16534b.clearDiskCache();
    }

    public void clearMemory() {
        j9.s.assertMainThread();
        this.f16536e.clearMemory();
        this.f16535c.clearMemory();
        this.f16538g.clearMemory();
    }

    public q8.b getArrayPool() {
        return this.f16538g;
    }

    public q8.d getBitmapPool() {
        return this.f16535c;
    }

    public Context getContext() {
        return this.f16537f.getBaseContext();
    }

    public m getRegistry() {
        return this.f16537f.getRegistry();
    }

    public com.bumptech.glide.manager.u getRequestManagerRetriever() {
        return this.f16539h;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        clearMemory();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        trimMemory(i10);
    }

    public synchronized void preFillBitmapPool(t8.e... eVarArr) {
        try {
            if (this.f16544m == null) {
                this.f16544m = new t8.c(this.f16536e, this.f16535c, (n8.b) this.f16542k.build().getOptions().get(a0.f91793f));
            }
            this.f16544m.preFill(eVarArr);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public j setMemoryCategory(j jVar) {
        j9.s.assertMainThread();
        this.f16536e.setSizeMultiplier(jVar.getMultiplier());
        this.f16535c.setSizeMultiplier(jVar.getMultiplier());
        j jVar2 = this.f16543l;
        this.f16543l = jVar;
        return jVar2;
    }

    public void trimMemory(int i10) {
        j9.s.assertMainThread();
        synchronized (this.f16541j) {
            try {
                Iterator it = this.f16541j.iterator();
                while (it.hasNext()) {
                    ((u) it.next()).onTrimMemory(i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f16536e.trimMemory(i10);
        this.f16535c.trimMemory(i10);
        this.f16538g.trimMemory(i10);
    }

    public static File getPhotoCacheDir(Context context, String str) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            if (Log.isLoggable("Glide", 6)) {
                Log.e("Glide", "default disk cache dir is null");
            }
            return null;
        }
        File file = new File(cacheDir, str);
        if (file.isDirectory() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static u with(FragmentActivity fragmentActivity) {
        j9.q.checkNotNull(fragmentActivity, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return get(fragmentActivity).getRequestManagerRetriever().get(fragmentActivity);
    }

    public static void init(Context context, g gVar) {
        GeneratedAppGlideModule generatedAppGlideModuleA = a(context);
        synchronized (c.class) {
            try {
                if (f16532n != null) {
                    tearDown();
                }
                b(context, gVar, generatedAppGlideModuleA);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Deprecated
    public static u with(Activity activity) {
        return with(activity.getApplicationContext());
    }

    public static u with(Fragment fragment) {
        Context context = fragment.getContext();
        j9.q.checkNotNull(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return get(context).getRequestManagerRetriever().get(fragment);
    }

    @Deprecated
    public static u with(android.app.Fragment fragment) {
        Activity activity = fragment.getActivity();
        j9.q.checkNotNull(activity, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return with(activity.getApplicationContext());
    }

    public static u with(View view) {
        Context context = view.getContext();
        j9.q.checkNotNull(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return get(context).getRequestManagerRetriever().get(view);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }
}
