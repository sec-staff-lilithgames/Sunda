package com.bytedance.sdk.openadsdk.cm.jpo;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my implements com.bytedance.sdk.openadsdk.multipro.jpo {
    private final com.bytedance.sdk.component.jj.jpo.jd.jd.jd jpo;

    public my(com.bytedance.sdk.component.jj.jpo.jd.jd.jd jdVar) {
        this.jpo = jdVar;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.jpo
    public String jpo() {
        com.bytedance.sdk.component.jj.jpo.jd.jd.jd jdVar = this.jpo;
        if (jdVar != null) {
            return jdVar.wqx();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.jpo
    public String jpo(Uri uri) {
        com.bytedance.sdk.component.jj.jpo.jd.jd.jd jdVar = this.jpo;
        if (jdVar != null) {
            return jdVar.jpo(uri);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.jpo
    public Cursor jpo(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        com.bytedance.sdk.component.jj.jpo.jd.jd.jd jdVar = this.jpo;
        if (jdVar != null) {
            return jdVar.jpo(uri, strArr, str, strArr2, str2);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.jpo
    public Uri jpo(Uri uri, ContentValues contentValues) {
        com.bytedance.sdk.component.jj.jpo.jd.jd.jd jdVar = this.jpo;
        if (jdVar != null) {
            return jdVar.jpo(uri, contentValues);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.jpo
    public int jpo(Uri uri, String str, String[] strArr) {
        com.bytedance.sdk.component.jj.jpo.jd.jd.jd jdVar = this.jpo;
        if (jdVar != null) {
            return jdVar.jpo(uri, str, strArr);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.jpo
    public int jpo(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        com.bytedance.sdk.component.jj.jpo.jd.jd.jd jdVar = this.jpo;
        if (jdVar != null) {
            return jdVar.jpo(uri, contentValues, str, strArr);
        }
        return 0;
    }
}
