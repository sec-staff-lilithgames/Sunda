package g3;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.k;
import androidx.core.app.NotificationCompat;
import f3.q;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public int f57190e;

    /* renamed from: b, reason: collision with root package name */
    public float f57188b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public int f57189c = 0;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f57191f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public float f57192g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f57193h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f57194i = 0.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f57195j = 0.0f;

    /* renamed from: k, reason: collision with root package name */
    public float f57196k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    public float f57197l = 1.0f;

    /* renamed from: m, reason: collision with root package name */
    public float f57198m = Float.NaN;

    /* renamed from: n, reason: collision with root package name */
    public float f57199n = Float.NaN;

    /* renamed from: o, reason: collision with root package name */
    public float f57200o = 0.0f;

    /* renamed from: p, reason: collision with root package name */
    public float f57201p = 0.0f;

    /* renamed from: q, reason: collision with root package name */
    public float f57202q = 0.0f;

    /* renamed from: r, reason: collision with root package name */
    public float f57203r = Float.NaN;

    /* renamed from: s, reason: collision with root package name */
    public float f57204s = Float.NaN;

    public static boolean a(float f10, float f11) {
        return (Float.isNaN(f10) || Float.isNaN(f11)) ? Float.isNaN(f10) != Float.isNaN(f11) : Math.abs(f10 - f11) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void addValues(HashMap<String, f3.q> map, int i10) {
        for (String str : map.keySet()) {
            f3.q qVar = map.get(str);
            if (qVar != null) {
                str.getClass();
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case -1001078227:
                        if (str.equals(NotificationCompat.CATEGORY_PROGRESS)) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            c10 = 7;
                            break;
                        }
                        break;
                    case -760884510:
                        if (str.equals("transformPivotX")) {
                            c10 = '\b';
                            break;
                        }
                        break;
                    case -760884509:
                        if (str.equals("transformPivotY")) {
                            c10 = '\t';
                            break;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            c10 = '\n';
                            break;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            c10 = 11;
                            break;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            c10 = '\f';
                            break;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            c10 = '\r';
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        qVar.setPoint(i10, Float.isNaN(this.f57195j) ? 0.0f : this.f57195j);
                        break;
                    case 1:
                        qVar.setPoint(i10, Float.isNaN(this.f57188b) ? 0.0f : this.f57188b);
                        break;
                    case 2:
                        qVar.setPoint(i10, Float.isNaN(this.f57200o) ? 0.0f : this.f57200o);
                        break;
                    case 3:
                        qVar.setPoint(i10, Float.isNaN(this.f57201p) ? 0.0f : this.f57201p);
                        break;
                    case 4:
                        qVar.setPoint(i10, Float.isNaN(this.f57202q) ? 0.0f : this.f57202q);
                        break;
                    case 5:
                        qVar.setPoint(i10, Float.isNaN(this.f57204s) ? 0.0f : this.f57204s);
                        break;
                    case 6:
                        qVar.setPoint(i10, Float.isNaN(this.f57196k) ? 1.0f : this.f57196k);
                        break;
                    case 7:
                        qVar.setPoint(i10, Float.isNaN(this.f57197l) ? 1.0f : this.f57197l);
                        break;
                    case '\b':
                        qVar.setPoint(i10, Float.isNaN(this.f57198m) ? 0.0f : this.f57198m);
                        break;
                    case '\t':
                        qVar.setPoint(i10, Float.isNaN(this.f57199n) ? 0.0f : this.f57199n);
                        break;
                    case '\n':
                        qVar.setPoint(i10, Float.isNaN(this.f57194i) ? 0.0f : this.f57194i);
                        break;
                    case 11:
                        qVar.setPoint(i10, Float.isNaN(this.f57193h) ? 0.0f : this.f57193h);
                        break;
                    case '\f':
                        qVar.setPoint(i10, Float.isNaN(this.f57203r) ? 0.0f : this.f57203r);
                        break;
                    case '\r':
                        qVar.setPoint(i10, Float.isNaN(this.f57192g) ? 1.0f : this.f57192g);
                        break;
                    default:
                        if (str.startsWith(com.ironsource.mediationsdk.l.f37559f)) {
                            String str2 = str.split(",")[1];
                            LinkedHashMap linkedHashMap = this.f57191f;
                            if (linkedHashMap.containsKey(str2)) {
                                androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) linkedHashMap.get(str2);
                                if (qVar instanceof q.a) {
                                    ((q.a) qVar).setPoint(i10, bVar);
                                    break;
                                } else {
                                    Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i10 + ", value" + bVar.getValueToInterpolate() + qVar);
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            Log.e("MotionPaths", "UNKNOWN spline ".concat(str));
                            break;
                        }
                }
            }
        }
    }

    public void applyParameters(View view) {
        this.f57190e = view.getVisibility();
        this.f57192g = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f57193h = view.getElevation();
        this.f57194i = view.getRotation();
        this.f57195j = view.getRotationX();
        this.f57188b = view.getRotationY();
        this.f57196k = view.getScaleX();
        this.f57197l = view.getScaleY();
        this.f57198m = view.getPivotX();
        this.f57199n = view.getPivotY();
        this.f57200o = view.getTranslationX();
        this.f57201p = view.getTranslationY();
        this.f57202q = view.getTranslationZ();
    }

    public void setState(View view) {
        view.getX();
        view.getY();
        view.getWidth();
        view.getHeight();
        applyParameters(view);
    }

    @Override // java.lang.Comparable
    public int compareTo(q qVar) {
        qVar.getClass();
        return Float.compare(0.0f, 0.0f);
    }

    public void setState(Rect rect, View view, int i10, float f10) {
        int i11 = rect.left;
        rect.width();
        rect.height();
        applyParameters(view);
        this.f57198m = Float.NaN;
        this.f57199n = Float.NaN;
        if (i10 == 1) {
            this.f57194i = f10 - 90.0f;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f57194i = f10 + 90.0f;
        }
    }

    public void setState(Rect rect, androidx.constraintlayout.widget.k kVar, int i10, int i11) {
        int i12 = rect.left;
        rect.width();
        rect.height();
        applyParameters(kVar.getParameters(i11));
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return;
                    }
                }
            }
            float f10 = this.f57194i + 90.0f;
            this.f57194i = f10;
            if (f10 > 180.0f) {
                this.f57194i = f10 - 360.0f;
                return;
            }
            return;
        }
        this.f57194i -= 90.0f;
    }

    public void applyParameters(k.a aVar) {
        k.d dVar = aVar.f5438c;
        k.c cVar = aVar.f5439d;
        int i10 = dVar.f5503c;
        this.f57189c = i10;
        int i11 = dVar.f5502b;
        this.f57190e = i11;
        this.f57192g = (i11 == 0 || i10 != 0) ? dVar.f5504d : 0.0f;
        k.e eVar = aVar.f5441f;
        boolean z10 = eVar.f5519m;
        this.f57193h = eVar.f5520n;
        this.f57194i = eVar.f5508b;
        this.f57195j = eVar.f5509c;
        this.f57188b = eVar.f5510d;
        this.f57196k = eVar.f5511e;
        this.f57197l = eVar.f5512f;
        this.f57198m = eVar.f5513g;
        this.f57199n = eVar.f5514h;
        this.f57200o = eVar.f5516j;
        this.f57201p = eVar.f5517k;
        this.f57202q = eVar.f5518l;
        a3.g.getInterpolator(cVar.f5491d);
        this.f57203r = cVar.f5495h;
        int i12 = cVar.f5493f;
        int i13 = cVar.f5489b;
        this.f57204s = aVar.f5438c.f5505e;
        for (String str : aVar.f5442g.keySet()) {
            androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) aVar.f5442g.get(str);
            if (bVar.isContinuous()) {
                this.f57191f.put(str, bVar);
            }
        }
    }
}
