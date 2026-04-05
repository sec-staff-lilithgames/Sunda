package com.inmobi.media;

import android.content.ContentValues;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.f3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2763f3 extends V1 {
    public C2763f3() {
        super("c_data", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, e_data TEXT NOT NULL, timestamp INTEGER NOT NULL )");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("f3", "getSimpleName(...)");
    }

    @Override // com.inmobi.media.V1
    public final Object a(ContentValues contentValues) {
        kotlin.jvm.internal.e0.checkNotNullParameter(contentValues, "contentValues");
        String asString = contentValues.getAsString("e_data");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(asString, "getAsString(...)");
        Long asLong = contentValues.getAsLong("timestamp");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(asLong, "getAsLong(...)");
        return new C2916o4(asString, asLong.longValue());
    }

    @Override // com.inmobi.media.V1
    public final ContentValues b(Object obj) {
        C2916o4 data = (C2916o4) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
        ContentValues contentValues = new ContentValues();
        contentValues.put("e_data", data.f33177a);
        contentValues.put("timestamp", Long.valueOf(data.f33178b));
        return contentValues;
    }
}
