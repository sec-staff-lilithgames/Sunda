package wp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final a f90777b = new a(this, Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public Context f90778c;

    /* renamed from: e, reason: collision with root package name */
    public String f90779e;

    /* renamed from: f, reason: collision with root package name */
    public File f90780f;

    /* renamed from: g, reason: collision with root package name */
    public c f90781g;

    public static Bitmap a(byte[] bArr, BitmapFactory.Options options) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        options.inJustDecodeBounds = false;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
            try {
                try {
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                    bitmapDecodeByteArray.compress(Bitmap.CompressFormat.PNG, 85, byteArrayOutputStream);
                    bitmapDecodeByteArray.recycle();
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                    nm.j.flush(byteArrayOutputStream);
                    nm.j.close(byteArrayOutputStream);
                    return bitmapDecodeStream;
                } catch (Exception e10) {
                    e = e10;
                    nm.a.w(e);
                    nm.j.flush(byteArrayOutputStream);
                    nm.j.close(byteArrayOutputStream);
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream2 = byteArrayOutputStream;
                nm.j.flush(byteArrayOutputStream2);
                nm.j.close(byteArrayOutputStream2);
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            nm.j.flush(byteArrayOutputStream2);
            nm.j.close(byteArrayOutputStream2);
            throw th;
        }
    }

    public static b newBuilder(Context context, String str) {
        return new b(new d(), context, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd A[Catch: all -> 0x007a, TryCatch #4 {all -> 0x007a, blocks: (B:21:0x006d, B:22:0x006f, B:24:0x0076, B:27:0x007e, B:29:0x0088, B:32:0x009e, B:43:0x00b7, B:45:0x00bd, B:46:0x00c5, B:47:0x00cb, B:42:0x00b1, B:48:0x00cc, B:51:0x00e2, B:53:0x00ed), top: B:75:0x006d }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wp.d.run():void");
    }
}
