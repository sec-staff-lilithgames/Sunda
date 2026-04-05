package xp;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.widget.ImageView;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import nm.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final Uri f92180b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f92181c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f92182e;

    /* renamed from: f, reason: collision with root package name */
    public final a f92183f;

    /* renamed from: g, reason: collision with root package name */
    public BitmapDrawable f92184g;

    public c(Context context, Uri uri, ImageView imageView, a aVar) {
        this.f92181c = context;
        this.f92180b = uri;
        this.f92182e = new WeakReference(imageView);
        this.f92183f = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        a aVar = this.f92183f;
        Uri uri = this.f92180b;
        Context context = this.f92181c;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                j.close(inputStreamOpenInputStream);
                if (options.outWidth != 0 && options.outHeight != 0) {
                    int iCalculateReqWidth = e.calculateReqWidth(context);
                    options.inSampleSize = e.calculateInSamplesSize(options, iCalculateReqWidth, e.calculateReqHeight(iCalculateReqWidth));
                    options.inJustDecodeBounds = false;
                    inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                    try {
                        this.f92184g = new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options));
                        j.close(inputStreamOpenInputStream);
                        j.onUiThread(new b(this));
                        return;
                    } finally {
                    }
                }
                aVar.onError("Image size is (0;0)");
            } finally {
            }
        } catch (Throwable th2) {
            String message = th2.getMessage();
            if (message == null) {
                message = "ImagePreparation error";
            }
            aVar.onError(message);
        }
    }
}
