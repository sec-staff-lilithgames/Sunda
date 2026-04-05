package vw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class w4 {

    /* renamed from: a, reason: collision with root package name */
    public char[] f90200a;

    /* renamed from: b, reason: collision with root package name */
    public int f90201b;

    public w4() {
        this(16);
    }

    public final void a(int i10) {
        char[] cArr = this.f90200a;
        if (cArr.length < i10) {
            char[] cArr2 = new char[Math.max(i10, cArr.length * 2)];
            System.arraycopy(this.f90200a, 0, cArr2, 0, this.f90201b);
            this.f90200a = cArr2;
        }
    }

    public void append(char c10) {
        a(this.f90201b + 1);
        char[] cArr = this.f90200a;
        int i10 = this.f90201b;
        this.f90201b = i10 + 1;
        cArr[i10] = c10;
    }

    public void clear() {
        this.f90201b = 0;
    }

    public int length() {
        return this.f90201b;
    }

    public String toString() {
        return new String(this.f90200a, 0, this.f90201b);
    }

    public w4(int i10) {
        this.f90200a = new char[i10];
    }

    public void append(String str) {
        a(str.length() + this.f90201b);
        str.getChars(0, str.length(), this.f90200a, this.f90201b);
        this.f90201b = str.length() + this.f90201b;
    }

    public void append(w4 w4Var) {
        append(w4Var.f90200a, 0, w4Var.f90201b);
    }

    public void append(char[] cArr, int i10, int i11) {
        a(this.f90201b + i11);
        System.arraycopy(cArr, i10, this.f90200a, this.f90201b, i11);
        this.f90201b += i11;
    }

    public void append(String str, int i10, int i11) {
        a(this.f90201b + i11);
        str.getChars(i10, i11, this.f90200a, this.f90201b);
        this.f90201b += i11;
    }

    public void append(w4 w4Var, int i10, int i11) {
        append(w4Var.f90200a, i10, i11);
    }
}
