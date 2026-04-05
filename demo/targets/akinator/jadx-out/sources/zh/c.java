package zh;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzjo;
import com.mbridge.msdk.MBridgeConstans;
import kotlinx.coroutines.DebugKt;
import nh.b5;
import nh.l6;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final l6 f97968a = l6.of("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* renamed from: b, reason: collision with root package name */
    public static final b5 f97969b = b5.of("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c, reason: collision with root package name */
    public static final b5 f97970c = b5.of(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, MBridgeConstans.DYNAMIC_VIEW_WX_APP, "am");

    /* renamed from: d, reason: collision with root package name */
    public static final b5 f97971d = b5.of("_r", "_dbg");

    /* renamed from: e, reason: collision with root package name */
    public static final b5 f97972e = new x4().add((Object[]) zzjo.zza).add((Object[]) zzjo.zzb).build();

    /* renamed from: f, reason: collision with root package name */
    public static final b5 f97973f = b5.of("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static boolean zza(String str) {
        return !f97970c.contains(str);
    }

    public static boolean zzb(String str, Bundle bundle) {
        if (f97969b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        b5 b5Var = f97971d;
        int size = b5Var.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zContainsKey = bundle.containsKey((String) b5Var.get(i10));
            i10++;
            if (zContainsKey) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzc(String str) {
        return !f97968a.contains(str);
    }

    public static boolean zzd(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals(AppMeasurement.FIAM_ORIGIN);
        }
        if (f97972e.contains(str2)) {
            return false;
        }
        b5 b5Var = f97973f;
        int size = b5Var.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zMatches = str2.matches((String) b5Var.get(i10));
            i10++;
            if (zMatches) {
                return false;
            }
        }
        return true;
    }

    public static boolean zze(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!zza(str) || bundle == null) {
            return false;
        }
        b5 b5Var = f97971d;
        int size = b5Var.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zContainsKey = bundle.containsKey((String) b5Var.get(i10));
            i10++;
            if (zContainsKey) {
                return false;
            }
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 101200) {
            if (iHashCode != 101230) {
                if (iHashCode == 3142703 && str.equals(AppMeasurement.FIAM_ORIGIN)) {
                    bundle.putString("_cis", "fiam_integration");
                    return true;
                }
            } else if (str.equals("fdl")) {
                bundle.putString("_cis", "fdl_integration");
                return true;
            }
        } else if (str.equals(AppMeasurement.FCM_ORIGIN)) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        return false;
    }
}
