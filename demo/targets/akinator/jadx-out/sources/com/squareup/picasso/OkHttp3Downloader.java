package com.squareup.picasso;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import xv.e;
import xv.i;
import xv.l0;
import xv.o0;
import xv.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class OkHttp3Downloader implements Downloader {
    private final e cache;
    final i client;
    private boolean sharedClient;

    public OkHttp3Downloader(Context context) {
        this(Utils.createDefaultCacheDir(context));
    }

    @Override // com.squareup.picasso.Downloader
    public v0 load(o0 o0Var) throws IOException {
        return this.client.newCall(o0Var).execute();
    }

    @Override // com.squareup.picasso.Downloader
    public void shutdown() {
        e eVar;
        if (this.sharedClient || (eVar = this.cache) == null) {
            return;
        }
        try {
            eVar.close();
        } catch (IOException unused) {
        }
    }

    public OkHttp3Downloader(File file) {
        this(file, Utils.calculateDiskCacheSize(file));
    }

    public OkHttp3Downloader(Context context, long j10) {
        this(Utils.createDefaultCacheDir(context), j10);
    }

    public OkHttp3Downloader(File file, long j10) {
        this(new l0.a().cache(new e(file, j10)).build());
        this.sharedClient = false;
    }

    public OkHttp3Downloader(l0 l0Var) {
        this.sharedClient = true;
        this.client = l0Var;
        this.cache = l0Var.cache();
    }

    public OkHttp3Downloader(i iVar) {
        this.sharedClient = true;
        this.client = iVar;
        this.cache = null;
    }
}
