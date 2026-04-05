package com.applovin.impl;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class g7 {

    /* renamed from: a, reason: collision with root package name */
    private final Intent f14011a = new Intent();

    public g7 a(String str, String str2) {
        boolean zIsValidString = StringUtils.isValidString(str);
        boolean zIsValidString2 = StringUtils.isValidString(str2);
        if (zIsValidString && zIsValidString2) {
            this.f14011a.setDataAndType(Uri.parse(str), str2);
            return this;
        }
        if (zIsValidString) {
            this.f14011a.setData(Uri.parse(str));
            return this;
        }
        if (zIsValidString2) {
            this.f14011a.setType(str2);
        }
        return this;
    }

    public g7 b(String str) {
        if (StringUtils.isValidString(str)) {
            this.f14011a.addFlags(Integer.parseInt(str));
        }
        return this;
    }

    public Intent c(String str) {
        Intent intentCreateChooser = Intent.createChooser(this.f14011a, StringUtils.emptyIfNull(str));
        intentCreateChooser.addFlags(this.f14011a.getFlags());
        return intentCreateChooser;
    }

    public g7 d(String str) {
        if (StringUtils.isValidString(str)) {
            this.f14011a.setAction(str);
        }
        return this;
    }

    public g7 e(String str) {
        if (StringUtils.isValidString(str)) {
            this.f14011a.putExtras(JsonUtils.toBundle(JsonUtils.jsonObjectFromJsonString(str, new JSONObject())));
        }
        return this;
    }

    public g7 f(String str) {
        if (StringUtils.isValidString(str) && o0.j()) {
            this.f14011a.setIdentifier(str);
        }
        return this;
    }

    public g7 g(String str) {
        if (StringUtils.isValidString(str)) {
            this.f14011a.setSelector(new Intent(str));
        }
        return this;
    }

    public g7 h(String str) {
        if (StringUtils.isValidString(str)) {
            String[] strArrSplit = str.split(",");
            if (strArrSplit.length == 4) {
                this.f14011a.setSourceBounds(new Rect(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), Integer.parseInt(strArrSplit[3])));
            }
        }
        return this;
    }

    public g7 b(String str, String str2, String str3) {
        if (StringUtils.isValidString(str)) {
            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
            if (componentNameUnflattenFromString != null) {
                this.f14011a.setComponent(componentNameUnflattenFromString);
                return this;
            }
        } else {
            if (StringUtils.isValidString(str2) && StringUtils.isValidString(str3)) {
                this.f14011a.setClassName(str3, str2);
                return this;
            }
            if (StringUtils.isValidString(str3)) {
                this.f14011a.setPackage(str3);
            }
        }
        return this;
    }

    public g7 a(String str) {
        if (StringUtils.isValidString(str)) {
            for (String str2 : str.split(",")) {
                this.f14011a.addCategory(str2);
            }
        }
        return this;
    }

    public g7 a(String str, String str2, String str3) {
        ClipData clipDataNewRawUri;
        if (StringUtils.isValidString(str)) {
            Uri uri = Uri.parse(str);
            if (StringUtils.isValidString(str2)) {
                clipDataNewRawUri = new ClipData(new ClipDescription(StringUtils.emptyIfNull(str3), new String[]{str2}), new ClipData.Item(uri));
            } else {
                clipDataNewRawUri = ClipData.newRawUri(StringUtils.emptyIfNull(str3), uri);
            }
            this.f14011a.setClipData(clipDataNewRawUri);
        }
        return this;
    }

    public Intent a() {
        return this.f14011a;
    }
}
