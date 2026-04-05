package com.bytedance.adsdk.jd.jd;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.adsdk.jd.wqx;
import com.bytedance.adsdk.jd.wqx.qk;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: cm, reason: collision with root package name */
    private final AssetManager f17236cm;
    private wqx my;
    private final qk<String> jpo = new qk<>();

    /* renamed from: jd, reason: collision with root package name */
    private final Map<qk<String>, Typeface> f17237jd = new HashMap();
    private final Map<String, Typeface> wqx = new HashMap();

    /* renamed from: jj, reason: collision with root package name */
    private String f17238jj = ".ttf";

    public jpo(Drawable.Callback callback, wqx wqxVar) {
        this.my = wqxVar;
        if (callback instanceof View) {
            this.f17236cm = ((View) callback).getContext().getAssets();
        } else {
            this.f17236cm = null;
        }
    }

    private Typeface jd(com.bytedance.adsdk.jd.wqx.wqx wqxVar) {
        Typeface typefaceCreateFromAsset;
        String strJpo = wqxVar.jpo();
        Typeface typeface = this.wqx.get(strJpo);
        if (typeface != null) {
            return typeface;
        }
        String strWqx = wqxVar.wqx();
        String strJd = wqxVar.jd();
        wqx wqxVar2 = this.my;
        if (wqxVar2 != null) {
            typefaceCreateFromAsset = wqxVar2.jpo(strJpo, strWqx, strJd);
            if (typefaceCreateFromAsset == null) {
                typefaceCreateFromAsset = this.my.jpo(strJpo);
            }
        } else {
            typefaceCreateFromAsset = null;
        }
        wqx wqxVar3 = this.my;
        if (wqxVar3 != null && typefaceCreateFromAsset == null) {
            String strJd2 = wqxVar3.jd(strJpo, strWqx, strJd);
            if (strJd2 == null) {
                strJd2 = this.my.jd(strJpo);
            }
            if (strJd2 != null) {
                try {
                    typefaceCreateFromAsset = Typeface.createFromAsset(this.f17236cm, strJd2);
                } catch (Throwable unused) {
                    typefaceCreateFromAsset = Typeface.DEFAULT;
                }
            }
        }
        if (wqxVar.cm() != null) {
            return wqxVar.cm();
        }
        if (typefaceCreateFromAsset == null) {
            try {
                typefaceCreateFromAsset = Typeface.createFromAsset(this.f17236cm, "fonts/" + strJpo + this.f17238jj);
            } catch (Throwable unused2) {
                typefaceCreateFromAsset = Typeface.DEFAULT;
            }
        }
        this.wqx.put(strJpo, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    public void jpo(wqx wqxVar) {
        this.my = wqxVar;
    }

    public void jpo(String str) {
        this.f17238jj = str;
    }

    public Typeface jpo(com.bytedance.adsdk.jd.wqx.wqx wqxVar) {
        this.jpo.jpo(wqxVar.jpo(), wqxVar.wqx());
        Typeface typeface = this.f17237jd.get(this.jpo);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceJpo = jpo(jd(wqxVar), wqxVar.wqx());
        this.f17237jd.put(this.jpo, typefaceJpo);
        return typefaceJpo;
    }

    private Typeface jpo(Typeface typeface, String str) {
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        int i10 = (zContains && zContains2) ? 3 : zContains ? 2 : zContains2 ? 1 : 0;
        return typeface.getStyle() == i10 ? typeface : Typeface.create(typeface, i10);
    }
}
