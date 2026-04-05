package e3;

import j1.o2;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public s f53677a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f53678b;

    public static void a(s sVar, int i10) {
        h hVar;
        s sVar2;
        h hVar2;
        s sVar3;
        if (sVar.f53696b.f51781f[i10]) {
            Iterator it = sVar.f53702h.f53672k.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                if ((eVar instanceof h) && (sVar3 = (hVar2 = (h) eVar).f53665d) != sVar && hVar2 == sVar3.f53702h) {
                    if (sVar instanceof d) {
                        Iterator it2 = ((d) sVar).f53652k.iterator();
                        while (it2.hasNext()) {
                            a((s) it2.next(), i10);
                        }
                    } else if (!(sVar instanceof m)) {
                        sVar.f53696b.f51781f[i10] = false;
                    }
                    a(sVar3, i10);
                }
            }
            Iterator it3 = sVar.f53703i.f53672k.iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if ((eVar2 instanceof h) && (sVar2 = (hVar = (h) eVar2).f53665d) != sVar && hVar == sVar2.f53702h) {
                    if (sVar instanceof d) {
                        Iterator it4 = ((d) sVar).f53652k.iterator();
                        while (it4.hasNext()) {
                            a((s) it4.next(), i10);
                        }
                    } else if (!(sVar instanceof m)) {
                        sVar.f53696b.f51781f[i10] = false;
                    }
                    a(sVar2, i10);
                }
            }
        }
    }

    public static long b(h hVar, long j10) {
        s sVar = hVar.f53665d;
        ArrayList arrayList = hVar.f53672k;
        if (sVar instanceof m) {
            return j10;
        }
        int size = arrayList.size();
        long jMin = j10;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = (e) arrayList.get(i10);
            if (eVar instanceof h) {
                h hVar2 = (h) eVar;
                if (hVar2.f53665d != sVar) {
                    jMin = Math.min(jMin, b(hVar2, hVar2.f53667f + j10));
                }
            }
        }
        h hVar3 = sVar.f53703i;
        h hVar4 = sVar.f53702h;
        if (hVar != hVar3) {
            return jMin;
        }
        long wrapDimension = j10 - sVar.getWrapDimension();
        return Math.min(Math.min(jMin, b(hVar4, wrapDimension)), wrapDimension - hVar4.f53667f);
    }

    public static long c(h hVar, long j10) {
        s sVar = hVar.f53665d;
        ArrayList arrayList = hVar.f53672k;
        if (sVar instanceof m) {
            return j10;
        }
        int size = arrayList.size();
        long jMax = j10;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = (e) arrayList.get(i10);
            if (eVar instanceof h) {
                h hVar2 = (h) eVar;
                if (hVar2.f53665d != sVar) {
                    jMax = Math.max(jMax, c(hVar2, hVar2.f53667f + j10));
                }
            }
        }
        h hVar3 = sVar.f53702h;
        h hVar4 = sVar.f53703i;
        if (hVar != hVar3) {
            return jMax;
        }
        long wrapDimension = sVar.getWrapDimension() + j10;
        return Math.max(Math.max(jMax, c(hVar4, wrapDimension)), wrapDimension - hVar4.f53667f);
    }

    public void add(s sVar) {
        this.f53678b.add(sVar);
    }

    public long computeWrapSize(d3.h hVar, int i10) {
        s sVar = this.f53677a;
        if (!(sVar instanceof d) ? i10 != 0 ? (sVar instanceof p) : (sVar instanceof n) : ((d) sVar).f53700f == i10) {
            return 0L;
        }
        h hVar2 = (i10 == 0 ? hVar.f51777d : hVar.f51779e).f53702h;
        h hVar3 = (i10 == 0 ? hVar.f51777d : hVar.f51779e).f53703i;
        h hVar4 = sVar.f53702h;
        h hVar5 = sVar.f53702h;
        h hVar6 = sVar.f53703i;
        boolean zContains = hVar4.f53673l.contains(hVar2);
        boolean zContains2 = hVar6.f53673l.contains(hVar3);
        long wrapDimension = sVar.getWrapDimension();
        if (!zContains || !zContains2) {
            if (zContains) {
                return Math.max(c(hVar5, hVar5.f53667f), hVar5.f53667f + wrapDimension);
            }
            if (zContains2) {
                return Math.max(-b(hVar6, hVar6.f53667f), (-hVar6.f53667f) + wrapDimension);
            }
            return (sVar.getWrapDimension() + hVar5.f53667f) - hVar6.f53667f;
        }
        long jC = c(hVar5, 0L);
        long jB = b(hVar6, 0L);
        long j10 = jC - wrapDimension;
        int i11 = hVar6.f53667f;
        if (j10 >= (-i11)) {
            j10 += i11;
        }
        long j11 = hVar5.f53667f;
        long j12 = ((-jB) - wrapDimension) - j11;
        if (j12 >= j11) {
            j12 -= j11;
        }
        float biasPercent = sVar.f53696b.getBiasPercent(i10);
        float f10 = biasPercent > 0.0f ? (long) ((j10 / (1.0f - biasPercent)) + (j12 / biasPercent)) : 0L;
        return (hVar5.f53667f + ((((long) ((f10 * biasPercent) + 0.5f)) + wrapDimension) + ((long) o2.a(1.0f, biasPercent, f10, 0.5f)))) - hVar6.f53667f;
    }

    public void defineTerminalWidgets(boolean z10, boolean z11) {
        s sVar = this.f53677a;
        if (z10 && (sVar instanceof n)) {
            a(sVar, 0);
        }
        if (z11 && (sVar instanceof p)) {
            a(sVar, 1);
        }
    }
}
