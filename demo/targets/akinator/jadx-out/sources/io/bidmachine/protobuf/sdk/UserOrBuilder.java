package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface UserOrBuilder extends MessageOrBuilder {
    String getCcpa();

    ByteString getCcpaBytes();

    String getConsent();

    ByteString getConsentBytes();

    boolean getCoppa();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    boolean getGdpr();

    String getGpp();

    ByteString getGppBytes();

    int getGppSid(int i10);

    int getGppSidCount();

    List<Integer> getGppSidList();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
