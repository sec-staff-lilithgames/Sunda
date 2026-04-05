package am;

import android.content.Context;
import io.bidmachine.AdsFormat;
import zl.l;
import zl.s;
import zl.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f4445a;

    /* renamed from: b, reason: collision with root package name */
    public final vr.a f4446b;

    public a(int i10, vr.a aVar) {
        this.f4445a = i10;
        this.f4446b = aVar;
    }

    @Override // am.b
    public abstract /* synthetic */ t createAd(l lVar, AdsFormat adsFormat, s sVar);

    @Override // am.b
    public int getMinDeviceApiVersion() {
        return this.f4445a;
    }

    @Override // am.b
    public abstract /* synthetic */ vr.a getVersion() throws Throwable;

    @Override // am.b
    public vr.a getVersionForWhichCompiled() {
        return this.f4446b;
    }

    @Override // am.b
    public abstract /* synthetic */ void initialize(Context context) throws Throwable;

    @Override // am.b
    public abstract /* synthetic */ boolean isGAMPresent(Context context);
}
