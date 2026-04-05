package g3;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public int f56925a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f56926b = -1;

    /* renamed from: c, reason: collision with root package name */
    public String f56927c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f56928d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f56929e;

    public static float a(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    public static int b(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }

    public abstract void addValues(HashMap<String, f3.q> map);

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public abstract d mo4052clone();

    public d copy(d dVar) {
        this.f56925a = dVar.f56925a;
        this.f56926b = dVar.f56926b;
        this.f56927c = dVar.f56927c;
        this.f56928d = dVar.f56928d;
        this.f56929e = dVar.f56929e;
        return this;
    }

    public abstract void getAttributeNames(HashSet hashSet);

    public int getFramePosition() {
        return this.f56925a;
    }

    public abstract void load(Context context, AttributeSet attributeSet);

    public void setFramePosition(int i10) {
        this.f56925a = i10;
    }

    public abstract void setValue(String str, Object obj);

    public d setViewId(int i10) {
        this.f56926b = i10;
        return this;
    }

    public void setInterpolation(HashMap<String, Integer> map) {
    }
}
