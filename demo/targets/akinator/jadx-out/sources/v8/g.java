package v8;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.l;
import java.io.File;
import java.io.FileNotFoundException;
import n8.v;
import u8.k0;
import u8.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g implements com.bumptech.glide.load.data.e {

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f89178m = {"_data"};

    /* renamed from: b, reason: collision with root package name */
    public final Context f89179b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f89180c;

    /* renamed from: e, reason: collision with root package name */
    public final l0 f89181e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f89182f;

    /* renamed from: g, reason: collision with root package name */
    public final int f89183g;

    /* renamed from: h, reason: collision with root package name */
    public final int f89184h;

    /* renamed from: i, reason: collision with root package name */
    public final v f89185i;

    /* renamed from: j, reason: collision with root package name */
    public final Class f89186j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f89187k;

    /* renamed from: l, reason: collision with root package name */
    public volatile com.bumptech.glide.load.data.e f89188l;

    public g(Context context, l0 l0Var, l0 l0Var2, Uri uri, int i10, int i11, v vVar, Class cls) {
        this.f89179b = context.getApplicationContext();
        this.f89180c = l0Var;
        this.f89181e = l0Var2;
        this.f89182f = uri;
        this.f89183g = i10;
        this.f89184h = i11;
        this.f89185i = vVar;
        this.f89186j = cls;
    }

    public final com.bumptech.glide.load.data.e a() throws Throwable {
        k0 k0VarBuildLoadData;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.f89179b;
        v vVar = this.f89185i;
        int i10 = this.f89184h;
        int i11 = this.f89183g;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.f89182f;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, f89178m, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            k0VarBuildLoadData = this.f89180c.buildLoadData(file, i11, i10, vVar);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            Uri requireOriginal = this.f89182f;
            boolean zIsAndroidPickerUri = o8.b.isAndroidPickerUri(requireOriginal);
            l0 l0Var = this.f89181e;
            if (zIsAndroidPickerUri) {
                k0VarBuildLoadData = l0Var.buildLoadData(requireOriginal, i11, i10, vVar);
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                k0VarBuildLoadData = l0Var.buildLoadData(requireOriginal, i11, i10, vVar);
            }
        }
        if (k0VarBuildLoadData != null) {
            return k0VarBuildLoadData.f88091c;
        }
        return null;
    }

    @Override // com.bumptech.glide.load.data.e
    public void cancel() {
        this.f89187k = true;
        com.bumptech.glide.load.data.e eVar = this.f89188l;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public void cleanup() {
        com.bumptech.glide.load.data.e eVar = this.f89188l;
        if (eVar != null) {
            eVar.cleanup();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public Class<Object> getDataClass() {
        return this.f89186j;
    }

    @Override // com.bumptech.glide.load.data.e
    public n8.a getDataSource() {
        return n8.a.f75823b;
    }

    @Override // com.bumptech.glide.load.data.e
    public void loadData(l lVar, com.bumptech.glide.load.data.d dVar) throws Throwable {
        try {
            com.bumptech.glide.load.data.e eVarA = a();
            if (eVarA == null) {
                dVar.onLoadFailed(new IllegalArgumentException("Failed to build fetcher for: " + this.f89182f));
            } else {
                this.f89188l = eVarA;
                if (this.f89187k) {
                    cancel();
                } else {
                    eVarA.loadData(lVar, dVar);
                }
            }
        } catch (FileNotFoundException e10) {
            dVar.onLoadFailed(e10);
        }
    }
}
