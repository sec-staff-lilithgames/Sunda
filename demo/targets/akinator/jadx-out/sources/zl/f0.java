package zl;

import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f98230a = new ArrayList();

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new bm.b());
        arrayList.add(new cm.b());
        arrayList.add(new dm.b());
        Collections.sort(arrayList, new ni.a(28));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            am.b bVar = (am.b) arrayList.get(i10);
            vr.a versionForWhichCompiled = null;
            am.b bVar2 = i10 < size + (-1) ? (am.b) arrayList.get(i10 + 1) : null;
            vr.a versionForWhichCompiled2 = bVar.getVersionForWhichCompiled();
            if (bVar2 != null) {
                versionForWhichCompiled = bVar2.getVersionForWhichCompiled();
            }
            f98230a.add(new Pair(new vr.b(versionForWhichCompiled2, versionForWhichCompiled, true, false), bVar));
            i10++;
        }
    }

    public static am.b findVersionWrapper(String str) {
        vr.a version;
        vr.b versionRange = vr.b.parseVersionRange(str);
        if (versionRange != null) {
            ArrayList arrayList = f98230a;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    version = null;
                    break;
                }
                am.b bVar = (am.b) ((Pair) it.next()).second;
                if (Build.VERSION.SDK_INT >= bVar.getMinDeviceApiVersion()) {
                    try {
                        version = bVar.getVersion();
                    } catch (Throwable unused) {
                        version = null;
                    }
                    if (version != null) {
                        break;
                    }
                }
            }
            if (version != null && versionRange.contains(version)) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    if (((vr.b) pair.first).contains(version)) {
                        return (am.b) pair.second;
                    }
                }
            }
        }
        return null;
    }
}
