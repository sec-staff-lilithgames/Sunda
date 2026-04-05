package q8;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class e implements d {
    @Override // q8.d
    public Bitmap get(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // q8.d
    public Bitmap getDirty(int i10, int i11, Bitmap.Config config) {
        return get(i10, i11, config);
    }

    @Override // q8.d
    public long getMaxSize() {
        return 0L;
    }

    @Override // q8.d
    public void put(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // q8.d
    public void clearMemory() {
    }

    @Override // q8.d
    public void setSizeMultiplier(float f10) {
    }

    @Override // q8.d
    public void trimMemory(int i10) {
    }
}
