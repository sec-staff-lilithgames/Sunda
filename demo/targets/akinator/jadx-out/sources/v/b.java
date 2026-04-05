package v;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.util.Log;
import androidx.browser.browseractions.BrowserServiceFileProvider;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b extends AsyncTask {

    /* renamed from: b, reason: collision with root package name */
    public static final long f88812b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f88813c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f88814d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f88815a;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        f88812b = timeUnit.toMillis(7L);
        f88813c = timeUnit.toMillis(7L);
        f88814d = timeUnit.toMillis(1L);
    }

    public b(Context context) {
        this.f88815a = context.getApplicationContext();
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        SharedPreferences sharedPreferences = this.f88815a.getSharedPreferences(this.f88815a.getPackageName() + ".image_provider", 0);
        if (System.currentTimeMillis() <= sharedPreferences.getLong("last_cleanup_time", System.currentTimeMillis()) + f88813c) {
            return null;
        }
        synchronized (BrowserServiceFileProvider.f5194b) {
            try {
                File file = new File(this.f88815a.getFilesDir(), "image_provider");
                if (!file.exists()) {
                    return null;
                }
                File[] fileArrListFiles = file.listFiles();
                long jCurrentTimeMillis = System.currentTimeMillis() - f88812b;
                boolean z10 = true;
                for (File file2 : fileArrListFiles) {
                    if (file2.getName().endsWith("..png") && file2.lastModified() < jCurrentTimeMillis && !file2.delete()) {
                        Log.e("BrowserServiceFP", "Fail to delete image: " + file2.getAbsoluteFile());
                        z10 = false;
                    }
                }
                long jCurrentTimeMillis2 = z10 ? System.currentTimeMillis() : (System.currentTimeMillis() - f88813c) + f88814d;
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putLong("last_cleanup_time", jCurrentTimeMillis2);
                editorEdit.apply();
                return null;
            } finally {
            }
        }
    }
}
