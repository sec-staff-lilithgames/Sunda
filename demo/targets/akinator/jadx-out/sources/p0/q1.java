package p0;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f80401a;

    /* renamed from: b, reason: collision with root package name */
    public String f80402b;

    /* renamed from: c, reason: collision with root package name */
    public final int f80403c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f80404d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f80405e;

    /* renamed from: f, reason: collision with root package name */
    public int f80406f;

    public q1(int i10, String str, int i11) {
        this.f80401a = i10;
        this.f80402b = str;
        this.f80403c = i11;
    }

    public final boolean a(b bVar) {
        ArrayList arrayList = this.f80404d;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = arrayList.get(i10);
                if (kotlin.jvm.internal.e0.areEqual(obj, bVar)) {
                    return true;
                }
                if ((obj instanceof q1) && ((q1) obj).a(bVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void addGroupAfter(v4 v4Var, int i10, int i11) {
        b bVarTryAnchor$runtime;
        ArrayList arrayList = this.f80404d;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f80404d = arrayList;
        }
        int i12 = 0;
        if (i10 >= 0 && (bVarTryAnchor$runtime = v4Var.tryAnchor$runtime(i10)) != null) {
            int size = arrayList.size();
            while (true) {
                if (i12 >= size) {
                    i12 = -1;
                    break;
                }
                Object obj = arrayList.get(i12);
                if (kotlin.jvm.internal.e0.areEqual(obj, bVarTryAnchor$runtime) || ((obj instanceof q1) && ((q1) obj).a(bVarTryAnchor$runtime))) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        arrayList.add(i12, v4Var.anchor(i11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    public final q1 b() {
        q1 q1Var;
        q1 q1VarB;
        ArrayList arrayList = this.f80404d;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                q1Var = arrayList.get(size);
                if ((q1Var instanceof q1) && !((q1) q1Var).f80405e) {
                    break;
                }
            }
            q1Var = 0;
        } else {
            q1Var = 0;
        }
        q1 q1Var2 = q1Var instanceof q1 ? q1Var : null;
        return (q1Var2 == null || (q1VarB = q1Var2.b()) == null) ? this : q1VarB;
    }

    public final void close(int i10) {
        this.f80405e = true;
        this.f80406f = i10;
    }

    public final void endGrouplessCall(int i10) {
        b().close(i10);
    }

    public final boolean getClosed() {
        return this.f80405e;
    }

    public final int getDataEndOffset() {
        return this.f80406f;
    }

    public final int getDataStartOffset() {
        return this.f80403c;
    }

    public final ArrayList<Object> getGroups() {
        return this.f80404d;
    }

    public final int getKey() {
        return this.f80401a;
    }

    public final String getSourceInformation() {
        return this.f80402b;
    }

    public final boolean removeAnchor(b bVar) {
        ArrayList arrayList = this.f80404d;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof b) {
                    if (kotlin.jvm.internal.e0.areEqual(obj, bVar)) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof q1) && !((q1) obj).removeAnchor(bVar)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.f80404d = null;
                return false;
            }
        }
        return true;
    }

    public final void reportGroup(v4 v4Var, int i10) {
        q1 q1VarB = b();
        b bVarAnchor = v4Var.anchor(i10);
        ArrayList arrayList = q1VarB.f80404d;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        q1VarB.f80404d = arrayList;
        arrayList.add(bVarAnchor);
    }

    public final void setClosed(boolean z10) {
        this.f80405e = z10;
    }

    public final void setDataEndOffset(int i10) {
        this.f80406f = i10;
    }

    public final void setGroups(ArrayList<Object> arrayList) {
        this.f80404d = arrayList;
    }

    public final void setSourceInformation(String str) {
        this.f80402b = str;
    }

    public final void startGrouplessCall(int i10, String str, int i11) {
        q1 q1VarB = b();
        q1 q1Var = new q1(i10, str, i11);
        ArrayList arrayList = q1VarB.f80404d;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        q1VarB.f80404d = arrayList;
        arrayList.add(q1Var);
    }

    public final void reportGroup(s4 s4Var, int i10) {
        q1 q1VarB = b();
        b bVarAnchor = s4Var.anchor(i10);
        ArrayList arrayList = q1VarB.f80404d;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        q1VarB.f80404d = arrayList;
        arrayList.add(bVarAnchor);
    }
}
