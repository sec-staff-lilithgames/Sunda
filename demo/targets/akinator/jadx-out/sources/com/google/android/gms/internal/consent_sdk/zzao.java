package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzao implements zzd {
    private final Application zza;
    private final zzaq zzb;
    private final zzl zzc;
    private final Executor zzd;

    public zzao(Application application, zzaq zzaqVar, zzl zzlVar, Executor executor) {
        this.zza = application;
        this.zzb = zzaqVar;
        this.zzd = executor;
        this.zzc = zzlVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final Executor zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final boolean zzb(String str, JSONObject jSONObject) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iHashCode = str.hashCode();
        if (iHashCode != 94746189) {
            if (iHashCode == 113399775 && str.equals("write")) {
                zzco zzcoVar = new zzco(this.zza);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObject.opt(next);
                    Log.d("UserMessagingPlatform", "Writing to storage: [" + next + "] " + String.valueOf(objOpt));
                    if (zzcoVar.zze(next, objOpt)) {
                        this.zzb.zzd().add(next);
                    } else {
                        Log.d("UserMessagingPlatform", "Failed writing key: ".concat(String.valueOf(next)));
                    }
                }
                this.zzb.zzf();
                zzcoVar.zzc();
                Map mapZzb = zzcoVar.zzb();
                if (mapZzb.size() > 1) {
                    this.zzc.zza(mapZzb);
                    zzcoVar.zzd();
                }
                return true;
            }
        } else if (str.equals("clear")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("keys");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                Log.d("UserMessagingPlatform", "Action[clear]: wrong args.".concat(String.valueOf(jSONObject.toString())));
            } else {
                HashSet hashSet = new HashSet();
                int length = jSONArrayOptJSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i10);
                    if (TextUtils.isEmpty(strOptString)) {
                        o2.z(i10, "Action[clear]: empty key at index: ", "UserMessagingPlatform");
                    } else {
                        hashSet.add(strOptString);
                    }
                }
                zzcp.zzb(this.zza, hashSet);
            }
            return true;
        }
        return false;
    }
}
