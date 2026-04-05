package kh;

import com.google.api.Authentication;
import com.google.api.Backend;
import com.google.api.Billing;
import com.google.api.Context;
import com.google.api.Control;
import com.google.api.Documentation;
import com.google.api.Endpoint;
import com.google.api.Http;
import com.google.api.LogDescriptor;
import com.google.api.Logging;
import com.google.api.MetricDescriptor;
import com.google.api.MonitoredResourceDescriptor;
import com.google.api.Monitoring;
import com.google.api.Quota;
import com.google.api.Service;
import com.google.api.SourceInfo;
import com.google.api.SystemParameters;
import com.google.api.Usage;
import com.google.protobuf.Api;
import com.google.protobuf.ByteString;
import com.google.protobuf.Enum;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Type;
import com.google.protobuf.UInt32Value;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class q4 extends GeneratedMessageLite.Builder implements r4 {
    public q4 addAllApis(Iterable<? extends Api> iterable) {
        copyOnWrite();
        ((Service) this.instance).addAllApis(iterable);
        return this;
    }

    public q4 addAllEndpoints(Iterable<? extends Endpoint> iterable) {
        copyOnWrite();
        ((Service) this.instance).addAllEndpoints(iterable);
        return this;
    }

    public q4 addAllEnums(Iterable<? extends Enum> iterable) {
        copyOnWrite();
        ((Service) this.instance).addAllEnums(iterable);
        return this;
    }

    public q4 addAllLogs(Iterable<? extends LogDescriptor> iterable) {
        copyOnWrite();
        ((Service) this.instance).addAllLogs(iterable);
        return this;
    }

    public q4 addAllMetrics(Iterable<? extends MetricDescriptor> iterable) {
        copyOnWrite();
        ((Service) this.instance).addAllMetrics(iterable);
        return this;
    }

    public q4 addAllMonitoredResources(Iterable<? extends MonitoredResourceDescriptor> iterable) {
        copyOnWrite();
        ((Service) this.instance).addAllMonitoredResources(iterable);
        return this;
    }

    public q4 addAllTypes(Iterable<? extends Type> iterable) {
        copyOnWrite();
        ((Service) this.instance).addAllTypes(iterable);
        return this;
    }

    public q4 addApis(Api api) {
        copyOnWrite();
        ((Service) this.instance).addApis(api);
        return this;
    }

    public q4 addEndpoints(Endpoint endpoint) {
        copyOnWrite();
        ((Service) this.instance).addEndpoints(endpoint);
        return this;
    }

    public q4 addEnums(Enum r22) {
        copyOnWrite();
        ((Service) this.instance).addEnums(r22);
        return this;
    }

    public q4 addLogs(LogDescriptor logDescriptor) {
        copyOnWrite();
        ((Service) this.instance).addLogs(logDescriptor);
        return this;
    }

    public q4 addMetrics(MetricDescriptor metricDescriptor) {
        copyOnWrite();
        ((Service) this.instance).addMetrics(metricDescriptor);
        return this;
    }

    public q4 addMonitoredResources(MonitoredResourceDescriptor monitoredResourceDescriptor) {
        copyOnWrite();
        ((Service) this.instance).addMonitoredResources(monitoredResourceDescriptor);
        return this;
    }

    public q4 addTypes(Type type) {
        copyOnWrite();
        ((Service) this.instance).addTypes(type);
        return this;
    }

    public q4 clearApis() {
        copyOnWrite();
        ((Service) this.instance).clearApis();
        return this;
    }

    public q4 clearAuthentication() {
        copyOnWrite();
        ((Service) this.instance).clearAuthentication();
        return this;
    }

    public q4 clearBackend() {
        copyOnWrite();
        ((Service) this.instance).clearBackend();
        return this;
    }

    public q4 clearBilling() {
        copyOnWrite();
        ((Service) this.instance).clearBilling();
        return this;
    }

    public q4 clearConfigVersion() {
        copyOnWrite();
        ((Service) this.instance).clearConfigVersion();
        return this;
    }

    public q4 clearContext() {
        copyOnWrite();
        ((Service) this.instance).clearContext();
        return this;
    }

    public q4 clearControl() {
        copyOnWrite();
        ((Service) this.instance).clearControl();
        return this;
    }

    public q4 clearDocumentation() {
        copyOnWrite();
        ((Service) this.instance).clearDocumentation();
        return this;
    }

    public q4 clearEndpoints() {
        copyOnWrite();
        ((Service) this.instance).clearEndpoints();
        return this;
    }

    public q4 clearEnums() {
        copyOnWrite();
        ((Service) this.instance).clearEnums();
        return this;
    }

    public q4 clearHttp() {
        copyOnWrite();
        ((Service) this.instance).clearHttp();
        return this;
    }

    public q4 clearId() {
        copyOnWrite();
        ((Service) this.instance).clearId();
        return this;
    }

    public q4 clearLogging() {
        copyOnWrite();
        ((Service) this.instance).clearLogging();
        return this;
    }

    public q4 clearLogs() {
        copyOnWrite();
        ((Service) this.instance).clearLogs();
        return this;
    }

    public q4 clearMetrics() {
        copyOnWrite();
        ((Service) this.instance).clearMetrics();
        return this;
    }

    public q4 clearMonitoredResources() {
        copyOnWrite();
        ((Service) this.instance).clearMonitoredResources();
        return this;
    }

    public q4 clearMonitoring() {
        copyOnWrite();
        ((Service) this.instance).clearMonitoring();
        return this;
    }

    public q4 clearName() {
        copyOnWrite();
        ((Service) this.instance).clearName();
        return this;
    }

    public q4 clearProducerProjectId() {
        copyOnWrite();
        ((Service) this.instance).clearProducerProjectId();
        return this;
    }

    public q4 clearQuota() {
        copyOnWrite();
        ((Service) this.instance).clearQuota();
        return this;
    }

    public q4 clearSourceInfo() {
        copyOnWrite();
        ((Service) this.instance).clearSourceInfo();
        return this;
    }

    public q4 clearSystemParameters() {
        copyOnWrite();
        ((Service) this.instance).clearSystemParameters();
        return this;
    }

    public q4 clearTitle() {
        copyOnWrite();
        ((Service) this.instance).clearTitle();
        return this;
    }

    public q4 clearTypes() {
        copyOnWrite();
        ((Service) this.instance).clearTypes();
        return this;
    }

    public q4 clearUsage() {
        copyOnWrite();
        ((Service) this.instance).clearUsage();
        return this;
    }

    @Override // kh.r4
    public Api getApis(int i10) {
        return ((Service) this.instance).getApis(i10);
    }

    @Override // kh.r4
    public int getApisCount() {
        return ((Service) this.instance).getApisCount();
    }

    @Override // kh.r4
    public List<Api> getApisList() {
        return Collections.unmodifiableList(((Service) this.instance).getApisList());
    }

    @Override // kh.r4
    public Authentication getAuthentication() {
        return ((Service) this.instance).getAuthentication();
    }

    @Override // kh.r4
    public Backend getBackend() {
        return ((Service) this.instance).getBackend();
    }

    @Override // kh.r4
    public Billing getBilling() {
        return ((Service) this.instance).getBilling();
    }

    @Override // kh.r4
    public UInt32Value getConfigVersion() {
        return ((Service) this.instance).getConfigVersion();
    }

    @Override // kh.r4
    public Context getContext() {
        return ((Service) this.instance).getContext();
    }

    @Override // kh.r4
    public Control getControl() {
        return ((Service) this.instance).getControl();
    }

    @Override // kh.r4
    public Documentation getDocumentation() {
        return ((Service) this.instance).getDocumentation();
    }

    @Override // kh.r4
    public Endpoint getEndpoints(int i10) {
        return ((Service) this.instance).getEndpoints(i10);
    }

    @Override // kh.r4
    public int getEndpointsCount() {
        return ((Service) this.instance).getEndpointsCount();
    }

    @Override // kh.r4
    public List<Endpoint> getEndpointsList() {
        return Collections.unmodifiableList(((Service) this.instance).getEndpointsList());
    }

    @Override // kh.r4
    public Enum getEnums(int i10) {
        return ((Service) this.instance).getEnums(i10);
    }

    @Override // kh.r4
    public int getEnumsCount() {
        return ((Service) this.instance).getEnumsCount();
    }

    @Override // kh.r4
    public List<Enum> getEnumsList() {
        return Collections.unmodifiableList(((Service) this.instance).getEnumsList());
    }

    @Override // kh.r4
    public Http getHttp() {
        return ((Service) this.instance).getHttp();
    }

    @Override // kh.r4
    public String getId() {
        return ((Service) this.instance).getId();
    }

    @Override // kh.r4
    public ByteString getIdBytes() {
        return ((Service) this.instance).getIdBytes();
    }

    @Override // kh.r4
    public Logging getLogging() {
        return ((Service) this.instance).getLogging();
    }

    @Override // kh.r4
    public LogDescriptor getLogs(int i10) {
        return ((Service) this.instance).getLogs(i10);
    }

    @Override // kh.r4
    public int getLogsCount() {
        return ((Service) this.instance).getLogsCount();
    }

    @Override // kh.r4
    public List<LogDescriptor> getLogsList() {
        return Collections.unmodifiableList(((Service) this.instance).getLogsList());
    }

    @Override // kh.r4
    public MetricDescriptor getMetrics(int i10) {
        return ((Service) this.instance).getMetrics(i10);
    }

    @Override // kh.r4
    public int getMetricsCount() {
        return ((Service) this.instance).getMetricsCount();
    }

    @Override // kh.r4
    public List<MetricDescriptor> getMetricsList() {
        return Collections.unmodifiableList(((Service) this.instance).getMetricsList());
    }

    @Override // kh.r4
    public MonitoredResourceDescriptor getMonitoredResources(int i10) {
        return ((Service) this.instance).getMonitoredResources(i10);
    }

    @Override // kh.r4
    public int getMonitoredResourcesCount() {
        return ((Service) this.instance).getMonitoredResourcesCount();
    }

    @Override // kh.r4
    public List<MonitoredResourceDescriptor> getMonitoredResourcesList() {
        return Collections.unmodifiableList(((Service) this.instance).getMonitoredResourcesList());
    }

    @Override // kh.r4
    public Monitoring getMonitoring() {
        return ((Service) this.instance).getMonitoring();
    }

    @Override // kh.r4
    public String getName() {
        return ((Service) this.instance).getName();
    }

    @Override // kh.r4
    public ByteString getNameBytes() {
        return ((Service) this.instance).getNameBytes();
    }

    @Override // kh.r4
    public String getProducerProjectId() {
        return ((Service) this.instance).getProducerProjectId();
    }

    @Override // kh.r4
    public ByteString getProducerProjectIdBytes() {
        return ((Service) this.instance).getProducerProjectIdBytes();
    }

    @Override // kh.r4
    public Quota getQuota() {
        return ((Service) this.instance).getQuota();
    }

    @Override // kh.r4
    public SourceInfo getSourceInfo() {
        return ((Service) this.instance).getSourceInfo();
    }

    @Override // kh.r4
    public SystemParameters getSystemParameters() {
        return ((Service) this.instance).getSystemParameters();
    }

    @Override // kh.r4
    public String getTitle() {
        return ((Service) this.instance).getTitle();
    }

    @Override // kh.r4
    public ByteString getTitleBytes() {
        return ((Service) this.instance).getTitleBytes();
    }

    @Override // kh.r4
    public Type getTypes(int i10) {
        return ((Service) this.instance).getTypes(i10);
    }

    @Override // kh.r4
    public int getTypesCount() {
        return ((Service) this.instance).getTypesCount();
    }

    @Override // kh.r4
    public List<Type> getTypesList() {
        return Collections.unmodifiableList(((Service) this.instance).getTypesList());
    }

    @Override // kh.r4
    public Usage getUsage() {
        return ((Service) this.instance).getUsage();
    }

    @Override // kh.r4
    public boolean hasAuthentication() {
        return ((Service) this.instance).hasAuthentication();
    }

    @Override // kh.r4
    public boolean hasBackend() {
        return ((Service) this.instance).hasBackend();
    }

    @Override // kh.r4
    public boolean hasBilling() {
        return ((Service) this.instance).hasBilling();
    }

    @Override // kh.r4
    public boolean hasConfigVersion() {
        return ((Service) this.instance).hasConfigVersion();
    }

    @Override // kh.r4
    public boolean hasContext() {
        return ((Service) this.instance).hasContext();
    }

    @Override // kh.r4
    public boolean hasControl() {
        return ((Service) this.instance).hasControl();
    }

    @Override // kh.r4
    public boolean hasDocumentation() {
        return ((Service) this.instance).hasDocumentation();
    }

    @Override // kh.r4
    public boolean hasHttp() {
        return ((Service) this.instance).hasHttp();
    }

    @Override // kh.r4
    public boolean hasLogging() {
        return ((Service) this.instance).hasLogging();
    }

    @Override // kh.r4
    public boolean hasMonitoring() {
        return ((Service) this.instance).hasMonitoring();
    }

    @Override // kh.r4
    public boolean hasQuota() {
        return ((Service) this.instance).hasQuota();
    }

    @Override // kh.r4
    public boolean hasSourceInfo() {
        return ((Service) this.instance).hasSourceInfo();
    }

    @Override // kh.r4
    public boolean hasSystemParameters() {
        return ((Service) this.instance).hasSystemParameters();
    }

    @Override // kh.r4
    public boolean hasUsage() {
        return ((Service) this.instance).hasUsage();
    }

    public q4 mergeAuthentication(Authentication authentication) {
        copyOnWrite();
        ((Service) this.instance).mergeAuthentication(authentication);
        return this;
    }

    public q4 mergeBackend(Backend backend) {
        copyOnWrite();
        ((Service) this.instance).mergeBackend(backend);
        return this;
    }

    public q4 mergeBilling(Billing billing) {
        copyOnWrite();
        ((Service) this.instance).mergeBilling(billing);
        return this;
    }

    public q4 mergeConfigVersion(UInt32Value uInt32Value) {
        copyOnWrite();
        ((Service) this.instance).mergeConfigVersion(uInt32Value);
        return this;
    }

    public q4 mergeContext(Context context) {
        copyOnWrite();
        ((Service) this.instance).mergeContext(context);
        return this;
    }

    public q4 mergeControl(Control control) {
        copyOnWrite();
        ((Service) this.instance).mergeControl(control);
        return this;
    }

    public q4 mergeDocumentation(Documentation documentation) {
        copyOnWrite();
        ((Service) this.instance).mergeDocumentation(documentation);
        return this;
    }

    public q4 mergeHttp(Http http) {
        copyOnWrite();
        ((Service) this.instance).mergeHttp(http);
        return this;
    }

    public q4 mergeLogging(Logging logging) {
        copyOnWrite();
        ((Service) this.instance).mergeLogging(logging);
        return this;
    }

    public q4 mergeMonitoring(Monitoring monitoring) {
        copyOnWrite();
        ((Service) this.instance).mergeMonitoring(monitoring);
        return this;
    }

    public q4 mergeQuota(Quota quota) {
        copyOnWrite();
        ((Service) this.instance).mergeQuota(quota);
        return this;
    }

    public q4 mergeSourceInfo(SourceInfo sourceInfo) {
        copyOnWrite();
        ((Service) this.instance).mergeSourceInfo(sourceInfo);
        return this;
    }

    public q4 mergeSystemParameters(SystemParameters systemParameters) {
        copyOnWrite();
        ((Service) this.instance).mergeSystemParameters(systemParameters);
        return this;
    }

    public q4 mergeUsage(Usage usage) {
        copyOnWrite();
        ((Service) this.instance).mergeUsage(usage);
        return this;
    }

    public q4 removeApis(int i10) {
        copyOnWrite();
        ((Service) this.instance).removeApis(i10);
        return this;
    }

    public q4 removeEndpoints(int i10) {
        copyOnWrite();
        ((Service) this.instance).removeEndpoints(i10);
        return this;
    }

    public q4 removeEnums(int i10) {
        copyOnWrite();
        ((Service) this.instance).removeEnums(i10);
        return this;
    }

    public q4 removeLogs(int i10) {
        copyOnWrite();
        ((Service) this.instance).removeLogs(i10);
        return this;
    }

    public q4 removeMetrics(int i10) {
        copyOnWrite();
        ((Service) this.instance).removeMetrics(i10);
        return this;
    }

    public q4 removeMonitoredResources(int i10) {
        copyOnWrite();
        ((Service) this.instance).removeMonitoredResources(i10);
        return this;
    }

    public q4 removeTypes(int i10) {
        copyOnWrite();
        ((Service) this.instance).removeTypes(i10);
        return this;
    }

    public q4 setApis(int i10, Api api) {
        copyOnWrite();
        ((Service) this.instance).setApis(i10, api);
        return this;
    }

    public q4 setAuthentication(Authentication authentication) {
        copyOnWrite();
        ((Service) this.instance).setAuthentication(authentication);
        return this;
    }

    public q4 setBackend(Backend backend) {
        copyOnWrite();
        ((Service) this.instance).setBackend(backend);
        return this;
    }

    public q4 setBilling(Billing billing) {
        copyOnWrite();
        ((Service) this.instance).setBilling(billing);
        return this;
    }

    public q4 setConfigVersion(UInt32Value uInt32Value) {
        copyOnWrite();
        ((Service) this.instance).setConfigVersion(uInt32Value);
        return this;
    }

    public q4 setContext(Context context) {
        copyOnWrite();
        ((Service) this.instance).setContext(context);
        return this;
    }

    public q4 setControl(Control control) {
        copyOnWrite();
        ((Service) this.instance).setControl(control);
        return this;
    }

    public q4 setDocumentation(Documentation documentation) {
        copyOnWrite();
        ((Service) this.instance).setDocumentation(documentation);
        return this;
    }

    public q4 setEndpoints(int i10, Endpoint endpoint) {
        copyOnWrite();
        ((Service) this.instance).setEndpoints(i10, endpoint);
        return this;
    }

    public q4 setEnums(int i10, Enum r32) {
        copyOnWrite();
        ((Service) this.instance).setEnums(i10, r32);
        return this;
    }

    public q4 setHttp(Http http) {
        copyOnWrite();
        ((Service) this.instance).setHttp(http);
        return this;
    }

    public q4 setId(String str) {
        copyOnWrite();
        ((Service) this.instance).setId(str);
        return this;
    }

    public q4 setIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Service) this.instance).setIdBytes(byteString);
        return this;
    }

    public q4 setLogging(Logging logging) {
        copyOnWrite();
        ((Service) this.instance).setLogging(logging);
        return this;
    }

    public q4 setLogs(int i10, LogDescriptor logDescriptor) {
        copyOnWrite();
        ((Service) this.instance).setLogs(i10, logDescriptor);
        return this;
    }

    public q4 setMetrics(int i10, MetricDescriptor metricDescriptor) {
        copyOnWrite();
        ((Service) this.instance).setMetrics(i10, metricDescriptor);
        return this;
    }

    public q4 setMonitoredResources(int i10, MonitoredResourceDescriptor monitoredResourceDescriptor) {
        copyOnWrite();
        ((Service) this.instance).setMonitoredResources(i10, monitoredResourceDescriptor);
        return this;
    }

    public q4 setMonitoring(Monitoring monitoring) {
        copyOnWrite();
        ((Service) this.instance).setMonitoring(monitoring);
        return this;
    }

    public q4 setName(String str) {
        copyOnWrite();
        ((Service) this.instance).setName(str);
        return this;
    }

    public q4 setNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Service) this.instance).setNameBytes(byteString);
        return this;
    }

    public q4 setProducerProjectId(String str) {
        copyOnWrite();
        ((Service) this.instance).setProducerProjectId(str);
        return this;
    }

    public q4 setProducerProjectIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Service) this.instance).setProducerProjectIdBytes(byteString);
        return this;
    }

    public q4 setQuota(Quota quota) {
        copyOnWrite();
        ((Service) this.instance).setQuota(quota);
        return this;
    }

    public q4 setSourceInfo(SourceInfo sourceInfo) {
        copyOnWrite();
        ((Service) this.instance).setSourceInfo(sourceInfo);
        return this;
    }

    public q4 setSystemParameters(SystemParameters systemParameters) {
        copyOnWrite();
        ((Service) this.instance).setSystemParameters(systemParameters);
        return this;
    }

    public q4 setTitle(String str) {
        copyOnWrite();
        ((Service) this.instance).setTitle(str);
        return this;
    }

    public q4 setTitleBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Service) this.instance).setTitleBytes(byteString);
        return this;
    }

    public q4 setTypes(int i10, Type type) {
        copyOnWrite();
        ((Service) this.instance).setTypes(i10, type);
        return this;
    }

    public q4 setUsage(Usage usage) {
        copyOnWrite();
        ((Service) this.instance).setUsage(usage);
        return this;
    }

    public q4 addApis(int i10, Api api) {
        copyOnWrite();
        ((Service) this.instance).addApis(i10, api);
        return this;
    }

    public q4 addEndpoints(int i10, Endpoint endpoint) {
        copyOnWrite();
        ((Service) this.instance).addEndpoints(i10, endpoint);
        return this;
    }

    public q4 addEnums(int i10, Enum r32) {
        copyOnWrite();
        ((Service) this.instance).addEnums(i10, r32);
        return this;
    }

    public q4 addLogs(int i10, LogDescriptor logDescriptor) {
        copyOnWrite();
        ((Service) this.instance).addLogs(i10, logDescriptor);
        return this;
    }

    public q4 addMetrics(int i10, MetricDescriptor metricDescriptor) {
        copyOnWrite();
        ((Service) this.instance).addMetrics(i10, metricDescriptor);
        return this;
    }

    public q4 addMonitoredResources(int i10, MonitoredResourceDescriptor monitoredResourceDescriptor) {
        copyOnWrite();
        ((Service) this.instance).addMonitoredResources(i10, monitoredResourceDescriptor);
        return this;
    }

    public q4 addTypes(int i10, Type type) {
        copyOnWrite();
        ((Service) this.instance).addTypes(i10, type);
        return this;
    }

    public q4 setApis(int i10, Api.Builder builder) {
        copyOnWrite();
        ((Service) this.instance).setApis(i10, builder.build());
        return this;
    }

    public q4 setAuthentication(k kVar) {
        copyOnWrite();
        ((Service) this.instance).setAuthentication((Authentication) kVar.build());
        return this;
    }

    public q4 setBackend(q qVar) {
        copyOnWrite();
        ((Service) this.instance).setBackend((Backend) qVar.build());
        return this;
    }

    public q4 setBilling(com.google.api.b bVar) {
        copyOnWrite();
        ((Service) this.instance).setBilling((Billing) bVar.build());
        return this;
    }

    public q4 setConfigVersion(UInt32Value.Builder builder) {
        copyOnWrite();
        ((Service) this.instance).setConfigVersion(builder.build());
        return this;
    }

    public q4 setContext(i0 i0Var) {
        copyOnWrite();
        ((Service) this.instance).setContext((Context) i0Var.build());
        return this;
    }

    public q4 setControl(o0 o0Var) {
        copyOnWrite();
        ((Service) this.instance).setControl((Control) o0Var.build());
        return this;
    }

    public q4 setDocumentation(x0 x0Var) {
        copyOnWrite();
        ((Service) this.instance).setDocumentation((Documentation) x0Var.build());
        return this;
    }

    public q4 setEndpoints(int i10, d1 d1Var) {
        copyOnWrite();
        ((Service) this.instance).setEndpoints(i10, (Endpoint) d1Var.build());
        return this;
    }

    public q4 setEnums(int i10, Enum.Builder builder) {
        copyOnWrite();
        ((Service) this.instance).setEnums(i10, builder.build());
        return this;
    }

    public q4 setHttp(g1 g1Var) {
        copyOnWrite();
        ((Service) this.instance).setHttp((Http) g1Var.build());
        return this;
    }

    public q4 setLogging(com.google.api.q qVar) {
        copyOnWrite();
        ((Service) this.instance).setLogging((Logging) qVar.build());
        return this;
    }

    public q4 setLogs(int i10, d2 d2Var) {
        copyOnWrite();
        ((Service) this.instance).setLogs(i10, (LogDescriptor) d2Var.build());
        return this;
    }

    public q4 setMetrics(int i10, com.google.api.t tVar) {
        copyOnWrite();
        ((Service) this.instance).setMetrics(i10, (MetricDescriptor) tVar.build());
        return this;
    }

    public q4 setMonitoredResources(int i10, b3 b3Var) {
        copyOnWrite();
        ((Service) this.instance).setMonitoredResources(i10, (MonitoredResourceDescriptor) b3Var.build());
        return this;
    }

    public q4 setMonitoring(com.google.api.w wVar) {
        copyOnWrite();
        ((Service) this.instance).setMonitoring((Monitoring) wVar.build());
        return this;
    }

    public q4 setQuota(a4 a4Var) {
        copyOnWrite();
        ((Service) this.instance).setQuota((Quota) a4Var.build());
        return this;
    }

    public q4 setSourceInfo(t4 t4Var) {
        copyOnWrite();
        ((Service) this.instance).setSourceInfo((SourceInfo) t4Var.build());
        return this;
    }

    public q4 setSystemParameters(c5 c5Var) {
        copyOnWrite();
        ((Service) this.instance).setSystemParameters((SystemParameters) c5Var.build());
        return this;
    }

    public q4 setTypes(int i10, Type.Builder builder) {
        copyOnWrite();
        ((Service) this.instance).setTypes(i10, builder.build());
        return this;
    }

    public q4 setUsage(f5 f5Var) {
        copyOnWrite();
        ((Service) this.instance).setUsage((Usage) f5Var.build());
        return this;
    }

    public q4 addApis(Api.Builder builder) {
        copyOnWrite();
        ((Service) this.instance).addApis(builder.build());
        return this;
    }

    public q4 addEndpoints(d1 d1Var) {
        copyOnWrite();
        ((Service) this.instance).addEndpoints((Endpoint) d1Var.build());
        return this;
    }

    public q4 addEnums(Enum.Builder builder) {
        copyOnWrite();
        ((Service) this.instance).addEnums(builder.build());
        return this;
    }

    public q4 addLogs(d2 d2Var) {
        copyOnWrite();
        ((Service) this.instance).addLogs((LogDescriptor) d2Var.build());
        return this;
    }

    public q4 addMetrics(com.google.api.t tVar) {
        copyOnWrite();
        ((Service) this.instance).addMetrics((MetricDescriptor) tVar.build());
        return this;
    }

    public q4 addMonitoredResources(b3 b3Var) {
        copyOnWrite();
        ((Service) this.instance).addMonitoredResources((MonitoredResourceDescriptor) b3Var.build());
        return this;
    }

    public q4 addTypes(Type.Builder builder) {
        copyOnWrite();
        ((Service) this.instance).addTypes(builder.build());
        return this;
    }

    public q4 addApis(int i10, Api.Builder builder) {
        copyOnWrite();
        ((Service) this.instance).addApis(i10, builder.build());
        return this;
    }

    public q4 addEndpoints(int i10, d1 d1Var) {
        copyOnWrite();
        ((Service) this.instance).addEndpoints(i10, (Endpoint) d1Var.build());
        return this;
    }

    public q4 addEnums(int i10, Enum.Builder builder) {
        copyOnWrite();
        ((Service) this.instance).addEnums(i10, builder.build());
        return this;
    }

    public q4 addLogs(int i10, d2 d2Var) {
        copyOnWrite();
        ((Service) this.instance).addLogs(i10, (LogDescriptor) d2Var.build());
        return this;
    }

    public q4 addMetrics(int i10, com.google.api.t tVar) {
        copyOnWrite();
        ((Service) this.instance).addMetrics(i10, (MetricDescriptor) tVar.build());
        return this;
    }

    public q4 addMonitoredResources(int i10, b3 b3Var) {
        copyOnWrite();
        ((Service) this.instance).addMonitoredResources(i10, (MonitoredResourceDescriptor) b3Var.build());
        return this;
    }

    public q4 addTypes(int i10, Type.Builder builder) {
        copyOnWrite();
        ((Service) this.instance).addTypes(i10, builder.build());
        return this;
    }
}
