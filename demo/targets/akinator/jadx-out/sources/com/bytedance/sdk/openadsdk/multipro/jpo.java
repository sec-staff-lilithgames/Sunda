package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface jpo {
    int jpo(Uri uri, ContentValues contentValues, String str, String[] strArr);

    int jpo(Uri uri, String str, String[] strArr);

    Cursor jpo(Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    Uri jpo(Uri uri, ContentValues contentValues);

    String jpo();

    String jpo(Uri uri);
}
