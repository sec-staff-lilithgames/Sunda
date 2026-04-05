package vm;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import um.h0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class x extends Thread {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f89330b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f89331c;

    /* renamed from: e, reason: collision with root package name */
    public final String f89332e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f89333f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f89334g;

    public x(Context context, Uri uri, String str) {
        this.f89330b = new WeakReference(context);
        this.f89331c = uri;
        this.f89332e = str;
        if (str == null && (uri == null || TextUtils.isEmpty(uri.getPath()) || !new File(uri.getPath()).exists())) {
            a(null);
        } else {
            start();
        }
    }

    public abstract void a(Bitmap bitmap);

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws SecurityException, IOException, IllegalArgumentException {
        Context context = (Context) this.f89330b.get();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        if (context != null) {
            try {
                Uri uri = this.f89331c;
                if (uri != null) {
                    mediaMetadataRetriever.setDataSource(context, uri);
                } else {
                    String str = this.f89332e;
                    if (str != null) {
                        mediaMetadataRetriever.setDataSource(str, new HashMap());
                    }
                }
                this.f89333f = mediaMetadataRetriever.getFrameAtTime((Long.parseLong(mediaMetadataRetriever.extractMetadata(9)) / 2) * 1000, 2);
            } catch (Exception e10) {
                io.bidmachine.iab.vast.e.e("MediaFrameRetriever", e10.getMessage(), new Object[0]);
            }
        }
        try {
            mediaMetadataRetriever.release();
        } catch (IOException e11) {
            io.bidmachine.iab.vast.e.e("MediaFrameRetriever", e11.getMessage(), new Object[0]);
        }
        if (this.f89334g) {
            return;
        }
        h0.onUiThread(new w(this));
    }
}
