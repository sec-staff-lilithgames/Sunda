package y2;

import a3.k0;
import a3.u;
import a3.x;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.l;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    public int f93988c;

    /* renamed from: b, reason: collision with root package name */
    public float f93987b = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f93989e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f93990f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f93991g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f93992h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f93993i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f93994j = Float.NaN;

    /* renamed from: k, reason: collision with root package name */
    public float f93995k = Float.NaN;

    /* renamed from: l, reason: collision with root package name */
    public float f93996l = 0.0f;

    /* renamed from: m, reason: collision with root package name */
    public float f93997m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    public float f93998n = 0.0f;

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashMap f93999o = new LinkedHashMap();

    public static boolean a(float f10, float f11) {
        return (Float.isNaN(f10) || Float.isNaN(f11)) ? Float.isNaN(f10) != Float.isNaN(f11) : Math.abs(f10 - f11) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void addValues(HashMap<String, x> map, int i10) {
        for (String str : map.keySet()) {
            x xVar = map.get(str);
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
                case -1249320804:
                    if (str.equals("rotationZ")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals(NotificationCompat.CATEGORY_PROGRESS)) {
                        c10 = 6;
                        break;
                    }
                    break;
                case -987906986:
                    if (str.equals("pivotX")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case -987906985:
                    if (str.equals("pivotY")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c10 = '\n';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c10 = 11;
                        break;
                    }
                    break;
                case 803192288:
                    if (str.equals("pathRotate")) {
                        c10 = '\f';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    xVar.setPoint(i10, Float.isNaN(this.f93990f) ? 0.0f : this.f93990f);
                    break;
                case 1:
                    xVar.setPoint(i10, Float.isNaN(this.f93991g) ? 0.0f : this.f93991g);
                    break;
                case 2:
                    xVar.setPoint(i10, Float.isNaN(this.f93989e) ? 0.0f : this.f93989e);
                    break;
                case 3:
                    xVar.setPoint(i10, Float.isNaN(this.f93996l) ? 0.0f : this.f93996l);
                    break;
                case 4:
                    xVar.setPoint(i10, Float.isNaN(this.f93997m) ? 0.0f : this.f93997m);
                    break;
                case 5:
                    xVar.setPoint(i10, Float.isNaN(this.f93998n) ? 0.0f : this.f93998n);
                    break;
                case 6:
                    xVar.setPoint(i10, Float.isNaN(Float.NaN) ? 0.0f : Float.NaN);
                    break;
                case 7:
                    xVar.setPoint(i10, Float.isNaN(this.f93994j) ? 0.0f : this.f93994j);
                    break;
                case '\b':
                    xVar.setPoint(i10, Float.isNaN(this.f93995k) ? 0.0f : this.f93995k);
                    break;
                case '\t':
                    xVar.setPoint(i10, Float.isNaN(this.f93992h) ? 1.0f : this.f93992h);
                    break;
                case '\n':
                    xVar.setPoint(i10, Float.isNaN(this.f93993i) ? 1.0f : this.f93993i);
                    break;
                case 11:
                    xVar.setPoint(i10, Float.isNaN(this.f93987b) ? 1.0f : this.f93987b);
                    break;
                case '\f':
                    xVar.setPoint(i10, Float.isNaN(Float.NaN) ? 0.0f : Float.NaN);
                    break;
                default:
                    if (str.startsWith(l.f37559f)) {
                        String str2 = str.split(",")[1];
                        LinkedHashMap linkedHashMap = this.f93999o;
                        if (linkedHashMap.containsKey(str2)) {
                            c cVar = (c) linkedHashMap.get(str2);
                            if (xVar instanceof x.b) {
                                ((x.b) xVar).setPoint(i10, cVar);
                                break;
                            } else {
                                k0.loge("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i10 + ", value" + cVar.getValueToInterpolate() + xVar);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        k0.loge("MotionPaths", "UNKNOWN spline ".concat(str));
                        break;
                    }
            }
        }
    }

    public void applyParameters(h hVar) {
        this.f93988c = hVar.getVisibility();
        this.f93987b = hVar.getVisibility() != 4 ? 0.0f : hVar.getAlpha();
        this.f93989e = hVar.getRotationZ();
        this.f93990f = hVar.getRotationX();
        this.f93991g = hVar.getRotationY();
        this.f93992h = hVar.getScaleX();
        this.f93993i = hVar.getScaleY();
        this.f93994j = hVar.getPivotX();
        this.f93995k = hVar.getPivotY();
        this.f93996l = hVar.getTranslationX();
        this.f93997m = hVar.getTranslationY();
        this.f93998n = hVar.getTranslationZ();
        for (String str : hVar.getCustomAttributeNames()) {
            c customAttribute = hVar.getCustomAttribute(str);
            if (customAttribute != null && customAttribute.isContinuous()) {
                this.f93999o.put(str, customAttribute);
            }
        }
    }

    public void setState(h hVar) {
        hVar.getX();
        hVar.getY();
        hVar.getWidth();
        hVar.getHeight();
        applyParameters(hVar);
    }

    @Override // java.lang.Comparable
    public int compareTo(f fVar) {
        fVar.getClass();
        return Float.compare(0.0f, 0.0f);
    }

    public void setState(u uVar, h hVar, int i10, float f10) {
        int i11 = uVar.f4038b;
        uVar.width();
        uVar.height();
        applyParameters(hVar);
        this.f93994j = Float.NaN;
        this.f93995k = Float.NaN;
        if (i10 == 1) {
            this.f93989e = f10 - 90.0f;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f93989e = f10 + 90.0f;
        }
    }
}
