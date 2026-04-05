package com.moloco.sdk.acm.eventprocessing;

import android.util.Log;
import androidx.work.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.e0;
import tu.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class f {
    public static final androidx.work.b a(Map<String, ? extends Object> map) {
        e0.checkNotNullParameter(map, "<this>");
        try {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                arrayList.add(tu.e0.to(entry.getKey(), entry.getValue()));
            }
            v[] vVarArr = (v[]) arrayList.toArray(new v[0]);
            v[] vVarArr2 = (v[]) Arrays.copyOf(vVarArr, vVarArr.length);
            b.a aVar = new b.a();
            for (v vVar : vVarArr2) {
                aVar.put((String) vVar.getFirst(), vVar.getSecond());
            }
            androidx.work.b bVarBuild = aVar.build();
            e0.checkNotNullExpressionValue(bVarBuild, "dataBuilder.build()");
            return bVarBuild;
        } catch (Exception e10) {
            Log.e("DBPeriodicRequest", e10.getMessage() + ". Data: " + map);
            return null;
        }
    }
}
