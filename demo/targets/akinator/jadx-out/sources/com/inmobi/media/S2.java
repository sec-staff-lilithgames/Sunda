package com.inmobi.media;

import android.content.ContentValues;
import com.inmobi.commons.core.configs.Config;
import com.moloco.sdk.BKC.JzVV;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class S2 extends V1 {
    public S2() {
        super("config_db", "(account_id TEXT NOT NULL,config_value TEXT NOT NULL,config_type TEXT NOT NULL,update_ts INTEGER DEFAULT 0,UNIQUE(account_id,config_type))");
    }

    @Override // com.inmobi.media.V1
    public final Object a(ContentValues contentValues) {
        kotlin.jvm.internal.e0.checkNotNullParameter(contentValues, "contentValues");
        String asString = contentValues.getAsString(JzVV.aZzxhbSQuAuQNqH);
        if (asString == null) {
            return null;
        }
        String asString2 = contentValues.getAsString("account_id");
        Long asLong = contentValues.getAsLong("update_ts");
        I2 i22 = Config.Companion;
        String asString3 = contentValues.getAsString("config_type");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(asString3, "getAsString(...)");
        JSONObject jSONObject = new JSONObject(asString);
        kotlin.jvm.internal.e0.checkNotNull(asLong);
        long jLongValue = asLong.longValue();
        i22.getClass();
        return I2.a(asString3, jSONObject, asString2, jLongValue);
    }

    @Override // com.inmobi.media.V1
    public final ContentValues b(Object obj) {
        Config config = (Config) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        ContentValues contentValues = new ContentValues();
        contentValues.put("account_id", config.getAccountId$media_release());
        contentValues.put("config_value", config.toJson().toString());
        contentValues.put("config_type", config.getType());
        contentValues.put("update_ts", Long.valueOf(config.getLastUpdateTimeStamp()));
        return contentValues;
    }

    public final boolean b(String type, String accountId) {
        boolean z10;
        kotlin.jvm.internal.e0.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.e0.checkNotNullParameter(accountId, "accountId");
        try {
            z10 = !C3.b(this.f32382a, null, "account_id=? AND config_type=?", new String[]{accountId, type}, null, null, null, null).isEmpty();
        } catch (Exception unused) {
            z10 = false;
        }
        return !z10;
    }

    public final long a(String type, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(type, "type");
        String[] strArr = {str, type};
        R2 transform = R2.f32182a;
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        Object objInvoke = null;
        try {
            List<ContentValues> listB = C3.b(this.f32382a, null, "account_id=? AND config_type=?", strArr, null, null, null, null);
            if (!listB.isEmpty()) {
                objInvoke = transform.invoke(listB.get(0));
            }
        } catch (Exception unused) {
        }
        Long l9 = (Long) objInvoke;
        long jLongValue = l9 != null ? l9.longValue() : 0L;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("S2", "TAG");
        return jLongValue;
    }
}
