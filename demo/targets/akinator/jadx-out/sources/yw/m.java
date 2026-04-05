package yw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final a f96726a;

    /* renamed from: b, reason: collision with root package name */
    public final int f96727b;

    /* renamed from: c, reason: collision with root package name */
    public int f96728c;

    /* renamed from: d, reason: collision with root package name */
    public int f96729d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String[] f96730a;

        /* renamed from: b, reason: collision with root package name */
        public int f96731b;

        public a(int i10) {
            this.f96730a = new String[i10];
        }

        public String get(int i10) {
            String[] strArr = this.f96730a;
            if (i10 < strArr.length) {
                return strArr[i10];
            }
            return null;
        }

        public void set(int i10, String str) {
            if (i10 >= this.f96730a.length) {
                String[] strArr = new String[i10 * 2];
                int i11 = 0;
                while (true) {
                    String[] strArr2 = this.f96730a;
                    if (i11 >= strArr2.length) {
                        break;
                    }
                    strArr[i11] = strArr2[i11];
                    i11++;
                }
                this.f96730a = strArr;
            }
            if (i10 > this.f96731b) {
                this.f96731b = i10;
            }
            this.f96730a[i10] = str;
        }

        public int size() {
            return this.f96731b;
        }
    }

    public m() {
        this(new j());
    }

    public final String a(int i10) {
        if (this.f96727b <= 0) {
            return "";
        }
        a aVar = this.f96726a;
        String str = aVar.get(i10);
        if (str == null) {
            int i11 = this.f96728c;
            char[] cArr = new char[i11 + 1];
            if (i11 > 0) {
                cArr[0] = '\n';
                for (int i12 = 1; i12 <= this.f96728c; i12++) {
                    cArr[i12] = ' ';
                }
                str = new String(cArr);
            } else {
                str = "\n";
            }
            aVar.set(i10, str);
        }
        return aVar.size() > 0 ? str : "";
    }

    public String pop() {
        int i10 = this.f96729d - 1;
        this.f96729d = i10;
        String strA = a(i10);
        int i11 = this.f96727b;
        if (i11 > 0) {
            this.f96728c -= i11;
        }
        return strA;
    }

    public String push() {
        int i10 = this.f96729d;
        this.f96729d = i10 + 1;
        String strA = a(i10);
        int i11 = this.f96727b;
        if (i11 > 0) {
            this.f96728c += i11;
        }
        return strA;
    }

    public String top() {
        return a(this.f96729d);
    }

    public m(j jVar) {
        this.f96727b = jVar.getIndent();
        this.f96726a = new a(16);
    }
}
