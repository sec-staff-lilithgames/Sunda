package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class ei implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36624b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3424r6 f36625c;

    public /* synthetic */ ei(C3424r6 c3424r6, int i10) {
        this.f36624b = i10;
        this.f36625c = c3424r6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36624b) {
            case 0:
                C3424r6.b(this.f36625c);
                break;
            case 1:
                C3424r6.c(this.f36625c);
                break;
            default:
                C3424r6.a(this.f36625c);
                break;
        }
    }
}
