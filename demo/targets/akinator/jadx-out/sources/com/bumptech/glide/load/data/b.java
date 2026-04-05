package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class b implements e {

    /* renamed from: b, reason: collision with root package name */
    public final String f16585b;

    /* renamed from: c, reason: collision with root package name */
    public final AssetManager f16586c;

    /* renamed from: e, reason: collision with root package name */
    public Object f16587e;

    public b(AssetManager assetManager, String str) {
        this.f16586c = assetManager;
        this.f16585b = str;
    }

    public abstract void a(Object obj);

    public abstract Object b(AssetManager assetManager, String str);

    @Override // com.bumptech.glide.load.data.e
    public void cleanup() {
        Object obj = this.f16587e;
        if (obj == null) {
            return;
        }
        try {
            a(obj);
        } catch (IOException unused) {
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public abstract /* synthetic */ Class getDataClass();

    @Override // com.bumptech.glide.load.data.e
    public n8.a getDataSource() {
        return n8.a.f75823b;
    }

    @Override // com.bumptech.glide.load.data.e
    public void loadData(com.bumptech.glide.l lVar, d dVar) {
        try {
            Object objB = b(this.f16586c, this.f16585b);
            this.f16587e = objB;
            dVar.onDataReady(objB);
        } catch (IOException e10) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e10);
            }
            dVar.onLoadFailed(e10);
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public void cancel() {
    }
}
