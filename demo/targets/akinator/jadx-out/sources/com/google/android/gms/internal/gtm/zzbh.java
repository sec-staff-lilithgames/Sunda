package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbh extends zzbr {
    public static boolean zza;
    private AdvertisingIdClient.Info zzb;
    private final zzfb zzc;
    private String zzd;
    private boolean zze;
    private final Object zzf;

    public zzbh(zzbu zzbuVar) {
        super(zzbuVar);
        this.zze = false;
        this.zzf = new Object();
        this.zzc = new zzfb(zzbuVar.zzr());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038 A[Catch: all -> 0x001b, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0012, B:17:0x0032, B:21:0x003c, B:71:0x0141, B:24:0x0044, B:25:0x004e, B:72:0x0144, B:75:0x0154, B:20:0x0038, B:12:0x001f, B:14:0x0023, B:16:0x002c, B:76:0x0155, B:26:0x004f, B:29:0x0054, B:31:0x006c, B:37:0x0085, B:38:0x008e, B:39:0x0093, B:45:0x009d, B:47:0x00b1, B:53:0x00c2, B:54:0x00d5, B:56:0x00d7, B:51:0x00bc, B:57:0x00ec, B:59:0x0105, B:61:0x0107, B:63:0x010f, B:65:0x0111, B:67:0x0119, B:68:0x012b, B:69:0x013e, B:46:0x00ac), top: B:83:0x0001, inners: #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044 A[Catch: all -> 0x001b, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0012, B:17:0x0032, B:21:0x003c, B:71:0x0141, B:24:0x0044, B:25:0x004e, B:72:0x0144, B:75:0x0154, B:20:0x0038, B:12:0x001f, B:14:0x0023, B:16:0x002c, B:76:0x0155, B:26:0x004f, B:29:0x0054, B:31:0x006c, B:37:0x0085, B:38:0x008e, B:39:0x0093, B:45:0x009d, B:47:0x00b1, B:53:0x00c2, B:54:0x00d5, B:56:0x00d7, B:51:0x00bc, B:57:0x00ec, B:59:0x0105, B:61:0x0107, B:63:0x010f, B:65:0x0111, B:67:0x0119, B:68:0x012b, B:69:0x013e, B:46:0x00ac), top: B:83:0x0001, inners: #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0144 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0012, B:17:0x0032, B:21:0x003c, B:71:0x0141, B:24:0x0044, B:25:0x004e, B:72:0x0144, B:75:0x0154, B:20:0x0038, B:12:0x001f, B:14:0x0023, B:16:0x002c, B:76:0x0155, B:26:0x004f, B:29:0x0054, B:31:0x006c, B:37:0x0085, B:38:0x008e, B:39:0x0093, B:45:0x009d, B:47:0x00b1, B:53:0x00c2, B:54:0x00d5, B:56:0x00d7, B:51:0x00bc, B:57:0x00ec, B:59:0x0105, B:61:0x0107, B:63:0x010f, B:65:0x0111, B:67:0x0119, B:68:0x012b, B:69:0x013e, B:46:0x00ac), top: B:83:0x0001, inners: #6, #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized com.google.android.gms.ads.identifier.AdvertisingIdClient.Info zzc() {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzbh.zzc():com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
    }

    private static String zze(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigestZze = zzff.zze(SameMD5.TAG);
        if (messageDigestZze == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestZze.digest(str.getBytes())));
    }

    private final boolean zzf(String str) throws NoSuchAlgorithmException, IOException {
        try {
            String strZze = zze(str);
            zzN("Storing hashed adid.");
            FileOutputStream fileOutputStreamOpenFileOutput = zzo().openFileOutput("gaClientIdData", 0);
            fileOutputStreamOpenFileOutput.write(strZze.getBytes());
            fileOutputStreamOpenFileOutput.close();
            this.zzd = strZze;
            return true;
        } catch (IOException e10) {
            zzJ("Error creating hash file", e10);
            return false;
        }
    }

    public final String zza() {
        zzV();
        AdvertisingIdClient.Info infoZzc = zzc();
        String id2 = infoZzc != null ? infoZzc.getId() : null;
        if (TextUtils.isEmpty(id2)) {
            return null;
        }
        return id2;
    }

    public final boolean zzb() {
        zzV();
        AdvertisingIdClient.Info infoZzc = zzc();
        return (infoZzc == null || infoZzc.isLimitAdTrackingEnabled()) ? false : true;
    }

    @Override // com.google.android.gms.internal.gtm.zzbr
    public final void zzd() {
    }
}
