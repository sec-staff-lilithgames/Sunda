package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzekk implements zzehk {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzehk
    public final boolean zza(zzfgf zzfgfVar, zzffu zzffuVar) {
        return !TextUtils.isEmpty(zzffuVar.zzv.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    @Override // com.google.android.gms.internal.ads.zzehk
    public final n1 zzb(zzfgf zzfgfVar, zzffu zzffuVar) {
        JSONObject jSONObject = zzffuVar.zzv;
        String strOptString = jSONObject.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        zzfgn zzfgnVar = zzfgfVar.zza.zza;
        zzfgm zzfgmVar = new zzfgm();
        zzfgmVar.zzy(zzfgnVar);
        zzfgmVar.zzg(strOptString);
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfgnVar.zzd;
        Bundle bundleZzd = zzd(zzmVar.zzm);
        Bundle bundleZzd2 = zzd(bundleZzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        bundleZzd2.putInt("gw", 1);
        String strOptString2 = jSONObject.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundleZzd2.putString("mad_hac", strOptString2);
        }
        String strOptString3 = jSONObject.optString("adJson", null);
        if (strOptString3 != null) {
            bundleZzd2.putString("_ad", strOptString3);
        }
        bundleZzd2.putBoolean("_noRefresh", true);
        JSONObject jSONObject2 = zzffuVar.zzD;
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = jSONObject2.optString(next, null);
            if (next != null) {
                bundleZzd2.putString(next, strOptString4);
            }
        }
        bundleZzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundleZzd2);
        zzfgmVar.zza(new com.google.android.gms.ads.internal.client.zzm(zzmVar.zza, zzmVar.zzb, bundleZzd2, zzmVar.zzd, zzmVar.zze, zzmVar.zzf, zzmVar.zzg, zzmVar.zzh, zzmVar.zzi, zzmVar.zzj, zzmVar.zzk, zzmVar.zzl, bundleZzd, zzmVar.zzn, zzmVar.zzo, zzmVar.zzp, zzmVar.zzq, zzmVar.zzr, zzmVar.zzs, zzmVar.zzt, zzmVar.zzu, zzmVar.zzv, zzmVar.zzw, zzmVar.zzx, zzmVar.zzy, zzmVar.zzz, zzmVar.zzA));
        zzfgn zzfgnVarZzz = zzfgmVar.zzz();
        Bundle bundle = new Bundle();
        zzffx zzffxVar = zzfgfVar.zzb.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(zzffxVar.zza));
        bundle2.putInt("refresh_interval", zzffxVar.zzc);
        bundle2.putString("gws_query_id", zzffxVar.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        String str = zzfgnVar.zzg;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", zzffuVar.zzw);
        bundle3.putString("ad_source_name", zzffuVar.zzF);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(zzffuVar.zzc));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(zzffuVar.zzd));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzffuVar.zzp));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(zzffuVar.zzm));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(zzffuVar.zzg));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(zzffuVar.zzh));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(zzffuVar.zzi));
        bundle3.putString(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, zzffuVar.zzj);
        bundle3.putString("valid_from_timestamp", zzffuVar.zzk);
        bundle3.putBoolean("is_closable_area_disabled", zzffuVar.zzP);
        bundle3.putString("recursive_server_response_data", zzffuVar.zzao);
        bundle3.putBoolean("is_analytics_logging_enabled", zzffuVar.zzW);
        zzbyh zzbyhVar = zzffuVar.zzl;
        if (zzbyhVar != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzbyhVar.zzb);
            bundle4.putString("rb_type", zzbyhVar.zza);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zzc(zzfgnVarZzz, bundle, zzffuVar, zzfgfVar);
    }

    public abstract n1 zzc(zzfgn zzfgnVar, Bundle bundle, zzffu zzffuVar, zzfgf zzfgfVar);
}
