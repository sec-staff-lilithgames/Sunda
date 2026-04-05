package com.google.android.gms.analytics.ecommerce;

import com.google.android.gms.analytics.zzd;
import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.Preconditions;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.HashMap;
import java.util.Map;
import qm.zMPW.GalEuEfxjome;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class Product {
    final Map zza = new HashMap();

    public Product setBrand(String str) {
        zzb(TtmlNode.TAG_BR, str);
        return this;
    }

    public Product setCouponCode(String str) {
        zzb("cc", str);
        return this;
    }

    public Product setCustomDimension(int i10, String str) {
        zzb(zzd.zzc(i10), str);
        return this;
    }

    public Product setCustomMetric(int i10, int i11) {
        zzb(zzd.zzf(i10), Integer.toString(i11));
        return this;
    }

    public Product setId(String str) {
        zzb("id", str);
        return this;
    }

    public Product setName(String str) {
        zzb("nm", str);
        return this;
    }

    public Product setPosition(int i10) {
        zzb("ps", Integer.toString(i10));
        return this;
    }

    public Product setPrice(double d10) {
        zzb("pr", Double.toString(d10));
        return this;
    }

    public Product setQuantity(int i10) {
        zzb(DownloadCommon.DOWNLOAD_REPORT_QUERY_TIMEOUT, Integer.toString(i10));
        return this;
    }

    public Product setVariant(String str) {
        zzb("va", str);
        return this;
    }

    public String toString() {
        return zzj.zzb(this.zza);
    }

    public final Map zza(String str) {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.zza.entrySet()) {
            String strValueOf = String.valueOf((String) entry.getKey());
            map.put(str.concat(strValueOf), (String) entry.getValue());
        }
        return map;
    }

    public final void zzb(String str, String str2) {
        Preconditions.checkNotNull(str, "Name should be non-null");
        this.zza.put(str, str2);
    }

    public Product setCategory(String str) {
        zzb(GalEuEfxjome.JZuqKy, str);
        return this;
    }
}
