package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class nh implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38000b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q2 f38001c;

    public /* synthetic */ nh(Q2 q22, int i10) {
        this.f38000b = i10;
        this.f38001c = q22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38000b) {
            case 0:
                Q2.a(this.f38001c);
                break;
            case 1:
                Q2.b(this.f38001c);
                break;
            default:
                Q2.c(this.f38001c);
                break;
        }
    }
}
