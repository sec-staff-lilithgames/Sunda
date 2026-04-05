package wr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import wr.p4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class w4 {

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f91168e = Logger.getLogger(w4.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static w4 f91169f;

    /* renamed from: a, reason: collision with root package name */
    public final u4 f91170a = new u4(this);

    /* renamed from: b, reason: collision with root package name */
    public String f91171b = "unknown";

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f91172c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public nh.m5 f91173d = nh.m5.of();

    public static synchronized w4 getDefaultRegistry() {
        try {
            if (f91169f == null) {
                ArrayList arrayList = new ArrayList();
                try {
                    boolean z10 = xr.e4.f92460a;
                    arrayList.add(xr.e4.class);
                } catch (ClassNotFoundException e10) {
                    f91168e.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e10);
                }
                List<t4> listLoadAll = i6.loadAll(t4.class, Collections.unmodifiableList(arrayList), t4.class.getClassLoader(), new v4());
                if (listLoadAll.isEmpty()) {
                    f91168e.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                f91169f = new w4();
                for (t4 t4Var : listLoadAll) {
                    f91168e.fine("Service loader found " + t4Var);
                    f91169f.a(t4Var);
                }
                f91169f.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f91169f;
    }

    public final synchronized void a(t4 t4Var) {
        t4Var.getClass();
        mh.p1.checkArgument(true, "isAvailable() returned false");
        this.f91172c.add(t4Var);
    }

    public p4.a asFactory() {
        return this.f91170a;
    }

    public final synchronized void b() {
        try {
            HashMap map = new HashMap();
            String defaultScheme = "unknown";
            Iterator it = this.f91172c.iterator();
            int iPriority = Integer.MIN_VALUE;
            while (it.hasNext()) {
                t4 t4Var = (t4) it.next();
                String defaultScheme2 = t4Var.getDefaultScheme();
                t4 t4Var2 = (t4) map.get(defaultScheme2);
                if (t4Var2 == null || t4Var2.priority() < t4Var.priority()) {
                    map.put(defaultScheme2, t4Var);
                }
                if (iPriority < t4Var.priority()) {
                    iPriority = t4Var.priority();
                    defaultScheme = t4Var.getDefaultScheme();
                }
            }
            this.f91173d = nh.m5.copyOf((Map) map);
            this.f91171b = defaultScheme;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void deregister(t4 t4Var) {
        this.f91172c.remove(t4Var);
        b();
    }

    public synchronized String getDefaultScheme() {
        return this.f91171b;
    }

    public t4 getProviderForScheme(String str) {
        nh.m5 m5Var;
        if (str == null) {
            return null;
        }
        synchronized (this) {
            m5Var = this.f91173d;
        }
        return (t4) m5Var.get(str.toLowerCase(Locale.US));
    }

    public synchronized void register(t4 t4Var) {
        a(t4Var);
        b();
    }
}
