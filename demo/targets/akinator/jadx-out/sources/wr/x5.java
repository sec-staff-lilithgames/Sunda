package wr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class x5 {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f91186c = Logger.getLogger(x5.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static x5 f91187d;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f91188a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    public List f91189b = Collections.EMPTY_LIST;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static synchronized x5 getDefaultRegistry() {
        try {
            if (f91187d == null) {
                ArrayList arrayList = new ArrayList();
                try {
                    arrayList.add(yr.p0.class);
                } catch (ClassNotFoundException e10) {
                    f91186c.log(Level.FINE, "Unable to find OkHttpServerProvider", (Throwable) e10);
                }
                List<v5> listLoadAll = i6.loadAll(v5.class, Collections.unmodifiableList(arrayList), v5.class.getClassLoader(), new y5());
                f91187d = new x5();
                for (v5 v5Var : listLoadAll) {
                    f91186c.fine("Service loader found " + v5Var);
                    f91187d.a(v5Var);
                }
                f91187d.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f91187d;
    }

    public final synchronized void a(v5 v5Var) {
        v5Var.getClass();
        mh.p1.checkArgument(true, "isAvailable() returned false");
        this.f91188a.add(v5Var);
    }

    public final synchronized void b() {
        ArrayList arrayList = new ArrayList(this.f91188a);
        Collections.sort(arrayList, Collections.reverseOrder(new w5()));
        this.f91189b = Collections.unmodifiableList(arrayList);
    }

    public synchronized void deregister(v5 v5Var) {
        this.f91188a.remove(v5Var);
        b();
    }

    public synchronized void register(v5 v5Var) {
        a(v5Var);
        b();
    }
}
