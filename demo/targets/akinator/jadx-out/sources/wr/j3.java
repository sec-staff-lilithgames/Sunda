package wr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import xr.ua;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j3 {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f90981c;

    /* renamed from: d, reason: collision with root package name */
    public static j3 f90982d;

    /* renamed from: e, reason: collision with root package name */
    public static final List f90983e;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f90984a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f90985b = new LinkedHashMap();

    static {
        Logger logger = Logger.getLogger(j3.class.getName());
        f90981c = logger;
        ArrayList arrayList = new ArrayList();
        try {
            boolean z10 = ua.f93134b;
            arrayList.add(ua.class);
        } catch (ClassNotFoundException e10) {
            logger.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e10);
        }
        try {
            int i10 = es.o0.f55085b;
            arrayList.add(es.o0.class);
        } catch (ClassNotFoundException e11) {
            logger.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e11);
        }
        f90983e = Collections.unmodifiableList(arrayList);
    }

    public static synchronized j3 getDefaultRegistry() {
        try {
            if (f90982d == null) {
                List<h3> listLoadAll = i6.loadAll(h3.class, f90983e, h3.class.getClassLoader(), new i3());
                f90982d = new j3();
                for (h3 h3Var : listLoadAll) {
                    f90981c.fine("Service loader found " + h3Var);
                    f90982d.a(h3Var);
                }
                f90982d.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f90982d;
    }

    public final synchronized void a(h3 h3Var) {
        mh.p1.checkArgument(h3Var.isAvailable(), "isAvailable() returned false");
        this.f90984a.add(h3Var);
    }

    public final synchronized void b() {
        try {
            this.f90985b.clear();
            Iterator it = this.f90984a.iterator();
            while (it.hasNext()) {
                h3 h3Var = (h3) it.next();
                String policyName = h3Var.getPolicyName();
                h3 h3Var2 = (h3) this.f90985b.get(policyName);
                if (h3Var2 == null || h3Var2.getPriority() < h3Var.getPriority()) {
                    this.f90985b.put(policyName, h3Var);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void deregister(h3 h3Var) {
        this.f90984a.remove(h3Var);
        b();
    }

    public synchronized h3 getProvider(String str) {
        return (h3) this.f90985b.get(mh.p1.checkNotNull(str, "policy"));
    }

    public synchronized void register(h3 h3Var) {
        a(h3Var);
        b();
    }
}
