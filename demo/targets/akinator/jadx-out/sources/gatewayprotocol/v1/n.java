package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.DeveloperConsentOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final n f57498a = new n();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public boolean isInRange(int i10) {
        return DeveloperConsentOuterClass.DeveloperConsentType.forNumber(i10) != null;
    }
}
