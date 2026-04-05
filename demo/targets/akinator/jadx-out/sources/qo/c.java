package qo;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.media3.common.util.m0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ko.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c extends e {

    /* renamed from: b, reason: collision with root package name */
    public long f83412b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f83413c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f83414d;

    public c() {
        super(new v());
        this.f83412b = C.TIME_UNSET;
        this.f83413c = new long[0];
        this.f83414d = new long[0];
    }

    public static Serializable c(int i10, m0 m0Var) {
        if (i10 == 0) {
            return Double.valueOf(Double.longBitsToDouble(m0Var.readLong()));
        }
        if (i10 == 1) {
            return Boolean.valueOf(m0Var.readUnsignedByte() == 1);
        }
        if (i10 == 2) {
            return e(m0Var);
        }
        if (i10 != 3) {
            if (i10 == 8) {
                return d(m0Var);
            }
            if (i10 != 10) {
                if (i10 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(m0Var.readLong()));
                m0Var.skipBytes(2);
                return date;
            }
            int unsignedIntToInt = m0Var.readUnsignedIntToInt();
            ArrayList arrayList = new ArrayList(unsignedIntToInt);
            for (int i11 = 0; i11 < unsignedIntToInt; i11++) {
                Serializable serializableC = c(m0Var.readUnsignedByte(), m0Var);
                if (serializableC != null) {
                    arrayList.add(serializableC);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strE = e(m0Var);
            int unsignedByte = m0Var.readUnsignedByte();
            if (unsignedByte == 9) {
                return map;
            }
            Serializable serializableC2 = c(unsignedByte, m0Var);
            if (serializableC2 != null) {
                map.put(strE, serializableC2);
            }
        }
    }

    public static HashMap d(m0 m0Var) {
        int unsignedIntToInt = m0Var.readUnsignedIntToInt();
        HashMap map = new HashMap(unsignedIntToInt);
        for (int i10 = 0; i10 < unsignedIntToInt; i10++) {
            String strE = e(m0Var);
            Serializable serializableC = c(m0Var.readUnsignedByte(), m0Var);
            if (serializableC != null) {
                map.put(strE, serializableC);
            }
        }
        return map;
    }

    public static String e(m0 m0Var) {
        int unsignedShort = m0Var.readUnsignedShort();
        int position = m0Var.getPosition();
        m0Var.skipBytes(unsignedShort);
        return new String(m0Var.getData(), position, unsignedShort);
    }

    @Override // qo.e
    public final boolean a(m0 m0Var) {
        return true;
    }

    @Override // qo.e
    public final boolean b(long j10, m0 m0Var) {
        if (m0Var.readUnsignedByte() != 2 || !"onMetaData".equals(e(m0Var)) || m0Var.bytesLeft() == 0 || m0Var.readUnsignedByte() != 8) {
            return false;
        }
        HashMap mapD = d(m0Var);
        Object obj = mapD.get(IronSourceConstants.EVENTS_DURATION);
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f83412b = (long) (dDoubleValue * 1000000.0d);
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
                this.f83413c = new long[size];
                this.f83414d = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f83413c = new long[0];
                        this.f83414d = new long[0];
                        break;
                    }
                    this.f83413c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f83414d[i10] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public long getDurationUs() {
        return this.f83412b;
    }

    public long[] getKeyFrameTagPositions() {
        return this.f83414d;
    }

    public long[] getKeyFrameTimesUs() {
        return this.f83413c;
    }

    @Override // qo.e
    public void seek() {
    }
}
