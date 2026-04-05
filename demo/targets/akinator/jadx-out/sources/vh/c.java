package vh;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import yh.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final sj.c f89276a;

    /* renamed from: b, reason: collision with root package name */
    public final String f89277b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f89278c = null;

    public c(Context context, sj.c cVar, String str) {
        this.f89276a = cVar;
        this.f89277b = str;
    }

    public static boolean b(List list, b bVar) {
        String str = bVar.f89270a;
        String str2 = bVar.f89271b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b bVar2 = (b) it.next();
            if (bVar2.f89270a.equals(str) && bVar2.f89271b.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final void a(ArrayList arrayList) {
        sj.c cVar = this.f89276a;
        d dVar = (d) cVar.get();
        String str = this.f89277b;
        ArrayDeque arrayDeque = new ArrayDeque(dVar.getConditionalUserProperties(str, ""));
        if (this.f89278c == null) {
            this.f89278c = Integer.valueOf(((d) cVar.get()).getMaxUserProperties(str));
        }
        int iIntValue = this.f89278c.intValue();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            while (arrayDeque.size() >= iIntValue) {
                ((d) cVar.get()).clearConditionalUserProperty(((yh.c) arrayDeque.pollFirst()).f94561b, null, null);
            }
            yh.c cVarB = bVar.b(str);
            ((d) cVar.get()).setConditionalUserProperty(cVarB);
            arrayDeque.offer(cVarB);
        }
    }

    public final ArrayList c(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!b(list2, bVar)) {
                arrayList.add(bVar.b(this.f89277b));
            }
        }
        return arrayList;
    }

    public final void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((d) this.f89276a.get()).clearConditionalUserProperty(((yh.c) it.next()).f94561b, null, null);
        }
    }

    public final void e() throws a {
        if (this.f89276a.get() == null) {
            throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    public List<b> getAllExperiments() throws a {
        e();
        List<yh.c> conditionalUserProperties = ((d) this.f89276a.get()).getConditionalUserProperties(this.f89277b, "");
        ArrayList arrayList = new ArrayList();
        for (yh.c cVar : conditionalUserProperties) {
            String[] strArr = b.f89268g;
            String str = cVar.f94563d;
            arrayList.add(new b(cVar.f94561b, String.valueOf(cVar.f94562c), str != null ? str : "", new Date(cVar.f94572m), cVar.f94564e, cVar.f94569j));
        }
        return arrayList;
    }

    public void removeAllExperiments() throws a {
        e();
        d(((d) this.f89276a.get()).getConditionalUserProperties(this.f89277b, ""));
    }

    public void replaceAllExperiments(List<Map<String, String>> list) throws a {
        e();
        if (list == null) {
            throw new IllegalArgumentException("The replacementExperiments list is null.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map<String, String>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b.a(it.next()));
        }
        if (arrayList.isEmpty()) {
            removeAllExperiments();
            return;
        }
        List<b> allExperiments = getAllExperiments();
        d(c(allExperiments, arrayList));
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            b bVar = (b) it2.next();
            if (!b(allExperiments, bVar)) {
                arrayList2.add(bVar);
            }
        }
        a(arrayList2);
    }

    public void reportActiveExperiment(b bVar) throws a {
        e();
        String[] strArr = b.f89268g;
        b.d(bVar.c());
        ArrayList arrayList = new ArrayList();
        HashMap mapC = bVar.c();
        mapC.remove("triggerEvent");
        arrayList.add(b.a(mapC));
        a(arrayList);
    }

    public void validateRunningExperiments(List<b> list) throws a {
        e();
        d(c(getAllExperiments(), list));
    }
}
