package lm;

import android.text.TextUtils;
import fn.t;
import hr.k;
import hr.o;
import pr.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e extends o {

    /* renamed from: b, reason: collision with root package name */
    public final String f73405b;

    /* renamed from: c, reason: collision with root package name */
    public final qm.a f73406c;

    /* renamed from: d, reason: collision with root package name */
    public final float f73407d;

    /* renamed from: e, reason: collision with root package name */
    public final int f73408e;

    /* renamed from: f, reason: collision with root package name */
    public final int f73409f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f73410g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f73411h;

    public e(k kVar) {
        super(kVar);
        this.f73405b = kVar.getStringOrNull("creativeAdm");
        this.f73406c = g.toCacheControl(kVar.getObjectOrNull("cacheControl"));
        this.f73407d = kVar.getFloat("placeholderTimeoutSec");
        this.f73408e = kVar.getInteger("skipOffset");
        this.f73409f = kVar.getInteger("companionSkipOffset");
        this.f73410g = kVar.getBoolean("useNativeClose");
        this.f73411h = kVar.getBoolean("omsdk_enabled", true) && t.isInitialized();
    }

    @Override // hr.o
    public boolean isValid(hr.c cVar) {
        if (!TextUtils.isEmpty(this.f73405b)) {
            return true;
        }
        cVar.onAdLoadFailed(pr.a.notFound("creativeAdm"));
        return false;
    }
}
