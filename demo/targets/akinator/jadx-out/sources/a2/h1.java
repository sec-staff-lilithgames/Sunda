package a2;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h1 implements ComponentCallbacks2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.b1 f3609b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d2.b f3610c;

    public h1(kotlin.jvm.internal.b1 b1Var, d2.b bVar) {
        this.f3609b = b1Var;
        this.f3610c = bVar;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        kotlin.jvm.internal.e0.checkNotNullParameter(configuration, "configuration");
        kotlin.jvm.internal.b1 b1Var = this.f3609b;
        Configuration configuration2 = (Configuration) b1Var.f71816b;
        this.f3610c.prune(configuration2 != null ? configuration2.updateFrom(configuration) : -1);
        b1Var.f71816b = configuration;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f3610c.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        this.f3610c.clear();
    }
}
