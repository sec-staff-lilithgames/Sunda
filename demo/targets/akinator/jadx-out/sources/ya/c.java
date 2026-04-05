package ya;

import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public enum c {
    FAILED_INIT_ENCRYPTION("failed to init encryption"),
    FAILED_EXTRACT_ENCRYPTED_DATA("failed to extract encrypted data"),
    FAILED_STORE_ENCRYPTED_DATA("failed to store encrypted data"),
    IGNITE_SERVICE_UNAVAILABLE("Ignite service unavailable"),
    IGNITE_SERVICE_INVALID_SESSION("Invalid session token"),
    ONE_DT_EMPTY_ENTITY("received empty one dt from the service"),
    /* JADX INFO: Fake field, exist only in values array */
    ONE_DT_AUTHENTICATOR_DESTROYED("authenticator already destroyed");


    /* renamed from: j, reason: collision with root package name */
    public static final HashMap f94265j = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final String f94267b;

    static {
        for (c cVar : values()) {
            f94265j.put(cVar.f94267b, cVar);
        }
    }

    c(String str) {
        this.f94267b = str;
    }

    public final String a() {
        return this.f94267b;
    }
}
