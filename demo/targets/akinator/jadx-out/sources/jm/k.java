package jm;

import android.text.TextUtils;
import fn.t;
import hr.o;
import io.bidmachine.protobuf.AdExtension;
import um.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k extends o {

    /* renamed from: b, reason: collision with root package name */
    public final String f69694b;

    /* renamed from: c, reason: collision with root package name */
    public final int f69695c;

    /* renamed from: d, reason: collision with root package name */
    public final int f69696d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f69697e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f69698f;

    /* renamed from: g, reason: collision with root package name */
    public final qm.a f69699g;

    /* renamed from: h, reason: collision with root package name */
    public final float f69700h;

    /* renamed from: i, reason: collision with root package name */
    public final int f69701i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f69702j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f69703k;

    /* renamed from: l, reason: collision with root package name */
    public final String f69704l;

    /* renamed from: m, reason: collision with root package name */
    public final int f69705m;

    /* renamed from: n, reason: collision with root package name */
    public final p f69706n;

    /* renamed from: o, reason: collision with root package name */
    public final p f69707o;

    /* renamed from: p, reason: collision with root package name */
    public final p f69708p;

    public k(hr.k kVar) {
        super(kVar);
        this.f69694b = kVar.getStringOrNull("creativeAdm");
        this.f69695c = kVar.getInteger("width");
        this.f69696d = kVar.getInteger("height");
        this.f69699g = pr.g.toCacheControl(kVar.getObjectOrNull("cacheControl"));
        this.f69700h = kVar.getFloat("placeholderTimeoutSec");
        this.f69701i = kVar.getInteger("skipOffset");
        this.f69697e = kVar.getBoolean("useNativeClose");
        this.f69698f = kVar.getBoolean("omsdk_enabled", true) && t.isInitialized();
        this.f69702j = kVar.getBoolean("r1");
        this.f69703k = kVar.getBoolean("r2");
        this.f69704l = kVar.getStringOrNull("store_url");
        this.f69705m = kVar.getInteger("progress_duration");
        Object objectOrNull = kVar.getObjectOrNull("close_button_control_asset");
        this.f69706n = objectOrNull instanceof AdExtension.ControlAsset ? pr.g.transform((AdExtension.ControlAsset) objectOrNull) : null;
        Object objectOrNull2 = kVar.getObjectOrNull("countdown_control_asset");
        this.f69707o = objectOrNull2 instanceof AdExtension.ControlAsset ? pr.g.transform((AdExtension.ControlAsset) objectOrNull2) : null;
        Object objectOrNull3 = kVar.getObjectOrNull("progress_control_asset");
        this.f69708p = objectOrNull3 instanceof AdExtension.ControlAsset ? pr.g.transform((AdExtension.ControlAsset) objectOrNull3) : null;
    }

    @Override // hr.o
    public boolean isValid(hr.c cVar) {
        if (TextUtils.isEmpty(this.f69694b)) {
            cVar.onAdLoadFailed(pr.a.notFound("creativeAdm"));
            return false;
        }
        if (this.f69695c == 0) {
            cVar.onAdLoadFailed(pr.a.notFound("width"));
            return false;
        }
        if (this.f69696d != 0) {
            return true;
        }
        cVar.onAdLoadFailed(pr.a.notFound("height"));
        return false;
    }
}
