package o8;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d implements f {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f78003b = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f78004a;

    public d(ContentResolver contentResolver) {
        this.f78004a = contentResolver;
    }

    @Override // o8.f
    public Cursor query(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.f78004a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f78003b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
    }
}
