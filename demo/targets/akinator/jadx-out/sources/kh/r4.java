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
import com.google.api.SourceInfo;
import com.google.api.SystemParameters;
import com.google.api.Usage;
import com.google.protobuf.Api;
import com.google.protobuf.ByteString;
import com.google.protobuf.Enum;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Type;
import com.google.protobuf.UInt32Value;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface r4 extends MessageLiteOrBuilder {
    Api getApis(int i10);

    int getApisCount();

    List<Api> getApisList();

    Authentication getAuthentication();

    Backend getBackend();

    Billing getBilling();

    UInt32Value getConfigVersion();

    Context getContext();

    Control getControl();

    Documentation getDocumentation();

    Endpoint getEndpoints(int i10);

    int getEndpointsCount();

    List<Endpoint> getEndpointsList();

    Enum getEnums(int i10);

    int getEnumsCount();

    List<Enum> getEnumsList();

    Http getHttp();

    String getId();

    ByteString getIdBytes();

    Logging getLogging();

    LogDescriptor getLogs(int i10);

    int getLogsCount();

    List<LogDescriptor> getLogsList();

    MetricDescriptor getMetrics(int i10);

    int getMetricsCount();

    List<MetricDescriptor> getMetricsList();

    MonitoredResourceDescriptor getMonitoredResources(int i10);

    int getMonitoredResourcesCount();

    List<MonitoredResourceDescriptor> getMonitoredResourcesList();

    Monitoring getMonitoring();

    String getName();

    ByteString getNameBytes();

    String getProducerProjectId();

    ByteString getProducerProjectIdBytes();

    Quota getQuota();

    SourceInfo getSourceInfo();

    SystemParameters getSystemParameters();

    String getTitle();

    ByteString getTitleBytes();

    Type getTypes(int i10);

    int getTypesCount();

    List<Type> getTypesList();

    Usage getUsage();

    boolean hasAuthentication();

    boolean hasBackend();

    boolean hasBilling();

    boolean hasConfigVersion();

    boolean hasContext();

    boolean hasControl();

    boolean hasDocumentation();

    boolean hasHttp();

    boolean hasLogging();

    boolean hasMonitoring();

    boolean hasQuota();

    boolean hasSourceInfo();

    boolean hasSystemParameters();

    boolean hasUsage();
}
