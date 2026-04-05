package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j4 implements mt.k, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10455b;

    /* renamed from: c, reason: collision with root package name */
    public final st.c f10456c;

    /* renamed from: e, reason: collision with root package name */
    public final st.g f10457e;

    /* renamed from: f, reason: collision with root package name */
    public Object f10458f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f10459g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10460h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10461i;

    public j4(mt.i0 i0Var, st.c cVar, st.g gVar, Object obj) {
        this.f10455b = i0Var;
        this.f10456c = cVar;
        this.f10457e = gVar;
        this.f10458f = obj;
    }

    public final void a(Object obj) {
        try {
            this.f10457e.accept(obj);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            mu.a.onError(th2);
        }
    }

    @Override // pt.c
    public void dispose() {
        this.f10459g = true;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10459g;
    }

    @Override // mt.k
    public void onComplete() {
        if (this.f10460h) {
            return;
        }
        this.f10460h = true;
        this.f10455b.onComplete();
    }

    @Override // mt.k
    public void onError(Throwable th2) {
        if (this.f10460h) {
            mu.a.onError(th2);
            return;
        }
        if (th2 == null) {
            th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        this.f10460h = true;
        this.f10455b.onError(th2);
    }

    @Override // mt.k
    public void onNext(Object obj) {
        if (this.f10460h) {
            return;
        }
        if (this.f10461i) {
            onError(new IllegalStateException("onNext already called in this generate turn"));
        } else if (obj == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else {
            this.f10461i = true;
            this.f10455b.onNext(obj);
        }
    }

    public void run() {
        Object objApply = this.f10458f;
        if (this.f10459g) {
            this.f10458f = null;
            a(objApply);
            return;
        }
        st.c cVar = this.f10456c;
        while (!this.f10459g) {
            this.f10461i = false;
            try {
                objApply = cVar.apply(objApply, this);
                if (this.f10460h) {
                    this.f10459g = true;
                    this.f10458f = null;
                    a(objApply);
                    return;
                }
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                this.f10458f = null;
                this.f10459g = true;
                onError(th2);
                a(objApply);
                return;
            }
        }
        this.f10458f = null;
        a(objApply);
    }
}
