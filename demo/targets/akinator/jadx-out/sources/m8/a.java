package m8;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface a {
    Bitmap obtain(int i10, int i11, Bitmap.Config config);

    byte[] obtainByteArray(int i10);

    int[] obtainIntArray(int i10);

    void release(Bitmap bitmap);

    void release(byte[] bArr);

    void release(int[] iArr);
}
