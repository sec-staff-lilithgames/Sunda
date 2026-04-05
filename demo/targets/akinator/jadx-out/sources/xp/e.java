package xp;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import com.ironsource.InterfaceC3129ae;
import com.ironsource.mediationsdk.logger.IronSourceError;
import nm.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class e {
    public static int calculateInSamplesSize(BitmapFactory.Options options, int i10, int i11) {
        int i12 = options.outWidth;
        int i13 = options.outHeight;
        int i14 = 1;
        while (true) {
            if (i12 / i14 <= i10 && i13 / i14 <= i11) {
                return i14;
            }
            i14 *= 2;
        }
    }

    public static int calculateReqHeight(int i10) {
        return i10 > 700 ? IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED : i10;
    }

    public static int calculateReqWidth(Context context) {
        Point screenSize = j.getScreenSize(context);
        return Math.min(InterfaceC3129ae.c.f35991d, Math.min(screenSize.x, screenSize.y));
    }

    public static void fillImageView(Context context, ImageView imageView, Uri uri, Drawable drawable) {
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
            return;
        }
        a aVar = new a();
        if (uri == null || TextUtils.isEmpty(uri.getPath())) {
            aVar.onError("ImagePath is invalid");
        } else if (imageView == null) {
            aVar.onError("Target ImageView is null");
        } else {
            f.getInstance().execute(new c(context, uri, imageView, aVar));
        }
    }
}
