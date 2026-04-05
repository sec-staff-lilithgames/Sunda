package w7;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import e8.e;
import java.util.HashMap;
import x7.d;
import x7.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    public final AssetManager f90446d;

    /* renamed from: e, reason: collision with root package name */
    public r7.b f90447e;

    /* renamed from: a, reason: collision with root package name */
    public final j f90443a = new j();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f90444b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f90445c = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public String f90448f = ".ttf";

    public a(Drawable.Callback callback, r7.b bVar) {
        this.f90447e = bVar;
        if (callback instanceof View) {
            this.f90446d = ((View) callback).getContext().getAssets();
        } else {
            e.warning("LottieDrawable must be inside of a view for images to work.");
            this.f90446d = null;
        }
    }

    public Typeface getTypeface(d dVar) {
        Typeface typefaceCreateFromAsset;
        String family = dVar.getFamily();
        String style = dVar.getStyle();
        j jVar = this.f90443a;
        jVar.set(family, style);
        HashMap map = this.f90444b;
        Typeface typeface = (Typeface) map.get(jVar);
        if (typeface != null) {
            return typeface;
        }
        String family2 = dVar.getFamily();
        HashMap map2 = this.f90445c;
        Typeface typefaceCreate = (Typeface) map2.get(family2);
        if (typefaceCreate == null) {
            String style2 = dVar.getStyle();
            String name = dVar.getName();
            r7.b bVar = this.f90447e;
            if (bVar != null) {
                typefaceCreateFromAsset = bVar.fetchFont(family2, style2, name);
                if (typefaceCreateFromAsset == null) {
                    typefaceCreateFromAsset = this.f90447e.fetchFont(family2);
                }
            } else {
                typefaceCreateFromAsset = null;
            }
            r7.b bVar2 = this.f90447e;
            AssetManager assetManager = this.f90446d;
            if (bVar2 != null && typefaceCreateFromAsset == null) {
                String fontPath = bVar2.getFontPath(family2, style2, name);
                if (fontPath == null) {
                    fontPath = this.f90447e.getFontPath(family2);
                }
                if (fontPath != null) {
                    typefaceCreateFromAsset = Typeface.createFromAsset(assetManager, fontPath);
                }
            }
            if (dVar.getTypeface() != null) {
                typefaceCreate = dVar.getTypeface();
            } else {
                if (typefaceCreateFromAsset == null) {
                    typefaceCreate = Typeface.createFromAsset(assetManager, "fonts/" + family2 + this.f90448f);
                } else {
                    typefaceCreate = typefaceCreateFromAsset;
                }
                map2.put(family2, typefaceCreate);
            }
        }
        String style3 = dVar.getStyle();
        boolean zContains = style3.contains("Italic");
        boolean zContains2 = style3.contains("Bold");
        int i10 = (zContains && zContains2) ? 3 : zContains ? 2 : zContains2 ? 1 : 0;
        if (typefaceCreate.getStyle() != i10) {
            typefaceCreate = Typeface.create(typefaceCreate, i10);
        }
        map.put(jVar, typefaceCreate);
        return typefaceCreate;
    }

    public void setDefaultFontFileExtension(String str) {
        this.f90448f = str;
    }

    public void setDelegate(r7.b bVar) {
        this.f90447e = bVar;
    }
}
