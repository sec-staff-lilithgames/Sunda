package com.applovin.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class r7 implements n4 {

    /* renamed from: a, reason: collision with root package name */
    public final Set f15198a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Set f15199b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private Uri f15200c;

    /* renamed from: d, reason: collision with root package name */
    private Uri f15201d;

    /* renamed from: e, reason: collision with root package name */
    private int f15202e;

    /* renamed from: f, reason: collision with root package name */
    private int f15203f;

    public static r7 a(m8 m8Var, com.applovin.impl.sdk.k kVar) throws NumberFormatException {
        if (m8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        m8 m8VarC = m8Var.c("StaticResource");
        if (m8VarC == null || !URLUtil.isValidUrl(m8VarC.d())) {
            kVar.O();
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            kVar.O().b("VastIndustryIcon", "Unable to create industry icon.  No valid image URL found.");
            return null;
        }
        r7 r7Var = new r7();
        r7Var.f15200c = Uri.parse(m8VarC.d());
        m8 m8VarB = m8Var.b("IconClickThrough");
        if (m8VarB != null && URLUtil.isValidUrl(m8VarB.d())) {
            r7Var.f15201d = Uri.parse(m8VarB.d());
        }
        String str = (String) m8Var.a().get("width");
        int i10 = 0;
        int i11 = (str == null || Integer.parseInt(str) <= 0) ? 0 : Integer.parseInt(str);
        String str2 = (String) m8Var.a().get("height");
        if (str2 != null && Integer.parseInt(str2) > 0) {
            i10 = Integer.parseInt(str2);
        }
        int iIntValue = ((Integer) kVar.a(v4.M4)).intValue();
        if (i11 <= 0 || i10 <= 0) {
            r7Var.f15203f = iIntValue;
            r7Var.f15202e = iIntValue;
            return r7Var;
        }
        double d10 = i11 / i10;
        int iMin = Math.min(Math.max(i11, i10), iIntValue);
        if (i11 >= i10) {
            r7Var.f15202e = iMin;
            r7Var.f15203f = (int) (iMin / d10);
            return r7Var;
        }
        r7Var.f15203f = iMin;
        r7Var.f15202e = (int) (iMin * d10);
        return r7Var;
    }

    public Set b() {
        return this.f15198a;
    }

    public Uri c() {
        return this.f15201d;
    }

    public int d() {
        return this.f15203f;
    }

    public Uri e() {
        return this.f15200c;
    }

    public Set f() {
        return this.f15199b;
    }

    public int g() {
        return this.f15202e;
    }

    public String toString() {
        return "VastIndustryIcon{imageUri='" + e() + "', clickUri='" + c() + "', width=" + g() + ", height=" + d() + "}";
    }

    public static ImageView a(Uri uri, Context context, com.applovin.impl.sdk.k kVar) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setClickable(true);
        imageView.setVisibility(8);
        ImageViewUtils.setImageUri(imageView, uri, kVar);
        return imageView;
    }

    public static r7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        v7 v7VarA;
        v7 v7VarA2;
        if (jSONObject == null) {
            return null;
        }
        r7 r7Var = new r7();
        String string = JsonUtils.getString(jSONObject, "image_uri", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        r7Var.f15200c = Uri.parse(string);
        JSONArray jSONArrayT = b0.e2.t(jSONObject, "click_trackers");
        for (int i10 = 0; i10 < jSONArrayT.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayT, i10, (JSONObject) null);
            if (jSONObject2 != null && (v7VarA2 = v7.a(jSONObject2, kVar)) != null) {
                r7Var.f15198a.add(v7VarA2);
            }
        }
        JSONArray jSONArrayT2 = b0.e2.t(jSONObject, "view_trackers");
        for (int i11 = 0; i11 < jSONArrayT2.length(); i11++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArrayT2, i11, (JSONObject) null);
            if (jSONObject3 != null && (v7VarA = v7.a(jSONObject3, kVar)) != null) {
                r7Var.f15199b.add(v7VarA);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "click_uri", null);
        r7Var.f15201d = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        r7Var.f15202e = JsonUtils.getInt(jSONObject, "width", 0);
        r7Var.f15203f = JsonUtils.getInt(jSONObject, "height", 0);
        return r7Var;
    }

    @Override // com.applovin.impl.n4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f15198a.iterator();
        while (it.hasNext()) {
            jSONArray.put(((v7) it.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = this.f15199b.iterator();
        while (it2.hasNext()) {
            jSONArray.put(((v7) it2.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "view_trackers", jSONArray2);
        Uri uri = this.f15200c;
        JsonUtils.putString(jSONObject, "image_uri", uri == null ? null : uri.toString());
        Uri uri2 = this.f15201d;
        JsonUtils.putString(jSONObject, "click_uri", uri2 != null ? uri2.toString() : null);
        JsonUtils.putInt(jSONObject, "width", this.f15202e);
        JsonUtils.putInt(jSONObject, "height", this.f15203f);
        return jSONObject;
    }
}
