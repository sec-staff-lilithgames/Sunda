package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.ce, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2723ce implements InterfaceC2946q0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f32711a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32712b;

    public C2723ce(String location, byte[] imageBytes) {
        kotlin.jvm.internal.e0.checkNotNullParameter(imageBytes, "imageBytes");
        kotlin.jvm.internal.e0.checkNotNullParameter(location, "location");
        this.f32711a = imageBytes;
        this.f32712b = location;
    }

    @Override // com.inmobi.media.InterfaceC2946q0
    public final Object a() {
        byte[] bArr = this.f32711a;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        kotlin.jvm.internal.e0.checkNotNull(bitmapDecodeByteArray);
        StringBuilder sb2 = new StringBuilder();
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        sb2.append(string);
        sb2.append(".jpg");
        String string2 = sb2.toString();
        File file = new File(this.f32712b);
        if (!file.exists()) {
            file.mkdirs();
        }
        bitmapDecodeByteArray.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(new File(this.f32712b + '/' + string2)));
        kotlin.jvm.internal.e0.checkNotNullParameter("StoreProcess", "tag");
        kotlin.jvm.internal.e0.checkNotNullParameter("screenshot file saved", PglCryptUtils.KEY_MESSAGE);
        Log.i("StoreProcess", "screenshot file saved");
        return this.f32712b + '/' + string2;
    }
}
