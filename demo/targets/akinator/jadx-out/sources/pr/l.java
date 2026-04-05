package pr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface l extends Runnable {
    void onRun() throws Throwable;

    void onThrows(Throwable th2) throws Throwable;

    @Override // java.lang.Runnable
    default void run() {
        try {
            onRun();
        } catch (Throwable th2) {
            try {
                onThrows(th2);
            } catch (Throwable unused) {
            }
        }
    }
}
