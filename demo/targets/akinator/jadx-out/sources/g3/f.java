package g3;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class f extends d {

    /* renamed from: f, reason: collision with root package name */
    public int f56933f = -1;

    /* renamed from: g, reason: collision with root package name */
    public float f56934g = Float.NaN;

    /* renamed from: h, reason: collision with root package name */
    public float f56935h = Float.NaN;

    /* renamed from: i, reason: collision with root package name */
    public float f56936i = Float.NaN;

    /* renamed from: j, reason: collision with root package name */
    public float f56937j = Float.NaN;

    /* renamed from: k, reason: collision with root package name */
    public float f56938k = Float.NaN;

    /* renamed from: l, reason: collision with root package name */
    public float f56939l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    public float f56940m = Float.NaN;

    /* renamed from: n, reason: collision with root package name */
    public float f56941n = Float.NaN;

    /* renamed from: o, reason: collision with root package name */
    public float f56942o = Float.NaN;

    /* renamed from: p, reason: collision with root package name */
    public float f56943p = Float.NaN;

    /* renamed from: q, reason: collision with root package name */
    public float f56944q = Float.NaN;

    /* renamed from: r, reason: collision with root package name */
    public float f56945r = Float.NaN;

    /* renamed from: s, reason: collision with root package name */
    public float f56946s = Float.NaN;

    /* renamed from: t, reason: collision with root package name */
    public float f56947t = Float.NaN;

    public f() {
        this.f56928d = 1;
        this.f56929e = new HashMap();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    @Override // g3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addValues(java.util.HashMap<java.lang.String, f3.q> r7) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.f.addValues(java.util.HashMap):void");
    }

    @Override // g3.d
    public d copy(d dVar) {
        super.copy(dVar);
        f fVar = (f) dVar;
        this.f56933f = fVar.f56933f;
        this.f56934g = fVar.f56934g;
        this.f56935h = fVar.f56935h;
        this.f56936i = fVar.f56936i;
        this.f56937j = fVar.f56937j;
        this.f56938k = fVar.f56938k;
        this.f56939l = fVar.f56939l;
        this.f56940m = fVar.f56940m;
        this.f56941n = fVar.f56941n;
        this.f56942o = fVar.f56942o;
        this.f56943p = fVar.f56943p;
        this.f56944q = fVar.f56944q;
        this.f56945r = fVar.f56945r;
        this.f56946s = fVar.f56946s;
        this.f56947t = fVar.f56947t;
        return this;
    }

    @Override // g3.d
    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f56934g)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f56935h)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f56936i)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f56937j)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f56938k)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f56939l)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f56940m)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f56944q)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f56945r)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f56946s)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f56941n)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f56942o)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f56943p)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f56947t)) {
            hashSet.add(NotificationCompat.CATEGORY_PROGRESS);
        }
        if (this.f56929e.size() > 0) {
            Iterator it = this.f56929e.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // g3.d
    public void load(Context context, AttributeSet attributeSet) {
        e.read(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.r.f5548g));
    }

    @Override // g3.d
    public void setInterpolation(HashMap<String, Integer> map) {
        if (this.f56933f == -1) {
            return;
        }
        if (!Float.isNaN(this.f56934g)) {
            map.put("alpha", Integer.valueOf(this.f56933f));
        }
        if (!Float.isNaN(this.f56935h)) {
            map.put("elevation", Integer.valueOf(this.f56933f));
        }
        if (!Float.isNaN(this.f56936i)) {
            map.put("rotation", Integer.valueOf(this.f56933f));
        }
        if (!Float.isNaN(this.f56937j)) {
            map.put("rotationX", Integer.valueOf(this.f56933f));
        }
        if (!Float.isNaN(this.f56938k)) {
            map.put("rotationY", Integer.valueOf(this.f56933f));
        }
        if (!Float.isNaN(this.f56939l)) {
            map.put("transformPivotX", Integer.valueOf(this.f56933f));
        }
        if (!Float.isNaN(this.f56940m)) {
            map.put("transformPivotY", Integer.valueOf(this.f56933f));
        }
        if (!Float.isNaN(this.f56944q)) {
            map.put("translationX", Integer.valueOf(this.f56933f));
        }
        if (!Float.isNaN(this.f56945r)) {
            map.put("translationY", Integer.valueOf(this.f56933f));
        }
        if (!Float.isNaN(this.f56946s)) {
            map.put("translationZ", Integer.valueOf(this.f56933f));
        }
        if (!Float.isNaN(this.f56941n)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f56933f));
        }
        if (!Float.isNaN(this.f56942o)) {
            map.put("scaleX", Integer.valueOf(this.f56933f));
        }
        if (!Float.isNaN(this.f56943p)) {
            map.put("scaleY", Integer.valueOf(this.f56933f));
        }
        if (!Float.isNaN(this.f56947t)) {
            map.put(NotificationCompat.CATEGORY_PROGRESS, Integer.valueOf(this.f56933f));
        }
        if (this.f56929e.size() > 0) {
            Iterator it = this.f56929e.keySet().iterator();
            while (it.hasNext()) {
                map.put(a.b.k("CUSTOM,", (String) it.next()), Integer.valueOf(this.f56933f));
            }
        }
    }

    @Override // g3.d
    public void setValue(String str, Object obj) {
        str.getClass();
        switch (str) {
            case "motionProgress":
                this.f56947t = d.a(obj);
                break;
            case "transitionEasing":
                obj.toString();
                break;
            case "rotationX":
                this.f56937j = d.a(obj);
                break;
            case "rotationY":
                this.f56938k = d.a(obj);
                break;
            case "translationX":
                this.f56944q = d.a(obj);
                break;
            case "translationY":
                this.f56945r = d.a(obj);
                break;
            case "translationZ":
                this.f56946s = d.a(obj);
                break;
            case "scaleX":
                this.f56942o = d.a(obj);
                break;
            case "scaleY":
                this.f56943p = d.a(obj);
                break;
            case "transformPivotX":
                this.f56939l = d.a(obj);
                break;
            case "transformPivotY":
                this.f56940m = d.a(obj);
                break;
            case "rotation":
                this.f56936i = d.a(obj);
                break;
            case "elevation":
                this.f56935h = d.a(obj);
                break;
            case "transitionPathRotate":
                this.f56941n = d.a(obj);
                break;
            case "alpha":
                this.f56934g = d.a(obj);
                break;
            case "curveFit":
                this.f56933f = d.b(obj);
                break;
            case "visibility":
                if (!(obj instanceof Boolean)) {
                    Boolean.parseBoolean(obj.toString());
                    break;
                }
                break;
        }
    }

    @Override // g3.d
    /* renamed from: clone */
    public d mo4052clone() {
        return new f().copy(this);
    }
}
