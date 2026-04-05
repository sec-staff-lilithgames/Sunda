package ku;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public static final d f72017b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ g[] f72018c;

    /* JADX INFO: Fake field, exist only in values array */
    g EF0;

    static {
        g gVar = new g() { // from class: ku.a
            @Override // ku.g, java.lang.Runnable
            public void run() {
            }
        };
        g gVar2 = new g() { // from class: ku.b
            @Override // ku.g, java.lang.Runnable
            public void run() {
                Thread.yield();
            }
        };
        g gVar3 = new g() { // from class: ku.c
            @Override // ku.g, java.lang.Runnable
            public void run() throws InterruptedException {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e10) {
                    throw new RuntimeException(e10);
                }
            }
        };
        d dVar = new d();
        f72017b = dVar;
        f72018c = new g[]{gVar, gVar2, gVar3, dVar, new g() { // from class: ku.e
            @Override // ku.g, java.lang.Runnable
            public void run() throws InterruptedException {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }, new g() { // from class: ku.f
            @Override // ku.g, java.lang.Runnable
            public void run() throws InterruptedException {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f72018c.clone();
    }

    public abstract void run();
}
