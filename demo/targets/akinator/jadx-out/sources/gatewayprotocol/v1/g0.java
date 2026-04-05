package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g0 implements Internal.ListAdapter.Converter {
    @Override // com.google.protobuf.Internal.ListAdapter.Converter
    public DiagnosticEventRequestOuterClass.DiagnosticEventType convert(Integer num) {
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventTypeForNumber = DiagnosticEventRequestOuterClass.DiagnosticEventType.forNumber(num.intValue());
        return diagnosticEventTypeForNumber == null ? DiagnosticEventRequestOuterClass.DiagnosticEventType.UNRECOGNIZED : diagnosticEventTypeForNumber;
    }
}
