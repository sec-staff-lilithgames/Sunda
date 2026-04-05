package pn;

import android.os.SystemClock;
import android.util.Pair;
import io.bidmachine.media3.common.util.a1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import nh.i7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f81489a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f81490b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f81491c;

    /* renamed from: d, reason: collision with root package name */
    public final Random f81492d;

    public a() {
        Random random = new Random();
        this.f81491c = new HashMap();
        this.f81492d = random;
        this.f81489a = new HashMap();
        this.f81490b = new HashMap();
    }

    public static void a(Object obj, long j10, HashMap map) {
        if (map.containsKey(obj)) {
            j10 = Math.max(j10, ((Long) a1.castNonNull((Long) map.get(obj))).longValue());
        }
        map.put(obj, Long.valueOf(j10));
    }

    public static void c(long j10, HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            map.remove(arrayList.get(i10));
        }
    }

    public static int getPriorityCount(List<qn.b> list) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            hashSet.add(Integer.valueOf(list.get(i10).f83303c));
        }
        return hashSet.size();
    }

    public final ArrayList b(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f81489a;
        c(jElapsedRealtime, map);
        HashMap map2 = this.f81490b;
        c(jElapsedRealtime, map2);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            qn.b bVar = (qn.b) list.get(i10);
            if (!map.containsKey(bVar.f83302b) && !map2.containsKey(Integer.valueOf(bVar.f83303c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public void exclude(qn.b bVar, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        a(bVar.f83302b, jElapsedRealtime, this.f81489a);
        int i10 = bVar.f83303c;
        if (i10 != Integer.MIN_VALUE) {
            a(Integer.valueOf(i10), jElapsedRealtime, this.f81490b);
        }
    }

    public int getPriorityCountAfterExclusion(List<qn.b> list) {
        HashSet hashSet = new HashSet();
        ArrayList arrayListB = b(list);
        for (int i10 = 0; i10 < arrayListB.size(); i10++) {
            hashSet.add(Integer.valueOf(((qn.b) arrayListB.get(i10)).f83303c));
        }
        return hashSet.size();
    }

    public void reset() {
        this.f81489a.clear();
        this.f81490b.clear();
        this.f81491c.clear();
    }

    public qn.b selectBaseUrl(List<qn.b> list) {
        qn.b bVar;
        ArrayList arrayListB = b(list);
        if (arrayListB.size() < 2) {
            return (qn.b) i7.getFirst(arrayListB, null);
        }
        Collections.sort(arrayListB, new ni.a(14));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = ((qn.b) arrayListB.get(0)).f83303c;
        int i12 = 0;
        while (true) {
            if (i12 >= arrayListB.size()) {
                break;
            }
            qn.b bVar2 = (qn.b) arrayListB.get(i12);
            if (i11 == bVar2.f83303c) {
                arrayList.add(new Pair(bVar2.f83302b, Integer.valueOf(bVar2.f83304d)));
                i12++;
            } else if (arrayList.size() == 1) {
                return (qn.b) arrayListB.get(0);
            }
        }
        HashMap map = this.f81491c;
        qn.b bVar3 = (qn.b) map.get(arrayList);
        if (bVar3 != null) {
            return bVar3;
        }
        List listSubList = arrayListB.subList(0, arrayList.size());
        int i13 = 0;
        for (int i14 = 0; i14 < listSubList.size(); i14++) {
            i13 += ((qn.b) listSubList.get(i14)).f83304d;
        }
        int iNextInt = this.f81492d.nextInt(i13);
        int i15 = 0;
        while (true) {
            if (i10 >= listSubList.size()) {
                bVar = (qn.b) i7.getLast(listSubList);
                break;
            }
            bVar = (qn.b) listSubList.get(i10);
            i15 += bVar.f83304d;
            if (iNextInt < i15) {
                break;
            }
            i10++;
        }
        map.put(arrayList, bVar);
        return bVar;
    }
}
