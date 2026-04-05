package g3;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class n extends d {

    /* renamed from: f, reason: collision with root package name */
    public int f57125f = -1;

    /* renamed from: g, reason: collision with root package name */
    public float f57126g = Float.NaN;

    /* renamed from: h, reason: collision with root package name */
    public float f57127h = Float.NaN;

    /* renamed from: i, reason: collision with root package name */
    public float f57128i = Float.NaN;

    /* renamed from: j, reason: collision with root package name */
    public float f57129j = Float.NaN;

    /* renamed from: k, reason: collision with root package name */
    public float f57130k = Float.NaN;

    /* renamed from: l, reason: collision with root package name */
    public float f57131l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    public float f57132m = Float.NaN;

    /* renamed from: n, reason: collision with root package name */
    public float f57133n = Float.NaN;

    /* renamed from: o, reason: collision with root package name */
    public float f57134o = Float.NaN;

    /* renamed from: p, reason: collision with root package name */
    public float f57135p = Float.NaN;

    /* renamed from: q, reason: collision with root package name */
    public float f57136q = Float.NaN;

    /* renamed from: r, reason: collision with root package name */
    public float f57137r = Float.NaN;

    /* renamed from: s, reason: collision with root package name */
    public int f57138s = 0;

    /* renamed from: t, reason: collision with root package name */
    public float f57139t = Float.NaN;

    /* renamed from: u, reason: collision with root package name */
    public float f57140u = 0.0f;

    public n() {
        this.f56928d = 3;
        this.f56929e = new HashMap();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addTimeValues(java.util.HashMap<java.lang.String, f3.f0> r11) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.n.addTimeValues(java.util.HashMap):void");
    }

    @Override // g3.d
    public void addValues(HashMap<String, f3.q> map) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // g3.d
    public d copy(d dVar) {
        super.copy(dVar);
        n nVar = (n) dVar;
        nVar.getClass();
        this.f57125f = nVar.f57125f;
        this.f57138s = nVar.f57138s;
        this.f57139t = nVar.f57139t;
        this.f57140u = nVar.f57140u;
        this.f57137r = nVar.f57137r;
        this.f57126g = nVar.f57126g;
        this.f57127h = nVar.f57127h;
        this.f57128i = nVar.f57128i;
        this.f57131l = nVar.f57131l;
        this.f57129j = nVar.f57129j;
        this.f57130k = nVar.f57130k;
        this.f57132m = nVar.f57132m;
        this.f57133n = nVar.f57133n;
        this.f57134o = nVar.f57134o;
        this.f57135p = nVar.f57135p;
        this.f57136q = nVar.f57136q;
        return this;
    }

    @Override // g3.d
    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f57126g)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f57127h)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f57128i)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f57129j)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f57130k)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f57134o)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f57135p)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f57136q)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f57131l)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f57132m)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f57133n)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f57137r)) {
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
        m.read(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.r.f5551j));
    }

    @Override // g3.d
    public void setInterpolation(HashMap<String, Integer> map) {
        if (this.f57125f == -1) {
            return;
        }
        if (!Float.isNaN(this.f57126g)) {
            map.put("alpha", Integer.valueOf(this.f57125f));
        }
        if (!Float.isNaN(this.f57127h)) {
            map.put("elevation", Integer.valueOf(this.f57125f));
        }
        if (!Float.isNaN(this.f57128i)) {
            map.put("rotation", Integer.valueOf(this.f57125f));
        }
        if (!Float.isNaN(this.f57129j)) {
            map.put("rotationX", Integer.valueOf(this.f57125f));
        }
        if (!Float.isNaN(this.f57130k)) {
            map.put("rotationY", Integer.valueOf(this.f57125f));
        }
        if (!Float.isNaN(this.f57134o)) {
            map.put("translationX", Integer.valueOf(this.f57125f));
        }
        if (!Float.isNaN(this.f57135p)) {
            map.put("translationY", Integer.valueOf(this.f57125f));
        }
        if (!Float.isNaN(this.f57136q)) {
            map.put("translationZ", Integer.valueOf(this.f57125f));
        }
        if (!Float.isNaN(this.f57131l)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f57125f));
        }
        if (!Float.isNaN(this.f57132m)) {
            map.put("scaleX", Integer.valueOf(this.f57125f));
        }
        if (!Float.isNaN(this.f57132m)) {
            map.put("scaleY", Integer.valueOf(this.f57125f));
        }
        if (!Float.isNaN(this.f57137r)) {
            map.put(NotificationCompat.CATEGORY_PROGRESS, Integer.valueOf(this.f57125f));
        }
        if (this.f56929e.size() > 0) {
            Iterator it = this.f56929e.keySet().iterator();
            while (it.hasNext()) {
                map.put(a.b.k("CUSTOM,", (String) it.next()), Integer.valueOf(this.f57125f));
            }
        }
    }

    @Override // g3.d
    public void setValue(String str, Object obj) {
        str.getClass();
        switch (str) {
            case "motionProgress":
                this.f57137r = d.a(obj);
                break;
            case "transitionEasing":
                obj.toString();
                break;
            case "rotationX":
                this.f57129j = d.a(obj);
                break;
            case "rotationY":
                this.f57130k = d.a(obj);
                break;
            case "translationX":
                this.f57134o = d.a(obj);
                break;
            case "translationY":
                this.f57135p = d.a(obj);
                break;
            case "translationZ":
                this.f57136q = d.a(obj);
                break;
            case "scaleX":
                this.f57132m = d.a(obj);
                break;
            case "scaleY":
                this.f57133n = d.a(obj);
                break;
            case "rotation":
                this.f57128i = d.a(obj);
                break;
            case "elevation":
                this.f57127h = d.a(obj);
                break;
            case "transitionPathRotate":
                this.f57131l = d.a(obj);
                break;
            case "alpha":
                this.f57126g = d.a(obj);
                break;
            case "waveOffset":
                this.f57140u = d.a(obj);
                break;
            case "wavePeriod":
                this.f57139t = d.a(obj);
                break;
            case "curveFit":
                this.f57125f = d.b(obj);
                break;
            case "waveShape":
                if (!(obj instanceof Integer)) {
                    this.f57138s = 7;
                    obj.toString();
                    break;
                } else {
                    this.f57138s = d.b(obj);
                    break;
                }
        }
    }

    @Override // g3.d
    /* renamed from: clone */
    public d mo4052clone() {
        return new n().copy(this);
    }
}
