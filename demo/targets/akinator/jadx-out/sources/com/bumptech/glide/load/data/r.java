package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class r implements e {

    /* renamed from: b, reason: collision with root package name */
    public final Uri f16607b;

    /* renamed from: c, reason: collision with root package name */
    public final ContentResolver f16608c;

    /* renamed from: e, reason: collision with root package name */
    public Object f16609e;

    public r(ContentResolver contentResolver, Uri uri) {
        this.f16608c = contentResolver;
        this.f16607b = uri;
    }

    public abstract void a(Object obj);

    public abstract Object b(ContentResolver contentResolver, Uri uri);

    @Override // com.bumptech.glide.load.data.e
    public void cleanup() {
        Object obj = this.f16609e;
        if (obj != null) {
            try {
                a(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public abstract /* synthetic */ Class getDataClass();

    @Override // com.bumptech.glide.load.data.e
    public n8.a getDataSource() {
        return n8.a.f75823b;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void loadData(com.bumptech.glide.l lVar, d dVar) {
        try {
            Object objB = b(this.f16608c, this.f16607b);
            this.f16609e = objB;
            dVar.onDataReady(objB);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e10);
            }
            dVar.onLoadFailed(e10);
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public void cancel() {
    }
}
