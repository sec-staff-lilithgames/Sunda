package ix;

import ac.Server;
import com.google.protobuf.GeneratedMessageLite;
import xchange.Xchange$UpdateCMPRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y extends GeneratedMessageLite.Builder implements z {
    public y clearCmp() {
        copyOnWrite();
        ((Xchange$UpdateCMPRequest) this.instance).clearCmp();
        return this;
    }

    @Override // ix.z
    public Server.CMP getCmp() {
        return ((Xchange$UpdateCMPRequest) this.instance).getCmp();
    }

    @Override // ix.z
    public boolean hasCmp() {
        return ((Xchange$UpdateCMPRequest) this.instance).hasCmp();
    }

    public y mergeCmp(Server.CMP cmp) {
        copyOnWrite();
        ((Xchange$UpdateCMPRequest) this.instance).mergeCmp(cmp);
        return this;
    }

    public y setCmp(Server.CMP cmp) {
        copyOnWrite();
        ((Xchange$UpdateCMPRequest) this.instance).setCmp(cmp);
        return this;
    }

    public y setCmp(Server.CMP.Builder builder) {
        copyOnWrite();
        ((Xchange$UpdateCMPRequest) this.instance).setCmp(builder.build());
        return this;
    }
}
