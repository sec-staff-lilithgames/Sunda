package z;

import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA;
import com.ironsource.C3191e4;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f96812a;

    /* renamed from: b, reason: collision with root package name */
    public int f96813b;

    public f1(int i10, kotlin.jvm.internal.u uVar) {
        this.f96812a = i10 == 0 ? g1.f96819a : new Object[i10];
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    public static /* synthetic */ String joinToString$default(f1 f1Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, kv.l lVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = APSSharedUtil.TRUNCATE_SEPARATOR;
        }
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        kv.l lVar2 = lVar;
        return f1Var.joinToString(charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    public final boolean any() {
        return isNotEmpty();
    }

    public abstract List<Object> asList();

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean containsAll(Object[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        for (Object obj : elements) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public final int count() {
        return this.f96813b;
    }

    public final Object elementAt(int i10) {
        if (i10 < 0 || i10 >= this.f96813b) {
            throwIndexOutOfBoundsExclusiveException$collection(i10);
        }
        return this.f96812a[i10];
    }

    public final Object elementAtOrElse(int i10, kv.l defaultValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= this.f96813b) ? defaultValue.invoke(Integer.valueOf(i10)) : this.f96812a[i10];
    }

    public boolean equals(Object obj) {
        if (obj instanceof f1) {
            f1 f1Var = (f1) obj;
            int i10 = f1Var.f96813b;
            int i11 = this.f96813b;
            if (i10 == i11) {
                Object[] objArr = this.f96812a;
                Object[] objArr2 = f1Var.f96812a;
                qv.m mVarUntil = qv.v.until(0, i11);
                int first = mVarUntil.getFirst();
                int last = mVarUntil.getLast();
                if (first > last) {
                    return true;
                }
                while (kotlin.jvm.internal.e0.areEqual(objArr[first], objArr2[first])) {
                    if (first == last) {
                        return true;
                    }
                    first++;
                }
                return false;
            }
        }
        return false;
    }

    public final Object first() {
        if (isEmpty()) {
            a0.d.throwNoSuchElementException("ObjectList is empty.");
        }
        return this.f96812a[0];
    }

    public final Object firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    public final <R> R fold(R r10, kv.p operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        Object[] objArr = this.f96812a;
        int i10 = this.f96813b;
        for (int i11 = 0; i11 < i10; i11++) {
            r10 = (R) operation.invoke(r10, objArr[i11]);
        }
        return r10;
    }

    public final <R> R foldIndexed(R r10, kv.q operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        Object[] objArr = this.f96812a;
        int i10 = this.f96813b;
        for (int i11 = 0; i11 < i10; i11++) {
            r10 = (R) operation.invoke(Integer.valueOf(i11), r10, objArr[i11]);
        }
        return r10;
    }

    public final <R> R foldRightIndexed(R r10, kv.q operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        Object[] objArr = this.f96812a;
        int i10 = this.f96813b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return r10;
            }
            r10 = (R) operation.invoke(Integer.valueOf(i10), objArr[i10], r10);
        }
    }

    public final void forEach(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        Object[] objArr = this.f96812a;
        int i10 = this.f96813b;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(objArr[i11]);
        }
    }

    public final void forEachIndexed(kv.p block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        Object[] objArr = this.f96812a;
        int i10 = this.f96813b;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Integer.valueOf(i11), objArr[i11]);
        }
    }

    public final void forEachReversed(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        Object[] objArr = this.f96812a;
        int i10 = this.f96813b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(objArr[i10]);
            }
        }
    }

    public final void forEachReversedIndexed(kv.p block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        Object[] objArr = this.f96812a;
        int i10 = this.f96813b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(Integer.valueOf(i10), objArr[i10]);
            }
        }
    }

    public final Object get(int i10) {
        if (i10 < 0 || i10 >= this.f96813b) {
            throwIndexOutOfBoundsExclusiveException$collection(i10);
        }
        return this.f96812a[i10];
    }

    public final qv.m getIndices() {
        return qv.v.until(0, this.f96813b);
    }

    public final int getLastIndex() {
        return this.f96813b - 1;
    }

    public final int getSize() {
        return this.f96813b;
    }

    public int hashCode() {
        Object[] objArr = this.f96812a;
        int i10 = this.f96813b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final int indexOf(Object obj) {
        int i10 = 0;
        if (obj == null) {
            Object[] objArr = this.f96812a;
            int i11 = this.f96813b;
            while (i10 < i11) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        Object[] objArr2 = this.f96812a;
        int i12 = this.f96813b;
        while (i10 < i12) {
            if (obj.equals(objArr2[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final int indexOfFirst(kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f96812a;
        int i10 = this.f96813b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (((Boolean) predicate.invoke(objArr[i11])).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    public final int indexOfLast(kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f96812a;
        int i10 = this.f96813b;
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (!((Boolean) predicate.invoke(objArr[i10])).booleanValue());
        return i10;
    }

    public final boolean isEmpty() {
        return this.f96813b == 0;
    }

    public final boolean isNotEmpty() {
        return this.f96813b != 0;
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    public final Object last() {
        if (isEmpty()) {
            a0.d.throwNoSuchElementException("ObjectList is empty.");
        }
        return this.f96812a[this.f96813b - 1];
    }

    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            Object[] objArr = this.f96812a;
            for (int i10 = this.f96813b - 1; -1 < i10; i10--) {
                if (objArr[i10] == null) {
                    return i10;
                }
            }
        } else {
            Object[] objArr2 = this.f96812a;
            for (int i11 = this.f96813b - 1; -1 < i11; i11--) {
                if (obj.equals(objArr2[i11])) {
                    return i11;
                }
            }
        }
        return -1;
    }

    public final Object lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return this.f96812a[this.f96813b - 1];
    }

    public final boolean none() {
        return isEmpty();
    }

    public final boolean reversedAny(kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f96812a;
        for (int i10 = this.f96813b - 1; -1 < i10; i10--) {
            if (((Boolean) predicate.invoke(objArr[i10])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void throwIndexOutOfBoundsExclusiveException$collection(int i10) {
        StringBuilder sbT = o2.t(i10, "Index ", " must be in 0..");
        sbT.append(this.f96813b - 1);
        a0.d.throwIndexOutOfBoundsException(sbT.toString());
    }

    public String toString() {
        return joinToString$default(this, null, C3191e4.i.f36529d, C3191e4.i.f36531e, 0, null, new e1(this), 25, null);
    }

    public final boolean any(kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f96812a;
        int i10 = this.f96813b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (((Boolean) predicate.invoke(objArr[i11])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int count(kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f96812a;
        int i10 = this.f96813b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (((Boolean) predicate.invoke(objArr[i12])).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    public final Object firstOrNull(kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f96812a;
        int i10 = this.f96813b;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                return obj;
            }
        }
        return null;
    }

    public final <R> R foldRight(R r10, kv.p pVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pVar, QFzuMMDfrzagDN.FjBHRWJhtR);
        Object[] objArr = this.f96812a;
        int i10 = this.f96813b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return r10;
            }
            r10 = (R) pVar.invoke(objArr[i10], r10);
        }
    }

    public final String joinToString(CharSequence separator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, null, 62, null);
    }

    public final boolean containsAll(List<Object> list) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, gjnZrsdA.FGkkqHaSVTEC);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!contains(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, null, 60, null);
    }

    public final Object lastOrNull(kv.l predicate) {
        Object obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f96812a;
        int i10 = this.f96813b;
        do {
            i10--;
            if (-1 >= i10) {
                return null;
            }
            obj = objArr[i10];
        } while (!((Boolean) predicate.invoke(obj)).booleanValue());
        return obj;
    }

    public final Object first(kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f96812a;
        int i10 = this.f96813b;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                return obj;
            }
        }
        throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.e0.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    public final boolean containsAll(Iterable<Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Iterator<Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.e0.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i10, null, null, 48, null);
    }

    public final Object last(kv.l predicate) {
        Object obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.f96812a;
        int i10 = this.f96813b;
        do {
            i10--;
            if (-1 < i10) {
                obj = objArr[i10];
            } else {
                throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
            }
        } while (!((Boolean) predicate.invoke(obj)).booleanValue());
        return obj;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated) {
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.e0.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.e0.checkNotNullParameter(truncated, "truncated");
        return joinToString$default(this, separator, prefix, postfix, i10, truncated, null, 32, null);
    }

    public final boolean containsAll(f1 elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.f96812a;
        int i10 = elements.f96813b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (!contains(objArr[i11])) {
                return false;
            }
        }
        return true;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, kv.l lVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.e0.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.e0.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Object[] objArr = this.f96812a;
        int i11 = this.f96813b;
        int i12 = 0;
        while (true) {
            if (i12 < i11) {
                Object obj = objArr[i12];
                if (i12 == i10) {
                    sb2.append(truncated);
                    break;
                }
                if (i12 != 0) {
                    sb2.append(separator);
                }
                if (lVar == null) {
                    sb2.append(obj);
                } else {
                    sb2.append((CharSequence) lVar.invoke(obj));
                }
                i12++;
            } else {
                sb2.append(postfix);
                break;
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
