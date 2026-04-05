package c8;

import android.graphics.PointF;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f11879a = new f0();

    /* renamed from: b, reason: collision with root package name */
    public static final d8.a f11880b = d8.a.of(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, ApsMetricsDataMap.APSMETRICS_FIELD_VERSION, "i", "o");

    @Override // c8.l0
    public z7.r parse(d8.c cVar, float f10) throws IOException {
        if (cVar.peek() == d8.b.f51924b) {
            cVar.beginArray();
        }
        cVar.beginObject();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zNextBoolean = false;
        while (cVar.hasNext()) {
            int iSelectName = cVar.selectName(f11880b);
            if (iSelectName == 0) {
                zNextBoolean = cVar.nextBoolean();
            } else if (iSelectName == 1) {
                arrayListC = s.c(cVar, f10);
            } else if (iSelectName == 2) {
                arrayListC2 = s.c(cVar, f10);
            } else if (iSelectName != 3) {
                cVar.skipName();
                cVar.skipValue();
            } else {
                arrayListC3 = s.c(cVar, f10);
            }
        }
        cVar.endObject();
        if (cVar.peek() == d8.b.f51925c) {
            cVar.endArray();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayListC.isEmpty()) {
            return new z7.r(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 1; i10 < size; i10++) {
            PointF pointF2 = (PointF) arrayListC.get(i10);
            int i11 = i10 - 1;
            arrayList.add(new x7.a(e8.j.addPoints((PointF) arrayListC.get(i11), (PointF) arrayListC3.get(i11)), e8.j.addPoints(pointF2, (PointF) arrayListC2.get(i10)), pointF2));
        }
        if (zNextBoolean) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i12 = size - 1;
            arrayList.add(new x7.a(e8.j.addPoints((PointF) arrayListC.get(i12), (PointF) arrayListC3.get(i12)), e8.j.addPoints(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new z7.r(pointF, zNextBoolean, arrayList);
    }
}
