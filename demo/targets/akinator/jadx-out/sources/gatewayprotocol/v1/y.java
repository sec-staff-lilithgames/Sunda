package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final y f57508a = new y();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public boolean isInRange(int i10) {
        return DiagnosticEventRequestOuterClass.DiagnosticTagType.forNumber(i10) != null;
    }
}
