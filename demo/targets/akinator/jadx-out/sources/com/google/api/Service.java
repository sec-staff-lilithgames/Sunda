package com.google.api;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Api;
import com.google.protobuf.ApiOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Enum;
import com.google.protobuf.EnumOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.google.protobuf.Type;
import com.google.protobuf.TypeOrBuilder;
import com.google.protobuf.UInt32Value;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kh.a4;
import kh.c3;
import kh.c5;
import kh.e1;
import kh.e2;
import kh.f5;
import kh.g1;
import kh.i0;
import kh.o0;
import kh.p4;
import kh.q4;
import kh.r4;
import kh.t4;
import kh.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class Service extends GeneratedMessageLite<Service, q4> implements r4 {
    public static final int APIS_FIELD_NUMBER = 3;
    public static final int AUTHENTICATION_FIELD_NUMBER = 11;
    public static final int BACKEND_FIELD_NUMBER = 8;
    public static final int BILLING_FIELD_NUMBER = 26;
    public static final int CONFIG_VERSION_FIELD_NUMBER = 20;
    public static final int CONTEXT_FIELD_NUMBER = 12;
    public static final int CONTROL_FIELD_NUMBER = 21;
    private static final Service DEFAULT_INSTANCE;
    public static final int DOCUMENTATION_FIELD_NUMBER = 6;
    public static final int ENDPOINTS_FIELD_NUMBER = 18;
    public static final int ENUMS_FIELD_NUMBER = 5;
    public static final int HTTP_FIELD_NUMBER = 9;
    public static final int ID_FIELD_NUMBER = 33;
    public static final int LOGGING_FIELD_NUMBER = 27;
    public static final int LOGS_FIELD_NUMBER = 23;
    public static final int METRICS_FIELD_NUMBER = 24;
    public static final int MONITORED_RESOURCES_FIELD_NUMBER = 25;
    public static final int MONITORING_FIELD_NUMBER = 28;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Service> PARSER = null;
    public static final int PRODUCER_PROJECT_ID_FIELD_NUMBER = 22;
    public static final int QUOTA_FIELD_NUMBER = 10;
    public static final int SOURCE_INFO_FIELD_NUMBER = 37;
    public static final int SYSTEM_PARAMETERS_FIELD_NUMBER = 29;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TYPES_FIELD_NUMBER = 4;
    public static final int USAGE_FIELD_NUMBER = 15;
    private Authentication authentication_;
    private Backend backend_;
    private Billing billing_;
    private int bitField0_;
    private UInt32Value configVersion_;
    private Context context_;
    private Control control_;
    private Documentation documentation_;
    private Http http_;
    private Logging logging_;
    private Monitoring monitoring_;
    private Quota quota_;
    private SourceInfo sourceInfo_;
    private SystemParameters systemParameters_;
    private Usage usage_;
    private String name_ = "";
    private String id_ = "";
    private String title_ = "";
    private String producerProjectId_ = "";
    private Internal.ProtobufList<Api> apis_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Type> types_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Enum> enums_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Endpoint> endpoints_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<LogDescriptor> logs_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<MetricDescriptor> metrics_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<MonitoredResourceDescriptor> monitoredResources_ = GeneratedMessageLite.emptyProtobufList();

    static {
        Service service = new Service();
        DEFAULT_INSTANCE = service;
        GeneratedMessageLite.registerDefaultInstance(Service.class, service);
    }

    private Service() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllApis(Iterable<? extends Api> iterable) {
        ensureApisIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.apis_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEndpoints(Iterable<? extends Endpoint> iterable) {
        ensureEndpointsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.endpoints_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEnums(Iterable<? extends Enum> iterable) {
        ensureEnumsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.enums_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLogs(Iterable<? extends LogDescriptor> iterable) {
        ensureLogsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.logs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMetrics(Iterable<? extends MetricDescriptor> iterable) {
        ensureMetricsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.metrics_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMonitoredResources(Iterable<? extends MonitoredResourceDescriptor> iterable) {
        ensureMonitoredResourcesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.monitoredResources_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTypes(Iterable<? extends Type> iterable) {
        ensureTypesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.types_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addApis(Api api) {
        api.getClass();
        ensureApisIsMutable();
        this.apis_.add(api);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEndpoints(Endpoint endpoint) {
        endpoint.getClass();
        ensureEndpointsIsMutable();
        this.endpoints_.add(endpoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnums(Enum r22) {
        r22.getClass();
        ensureEnumsIsMutable();
        this.enums_.add(r22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogs(LogDescriptor logDescriptor) {
        logDescriptor.getClass();
        ensureLogsIsMutable();
        this.logs_.add(logDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMetrics(MetricDescriptor metricDescriptor) {
        metricDescriptor.getClass();
        ensureMetricsIsMutable();
        this.metrics_.add(metricDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMonitoredResources(MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.getClass();
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.add(monitoredResourceDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTypes(Type type) {
        type.getClass();
        ensureTypesIsMutable();
        this.types_.add(type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApis() {
        this.apis_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthentication() {
        this.authentication_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackend() {
        this.backend_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBilling() {
        this.billing_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfigVersion() {
        this.configVersion_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContext() {
        this.context_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearControl() {
        this.control_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocumentation() {
        this.documentation_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndpoints() {
        this.endpoints_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnums() {
        this.enums_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttp() {
        this.http_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogging() {
        this.logging_ = null;
        this.bitField0_ &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogs() {
        this.logs_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetrics() {
        this.metrics_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMonitoredResources() {
        this.monitoredResources_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMonitoring() {
        this.monitoring_ = null;
        this.bitField0_ &= -2049;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProducerProjectId() {
        this.producerProjectId_ = getDefaultInstance().getProducerProjectId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuota() {
        this.quota_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceInfo() {
        this.sourceInfo_ = null;
        this.bitField0_ &= -8193;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSystemParameters() {
        this.systemParameters_ = null;
        this.bitField0_ &= -4097;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypes() {
        this.types_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsage() {
        this.usage_ = null;
        this.bitField0_ &= -129;
    }

    private void ensureApisIsMutable() {
        Internal.ProtobufList<Api> protobufList = this.apis_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.apis_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureEndpointsIsMutable() {
        Internal.ProtobufList<Endpoint> protobufList = this.endpoints_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.endpoints_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureEnumsIsMutable() {
        Internal.ProtobufList<Enum> protobufList = this.enums_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.enums_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureLogsIsMutable() {
        Internal.ProtobufList<LogDescriptor> protobufList = this.logs_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.logs_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureMetricsIsMutable() {
        Internal.ProtobufList<MetricDescriptor> protobufList = this.metrics_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.metrics_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureMonitoredResourcesIsMutable() {
        Internal.ProtobufList<MonitoredResourceDescriptor> protobufList = this.monitoredResources_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.monitoredResources_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureTypesIsMutable() {
        Internal.ProtobufList<Type> protobufList = this.types_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.types_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Service getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAuthentication(Authentication authentication) {
        authentication.getClass();
        Authentication authentication2 = this.authentication_;
        if (authentication2 == null || authentication2 == Authentication.getDefaultInstance()) {
            this.authentication_ = authentication;
        } else {
            this.authentication_ = (Authentication) ((kh.k) Authentication.newBuilder(this.authentication_).mergeFrom((kh.k) authentication)).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBackend(Backend backend) {
        backend.getClass();
        Backend backend2 = this.backend_;
        if (backend2 == null || backend2 == Backend.getDefaultInstance()) {
            this.backend_ = backend;
        } else {
            this.backend_ = (Backend) ((kh.q) Backend.newBuilder(this.backend_).mergeFrom((kh.q) backend)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBilling(Billing billing) {
        billing.getClass();
        Billing billing2 = this.billing_;
        if (billing2 == null || billing2 == Billing.getDefaultInstance()) {
            this.billing_ = billing;
        } else {
            this.billing_ = (Billing) ((b) Billing.newBuilder(this.billing_).mergeFrom((b) billing)).buildPartial();
        }
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConfigVersion(UInt32Value uInt32Value) {
        uInt32Value.getClass();
        UInt32Value uInt32Value2 = this.configVersion_;
        if (uInt32Value2 == null || uInt32Value2 == UInt32Value.getDefaultInstance()) {
            this.configVersion_ = uInt32Value;
        } else {
            this.configVersion_ = UInt32Value.newBuilder(this.configVersion_).mergeFrom((UInt32Value.Builder) uInt32Value).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeContext(Context context) {
        context.getClass();
        Context context2 = this.context_;
        if (context2 == null || context2 == Context.getDefaultInstance()) {
            this.context_ = context;
        } else {
            this.context_ = (Context) ((i0) Context.newBuilder(this.context_).mergeFrom((i0) context)).buildPartial();
        }
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeControl(Control control) {
        control.getClass();
        Control control2 = this.control_;
        if (control2 == null || control2 == Control.getDefaultInstance()) {
            this.control_ = control;
        } else {
            this.control_ = (Control) ((o0) Control.newBuilder(this.control_).mergeFrom((o0) control)).buildPartial();
        }
        this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDocumentation(Documentation documentation) {
        documentation.getClass();
        Documentation documentation2 = this.documentation_;
        if (documentation2 == null || documentation2 == Documentation.getDefaultInstance()) {
            this.documentation_ = documentation;
        } else {
            this.documentation_ = (Documentation) ((x0) Documentation.newBuilder(this.documentation_).mergeFrom((x0) documentation)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHttp(Http http) {
        http.getClass();
        Http http2 = this.http_;
        if (http2 == null || http2 == Http.getDefaultInstance()) {
            this.http_ = http;
        } else {
            this.http_ = (Http) ((g1) Http.newBuilder(this.http_).mergeFrom((g1) http)).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLogging(Logging logging) {
        logging.getClass();
        Logging logging2 = this.logging_;
        if (logging2 == null || logging2 == Logging.getDefaultInstance()) {
            this.logging_ = logging;
        } else {
            this.logging_ = (Logging) ((q) Logging.newBuilder(this.logging_).mergeFrom((q) logging)).buildPartial();
        }
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMonitoring(Monitoring monitoring) {
        monitoring.getClass();
        Monitoring monitoring2 = this.monitoring_;
        if (monitoring2 == null || monitoring2 == Monitoring.getDefaultInstance()) {
            this.monitoring_ = monitoring;
        } else {
            this.monitoring_ = (Monitoring) ((w) Monitoring.newBuilder(this.monitoring_).mergeFrom((w) monitoring)).buildPartial();
        }
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeQuota(Quota quota) {
        quota.getClass();
        Quota quota2 = this.quota_;
        if (quota2 == null || quota2 == Quota.getDefaultInstance()) {
            this.quota_ = quota;
        } else {
            this.quota_ = (Quota) ((a4) Quota.newBuilder(this.quota_).mergeFrom((a4) quota)).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSourceInfo(SourceInfo sourceInfo) {
        sourceInfo.getClass();
        SourceInfo sourceInfo2 = this.sourceInfo_;
        if (sourceInfo2 == null || sourceInfo2 == SourceInfo.getDefaultInstance()) {
            this.sourceInfo_ = sourceInfo;
        } else {
            this.sourceInfo_ = (SourceInfo) ((t4) SourceInfo.newBuilder(this.sourceInfo_).mergeFrom((t4) sourceInfo)).buildPartial();
        }
        this.bitField0_ |= Segment.SIZE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSystemParameters(SystemParameters systemParameters) {
        systemParameters.getClass();
        SystemParameters systemParameters2 = this.systemParameters_;
        if (systemParameters2 == null || systemParameters2 == SystemParameters.getDefaultInstance()) {
            this.systemParameters_ = systemParameters;
        } else {
            this.systemParameters_ = (SystemParameters) ((c5) SystemParameters.newBuilder(this.systemParameters_).mergeFrom((c5) systemParameters)).buildPartial();
        }
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUsage(Usage usage) {
        usage.getClass();
        Usage usage2 = this.usage_;
        if (usage2 == null || usage2 == Usage.getDefaultInstance()) {
            this.usage_ = usage;
        } else {
            this.usage_ = (Usage) ((f5) Usage.newBuilder(this.usage_).mergeFrom((f5) usage)).buildPartial();
        }
        this.bitField0_ |= 128;
    }

    public static q4 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Service parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Service) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Service parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Service> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeApis(int i10) {
        ensureApisIsMutable();
        this.apis_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEndpoints(int i10) {
        ensureEndpointsIsMutable();
        this.endpoints_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEnums(int i10) {
        ensureEnumsIsMutable();
        this.enums_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLogs(int i10) {
        ensureLogsIsMutable();
        this.logs_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMetrics(int i10) {
        ensureMetricsIsMutable();
        this.metrics_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMonitoredResources(int i10) {
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTypes(int i10) {
        ensureTypesIsMutable();
        this.types_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApis(int i10, Api api) {
        api.getClass();
        ensureApisIsMutable();
        this.apis_.set(i10, api);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthentication(Authentication authentication) {
        authentication.getClass();
        this.authentication_ = authentication;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackend(Backend backend) {
        backend.getClass();
        this.backend_ = backend;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBilling(Billing billing) {
        billing.getClass();
        this.billing_ = billing;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigVersion(UInt32Value uInt32Value) {
        uInt32Value.getClass();
        this.configVersion_ = uInt32Value;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContext(Context context) {
        context.getClass();
        this.context_ = context;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setControl(Control control) {
        control.getClass();
        this.control_ = control;
        this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocumentation(Documentation documentation) {
        documentation.getClass();
        this.documentation_ = documentation;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndpoints(int i10, Endpoint endpoint) {
        endpoint.getClass();
        ensureEndpointsIsMutable();
        this.endpoints_.set(i10, endpoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnums(int i10, Enum r32) {
        r32.getClass();
        ensureEnumsIsMutable();
        this.enums_.set(i10, r32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttp(Http http) {
        http.getClass();
        this.http_ = http;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogging(Logging logging) {
        logging.getClass();
        this.logging_ = logging;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogs(int i10, LogDescriptor logDescriptor) {
        logDescriptor.getClass();
        ensureLogsIsMutable();
        this.logs_.set(i10, logDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetrics(int i10, MetricDescriptor metricDescriptor) {
        metricDescriptor.getClass();
        ensureMetricsIsMutable();
        this.metrics_.set(i10, metricDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMonitoredResources(int i10, MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.getClass();
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.set(i10, monitoredResourceDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMonitoring(Monitoring monitoring) {
        monitoring.getClass();
        this.monitoring_ = monitoring;
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProducerProjectId(String str) {
        str.getClass();
        this.producerProjectId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProducerProjectIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.producerProjectId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuota(Quota quota) {
        quota.getClass();
        this.quota_ = quota;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceInfo(SourceInfo sourceInfo) {
        sourceInfo.getClass();
        this.sourceInfo_ = sourceInfo;
        this.bitField0_ |= Segment.SIZE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemParameters(SystemParameters systemParameters) {
        systemParameters.getClass();
        this.systemParameters_ = systemParameters;
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypes(int i10, Type type) {
        type.getClass();
        ensureTypesIsMutable();
        this.types_.set(i10, type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsage(Usage usage) {
        usage.getClass();
        this.usage_ = usage;
        this.bitField0_ |= 128;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (p4.f71051a[methodToInvoke.ordinal()]) {
            case 1:
                return new Service();
            case 2:
                return new q4(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0019\u0000\u0001\u0001%\u0019\u0000\u0007\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\u001b\u0005\u001b\u0006ဉ\u0001\bဉ\u0002\tဉ\u0003\nဉ\u0004\u000bဉ\u0005\fဉ\u0006\u000fဉ\u0007\u0012\u001b\u0014ဉ\u0000\u0015ဉ\b\u0016Ȉ\u0017\u001b\u0018\u001b\u0019\u001b\u001aဉ\t\u001bဉ\n\u001cဉ\u000b\u001dဉ\f!Ȉ%ဉ\r", new Object[]{"bitField0_", "name_", "title_", "apis_", Api.class, "types_", Type.class, "enums_", Enum.class, "documentation_", "backend_", "http_", "quota_", "authentication_", "context_", "usage_", "endpoints_", Endpoint.class, "configVersion_", "control_", "producerProjectId_", "logs_", LogDescriptor.class, "metrics_", MetricDescriptor.class, "monitoredResources_", MonitoredResourceDescriptor.class, "billing_", "logging_", "monitoring_", "systemParameters_", "id_", "sourceInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Service> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Service.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // kh.r4
    public Api getApis(int i10) {
        return this.apis_.get(i10);
    }

    @Override // kh.r4
    public int getApisCount() {
        return this.apis_.size();
    }

    @Override // kh.r4
    public List<Api> getApisList() {
        return this.apis_;
    }

    public ApiOrBuilder getApisOrBuilder(int i10) {
        return this.apis_.get(i10);
    }

    public List<? extends ApiOrBuilder> getApisOrBuilderList() {
        return this.apis_;
    }

    @Override // kh.r4
    public Authentication getAuthentication() {
        Authentication authentication = this.authentication_;
        return authentication == null ? Authentication.getDefaultInstance() : authentication;
    }

    @Override // kh.r4
    public Backend getBackend() {
        Backend backend = this.backend_;
        return backend == null ? Backend.getDefaultInstance() : backend;
    }

    @Override // kh.r4
    public Billing getBilling() {
        Billing billing = this.billing_;
        return billing == null ? Billing.getDefaultInstance() : billing;
    }

    @Override // kh.r4
    public UInt32Value getConfigVersion() {
        UInt32Value uInt32Value = this.configVersion_;
        return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
    }

    @Override // kh.r4
    public Context getContext() {
        Context context = this.context_;
        return context == null ? Context.getDefaultInstance() : context;
    }

    @Override // kh.r4
    public Control getControl() {
        Control control = this.control_;
        return control == null ? Control.getDefaultInstance() : control;
    }

    @Override // kh.r4
    public Documentation getDocumentation() {
        Documentation documentation = this.documentation_;
        return documentation == null ? Documentation.getDefaultInstance() : documentation;
    }

    @Override // kh.r4
    public Endpoint getEndpoints(int i10) {
        return this.endpoints_.get(i10);
    }

    @Override // kh.r4
    public int getEndpointsCount() {
        return this.endpoints_.size();
    }

    @Override // kh.r4
    public List<Endpoint> getEndpointsList() {
        return this.endpoints_;
    }

    public e1 getEndpointsOrBuilder(int i10) {
        return this.endpoints_.get(i10);
    }

    public List<? extends e1> getEndpointsOrBuilderList() {
        return this.endpoints_;
    }

    @Override // kh.r4
    public Enum getEnums(int i10) {
        return this.enums_.get(i10);
    }

    @Override // kh.r4
    public int getEnumsCount() {
        return this.enums_.size();
    }

    @Override // kh.r4
    public List<Enum> getEnumsList() {
        return this.enums_;
    }

    public EnumOrBuilder getEnumsOrBuilder(int i10) {
        return this.enums_.get(i10);
    }

    public List<? extends EnumOrBuilder> getEnumsOrBuilderList() {
        return this.enums_;
    }

    @Override // kh.r4
    public Http getHttp() {
        Http http = this.http_;
        return http == null ? Http.getDefaultInstance() : http;
    }

    @Override // kh.r4
    public String getId() {
        return this.id_;
    }

    @Override // kh.r4
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    @Override // kh.r4
    public Logging getLogging() {
        Logging logging = this.logging_;
        return logging == null ? Logging.getDefaultInstance() : logging;
    }

    @Override // kh.r4
    public LogDescriptor getLogs(int i10) {
        return this.logs_.get(i10);
    }

    @Override // kh.r4
    public int getLogsCount() {
        return this.logs_.size();
    }

    @Override // kh.r4
    public List<LogDescriptor> getLogsList() {
        return this.logs_;
    }

    public e2 getLogsOrBuilder(int i10) {
        return this.logs_.get(i10);
    }

    public List<? extends e2> getLogsOrBuilderList() {
        return this.logs_;
    }

    @Override // kh.r4
    public MetricDescriptor getMetrics(int i10) {
        return this.metrics_.get(i10);
    }

    @Override // kh.r4
    public int getMetricsCount() {
        return this.metrics_.size();
    }

    @Override // kh.r4
    public List<MetricDescriptor> getMetricsList() {
        return this.metrics_;
    }

    public v getMetricsOrBuilder(int i10) {
        return this.metrics_.get(i10);
    }

    public List<? extends v> getMetricsOrBuilderList() {
        return this.metrics_;
    }

    @Override // kh.r4
    public MonitoredResourceDescriptor getMonitoredResources(int i10) {
        return this.monitoredResources_.get(i10);
    }

    @Override // kh.r4
    public int getMonitoredResourcesCount() {
        return this.monitoredResources_.size();
    }

    @Override // kh.r4
    public List<MonitoredResourceDescriptor> getMonitoredResourcesList() {
        return this.monitoredResources_;
    }

    public c3 getMonitoredResourcesOrBuilder(int i10) {
        return this.monitoredResources_.get(i10);
    }

    public List<? extends c3> getMonitoredResourcesOrBuilderList() {
        return this.monitoredResources_;
    }

    @Override // kh.r4
    public Monitoring getMonitoring() {
        Monitoring monitoring = this.monitoring_;
        return monitoring == null ? Monitoring.getDefaultInstance() : monitoring;
    }

    @Override // kh.r4
    public String getName() {
        return this.name_;
    }

    @Override // kh.r4
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // kh.r4
    public String getProducerProjectId() {
        return this.producerProjectId_;
    }

    @Override // kh.r4
    public ByteString getProducerProjectIdBytes() {
        return ByteString.copyFromUtf8(this.producerProjectId_);
    }

    @Override // kh.r4
    public Quota getQuota() {
        Quota quota = this.quota_;
        return quota == null ? Quota.getDefaultInstance() : quota;
    }

    @Override // kh.r4
    public SourceInfo getSourceInfo() {
        SourceInfo sourceInfo = this.sourceInfo_;
        return sourceInfo == null ? SourceInfo.getDefaultInstance() : sourceInfo;
    }

    @Override // kh.r4
    public SystemParameters getSystemParameters() {
        SystemParameters systemParameters = this.systemParameters_;
        return systemParameters == null ? SystemParameters.getDefaultInstance() : systemParameters;
    }

    @Override // kh.r4
    public String getTitle() {
        return this.title_;
    }

    @Override // kh.r4
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    @Override // kh.r4
    public Type getTypes(int i10) {
        return this.types_.get(i10);
    }

    @Override // kh.r4
    public int getTypesCount() {
        return this.types_.size();
    }

    @Override // kh.r4
    public List<Type> getTypesList() {
        return this.types_;
    }

    public TypeOrBuilder getTypesOrBuilder(int i10) {
        return this.types_.get(i10);
    }

    public List<? extends TypeOrBuilder> getTypesOrBuilderList() {
        return this.types_;
    }

    @Override // kh.r4
    public Usage getUsage() {
        Usage usage = this.usage_;
        return usage == null ? Usage.getDefaultInstance() : usage;
    }

    @Override // kh.r4
    public boolean hasAuthentication() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // kh.r4
    public boolean hasBackend() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // kh.r4
    public boolean hasBilling() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // kh.r4
    public boolean hasConfigVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // kh.r4
    public boolean hasContext() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // kh.r4
    public boolean hasControl() {
        return (this.bitField0_ & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
    }

    @Override // kh.r4
    public boolean hasDocumentation() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // kh.r4
    public boolean hasHttp() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // kh.r4
    public boolean hasLogging() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // kh.r4
    public boolean hasMonitoring() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // kh.r4
    public boolean hasQuota() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // kh.r4
    public boolean hasSourceInfo() {
        return (this.bitField0_ & Segment.SIZE) != 0;
    }

    @Override // kh.r4
    public boolean hasSystemParameters() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // kh.r4
    public boolean hasUsage() {
        return (this.bitField0_ & 128) != 0;
    }

    public static q4 newBuilder(Service service) {
        return DEFAULT_INSTANCE.createBuilder(service);
    }

    public static Service parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Service) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Service parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Service parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addApis(int i10, Api api) {
        api.getClass();
        ensureApisIsMutable();
        this.apis_.add(i10, api);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEndpoints(int i10, Endpoint endpoint) {
        endpoint.getClass();
        ensureEndpointsIsMutable();
        this.endpoints_.add(i10, endpoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnums(int i10, Enum r32) {
        r32.getClass();
        ensureEnumsIsMutable();
        this.enums_.add(i10, r32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogs(int i10, LogDescriptor logDescriptor) {
        logDescriptor.getClass();
        ensureLogsIsMutable();
        this.logs_.add(i10, logDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMetrics(int i10, MetricDescriptor metricDescriptor) {
        metricDescriptor.getClass();
        ensureMetricsIsMutable();
        this.metrics_.add(i10, metricDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMonitoredResources(int i10, MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.getClass();
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.add(i10, monitoredResourceDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTypes(int i10, Type type) {
        type.getClass();
        ensureTypesIsMutable();
        this.types_.add(i10, type);
    }

    public static Service parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Service parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Service parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Service parseFrom(InputStream inputStream) throws IOException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Service parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Service parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Service parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
