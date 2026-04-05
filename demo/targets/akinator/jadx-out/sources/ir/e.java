package ir;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import be.nVUQ.UupKET;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class e {
    public static final boolean compressSafely(Bitmap bitmap, OutputStream outputStream) {
        e0.checkNotNullParameter(bitmap, "bitmap");
        e0.checkNotNullParameter(outputStream, "outputStream");
        return f.compressSafely$default(bitmap, outputStream, null, 0, 6, null);
    }

    public static final BitmapFactory.Options createDefaultBitmapFactoryOptions() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        return options;
    }

    public static final Bitmap decodeBytesToBitmap(byte[] byteImage, BitmapFactory.Options bitmapFactoryOptions) throws Throwable {
        e0.checkNotNullParameter(byteImage, "byteImage");
        e0.checkNotNullParameter(bitmapFactoryOptions, "bitmapFactoryOptions");
        return f.decodeBytesToBitmap(byteImage, bitmapFactoryOptions);
    }

    public static final Bitmap decodeBytesToBitmapSafely(byte[] byteImage, BitmapFactory.Options bitmapFactoryOptions) {
        e0.checkNotNullParameter(byteImage, "byteImage");
        e0.checkNotNullParameter(bitmapFactoryOptions, "bitmapFactoryOptions");
        return f.decodeBytesToBitmapSafely(byteImage, bitmapFactoryOptions);
    }

    public static final Bitmap decodeFileToBitmapSafely(File file, BitmapFactory.Options bitmapFactoryOptions) {
        e0.checkNotNullParameter(file, "file");
        e0.checkNotNullParameter(bitmapFactoryOptions, "bitmapFactoryOptions");
        return f.decodeToBitmapSafely(file, bitmapFactoryOptions);
    }

    public static final void recycleSafely(Bitmap bitmap) {
        e0.checkNotNullParameter(bitmap, "bitmap");
        f.recycleSafely(bitmap);
    }

    public static final boolean saveImageWithCompress(File file, byte[] byteImage) {
        e0.checkNotNullParameter(file, UupKET.bxfBKBO);
        e0.checkNotNullParameter(byteImage, "byteImage");
        return saveImageWithCompress(file, byteImage, createDefaultBitmapFactoryOptions());
    }

    public static final Bitmap toBitmapWithCompress(byte[] byteImage) {
        e0.checkNotNullParameter(byteImage, "byteImage");
        return toBitmapWithCompress(byteImage, createDefaultBitmapFactoryOptions());
    }

    public static final boolean writeBitmapWithCompress(byte[] byteImage, OutputStream outputStream) {
        e0.checkNotNullParameter(byteImage, "byteImage");
        e0.checkNotNullParameter(outputStream, "outputStream");
        return writeBitmapWithCompress(byteImage, outputStream, createDefaultBitmapFactoryOptions());
    }

    public static /* synthetic */ boolean writeBitmapWithCompress$default(byte[] bArr, OutputStream outputStream, BitmapFactory.Options options, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            options = createDefaultBitmapFactoryOptions();
        }
        return writeBitmapWithCompress(bArr, outputStream, options);
    }

    public static final boolean saveImageWithCompress(File file, byte[] byteImage, BitmapFactory.Options bitmapFactoryOptions) {
        e0.checkNotNullParameter(file, "file");
        e0.checkNotNullParameter(byteImage, "byteImage");
        e0.checkNotNullParameter(bitmapFactoryOptions, "bitmapFactoryOptions");
        bitmapFactoryOptions.inJustDecodeBounds = false;
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                writeBitmapWithCompress(byteImage, fileOutputStream2, bitmapFactoryOptions);
                s.finalize(fileOutputStream2);
                return true;
            } catch (Throwable unused) {
                fileOutputStream = fileOutputStream2;
                s.finalize(fileOutputStream);
                return false;
            }
        } catch (Throwable unused2) {
        }
    }

    public static final Bitmap toBitmapWithCompress(byte[] byteImage, BitmapFactory.Options bitmapFactoryOptions) {
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        e0.checkNotNullParameter(byteImage, "byteImage");
        e0.checkNotNullParameter(bitmapFactoryOptions, "bitmapFactoryOptions");
        bitmapFactoryOptions.inJustDecodeBounds = false;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream(byteImage.length);
            try {
                if (!writeBitmapWithCompress(byteImage, byteArrayOutputStream, bitmapFactoryOptions)) {
                    s.finalize(byteArrayOutputStream);
                    s.closeSafely(null);
                    return null;
                }
                byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(byteArrayInputStream);
                    s.finalize(byteArrayOutputStream);
                    s.closeSafely(byteArrayInputStream);
                    return bitmapDecodeStream;
                } catch (Throwable unused) {
                    s.finalize(byteArrayOutputStream);
                    s.closeSafely(byteArrayInputStream);
                    return null;
                }
            } catch (Throwable unused2) {
                byteArrayInputStream = null;
            }
        } catch (Throwable unused3) {
            byteArrayInputStream = null;
            byteArrayOutputStream = null;
        }
    }

    public static final boolean writeBitmapWithCompress(byte[] byteImage, OutputStream outputStream, BitmapFactory.Options bitmapFactoryOptions) {
        e0.checkNotNullParameter(byteImage, "byteImage");
        e0.checkNotNullParameter(outputStream, "outputStream");
        e0.checkNotNullParameter(bitmapFactoryOptions, "bitmapFactoryOptions");
        Bitmap bitmapDecodeBytesToBitmapSafely = decodeBytesToBitmapSafely(byteImage, bitmapFactoryOptions);
        if (bitmapDecodeBytesToBitmapSafely != null) {
            return f.compressSafely$default(bitmapDecodeBytesToBitmapSafely, outputStream, null, 0, 6, null);
        }
        return false;
    }
}
