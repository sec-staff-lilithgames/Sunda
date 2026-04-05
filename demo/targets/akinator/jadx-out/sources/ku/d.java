package ku;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public enum d extends g {
    public d() {
        super("SLEEP_10MS", 3);
    }

    @Override // ku.g, java.lang.Runnable
    public void run() throws InterruptedException {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e10) {
            throw new RuntimeException(e10);
        }
    }
}
