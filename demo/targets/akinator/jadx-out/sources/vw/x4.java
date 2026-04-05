package vw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class x4 {

    /* renamed from: a, reason: collision with root package name */
    public final w4 f90225a = new w4();

    /* renamed from: b, reason: collision with root package name */
    public final w4 f90226b = new w4();

    /* renamed from: c, reason: collision with root package name */
    public final w4 f90227c = new w4();

    /* renamed from: d, reason: collision with root package name */
    public final ww.b f90228d;

    /* renamed from: e, reason: collision with root package name */
    public int f90229e;

    public x4(ww.b bVar) {
        this.f90228d = bVar;
    }

    public final void a() {
        w4 w4Var;
        while (true) {
            int i10 = this.f90229e;
            w4 w4Var2 = this.f90225a;
            int i11 = w4Var2.f90201b;
            if (i10 >= i11) {
                return;
            }
            char[] cArr = w4Var2.f90200a;
            int i12 = i10 + 1;
            this.f90229e = i12;
            char c10 = cArr[i10];
            w4 w4Var3 = this.f90227c;
            if (c10 == '$' && i12 < i11) {
                this.f90229e = i10 + 2;
                if (cArr[i12] == '{') {
                    while (true) {
                        int i13 = this.f90229e;
                        int i14 = w4Var2.f90201b;
                        w4Var = this.f90226b;
                        if (i13 >= i14) {
                            break;
                        }
                        char[] cArr2 = w4Var2.f90200a;
                        this.f90229e = i13 + 1;
                        char c11 = cArr2[i13];
                        if (c11 == '}') {
                            if (w4Var.length() > 0) {
                                String string = w4Var.toString();
                                String strReplace = this.f90228d.replace(string);
                                if (strReplace == null) {
                                    w4Var3.append("${");
                                    w4Var3.append(string);
                                    w4Var3.append("}");
                                } else {
                                    w4Var3.append(strReplace);
                                }
                            }
                            w4Var.clear();
                        } else {
                            w4Var.append(c11);
                        }
                    }
                    if (w4Var.length() > 0) {
                        w4Var3.append("${");
                        w4Var3.append(w4Var);
                    }
                } else {
                    this.f90229e = i10 + 1;
                }
            }
            w4Var3.append(c10);
        }
    }

    public void clear() {
        this.f90226b.clear();
        this.f90227c.clear();
        this.f90225a.clear();
        this.f90229e = 0;
    }

    public String process(String str) {
        if (str.indexOf(36) < 0) {
            return str;
        }
        try {
            this.f90225a.append(str);
            a();
            return this.f90227c.toString();
        } finally {
            clear();
        }
    }
}
