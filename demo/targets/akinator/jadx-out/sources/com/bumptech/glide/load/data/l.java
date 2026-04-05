package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class l extends b {
    public l(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.b
    public final void a(Object obj) throws IOException {
        ((AssetFileDescriptor) obj).close();
    }

    @Override // com.bumptech.glide.load.data.b
    public final Object b(AssetManager assetManager, String str) {
        return assetManager.openFd(str);
    }

    @Override // com.bumptech.glide.load.data.b, com.bumptech.glide.load.data.e
    public Class<AssetFileDescriptor> getDataClass() {
        return AssetFileDescriptor.class;
    }
}
