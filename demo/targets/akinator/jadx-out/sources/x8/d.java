package x8;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import com.ironsource.C3191e4;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d implements n8.x {

    /* renamed from: a, reason: collision with root package name */
    public final q8.e f91812a = new q8.e();

    @Override // n8.x
    public /* bridge */ /* synthetic */ p8.v0 decode(Object obj, int i10, int i11, n8.v vVar) throws IOException {
        return decode(sn.t.c(obj), i10, i11, vVar);
    }

    @Override // n8.x
    public /* bridge */ /* synthetic */ boolean handles(Object obj, n8.v vVar) throws IOException {
        return handles(sn.t.c(obj), vVar);
    }

    public p8.v0 decode(ImageDecoder.Source source, int i10, int i11, n8.v vVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new w8.b(i10, i11, vVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i10 + "x" + i11 + C3191e4.i.f36531e);
        }
        return new e(bitmapDecodeBitmap, this.f91812a);
    }

    public boolean handles(ImageDecoder.Source source, n8.v vVar) throws IOException {
        return true;
    }
}
