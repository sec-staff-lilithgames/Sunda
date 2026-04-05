package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcfd implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzcfe zze;

    public zzcfd(zzcfe zzcfeVar, String str, String str2, String str3, String str4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        Objects.requireNonNull(zzcfeVar);
        this.zze = zzcfeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r4 = this;
            java.lang.String r0 = "event"
            java.lang.String r1 = "precacheCanceled"
            java.util.HashMap r0 = b0.e2.s(r0, r1)
            java.lang.String r1 = "src"
            java.lang.String r2 = r4.zza
            r0.put(r1, r2)
            java.lang.String r1 = r4.zzb
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L1c
            java.lang.String r2 = "cachedSrc"
            r0.put(r2, r1)
        L1c:
            java.lang.String r1 = r4.zzc
            int r2 = r1.hashCode()
            r3 = 0
            java.lang.String r3 = tv.Mu.QpyI.EVTcdR
            switch(r2) {
                case -1947652542: goto L77;
                case -1396664534: goto L6c;
                case -1347010958: goto L69;
                case -918817863: goto L60;
                case -659376217: goto L5d;
                case -642208130: goto L5a;
                case -354048396: goto L4f;
                case -32082395: goto L46;
                case 3387234: goto L43;
                case 96784904: goto L3d;
                case 580119100: goto L32;
                case 725497484: goto L29;
                default: goto L28;
            }
        L28:
            goto L7a
        L29:
            java.lang.String r2 = "noCacheDir"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L7a
            goto L3a
        L32:
            java.lang.String r2 = "expireFailed"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L7a
        L3a:
            java.lang.String r3 = "io"
            goto L7a
        L3d:
            java.lang.String r2 = "error"
        L3f:
            r1.equals(r2)
            goto L7a
        L43:
            java.lang.String r2 = "noop"
            goto L3f
        L46:
            java.lang.String r2 = "externalAbort"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L7a
            goto L57
        L4f:
            java.lang.String r2 = "sizeExceeded"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L7a
        L57:
            java.lang.String r3 = "policy"
            goto L7a
        L5a:
            java.lang.String r2 = "playerFailed"
            goto L3f
        L5d:
            java.lang.String r2 = "contentLengthMissing"
            goto L3f
        L60:
            java.lang.String r2 = "downloadTimeout"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L7a
            goto L74
        L69:
            java.lang.String r2 = "inProgress"
            goto L3f
        L6c:
            java.lang.String r2 = "badUrl"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L7a
        L74:
            java.lang.String r3 = "network"
            goto L7a
        L77:
            java.lang.String r2 = "interrupted"
            goto L3f
        L7a:
            java.lang.String r2 = "type"
            r0.put(r2, r3)
            java.lang.String r2 = "reason"
            r0.put(r2, r1)
            java.lang.String r1 = r4.zzd
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L91
            java.lang.String r2 = "message"
            r0.put(r2, r1)
        L91:
            com.google.android.gms.internal.ads.zzcfe r1 = r4.zze
            java.lang.String r2 = "onPrecacheEvent"
            r1.zzw(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfd.run():void");
    }
}
