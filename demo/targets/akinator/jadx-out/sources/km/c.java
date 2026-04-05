package km;

import android.text.TextUtils;
import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.Constants;
import hr.k;
import hr.o;
import io.bidmachine.LabelData;
import io.bidmachine.PrivacySheetData;
import j1.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c extends o {

    /* renamed from: b, reason: collision with root package name */
    public final String f71587b;

    /* renamed from: c, reason: collision with root package name */
    public final String f71588c;

    /* renamed from: d, reason: collision with root package name */
    public final String f71589d;

    /* renamed from: e, reason: collision with root package name */
    public final Float f71590e;

    /* renamed from: f, reason: collision with root package name */
    public final String f71591f;

    /* renamed from: g, reason: collision with root package name */
    public final String f71592g;

    /* renamed from: h, reason: collision with root package name */
    public final String f71593h;

    /* renamed from: i, reason: collision with root package name */
    public final String f71594i;

    /* renamed from: j, reason: collision with root package name */
    public final String f71595j;

    /* renamed from: k, reason: collision with root package name */
    public final LabelData f71596k;

    /* renamed from: l, reason: collision with root package name */
    public final PrivacySheetData f71597l;

    public c(k kVar) {
        super(kVar);
        this.f71587b = kVar.getStringOrNull("title");
        this.f71588c = kVar.getStringOrNull("description");
        this.f71589d = kVar.getStringOrNull(C3191e4.h.G0);
        this.f71590e = kVar.getFloatOrNull(CampaignEx.JSON_KEY_STAR);
        this.f71591f = kVar.getStringOrNull("iconUrl");
        this.f71592g = kVar.getStringOrNull("imageUrl");
        this.f71593h = kVar.getStringOrNull("videoUrl");
        this.f71594i = kVar.getStringOrNull("videoAdm");
        this.f71595j = kVar.getStringOrNull(Constants.CLICK_URL);
        this.f71596k = (LabelData) kVar.getOrNullSafely("adLabel", new u(13));
        this.f71597l = (PrivacySheetData) kVar.getOrNullSafely("privacySheet", new u(14));
    }

    @Override // hr.o
    public boolean isValid(hr.c cVar) {
        if (TextUtils.isEmpty(this.f71587b)) {
            cVar.onAdLoadFailed(pr.a.notFound("title"));
            return false;
        }
        if (!TextUtils.isEmpty(this.f71589d)) {
            return true;
        }
        cVar.onAdLoadFailed(pr.a.notFound(C3191e4.h.G0));
        return false;
    }
}
