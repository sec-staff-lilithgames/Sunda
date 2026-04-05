package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zaf extends zag {
    private final WeakReference zac;

    public zaf(ImageManager.OnImageLoadedListener onImageLoadedListener, Uri uri) {
        super(uri, 0);
        Asserts.checkNotNull(onImageLoadedListener);
        this.zac = new WeakReference(onImageLoadedListener);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zaf)) {
            return false;
        }
        zaf zafVar = (zaf) obj;
        ImageManager.OnImageLoadedListener onImageLoadedListener = (ImageManager.OnImageLoadedListener) this.zac.get();
        ImageManager.OnImageLoadedListener onImageLoadedListener2 = (ImageManager.OnImageLoadedListener) zafVar.zac.get();
        return onImageLoadedListener2 != null && onImageLoadedListener != null && Objects.equal(onImageLoadedListener2, onImageLoadedListener) && Objects.equal(zafVar.zaa, this.zaa);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zaa);
    }

    @Override // com.google.android.gms.common.images.zag
    public final void zaa(Drawable drawable, boolean z10, boolean z11, boolean z12) {
        ImageManager.OnImageLoadedListener onImageLoadedListener;
        if (z11 || (onImageLoadedListener = (ImageManager.OnImageLoadedListener) this.zac.get()) == null) {
            return;
        }
        onImageLoadedListener.onImageLoaded(this.zaa.zaa, drawable, z12);
    }
}
