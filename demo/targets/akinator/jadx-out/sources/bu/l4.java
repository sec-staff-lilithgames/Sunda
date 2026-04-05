package bu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l4 extends bu.a {

    /* renamed from: c, reason: collision with root package name */
    public final st.o f10575c;

    /* renamed from: e, reason: collision with root package name */
    public final st.o f10576e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10577f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10578g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends AtomicInteger implements mt.i0, pt.c {

        /* renamed from: k, reason: collision with root package name */
        public static final Object f10579k = new Object();

        /* renamed from: b, reason: collision with root package name */
        public final mt.i0 f10580b;

        /* renamed from: c, reason: collision with root package name */
        public final st.o f10581c;

        /* renamed from: e, reason: collision with root package name */
        public final st.o f10582e;

        /* renamed from: f, reason: collision with root package name */
        public final int f10583f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f10584g;

        /* renamed from: i, reason: collision with root package name */
        public pt.c f10586i;

        /* renamed from: j, reason: collision with root package name */
        public final AtomicBoolean f10587j = new AtomicBoolean();

        /* renamed from: h, reason: collision with root package name */
        public final ConcurrentHashMap f10585h = new ConcurrentHashMap();

        public a(mt.i0 i0Var, st.o oVar, st.o oVar2, int i10, boolean z10) {
            this.f10580b = i0Var;
            this.f10581c = oVar;
            this.f10582e = oVar2;
            this.f10583f = i10;
            this.f10584g = z10;
            lazySet(1);
        }

        public void cancel(Object obj) {
            if (obj == null) {
                obj = f10579k;
            }
            this.f10585h.remove(obj);
            if (decrementAndGet() == 0) {
                this.f10586i.dispose();
            }
        }

        @Override // pt.c
        public void dispose() {
            if (this.f10587j.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.f10586i.dispose();
            }
        }

        @Override // pt.c
        public boolean isDisposed() {
            return this.f10587j.get();
        }

        @Override // mt.i0, mt.f
        public void onComplete() {
            ConcurrentHashMap concurrentHashMap = this.f10585h;
            ArrayList arrayList = new ArrayList(concurrentHashMap.values());
            concurrentHashMap.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((m4) it.next()).onComplete();
            }
            this.f10580b.onComplete();
        }

        @Override // mt.i0, mt.f
        public void onError(Throwable th2) {
            ConcurrentHashMap concurrentHashMap = this.f10585h;
            ArrayList arrayList = new ArrayList(concurrentHashMap.values());
            concurrentHashMap.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((m4) it.next()).onError(th2);
            }
            this.f10580b.onError(th2);
        }

        @Override // mt.i0
        public void onNext(Object obj) {
            try {
                Object objApply = this.f10581c.apply(obj);
                Object obj2 = objApply != null ? objApply : f10579k;
                ConcurrentHashMap concurrentHashMap = this.f10585h;
                m4 m4VarCreateWith = (m4) concurrentHashMap.get(obj2);
                if (m4VarCreateWith == null) {
                    if (this.f10587j.get()) {
                        return;
                    }
                    m4VarCreateWith = m4.createWith(objApply, this.f10583f, this, this.f10584g);
                    concurrentHashMap.put(obj2, m4VarCreateWith);
                    getAndIncrement();
                    this.f10580b.onNext(m4VarCreateWith);
                }
                try {
                    m4VarCreateWith.onNext(ut.o0.requireNonNull(this.f10582e.apply(obj), "The value supplied is null"));
                } catch (Throwable th2) {
                    qt.d.throwIfFatal(th2);
                    this.f10586i.dispose();
                    onError(th2);
                }
            } catch (Throwable th3) {
                qt.d.throwIfFatal(th3);
                this.f10586i.dispose();
                onError(th3);
            }
        }

        @Override // mt.i0, mt.f
        public void onSubscribe(pt.c cVar) {
            if (tt.d.validate(this.f10586i, cVar)) {
                this.f10586i = cVar;
                this.f10580b.onSubscribe(this);
            }
        }
    }

    public l4(mt.g0 g0Var, st.o oVar, st.o oVar2, int i10, boolean z10) {
        super(g0Var);
        this.f10575c = oVar;
        this.f10576e = oVar2;
        this.f10577f = i10;
        this.f10578g = z10;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        this.f10053b.subscribe(new a(i0Var, this.f10575c, this.f10576e, this.f10577f, this.f10578g));
    }
}
