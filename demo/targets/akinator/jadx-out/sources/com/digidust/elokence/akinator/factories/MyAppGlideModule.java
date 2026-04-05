package com.digidust.elokence.akinator.factories;

import android.content.Context;
import com.bumptech.glide.g;
import q8.o;
import r8.l;
import r8.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class MyAppGlideModule extends d9.a {
    @Override // d9.a, d9.b
    public void applyOptions(Context context, g gVar) {
        gVar.setMemoryCache(new m(20971520));
        gVar.setBitmapPool(new o(31457280));
        gVar.setDiskCache(new l(context, 104857600));
    }
}
