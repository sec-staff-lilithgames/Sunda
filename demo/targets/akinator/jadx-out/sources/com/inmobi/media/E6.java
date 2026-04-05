package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.C3271ic;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class E6 extends X9 {

    /* renamed from: y, reason: collision with root package name */
    public final AdQualityResult f31743y;

    /* renamed from: z, reason: collision with root package name */
    public final AdConfig.AdQualityConfig f31744z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E6(AdQualityResult result, Te uidMap, AdConfig.AdQualityConfig config) {
        super(C3271ic.f36944b, result.getBeaconUrl(), uidMap, false, (F5) null, com.ironsource.G5.L, 64);
        kotlin.jvm.internal.e0.checkNotNullParameter(result, "result");
        kotlin.jvm.internal.e0.checkNotNullParameter(uidMap, "uidMap");
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        this.f31743y = result;
        this.f31744z = config;
    }

    @Override // com.inmobi.media.X9
    public final void f() throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        kotlin.jvm.internal.e0.checkNotNullParameter("JsonBeaconRequest", "tag");
        kotlin.jvm.internal.e0.checkNotNullParameter("preparing beacon request", PglCryptUtils.KEY_MESSAGE);
        Log.i("JsonBeaconRequest", "preparing beacon request");
        this.f32511t = false;
        this.f32512u = false;
        this.f32515x = false;
        this.f32513v = false;
        super.f();
        kotlin.jvm.internal.e0.checkNotNullParameter("JsonBeaconRequest", "tag");
        kotlin.jvm.internal.e0.checkNotNullParameter("getScreenshot", PglCryptUtils.KEY_MESSAGE);
        Log.i("JsonBeaconRequest", "getScreenshot");
        if (this.f31743y.getImageLocation().length() > 0) {
            kotlin.jvm.internal.e0.checkNotNullParameter("JsonBeaconRequest", "tag");
            kotlin.jvm.internal.e0.checkNotNullParameter("screen shot image found in DB", PglCryptUtils.KEY_MESSAGE);
            Log.i("JsonBeaconRequest", "screen shot image found in DB");
            try {
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.f31743y.getImageLocation());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (bitmapDecodeFile != null) {
                    bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                if (byteArray.length != 0 && (jSONObject2 = this.f32503l) != null) {
                    jSONObject2.put("screenshotImageByte", Base64.encodeToString(byteArray, 0));
                }
            } catch (FileNotFoundException e10) {
                kotlin.jvm.internal.e0.checkNotNullParameter("JsonBeaconRequest", "tag");
                kotlin.jvm.internal.e0.checkNotNullParameter("image file not found...", PglCryptUtils.KEY_MESSAGE);
                Log.e("JsonBeaconRequest", "image file not found...", e10);
            }
        } else {
            kotlin.jvm.internal.e0.checkNotNullParameter("JsonBeaconRequest", "tag");
            kotlin.jvm.internal.e0.checkNotNullParameter("result produced no screenshot", PglCryptUtils.KEY_MESSAGE);
            Log.i("JsonBeaconRequest", "result produced no screenshot");
        }
        kotlin.jvm.internal.e0.checkNotNullParameter("JsonBeaconRequest", "tag");
        kotlin.jvm.internal.e0.checkNotNullParameter("getExtras", PglCryptUtils.KEY_MESSAGE);
        Log.i("JsonBeaconRequest", "getExtras");
        try {
        } catch (JSONException e11) {
            kotlin.jvm.internal.e0.checkNotNullParameter("JsonBeaconRequest", "tag");
            kotlin.jvm.internal.e0.checkNotNullParameter("error while adding extras", PglCryptUtils.KEY_MESSAGE);
            Log.e("JsonBeaconRequest", "error while adding extras", e11);
        }
        if (D2.a(this.f31743y.getExtras())) {
            String extras = this.f31743y.getExtras();
            if (extras != null && (jSONObject = this.f32503l) != null) {
                jSONObject.put("templateInfo", new JSONObject(extras));
            }
        } else {
            kotlin.jvm.internal.e0.checkNotNullParameter("JsonBeaconRequest", "tag");
            kotlin.jvm.internal.e0.checkNotNullParameter("result has no extras", PglCryptUtils.KEY_MESSAGE);
            Log.i("JsonBeaconRequest", "result has no extras");
        }
        kotlin.jvm.internal.e0.checkNotNullParameter("JsonBeaconRequest", "tag");
        kotlin.jvm.internal.e0.checkNotNullParameter("getExtras", PglCryptUtils.KEY_MESSAGE);
        Log.i("JsonBeaconRequest", "getExtras");
        if (!D2.a(this.f31743y.getSdkModelResult())) {
            kotlin.jvm.internal.e0.checkNotNullParameter("JsonBeaconRequest", "tag");
            kotlin.jvm.internal.e0.checkNotNullParameter("result has no model info", PglCryptUtils.KEY_MESSAGE);
            Log.i("JsonBeaconRequest", "result has no model info");
        } else {
            JSONObject jSONObject3 = this.f32503l;
            if (jSONObject3 != null) {
                jSONObject3.put("sdkModelInfo", this.f31743y.getSdkModelResult());
            }
        }
    }
}
