package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class pi implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38193b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3553z f38194c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38195e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f38196f;

    public /* synthetic */ pi(AbstractC3553z abstractC3553z, int i10, String str, int i11) {
        this.f38193b = i11;
        this.f38194c = abstractC3553z;
        this.f38195e = i10;
        this.f38196f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38193b) {
            case 0:
                AbstractC3553z.b(this.f38194c, this.f38195e, this.f38196f);
                break;
            default:
                AbstractC3553z.a(this.f38194c, this.f38195e, this.f38196f);
                break;
        }
    }
}
