package io.odeeo.internal.j;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.g.g;
import io.odeeo.internal.q0.x;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c extends d {

    /* renamed from: b, reason: collision with root package name */
    public long f64361b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f64362c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f64363d;

    public c() {
        super(new g());
        this.f64361b = C.TIME_UNSET;
        this.f64362c = new long[0];
        this.f64363d = new long[0];
    }

    public static Boolean b(x xVar) {
        return Boolean.valueOf(xVar.readUnsignedByte() == 1);
    }

    public static Date c(x xVar) {
        Date date = new Date((long) d(xVar).doubleValue());
        xVar.skipBytes(2);
        return date;
    }

    public static Double d(x xVar) {
        return Double.valueOf(Double.longBitsToDouble(xVar.readLong()));
    }

    public static HashMap<String, Object> e(x xVar) {
        int unsignedIntToInt = xVar.readUnsignedIntToInt();
        HashMap<String, Object> map = new HashMap<>(unsignedIntToInt);
        for (int i10 = 0; i10 < unsignedIntToInt; i10++) {
            String strH = h(xVar);
            Object objA = a(xVar, i(xVar));
            if (objA != null) {
                map.put(strH, objA);
            }
        }
        return map;
    }

    public static HashMap<String, Object> f(x xVar) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String strH = h(xVar);
            int i10 = i(xVar);
            if (i10 == 9) {
                return map;
            }
            Object objA = a(xVar, i10);
            if (objA != null) {
                map.put(strH, objA);
            }
        }
    }

    public static ArrayList<Object> g(x xVar) {
        int unsignedIntToInt = xVar.readUnsignedIntToInt();
        ArrayList<Object> arrayList = new ArrayList<>(unsignedIntToInt);
        for (int i10 = 0; i10 < unsignedIntToInt; i10++) {
            Object objA = a(xVar, i(xVar));
            if (objA != null) {
                arrayList.add(objA);
            }
        }
        return arrayList;
    }

    public static String h(x xVar) {
        int unsignedShort = xVar.readUnsignedShort();
        int position = xVar.getPosition();
        xVar.skipBytes(unsignedShort);
        return new String(xVar.getData(), position, unsignedShort);
    }

    public static int i(x xVar) {
        return xVar.readUnsignedByte();
    }

    @Override // io.odeeo.internal.j.d
    public boolean a(x xVar) {
        return true;
    }

    public long getDurationUs() {
        return this.f64361b;
    }

    public long[] getKeyFrameTagPositions() {
        return this.f64363d;
    }

    public long[] getKeyFrameTimesUs() {
        return this.f64362c;
    }

    @Override // io.odeeo.internal.j.d
    public boolean a(x xVar, long j10) {
        if (i(xVar) != 2 || !"onMetaData".equals(h(xVar)) || i(xVar) != 8) {
            return false;
        }
        HashMap<String, Object> mapE = e(xVar);
        Object obj = mapE.get(IronSourceConstants.EVENTS_DURATION);
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f64361b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapE.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f64362c = new long[size];
                this.f64363d = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f64362c = new long[0];
                        this.f64363d = new long[0];
                        break;
                    }
                    this.f64362c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f64363d[i10] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    @Override // io.odeeo.internal.j.d
    public void seek() {
    }

    public static Object a(x xVar, int i10) {
        if (i10 == 8) {
            return e(xVar);
        }
        if (i10 == 10) {
            return g(xVar);
        }
        if (i10 == 11) {
            return c(xVar);
        }
        if (i10 == 0) {
            return d(xVar);
        }
        if (i10 == 1) {
            return b(xVar);
        }
        if (i10 == 2) {
            return h(xVar);
        }
        if (i10 != 3) {
            return null;
        }
        return f(xVar);
    }
}
