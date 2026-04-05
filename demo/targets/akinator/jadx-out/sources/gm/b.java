package gm;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import em.j0;
import em.l0;
import em.u;
import em.w;
import io.bidmachine.AdsFormat;
import io.bidmachine.protobuf.Waterfall;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class b extends fm.a {
    public b() {
        super(19, new vr.a(21, 0, 0));
    }

    @Override // fm.a, fm.b
    public u createAd(j0 j0Var, l0 l0Var, AdsFormat adsFormat, Waterfall.Configuration.AdUnit adUnit, w wVar) {
        switch (a.f57706a[adsFormat.ordinal()]) {
            case 1:
            case 2:
                return new f(j0Var, l0Var, adsFormat, adUnit, wVar, AdSize.BANNER);
            case 3:
                return new f(j0Var, l0Var, adsFormat, adUnit, wVar, AdSize.LEADERBOARD);
            case 4:
                return new f(j0Var, l0Var, adsFormat, adUnit, wVar, AdSize.MEDIUM_RECTANGLE);
            case 5:
            case 6:
            case 7:
                return new j(j0Var, l0Var, adsFormat, adUnit, wVar);
            case 8:
            case 9:
            case 10:
                return new n(j0Var, l0Var, adsFormat, adUnit, wVar);
            default:
                return null;
        }
    }

    @Override // fm.a, fm.b
    public vr.a getVersion() {
        VersionInfo version = MobileAds.getVersion();
        return new vr.a(version.getMajorVersion(), version.getMinorVersion(), version.getMicroVersion());
    }

    @Override // fm.a, fm.b
    public void initialize(Context context) {
        MobileAds.initialize(context);
    }

    @Override // fm.a, fm.b
    public boolean isGAMPresent(Context context) {
        boolean z10;
        try {
        } catch (Exception unused) {
        }
        if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData == null ? false : !TextUtils.isEmpty(r5.getString("com.google.android.gms.ads.APPLICATION_ID"))) {
            try {
                int i10 = AdManagerAdView.f28828b;
                z10 = true;
            } catch (Exception unused2) {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }
}
