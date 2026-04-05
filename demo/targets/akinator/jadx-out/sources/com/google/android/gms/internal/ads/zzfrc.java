package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfrc implements zzfqd {
    private static final zzfrc zza = new zzfrc();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzk = new zzfqy();
    private static final Runnable zzl = new zzfqz();
    private int zze;
    private long zzj;
    private final List zzd = new ArrayList();
    private final List zzf = new ArrayList();
    private final zzfqv zzh = new zzfqv();
    private final zzfqf zzg = new zzfqf();
    private final zzfqw zzi = new zzfqw(new zzfrf());

    public static zzfrc zzb() {
        return zza;
    }

    private final void zzk(View view, zzfqe zzfqeVar, JSONObject jSONObject, int i10, boolean z10) {
        zzfqeVar.zzb(view, jSONObject, this, i10 == 1, z10);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zzl);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqd
    public final void zza(View view, zzfqe zzfqeVar, JSONObject jSONObject, boolean z10) throws JSONException {
        zzfqv zzfqvVar;
        int iZzl;
        boolean z11;
        zzfrc zzfrcVar;
        View view2;
        zzfqe zzfqeVar2;
        boolean z12;
        if (zzfqt.zza(view) != null || (iZzl = (zzfqvVar = this.zzh).zzl(view)) == 3) {
            return;
        }
        JSONObject jSONObjectZza = zzfqeVar.zza(view);
        zzfqo.zze(jSONObject, jSONObjectZza);
        String strZzg = zzfqvVar.zzg(view);
        if (strZzg != null) {
            zzfqo.zzd(jSONObjectZza, strZzg);
            try {
                jSONObjectZza.put("hasWindowFocus", Boolean.valueOf(this.zzh.zzj(view)));
            } catch (JSONException e10) {
                zzfqp.zza("Error with setting has window focus", e10);
            }
            boolean zZzk = this.zzh.zzk(strZzg);
            Boolean boolValueOf = Boolean.valueOf(zZzk);
            if (zZzk) {
                try {
                    jSONObjectZza.put("isPipActive", boolValueOf);
                } catch (JSONException e11) {
                    zzfqp.zza("Error with setting is picture-in-picture active", e11);
                }
            }
            this.zzh.zzf();
            zzfrcVar = this;
        } else {
            zzfqu zzfquVarZzi = zzfqvVar.zzi(view);
            if (zzfquVarZzi != null) {
                zzfpv zzfpvVarZzb = zzfquVarZzi.zzb();
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayListZzc = zzfquVarZzi.zzc();
                int size = arrayListZzc.size();
                for (int i10 = 0; i10 < size; i10++) {
                    jSONArray.put((String) arrayListZzc.get(i10));
                }
                try {
                    jSONObjectZza.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectZza.put("friendlyObstructionClass", zzfpvVarZzb.zzb());
                    jSONObjectZza.put("friendlyObstructionPurpose", zzfpvVarZzb.zzc());
                    jSONObjectZza.put("friendlyObstructionReason", zzfpvVarZzb.zzd());
                } catch (JSONException e12) {
                    zzfqp.zza("Error with setting friendly obstruction", e12);
                }
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 || z11) {
                zzfrcVar = this;
                view2 = view;
                zzfqeVar2 = zzfqeVar;
                z12 = true;
            } else {
                view2 = view;
                zzfqeVar2 = zzfqeVar;
                z12 = false;
                zzfrcVar = this;
            }
            zzfrcVar.zzk(view2, zzfqeVar2, jSONObjectZza, iZzl, z12);
        }
        zzfrcVar.zze++;
    }

    public final void zzc() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzk);
            zzc.postDelayed(zzl, 200L);
        }
    }

    public final void zzd() {
        zzl();
        this.zzd.clear();
        zzb.post(new zzfqx(this));
    }

    public final void zze() {
        zzl();
    }

    public final /* synthetic */ void zzf() throws JSONException {
        zzfrc zzfrcVar;
        this.zze = 0;
        this.zzf.clear();
        for (zzfoy zzfoyVar : zzfps.zza().zzf()) {
        }
        this.zzj = System.nanoTime();
        zzfqv zzfqvVar = this.zzh;
        zzfqvVar.zzd();
        zzfqf zzfqfVar = this.zzg;
        long jNanoTime = System.nanoTime();
        zzfqe zzfqeVarZza = zzfqfVar.zza();
        if (zzfqvVar.zzb().size() > 0) {
            Iterator it = zzfqvVar.zzb().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject jSONObjectZza = zzfqeVarZza.zza(null);
                View viewZzh = zzfqvVar.zzh(str);
                zzfqe zzfqeVarZzb = zzfqfVar.zzb();
                String strZzc = zzfqvVar.zzc(str);
                if (strZzc != null) {
                    JSONObject jSONObjectZza2 = zzfqeVarZzb.zza(viewZzh);
                    zzfqo.zzd(jSONObjectZza2, str);
                    try {
                        jSONObjectZza2.put("notVisibleReason", strZzc);
                    } catch (JSONException e10) {
                        zzfqp.zza("Error with setting not visible reason", e10);
                    }
                    zzfqo.zze(jSONObjectZza, jSONObjectZza2);
                }
                zzfqo.zzf(jSONObjectZza);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                this.zzi.zzb(jSONObjectZza, hashSet, jNanoTime);
            }
        }
        zzfqv zzfqvVar2 = this.zzh;
        if (zzfqvVar2.zza().size() > 0) {
            JSONObject jSONObjectZza3 = zzfqeVarZza.zza(null);
            zzfrcVar = this;
            zzfrcVar.zzk(null, zzfqeVarZza, jSONObjectZza3, 1, false);
            zzfqo.zzf(jSONObjectZza3);
            zzfrcVar.zzi.zza(jSONObjectZza3, zzfqvVar2.zza(), jNanoTime);
        } else {
            zzfrcVar = this;
            zzfrcVar.zzi.zzc();
        }
        zzfqvVar2.zze();
        long jNanoTime2 = System.nanoTime() - zzfrcVar.zzj;
        List<zzfrb> list = zzfrcVar.zzd;
        if (list.size() > 0) {
            for (zzfrb zzfrbVar : list) {
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                zzfrbVar.zzb();
                if (zzfrbVar instanceof zzfra) {
                    ((zzfra) zzfrbVar).zza();
                }
            }
        }
        zzfqc.zza().zzc();
    }

    public final /* synthetic */ zzfqw zzh() {
        return this.zzi;
    }
}
