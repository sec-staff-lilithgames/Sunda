package com.bytedance.sdk.openadsdk.multipro.cm;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.bytedance.sdk.openadsdk.core.sq;
import com.moloco.sdk.BKC.KerkSviMAy;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class wqx implements com.bytedance.sdk.openadsdk.multipro.jpo {
    private Context jpo;

    private Context jd() {
        Context context = this.jpo;
        return context == null ? sq.jpo() : context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.jpo
    public String jpo() {
        return "t_sp";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.jpo
    public Cursor jpo(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Map<String, ?> mapWqx;
        if (!uri.getPath().split("/")[2].equals("get_all") || (mapWqx = jd.wqx(jd(), uri.getQueryParameter("sp_file_name"))) == null) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"cursor_name", "cursor_type", "cursor_value"});
        for (String str3 : mapWqx.keySet()) {
            Object[] objArr = new Object[3];
            objArr[0] = str3;
            Object obj = mapWqx.get(str3);
            objArr[2] = obj;
            if (obj instanceof Boolean) {
                objArr[1] = KerkSviMAy.EDuUGUAQx;
            } else if (obj instanceof String) {
                objArr[1] = "string";
            } else if (obj instanceof Integer) {
                objArr[1] = "int";
            } else if (obj instanceof Long) {
                objArr[1] = "long";
            } else if (obj instanceof Float) {
                objArr[1] = "float";
            }
            matrixCursor.addRow(objArr);
        }
        return matrixCursor;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.jpo
    public String jpo(Uri uri) {
        String[] strArrSplit = uri.getPath().split("/");
        String str = strArrSplit[2];
        String str2 = strArrSplit[3];
        if (str.equals("contain")) {
            return String.valueOf(jd.jpo(sq.jpo(), uri.getQueryParameter("sp_file_name"), str2));
        }
        return jd.jpo(jd(), uri.getQueryParameter("sp_file_name"), str2, str);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.jpo
    public Uri jpo(Uri uri, ContentValues contentValues) {
        if (contentValues == null) {
            return null;
        }
        String str = uri.getPath().split("/")[3];
        Object obj = contentValues.get("value");
        if (obj != null) {
            jd.jpo(jd(), uri.getQueryParameter("sp_file_name"), str, obj);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.jpo
    public int jpo(Uri uri, String str, String[] strArr) {
        String[] strArrSplit = uri.getPath().split("/");
        if (strArrSplit[2].equals("clean")) {
            jd.jd(jd(), uri.getQueryParameter("sp_file_name"));
            return 0;
        }
        String str2 = strArrSplit[3];
        if (jd.jpo(jd(), uri.getQueryParameter("sp_file_name"), str2)) {
            jd.jd(jd(), uri.getQueryParameter("sp_file_name"), str2);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.jpo
    public int jpo(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (contentValues == null) {
            return 0;
        }
        jpo(uri, contentValues);
        return 0;
    }
}
