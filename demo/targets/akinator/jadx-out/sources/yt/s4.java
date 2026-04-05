package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s4 extends t4 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f96307f;

    /* renamed from: g, reason: collision with root package name */
    public final tw.c f96308g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s4(tw.c cVar, Object[] objArr, int i10) {
        super(objArr);
        this.f96307f = i10;
        this.f96308g = cVar;
    }

    @Override // yt.t4
    public final void a() {
        switch (this.f96307f) {
            case 0:
                Object[] objArr = this.f96356b;
                int length = objArr.length;
                vt.a aVar = (vt.a) this.f96308g;
                for (int i10 = this.f96357c; i10 != length; i10++) {
                    if (this.f96358e) {
                        break;
                    } else {
                        Object obj = objArr[i10];
                        if (obj == null) {
                            aVar.onError(new NullPointerException(p0.o2.k(i10, "The element at index ", " is null")));
                            break;
                        } else {
                            aVar.tryOnNext(obj);
                        }
                    }
                }
                if (!this.f96358e) {
                    aVar.onComplete();
                    break;
                }
                break;
            default:
                Object[] objArr2 = this.f96356b;
                int length2 = objArr2.length;
                tw.c cVar = this.f96308g;
                for (int i11 = this.f96357c; i11 != length2; i11++) {
                    if (this.f96358e) {
                        break;
                    } else {
                        Object obj2 = objArr2[i11];
                        if (obj2 == null) {
                            cVar.onError(new NullPointerException(p0.o2.k(i11, "The element at index ", " is null")));
                            break;
                        } else {
                            cVar.onNext(obj2);
                        }
                    }
                }
                if (!this.f96358e) {
                    cVar.onComplete();
                    break;
                }
                break;
        }
    }

    @Override // yt.t4
    public final void b(long j10) {
        switch (this.f96307f) {
            case 0:
                Object[] objArr = this.f96356b;
                int length = objArr.length;
                int i10 = this.f96357c;
                vt.a aVar = (vt.a) this.f96308g;
                do {
                    long j11 = 0;
                    while (true) {
                        if (j11 == j10 || i10 == length) {
                            if (i10 != length) {
                                j10 = get();
                                if (j11 == j10) {
                                    this.f96357c = i10;
                                    j10 = addAndGet(-j11);
                                }
                            } else if (!this.f96358e) {
                                aVar.onComplete();
                                break;
                            }
                        } else if (this.f96358e) {
                            break;
                        } else {
                            Object obj = objArr[i10];
                            if (obj == null) {
                                aVar.onError(new NullPointerException(p0.o2.k(i10, "The element at index ", " is null")));
                                break;
                            } else {
                                if (aVar.tryOnNext(obj)) {
                                    j11++;
                                }
                                i10++;
                            }
                        }
                    }
                } while (j10 != 0);
                break;
            default:
                Object[] objArr2 = this.f96356b;
                int length2 = objArr2.length;
                int i11 = this.f96357c;
                tw.c cVar = this.f96308g;
                do {
                    long j12 = 0;
                    while (true) {
                        if (j12 == j10 || i11 == length2) {
                            if (i11 != length2) {
                                j10 = get();
                                if (j12 == j10) {
                                    this.f96357c = i11;
                                    j10 = addAndGet(-j12);
                                }
                            } else if (!this.f96358e) {
                                cVar.onComplete();
                                break;
                            }
                        } else if (this.f96358e) {
                            break;
                        } else {
                            Object obj2 = objArr2[i11];
                            if (obj2 == null) {
                                cVar.onError(new NullPointerException(p0.o2.k(i11, "The element at index ", " is null")));
                                break;
                            } else {
                                cVar.onNext(obj2);
                                j12++;
                                i11++;
                            }
                        }
                    }
                } while (j10 != 0);
                break;
        }
    }
}
