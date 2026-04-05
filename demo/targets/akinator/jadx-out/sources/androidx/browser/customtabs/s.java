package androidx.browser.customtabs;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5277b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5278c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5279e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5280f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5281g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Bundle f5282h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u f5283i;

    public s(u uVar, int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
        this.f5283i = uVar;
        this.f5277b = i10;
        this.f5278c = i11;
        this.f5279e = i12;
        this.f5280f = i13;
        this.f5281g = i14;
        this.f5282h = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f5283i.f5287c.onActivityLayout(this.f5277b, this.f5278c, this.f5279e, this.f5280f, this.f5281g, this.f5282h);
    }
}
