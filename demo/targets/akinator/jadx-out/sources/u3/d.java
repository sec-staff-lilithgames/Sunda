package u3;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final ContentProviderClient f87785a;

    public d(Context context, Uri uri) {
        this.f87785a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override // u3.c
    public void close() {
        ContentProviderClient contentProviderClient = this.f87785a;
        if (contentProviderClient != null) {
            contentProviderClient.close();
        }
    }

    @Override // u3.c
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        ContentProviderClient contentProviderClient = this.f87785a;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
        } catch (RemoteException e10) {
            Log.w("FontsProvider", "Unable to query the content provider", e10);
            return null;
        }
    }
}
