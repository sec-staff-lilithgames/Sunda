package c3;

import a3.d0;
import b3.i;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import d3.g;
import io.bidmachine.protobuf.EventTypeExtended;
import j1.o2;
import java.util.HashMap;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class f {

    /* renamed from: s, reason: collision with root package name */
    public static float f11776s = Float.NaN;

    /* renamed from: a, reason: collision with root package name */
    public g f11777a;

    /* renamed from: b, reason: collision with root package name */
    public int f11778b;

    /* renamed from: c, reason: collision with root package name */
    public int f11779c;

    /* renamed from: d, reason: collision with root package name */
    public int f11780d;

    /* renamed from: e, reason: collision with root package name */
    public int f11781e;

    /* renamed from: f, reason: collision with root package name */
    public float f11782f;

    /* renamed from: g, reason: collision with root package name */
    public float f11783g;

    /* renamed from: h, reason: collision with root package name */
    public float f11784h;

    /* renamed from: i, reason: collision with root package name */
    public float f11785i;

    /* renamed from: j, reason: collision with root package name */
    public float f11786j;

    /* renamed from: k, reason: collision with root package name */
    public float f11787k;

    /* renamed from: l, reason: collision with root package name */
    public float f11788l;

    /* renamed from: m, reason: collision with root package name */
    public float f11789m;

    /* renamed from: n, reason: collision with root package name */
    public float f11790n;

    /* renamed from: o, reason: collision with root package name */
    public float f11791o;

    /* renamed from: p, reason: collision with root package name */
    public float f11792p;

    /* renamed from: q, reason: collision with root package name */
    public float f11793q;

    /* renamed from: r, reason: collision with root package name */
    public final HashMap f11794r;

    public f() {
        this.f11777a = null;
        this.f11778b = 0;
        this.f11779c = 0;
        this.f11780d = 0;
        this.f11781e = 0;
        this.f11782f = Float.NaN;
        this.f11783g = Float.NaN;
        this.f11784h = Float.NaN;
        this.f11785i = Float.NaN;
        this.f11786j = Float.NaN;
        this.f11787k = Float.NaN;
        this.f11788l = Float.NaN;
        this.f11789m = Float.NaN;
        this.f11790n = Float.NaN;
        this.f11791o = Float.NaN;
        this.f11792p = Float.NaN;
        this.f11793q = Float.NaN;
        this.f11794r = new HashMap();
    }

    public static void a(int i10, String str, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(": ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    public static void b(StringBuilder sb2, String str, float f10) {
        if (Float.isNaN(f10)) {
            return;
        }
        sb2.append(str);
        sb2.append(": ");
        sb2.append(f10);
        sb2.append(",\n");
    }

    public static float c(float f10, float f11, float f12, float f13) {
        boolean zIsNaN = Float.isNaN(f10);
        boolean zIsNaN2 = Float.isNaN(f11);
        if (zIsNaN && zIsNaN2) {
            return Float.NaN;
        }
        if (zIsNaN) {
            f10 = f12;
        }
        if (zIsNaN2) {
            f11 = f12;
        }
        return o2.a(f11, f10, f13, f10);
    }

    public static void interpolate(int i10, int i11, f fVar, f fVar2, f fVar3, e eVar, float f10) {
        HashMap map;
        float f11;
        int i12;
        int i13;
        HashMap map2;
        int i14;
        int i15;
        int i16;
        float f12 = 100.0f * f10;
        int i17 = (int) f12;
        int i18 = fVar2.f11778b;
        HashMap map3 = fVar2.f11794r;
        int i19 = fVar2.f11779c;
        int i20 = fVar3.f11778b;
        HashMap map4 = fVar3.f11794r;
        int i21 = fVar3.f11779c;
        int i22 = fVar2.f11780d - i18;
        int i23 = fVar2.f11781e - i19;
        int i24 = i18;
        int i25 = fVar3.f11780d - i20;
        int i26 = i19;
        int i27 = fVar3.f11781e - i21;
        float f13 = fVar2.f11792p;
        float f14 = fVar3.f11792p;
        float f15 = (!Float.isNaN(f13) || Float.isNaN(f14)) ? f13 : 1.0f;
        float f16 = (Float.isNaN(f15) || !Float.isNaN(f14)) ? f14 : 1.0f;
        g gVar = fVar.f11777a;
        HashMap map5 = fVar.f11794r;
        if (gVar == null || !eVar.hasPositionKeyframes()) {
            map = map5;
            f11 = f10;
            i12 = i20;
            i13 = i21;
        } else {
            d dVarFindPreviousPosition = eVar.findPreviousPosition(fVar.f11777a.f51793l, i17);
            map = map5;
            d dVarFindNextPosition = eVar.findNextPosition(fVar.f11777a.f51793l, i17);
            if (dVarFindPreviousPosition == dVarFindNextPosition) {
                dVarFindNextPosition = null;
            }
            if (dVarFindPreviousPosition != null) {
                i24 = (int) (dVarFindPreviousPosition.f11751b * i10);
                int i28 = (int) (dVarFindPreviousPosition.f11752c * i11);
                i14 = dVarFindPreviousPosition.f11750a;
                i26 = i28;
            } else {
                i14 = 0;
            }
            if (dVarFindNextPosition != null) {
                i16 = (int) (dVarFindNextPosition.f11751b * i10);
                i13 = (int) (dVarFindNextPosition.f11752c * i11);
                i15 = dVarFindNextPosition.f11750a;
            } else {
                i15 = 100;
                i16 = i20;
                i13 = i21;
            }
            f11 = (f12 - i14) / (i15 - i14);
            i12 = i16;
        }
        int i29 = i24;
        int i30 = i26;
        fVar.f11777a = fVar2.f11777a;
        int i31 = (int) (((i12 - i29) * f11) + i29);
        fVar.f11778b = i31;
        int i32 = (int) ((f11 * (i13 - i30)) + i30);
        fVar.f11779c = i32;
        float f17 = 1.0f - f10;
        fVar.f11780d = i31 + ((int) ((i25 * f10) + (i22 * f17)));
        fVar.f11781e = i32 + ((int) ((i27 * f10) + (f17 * i23)));
        fVar.f11782f = c(fVar2.f11782f, fVar3.f11782f, 0.5f, f10);
        fVar.f11783g = c(fVar2.f11783g, fVar3.f11783g, 0.5f, f10);
        fVar.f11784h = c(fVar2.f11784h, fVar3.f11784h, 0.0f, f10);
        fVar.f11785i = c(fVar2.f11785i, fVar3.f11785i, 0.0f, f10);
        fVar.f11786j = c(fVar2.f11786j, fVar3.f11786j, 0.0f, f10);
        fVar.f11790n = c(fVar2.f11790n, fVar3.f11790n, 1.0f, f10);
        fVar.f11791o = c(fVar2.f11791o, fVar3.f11791o, 1.0f, f10);
        fVar.f11787k = c(fVar2.f11787k, fVar3.f11787k, 0.0f, f10);
        fVar.f11788l = c(fVar2.f11788l, fVar3.f11788l, 0.0f, f10);
        fVar.f11789m = c(fVar2.f11789m, fVar3.f11789m, 0.0f, f10);
        fVar.f11792p = c(f15, f16, 1.0f, f10);
        Set<String> setKeySet = map4.keySet();
        map.clear();
        for (String str : setKeySet) {
            if (map3.containsKey(str)) {
                y2.c cVar = (y2.c) map3.get(str);
                y2.c cVar2 = (y2.c) map4.get(str);
                y2.c cVar3 = new y2.c(cVar);
                map2 = map;
                map2.put(str, cVar3);
                if (cVar.numberOfInterpolatedValues() == 1) {
                    cVar3.setValue(Float.valueOf(c(cVar.getValueToInterpolate(), cVar2.getValueToInterpolate(), 0.0f, f10)));
                } else {
                    int iNumberOfInterpolatedValues = cVar.numberOfInterpolatedValues();
                    float[] fArr = new float[iNumberOfInterpolatedValues];
                    float[] fArr2 = new float[iNumberOfInterpolatedValues];
                    cVar.getValuesToInterpolate(fArr);
                    cVar2.getValuesToInterpolate(fArr2);
                    for (int i33 = 0; i33 < iNumberOfInterpolatedValues; i33++) {
                        fArr[i33] = c(fArr[i33], fArr2[i33], 0.0f, f10);
                        cVar3.setValue(fArr);
                    }
                }
            } else {
                map2 = map;
            }
            map = map2;
        }
    }

    public void addCustomColor(String str, int i10) {
        setCustomAttribute(str, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_LOADED_VALUE, i10);
    }

    public void addCustomFloat(String str, float f10) {
        setCustomAttribute(str, EventTypeExtended.EVENT_TYPE_EXTENDED_WATERFALL_STARTED_VALUE, f10);
    }

    public float centerX() {
        return ((this.f11780d - r0) / 2.0f) + this.f11778b;
    }

    public float centerY() {
        return ((this.f11781e - r0) / 2.0f) + this.f11779c;
    }

    public boolean containsCustom(String str) {
        return this.f11794r.containsKey(str);
    }

    public y2.c getCustomAttribute(String str) {
        return (y2.c) this.f11794r.get(str);
    }

    public Set<String> getCustomAttributeNames() {
        return this.f11794r.keySet();
    }

    public int getCustomColor(String str) {
        HashMap map = this.f11794r;
        if (map.containsKey(str)) {
            return ((y2.c) map.get(str)).getColorValue();
        }
        return -21880;
    }

    public float getCustomFloat(String str) {
        HashMap map = this.f11794r;
        if (map.containsKey(str)) {
            return ((y2.c) map.get(str)).getFloatValue();
        }
        return Float.NaN;
    }

    public String getId() {
        g gVar = this.f11777a;
        return gVar == null ? "unknown" : gVar.f51793l;
    }

    public d0 getMotionProperties() {
        return null;
    }

    public int height() {
        return Math.max(0, this.f11781e - this.f11779c);
    }

    public boolean isDefaultTransform() {
        return Float.isNaN(this.f11784h) && Float.isNaN(this.f11785i) && Float.isNaN(this.f11786j) && Float.isNaN(this.f11787k) && Float.isNaN(this.f11788l) && Float.isNaN(this.f11789m) && Float.isNaN(this.f11790n) && Float.isNaN(this.f11791o) && Float.isNaN(this.f11792p);
    }

    public StringBuilder serialize(StringBuilder sb2) {
        return serialize(sb2, false);
    }

    public void setCustomAttribute(String str, int i10, float f10) {
        HashMap map = this.f11794r;
        if (map.containsKey(str)) {
            ((y2.c) map.get(str)).setFloatValue(f10);
        } else {
            map.put(str, new y2.c(str, i10, f10));
        }
    }

    public boolean setValue(String str, b3.c cVar) throws i {
        int i10;
        str.getClass();
        switch (str) {
            case "phone_orientation":
                f11776s = cVar.getFloat();
                return true;
            case "bottom":
                this.f11781e = cVar.getInt();
                return true;
            case "custom":
                b3.g gVar = (b3.g) cVar;
                int size = gVar.size();
                for (i10 = 0; i10 < size; i10++) {
                    b3.c value = ((b3.d) gVar.get(i10)).getValue();
                    String strContent = value.content();
                    if (strContent.matches("#[0-9a-fA-F]+")) {
                        setCustomAttribute((String) null, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_LOADED_VALUE, Integer.parseInt(strContent.substring(1), 16));
                    } else if (value instanceof b3.e) {
                        setCustomAttribute((String) null, EventTypeExtended.EVENT_TYPE_EXTENDED_WATERFALL_STARTED_VALUE, value.getFloat());
                    } else {
                        setCustomAttribute((String) null, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_FINISHED_VALUE, strContent);
                    }
                }
                return true;
            case "rotationX":
                this.f11784h = cVar.getFloat();
                return true;
            case "rotationY":
                this.f11785i = cVar.getFloat();
                return true;
            case "rotationZ":
                this.f11786j = cVar.getFloat();
                return true;
            case "translationX":
                this.f11787k = cVar.getFloat();
                return true;
            case "translationY":
                this.f11788l = cVar.getFloat();
                return true;
            case "translationZ":
                this.f11789m = cVar.getFloat();
                return true;
            case "pivotX":
                this.f11782f = cVar.getFloat();
                return true;
            case "pivotY":
                this.f11783g = cVar.getFloat();
                return true;
            case "scaleX":
                this.f11790n = cVar.getFloat();
                return true;
            case "scaleY":
                this.f11791o = cVar.getFloat();
                return true;
            case "top":
                this.f11779c = cVar.getInt();
                return true;
            case "left":
                this.f11778b = cVar.getInt();
                return true;
            case "alpha":
                this.f11792p = cVar.getFloat();
                return true;
            case "right":
                this.f11780d = cVar.getInt();
                return true;
            case "interpolatedPos":
                this.f11793q = cVar.getFloat();
                return true;
            default:
                return false;
        }
    }

    public f update() {
        g gVar = this.f11777a;
        if (gVar != null) {
            this.f11778b = gVar.getLeft();
            this.f11779c = this.f11777a.getTop();
            this.f11780d = this.f11777a.getRight();
            this.f11781e = this.f11777a.getBottom();
            updateAttributes(this.f11777a.f51791k);
        }
        return this;
    }

    public void updateAttributes(f fVar) {
        if (fVar == null) {
            return;
        }
        this.f11782f = fVar.f11782f;
        this.f11783g = fVar.f11783g;
        this.f11784h = fVar.f11784h;
        this.f11785i = fVar.f11785i;
        this.f11786j = fVar.f11786j;
        this.f11787k = fVar.f11787k;
        this.f11788l = fVar.f11788l;
        this.f11789m = fVar.f11789m;
        this.f11790n = fVar.f11790n;
        this.f11791o = fVar.f11791o;
        this.f11792p = fVar.f11792p;
        HashMap map = this.f11794r;
        map.clear();
        for (y2.c cVar : fVar.f11794r.values()) {
            map.put(cVar.getName(), cVar.copy());
        }
    }

    public int width() {
        return Math.max(0, this.f11780d - this.f11778b);
    }

    public StringBuilder serialize(StringBuilder sb2, boolean z10) {
        sb2.append("{\n");
        a(this.f11778b, TtmlNode.LEFT, sb2);
        a(this.f11779c, "top", sb2);
        a(this.f11780d, TtmlNode.RIGHT, sb2);
        a(this.f11781e, "bottom", sb2);
        b(sb2, "pivotX", this.f11782f);
        b(sb2, "pivotY", this.f11783g);
        b(sb2, "rotationX", this.f11784h);
        b(sb2, "rotationY", this.f11785i);
        b(sb2, "rotationZ", this.f11786j);
        b(sb2, "translationX", this.f11787k);
        b(sb2, "translationY", this.f11788l);
        b(sb2, "translationZ", this.f11789m);
        b(sb2, "scaleX", this.f11790n);
        b(sb2, "scaleY", this.f11791o);
        b(sb2, "alpha", this.f11792p);
        a(0, "visibility", sb2);
        b(sb2, "interpolatedPos", this.f11793q);
        if (this.f11777a != null) {
            for (d3.d dVar : d3.d.values()) {
                d3.e anchor = this.f11777a.getAnchor(dVar);
                if (anchor != null && anchor.f51762f != null) {
                    sb2.append("Anchor");
                    sb2.append(dVar.name());
                    sb2.append(": ['");
                    String str = anchor.f51762f.getOwner().f51793l;
                    if (str == null) {
                        str = "#PARENT";
                    }
                    sb2.append(str);
                    sb2.append("', '");
                    sb2.append(anchor.f51762f.getType().name());
                    sb2.append("', '");
                    sb2.append(anchor.f51763g);
                    sb2.append("'],\n");
                }
            }
        }
        if (z10) {
            b(sb2, "phone_orientation", f11776s);
        }
        if (z10) {
            b(sb2, "phone_orientation", f11776s);
        }
        HashMap map = this.f11794r;
        if (map.size() != 0) {
            sb2.append("custom : {\n");
            for (String str2 : map.keySet()) {
                y2.c cVar = (y2.c) map.get(str2);
                sb2.append(str2);
                sb2.append(": ");
                switch (cVar.getType()) {
                    case 900:
                        sb2.append(cVar.getIntegerValue());
                        sb2.append(",\n");
                        break;
                    case EVENT_TYPE_EXTENDED_WATERFALL_STARTED_VALUE:
                    case EVENT_TYPE_EXTENDED_AD_UNIT_EXPIRED_VALUE:
                        sb2.append(cVar.getFloatValue());
                        sb2.append(",\n");
                        break;
                    case EVENT_TYPE_EXTENDED_AD_UNIT_LOADED_VALUE:
                        sb2.append("'");
                        sb2.append(y2.c.colorString(cVar.getIntegerValue()));
                        sb2.append("',\n");
                        break;
                    case EVENT_TYPE_EXTENDED_AD_UNIT_FINISHED_VALUE:
                        sb2.append("'");
                        sb2.append(cVar.getStringValue());
                        sb2.append("',\n");
                        break;
                    case EVENT_TYPE_EXTENDED_WATERFALL_FINISHED_VALUE:
                        sb2.append("'");
                        sb2.append(cVar.getBooleanValue());
                        sb2.append("',\n");
                        break;
                }
            }
            sb2.append("}\n");
        }
        sb2.append("}\n");
        return sb2;
    }

    public void setCustomAttribute(String str, int i10, int i11) {
        HashMap map = this.f11794r;
        if (map.containsKey(str)) {
            ((y2.c) map.get(str)).setIntValue(i11);
        } else {
            map.put(str, new y2.c(str, i10, i11));
        }
    }

    public void setCustomAttribute(String str, int i10, boolean z10) {
        HashMap map = this.f11794r;
        if (map.containsKey(str)) {
            ((y2.c) map.get(str)).setBooleanValue(z10);
        } else {
            map.put(str, new y2.c(str, i10, z10));
        }
    }

    public f update(g gVar) {
        if (gVar == null) {
            return this;
        }
        this.f11777a = gVar;
        update();
        return this;
    }

    public void setCustomAttribute(String str, int i10, String str2) {
        HashMap map = this.f11794r;
        if (map.containsKey(str)) {
            ((y2.c) map.get(str)).setStringValue(str2);
        } else {
            map.put(str, new y2.c(str, i10, str2));
        }
    }

    public f(g gVar) {
        this.f11777a = null;
        this.f11778b = 0;
        this.f11779c = 0;
        this.f11780d = 0;
        this.f11781e = 0;
        this.f11782f = Float.NaN;
        this.f11783g = Float.NaN;
        this.f11784h = Float.NaN;
        this.f11785i = Float.NaN;
        this.f11786j = Float.NaN;
        this.f11787k = Float.NaN;
        this.f11788l = Float.NaN;
        this.f11789m = Float.NaN;
        this.f11790n = Float.NaN;
        this.f11791o = Float.NaN;
        this.f11792p = Float.NaN;
        this.f11793q = Float.NaN;
        this.f11794r = new HashMap();
        this.f11777a = gVar;
    }

    public f(f fVar) {
        this.f11777a = null;
        this.f11778b = 0;
        this.f11779c = 0;
        this.f11780d = 0;
        this.f11781e = 0;
        this.f11782f = Float.NaN;
        this.f11783g = Float.NaN;
        this.f11784h = Float.NaN;
        this.f11785i = Float.NaN;
        this.f11786j = Float.NaN;
        this.f11787k = Float.NaN;
        this.f11788l = Float.NaN;
        this.f11789m = Float.NaN;
        this.f11790n = Float.NaN;
        this.f11791o = Float.NaN;
        this.f11792p = Float.NaN;
        this.f11793q = Float.NaN;
        this.f11794r = new HashMap();
        this.f11777a = fVar.f11777a;
        this.f11778b = fVar.f11778b;
        this.f11779c = fVar.f11779c;
        this.f11780d = fVar.f11780d;
        this.f11781e = fVar.f11781e;
        updateAttributes(fVar);
    }

    public void setCustomValue(y2.b bVar, float[] fArr) {
    }
}
