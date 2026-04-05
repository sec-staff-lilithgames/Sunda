package wr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q3 {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f91101c = Logger.getLogger(q3.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static q3 f91102d;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f91103a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    public List f91104b = Collections.EMPTY_LIST;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static List b() {
        Logger logger = f91101c;
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(yr.u.class);
        } catch (ClassNotFoundException e10) {
            logger.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e10);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e11) {
            logger.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e11);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e12) {
            logger.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e12);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static synchronized q3 getDefaultRegistry() {
        try {
            if (f91102d == null) {
                List<n3> listLoadAll = i6.loadAll(n3.class, b(), n3.class.getClassLoader(), new p3());
                f91102d = new q3();
                for (n3 n3Var : listLoadAll) {
                    f91101c.fine("Service loader found " + n3Var);
                    f91102d.a(n3Var);
                }
                f91102d.c();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f91102d;
    }

    public final synchronized void a(n3 n3Var) {
        mh.p1.checkArgument(n3Var.isAvailable(), "isAvailable() returned false");
        this.f91103a.add(n3Var);
    }

    public final synchronized void c() {
        ArrayList arrayList = new ArrayList(this.f91103a);
        Collections.sort(arrayList, Collections.reverseOrder(new o3()));
        this.f91104b = Collections.unmodifiableList(arrayList);
    }

    public synchronized void deregister(n3 n3Var) {
        this.f91103a.remove(n3Var);
        c();
    }

    public synchronized void register(n3 n3Var) {
        a(n3Var);
        c();
    }
}
