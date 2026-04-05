package v;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import androidx.browser.browseractions.BrowserServiceFileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import w2.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final Context f88816a;

    /* renamed from: b, reason: collision with root package name */
    public final String f88817b;

    /* renamed from: c, reason: collision with root package name */
    public final Bitmap f88818c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri f88819d;

    /* renamed from: e, reason: collision with root package name */
    public final s f88820e;

    public c(Context context, String str, Bitmap bitmap, Uri uri, s sVar) {
        this.f88816a = context.getApplicationContext();
        this.f88817b = str;
        this.f88818c = bitmap;
        this.f88819d = uri;
        this.f88820e = sVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        FileOutputStream fileOutputStreamStartWrite;
        File file = new File(this.f88816a.getFilesDir(), "image_provider");
        synchronized (BrowserServiceFileProvider.f5194b) {
            try {
                if (file.exists() || file.mkdir()) {
                    File file2 = new File(file, this.f88817b + ".png");
                    if (file2.exists()) {
                        this.f88820e.set(this.f88819d);
                    } else {
                        s sVar = this.f88820e;
                        w3.a aVar = new w3.a(file2);
                        try {
                            fileOutputStreamStartWrite = aVar.startWrite();
                        } catch (IOException e10) {
                            e = e10;
                            fileOutputStreamStartWrite = null;
                        }
                        try {
                            this.f88818c.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStreamStartWrite);
                            fileOutputStreamStartWrite.close();
                            aVar.finishWrite(fileOutputStreamStartWrite);
                            sVar.set(this.f88819d);
                        } catch (IOException e11) {
                            e = e11;
                            aVar.failWrite(fileOutputStreamStartWrite);
                            sVar.setException(e);
                            file2.setLastModified(System.currentTimeMillis());
                            return null;
                        }
                    }
                    file2.setLastModified(System.currentTimeMillis());
                } else {
                    this.f88820e.setException(new IOException("Could not create file directory."));
                }
            } finally {
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        new b(this.f88816a).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
    }
}
