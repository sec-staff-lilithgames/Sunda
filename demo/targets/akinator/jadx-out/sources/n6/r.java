package n6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class r {
    /* renamed from: createInputMerger */
    public abstract q mo5746createInputMerger(String str);

    public final q createInputMergerWithDefaultFallback(String className) {
        kotlin.jvm.internal.e0.checkNotNullParameter(className, "className");
        q qVarMo5746createInputMerger = mo5746createInputMerger(className);
        return qVarMo5746createInputMerger == null ? s.fromClassName(className) : qVarMo5746createInputMerger;
    }
}
