package v6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class r {
    public static final n systemIdInfo(s generationalId, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(generationalId, "generationalId");
        return new n(generationalId.getWorkSpecId(), generationalId.getGeneration(), i10);
    }
}
