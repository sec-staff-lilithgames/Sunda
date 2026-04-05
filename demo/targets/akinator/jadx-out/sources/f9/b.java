package f9;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b implements f, e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f55540a;

    /* renamed from: b, reason: collision with root package name */
    public final f f55541b;

    /* renamed from: c, reason: collision with root package name */
    public volatile e f55542c;

    /* renamed from: d, reason: collision with root package name */
    public volatile e f55543d;

    /* renamed from: e, reason: collision with root package name */
    public int f55544e = 3;

    /* renamed from: f, reason: collision with root package name */
    public int f55545f = 3;

    public b(Object obj, f fVar) {
        this.f55540a = obj;
        this.f55541b = fVar;
    }

    @Override // f9.e
    public void begin() {
        synchronized (this.f55540a) {
            try {
                if (this.f55544e != 1) {
                    this.f55544e = 1;
                    this.f55542c.begin();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // f9.f
    public boolean canNotifyCleared(e eVar) {
        boolean z10;
        synchronized (this.f55540a) {
            try {
                f fVar = this.f55541b;
                z10 = true;
                if (!(fVar == null || fVar.canNotifyCleared(this)) || !eVar.equals(this.f55542c)) {
                    z10 = false;
                }
            } finally {
            }
        }
        return z10;
    }

    @Override // f9.f
    public boolean canNotifyStatusChanged(e eVar) {
        boolean z10;
        int i10;
        synchronized (this.f55540a) {
            f fVar = this.f55541b;
            z10 = false;
            if (fVar == null || fVar.canNotifyStatusChanged(this)) {
                if (this.f55544e != 5 ? eVar.equals(this.f55542c) : eVar.equals(this.f55543d) && ((i10 = this.f55545f) == 4 || i10 == 5)) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    @Override // f9.f
    public boolean canSetImage(e eVar) {
        boolean z10;
        synchronized (this.f55540a) {
            f fVar = this.f55541b;
            z10 = fVar == null || fVar.canSetImage(this);
        }
        return z10;
    }

    @Override // f9.e
    public void clear() {
        synchronized (this.f55540a) {
            try {
                this.f55544e = 3;
                this.f55542c.clear();
                if (this.f55545f != 3) {
                    this.f55545f = 3;
                    this.f55543d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // f9.f
    public f getRoot() {
        f root;
        synchronized (this.f55540a) {
            try {
                f fVar = this.f55541b;
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
        synchronized (this.f55540a) {
            try {
                z10 = this.f55542c.isAnyResourceSet() || this.f55543d.isAnyResourceSet();
            } finally {
            }
        }
        return z10;
    }

    @Override // f9.e
    public boolean isCleared() {
        boolean z10;
        synchronized (this.f55540a) {
            try {
                z10 = this.f55544e == 3 && this.f55545f == 3;
            } finally {
            }
        }
        return z10;
    }

    @Override // f9.e
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f55540a) {
            try {
                z10 = this.f55544e == 4 || this.f55545f == 4;
            } finally {
            }
        }
        return z10;
    }

    @Override // f9.e
    public boolean isEquivalentTo(e eVar) {
        if (eVar instanceof b) {
            b bVar = (b) eVar;
            if (this.f55542c.isEquivalentTo(bVar.f55542c) && this.f55543d.isEquivalentTo(bVar.f55543d)) {
                return true;
            }
        }
        return false;
    }

    @Override // f9.e
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f55540a) {
            try {
                z10 = true;
                if (this.f55544e != 1 && this.f55545f != 1) {
                    z10 = false;
                }
            } finally {
            }
        }
        return z10;
    }

    @Override // f9.f
    public void onRequestFailed(e eVar) {
        synchronized (this.f55540a) {
            try {
                if (eVar.equals(this.f55543d)) {
                    this.f55545f = 5;
                    f fVar = this.f55541b;
                    if (fVar != null) {
                        fVar.onRequestFailed(this);
                    }
                    return;
                }
                this.f55544e = 5;
                if (this.f55545f != 1) {
                    this.f55545f = 1;
                    this.f55543d.begin();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // f9.f
    public void onRequestSuccess(e eVar) {
        synchronized (this.f55540a) {
            try {
                if (eVar.equals(this.f55542c)) {
                    this.f55544e = 4;
                } else if (eVar.equals(this.f55543d)) {
                    this.f55545f = 4;
                }
                f fVar = this.f55541b;
                if (fVar != null) {
                    fVar.onRequestSuccess(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // f9.e
    public void pause() {
        synchronized (this.f55540a) {
            try {
                if (this.f55544e == 1) {
                    this.f55544e = 2;
                    this.f55542c.pause();
                }
                if (this.f55545f == 1) {
                    this.f55545f = 2;
                    this.f55543d.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setRequests(e eVar, e eVar2) {
        this.f55542c = eVar;
        this.f55543d = eVar2;
    }
}
