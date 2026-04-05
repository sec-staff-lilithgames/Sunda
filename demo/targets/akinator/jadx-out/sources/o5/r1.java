package o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class r1 implements s1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f77701a;

    /* renamed from: b, reason: collision with root package name */
    public final String f77702b;

    /* renamed from: c, reason: collision with root package name */
    public final String f77703c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f77704a;

        /* renamed from: b, reason: collision with root package name */
        public final String f77705b;

        public a(boolean z10, String str) {
            this.f77704a = z10;
            this.f77705b = str;
        }
    }

    public r1(int i10, String identityHash, String legacyIdentityHash) {
        kotlin.jvm.internal.e0.checkNotNullParameter(identityHash, "identityHash");
        kotlin.jvm.internal.e0.checkNotNullParameter(legacyIdentityHash, "legacyIdentityHash");
        this.f77701a = i10;
        this.f77702b = identityHash;
        this.f77703c = legacyIdentityHash;
    }

    public abstract void createAllTables(x5.b bVar);

    public abstract void dropAllTables(x5.b bVar);

    public final String getIdentityHash() {
        return this.f77702b;
    }

    public final String getLegacyIdentityHash() {
        return this.f77703c;
    }

    public final int getVersion() {
        return this.f77701a;
    }

    public abstract void onCreate(x5.b bVar);

    public abstract void onOpen(x5.b bVar);

    public abstract void onPostMigrate(x5.b bVar);

    public abstract void onPreMigrate(x5.b bVar);

    public abstract a onValidateSchema(x5.b bVar);
}
