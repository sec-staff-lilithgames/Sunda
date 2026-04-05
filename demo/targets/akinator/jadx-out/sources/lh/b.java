package lh;

import com.google.cloud.audit.AuditLog;
import com.google.cloud.audit.AuthenticationInfo;
import com.google.cloud.audit.AuthorizationInfo;
import com.google.cloud.audit.RequestMetadata;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Struct;
import com.google.rpc.Status;
import java.util.Collections;
import java.util.List;
import uk.c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b extends GeneratedMessageLite.Builder implements c {
    public b addAllAuthorizationInfo(Iterable<? extends AuthorizationInfo> iterable) {
        copyOnWrite();
        ((AuditLog) this.instance).addAllAuthorizationInfo(iterable);
        return this;
    }

    public b addAuthorizationInfo(AuthorizationInfo authorizationInfo) {
        copyOnWrite();
        ((AuditLog) this.instance).addAuthorizationInfo(authorizationInfo);
        return this;
    }

    public b clearAuthenticationInfo() {
        copyOnWrite();
        ((AuditLog) this.instance).clearAuthenticationInfo();
        return this;
    }

    public b clearAuthorizationInfo() {
        copyOnWrite();
        ((AuditLog) this.instance).clearAuthorizationInfo();
        return this;
    }

    public b clearMethodName() {
        copyOnWrite();
        ((AuditLog) this.instance).clearMethodName();
        return this;
    }

    public b clearNumResponseItems() {
        copyOnWrite();
        ((AuditLog) this.instance).clearNumResponseItems();
        return this;
    }

    public b clearRequest() {
        copyOnWrite();
        ((AuditLog) this.instance).clearRequest();
        return this;
    }

    public b clearRequestMetadata() {
        copyOnWrite();
        ((AuditLog) this.instance).clearRequestMetadata();
        return this;
    }

    public b clearResourceName() {
        copyOnWrite();
        ((AuditLog) this.instance).clearResourceName();
        return this;
    }

    public b clearResponse() {
        copyOnWrite();
        ((AuditLog) this.instance).clearResponse();
        return this;
    }

    public b clearServiceData() {
        copyOnWrite();
        ((AuditLog) this.instance).clearServiceData();
        return this;
    }

    public b clearServiceName() {
        copyOnWrite();
        ((AuditLog) this.instance).clearServiceName();
        return this;
    }

    public b clearStatus() {
        copyOnWrite();
        ((AuditLog) this.instance).clearStatus();
        return this;
    }

    @Override // lh.c
    public AuthenticationInfo getAuthenticationInfo() {
        return ((AuditLog) this.instance).getAuthenticationInfo();
    }

    @Override // lh.c
    public AuthorizationInfo getAuthorizationInfo(int i10) {
        return ((AuditLog) this.instance).getAuthorizationInfo(i10);
    }

    @Override // lh.c
    public int getAuthorizationInfoCount() {
        return ((AuditLog) this.instance).getAuthorizationInfoCount();
    }

    @Override // lh.c
    public List<AuthorizationInfo> getAuthorizationInfoList() {
        return Collections.unmodifiableList(((AuditLog) this.instance).getAuthorizationInfoList());
    }

    @Override // lh.c
    public String getMethodName() {
        return ((AuditLog) this.instance).getMethodName();
    }

    @Override // lh.c
    public ByteString getMethodNameBytes() {
        return ((AuditLog) this.instance).getMethodNameBytes();
    }

    @Override // lh.c
    public long getNumResponseItems() {
        return ((AuditLog) this.instance).getNumResponseItems();
    }

    @Override // lh.c
    public Struct getRequest() {
        return ((AuditLog) this.instance).getRequest();
    }

    @Override // lh.c
    public RequestMetadata getRequestMetadata() {
        return ((AuditLog) this.instance).getRequestMetadata();
    }

    @Override // lh.c
    public String getResourceName() {
        return ((AuditLog) this.instance).getResourceName();
    }

    @Override // lh.c
    public ByteString getResourceNameBytes() {
        return ((AuditLog) this.instance).getResourceNameBytes();
    }

    @Override // lh.c
    public Struct getResponse() {
        return ((AuditLog) this.instance).getResponse();
    }

    @Override // lh.c
    public Any getServiceData() {
        return ((AuditLog) this.instance).getServiceData();
    }

    @Override // lh.c
    public String getServiceName() {
        return ((AuditLog) this.instance).getServiceName();
    }

    @Override // lh.c
    public ByteString getServiceNameBytes() {
        return ((AuditLog) this.instance).getServiceNameBytes();
    }

    @Override // lh.c
    public Status getStatus() {
        return ((AuditLog) this.instance).getStatus();
    }

    @Override // lh.c
    public boolean hasAuthenticationInfo() {
        return ((AuditLog) this.instance).hasAuthenticationInfo();
    }

    @Override // lh.c
    public boolean hasRequest() {
        return ((AuditLog) this.instance).hasRequest();
    }

    @Override // lh.c
    public boolean hasRequestMetadata() {
        return ((AuditLog) this.instance).hasRequestMetadata();
    }

    @Override // lh.c
    public boolean hasResponse() {
        return ((AuditLog) this.instance).hasResponse();
    }

    @Override // lh.c
    public boolean hasServiceData() {
        return ((AuditLog) this.instance).hasServiceData();
    }

    @Override // lh.c
    public boolean hasStatus() {
        return ((AuditLog) this.instance).hasStatus();
    }

    public b mergeAuthenticationInfo(AuthenticationInfo authenticationInfo) {
        copyOnWrite();
        ((AuditLog) this.instance).mergeAuthenticationInfo(authenticationInfo);
        return this;
    }

    public b mergeRequest(Struct struct) {
        copyOnWrite();
        ((AuditLog) this.instance).mergeRequest(struct);
        return this;
    }

    public b mergeRequestMetadata(RequestMetadata requestMetadata) {
        copyOnWrite();
        ((AuditLog) this.instance).mergeRequestMetadata(requestMetadata);
        return this;
    }

    public b mergeResponse(Struct struct) {
        copyOnWrite();
        ((AuditLog) this.instance).mergeResponse(struct);
        return this;
    }

    public b mergeServiceData(Any any) {
        copyOnWrite();
        ((AuditLog) this.instance).mergeServiceData(any);
        return this;
    }

    public b mergeStatus(Status status) {
        copyOnWrite();
        ((AuditLog) this.instance).mergeStatus(status);
        return this;
    }

    public b removeAuthorizationInfo(int i10) {
        copyOnWrite();
        ((AuditLog) this.instance).removeAuthorizationInfo(i10);
        return this;
    }

    public b setAuthenticationInfo(AuthenticationInfo authenticationInfo) {
        copyOnWrite();
        ((AuditLog) this.instance).setAuthenticationInfo(authenticationInfo);
        return this;
    }

    public b setAuthorizationInfo(int i10, AuthorizationInfo authorizationInfo) {
        copyOnWrite();
        ((AuditLog) this.instance).setAuthorizationInfo(i10, authorizationInfo);
        return this;
    }

    public b setMethodName(String str) {
        copyOnWrite();
        ((AuditLog) this.instance).setMethodName(str);
        return this;
    }

    public b setMethodNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AuditLog) this.instance).setMethodNameBytes(byteString);
        return this;
    }

    public b setNumResponseItems(long j10) {
        copyOnWrite();
        ((AuditLog) this.instance).setNumResponseItems(j10);
        return this;
    }

    public b setRequest(Struct struct) {
        copyOnWrite();
        ((AuditLog) this.instance).setRequest(struct);
        return this;
    }

    public b setRequestMetadata(RequestMetadata requestMetadata) {
        copyOnWrite();
        ((AuditLog) this.instance).setRequestMetadata(requestMetadata);
        return this;
    }

    public b setResourceName(String str) {
        copyOnWrite();
        ((AuditLog) this.instance).setResourceName(str);
        return this;
    }

    public b setResourceNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AuditLog) this.instance).setResourceNameBytes(byteString);
        return this;
    }

    public b setResponse(Struct struct) {
        copyOnWrite();
        ((AuditLog) this.instance).setResponse(struct);
        return this;
    }

    public b setServiceData(Any any) {
        copyOnWrite();
        ((AuditLog) this.instance).setServiceData(any);
        return this;
    }

    public b setServiceName(String str) {
        copyOnWrite();
        ((AuditLog) this.instance).setServiceName(str);
        return this;
    }

    public b setServiceNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AuditLog) this.instance).setServiceNameBytes(byteString);
        return this;
    }

    public b setStatus(Status status) {
        copyOnWrite();
        ((AuditLog) this.instance).setStatus(status);
        return this;
    }

    public b addAuthorizationInfo(int i10, AuthorizationInfo authorizationInfo) {
        copyOnWrite();
        ((AuditLog) this.instance).addAuthorizationInfo(i10, authorizationInfo);
        return this;
    }

    public b setAuthenticationInfo(e eVar) {
        copyOnWrite();
        ((AuditLog) this.instance).setAuthenticationInfo((AuthenticationInfo) eVar.build());
        return this;
    }

    public b setAuthorizationInfo(int i10, h hVar) {
        copyOnWrite();
        ((AuditLog) this.instance).setAuthorizationInfo(i10, (AuthorizationInfo) hVar.build());
        return this;
    }

    public b setRequest(Struct.Builder builder) {
        copyOnWrite();
        ((AuditLog) this.instance).setRequest(builder.build());
        return this;
    }

    public b setRequestMetadata(k kVar) {
        copyOnWrite();
        ((AuditLog) this.instance).setRequestMetadata((RequestMetadata) kVar.build());
        return this;
    }

    public b setResponse(Struct.Builder builder) {
        copyOnWrite();
        ((AuditLog) this.instance).setResponse(builder.build());
        return this;
    }

    public b setServiceData(Any.Builder builder) {
        copyOnWrite();
        ((AuditLog) this.instance).setServiceData(builder.build());
        return this;
    }

    public b setStatus(c0 c0Var) {
        copyOnWrite();
        ((AuditLog) this.instance).setStatus((Status) c0Var.build());
        return this;
    }

    public b addAuthorizationInfo(h hVar) {
        copyOnWrite();
        ((AuditLog) this.instance).addAuthorizationInfo((AuthorizationInfo) hVar.build());
        return this;
    }

    public b addAuthorizationInfo(int i10, h hVar) {
        copyOnWrite();
        ((AuditLog) this.instance).addAuthorizationInfo(i10, (AuthorizationInfo) hVar.build());
        return this;
    }
}
