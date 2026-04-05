package cr;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f50929a = new v();

    public final Drawable convertToRepeatedDrawable(Context context, String str) {
        byte[] bArrDecodeBase64;
        Bitmap bitmapDecodeBytesToBitmapSafely$default;
        BitmapDrawable bitmapDrawable;
        e0.checkNotNullParameter(context, "context");
        if (str != null) {
            try {
                String strNotEmptyOrNull = ir.s.notEmptyOrNull(str);
                if (strNotEmptyOrNull != null && (bArrDecodeBase64 = ir.s.decodeBase64(strNotEmptyOrNull, 0)) != null && (bitmapDecodeBytesToBitmapSafely$default = ir.f.decodeBytesToBitmapSafely$default(bArrDecodeBase64, null, 1, null)) != null && (bitmapDrawable = ir.f.toBitmapDrawable(bitmapDecodeBytesToBitmapSafely$default, context)) != null) {
                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                    bitmapDrawable.setTileModeXY(tileMode, tileMode);
                    return bitmapDrawable;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
