package ki;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class h2 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public static a create(String str, String str2, String str3, String str4, int i10, ei.e eVar) {
            return new c2(str, str2, str3, str4, i10, eVar);
        }

        public abstract String appIdentifier();

        public abstract int deliveryMechanism();

        public abstract ei.e developmentPlatformProvider();

        public abstract String installUuid();

        public abstract String versionCode();

        public abstract String versionName();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class b {
        public static b create(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
            return new d2(i10, str, i11, j10, j11, z10, i12, str2, str3);
        }

        public abstract int arch();

        public abstract int availableProcessors();

        public abstract long diskSpace();

        public abstract boolean isEmulator();

        public abstract String manufacturer();

        public abstract String model();

        public abstract String modelClass();

        public abstract int state();

        public abstract long totalRam();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class c {
        public static c create(String str, String str2, boolean z10) {
            return new e2(str, str2, z10);
        }

        public abstract boolean isRooted();

        public abstract String osCodeName();

        public abstract String osRelease();
    }

    public static h2 create(a aVar, c cVar, b bVar) {
        return new b2(aVar, cVar, bVar);
    }

    public abstract a appData();

    public abstract b deviceData();

    public abstract c osData();
}
