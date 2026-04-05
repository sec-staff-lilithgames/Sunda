package xp;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements d {
    @Override // xp.d
    public void onError(String str) {
        nm.a.d(str);
    }

    @Override // xp.d
    public void onImagePrepared(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
    }
}
