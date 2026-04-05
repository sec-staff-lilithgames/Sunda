package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzavy implements Runnable {
    private zzavy() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzavz.zzd = MessageDigest.getInstance(SameMD5.TAG);
            countDownLatch = zzavz.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzavz.zzb;
        } catch (Throwable th2) {
            zzavz.zzb.countDown();
            throw th2;
        }
        countDownLatch.countDown();
    }

    public /* synthetic */ zzavy(byte[] bArr) {
    }
}
