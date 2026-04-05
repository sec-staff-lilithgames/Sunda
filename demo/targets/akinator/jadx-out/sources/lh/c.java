package lh;

import com.google.cloud.audit.AuthenticationInfo;
import com.google.cloud.audit.AuthorizationInfo;
import com.google.cloud.audit.RequestMetadata;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Struct;
import com.google.rpc.Status;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface c extends MessageLiteOrBuilder {
    AuthenticationInfo getAuthenticationInfo();

    AuthorizationInfo getAuthorizationInfo(int i10);

    int getAuthorizationInfoCount();

    List<AuthorizationInfo> getAuthorizationInfoList();

    String getMethodName();

    ByteString getMethodNameBytes();

    long getNumResponseItems();

    Struct getRequest();

    RequestMetadata getRequestMetadata();

    String getResourceName();

    ByteString getResourceNameBytes();

    Struct getResponse();

    Any getServiceData();

    String getServiceName();

    ByteString getServiceNameBytes();

    Status getStatus();

    boolean hasAuthenticationInfo();

    boolean hasRequest();

    boolean hasRequestMetadata();

    boolean hasResponse();

    boolean hasServiceData();

    boolean hasStatus();
}
