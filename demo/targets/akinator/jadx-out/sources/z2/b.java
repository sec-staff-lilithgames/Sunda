package z2;

import a3.e0;
import androidx.core.app.NotificationCompat;
import com.moloco.sdk.BKC.KerkSviMAy;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public int f97457d = -1;

    /* renamed from: e, reason: collision with root package name */
    public float f97458e = Float.NaN;

    /* renamed from: f, reason: collision with root package name */
    public float f97459f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public float f97460g = Float.NaN;

    /* renamed from: h, reason: collision with root package name */
    public float f97461h = Float.NaN;

    /* renamed from: i, reason: collision with root package name */
    public float f97462i = Float.NaN;

    /* renamed from: j, reason: collision with root package name */
    public float f97463j = Float.NaN;

    /* renamed from: k, reason: collision with root package name */
    public float f97464k = Float.NaN;

    /* renamed from: l, reason: collision with root package name */
    public float f97465l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    public float f97466m = Float.NaN;

    /* renamed from: n, reason: collision with root package name */
    public float f97467n = Float.NaN;

    /* renamed from: o, reason: collision with root package name */
    public float f97468o = Float.NaN;

    /* renamed from: p, reason: collision with root package name */
    public float f97469p = Float.NaN;

    /* renamed from: q, reason: collision with root package name */
    public float f97470q = Float.NaN;

    /* renamed from: r, reason: collision with root package name */
    public float f97471r = Float.NaN;

    public b() {
        this.f97455b = 1;
        this.f97456c = new HashMap();
    }

    public int getCurveFit() {
        return this.f97457d;
    }

    @Override // z2.a, a3.i0
    public int getId(String str) {
        return e0.getId(str);
    }

    public void printAttributes() {
        float f10;
        HashSet<String> hashSet = new HashSet<>();
        getAttributeNames(hashSet);
        System.out.println(" ------------- " + this.f97454a + " -------------");
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            int id2 = e0.getId(strArr[i10]);
            PrintStream printStream = System.out;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr[i10]);
            sb2.append(":");
            if (id2 != 100) {
                switch (id2) {
                    case 303:
                        f10 = this.f97458e;
                        break;
                    case AD_EXPIRED_VALUE:
                        f10 = this.f97468o;
                        break;
                    case MRAID_BRIDGE_ERROR_VALUE:
                        f10 = this.f97469p;
                        break;
                    case 306:
                        f10 = this.f97470q;
                        break;
                    case 307:
                        f10 = this.f97459f;
                        break;
                    case 308:
                        f10 = this.f97461h;
                        break;
                    case ASSET_FAILED_TO_DELETE_VALUE:
                        f10 = this.f97462i;
                        break;
                    case AD_HTML_FAILED_TO_LOAD_VALUE:
                        f10 = this.f97460g;
                        break;
                    case MRAID_JS_CALL_EMPTY_VALUE:
                        f10 = this.f97466m;
                        break;
                    case DEEPLINK_OPEN_FAILED_VALUE:
                        f10 = this.f97467n;
                        break;
                    case EVALUATE_JAVASCRIPT_FAILED_VALUE:
                        f10 = this.f97463j;
                        break;
                    case LINK_COMMAND_OPEN_FAILED_VALUE:
                        f10 = this.f97464k;
                        break;
                    case JSON_PARAMS_ENCODE_ERROR_VALUE:
                        f10 = this.f97471r;
                        break;
                    case GENERATE_JSON_DATA_ERROR_VALUE:
                        f10 = this.f97465l;
                        break;
                    default:
                        f10 = Float.NaN;
                        break;
                }
            } else {
                f10 = this.f97454a;
            }
            sb2.append(f10);
            printStream.println(sb2.toString());
        }
    }

    @Override // z2.a
    public void setInterpolation(HashMap<String, Integer> map) {
        if (!Float.isNaN(this.f97458e)) {
            map.put("alpha", Integer.valueOf(this.f97457d));
        }
        if (!Float.isNaN(this.f97459f)) {
            map.put("elevation", Integer.valueOf(this.f97457d));
        }
        if (!Float.isNaN(this.f97460g)) {
            map.put("rotationZ", Integer.valueOf(this.f97457d));
        }
        if (!Float.isNaN(this.f97461h)) {
            map.put("rotationX", Integer.valueOf(this.f97457d));
        }
        if (!Float.isNaN(this.f97462i)) {
            map.put("rotationY", Integer.valueOf(this.f97457d));
        }
        if (!Float.isNaN(this.f97463j)) {
            map.put("pivotX", Integer.valueOf(this.f97457d));
        }
        if (!Float.isNaN(this.f97464k)) {
            map.put("pivotY", Integer.valueOf(this.f97457d));
        }
        if (!Float.isNaN(this.f97468o)) {
            map.put("translationX", Integer.valueOf(this.f97457d));
        }
        if (!Float.isNaN(this.f97469p)) {
            map.put("translationY", Integer.valueOf(this.f97457d));
        }
        if (!Float.isNaN(this.f97470q)) {
            map.put("translationZ", Integer.valueOf(this.f97457d));
        }
        if (!Float.isNaN(this.f97465l)) {
            map.put("pathRotate", Integer.valueOf(this.f97457d));
        }
        if (!Float.isNaN(this.f97466m)) {
            map.put("scaleX", Integer.valueOf(this.f97457d));
        }
        if (!Float.isNaN(this.f97467n)) {
            map.put("scaleY", Integer.valueOf(this.f97457d));
        }
        if (!Float.isNaN(this.f97471r)) {
            map.put(NotificationCompat.CATEGORY_PROGRESS, Integer.valueOf(this.f97457d));
        }
        if (this.f97456c.size() > 0) {
            Iterator it = this.f97456c.keySet().iterator();
            while (it.hasNext()) {
                map.put(a.b.k("CUSTOM,", (String) it.next()), Integer.valueOf(this.f97457d));
            }
        }
    }

    @Override // z2.a, a3.i0
    public boolean setValue(int i10, int i11) {
        if (i10 == 100) {
            this.f97454a = i11;
            return true;
        }
        if (i10 == 301) {
            this.f97457d = i11;
            return true;
        }
        if (i10 == 302 || setValue(i10, i11)) {
            return true;
        }
        return super.setValue(i10, i11);
    }

    @Override // z2.a
    public a clone() {
        return null;
    }

    @Override // z2.a
    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f97458e)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f97459f)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f97460g)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f97461h)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f97462i)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f97463j)) {
            hashSet.add("pivotX");
        }
        if (!Float.isNaN(this.f97464k)) {
            hashSet.add("pivotY");
        }
        if (!Float.isNaN(this.f97468o)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f97469p)) {
            hashSet.add(KerkSviMAy.jWMuvPZKYnhusVR);
        }
        if (!Float.isNaN(this.f97470q)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f97465l)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f97466m)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f97467n)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f97471r)) {
            hashSet.add(NotificationCompat.CATEGORY_PROGRESS);
        }
        if (this.f97456c.size() > 0) {
            Iterator it = this.f97456c.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    @Override // z2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addValues(java.util.HashMap<java.lang.String, a3.x> r7) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.b.addValues(java.util.HashMap):void");
    }

    @Override // z2.a, a3.i0
    public boolean setValue(int i10, float f10) {
        if (i10 != 100) {
            switch (i10) {
                case 303:
                    this.f97458e = f10;
                    return true;
                case AD_EXPIRED_VALUE:
                    this.f97468o = f10;
                    return true;
                case MRAID_BRIDGE_ERROR_VALUE:
                    this.f97469p = f10;
                    return true;
                case 306:
                    this.f97470q = f10;
                    return true;
                case 307:
                    this.f97459f = f10;
                    return true;
                case 308:
                    this.f97461h = f10;
                    return true;
                case ASSET_FAILED_TO_DELETE_VALUE:
                    this.f97462i = f10;
                    return true;
                case AD_HTML_FAILED_TO_LOAD_VALUE:
                    this.f97460g = f10;
                    return true;
                case MRAID_JS_CALL_EMPTY_VALUE:
                    this.f97466m = f10;
                    return true;
                case DEEPLINK_OPEN_FAILED_VALUE:
                    this.f97467n = f10;
                    return true;
                case EVALUATE_JAVASCRIPT_FAILED_VALUE:
                    this.f97463j = f10;
                    return true;
                case LINK_COMMAND_OPEN_FAILED_VALUE:
                    this.f97464k = f10;
                    return true;
                case JSON_PARAMS_ENCODE_ERROR_VALUE:
                    this.f97471r = f10;
                    return true;
                case GENERATE_JSON_DATA_ERROR_VALUE:
                    this.f97465l = f10;
                    return true;
                default:
                    return super.setValue(i10, f10);
            }
        }
        this.f97465l = f10;
        return true;
    }

    @Override // z2.a, a3.i0
    public boolean setValue(int i10, String str) {
        if (i10 == 101 || i10 == 317) {
            return true;
        }
        return super.setValue(i10, str);
    }
}
