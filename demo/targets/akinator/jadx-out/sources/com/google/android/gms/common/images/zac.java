package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.Asserts;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zac implements Runnable {
    final /* synthetic */ ImageManager zaa;
    private final Uri zab;
    private final Bitmap zac;
    private final CountDownLatch zad;

    public zac(ImageManager imageManager, Uri uri, Bitmap bitmap, boolean z10, CountDownLatch countDownLatch) {
        this.zaa = imageManager;
        this.zab = uri;
        this.zac = bitmap;
        this.zad = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) this.zaa.zai.remove(this.zab);
        if (imageReceiver != null) {
            ArrayList arrayList = imageReceiver.zac;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                zag zagVar = (zag) arrayList.get(i10);
                Bitmap bitmap = this.zac;
                if (bitmap != null) {
                    zagVar.zac(this.zaa.zad, bitmap, false);
                } else {
                    this.zaa.zaj.put(this.zab, Long.valueOf(SystemClock.elapsedRealtime()));
                    ImageManager imageManager = this.zaa;
                    zagVar.zab(imageManager.zad, imageManager.zag, false);
                }
                if (!(zagVar instanceof zaf)) {
                    this.zaa.zah.remove(zagVar);
                }
            }
        }
        this.zad.countDown();
        synchronized (ImageManager.zaa) {
            ImageManager.zab.remove(this.zab);
        }
    }
}
