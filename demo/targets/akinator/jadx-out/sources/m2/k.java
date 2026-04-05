package m2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class k {
    public static void a(String str, char[] cArr, int i10) {
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            cArr[i10 + i11] = str.charAt(i11);
        }
    }

    public static final void access$toCharArray(String str, char[] cArr, int i10, int i11, int i12) {
        for (int i13 = i11; i13 < i12; i13++) {
            cArr[(i10 + i13) - i11] = str.charAt(i13);
        }
    }
}
