package androidx.browser.browseractions;

import a.b;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import androidx.core.content.FileProvider;
import java.util.List;
import sh.n1;
import v.a;
import v.c;
import w2.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes.dex */
public final class BrowserServiceFileProvider extends FileProvider {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f5194b = new Object();

    public static void grantReadPermission(Intent intent, List<Uri> list, Context context) {
        if (list == null || list.size() == 0) {
            return;
        }
        ContentResolver contentResolver = context.getContentResolver();
        intent.addFlags(1);
        ClipData clipDataNewUri = ClipData.newUri(contentResolver, "image_provider_uris", list.get(0));
        for (int i10 = 1; i10 < list.size(); i10++) {
            clipDataNewUri.addItem(new ClipData.Item(list.get(i10)));
        }
        intent.setClipData(clipDataNewUri);
    }

    public static n1 loadBitmap(ContentResolver contentResolver, Uri uri) {
        s sVarCreate = s.create();
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new a(contentResolver, uri, sVarCreate));
        return sVarCreate;
    }

    public static s saveBitmap(Context context, Bitmap bitmap, String str, int i10) {
        StringBuilder sbT = b.t(str, "_");
        sbT.append(Integer.toString(i10));
        String string = sbT.toString();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(context.getPackageName() + ".image_provider").path(b.l("image_provider_images/", string, ".png")).build();
        s sVarCreate = s.create();
        new c(context, string, bitmap, uriBuild, sVarCreate).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        return sVarCreate;
    }
}
