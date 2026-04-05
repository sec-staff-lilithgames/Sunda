package com.inmobi.media;

import android.content.ContentValues;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.ue, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3027ue extends AbstractC3068x4 {
    public C3027ue() {
        super("telemetry", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, eventSource TEXT NOT NULL, ts TEXT NOT NULL)");
    }

    @Override // com.inmobi.media.V1
    public final ContentValues b(Object obj) {
        C3044ve item = (C3044ve) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(item, "item");
        item.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("eventType", item.f32425a);
        contentValues.put("payload", item.a());
        contentValues.put("eventSource", item.f33518e);
        contentValues.put("ts", String.valueOf(item.f32426b));
        return contentValues;
    }

    @Override // com.inmobi.media.V1
    public final Object a(ContentValues contentValues) throws NumberFormatException {
        String str = VPCjETNfjxu.GOsBtb;
        kotlin.jvm.internal.e0.checkNotNullParameter(contentValues, str);
        kotlin.jvm.internal.e0.checkNotNullParameter(contentValues, str);
        String asString = contentValues.getAsString("eventType");
        String asString2 = contentValues.getAsString("payload");
        String asString3 = contentValues.getAsString("eventSource");
        String asString4 = contentValues.getAsString("ts");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(asString4, "getAsString(...)");
        long j10 = Long.parseLong(asString4);
        kotlin.jvm.internal.e0.checkNotNull(asString);
        kotlin.jvm.internal.e0.checkNotNull(asString3);
        C3044ve c3044ve = new C3044ve(asString, asString2, asString3);
        c3044ve.f32426b = j10;
        Integer asInteger = contentValues.getAsInteger("id");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(asInteger, "getAsInteger(...)");
        c3044ve.f32427c = asInteger.intValue();
        return c3044ve;
    }
}
