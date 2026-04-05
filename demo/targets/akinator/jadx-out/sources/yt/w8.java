package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w8 extends v8 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f96493f;

    /* renamed from: g, reason: collision with root package name */
    public final tw.c f96494g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w8(tw.c cVar, int i10, int i11, int i12) {
        super(i10, i11);
        this.f96493f = i12;
        this.f96494g = cVar;
    }

    @Override // yt.v8
    public final void a() {
        switch (this.f96493f) {
            case 0:
                int i10 = this.f96453b;
                vt.a aVar = (vt.a) this.f96494g;
                for (int i11 = this.f96454c; i11 != i10; i11++) {
                    if (this.f96455e) {
                        break;
                    } else {
                        aVar.tryOnNext(Integer.valueOf(i11));
                    }
                }
                if (!this.f96455e) {
                    aVar.onComplete();
                    break;
                }
                break;
            default:
                int i12 = this.f96453b;
                tw.c cVar = this.f96494g;
                for (int i13 = this.f96454c; i13 != i12; i13++) {
                    if (this.f96455e) {
                        break;
                    } else {
                        cVar.onNext(Integer.valueOf(i13));
                    }
                }
                if (!this.f96455e) {
                    cVar.onComplete();
                    break;
                }
                break;
        }
    }

    @Override // yt.v8
    public final void b(long j10) {
        switch (this.f96493f) {
            case 0:
                int i10 = this.f96453b;
                int i11 = this.f96454c;
                vt.a aVar = (vt.a) this.f96494g;
                do {
                    long j11 = 0;
                    while (true) {
                        if (j11 == j10 || i11 == i10) {
                            if (i11 != i10) {
                                j10 = get();
                                if (j11 == j10) {
                                    this.f96454c = i11;
                                    j10 = addAndGet(-j11);
                                }
                            } else if (!this.f96455e) {
                                aVar.onComplete();
                                break;
                            }
                        } else if (this.f96455e) {
                            break;
                        } else {
                            if (aVar.tryOnNext(Integer.valueOf(i11))) {
                                j11++;
                            }
                            i11++;
                        }
                    }
                } while (j10 != 0);
                break;
            default:
                int i12 = this.f96453b;
                int i13 = this.f96454c;
                tw.c cVar = this.f96494g;
                do {
                    long j12 = 0;
                    while (true) {
                        if (j12 == j10 || i13 == i12) {
                            if (i13 != i12) {
                                j10 = get();
                                if (j12 == j10) {
                                    this.f96454c = i13;
                                    j10 = addAndGet(-j12);
                                }
                            } else if (!this.f96455e) {
                                cVar.onComplete();
                                break;
                            }
                        } else if (this.f96455e) {
                            break;
                        } else {
                            cVar.onNext(Integer.valueOf(i13));
                            j12++;
                            i13++;
                        }
                    }
                } while (j10 != 0);
                break;
        }
    }
}
