package com.google.android.gms.internal.ads;

import com.ironsource.C3191e4;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzaqx extends zzapu {
    private final Object zza;
    private final zzapz zzb;

    public zzaqx(int i10, String str, zzapz zzapzVar, zzapy zzapyVar) {
        super(i10, str, zzapyVar);
        this.zza = new Object();
        this.zzb = zzapzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapu
    public final zzaqa zzr(zzapq zzapqVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzapqVar.zzb;
            Map map = zzapqVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                int i10 = 1;
                while (true) {
                    if (i10 >= strArrSplit.length) {
                        break;
                    }
                    String[] strArrSplit2 = strArrSplit[i10].trim().split(C3191e4.i.f36525b, 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                    i10++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzapqVar.zzb);
        }
        return zzaqa.zza(str, zzaqr.zza(zzapqVar));
    }

    @Override // com.google.android.gms.internal.ads.zzapu
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzs(String str) {
        zzapz zzapzVar;
        synchronized (this.zza) {
            zzapzVar = this.zzb;
        }
        zzapzVar.zza(str);
    }
}
