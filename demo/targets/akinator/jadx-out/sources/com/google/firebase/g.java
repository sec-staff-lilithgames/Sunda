package com.google.firebase;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import bi.m;
import bi.n;
import bi.v;
import ci.a0;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import ek.s;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f29675k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final z.f f29676l = new z.f();

    /* renamed from: a, reason: collision with root package name */
    public final Context f29677a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29678b;

    /* renamed from: c, reason: collision with root package name */
    public final k f29679c;

    /* renamed from: d, reason: collision with root package name */
    public final n f29680d;

    /* renamed from: g, reason: collision with root package name */
    public final v f29683g;

    /* renamed from: h, reason: collision with root package name */
    public final sj.c f29684h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f29681e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f29682f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f29685i = new CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f29686j = new CopyOnWriteArrayList();

    public g(Context context, k kVar, String str) {
        this.f29677a = (Context) Preconditions.checkNotNull(context);
        this.f29678b = Preconditions.checkNotEmpty(str);
        this.f29679c = (k) Preconditions.checkNotNull(kVar);
        l startupTime = FirebaseInitProvider.getStartupTime();
        jk.b.pushTrace("Firebase");
        jk.b.pushTrace("ComponentDiscovery");
        List<sj.c> listDiscoverLazy = bi.h.forContext(context, ComponentDiscoveryService.class).discoverLazy();
        jk.b.popTrace();
        jk.b.pushTrace("Runtime");
        m processor = n.builder(a0.f12321b).addLazyComponentRegistrars(listDiscoverLazy).addComponentRegistrar(new FirebaseCommonRegistrar()).addComponentRegistrar(new ExecutorsRegistrar()).addComponent(bi.c.of(context, (Class<Context>) Context.class, (Class<? super Context>[]) new Class[0])).addComponent(bi.c.of(this, (Class<g>) g.class, (Class<? super g>[]) new Class[0])).addComponent(bi.c.of(kVar, (Class<k>) k.class, (Class<? super k>[]) new Class[0])).setProcessor(new jk.a());
        if (t3.v.isUserUnlocked(context) && FirebaseInitProvider.isCurrentlyInitializing()) {
            processor.addComponent(bi.c.of(startupTime, (Class<l>) l.class, (Class<? super l>[]) new Class[0]));
        }
        n nVarBuild = processor.build();
        this.f29680d = nVarBuild;
        jk.b.popTrace();
        this.f29683g = new v(new bi.l(1, this, context));
        this.f29684h = nVarBuild.getProvider(zi.c.class);
        addBackgroundStateChangeListener(new d(this));
        jk.b.popTrace();
    }

    public static ArrayList b() {
        ArrayList arrayList = new ArrayList();
        synchronized (f29675k) {
            try {
                Iterator it = f29676l.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(((g) it.next()).getName());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static void clearInstancesForTest() {
        synchronized (f29675k) {
            f29676l.clear();
        }
    }

    public static List<g> getApps(Context context) {
        ArrayList arrayList;
        synchronized (f29675k) {
            arrayList = new ArrayList(f29676l.values());
        }
        return arrayList;
    }

    public static g getInstance() {
        g gVar;
        synchronized (f29675k) {
            try {
                gVar = (g) f29676l.get("[DEFAULT]");
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((zi.c) gVar.f29684h.get()).registerHeartBeat();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public static g initializeApp(Context context) {
        synchronized (f29675k) {
            try {
                if (f29676l.containsKey("[DEFAULT]")) {
                    return getInstance();
                }
                k kVarFromResource = k.fromResource(context);
                if (kVarFromResource == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return initializeApp(context, kVarFromResource);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a() {
        Preconditions.checkState(!this.f29682f.get(), "FirebaseApp was deleted");
    }

    public void addBackgroundStateChangeListener(e eVar) {
        a();
        if (this.f29681e.get() && BackgroundDetector.getInstance().isInBackground()) {
            g gVar = ((d) eVar).f29673a;
        }
        this.f29685i.add(eVar);
    }

    public void addLifecycleEventListener(h hVar) {
        a();
        Preconditions.checkNotNull(hVar);
        this.f29686j.add(hVar);
    }

    public final void c() {
        Context context = this.f29677a;
        if (t3.v.isUserUnlocked(context)) {
            Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + getName());
            this.f29680d.initializeEagerComponents(isDefaultApp());
            ((zi.c) this.f29684h.get()).registerHeartBeat();
            return;
        }
        Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + getName());
        AtomicReference atomicReference = FirebaseApp$UserUnlockReceiver.f29651b;
        if (atomicReference.get() == null) {
            FirebaseApp$UserUnlockReceiver firebaseApp$UserUnlockReceiver = new FirebaseApp$UserUnlockReceiver(context);
            while (!atomicReference.compareAndSet(null, firebaseApp$UserUnlockReceiver)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            context.registerReceiver(firebaseApp$UserUnlockReceiver, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
    }

    public final void d(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f29685i.iterator();
        while (it.hasNext()) {
            ((d) ((e) it.next())).onBackgroundStateChanged(z10);
        }
    }

    public void delete() {
        if (this.f29682f.compareAndSet(false, true)) {
            synchronized (f29675k) {
                f29676l.remove(this.f29678b);
            }
            Iterator it = this.f29686j.iterator();
            while (it.hasNext()) {
                ((s) ((h) it.next())).onDeleted(this.f29678b, this.f29679c);
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f29678b.equals(((g) obj).getName());
    }

    public <T> T get(Class<T> cls) {
        a();
        return (T) this.f29680d.get(cls);
    }

    public Context getApplicationContext() {
        a();
        return this.f29677a;
    }

    public String getName() {
        a();
        return this.f29678b;
    }

    public k getOptions() {
        a();
        return this.f29679c;
    }

    public String getPersistenceKey() {
        return Base64Utils.encodeUrlSafeNoPadding(getName().getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(getOptions().getApplicationId().getBytes(Charset.defaultCharset()));
    }

    public int hashCode() {
        return this.f29678b.hashCode();
    }

    public boolean isDataCollectionDefaultEnabled() {
        a();
        return ((yj.a) this.f29683g.get()).isEnabled();
    }

    public boolean isDefaultApp() {
        return "[DEFAULT]".equals(getName());
    }

    public void removeBackgroundStateChangeListener(e eVar) {
        a();
        this.f29685i.remove(eVar);
    }

    public void removeLifecycleEventListener(h hVar) {
        a();
        Preconditions.checkNotNull(hVar);
        this.f29686j.remove(hVar);
    }

    public void setAutomaticResourceManagementEnabled(boolean z10) {
        a();
        if (this.f29681e.compareAndSet(!z10, z10)) {
            boolean zIsInBackground = BackgroundDetector.getInstance().isInBackground();
            if (z10 && zIsInBackground) {
                d(true);
            } else {
                if (z10 || !zIsInBackground) {
                    return;
                }
                d(false);
            }
        }
    }

    public void setDataCollectionDefaultEnabled(Boolean bool) {
        a();
        ((yj.a) this.f29683g.get()).setEnabled(bool);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("name", this.f29678b).add("options", this.f29679c).toString();
    }

    @Deprecated
    public void setDataCollectionDefaultEnabled(boolean z10) {
        setDataCollectionDefaultEnabled(Boolean.valueOf(z10));
    }

    public static String getPersistenceKey(String str, k kVar) {
        return Base64Utils.encodeUrlSafeNoPadding(str.getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(kVar.getApplicationId().getBytes(Charset.defaultCharset()));
    }

    public static g getInstance(String str) {
        g gVar;
        String str2;
        synchronized (f29675k) {
            try {
                gVar = (g) f29676l.get(str.trim());
                if (gVar != null) {
                    ((zi.c) gVar.f29684h.get()).registerHeartBeat();
                } else {
                    ArrayList arrayListB = b();
                    if (arrayListB.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", arrayListB);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
            } finally {
            }
        }
        return gVar;
    }

    public static g initializeApp(Context context, k kVar) {
        return initializeApp(context, kVar, "[DEFAULT]");
    }

    public static g initializeApp(Context context, k kVar, String str) {
        g gVar;
        AtomicReference atomicReference = f.f29674a;
        if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = f.f29674a;
            if (atomicReference2.get() == null) {
                f fVar = new f();
                while (true) {
                    if (atomicReference2.compareAndSet(null, fVar)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(fVar);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        String strTrim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f29675k) {
            z.f fVar2 = f29676l;
            Preconditions.checkState(!fVar2.containsKey(strTrim), "FirebaseApp name " + strTrim + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            gVar = new g(context, kVar, strTrim);
            fVar2.put(strTrim, gVar);
        }
        gVar.c();
        return gVar;
    }
}
