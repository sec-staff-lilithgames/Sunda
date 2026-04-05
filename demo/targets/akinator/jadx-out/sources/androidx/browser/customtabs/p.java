package androidx.browser.customtabs;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5263b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f5264c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f5265e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f5266f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u f5267g;

    public p(u uVar, int i10, Uri uri, boolean z10, Bundle bundle) {
        this.f5267g = uVar;
        this.f5263b = i10;
        this.f5264c = uri;
        this.f5265e = z10;
        this.f5266f = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f5267g.f5287c.onRelationshipValidationResult(this.f5263b, this.f5264c, this.f5265e, this.f5266f);
    }
}
