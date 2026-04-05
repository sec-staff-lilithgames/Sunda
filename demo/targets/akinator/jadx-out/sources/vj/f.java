package vj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class f {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public abstract f build();

        public abstract a setAuthToken(String str);

        public abstract a setExpiresInSecs(long j10);

        public abstract a setFirebaseInstallationId(String str);

        public abstract a setFisError(String str);

        public abstract a setRefreshToken(String str);

        public abstract a setRegistrationStatus(d dVar);

        public abstract a setTokenCreationEpochInSecs(long j10);
    }

    static {
        builder().build();
    }

    public static a builder() {
        return new vj.a().setTokenCreationEpochInSecs(0L).setRegistrationStatus(d.f89297b).setExpiresInSecs(0L);
    }

    public abstract String getAuthToken();

    public abstract long getExpiresInSecs();

    public abstract String getFirebaseInstallationId();

    public abstract String getFisError();

    public abstract String getRefreshToken();

    public abstract d getRegistrationStatus();

    public abstract long getTokenCreationEpochInSecs();

    public boolean isErrored() {
        return getRegistrationStatus() == d.f89301g;
    }

    public boolean isNotGenerated() {
        return getRegistrationStatus() == d.f89298c || getRegistrationStatus() == d.f89297b;
    }

    public boolean isRegistered() {
        return getRegistrationStatus() == d.f89300f;
    }

    public boolean isUnregistered() {
        return getRegistrationStatus() == d.f89299e;
    }

    public boolean shouldAttemptMigration() {
        return getRegistrationStatus() == d.f89297b;
    }

    public abstract a toBuilder();

    public f withAuthToken(String str, long j10, long j11) {
        return toBuilder().setAuthToken(str).setExpiresInSecs(j10).setTokenCreationEpochInSecs(j11).build();
    }

    public f withClearedAuthToken() {
        return toBuilder().setAuthToken(null).build();
    }

    public f withFisError(String str) {
        return toBuilder().setFisError(str).setRegistrationStatus(d.f89301g).build();
    }

    public f withNoGeneratedFid() {
        return toBuilder().setRegistrationStatus(d.f89298c).build();
    }

    public f withRegisteredFid(String str, String str2, long j10, String str3, long j11) {
        return toBuilder().setFirebaseInstallationId(str).setRegistrationStatus(d.f89300f).setAuthToken(str3).setRefreshToken(str2).setExpiresInSecs(j11).setTokenCreationEpochInSecs(j10).build();
    }

    public f withUnregisteredFid(String str) {
        return toBuilder().setFirebaseInstallationId(str).setRegistrationStatus(d.f89299e).build();
    }
}
