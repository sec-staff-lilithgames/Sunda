package com.inmobi.media;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.x4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC3068x4 extends V1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3068x4(String tableName, String tableSchema) {
        super(tableName, tableSchema);
        kotlin.jvm.internal.e0.checkNotNullParameter(tableName, "tableName");
        kotlin.jvm.internal.e0.checkNotNullParameter(tableSchema, "tableSchema");
    }

    public final void a(ArrayList eventIdList) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eventIdList, "eventIdList");
        if (eventIdList.isEmpty()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int size = eventIdList.size() - 1;
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(eventIdList.get(i10));
            sb2.append(",");
        }
        sb2.append(eventIdList.get(eventIdList.size() - 1));
        a("id IN (" + ((Object) sb2) + ')', null);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("x4", "TAG");
    }

    public final ArrayList b(int i10) {
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("x4", "TAG");
        ArrayList<W1> arrayListA = V1.a(this, null, null, null, null, "ts ASC", Integer.valueOf(i10), 15);
        ArrayList arrayList = new ArrayList();
        for (W1 w12 : arrayListA) {
            if (w12 != null) {
                arrayList.add(w12);
            }
        }
        return arrayList;
    }

    public final void a(long j10) {
        Context contextD = C2925od.d();
        if (contextD != null) {
            ConcurrentHashMap concurrentHashMap = I6.f31865b;
            I6.a(H6.a(contextD, "batch_processing_info"), this.f32382a.concat("_last_batch_process"), j10, false, 4, (Object) null);
        }
    }

    public final void a(int i10) {
        ArrayList<W1> arrayListA = V1.a(this, null, null, null, null, "ts ASC", Integer.valueOf(i10), 15);
        ArrayList arrayList = new ArrayList();
        for (W1 w12 : arrayListA) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("x4", "TAG");
            arrayList.add(w12 != null ? Integer.valueOf(w12.f32427c) : null);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num != null) {
                arrayList2.add(num);
            }
        }
        a(arrayList2);
    }
}
