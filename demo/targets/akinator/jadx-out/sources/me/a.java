package me;

import com.google.android.exoplayer2.util.v0;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f74342a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: me.a$a, reason: collision with other inner class name */
    public static final class C0748a extends a {

        /* renamed from: b, reason: collision with root package name */
        public final long f74343b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f74344c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f74345d;

        public C0748a(int i10, long j10) {
            super(i10);
            this.f74343b = j10;
            this.f74344c = new ArrayList();
            this.f74345d = new ArrayList();
        }

        public void add(b bVar) {
            this.f74344c.add(bVar);
        }

        public int getChildAtomOfTypeCount(int i10) {
            ArrayList arrayList = this.f74344c;
            int size = arrayList.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                if (((b) arrayList.get(i12)).f74342a == i10) {
                    i11++;
                }
            }
            ArrayList arrayList2 = this.f74345d;
            int size2 = arrayList2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                if (((C0748a) arrayList2.get(i13)).f74342a == i10) {
                    i11++;
                }
            }
            return i11;
        }

        public C0748a getContainerAtomOfType(int i10) {
            ArrayList arrayList = this.f74345d;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0748a c0748a = (C0748a) arrayList.get(i11);
                if (c0748a.f74342a == i10) {
                    return c0748a;
                }
            }
            return null;
        }

        public b getLeafAtomOfType(int i10) {
            ArrayList arrayList = this.f74344c;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = (b) arrayList.get(i11);
                if (bVar.f74342a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // me.a
        public String toString() {
            return a.getAtomTypeString(this.f74342a) + " leaves: " + Arrays.toString(this.f74344c.toArray()) + " containers: " + Arrays.toString(this.f74345d.toArray());
        }

        public void add(C0748a c0748a) {
            this.f74345d.add(c0748a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends a {

        /* renamed from: b, reason: collision with root package name */
        public final v0 f74346b;

        public b(int i10, v0 v0Var) {
            super(i10);
            this.f74346b = v0Var;
        }
    }

    public a(int i10) {
        this.f74342a = i10;
    }

    public static String getAtomTypeString(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public static int parseFullAtomFlags(int i10) {
        return i10 & 16777215;
    }

    public static int parseFullAtomVersion(int i10) {
        return (i10 >> 24) & 255;
    }

    public String toString() {
        return getAtomTypeString(this.f74342a);
    }
}
