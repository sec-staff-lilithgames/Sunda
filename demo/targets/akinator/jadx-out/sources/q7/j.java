package q7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class j {
    public static final void log(v vVar, String str, int i10, kv.a aVar) {
        if (vVar.getLevel() <= i10) {
            vVar.a();
        }
    }

    public static final void log(v vVar, String str, Throwable th2) {
        if (vVar.getLevel() <= 6) {
            vVar.a();
        }
    }
}
