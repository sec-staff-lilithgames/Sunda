package kh;

import com.google.api.AuthRequirement;
import com.google.api.OAuthRequirements;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface o extends MessageLiteOrBuilder {
    boolean getAllowWithoutCredential();

    OAuthRequirements getOauth();

    AuthRequirement getRequirements(int i10);

    int getRequirementsCount();

    List<AuthRequirement> getRequirementsList();

    String getSelector();

    ByteString getSelectorBytes();

    boolean hasOauth();
}
