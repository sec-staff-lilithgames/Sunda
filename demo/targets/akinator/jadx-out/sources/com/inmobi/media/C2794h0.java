package com.inmobi.media;

import android.content.ContentValues;
import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.inmobi.adquality.models.AdQualityResult;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.h0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2794h0 extends V1 {

    /* renamed from: b, reason: collision with root package name */
    public C2743e0 f32891b;

    public C2794h0() {
        super("ad_quality_db", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, image_location TEXT NOT NULL, sdk_model_result TEXT, beacon_url TEXT NOT NULL, extras TEXT)");
    }

    @Override // com.inmobi.media.V1
    public final Object a(ContentValues contentValues) {
        kotlin.jvm.internal.e0.checkNotNullParameter(contentValues, "contentValues");
        String asString = contentValues.getAsString("image_location");
        String asString2 = contentValues.getAsString("beacon_url");
        String asString3 = contentValues.getAsString("sdk_model_result");
        String asString4 = contentValues.getAsString("extras");
        if ((asString2 != null && asString2.length() != 0) || (asString != null && asString.length() != 0)) {
            kotlin.jvm.internal.e0.checkNotNull(asString);
            kotlin.jvm.internal.e0.checkNotNull(asString2);
            return new AdQualityResult(asString, asString3, asString2, asString4);
        }
        String asString5 = contentValues.getAsString("id");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(asString5, "getAsString(...)");
        a("id=?", new String[]{asString5});
        return null;
    }

    @Override // com.inmobi.media.V1
    public final ContentValues b(Object obj) {
        AdQualityResult item = (AdQualityResult) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(item, "item");
        ContentValues contentValues = new ContentValues();
        contentValues.put("image_location", item.getImageLocation());
        String sdkModelResult = item.getSdkModelResult();
        if (sdkModelResult == null) {
            sdkModelResult = "";
        }
        contentValues.put("sdk_model_result", sdkModelResult);
        contentValues.put("beacon_url", item.getBeaconUrl());
        contentValues.put("extras", item.getExtras());
        return contentValues;
    }

    public final void a(AdQualityResult result) {
        kotlin.jvm.internal.e0.checkNotNullParameter(result, "result");
        Log.i("AdQualityDao", "queueing");
        a((Object) result);
        C2743e0 c2743e0 = this.f32891b;
        if (c2743e0 != null) {
            Log.i("AdQualityDao", "sending callback - queued");
            kotlin.jvm.internal.e0.checkNotNullParameter("AdQualityBeaconExecutor", "tag");
            kotlin.jvm.internal.e0.checkNotNullParameter("item update callback received", PglCryptUtils.KEY_MESSAGE);
            Log.i("AdQualityBeaconExecutor", "item update callback received");
            if (c2743e0.f32791c.get()) {
                kotlin.jvm.internal.e0.checkNotNullParameter("AdQualityBeaconExecutor", "tag");
                kotlin.jvm.internal.e0.checkNotNullParameter("resume executor", PglCryptUtils.KEY_MESSAGE);
                Log.i("AdQualityBeaconExecutor", "resume executor");
                c2743e0.f32791c.set(false);
                C2709c0 execute = new C2709c0(c2743e0);
                kotlin.jvm.internal.e0.checkNotNullParameter(execute, "execute");
                ScheduledExecutorService scheduledExecutorService = C2777g0.f32850a;
                C2777g0.a(new C2708c(execute));
            }
        }
    }
}
