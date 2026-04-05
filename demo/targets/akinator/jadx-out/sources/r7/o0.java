package r7;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class o0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f83973a = false;

    /* renamed from: b, reason: collision with root package name */
    public final z.g f83974b = new z.g();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f83975c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final m0 f83976d = new m0();

    public void addFrameListener(n0 n0Var) {
        this.f83974b.add(n0Var);
    }

    public void clearRenderTimes() {
        this.f83975c.clear();
    }

    public List<w3.e> getSortedRenderTimes() {
        if (!this.f83973a) {
            return Collections.EMPTY_LIST;
        }
        HashMap map = this.f83975c;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new w3.e((String) entry.getKey(), Float.valueOf(((e8.i) entry.getValue()).getMean())));
        }
        Collections.sort(arrayList, this.f83976d);
        return arrayList;
    }

    public void logRenderTimes() {
        if (this.f83973a) {
            List<w3.e> sortedRenderTimes = getSortedRenderTimes();
            Log.d("LOTTIE", "Render times:");
            for (int i10 = 0; i10 < sortedRenderTimes.size(); i10++) {
                w3.e eVar = sortedRenderTimes.get(i10);
                Log.d("LOTTIE", String.format("\t\t%30s:%.2f", eVar.f90368a, eVar.f90369b));
            }
        }
    }

    public void recordRenderTime(String str, float f10) {
        if (this.f83973a) {
            HashMap map = this.f83975c;
            e8.i iVar = (e8.i) map.get(str);
            if (iVar == null) {
                iVar = new e8.i();
                map.put(str, iVar);
            }
            iVar.add(f10);
            if (str.equals("__container")) {
                Iterator it = this.f83974b.iterator();
                if (it.hasNext()) {
                    throw a.b.c(it);
                }
            }
        }
    }

    public void removeFrameListener(n0 n0Var) {
        this.f83974b.remove(n0Var);
    }
}
