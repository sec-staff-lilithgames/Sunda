package v;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import w2.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ContentResolver f88809b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f88810c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f88811e;

    public a(ContentResolver contentResolver, Uri uri, s sVar) {
        this.f88809b = contentResolver;
        this.f88810c = uri;
        this.f88811e = sVar;
    }

    @Override // java.lang.Runnable
    public void run() throws IOException {
        s sVar = this.f88811e;
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.f88809b.openFileDescriptor(this.f88810c, "r");
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                sVar.setException(new FileNotFoundException());
                return;
            }
            Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            parcelFileDescriptorOpenFileDescriptor.close();
            if (bitmapDecodeFileDescriptor == null) {
                sVar.setException(new IOException("File could not be decoded."));
            } else {
                sVar.set(bitmapDecodeFileDescriptor);
            }
        } catch (IOException e10) {
            sVar.setException(e10);
        }
    }
}
