package z2;

import a3.k0;
import a3.m;
import a3.x;
import com.ironsource.mediationsdk.l;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class c extends a {

    /* renamed from: d, reason: collision with root package name */
    public int f97472d = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f97473e = null;

    /* renamed from: f, reason: collision with root package name */
    public float f97474f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public float f97475g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f97476h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f97477i = Float.NaN;

    /* renamed from: j, reason: collision with root package name */
    public float f97478j = Float.NaN;

    /* renamed from: k, reason: collision with root package name */
    public float f97479k = Float.NaN;

    /* renamed from: l, reason: collision with root package name */
    public float f97480l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    public float f97481m = Float.NaN;

    /* renamed from: n, reason: collision with root package name */
    public float f97482n = Float.NaN;

    /* renamed from: o, reason: collision with root package name */
    public float f97483o = Float.NaN;

    /* renamed from: p, reason: collision with root package name */
    public float f97484p = Float.NaN;

    /* renamed from: q, reason: collision with root package name */
    public float f97485q = Float.NaN;

    /* renamed from: r, reason: collision with root package name */
    public float f97486r = Float.NaN;

    /* renamed from: s, reason: collision with root package name */
    public float f97487s = Float.NaN;

    /* renamed from: t, reason: collision with root package name */
    public float f97488t = Float.NaN;

    public c() {
        this.f97455b = 4;
        this.f97456c = new HashMap();
    }

    public void addCycleValues(HashMap<String, m> map) {
        m mVar;
        m mVar2;
        for (String str : map.keySet()) {
            if (str.startsWith(l.f37559f)) {
                y2.c cVar = (y2.c) this.f97456c.get(str.substring(7));
                if (cVar != null && cVar.getType() == 901 && (mVar = map.get(str)) != null) {
                    mVar.setPoint(this.f97454a, this.f97472d, this.f97473e, -1, this.f97474f, this.f97475g, this.f97476h / 360.0f, cVar.getValueToInterpolate(), cVar);
                }
            } else {
                float value = getValue(str);
                if (!Float.isNaN(value) && (mVar2 = map.get(str)) != null) {
                    mVar2.setPoint(this.f97454a, this.f97472d, this.f97473e, -1, this.f97474f, this.f97475g, this.f97476h / 360.0f, value);
                }
            }
        }
    }

    public void dump() {
        System.out.println("MotionKeyCycle{mWaveShape=" + this.f97472d + ", mWavePeriod=" + this.f97474f + ", mWaveOffset=" + this.f97475g + ", mWavePhase=" + this.f97476h + ", mRotation=" + this.f97480l + AbstractJsonLexerKt.END_OBJ);
    }

    @Override // z2.a
    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f97478j)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f97479k)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f97480l)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f97482n)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f97483o)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f97484p)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f97485q)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f97481m)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f97486r)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f97487s)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f97488t)) {
            hashSet.add("translationZ");
        }
        if (this.f97456c.size() > 0) {
            Iterator it = this.f97456c.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000b  */
    @Override // z2.a, a3.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getId(java.lang.String r3) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.c.getId(java.lang.String):int");
    }

    public float getValue(String str) {
        str.getClass();
        switch (str) {
            case "rotationX":
                return this.f97482n;
            case "rotationY":
                return this.f97483o;
            case "rotationZ":
                return this.f97480l;
            case "translationX":
                return this.f97486r;
            case "translationY":
                return this.f97487s;
            case "translationZ":
                return this.f97488t;
            case "offset":
                return this.f97475g;
            case "progress":
                return this.f97477i;
            case "scaleX":
                return this.f97484p;
            case "scaleY":
                return this.f97485q;
            case "elevation":
                return this.f97479k;
            case "alpha":
                return this.f97478j;
            case "phase":
                return this.f97476h;
            case "pathRotate":
                return this.f97481m;
            default:
                return Float.NaN;
        }
    }

    public void printAttributes() {
        HashSet<String> hashSet = new HashSet<>();
        getAttributeNames(hashSet);
        k0.log(" ------------- " + this.f97454a + " -------------");
        k0.log("MotionKeyCycle{Shape=" + this.f97472d + ", Period=" + this.f97474f + ", Offset=" + this.f97475g + ", Phase=" + this.f97476h + AbstractJsonLexerKt.END_OBJ);
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            k0.log(strArr[i10] + ":" + getValue(strArr[i10]));
        }
    }

    @Override // z2.a, a3.i0
    public boolean setValue(int i10, int i11) {
        if (i10 != 401) {
            if (i10 != 421) {
                if (setValue(i10, i11)) {
                    return true;
                }
                return super.setValue(i10, i11);
            }
            this.f97472d = i11;
        }
        return true;
    }

    @Override // z2.a
    public a clone() {
        return null;
    }

    @Override // z2.a, a3.i0
    public boolean setValue(int i10, String str) {
        if (i10 != 420) {
            if (i10 != 422) {
                return super.setValue(i10, str);
            }
            this.f97473e = str;
        }
        return true;
    }

    @Override // z2.a, a3.i0
    public boolean setValue(int i10, float f10) {
        if (i10 == 315) {
            this.f97477i = f10;
            return true;
        }
        if (i10 == 403) {
            this.f97478j = f10;
            return true;
        }
        if (i10 != 416) {
            switch (i10) {
                case AD_EXPIRED_VALUE:
                    this.f97486r = f10;
                    return true;
                case MRAID_BRIDGE_ERROR_VALUE:
                    this.f97487s = f10;
                    return true;
                case 306:
                    this.f97488t = f10;
                    return true;
                case 307:
                    this.f97479k = f10;
                    return true;
                case 308:
                    this.f97482n = f10;
                    return true;
                case ASSET_FAILED_TO_DELETE_VALUE:
                    this.f97483o = f10;
                    return true;
                case AD_HTML_FAILED_TO_LOAD_VALUE:
                    this.f97480l = f10;
                    return true;
                case MRAID_JS_CALL_EMPTY_VALUE:
                    this.f97484p = f10;
                    return true;
                case DEEPLINK_OPEN_FAILED_VALUE:
                    this.f97485q = f10;
                    return true;
                default:
                    switch (i10) {
                        case 423:
                            this.f97474f = f10;
                            return true;
                        case 424:
                            this.f97475g = f10;
                            return true;
                        case 425:
                            this.f97476h = f10;
                            return true;
                        default:
                            return super.setValue(i10, f10);
                    }
            }
        }
        this.f97481m = f10;
        return true;
    }

    @Override // z2.a
    public void addValues(HashMap<String, x> map) {
    }
}
