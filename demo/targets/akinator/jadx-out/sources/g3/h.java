package g3;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class h extends d {

    /* renamed from: f, reason: collision with root package name */
    public int f56954f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f56955g = -1;

    /* renamed from: h, reason: collision with root package name */
    public String f56956h = null;

    /* renamed from: i, reason: collision with root package name */
    public float f56957i = Float.NaN;

    /* renamed from: j, reason: collision with root package name */
    public float f56958j = 0.0f;

    /* renamed from: k, reason: collision with root package name */
    public float f56959k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    public float f56960l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    public int f56961m = -1;

    /* renamed from: n, reason: collision with root package name */
    public float f56962n = Float.NaN;

    /* renamed from: o, reason: collision with root package name */
    public float f56963o = Float.NaN;

    /* renamed from: p, reason: collision with root package name */
    public float f56964p = Float.NaN;

    /* renamed from: q, reason: collision with root package name */
    public float f56965q = Float.NaN;

    /* renamed from: r, reason: collision with root package name */
    public float f56966r = Float.NaN;

    /* renamed from: s, reason: collision with root package name */
    public float f56967s = Float.NaN;

    /* renamed from: t, reason: collision with root package name */
    public float f56968t = Float.NaN;

    /* renamed from: u, reason: collision with root package name */
    public float f56969u = Float.NaN;

    /* renamed from: v, reason: collision with root package name */
    public float f56970v = Float.NaN;

    /* renamed from: w, reason: collision with root package name */
    public float f56971w = Float.NaN;

    /* renamed from: x, reason: collision with root package name */
    public float f56972x = Float.NaN;

    public h() {
        this.f56928d = 4;
        this.f56929e = new HashMap();
    }

    public void addCycleValues(HashMap<String, f3.f> map) {
        f3.f fVar;
        f3.f fVar2;
        for (String str : map.keySet()) {
            if (str.startsWith(com.ironsource.mediationsdk.l.f37559f)) {
                androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) this.f56929e.get(str.substring(7));
                if (bVar != null && bVar.getType() == androidx.constraintlayout.widget.a.f5364c && (fVar = map.get(str)) != null) {
                    fVar.setPoint(this.f56925a, this.f56955g, this.f56956h, this.f56961m, this.f56957i, this.f56958j, this.f56959k, bVar.getValueToInterpolate(), bVar);
                }
            } else {
                float value = getValue(str);
                if (!Float.isNaN(value) && (fVar2 = map.get(str)) != null) {
                    fVar2.setPoint(this.f56925a, this.f56955g, this.f56956h, this.f56961m, this.f56957i, this.f56958j, this.f56959k, value);
                }
            }
        }
    }

    @Override // g3.d
    public void addValues(HashMap<String, f3.q> map) {
        b.logStack("KeyCycle", "add " + map.size() + " values", 2);
        for (String str : map.keySet()) {
            f3.q qVar = map.get(str);
            if (qVar != null) {
                str.getClass();
                switch (str) {
                    case "rotationX":
                        qVar.setPoint(this.f56925a, this.f56966r);
                        break;
                    case "rotationY":
                        qVar.setPoint(this.f56925a, this.f56967s);
                        break;
                    case "translationX":
                        qVar.setPoint(this.f56925a, this.f56970v);
                        break;
                    case "translationY":
                        qVar.setPoint(this.f56925a, this.f56971w);
                        break;
                    case "translationZ":
                        qVar.setPoint(this.f56925a, this.f56972x);
                        break;
                    case "progress":
                        qVar.setPoint(this.f56925a, this.f56960l);
                        break;
                    case "scaleX":
                        qVar.setPoint(this.f56925a, this.f56968t);
                        break;
                    case "scaleY":
                        qVar.setPoint(this.f56925a, this.f56969u);
                        break;
                    case "rotation":
                        qVar.setPoint(this.f56925a, this.f56964p);
                        break;
                    case "elevation":
                        qVar.setPoint(this.f56925a, this.f56963o);
                        break;
                    case "transitionPathRotate":
                        qVar.setPoint(this.f56925a, this.f56965q);
                        break;
                    case "alpha":
                        qVar.setPoint(this.f56925a, this.f56962n);
                        break;
                    case "waveOffset":
                        qVar.setPoint(this.f56925a, this.f56958j);
                        break;
                    case "wavePhase":
                        qVar.setPoint(this.f56925a, this.f56959k);
                        break;
                    default:
                        if (str.startsWith(com.ironsource.mediationsdk.l.f37559f)) {
                            break;
                        } else {
                            Log.v("WARNING KeyCycle", "  UNKNOWN  ".concat(str));
                            break;
                        }
                }
            }
        }
    }

    @Override // g3.d
    public d copy(d dVar) {
        super.copy(dVar);
        h hVar = (h) dVar;
        hVar.getClass();
        this.f56954f = hVar.f56954f;
        this.f56955g = hVar.f56955g;
        this.f56956h = hVar.f56956h;
        this.f56957i = hVar.f56957i;
        this.f56958j = hVar.f56958j;
        this.f56959k = hVar.f56959k;
        this.f56960l = hVar.f56960l;
        this.f56961m = hVar.f56961m;
        this.f56962n = hVar.f56962n;
        this.f56963o = hVar.f56963o;
        this.f56964p = hVar.f56964p;
        this.f56965q = hVar.f56965q;
        this.f56966r = hVar.f56966r;
        this.f56967s = hVar.f56967s;
        this.f56968t = hVar.f56968t;
        this.f56969u = hVar.f56969u;
        this.f56970v = hVar.f56970v;
        this.f56971w = hVar.f56971w;
        this.f56972x = hVar.f56972x;
        return this;
    }

    @Override // g3.d
    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f56962n)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f56963o)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f56964p)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f56966r)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f56967s)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f56968t)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f56969u)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f56965q)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f56970v)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f56971w)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f56972x)) {
            hashSet.add("translationZ");
        }
        if (this.f56929e.size() > 0) {
            Iterator it = this.f56929e.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    public float getValue(String str) {
        str.getClass();
        switch (str) {
            case "rotationX":
                return this.f56966r;
            case "rotationY":
                return this.f56967s;
            case "translationX":
                return this.f56970v;
            case "translationY":
                return this.f56971w;
            case "translationZ":
                return this.f56972x;
            case "progress":
                return this.f56960l;
            case "scaleX":
                return this.f56968t;
            case "scaleY":
                return this.f56969u;
            case "rotation":
                return this.f56964p;
            case "elevation":
                return this.f56963o;
            case "transitionPathRotate":
                return this.f56965q;
            case "alpha":
                return this.f56962n;
            case "waveOffset":
                return this.f56958j;
            case "wavePhase":
                return this.f56959k;
            default:
                if (str.startsWith(com.ironsource.mediationsdk.l.f37559f)) {
                    return Float.NaN;
                }
                Log.v("WARNING! KeyCycle", "  UNKNOWN  ".concat(str));
                return Float.NaN;
        }
    }

    @Override // g3.d
    public void load(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.r.f5549h);
        SparseIntArray sparseIntArray = g.f56953a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            SparseIntArray sparseIntArray2 = g.f56953a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    if (i0.f56980z0) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f56926b);
                        this.f56926b = resourceId;
                        if (resourceId == -1) {
                            this.f56927c = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f56927c = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.f56926b = typedArrayObtainStyledAttributes.getResourceId(index, this.f56926b);
                        break;
                    }
                case 2:
                    this.f56925a = typedArrayObtainStyledAttributes.getInt(index, this.f56925a);
                    break;
                case 3:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.f56954f = typedArrayObtainStyledAttributes.getInteger(index, this.f56954f);
                    break;
                case 5:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f56956h = typedArrayObtainStyledAttributes.getString(index);
                        this.f56955g = 7;
                        break;
                    } else {
                        this.f56955g = typedArrayObtainStyledAttributes.getInt(index, this.f56955g);
                        break;
                    }
                case 6:
                    this.f56957i = typedArrayObtainStyledAttributes.getFloat(index, this.f56957i);
                    break;
                case 7:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 5) {
                        this.f56958j = typedArrayObtainStyledAttributes.getDimension(index, this.f56958j);
                        break;
                    } else {
                        this.f56958j = typedArrayObtainStyledAttributes.getFloat(index, this.f56958j);
                        break;
                    }
                case 8:
                    this.f56961m = typedArrayObtainStyledAttributes.getInt(index, this.f56961m);
                    break;
                case 9:
                    this.f56962n = typedArrayObtainStyledAttributes.getFloat(index, this.f56962n);
                    break;
                case 10:
                    this.f56963o = typedArrayObtainStyledAttributes.getDimension(index, this.f56963o);
                    break;
                case 11:
                    this.f56964p = typedArrayObtainStyledAttributes.getFloat(index, this.f56964p);
                    break;
                case 12:
                    this.f56966r = typedArrayObtainStyledAttributes.getFloat(index, this.f56966r);
                    break;
                case 13:
                    this.f56967s = typedArrayObtainStyledAttributes.getFloat(index, this.f56967s);
                    break;
                case 14:
                    this.f56965q = typedArrayObtainStyledAttributes.getFloat(index, this.f56965q);
                    break;
                case 15:
                    this.f56968t = typedArrayObtainStyledAttributes.getFloat(index, this.f56968t);
                    break;
                case 16:
                    this.f56969u = typedArrayObtainStyledAttributes.getFloat(index, this.f56969u);
                    break;
                case 17:
                    this.f56970v = typedArrayObtainStyledAttributes.getDimension(index, this.f56970v);
                    break;
                case 18:
                    this.f56971w = typedArrayObtainStyledAttributes.getDimension(index, this.f56971w);
                    break;
                case 19:
                    this.f56972x = typedArrayObtainStyledAttributes.getDimension(index, this.f56972x);
                    break;
                case 20:
                    this.f56960l = typedArrayObtainStyledAttributes.getFloat(index, this.f56960l);
                    break;
                case 21:
                    this.f56959k = typedArrayObtainStyledAttributes.getFloat(index, this.f56959k) / 360.0f;
                    break;
                default:
                    Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
    }

    @Override // g3.d
    public void setValue(String str, Object obj) {
        str.getClass();
        switch (str) {
            case "motionProgress":
                this.f56960l = d.a(obj);
                break;
            case "transitionEasing":
                obj.toString();
                break;
            case "rotationX":
                this.f56966r = d.a(obj);
                break;
            case "rotationY":
                this.f56967s = d.a(obj);
                break;
            case "translationX":
                this.f56970v = d.a(obj);
                break;
            case "translationY":
                this.f56971w = d.a(obj);
                break;
            case "translationZ":
                this.f56972x = d.a(obj);
                break;
            case "scaleX":
                this.f56968t = d.a(obj);
                break;
            case "scaleY":
                this.f56969u = d.a(obj);
                break;
            case "rotation":
                this.f56964p = d.a(obj);
                break;
            case "elevation":
                this.f56963o = d.a(obj);
                break;
            case "transitionPathRotate":
                this.f56965q = d.a(obj);
                break;
            case "alpha":
                this.f56962n = d.a(obj);
                break;
            case "waveOffset":
                this.f56958j = d.a(obj);
                break;
            case "wavePeriod":
                this.f56957i = d.a(obj);
                break;
            case "curveFit":
                this.f56954f = d.b(obj);
                break;
            case "wavePhase":
                this.f56959k = d.a(obj);
                break;
            case "waveShape":
                if (!(obj instanceof Integer)) {
                    this.f56955g = 7;
                    this.f56956h = obj.toString();
                    break;
                } else {
                    this.f56955g = d.b(obj);
                    break;
                }
        }
    }

    @Override // g3.d
    /* renamed from: clone */
    public d mo4052clone() {
        return new h().copy(this);
    }
}
