package ir;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import java.io.File;
import java.io.OutputStream;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class f {
    public static final boolean compressSafely(Bitmap bitmap, OutputStream outputStream, Bitmap.CompressFormat compressFormat, int i10) {
        e0.checkNotNullParameter(bitmap, "<this>");
        e0.checkNotNullParameter(outputStream, "outputStream");
        e0.checkNotNullParameter(compressFormat, "compressFormat");
        try {
            bitmap.compress(compressFormat, i10, outputStream);
            recycleSafely(bitmap);
            return true;
        } catch (Throwable unused) {
            recycleSafely(bitmap);
            return false;
        }
    }

    public static /* synthetic */ boolean compressSafely$default(Bitmap bitmap, OutputStream outputStream, Bitmap.CompressFormat compressFormat, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            compressFormat = Bitmap.CompressFormat.PNG;
        }
        if ((i11 & 4) != 0) {
            i10 = 85;
        }
        return compressSafely(bitmap, outputStream, compressFormat, i10);
    }

    public static final Bitmap createDownscaledBitmapSafely(Bitmap bitmap, double d10) {
        Bitmap bitmapCreateScaledBitmap;
        e0.checkNotNullParameter(bitmap, "<this>");
        if (d10 <= 1.0d) {
            return bitmap;
        }
        try {
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / d10), (int) (bitmap.getHeight() / d10), true);
        } catch (Throwable unused) {
            bitmapCreateScaledBitmap = null;
        }
        return bitmapCreateScaledBitmap == null ? bitmap : bitmapCreateScaledBitmap;
    }

    public static final Bitmap decodeBytesToBitmap(byte[] bArr, BitmapFactory.Options options) throws Throwable {
        e0.checkNotNullParameter(bArr, "<this>");
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
    }

    public static /* synthetic */ Bitmap decodeBytesToBitmap$default(byte[] bArr, BitmapFactory.Options options, int i10, Object obj) throws Throwable {
        if ((i10 & 1) != 0) {
            options = null;
        }
        return decodeBytesToBitmap(bArr, options);
    }

    public static final Bitmap decodeBytesToBitmapSafely(byte[] bArr, BitmapFactory.Options options) {
        e0.checkNotNullParameter(bArr, "<this>");
        try {
            return decodeBytesToBitmap(bArr, options);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ Bitmap decodeBytesToBitmapSafely$default(byte[] bArr, BitmapFactory.Options options, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            options = null;
        }
        return decodeBytesToBitmapSafely(bArr, options);
    }

    public static final Bitmap decodeToBitmap(File file, BitmapFactory.Options bitmapFactoryOptions) throws Throwable {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(bitmapFactoryOptions, "bitmapFactoryOptions");
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getPath(), bitmapFactoryOptions);
        e0.checkNotNullExpressionValue(bitmapDecodeFile, "decodeFile(path, bitmapFactoryOptions)");
        return bitmapDecodeFile;
    }

    public static final void recycleSafely(Bitmap bitmap) {
        e0.checkNotNullParameter(bitmap, "<this>");
        try {
            bitmap.recycle();
        } catch (Throwable unused) {
        }
    }

    public static final BitmapDrawable toBitmapDrawable(Bitmap bitmap, Context context) {
        e0.checkNotNullParameter(bitmap, "<this>");
        e0.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        e0.checkNotNullExpressionValue(resources, "context.resources");
        return toBitmapDrawable(bitmap, resources);
    }

    public static final Bitmap decodeToBitmapSafely(File file, BitmapFactory.Options bitmapFactoryOptions) {
        e0.checkNotNullParameter(file, PtLatqAYjEFT.gPiZYoF);
        e0.checkNotNullParameter(bitmapFactoryOptions, "bitmapFactoryOptions");
        if (!kr.c.hasContent(file)) {
            return null;
        }
        try {
            return decodeToBitmap(file, bitmapFactoryOptions);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final BitmapDrawable toBitmapDrawable(Bitmap bitmap, Resources resources) {
        e0.checkNotNullParameter(bitmap, "<this>");
        e0.checkNotNullParameter(resources, "resources");
        return new BitmapDrawable(resources, bitmap);
    }
}
