package rq;

import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import br.b2;
import br.u;
import br.v;
import br.y;
import br.z;
import dq.d0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kv.l;
import kv.p;
import tu.o;
import tu.q;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f84939a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84940b;

    /* renamed from: c, reason: collision with root package name */
    public final y f84941c;

    /* renamed from: d, reason: collision with root package name */
    public final e f84942d;

    /* renamed from: e, reason: collision with root package name */
    public final o f84943e;

    /* renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArrayList f84944f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f84945g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f84946h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f84947i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f84948j;

    /* renamed from: k, reason: collision with root package name */
    public volatile long f84949k;

    /* renamed from: l, reason: collision with root package name */
    public b f84950l;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: rq.a$a, reason: collision with other inner class name */
    public static final class C0777a extends mr.b {

        /* renamed from: c, reason: collision with root package name */
        public final sq.a f84951c;

        /* renamed from: e, reason: collision with root package name */
        public final Bitmap f84952e;

        /* renamed from: f, reason: collision with root package name */
        public final p f84953f;

        public C0777a(sq.a algorithm, Bitmap image, p callback) {
            e0.checkNotNullParameter(algorithm, "algorithm");
            e0.checkNotNullParameter(image, "image");
            e0.checkNotNullParameter(callback, "callback");
            this.f84951c = algorithm;
            this.f84952e = image;
            this.f84953f = callback;
        }

        @Override // mr.b
        public void runTask() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Bitmap bitmap = this.f84952e;
            sq.a aVar = this.f84951c;
            Boolean boolB = aVar.b(bitmap);
            p pVar = this.f84953f;
            if (boolB != null) {
                pVar.invoke(this, new v(boolB.booleanValue(), aVar.a(), System.currentTimeMillis() - jCurrentTimeMillis));
            } else {
                pVar.invoke(this, null);
            }
        }
    }

    public a(int i10, String adElementName, y brokenCreativeDetectorParams, e brokenCreativeDetectorListener) {
        e0.checkNotNullParameter(adElementName, "adElementName");
        e0.checkNotNullParameter(brokenCreativeDetectorParams, "brokenCreativeDetectorParams");
        e0.checkNotNullParameter(brokenCreativeDetectorListener, "brokenCreativeDetectorListener");
        this.f84939a = i10;
        this.f84940b = adElementName;
        this.f84941c = brokenCreativeDetectorParams;
        this.f84942d = brokenCreativeDetectorListener;
        this.f84943e = q.lazy(c.f84964e);
        this.f84944f = new CopyOnWriteArrayList();
        this.f84945g = new AtomicBoolean(false);
        this.f84946h = new AtomicBoolean(false);
        this.f84947i = new AtomicBoolean(false);
        this.f84948j = new Object();
    }

    public final void a(View view) {
        e0.checkNotNullParameter(view, "view");
        if (this.f84947i.get() || this.f84946h.get()) {
            return;
        }
        synchronized (this.f84948j) {
            try {
                if (this.f84945g.compareAndSet(false, true)) {
                    List<u> algorithms = this.f84941c.getAlgorithms();
                    ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(algorithms, 10));
                    Iterator<T> it = algorithms.iterator();
                    while (it.hasNext()) {
                        arrayList.add(sq.c.f86113a.a((u) it.next()));
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    this.f84949k = System.currentTimeMillis();
                    this.f84950l = new b(view, ((or.a) this.f84943e.getValue()).getHandler(), this.f84941c.getDownscaleFactor(), arrayList, new d(this));
                    d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        return (!this.f84945g.get() || this.f84947i.get() || this.f84946h.get()) ? false : true;
    }

    public final void c() {
        this.f84946h.set(true);
        i();
    }

    public final void d() {
        synchronized (this.f84948j) {
            synchronized (this.f84948j) {
                b bVar = this.f84950l;
                if (bVar != null) {
                    ((or.a) this.f84943e.getValue()).cancel(bVar);
                }
            }
            if (b()) {
                b bVar2 = this.f84950l;
                if (bVar2 != null) {
                    ((or.a) this.f84943e.getValue()).scheduleSafely(bVar2, this.f84941c.getTimeout());
                }
            }
        }
    }

    public final void i() {
        synchronized (this.f84948j) {
            this.f84945g.set(false);
            synchronized (this.f84948j) {
                b bVar = this.f84950l;
                if (bVar != null) {
                    ((or.a) this.f84943e.getValue()).cancel(bVar);
                }
            }
            this.f84950l = null;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends mr.b {

        /* renamed from: c, reason: collision with root package name */
        public final Handler f84954c;

        /* renamed from: e, reason: collision with root package name */
        public final double f84955e;

        /* renamed from: f, reason: collision with root package name */
        public final List f84956f;

        /* renamed from: g, reason: collision with root package name */
        public final l f84957g;

        /* renamed from: h, reason: collision with root package name */
        public final nr.b f84958h;

        /* renamed from: i, reason: collision with root package name */
        public final WeakReference f84959i;

        /* renamed from: j, reason: collision with root package name */
        public final CopyOnWriteArrayList f84960j;

        /* renamed from: k, reason: collision with root package name */
        public final CopyOnWriteArrayList f84961k;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: rq.a$b$a, reason: collision with other inner class name */
        public final class C0778a implements wq.c {
            public C0778a() {
            }

            @Override // wq.c
            public void a(Bitmap bitmap) {
                e0.checkNotNullParameter(bitmap, "bitmap");
                b.a(b.this, bitmap);
            }

            @Override // wq.c
            public void a() {
                b.a(b.this);
            }
        }

        public b(View view, Handler screenshotCallbackHandler, double d10, List<? extends sq.a> algorithms, l callback) {
            e0.checkNotNullParameter(view, "view");
            e0.checkNotNullParameter(screenshotCallbackHandler, "screenshotCallbackHandler");
            e0.checkNotNullParameter(algorithms, "algorithms");
            e0.checkNotNullParameter(callback, "callback");
            this.f84954c = screenshotCallbackHandler;
            this.f84955e = d10;
            this.f84956f = algorithms;
            this.f84957g = callback;
            this.f84958h = new nr.b(CoroutineScopeKt.CoroutineScope(new CoroutineName("DetectorTaskManager").plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)).plus(Dispatchers.getDefault())));
            this.f84959i = new WeakReference(view);
            this.f84960j = new CopyOnWriteArrayList();
            this.f84961k = new CopyOnWriteArrayList();
        }

        public static final void a(b bVar) {
            if (bVar.isCanceled()) {
                return;
            }
            bVar.f84957g.invoke(bVar.f84961k);
        }

        @Override // mr.b
        public void runTask() {
            View view = (View) this.f84959i.get();
            if (view == null) {
                return;
            }
            wq.b.f90797a.a(view, this.f84954c, new C0778a());
        }

        @Override // mr.b, ir.a
        public void setCancel(boolean z10) {
            super.setCancel(z10);
            if (z10) {
                CopyOnWriteArrayList copyOnWriteArrayList = this.f84960j;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    this.f84958h.cancel((C0777a) it.next());
                }
                copyOnWriteArrayList.clear();
            }
        }

        public static final void a(b bVar, Bitmap bitmap) {
            boolean zIsCanceled = bVar.isCanceled();
            CopyOnWriteArrayList copyOnWriteArrayList = bVar.f84960j;
            if (zIsCanceled) {
                ir.f.recycleSafely(bitmap);
                return;
            }
            Bitmap bitmapCreateDownscaledBitmapSafely = ir.f.createDownscaledBitmapSafely(bitmap, bVar.f84955e);
            if (!e0.areEqual(bitmapCreateDownscaledBitmapSafely, bitmap)) {
                ir.f.recycleSafely(bitmap);
            }
            if (bVar.isCanceled()) {
                ir.f.recycleSafely(bitmap);
                return;
            }
            List list = bVar.f84956f;
            ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C0777a((sq.a) it.next(), bitmapCreateDownscaledBitmapSafely, new rq.b(bVar)));
            }
            copyOnWriteArrayList.addAll(arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0777a c0777a = (C0777a) it2.next();
                if (!bVar.f84958h.executeSafely(c0777a)) {
                    copyOnWriteArrayList.remove(c0777a);
                    if (copyOnWriteArrayList.isEmpty() && !bVar.isCanceled()) {
                        bVar.f84957g.invoke(bVar.f84961k);
                    }
                }
            }
        }

        public static final void a(b bVar, C0777a c0777a, v vVar) {
            if (vVar != null) {
                bVar.f84961k.add(vVar);
            }
            CopyOnWriteArrayList copyOnWriteArrayList = bVar.f84960j;
            copyOnWriteArrayList.remove(c0777a);
            if (copyOnWriteArrayList.isEmpty() && !bVar.isCanceled()) {
                bVar.f84957g.invoke(bVar.f84961k);
            }
        }
    }

    public static final void a(a aVar, List list) {
        if (aVar.b()) {
            Iterator it = list.iterator();
            double d10 = 0.0d;
            double d11 = 0.0d;
            while (it.hasNext()) {
                v vVar = (v) it.next();
                float weight = vVar.getAlgorithmParams().getWeight();
                if (vVar.isBroken()) {
                    d11 += weight;
                }
                d10 += weight;
            }
            boolean z10 = (d10 != 0.0d ? d11 / d10 : 0.0d) >= aVar.f84941c.getWeightThreshold();
            if (!aVar.f84941c.isErrorOnly() || z10) {
                z zVar = new z(f.f84966a.a(z10), aVar.f84939a, aVar.f84940b, System.currentTimeMillis() - aVar.f84949k, list);
                if (aVar.f84941c.isAllowDuplicate() || !aVar.f84944f.contains(zVar)) {
                    aVar.f84944f.add(zVar);
                    if (aVar.b()) {
                        d0.b("BrokenCreativeDetector", "Notify detector result: %s", zVar);
                        aVar.f84942d.a(zVar);
                    }
                }
            }
            b2 stopAfter = aVar.f84941c.getStopAfter();
            if ((stopAfter == b2.ValidCreative && z10) || ((stopAfter == b2.BrokenCreative && !z10) || stopAfter == b2.Never)) {
                aVar.d();
            } else {
                aVar.f84947i.set(true);
            }
        }
    }
}
