package p0;

import androidx.activity.result.HM.OIPXcgrVyyxoLF;
import com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA;
import com.ironsource.C3191e4;
import io.ktor.util.date.GMTDateParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class s4 implements d1.e, Iterable, lv.a {

    /* renamed from: c, reason: collision with root package name */
    public int f80459c;

    /* renamed from: f, reason: collision with root package name */
    public int f80461f;

    /* renamed from: g, reason: collision with root package name */
    public int f80462g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f80464i;

    /* renamed from: j, reason: collision with root package name */
    public int f80465j;

    /* renamed from: l, reason: collision with root package name */
    public HashMap f80467l;

    /* renamed from: m, reason: collision with root package name */
    public z.j0 f80468m;

    /* renamed from: b, reason: collision with root package name */
    public int[] f80458b = new int[0];

    /* renamed from: e, reason: collision with root package name */
    public Object[] f80460e = new Object[0];

    /* renamed from: h, reason: collision with root package name */
    public final Object f80463h = new Object();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f80466k = new ArrayList();

    public static final void d(r4 r4Var, z.k0 k0Var, ArrayList arrayList, kotlin.jvm.internal.w0 w0Var, s4 s4Var, ArrayList arrayList2) {
        k3 k3VarC;
        int groupKey = r4Var.getGroupKey();
        if (!k0Var.contains(groupKey)) {
            r4Var.startGroup();
            while (!r4Var.isGroupEnd()) {
                d(r4Var, k0Var, arrayList, w0Var, s4Var, arrayList2);
            }
            r4Var.endGroup();
            return;
        }
        if (groupKey != -3) {
            arrayList.add(r4.anchor$default(r4Var, 0, 1, null));
        }
        if (w0Var.f71863b) {
            k3 k3VarC2 = s4Var.c(r4Var.getCurrentGroup());
            if (k3VarC2 != null) {
                arrayList2.add(k3VarC2);
                b anchor = k3VarC2.getAnchor();
                if (anchor != null && anchor.getLocation$runtime() == r4Var.getCurrentGroup() && (k3VarC = s4Var.c(r4Var.getParent())) != null) {
                    arrayList2.add(k3VarC);
                }
            } else {
                w0Var.f71863b = false;
                arrayList2.clear();
            }
        }
        r4Var.skipGroup();
    }

    public static final void f(s4 s4Var, q1 q1Var) {
        ArrayList<Object> groups = q1Var.getGroups();
        if (groups != null) {
            int size = groups.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = groups.get(i10);
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (!bVar.getValid()) {
                        a3.throwIllegalArgumentException("Source map contains invalid anchor");
                    }
                    if (!s4Var.ownsAnchor(bVar)) {
                        a3.throwIllegalArgumentException("Source map anchor is not owned by the slot table");
                    }
                } else if (obj instanceof q1) {
                    f(s4Var, (q1) obj);
                }
            }
        }
    }

    public final int a(StringBuilder sb2, int i10, int i11) {
        String sourceInformation;
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append(' ');
        }
        sb2.append("Group(");
        sb2.append(i10);
        sb2.append(")");
        q1 q1VarSourceInformationOf = sourceInformationOf(i10);
        if (q1VarSourceInformationOf != null && (sourceInformation = q1VarSourceInformationOf.getSourceInformation()) != null && (sv.k0.startsWith$default(sourceInformation, "C(", false, 2, null) || sv.k0.startsWith$default(sourceInformation, "CC(", false, 2, null))) {
            int iIndexOf$default = sv.n0.indexOf$default((CharSequence) sourceInformation, "(", 0, false, 6, (Object) null) + 1;
            int iIndexOf$default2 = sv.n0.indexOf$default((CharSequence) sourceInformation, ')', 0, false, 6, (Object) null);
            sb2.append(" ");
            String strSubstring = sourceInformation.substring(iIndexOf$default, iIndexOf$default2);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
            sb2.append(strSubstring);
            sb2.append("()");
        }
        sb2.append(" key=");
        int i13 = i10 * 5;
        sb2.append(this.f80458b[i13]);
        int iAccess$groupSize = u4.access$groupSize(this.f80458b, i10);
        sb2.append(", nodes=");
        int i14 = i13 + 1;
        sb2.append(this.f80458b[i14] & 67108863);
        sb2.append(", size=");
        sb2.append(iAccess$groupSize);
        if ((this.f80458b[i14] & 134217728) != 0) {
            sb2.append(", mark");
        }
        if ((this.f80458b[i14] & 67108864) != 0) {
            sb2.append(", contains mark");
        }
        int i15 = this.f80459c;
        int i16 = i10 >= i15 ? this.f80461f : this.f80458b[i13 + 4];
        int iA = i10 + 1;
        int i17 = iA >= i15 ? this.f80461f : this.f80458b[(iA * 5) + 4];
        if (i16 < 0 || i16 > i17 || i17 > this.f80461f) {
            sb2.append(", *invalid data offsets " + i16 + '-' + i17 + GMTDateParser.ANY);
        } else {
            if ((this.f80458b[i14] & 536870912) != 0) {
                sb2.append(" objectKey=" + u4.access$summarize(String.valueOf(this.f80460e[u4.access$objectKeyIndex(this.f80458b, i10)]), 10));
            }
            if ((this.f80458b[i14] & 1073741824) != 0) {
                sb2.append(OIPXcgrVyyxoLF.pdMhlk + u4.access$summarize(String.valueOf(this.f80460e[this.f80458b[i13 + 4]]), 10));
            }
            if ((this.f80458b[i14] & 268435456) != 0) {
                sb2.append(" aux=" + u4.access$summarize(String.valueOf(this.f80460e[u4.access$auxIndex(this.f80458b, i10)]), 10));
            }
            int iAccess$slotAnchor = u4.access$slotAnchor(this.f80458b, i10);
            if (iAccess$slotAnchor < i17) {
                sb2.append(", slots=[");
                sb2.append(iAccess$slotAnchor);
                sb2.append(": ");
                for (int i18 = iAccess$slotAnchor; i18 < i17; i18++) {
                    if (i18 != iAccess$slotAnchor) {
                        sb2.append(", ");
                    }
                    sb2.append(u4.access$summarize(String.valueOf(this.f80460e[i18]), 10));
                }
                sb2.append(C3191e4.i.f36531e);
            }
        }
        sb2.append('\n');
        int i19 = i10 + iAccess$groupSize;
        while (iA < i19) {
            iA += a(sb2, iA, i11 + 1);
        }
        return iAccess$groupSize;
    }

    public final b anchor(int i10) {
        if (this.f80464i) {
            d0.composeImmediateRuntimeError("use active SlotWriter to create an anchor location instead");
        }
        if (i10 < 0 || i10 >= this.f80459c) {
            a3.throwIllegalArgumentException("Parameter index is out of range");
        }
        ArrayList arrayList = this.f80466k;
        int iA = u4.a(arrayList, i10, this.f80459c);
        if (iA >= 0) {
            return (b) arrayList.get(iA);
        }
        b bVar = new b(i10);
        arrayList.add(-(iA + 1), bVar);
        return bVar;
    }

    public final int anchorIndex(b bVar) {
        if (this.f80464i) {
            d0.composeImmediateRuntimeError("Use active SlotWriter to determine anchor location instead");
        }
        if (!bVar.getValid()) {
            a3.throwIllegalArgumentException("Anchor refers to a group that was removed");
        }
        return bVar.getLocation$runtime();
    }

    public final k3 c(int i10) {
        int i11 = i10;
        while (i11 > 0) {
            Iterator<Object> it = new z0(this, i11).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof k3) {
                    k3 k3Var = (k3) next;
                    if (k3Var.getUsed() && i11 != i10) {
                        return k3Var;
                    }
                    k3Var.setForcedRecompose(true);
                }
            }
            i11 = this.f80458b[(i11 * 5) + 2];
        }
        return null;
    }

    public final void close$runtime(r4 r4Var, HashMap<b, q1> map) {
        if (!(r4Var.getTable$runtime() == this && this.f80462g > 0)) {
            d0.composeImmediateRuntimeError("Unexpected reader close()");
        }
        this.f80462g--;
        if (map != null) {
            synchronized (this.f80463h) {
                try {
                    HashMap map2 = this.f80467l;
                    if (map2 != null) {
                        map2.putAll(map);
                    } else {
                        this.f80467l = map;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void collectCalledByInformation() {
        this.f80468m = new z.j0(0, 1, null);
    }

    public final void collectSourceInformation() {
        this.f80467l = new HashMap();
    }

    public final boolean containsMark() {
        return this.f80459c > 0 && (this.f80458b[1] & 67108864) != 0;
    }

    @Override // d1.e
    public d1.i find(Object obj) {
        return new t4(this, 0, 0, 4, null).find(obj);
    }

    public final ArrayList<b> getAnchors$runtime() {
        return this.f80466k;
    }

    public final z.j0 getCalledByMap$runtime() {
        return this.f80468m;
    }

    @Override // d1.e
    public Iterable<d1.i> getCompositionGroups() {
        return this;
    }

    public final int[] getGroups() {
        return this.f80458b;
    }

    public final int getGroupsSize() {
        return this.f80459c;
    }

    public final Object[] getSlots() {
        return this.f80460e;
    }

    public final int getSlotsSize() {
        return this.f80461f;
    }

    public final HashMap<b, q1> getSourceInformationMap$runtime() {
        return this.f80467l;
    }

    public final int getVersion$runtime() {
        return this.f80465j;
    }

    public final boolean getWriter$runtime() {
        return this.f80464i;
    }

    public final boolean groupContainsAnchor(int i10, b bVar) {
        if (this.f80464i) {
            d0.composeImmediateRuntimeError("Writer is active");
        }
        if (i10 < 0 || i10 >= this.f80459c) {
            d0.composeImmediateRuntimeError("Invalid group index");
        }
        if (!ownsAnchor(bVar)) {
            return false;
        }
        int iAccess$groupSize = u4.access$groupSize(this.f80458b, i10) + i10;
        int location$runtime = bVar.getLocation$runtime();
        return i10 <= location$runtime && location$runtime < iAccess$groupSize;
    }

    public final boolean inGroup(b bVar, b bVar2) {
        int location$runtime = bVar.getLocation$runtime();
        int iAccess$groupSize = u4.access$groupSize(this.f80458b, location$runtime) + location$runtime;
        int location$runtime2 = bVar2.getLocation$runtime();
        return location$runtime <= location$runtime2 && location$runtime2 < iAccess$groupSize;
    }

    public final List<k3> invalidateGroupsWithKey$runtime(int i10) {
        z.k0 k0Var;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        kotlin.jvm.internal.w0 w0Var = new kotlin.jvm.internal.w0();
        w0Var.f71863b = true;
        z.k0 k0Var2 = new z.k0(0, 1, null);
        k0Var2.add(i10);
        k0Var2.add(-3);
        z.j0 j0Var = this.f80468m;
        if (j0Var != null && (k0Var = (z.k0) j0Var.get(i10)) != null) {
            k0Var2.addAll(k0Var);
        }
        r4 r4VarOpenReader = openReader();
        try {
            d(r4VarOpenReader, k0Var2, arrayList, w0Var, this, arrayList2);
            r4VarOpenReader.close();
            v4 v4VarOpenWriter = openWriter();
            try {
                v4VarOpenWriter.startGroup();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    b bVar = (b) arrayList.get(i11);
                    if (bVar.toIndexFor(v4VarOpenWriter) >= v4VarOpenWriter.getCurrentGroup()) {
                        v4VarOpenWriter.seek(bVar);
                        v4VarOpenWriter.bashCurrentGroup();
                    }
                }
                v4VarOpenWriter.skipToGroupEnd();
                v4VarOpenWriter.endGroup();
                v4VarOpenWriter.close(true);
                if (w0Var.f71863b) {
                    return arrayList2;
                }
                return null;
            } catch (Throwable th2) {
                v4VarOpenWriter.close(false);
                throw th2;
            }
        } catch (Throwable th3) {
            r4VarOpenReader.close();
            throw th3;
        }
    }

    @Override // d1.e
    public boolean isEmpty() {
        return this.f80459c == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<d1.i> iterator() {
        return new n1(this, 0, this.f80459c);
    }

    public final r4 openReader() {
        if (this.f80464i) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f80462g++;
        return new r4(this);
    }

    public final v4 openWriter() {
        if (this.f80464i) {
            d0.composeImmediateRuntimeError("Cannot start a writer when another writer is pending");
        }
        if (this.f80462g > 0) {
            d0.composeImmediateRuntimeError("Cannot start a writer when a reader is pending");
        }
        this.f80464i = true;
        this.f80465j++;
        return new v4(this);
    }

    public final boolean ownsAnchor(b bVar) {
        int iA;
        return bVar.getValid() && (iA = u4.a(this.f80466k, bVar.getLocation$runtime(), this.f80459c)) >= 0 && kotlin.jvm.internal.e0.areEqual(this.f80466k.get(iA), bVar);
    }

    public final <T> T read(kv.l lVar) {
        r4 r4VarOpenReader = openReader();
        try {
            return (T) lVar.invoke(r4VarOpenReader);
        } finally {
            kotlin.jvm.internal.b0.finallyStart(1);
            r4VarOpenReader.close();
            kotlin.jvm.internal.b0.finallyEnd(1);
        }
    }

    public final void setAnchors$runtime(ArrayList<b> arrayList) {
        this.f80466k = arrayList;
    }

    public final void setCalledByMap$runtime(z.j0 j0Var) {
        this.f80468m = j0Var;
    }

    public final void setSourceInformationMap$runtime(HashMap<b, q1> map) {
        this.f80467l = map;
    }

    public final void setTo$runtime(int[] iArr, int i10, Object[] objArr, int i11, ArrayList<b> arrayList, HashMap<b, q1> map, z.j0 j0Var) {
        this.f80458b = iArr;
        this.f80459c = i10;
        this.f80460e = objArr;
        this.f80461f = i11;
        this.f80466k = arrayList;
        this.f80467l = map;
        this.f80468m = j0Var;
    }

    public final void setVersion$runtime(int i10) {
        this.f80465j = i10;
    }

    public final Object slot$runtime(int i10, int i11) {
        int iAccess$slotAnchor = u4.access$slotAnchor(this.f80458b, i10);
        int i12 = i10 + 1;
        return (i11 < 0 || i11 >= (i12 < this.f80459c ? this.f80458b[(i12 * 5) + 4] : this.f80460e.length) - iAccess$slotAnchor) ? v.f80515a.getEmpty() : this.f80460e[iAccess$slotAnchor + i11];
    }

    public final List<Object> slotsOf$runtime(int i10) {
        int[] iArr = this.f80458b;
        int i11 = iArr[(i10 * 5) + 4];
        int i12 = i10 + 1;
        return uu.k0.toList(this.f80460e).subList(i11, i12 < this.f80459c ? iArr[(i12 * 5) + 4] : this.f80460e.length);
    }

    public final q1 sourceInformationOf(int i10) {
        int i11;
        HashMap map = this.f80467l;
        if (map != null) {
            if (this.f80464i) {
                d0.composeImmediateRuntimeError("use active SlotWriter to crate an anchor for location instead");
            }
            b bVarAccess$find = (i10 < 0 || i10 >= (i11 = this.f80459c)) ? null : u4.access$find(this.f80466k, i10, i11);
            if (bVarAccess$find != null) {
                return (q1) map.get(bVarAccess$find);
            }
        }
        return null;
    }

    public final String toDebugString() {
        if (this.f80464i) {
            return toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(toString());
        sb2.append('\n');
        int i10 = this.f80459c;
        if (i10 > 0) {
            int iA = 0;
            while (iA < i10) {
                iA += a(sb2, iA, 0);
            }
        } else {
            sb2.append("<EMPTY>");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void verifyWellFormed() {
        int i10;
        int i11;
        kotlin.jvm.internal.z0 z0Var = new kotlin.jvm.internal.z0();
        int i12 = -1;
        if (this.f80459c > 0) {
            while (true) {
                i10 = z0Var.f71866b;
                i11 = this.f80459c;
                if (i10 >= i11) {
                    break;
                } else {
                    e(z0Var, this, -1, u4.access$groupSize(this.f80458b, i10) + i10);
                }
            }
            if (!(i10 == i11)) {
                a3.throwIllegalStateException("Incomplete group at root " + z0Var.f71866b + " expected to be " + this.f80459c);
            }
        }
        int length = this.f80460e.length;
        for (int i13 = this.f80461f; i13 < length; i13++) {
            if (!(this.f80460e[i13] == null)) {
                a3.throwIllegalStateException("Non null value in the slot gap at index " + i13);
            }
        }
        ArrayList arrayList = this.f80466k;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            int indexFor = ((b) arrayList.get(i14)).toIndexFor(this);
            if (!(indexFor >= 0 && indexFor <= this.f80459c)) {
                a3.throwIllegalArgumentException("Invalid anchor, location out of bound");
            }
            if (!(i12 < indexFor)) {
                a3.throwIllegalArgumentException("Anchor is out of order");
            }
            i14++;
            i12 = indexFor;
        }
        HashMap map = this.f80467l;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                b bVar = (b) entry.getKey();
                q1 q1Var = (q1) entry.getValue();
                if (!bVar.getValid()) {
                    a3.throwIllegalArgumentException("Source map contains invalid anchor");
                }
                if (!ownsAnchor(bVar)) {
                    a3.throwIllegalArgumentException("Source map anchor is not owned by the slot table");
                }
                f(this, q1Var);
            }
        }
    }

    public final <T> T write(kv.l lVar) {
        v4 v4VarOpenWriter = openWriter();
        try {
            T t10 = (T) lVar.invoke(v4VarOpenWriter);
            kotlin.jvm.internal.b0.finallyStart(1);
            v4VarOpenWriter.close(true);
            kotlin.jvm.internal.b0.finallyEnd(1);
            return t10;
        } catch (Throwable th2) {
            kotlin.jvm.internal.b0.finallyStart(1);
            v4VarOpenWriter.close(false);
            kotlin.jvm.internal.b0.finallyEnd(1);
            throw th2;
        }
    }

    public static final int e(kotlin.jvm.internal.z0 z0Var, s4 s4Var, int i10, int i11) {
        int i12 = z0Var.f71866b;
        int i13 = i12 + 1;
        z0Var.f71866b = i13;
        int i14 = i12 * 5;
        int i15 = s4Var.f80458b[i14 + 2];
        if (i15 != i10) {
            StringBuilder sbF = w0.i.f(i12, i10, "Invalid parent index detected at ", ", expected parent index to be ", " found ");
            sbF.append(i15);
            a3.throwIllegalStateException(sbF.toString());
        }
        int iAccess$groupSize = u4.access$groupSize(s4Var.f80458b, i12) + i12;
        if (iAccess$groupSize > s4Var.f80459c) {
            a3.throwIllegalStateException("A group extends past the end of the table at " + i12);
        }
        if (iAccess$groupSize > i11) {
            a3.throwIllegalStateException("A group extends past its parent group at " + i12);
        }
        int[] iArr = s4Var.f80458b;
        int i16 = i14 + 4;
        int i17 = iArr[i16];
        int i18 = i12 >= s4Var.f80459c - 1 ? s4Var.f80461f : iArr[(i13 * 5) + 4];
        if (i18 > s4Var.f80460e.length) {
            a3.throwIllegalStateException("Slots for " + i12 + " extend past the end of the slot table");
        }
        if (i17 > i18) {
            a3.throwIllegalStateException("Invalid data anchor at " + i12);
        }
        if (u4.access$slotAnchor(s4Var.f80458b, i12) > i18) {
            a3.throwIllegalStateException("Slots start out of range at " + i12);
        }
        int i19 = i14 + 1;
        int i20 = s4Var.f80458b[i19];
        int iE = 0;
        if (i18 - i17 < ((i20 & 1073741824) != 0 ? 1 : 0) + ((536870912 & i20) != 0 ? 1 : 0) + ((i20 & 268435456) != 0 ? 1 : 0)) {
            a3.throwIllegalStateException("Not enough slots added for group " + i12);
        }
        int[] iArr2 = s4Var.f80458b;
        boolean z10 = (iArr2[i19] & 1073741824) != 0;
        if (z10 && s4Var.f80460e[iArr2[i16]] == null) {
            a3.throwIllegalStateException("No node recorded for a node group at " + i12);
        }
        while (z0Var.f71866b < iAccess$groupSize) {
            iE += e(z0Var, s4Var, i12, iAccess$groupSize);
        }
        int[] iArr3 = s4Var.f80458b;
        int i21 = iArr3[i19] & 67108863;
        int iAccess$groupSize2 = u4.access$groupSize(iArr3, i12);
        String str = gjnZrsdA.QZzTnHYWUyAC;
        if (i21 != iE) {
            StringBuilder sbF2 = w0.i.f(i12, i21, "Incorrect node count detected at ", str, ", received ");
            sbF2.append(iE);
            a3.throwIllegalStateException(sbF2.toString());
        }
        int i22 = z0Var.f71866b - i12;
        if (iAccess$groupSize2 != i22) {
            StringBuilder sbF3 = w0.i.f(i12, iAccess$groupSize2, "Incorrect slot count detected at ", str, ", received ");
            sbF3.append(i22);
            a3.throwIllegalStateException(sbF3.toString());
        }
        int[] iArr4 = s4Var.f80458b;
        if ((iArr4[i19] & 201326592) != 0 && i12 > 0 && (iArr4[(i10 * 5) + 1] & 67108864) == 0) {
            a3.throwIllegalStateException("Expected group " + i10 + " to record it contains a mark because " + i12 + " does");
        }
        if (z10) {
            return 1;
        }
        return iE;
    }

    public final void close$runtime(v4 v4Var, int[] iArr, int i10, Object[] objArr, int i11, ArrayList<b> arrayList, HashMap<b, q1> map, z.j0 j0Var) {
        if (v4Var.getTable$runtime() != this || !this.f80464i) {
            a3.throwIllegalArgumentException("Unexpected writer close()");
        }
        this.f80464i = false;
        setTo$runtime(iArr, i10, objArr, i11, arrayList, map, j0Var);
    }
}
