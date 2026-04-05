package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class mi implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37908b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3539y2 f37909c;

    public /* synthetic */ mi(C3539y2 c3539y2, int i10) {
        this.f37908b = i10;
        this.f37909c = c3539y2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37908b) {
            case 0:
                C3539y2.a(this.f37909c);
                break;
            case 1:
                C3539y2.e(this.f37909c);
                break;
            case 2:
                C3539y2.c(this.f37909c);
                break;
            case 3:
                C3539y2.b(this.f37909c);
                break;
            default:
                C3539y2.d(this.f37909c);
                break;
        }
    }
}
