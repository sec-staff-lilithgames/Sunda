package com.vungle.ads.internal.downloader;

import com.vungle.ads.internal.downloader.AssetDownloader;
import kotlin.jvm.internal.f0;
import kv.a;
import xv.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AssetDownloader$okHttpClient$2 extends f0 implements a {
    final /* synthetic */ AssetDownloader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetDownloader$okHttpClient$2(AssetDownloader assetDownloader) {
        super(0);
        this.this$0 = assetDownloader;
    }

    @Override // kv.a
    public final l0 invoke() {
        return AssetDownloader.OkHttpSingleton.INSTANCE.createOkHttpClient(this.this$0.pathProvider);
    }
}
