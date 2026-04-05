package fm;

import android.content.Context;
import em.j0;
import em.l0;
import em.u;
import em.w;
import io.bidmachine.AdsFormat;
import io.bidmachine.protobuf.Waterfall;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f55736a;

    /* renamed from: b, reason: collision with root package name */
    public final vr.a f55737b;

    public a(int i10, vr.a aVar) {
        this.f55736a = i10;
        this.f55737b = aVar;
    }

    @Override // fm.b
    public abstract /* synthetic */ u createAd(j0 j0Var, l0 l0Var, AdsFormat adsFormat, Waterfall.Configuration.AdUnit adUnit, w wVar);

    @Override // fm.b
    public int getMinDeviceApiVersion() {
        return this.f55736a;
    }

    @Override // fm.b
    public abstract /* synthetic */ vr.a getVersion() throws Throwable;

    @Override // fm.b
    public vr.a getVersionForWhichCompiled() {
        return this.f55737b;
    }

    @Override // fm.b
    public abstract /* synthetic */ void initialize(Context context) throws Throwable;

    @Override // fm.b
    public abstract /* synthetic */ boolean isGAMPresent(Context context);
}
