package u8;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g0 implements com.bumptech.glide.load.data.e {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f88080e = {"_data"};

    /* renamed from: b, reason: collision with root package name */
    public final Context f88081b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f88082c;

    public g0(Context context, Uri uri) {
        this.f88081b = context;
        this.f88082c = uri;
    }

    @Override // com.bumptech.glide.load.data.e
    public Class<File> getDataClass() {
        return File.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public n8.a getDataSource() {
        return n8.a.f75823b;
    }

    @Override // com.bumptech.glide.load.data.e
    public void loadData(com.bumptech.glide.l lVar, com.bumptech.glide.load.data.d dVar) {
        Cursor cursorQuery = this.f88081b.getContentResolver().query(this.f88082c, f88080e, null, null, null);
        if (cursorQuery != null) {
            try {
                string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                cursorQuery.close();
            } catch (Throwable th2) {
                cursorQuery.close();
                throw th2;
            }
        }
        if (!TextUtils.isEmpty(string)) {
            dVar.onDataReady(new File(string));
            return;
        }
        dVar.onLoadFailed(new FileNotFoundException("Failed to find file path for: " + this.f88082c));
    }

    @Override // com.bumptech.glide.load.data.e
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.e
    public void cleanup() {
    }
}
