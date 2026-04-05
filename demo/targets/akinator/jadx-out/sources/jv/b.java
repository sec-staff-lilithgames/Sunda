package jv;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class b extends Error {
    public b() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public b(String str) {
        super(str);
    }

    public b(String str, Throwable th2) {
        super(str, th2);
    }

    public b(Throwable th2) {
        super(th2);
    }
}
