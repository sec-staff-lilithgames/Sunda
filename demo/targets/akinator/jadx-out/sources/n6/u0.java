package n6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class u0 {
    public static final <T> T traced(t0 t0Var, String label, kv.a block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(t0Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(label, "label");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        d dVar = (d) t0Var;
        boolean zIsEnabled = dVar.isEnabled();
        if (zIsEnabled) {
            try {
                dVar.beginSection(label);
            } catch (Throwable th2) {
                kotlin.jvm.internal.b0.finallyStart(1);
                if (zIsEnabled) {
                    dVar.endSection();
                }
                kotlin.jvm.internal.b0.finallyEnd(1);
                throw th2;
            }
        }
        T t10 = (T) block.invoke();
        kotlin.jvm.internal.b0.finallyStart(1);
        if (zIsEnabled) {
            dVar.endSection();
        }
        kotlin.jvm.internal.b0.finallyEnd(1);
        return t10;
    }
}
