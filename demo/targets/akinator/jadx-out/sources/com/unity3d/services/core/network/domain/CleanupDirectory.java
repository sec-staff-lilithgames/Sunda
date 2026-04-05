package com.unity3d.services.core.network.domain;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import gv.p;
import j1.o2;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import rv.f0;
import rv.t;
import tu.v;
import uu.p0;
import uu.y0;
import xu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CleanupDirectory {
    public final void invoke(File directory, int i10, long j10) {
        List list;
        e0.checkNotNullParameter(directory, "directory");
        if (!directory.exists() || !directory.isDirectory()) {
            throw new IllegalArgumentException(o2.h(directory, "Directory does not exist or is not a directory: ").toString());
        }
        Object obj = null;
        t tVarFilter = f0.filter(p.walk$default(directory, null, 1, null), CleanupDirectory$invoke$cachedFiles$1.INSTANCE);
        Iterator<Object> it = tVarFilter.iterator();
        long length = 0;
        long length2 = 0;
        while (it.hasNext()) {
            length2 += ((File) it.next()).length();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : tVarFilter) {
            if (((File) obj2).lastModified() + j10 < jCurrentTimeMillis) {
                arrayList.add(obj2);
            } else {
                arrayList2.add(obj2);
            }
        }
        v vVar = new v(arrayList, arrayList2);
        List list2 = (List) vVar.component1();
        List list3 = (List) vVar.component2();
        List list4 = list2;
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            length += ((File) it2.next()).length();
        }
        long j11 = length2 - length;
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            ((File) it3.next()).delete();
        }
        long j12 = i10 * ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        if (j11 > j12) {
            Iterator<Object> it4 = f0.runningFold(f0.sortedWith(y0.asSequence(list3), new Comparator() { // from class: com.unity3d.services.core.network.domain.CleanupDirectory$invoke$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return d.compareValues(Long.valueOf(((File) t10).lastModified()), Long.valueOf(((File) t11).lastModified()));
                }
            }), tu.e0.to(Long.valueOf(j11), p0.emptyList()), CleanupDirectory$invoke$additionalFiles$2.INSTANCE).iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next = it4.next();
                if (((Number) ((v) next).component1()).longValue() <= j12) {
                    obj = next;
                    break;
                }
            }
            v vVar2 = (v) obj;
            if (vVar2 != null && (list = (List) vVar2.component2()) != null) {
                list3 = list;
            }
            Iterator it5 = list3.iterator();
            while (it5.hasNext()) {
                ((File) it5.next()).delete();
            }
        }
    }
}
