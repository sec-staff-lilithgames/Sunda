package z2;

import a3.f0;
import a3.x;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class e extends a {

    /* renamed from: d, reason: collision with root package name */
    public float f97501d = Float.NaN;

    /* renamed from: e, reason: collision with root package name */
    public float f97502e = Float.NaN;

    /* renamed from: f, reason: collision with root package name */
    public float f97503f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public float f97504g = Float.NaN;

    /* renamed from: h, reason: collision with root package name */
    public float f97505h = Float.NaN;

    /* renamed from: i, reason: collision with root package name */
    public float f97506i = Float.NaN;

    /* renamed from: j, reason: collision with root package name */
    public float f97507j = Float.NaN;

    /* renamed from: k, reason: collision with root package name */
    public float f97508k = Float.NaN;

    /* renamed from: l, reason: collision with root package name */
    public float f97509l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    public float f97510m = Float.NaN;

    /* renamed from: n, reason: collision with root package name */
    public float f97511n = Float.NaN;

    /* renamed from: o, reason: collision with root package name */
    public float f97512o = Float.NaN;

    /* renamed from: p, reason: collision with root package name */
    public int f97513p = 0;

    /* renamed from: q, reason: collision with root package name */
    public float f97514q = Float.NaN;

    /* renamed from: r, reason: collision with root package name */
    public float f97515r = 0.0f;

    public e() {
        this.f97455b = 3;
        this.f97456c = new HashMap();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addTimeValues(java.util.HashMap<java.lang.String, a3.c0> r11) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.e.addTimeValues(java.util.HashMap):void");
    }

    @Override // z2.a
    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f97501d)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f97502e)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f97503f)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f97504g)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f97505h)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f97507j)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f97508k)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f97506i)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f97509l)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f97510m)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f97511n)) {
            hashSet.add("translationZ");
        }
        if (this.f97456c.size() > 0) {
            Iterator it = this.f97456c.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // z2.a, a3.i0
    public int getId(String str) {
        return f0.getId(str);
    }

    @Override // z2.a, a3.i0
    public boolean setValue(int i10, int i11) {
        if (i10 == 100) {
            this.f97454a = i11;
            return true;
        }
        if (i10 != 421) {
            return super.setValue(i10, i11);
        }
        this.f97513p = i11;
        return true;
    }

    @Override // z2.a
    public a clone() {
        return new e().copy((a) this);
    }

    @Override // z2.a
    public e copy(a aVar) {
        super.copy(aVar);
        e eVar = (e) aVar;
        eVar.getClass();
        this.f97513p = eVar.f97513p;
        this.f97514q = eVar.f97514q;
        this.f97515r = eVar.f97515r;
        this.f97512o = eVar.f97512o;
        this.f97501d = eVar.f97501d;
        this.f97502e = eVar.f97502e;
        this.f97503f = eVar.f97503f;
        this.f97506i = eVar.f97506i;
        this.f97504g = eVar.f97504g;
        this.f97505h = eVar.f97505h;
        this.f97507j = eVar.f97507j;
        this.f97508k = eVar.f97508k;
        this.f97509l = eVar.f97509l;
        this.f97510m = eVar.f97510m;
        this.f97511n = eVar.f97511n;
        return this;
    }

    @Override // z2.a, a3.i0
    public boolean setValue(int i10, float f10) throws NumberFormatException {
        if (i10 == 315) {
            this.f97512o = Float.valueOf(f10).floatValue();
            return true;
        }
        if (i10 == 401) {
            Integer.parseInt(Float.valueOf(f10).toString());
            return true;
        }
        if (i10 == 403) {
            this.f97501d = f10;
            return true;
        }
        if (i10 == 416) {
            this.f97506i = Float.valueOf(f10).floatValue();
            return true;
        }
        if (i10 == 423) {
            this.f97514q = Float.valueOf(f10).floatValue();
            return true;
        }
        if (i10 != 424) {
            switch (i10) {
                case AD_EXPIRED_VALUE:
                    this.f97509l = Float.valueOf(f10).floatValue();
                    return true;
                case MRAID_BRIDGE_ERROR_VALUE:
                    this.f97510m = Float.valueOf(f10).floatValue();
                    return true;
                case 306:
                    this.f97511n = Float.valueOf(f10).floatValue();
                    return true;
                case 307:
                    this.f97502e = Float.valueOf(f10).floatValue();
                    return true;
                case 308:
                    this.f97504g = Float.valueOf(f10).floatValue();
                    return true;
                case ASSET_FAILED_TO_DELETE_VALUE:
                    this.f97505h = Float.valueOf(f10).floatValue();
                    return true;
                case AD_HTML_FAILED_TO_LOAD_VALUE:
                    this.f97503f = Float.valueOf(f10).floatValue();
                    return true;
                case MRAID_JS_CALL_EMPTY_VALUE:
                    this.f97507j = Float.valueOf(f10).floatValue();
                    return true;
                case DEEPLINK_OPEN_FAILED_VALUE:
                    this.f97508k = Float.valueOf(f10).floatValue();
                    return true;
                default:
                    return super.setValue(i10, f10);
            }
        }
        this.f97515r = Float.valueOf(f10).floatValue();
        return true;
    }

    @Override // z2.a
    public void addValues(HashMap<String, x> map) {
    }

    @Override // z2.a, a3.i0
    public boolean setValue(int i10, String str) {
        if (i10 == 420) {
            return true;
        }
        if (i10 != 421) {
            return super.setValue(i10, str);
        }
        this.f97513p = 7;
        return true;
    }

    @Override // z2.a, a3.i0
    public boolean setValue(int i10, boolean z10) {
        return super.setValue(i10, z10);
    }
}
