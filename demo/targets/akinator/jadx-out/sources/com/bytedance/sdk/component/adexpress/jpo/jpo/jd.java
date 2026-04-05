package com.bytedance.sdk.component.adexpress.jpo.jpo;

import android.content.ContentValues;
import android.database.Cursor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface jd {
    int jpo(String str, ContentValues contentValues, String str2, String[] strArr);

    int jpo(String str, String str2, String[] strArr);

    Cursor jpo(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5);

    void jpo(String str, ContentValues contentValues);
}
