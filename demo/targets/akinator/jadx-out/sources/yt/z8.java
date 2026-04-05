package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z8 extends y8 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f96649f;

    /* renamed from: g, reason: collision with root package name */
    public final tw.c f96650g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z8(tw.c cVar, long j10, long j11, int i10) {
        super(j10, j11);
        this.f96649f = i10;
        this.f96650g = cVar;
    }

    @Override // yt.y8
    public final void a() {
        switch (this.f96649f) {
            case 0:
                long j10 = this.f96602b;
                vt.a aVar = (vt.a) this.f96650g;
                for (long j11 = this.f96603c; j11 != j10; j11++) {
                    if (this.f96604e) {
                        break;
                    } else {
                        aVar.tryOnNext(Long.valueOf(j11));
                    }
                }
                if (!this.f96604e) {
                    aVar.onComplete();
                    break;
                }
                break;
            default:
                long j12 = this.f96602b;
                tw.c cVar = this.f96650g;
                for (long j13 = this.f96603c; j13 != j12; j13++) {
                    if (this.f96604e) {
                        break;
                    } else {
                        cVar.onNext(Long.valueOf(j13));
                    }
                }
                if (!this.f96604e) {
                    cVar.onComplete();
                    break;
                }
                break;
        }
    }

    @Override // yt.y8
    public final void b(long j10) {
        switch (this.f96649f) {
            case 0:
                long j11 = this.f96602b;
                long j12 = this.f96603c;
                vt.a aVar = (vt.a) this.f96650g;
                do {
                    long j13 = 0;
                    while (true) {
                        if (j13 == j10 || j12 == j11) {
                            if (j12 != j11) {
                                j10 = get();
                                if (j13 == j10) {
                                    this.f96603c = j12;
                                    j10 = addAndGet(-j13);
                                }
                            } else if (!this.f96604e) {
                                aVar.onComplete();
                                break;
                            }
                        } else if (this.f96604e) {
                            break;
                        } else {
                            if (aVar.tryOnNext(Long.valueOf(j12))) {
                                j13++;
                            }
                            j12++;
                        }
                    }
                } while (j10 != 0);
                break;
            default:
                long j14 = this.f96602b;
                long j15 = this.f96603c;
                tw.c cVar = this.f96650g;
                do {
                    long j16 = 0;
                    while (true) {
                        if (j16 == j10 || j15 == j14) {
                            if (j15 != j14) {
                                j10 = get();
                                if (j16 == j10) {
                                    this.f96603c = j15;
                                    j10 = addAndGet(-j16);
                                }
                            } else if (!this.f96604e) {
                                cVar.onComplete();
                                break;
                            }
                        } else if (this.f96604e) {
                            break;
                        } else {
                            cVar.onNext(Long.valueOf(j15));
                            j16++;
                            j15++;
                        }
                    }
                } while (j10 != 0);
                break;
        }
    }
}
