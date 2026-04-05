package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdoe {
    private final com.google.android.gms.ads.internal.util.zzbl zza;
    private final Clock zzb;
    private final Executor zzc;

    public zzdoe(com.google.android.gms.ads.internal.util.zzbl zzblVar, Clock clock, Executor executor) {
        this.zza = zzblVar;
        this.zzb = clock;
        this.zzc = executor;
    }

    private final Bitmap zzc(byte[] bArr, BitmapFactory.Options options) {
        Clock clock = this.zzb;
        long jElapsedRealtime = clock.elapsedRealtime();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long jElapsedRealtime2 = clock.elapsedRealtime();
        if (bitmapDecodeByteArray != null) {
            long j10 = jElapsedRealtime2 - jElapsedRealtime;
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            int allocationByteCount = bitmapDecodeByteArray.getAllocationByteCount();
            boolean z10 = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + String.valueOf(width).length() + 20 + String.valueOf(height).length() + 8 + String.valueOf(allocationByteCount).length() + 7 + 15 + String.valueOf(z10).length());
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.o(width, height, "Decoded image w: ", " h:", sb2);
            sb2.append(" bytes: ");
            sb2.append(allocationByteCount);
            sb2.append(" time: ");
            sb2.append(j10);
            sb2.append(" on ui thread: ");
            sb2.append(z10);
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        }
        return bitmapDecodeByteArray;
    }

    public final n1 zza(String str, final double d10, final boolean z10) {
        return zzgui.zzk(this.zza.zza(str), new zzglu() { // from class: com.google.android.gms.internal.ads.zzdod
            @Override // com.google.android.gms.internal.ads.zzglu
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzb(d10, z10, (zzapq) obj);
            }
        }, this.zzc);
    }

    public final /* synthetic */ Bitmap zzb(double d10, boolean z10, zzapq zzapqVar) {
        byte[] bArr = zzapqVar.zzb;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d10 * 160.0d);
        if (!z10) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgI)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zzc(bArr, options);
            options.inJustDecodeBounds = false;
            int i10 = options.outWidth * options.outHeight;
            if (i10 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i10 - 1) / ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgJ)).intValue())) / 2);
            }
        }
        return zzc(bArr, options);
    }
}
