package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.ng, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2544ng {
    public static String[] A00 = {"WYbfQWuNAjMhMignGLPBKOO7t37dd6pm", "aU7tMP21nVkp4lxoHIMaaJjXF", "KfRhaqKZcjkewaNyxSPNTetlEHftSMTF", "LloEdWhimr4Sj9kwGGxmGk8", "ZUp1YfD37WiDDWuGnJxBVJeZNuRjo", "b9uampRf3yYNP3BKa", "TYkujE9wMI8l0e1bGcChqn19YW9nXTi", "MiH9fLUFy6MgEc5RrTOKVqlzeB7MpQo7"};

    public static int A00(@CheckForNull List<?> list, Object element) {
        if (list instanceof RandomAccess) {
            return A02(list, element);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (BX.A01(element, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public static int A01(@CheckForNull List<?> list, Object element) {
        if (list instanceof RandomAccess) {
            return A03(list, element);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (BX.A01(element, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static int A02(@CheckForNull List<?> list, Object element) {
        int size = list.size();
        if (element == null) {
            for (int i10 = 0; i10 < size; i10++) {
                if (list.get(i10) == null) {
                    return i10;
                }
            }
            return -1;
        }
        for (int i11 = 0; i11 < size; i11++) {
            if (element.equals(list.get(i11))) {
                return i11;
            }
        }
        return -1;
    }

    public static int A03(@CheckForNull List<?> list, Object element) {
        if (element == null) {
            int size = list.size();
            if (A00[2].charAt(2) == 'd') {
                throw new RuntimeException();
            }
            A00[6] = "sSXsk6OcN1QGC";
            for (int i10 = size - 1; i10 >= 0; i10--) {
                if (list.get(i10) == null) {
                    return i10;
                }
            }
            return -1;
        }
        int i11 = list.size();
        for (int i12 = i11 - 1; i12 >= 0; i12--) {
            if (element.equals(list.get(i12))) {
                return i12;
            }
        }
        return -1;
    }

    public static <E> ArrayList<E> A04() {
        return new ArrayList<>();
    }

    public static <E> ArrayList<E> A05(Iterator<? extends E> elements) {
        ArrayList<E> list = A04();
        AbstractC2523nL.A0B(list, elements);
        return list;
    }

    public static boolean A06(@CheckForNull List<?> thisList, Object other) {
        if (other == AbstractC2279jA.A04(thisList)) {
            return true;
        }
        if (!(other instanceof List)) {
            return false;
        }
        List list = (List) other;
        int size = thisList.size();
        if (size != list.size()) {
            return false;
        }
        boolean z10 = thisList instanceof RandomAccess;
        if (A00[7].charAt(4) == 'F') {
            throw new RuntimeException();
        }
        A00[0] = "rcHl15RocZyTXvjAlguJbKcz1P7sPU36";
        if (z10 && (list instanceof RandomAccess)) {
            for (int i10 = 0; i10 < size; i10++) {
                if (!BX.A01(thisList.get(i10), list.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        return AbstractC2523nL.A0G(thisList.iterator(), list.iterator());
    }
}
