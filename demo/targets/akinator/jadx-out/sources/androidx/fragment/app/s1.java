package androidx.fragment.app;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s1 implements p1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6453a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f6454b;

    public s1(FragmentManager fragmentManager, String str) {
        this.f6454b = fragmentManager;
        this.f6453a = str;
    }

    @Override // androidx.fragment.app.p1
    public boolean generateOps(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) throws Throwable {
        int i10;
        FragmentManager fragmentManager = this.f6454b;
        char c10 = 65535;
        String str = this.f6453a;
        int iZ = fragmentManager.z(-1, str, true);
        if (iZ < 0) {
            return false;
        }
        int i11 = iZ;
        while (true) {
            Throwable th2 = null;
            if (i11 < fragmentManager.f6223d.size()) {
                a aVar = (a) fragmentManager.f6223d.get(i11);
                if (!aVar.f6377r) {
                    fragmentManager.X(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + aVar + " that did not use setReorderingAllowed(true)."));
                    throw null;
                }
                i11++;
            } else {
                HashSet hashSet = new HashSet();
                int i12 = iZ;
                while (true) {
                    int i13 = 2;
                    if (i12 >= fragmentManager.f6223d.size()) {
                        Throwable th3 = th2;
                        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                        while (!arrayDeque.isEmpty()) {
                            Fragment fragment = (Fragment) arrayDeque.removeFirst();
                            if (fragment.mRetainInstance) {
                                StringBuilder sbO = e3.g.o("saveBackStack(\"", str, "\") must not contain retained fragments. Found ");
                                sbO.append(hashSet.contains(fragment) ? "direct reference to retained " : "retained child ");
                                sbO.append("fragment ");
                                sbO.append(fragment);
                                fragmentManager.X(new IllegalArgumentException(sbO.toString()));
                                throw th3;
                            }
                            Iterator it = fragment.mChildFragmentManager.f6222c.e().iterator();
                            while (it.hasNext()) {
                                Fragment fragment2 = (Fragment) it.next();
                                if (fragment2 != null) {
                                    arrayDeque.addLast(fragment2);
                                }
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(((Fragment) it2.next()).mWho);
                        }
                        ArrayList arrayList4 = new ArrayList(fragmentManager.f6223d.size() - iZ);
                        for (int i14 = iZ; i14 < fragmentManager.f6223d.size(); i14++) {
                            arrayList4.add(th3);
                        }
                        BackStackState backStackState = new BackStackState(arrayList3, arrayList4);
                        for (int size = fragmentManager.f6223d.size() - 1; size >= iZ; size--) {
                            a aVar2 = (a) fragmentManager.f6223d.remove(size);
                            a aVar3 = new a(aVar2);
                            ArrayList arrayList5 = aVar3.f6362c;
                            int size2 = arrayList5.size() - 1;
                            while (size2 >= 0) {
                                g2 g2Var = (g2) arrayList5.get(size2);
                                if (g2Var.f6327c) {
                                    if (g2Var.f6325a == 8) {
                                        g2Var.f6327c = false;
                                        arrayList5.remove(size2 - 1);
                                        size2--;
                                    } else {
                                        int i15 = g2Var.f6326b.mContainerId;
                                        g2Var.f6325a = 2;
                                        g2Var.f6327c = false;
                                        for (int i16 = size2 - 1; i16 >= 0; i16--) {
                                            g2 g2Var2 = (g2) arrayList5.get(i16);
                                            if (g2Var2.f6327c && g2Var2.f6326b.mContainerId == i15) {
                                                arrayList5.remove(i16);
                                                size2--;
                                            }
                                        }
                                    }
                                }
                                size2--;
                            }
                            arrayList4.set(size - iZ, new BackStackRecordState(aVar3));
                            aVar2.f6272w = true;
                            arrayList.add(aVar2);
                            arrayList2.add(Boolean.TRUE);
                        }
                        fragmentManager.f6229j.put(str, backStackState);
                        return true;
                    }
                    a aVar4 = (a) fragmentManager.f6223d.get(i12);
                    HashSet hashSet2 = new HashSet();
                    HashSet hashSet3 = new HashSet();
                    char c11 = c10;
                    Iterator it3 = aVar4.f6362c.iterator();
                    while (it3.hasNext()) {
                        g2 g2Var3 = (g2) it3.next();
                        Throwable th4 = th2;
                        Fragment fragment3 = g2Var3.f6326b;
                        if (fragment3 == null) {
                            th2 = th4;
                        } else {
                            if (!g2Var3.f6327c || (i10 = g2Var3.f6325a) == 1 || i10 == i13 || i10 == 8) {
                                hashSet.add(fragment3);
                                hashSet2.add(fragment3);
                            }
                            int i17 = g2Var3.f6325a;
                            if (i17 == 1 || i17 == 2) {
                                hashSet3.add(fragment3);
                            }
                            th2 = th4;
                            i13 = 2;
                        }
                    }
                    Throwable th5 = th2;
                    hashSet2.removeAll(hashSet3);
                    if (!hashSet2.isEmpty()) {
                        StringBuilder sbO2 = e3.g.o("saveBackStack(\"", str, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                        sbO2.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                        sbO2.append(" in ");
                        sbO2.append(aVar4);
                        sbO2.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                        fragmentManager.X(new IllegalArgumentException(sbO2.toString()));
                        throw th5;
                    }
                    i12++;
                    c10 = c11;
                    th2 = th5;
                }
            }
        }
    }
}
