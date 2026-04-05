package n6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a0 {
    public static a0 failure() {
        return new x();
    }

    public static a0 retry() {
        return new y();
    }

    public static a0 success() {
        return new z();
    }

    public abstract androidx.work.b getOutputData();

    public static a0 failure(androidx.work.b bVar) {
        return new x(bVar);
    }

    public static a0 success(androidx.work.b bVar) {
        return new z(bVar);
    }
}
