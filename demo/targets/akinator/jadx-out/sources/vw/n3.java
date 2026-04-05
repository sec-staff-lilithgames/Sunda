package vw;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class n3 implements o1 {

    /* renamed from: b, reason: collision with root package name */
    public final ax.b f90004b = new ax.b();

    /* renamed from: c, reason: collision with root package name */
    public final ax.b f90005c = new ax.b();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f90006e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f90007f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f90008g;

    /* renamed from: h, reason: collision with root package name */
    public final StringBuilder f90009h;

    /* renamed from: i, reason: collision with root package name */
    public final String f90010i;

    /* renamed from: j, reason: collision with root package name */
    public String f90011j;

    /* renamed from: k, reason: collision with root package name */
    public final yw.t0 f90012k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f90013l;

    /* renamed from: m, reason: collision with root package name */
    public final char[] f90014m;

    /* renamed from: n, reason: collision with root package name */
    public final int f90015n;

    /* renamed from: o, reason: collision with root package name */
    public final int f90016o;

    /* renamed from: p, reason: collision with root package name */
    public final int f90017p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b5  */
    /* JADX WARN: Type inference failed for: r16v2, types: [int] */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n3(java.lang.String r18, xw.f r19, yw.j r20) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vw.n3.<init>(java.lang.String, xw.f, yw.j):void");
    }

    public static boolean c(String str) {
        return str == null || str.length() == 0;
    }

    public final String a(String str, String str2) {
        String attribute = ((yw.l) this.f90012k).getAttribute(str2);
        return c(str) ? attribute : w0.i.d(str, "/@", attribute);
    }

    public final String b(String str, String str2) {
        String element = ((yw.l) this.f90012k).getElement(str2);
        return c(element) ? str : c(str) ? element : e3.g.k(str, "/", element, "[1]");
    }

    @Override // vw.o1
    public String getAttribute(String str) {
        if (c(this.f90010i)) {
            return ((yw.l) this.f90012k).getAttribute(str);
        }
        ax.b bVar = this.f90004b;
        String strA = (String) bVar.fetch(str);
        if (strA == null && (strA = a(this.f90010i, str)) != null) {
            bVar.cache(str, strA);
        }
        return strA;
    }

    @Override // vw.o1
    public String getElement(String str) {
        if (c(this.f90010i)) {
            return ((yw.l) this.f90012k).getElement(str);
        }
        ax.b bVar = this.f90005c;
        String strB = (String) bVar.fetch(str);
        if (strB == null && (strB = b(this.f90010i, str)) != null) {
            bVar.cache(str, strB);
        }
        return strB;
    }

    @Override // vw.o1
    public String getFirst() {
        return (String) this.f90008g.get(0);
    }

    @Override // vw.o1
    public int getIndex() {
        return ((Integer) this.f90006e.get(0)).intValue();
    }

    @Override // vw.o1
    public String getLast() {
        return (String) j1.o2.e(1, this.f90008g);
    }

    @Override // vw.o1
    public String getPath() {
        return this.f90010i;
    }

    @Override // vw.o1
    public String getPrefix() {
        return (String) this.f90007f.get(0);
    }

    @Override // vw.o1
    public boolean isAttribute() {
        return this.f90013l;
    }

    @Override // vw.o1
    public boolean isEmpty() {
        return c(this.f90010i);
    }

    @Override // vw.o1
    public boolean isPath() {
        return this.f90008g.size() > 1;
    }

    @Override // java.lang.Iterable
    public Iterator<String> iterator() {
        return this.f90008g.iterator();
    }

    @Override // vw.o1
    public String toString() {
        int i10 = this.f90017p;
        int i11 = this.f90016o;
        int i12 = i10 - i11;
        if (this.f90011j == null) {
            this.f90011j = new String(this.f90014m, i11, i12);
        }
        return this.f90011j;
    }

    @Override // vw.o1
    public o1 getPath(int i10) {
        return getPath(i10, 0);
    }

    @Override // vw.o1
    public o1 getPath(int i10, int i11) {
        int size = (this.f90008g.size() - 1) - i11;
        if (size >= i10) {
            return new a(i10, size);
        }
        return new a(i10, i10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements o1 {

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f90018b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public String f90019c;

        /* renamed from: e, reason: collision with root package name */
        public String f90020e;

        /* renamed from: f, reason: collision with root package name */
        public final int f90021f;

        /* renamed from: g, reason: collision with root package name */
        public final int f90022g;

        public a(int i10, int i11) {
            this.f90021f = i10;
            this.f90022g = i11;
        }

        @Override // vw.o1
        public String getAttribute(String str) {
            String path = getPath();
            return path != null ? n3.this.a(path, str) : str;
        }

        @Override // vw.o1
        public String getElement(String str) {
            String path = getPath();
            return path != null ? n3.this.b(path, str) : str;
        }

        @Override // vw.o1
        public String getFirst() {
            return (String) n3.this.f90008g.get(this.f90021f);
        }

        @Override // vw.o1
        public int getIndex() {
            return ((Integer) n3.this.f90006e.get(this.f90021f)).intValue();
        }

        @Override // vw.o1
        public String getLast() {
            return (String) n3.this.f90008g.get(this.f90022g);
        }

        @Override // vw.o1
        public String getPath() {
            n3 n3Var;
            if (this.f90019c == null) {
                int i10 = 0;
                int iIndexOf = 0;
                while (true) {
                    int i11 = this.f90021f;
                    n3Var = n3.this;
                    if (i10 >= i11) {
                        break;
                    }
                    iIndexOf = n3Var.f90010i.indexOf(47, iIndexOf + 1);
                    i10++;
                }
                int iIndexOf2 = iIndexOf;
                while (i10 <= this.f90022g) {
                    iIndexOf2 = n3Var.f90010i.indexOf(47, iIndexOf2 + 1);
                    if (iIndexOf2 == -1) {
                        iIndexOf2 = n3Var.f90010i.length();
                    }
                    i10++;
                }
                this.f90019c = n3Var.f90010i.substring(iIndexOf + 1, iIndexOf2);
            }
            return this.f90019c;
        }

        @Override // vw.o1
        public String getPrefix() {
            return (String) n3.this.f90007f.get(this.f90021f);
        }

        @Override // vw.o1
        public boolean isAttribute() {
            n3 n3Var = n3.this;
            if (n3Var.f90013l) {
                return this.f90022g >= n3Var.f90008g.size() - 1;
            }
            return false;
        }

        @Override // vw.o1
        public boolean isEmpty() {
            return this.f90021f == this.f90022g;
        }

        @Override // vw.o1
        public boolean isPath() {
            return this.f90022g - this.f90021f >= 1;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            ArrayList arrayList = this.f90018b;
            if (arrayList.isEmpty()) {
                for (int i10 = this.f90021f; i10 <= this.f90022g; i10++) {
                    String str = (String) n3.this.f90008g.get(i10);
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
            }
            return arrayList.iterator();
        }

        @Override // vw.o1
        public String toString() {
            if (this.f90020e == null) {
                n3 n3Var = n3.this;
                int i10 = n3Var.f90016o;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (i11 > this.f90022g) {
                        break;
                    }
                    if (i10 >= n3Var.f90015n) {
                        i10++;
                        break;
                    }
                    int i13 = i10 + 1;
                    if (n3Var.f90014m[i10] == '/' && (i11 = i11 + 1) == this.f90021f) {
                        i10 = i13;
                        i12 = i10;
                    } else {
                        i10 = i13;
                    }
                }
                this.f90020e = new String(n3Var.f90014m, i12, (i10 - 1) - i12);
            }
            return this.f90020e;
        }

        @Override // vw.o1
        public o1 getPath(int i10) {
            return getPath(i10, 0);
        }

        @Override // vw.o1
        public o1 getPath(int i10, int i11) {
            return n3.this.new a(this.f90021f + i10, this.f90022g - i11);
        }
    }
}
