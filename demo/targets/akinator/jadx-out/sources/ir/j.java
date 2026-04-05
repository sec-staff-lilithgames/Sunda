package ir;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface j extends d {
    @Override // ir.d
    default void execute(Object obj) {
        try {
            onExecute(obj);
        } catch (Throwable th2) {
            try {
                onThrows(th2);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // ir.d
    /* bridge */ /* synthetic */ default boolean executeSafely(Object obj) {
        return super.executeSafely(obj);
    }

    void onExecute(Object obj) throws Throwable;

    default void onThrows(Throwable throwable) throws Throwable {
        e0.checkNotNullParameter(throwable, "throwable");
    }
}
