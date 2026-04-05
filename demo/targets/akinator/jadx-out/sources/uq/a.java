package uq;

import com.ironsource.C3191e4;
import com.unity3d.ads.BuildConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import sv.k0;
import sv.n0;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final List f88655a;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f88656b;

    public a(List<String> initial) {
        e0.checkNotNullParameter(initial, "initial");
        this.f88655a = initial;
        this.f88656b = new HashSet(initial);
    }

    @Override // uq.b
    public boolean a(List<String> stateGroups) {
        boolean z10;
        e0.checkNotNullParameter(stateGroups, "stateGroups");
        synchronized (this.f88656b) {
            if (stateGroups.isEmpty()) {
                z10 = true;
                break;
            }
            if (!stateGroups.isEmpty()) {
                Iterator<T> it = stateGroups.iterator();
                while (it.hasNext()) {
                    if (d((String) it.next())) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
        }
        return z10;
    }

    public final void b(String str) {
        boolean zStartsWith$default = k0.startsWith$default(str, C3191e4.i.f36527c, false, 2, null);
        HashSet hashSet = this.f88656b;
        if (zStartsWith$default) {
            String strSubstring = str.substring(1);
            e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (hashSet.contains(strSubstring)) {
                return;
            }
            hashSet.add(strSubstring);
            return;
        }
        if (k0.startsWith$default(str, "!", false, 2, null)) {
            String strSubstring2 = str.substring(1);
            e0.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            if (e0.areEqual(strSubstring2, BuildConfig.FLAVOR)) {
                return;
            }
            hashSet.remove(strSubstring2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "stateGroup"
            kotlin.jvm.internal.e0.checkNotNullParameter(r3, r0)
            java.util.HashSet r0 = r2.f88656b
            monitor-enter(r0)
            java.lang.String r1 = "default"
            boolean r1 = kotlin.jvm.internal.e0.areEqual(r3, r1)     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L1d
            java.util.HashSet r1 = r2.f88656b     // Catch: java.lang.Throwable -> L1b
            boolean r3 = r1.contains(r3)     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L19
            goto L1d
        L19:
            r3 = 0
            goto L1e
        L1b:
            r3 = move-exception
            goto L20
        L1d:
            r3 = 1
        L1e:
            monitor-exit(r0)
            return r3
        L20:
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: uq.a.d(java.lang.String):boolean");
    }

    @Override // uq.b
    public void a(String stateGroups) {
        e0.checkNotNullParameter(stateGroups, "stateGroups");
        synchronized (this.f88656b) {
            try {
                List listSplit$default = n0.split$default((CharSequence) stateGroups, new String[]{" "}, false, 0, 6, (Object) null);
                ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(listSplit$default, 10));
                Iterator it = listSplit$default.iterator();
                while (it.hasNext()) {
                    arrayList.add(n0.trim((String) it.next()).toString());
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (!n0.isBlank((String) next)) {
                        arrayList2.add(next);
                    }
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    b((String) it3.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
