package com.bumptech.glide;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.net.URL;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface k {
    Object load(Bitmap bitmap);

    Object load(Drawable drawable);

    Object load(Uri uri);

    Object load(File file);

    Object load(Integer num);

    Object load(Object obj);

    Object load(String str);

    @Deprecated
    Object load(URL url);

    Object load(byte[] bArr);
}
