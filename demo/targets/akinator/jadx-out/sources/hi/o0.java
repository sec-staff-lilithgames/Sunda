package hi;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class o0 {
    public static o0 createWithoutFid(String str) {
        return new c(str, null, null);
    }

    public abstract String getCrashlyticsInstallId();

    public abstract String getFirebaseAuthenticationToken();

    public abstract String getFirebaseInstallationId();
}
