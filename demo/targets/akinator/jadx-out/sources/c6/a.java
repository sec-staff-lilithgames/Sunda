package c6;

import android.content.Context;
import android.os.Bundle;
import com.digidust.elokence.akinator.freemium.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f11813d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f11814e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f11817c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f11816b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11815a = new HashMap();

    public a(Context context) {
        this.f11817c = context.getApplicationContext();
    }

    public static a getInstance(Context context) {
        if (f11813d == null) {
            synchronized (f11814e) {
                try {
                    if (f11813d == null) {
                        f11813d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f11813d;
    }

    public final void a(Bundle bundle) throws ClassNotFoundException {
        HashSet hashSet;
        String string = this.f11817c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f11816b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e10) {
                throw new c(e10);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objCreate;
        HashMap map = this.f11815a;
        if (d6.a.isEnabled()) {
            try {
                d6.a.beginSection(cls.getSimpleName());
            } catch (Throwable th2) {
                d6.a.endSection();
                throw th2;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objCreate = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class<? extends b>> listDependencies = bVar.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class<? extends b> cls2 : listDependencies) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objCreate = bVar.create(this.f11817c);
                hashSet.remove(cls);
                map.put(cls, objCreate);
            } catch (Throwable th3) {
                throw new c(th3);
            }
        }
        d6.a.endSection();
        return objCreate;
    }

    public <T> T initializeComponent(Class<? extends b> cls) {
        T t10;
        synchronized (f11814e) {
            try {
                t10 = (T) this.f11815a.get(cls);
                if (t10 == null) {
                    t10 = (T) b(cls, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }

    public boolean isEagerlyInitialized(Class<? extends b> cls) {
        return this.f11816b.contains(cls);
    }
}
