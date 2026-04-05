package vp;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface r extends s {
    @Override // vp.s
    /* synthetic */ Drawable getIconDrawable();

    @Override // vp.s
    /* synthetic */ Uri getIconUri();

    @Override // vp.s
    /* synthetic */ Drawable getImageDrawable();

    @Override // vp.s
    /* synthetic */ Uri getImageUri();

    io.bidmachine.iab.vast.t getVastRequest();

    @Override // vp.s
    /* synthetic */ Uri getVideoUri();

    void setIconBitmap(Bitmap bitmap);

    void setIconUri(Uri uri);

    void setImageBitmap(Bitmap bitmap);

    void setImageUri(Uri uri);

    void setVastRequest(io.bidmachine.iab.vast.t tVar);

    void setVideoUri(Uri uri);
}
