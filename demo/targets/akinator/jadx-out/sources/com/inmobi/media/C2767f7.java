package com.inmobi.media;

import android.content.ContentValues;
import io.ktor.http.ContentDisposition;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.f7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2767f7 extends V1 {

    /* renamed from: b, reason: collision with root package name */
    public I5 f32838b;

    static {
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("f7", "getSimpleName(...)");
    }

    public C2767f7() {
        super("logs_v2", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, filename TEXT NOT NULL, saveTimestamp INTEGER NOT NULL, retryCount INTEGER NOT NULL, hasLoggerFinished INTEGER NOT NULL, checkpoints INTEGER NOT NULL,lastRetryTimestamp INTEGER NOT NULL )");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    @Override // com.inmobi.media.V1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.ContentValues r12) {
        /*
            r11 = this;
            java.lang.String r0 = "contentValues"
            kotlin.jvm.internal.e0.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "filename"
            java.lang.String r2 = r12.getAsString(r0)
            java.lang.String r0 = "saveTimestamp"
            java.lang.Long r0 = r12.getAsLong(r0)
            java.lang.String r1 = "retryCount"
            java.lang.Integer r1 = r12.getAsInteger(r1)
            java.lang.String r3 = "lastRetryTimestamp"
            java.lang.Long r3 = r12.getAsLong(r3)
            java.lang.String r4 = "checkpoints"
            java.lang.Integer r4 = r12.getAsInteger(r4)
            java.lang.String r5 = "hasLoggerFinished"
            java.lang.Integer r12 = r12.getAsInteger(r5)
            if (r12 != 0) goto L2c
            goto L36
        L2c:
            int r12 = r12.intValue()
            r5 = 1
            if (r12 != r5) goto L36
        L33:
            r12 = r1
            r8 = r5
            goto L38
        L36:
            r5 = 0
            goto L33
        L38:
            com.inmobi.media.e7 r1 = new com.inmobi.media.e7
            kotlin.jvm.internal.e0.checkNotNull(r2)
            kotlin.jvm.internal.e0.checkNotNull(r0)
            long r5 = r0.longValue()
            kotlin.jvm.internal.e0.checkNotNull(r12)
            int r12 = r12.intValue()
            kotlin.jvm.internal.e0.checkNotNull(r3)
            long r9 = r3.longValue()
            kotlin.jvm.internal.e0.checkNotNull(r4)
            int r0 = r4.intValue()
            r3 = r5
            r6 = r9
            r5 = r12
            r9 = r0
            r1.<init>(r2, r3, r5, r6, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2767f7.a(android.content.ContentValues):java.lang.Object");
    }

    @Override // com.inmobi.media.V1
    public final ContentValues b(Object obj) {
        C2750e7 item = (C2750e7) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(item, "item");
        ContentValues contentValues = new ContentValues();
        contentValues.put(ContentDisposition.Parameters.FileName, item.f32807a);
        contentValues.put("saveTimestamp", Long.valueOf(item.f32808b));
        contentValues.put("retryCount", Integer.valueOf(item.f32809c));
        contentValues.put("lastRetryTimestamp", Long.valueOf(item.f32810d));
        contentValues.put("checkpoints", Integer.valueOf(item.f32812f));
        contentValues.put("hasLoggerFinished", Integer.valueOf(item.f32811e ? 1 : 0));
        return contentValues;
    }

    public final void a(C2750e7 data) {
        kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
        a("filename=\"" + data.f32807a + AbstractJsonLexerKt.STRING, null);
    }

    public final void b(C2750e7 data) {
        kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
        b(data, AbstractC2962r0.a(new StringBuilder("filename=\""), data.f32807a, AbstractJsonLexerKt.STRING), null);
        if (this.f32838b != null) {
            I5.a();
        }
    }
}
