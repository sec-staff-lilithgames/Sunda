package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class s extends b {
    public s(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.b
    public final void a(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    @Override // com.bumptech.glide.load.data.b
    public final Object b(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }

    @Override // com.bumptech.glide.load.data.b, com.bumptech.glide.load.data.e
    public Class<InputStream> getDataClass() {
        return InputStream.class;
    }
}
