package q8;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface d {
    void clearMemory();

    Bitmap get(int i10, int i11, Bitmap.Config config);

    Bitmap getDirty(int i10, int i11, Bitmap.Config config);

    long getMaxSize();

    void put(Bitmap bitmap);

    void setSizeMultiplier(float f10);

    void trimMemory(int i10);
}
