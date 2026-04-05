package f9;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class l implements f, e {

    /* renamed from: a, reason: collision with root package name */
    public final f f55580a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f55581b;

    /* renamed from: c, reason: collision with root package name */
    public volatile e f55582c;

    /* renamed from: d, reason: collision with root package name */
    public volatile e f55583d;

    /* renamed from: e, reason: collision with root package name */
    public int f55584e = 3;

    /* renamed from: f, reason: collision with root package name */
    public int f55585f = 3;

    /* renamed from: g, reason: collision with root package name */
    public boolean f55586g;

    public l(Object obj, f fVar) {
        this.f55581b = obj;
        this.f55580a = fVar;
    }

    @Override // f9.e
    public void begin() {
        synchronized (this.f55581b) {
            try {
                this.f55586g = true;
                try {
                    if (this.f55584e != 4 && this.f55585f != 1) {
                        this.f55585f = 1;
                        this.f55583d.begin();
                    }
                    if (this.f55586g && this.f55584e != 1) {
                        this.f55584e = 1;
                        this.f55582c.begin();
                    }
                    this.f55586g = false;
                } catch (Throwable th2) {
                    this.f55586g = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // f9.f
    public boolean canNotifyCleared(e eVar) {
        boolean z10;
        synchronized (this.f55581b) {
            try {
                f fVar = this.f55580a;
                z10 = (fVar == null || fVar.canNotifyCleared(this)) && eVar.equals(this.f55582c) && this.f55584e != 2;
            } finally {
            }
        }
        return z10;
    }

    @Override // f9.f
    public boolean canNotifyStatusChanged(e eVar) {
        boolean z10;
        synchronized (this.f55581b) {
            try {
                f fVar = this.f55580a;
                z10 = true;
                if (!(fVar == null || fVar.canNotifyStatusChanged(this)) || !eVar.equals(this.f55582c) || isAnyResourceSet()) {
                    z10 = false;
                }
            } finally {
            }
        }
        return z10;
    }

    @Override // f9.f
    public boolean canSetImage(e eVar) {
        boolean z10;
        synchronized (this.f55581b) {
            try {
                f fVar = this.f55580a;
                z10 = (fVar == null || fVar.canSetImage(this)) && (eVar.equals(this.f55582c) || this.f55584e != 4);
            } finally {
            }
        }
        return z10;
    }

    @Override // f9.e
    public void clear() {
        synchronized (this.f55581b) {
            this.f55586g = false;
            this.f55584e = 3;
            this.f55585f = 3;
            this.f55583d.clear();
            this.f55582c.clear();
        }
    }

    @Override // f9.f
    public f getRoot() {
        f root;
        synchronized (this.f55581b) {
            try {
                f fVar = this.f55580a;
                root = fVar != null ? fVar.getRoot() : this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    @Override // f9.f, f9.e
    public boolean isAnyResourceSet() {
        boolean z10;
        synchronized (this.f55581b) {
            try {
                z10 = this.f55583d.isAnyResourceSet() || this.f55582c.isAnyResourceSet();
            } finally {
            }
        }
        return z10;
    }

    @Override // f9.e
    public boolean isCleared() {
        boolean z10;
        synchronized (this.f55581b) {
            z10 = this.f55584e == 3;
        }
        return z10;
    }

    @Override // f9.e
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f55581b) {
            z10 = this.f55584e == 4;
        }
        return z10;
    }

    @Override // f9.e
    public boolean isEquivalentTo(e eVar) {
        if (eVar instanceof l) {
            l lVar = (l) eVar;
            if (this.f55582c != null ? this.f55582c.isEquivalentTo(lVar.f55582c) : lVar.f55582c == null) {
                if (this.f55583d == null) {
                    if (lVar.f55583d == null) {
                        return true;
                    }
                } else if (this.f55583d.isEquivalentTo(lVar.f55583d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // f9.e
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f55581b) {
            z10 = true;
            if (this.f55584e != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // f9.f
    public void onRequestFailed(e eVar) {
        synchronized (this.f55581b) {
            try {
                if (!eVar.equals(this.f55582c)) {
                    this.f55585f = 5;
                    return;
                }
                this.f55584e = 5;
                f fVar = this.f55580a;
                if (fVar != null) {
                    fVar.onRequestFailed(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // f9.f
    public void onRequestSuccess(e eVar) {
        synchronized (this.f55581b) {
            try {
                if (eVar.equals(this.f55583d)) {
                    this.f55585f = 4;
                    return;
                }
                this.f55584e = 4;
                f fVar = this.f55580a;
                if (fVar != null) {
                    fVar.onRequestSuccess(this);
                }
                if (!e3.g.b(this.f55585f)) {
                    this.f55583d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // f9.e
    public void pause() {
        synchronized (this.f55581b) {
            try {
                if (!e3.g.b(this.f55585f)) {
                    this.f55585f = 2;
                    this.f55583d.pause();
                }
                if (!e3.g.b(this.f55584e)) {
                    this.f55584e = 2;
                    this.f55582c.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setRequests(e eVar, e eVar2) {
        this.f55582c = eVar;
        this.f55583d = eVar2;
    }
}
