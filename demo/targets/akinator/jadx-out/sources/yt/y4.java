package yt;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y4 extends x4 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f96594f;

    /* renamed from: g, reason: collision with root package name */
    public final tw.c f96595g;

    public y4(tw.c cVar, Iterator it, int i10) {
        this.f96594f = i10;
        this.f96544b = it;
        this.f96595g = cVar;
    }

    @Override // yt.x4
    public final void a() {
        switch (this.f96594f) {
            case 0:
                Iterator it = this.f96544b;
                vt.a aVar = (vt.a) this.f96595g;
                while (!this.f96545c) {
                    try {
                        Object next = it.next();
                        if (this.f96545c) {
                            break;
                        } else if (next == null) {
                            aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                            break;
                        } else {
                            aVar.tryOnNext(next);
                            if (this.f96545c) {
                                break;
                            } else {
                                try {
                                    if (!it.hasNext()) {
                                        if (!this.f96545c) {
                                            aVar.onComplete();
                                            break;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    qt.d.throwIfFatal(th2);
                                    aVar.onError(th2);
                                    return;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        qt.d.throwIfFatal(th3);
                        aVar.onError(th3);
                        return;
                    }
                }
                break;
            default:
                Iterator it2 = this.f96544b;
                tw.c cVar = this.f96595g;
                while (!this.f96545c) {
                    try {
                        Object next2 = it2.next();
                        if (this.f96545c) {
                            break;
                        } else if (next2 == null) {
                            cVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                            break;
                        } else {
                            cVar.onNext(next2);
                            if (this.f96545c) {
                                break;
                            } else {
                                try {
                                    if (!it2.hasNext()) {
                                        if (!this.f96545c) {
                                            cVar.onComplete();
                                            break;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    qt.d.throwIfFatal(th4);
                                    cVar.onError(th4);
                                    return;
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        qt.d.throwIfFatal(th5);
                        cVar.onError(th5);
                    }
                }
                break;
        }
    }

    @Override // yt.x4
    public final void b(long j10) {
        switch (this.f96594f) {
            case 0:
                Iterator it = this.f96544b;
                vt.a aVar = (vt.a) this.f96595g;
                do {
                    long j11 = 0;
                    while (true) {
                        if (j11 == j10) {
                            j10 = get();
                            if (j11 == j10) {
                                j10 = addAndGet(-j11);
                            }
                        } else if (this.f96545c) {
                            break;
                        } else {
                            try {
                                Object next = it.next();
                                if (this.f96545c) {
                                    break;
                                } else if (next == null) {
                                    aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                    break;
                                } else {
                                    boolean zTryOnNext = aVar.tryOnNext(next);
                                    if (this.f96545c) {
                                        break;
                                    } else {
                                        try {
                                            if (!it.hasNext()) {
                                                if (!this.f96545c) {
                                                    aVar.onComplete();
                                                    break;
                                                }
                                            } else if (zTryOnNext) {
                                                j11++;
                                            }
                                        } catch (Throwable th2) {
                                            qt.d.throwIfFatal(th2);
                                            aVar.onError(th2);
                                            return;
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                qt.d.throwIfFatal(th3);
                                aVar.onError(th3);
                                return;
                            }
                        }
                    }
                } while (j10 != 0);
                break;
            default:
                Iterator it2 = this.f96544b;
                tw.c cVar = this.f96595g;
                do {
                    long j12 = 0;
                    while (true) {
                        if (j12 == j10) {
                            j10 = get();
                            if (j12 == j10) {
                                j10 = addAndGet(-j12);
                            }
                        } else if (this.f96545c) {
                            break;
                        } else {
                            try {
                                Object next2 = it2.next();
                                if (this.f96545c) {
                                    break;
                                } else if (next2 == null) {
                                    cVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                    break;
                                } else {
                                    cVar.onNext(next2);
                                    if (this.f96545c) {
                                        break;
                                    } else {
                                        try {
                                            if (!it2.hasNext()) {
                                                if (!this.f96545c) {
                                                    cVar.onComplete();
                                                    break;
                                                }
                                            } else {
                                                j12++;
                                            }
                                        } catch (Throwable th4) {
                                            qt.d.throwIfFatal(th4);
                                            cVar.onError(th4);
                                            return;
                                        }
                                    }
                                }
                            } catch (Throwable th5) {
                                qt.d.throwIfFatal(th5);
                                cVar.onError(th5);
                                return;
                            }
                        }
                    }
                } while (j10 != 0);
                break;
        }
    }
}
