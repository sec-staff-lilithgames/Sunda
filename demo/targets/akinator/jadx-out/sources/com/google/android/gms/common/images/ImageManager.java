package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.widget.ImageView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Constants;
import com.google.android.gms.internal.base.zam;
import com.google.android.gms.internal.base.zat;
import com.google.android.gms.internal.base.zau;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class ImageManager {
    private static final Object zaa = new Object();
    private static final HashSet zab = new HashSet();
    private static ImageManager zac;
    private final Context zad;
    private final Handler zae = new zau(Looper.getMainLooper());
    private final ExecutorService zaf = zat.zaa().zab(4, 2);
    private final zam zag = new zam();
    private final Map zah = new HashMap();
    private final Map zai = new HashMap();
    private final Map zaj = new HashMap();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class ImageReceiver extends ResultReceiver {
        private final Uri zab;
        private final ArrayList zac;

        public ImageReceiver(Uri uri) {
            super(new zau(Looper.getMainLooper()));
            this.zab = uri;
            this.zac = new ArrayList();
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i10, Bundle bundle) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
            ImageManager imageManager = ImageManager.this;
            imageManager.zaf.execute(new zaa(imageManager, this.zab, parcelFileDescriptor));
        }

        public final void zab(zag zagVar) {
            Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
            this.zac.add(zagVar);
        }

        public final void zac(zag zagVar) {
            Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.zac.remove(zagVar);
        }

        public final void zad() {
            Intent intent = new Intent(Constants.ACTION_LOAD_IMAGE);
            intent.setPackage("com.google.android.gms");
            intent.putExtra(Constants.EXTRA_URI, this.zab);
            intent.putExtra(Constants.EXTRA_RESULT_RECEIVER, this);
            intent.putExtra(Constants.EXTRA_PRIORITY, 3);
            ImageManager.this.zad.sendBroadcast(intent);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface OnImageLoadedListener {
        void onImageLoaded(Uri uri, Drawable drawable, boolean z10);
    }

    private ImageManager(Context context, boolean z10) {
        this.zad = context.getApplicationContext();
    }

    public static ImageManager create(Context context) {
        if (zac == null) {
            zac = new ImageManager(context, false);
        }
        return zac;
    }

    public void loadImage(ImageView imageView, int i10) {
        zaj(new zae(imageView, i10));
    }

    public final void zaj(zag zagVar) {
        Asserts.checkMainThread("ImageManager.loadImage() must be called in the main thread");
        new zab(this, zagVar).run();
    }

    public void loadImage(ImageView imageView, Uri uri) {
        zaj(new zae(imageView, uri));
    }

    public void loadImage(ImageView imageView, Uri uri, int i10) {
        zae zaeVar = new zae(imageView, uri);
        zaeVar.zab = i10;
        zaj(zaeVar);
    }

    public void loadImage(OnImageLoadedListener onImageLoadedListener, Uri uri) {
        zaj(new zaf(onImageLoadedListener, uri));
    }

    public void loadImage(OnImageLoadedListener onImageLoadedListener, Uri uri, int i10) {
        zaf zafVar = new zaf(onImageLoadedListener, uri);
        zafVar.zab = i10;
        zaj(zafVar);
    }
}
