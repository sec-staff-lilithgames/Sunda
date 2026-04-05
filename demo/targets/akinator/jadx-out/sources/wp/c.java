package wp;

import android.graphics.Bitmap;
import android.net.Uri;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface c {
    void onFail(d dVar);

    void onImageSuccess(d dVar, Bitmap bitmap);

    void onPathSuccess(d dVar, Uri uri);
}
