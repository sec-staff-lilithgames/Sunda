package ix;

import com.google.protobuf.GeneratedMessageLite;
import xchange.Error$ErrorResponse;
import xchange.Xchange$WebContractResponse;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d0 extends GeneratedMessageLite.Builder implements e0 {
    public d0 clearError() {
        copyOnWrite();
        ((Xchange$WebContractResponse) this.instance).clearError();
        return this;
    }

    @Override // ix.e0
    public Error$ErrorResponse getError() {
        return ((Xchange$WebContractResponse) this.instance).getError();
    }

    @Override // ix.e0
    public boolean hasError() {
        return ((Xchange$WebContractResponse) this.instance).hasError();
    }

    public d0 mergeError(Error$ErrorResponse error$ErrorResponse) {
        copyOnWrite();
        ((Xchange$WebContractResponse) this.instance).mergeError(error$ErrorResponse);
        return this;
    }

    public d0 setError(Error$ErrorResponse error$ErrorResponse) {
        copyOnWrite();
        ((Xchange$WebContractResponse) this.instance).setError(error$ErrorResponse);
        return this;
    }

    public d0 setError(t tVar) {
        copyOnWrite();
        ((Xchange$WebContractResponse) this.instance).setError((Error$ErrorResponse) tVar.build());
        return this;
    }
}
