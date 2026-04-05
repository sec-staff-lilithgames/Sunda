package dq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface b0 extends ir.j {
    @Override // ir.j, ir.d
    /* bridge */ /* synthetic */ default void execute(Object obj) {
        super.execute(obj);
    }

    @Override // ir.j, ir.d
    /* bridge */ /* synthetic */ default boolean executeSafely(Object obj) {
        return super.executeSafely(obj);
    }

    @Override // ir.j
    /* synthetic */ void onExecute(Object obj) throws Throwable;

    @Override // ir.j
    default void onThrows(Throwable th2) {
        d0.b(th2);
    }
}
