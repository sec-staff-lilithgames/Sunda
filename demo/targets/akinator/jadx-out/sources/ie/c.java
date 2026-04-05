package ie;

import com.google.android.exoplayer2.util.v0;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ee.o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c extends e {

    /* renamed from: b, reason: collision with root package name */
    public long f59563b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f59564c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f59565d;

    public c() {
        super(new o());
        this.f59563b = C.TIME_UNSET;
        this.f59564c = new long[0];
        this.f59565d = new long[0];
    }

    public static Serializable c(int i10, v0 v0Var) {
        if (i10 == 0) {
            return Double.valueOf(Double.longBitsToDouble(v0Var.readLong()));
        }
        if (i10 == 1) {
            return Boolean.valueOf(v0Var.readUnsignedByte() == 1);
        }
        if (i10 == 2) {
            return e(v0Var);
        }
        if (i10 != 3) {
            if (i10 == 8) {
                return d(v0Var);
            }
            if (i10 != 10) {
                if (i10 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(v0Var.readLong()));
                v0Var.skipBytes(2);
                return date;
            }
            int unsignedIntToInt = v0Var.readUnsignedIntToInt();
            ArrayList arrayList = new ArrayList(unsignedIntToInt);
            for (int i11 = 0; i11 < unsignedIntToInt; i11++) {
                Serializable serializableC = c(v0Var.readUnsignedByte(), v0Var);
                if (serializableC != null) {
                    arrayList.add(serializableC);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strE = e(v0Var);
            int unsignedByte = v0Var.readUnsignedByte();
            if (unsignedByte == 9) {
                return map;
            }
            Serializable serializableC2 = c(unsignedByte, v0Var);
            if (serializableC2 != null) {
                map.put(strE, serializableC2);
            }
        }
    }

    public static HashMap d(v0 v0Var) {
        int unsignedIntToInt = v0Var.readUnsignedIntToInt();
        HashMap map = new HashMap(unsignedIntToInt);
        for (int i10 = 0; i10 < unsignedIntToInt; i10++) {
            String strE = e(v0Var);
            Serializable serializableC = c(v0Var.readUnsignedByte(), v0Var);
            if (serializableC != null) {
                map.put(strE, serializableC);
            }
        }
        return map;
    }

    public static String e(v0 v0Var) {
        int unsignedShort = v0Var.readUnsignedShort();
        int position = v0Var.getPosition();
        v0Var.skipBytes(unsignedShort);
        return new String(v0Var.getData(), position, unsignedShort);
    }

    @Override // ie.e
    public final boolean a(v0 v0Var) {
        return true;
    }

    @Override // ie.e
    public final boolean b(v0 v0Var, long j10) {
        if (v0Var.readUnsignedByte() != 2 || !"onMetaData".equals(e(v0Var)) || v0Var.bytesLeft() == 0 || v0Var.readUnsignedByte() != 8) {
            return false;
        }
        HashMap mapD = d(v0Var);
        Object obj = mapD.get(IronSourceConstants.EVENTS_DURATION);
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f59563b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapD.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f59564c = new long[size];
                this.f59565d = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f59564c = new long[0];
                        this.f59565d = new long[0];
                        break;
                    }
                    this.f59564c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f59565d[i10] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public long getDurationUs() {
        return this.f59563b;
    }

    public long[] getKeyFrameTagPositions() {
        return this.f59565d;
    }

    public long[] getKeyFrameTimesUs() {
        return this.f59564c;
    }

    @Override // ie.e
    public void seek() {
    }
}
