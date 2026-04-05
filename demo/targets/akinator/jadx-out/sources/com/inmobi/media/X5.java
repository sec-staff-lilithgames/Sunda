package com.inmobi.media;

import android.content.ContentValues;
import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class X5 extends AbstractC3068x4 {
    public X5() {
        super("crash", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, componentType TEXT NOT NULL, eventId TEXT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, ts TEXT NOT NULL)");
    }

    @Override // com.inmobi.media.V1
    public final Object a(ContentValues contentValues) throws NumberFormatException {
        kotlin.jvm.internal.e0.checkNotNullParameter(contentValues, "contentValues");
        kotlin.jvm.internal.e0.checkNotNullParameter(contentValues, "contentValues");
        String asString = contentValues.getAsString("eventId");
        String asString2 = contentValues.getAsString("eventType");
        String asString3 = contentValues.getAsString("componentType");
        String asString4 = contentValues.getAsString("payload");
        String asString5 = contentValues.getAsString("ts");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(asString5, "getAsString(...)");
        long j10 = Long.parseLong(asString5);
        kotlin.jvm.internal.e0.checkNotNull(asString);
        kotlin.jvm.internal.e0.checkNotNull(asString3);
        kotlin.jvm.internal.e0.checkNotNull(asString2);
        Z5 z52 = new Z5(asString, asString3, asString2, asString4);
        z52.f32426b = j10;
        Integer asInteger = contentValues.getAsInteger("id");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(asInteger, "getAsInteger(...)");
        z52.f32427c = asInteger.intValue();
        return z52;
    }

    @Override // com.inmobi.media.V1
    public final ContentValues b(Object obj) {
        Z5 item = (Z5) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(item, "item");
        item.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("eventId", item.f32594e);
        contentValues.put(QFzuMMDfrzagDN.DLsT, item.f32595f);
        contentValues.put("eventType", item.f32425a);
        contentValues.put("payload", item.a());
        contentValues.put("ts", String.valueOf(item.f32426b));
        return contentValues;
    }
}
