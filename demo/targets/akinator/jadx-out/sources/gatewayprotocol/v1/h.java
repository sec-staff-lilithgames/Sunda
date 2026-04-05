package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.ClientInfoOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final h f57492a = new h();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public boolean isInRange(int i10) {
        return ClientInfoOuterClass.MediationProvider.forNumber(i10) != null;
    }
}
