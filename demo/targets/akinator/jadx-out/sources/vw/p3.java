package vw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class p3 extends Exception {
    public p3(String str, Object... objArr) {
        super(String.format(str, objArr));
    }

    public p3(Throwable th2, String str, Object... objArr) {
        super(String.format(str, objArr), th2);
    }
}
