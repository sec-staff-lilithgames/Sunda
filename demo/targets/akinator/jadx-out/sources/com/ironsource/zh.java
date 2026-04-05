package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class zh implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39397b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3318l6 f39398c;

    public /* synthetic */ zh(C3318l6 c3318l6, int i10) {
        this.f39397b = i10;
        this.f39398c = c3318l6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39397b) {
            case 0:
                C3318l6.a(this.f39398c);
                break;
            case 1:
                C3318l6.b(this.f39398c);
                break;
            case 2:
                C3318l6.e(this.f39398c);
                break;
            case 3:
                C3318l6.c(this.f39398c);
                break;
            default:
                C3318l6.d(this.f39398c);
                break;
        }
    }
}
