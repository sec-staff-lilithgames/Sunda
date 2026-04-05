package bj;

import com.google.firebase.inappmessaging.CampaignAnalytics;
import com.google.firebase.inappmessaging.ClientAppInfo;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b extends GeneratedMessageLite.Builder implements d {
    public b clearCampaignId() {
        copyOnWrite();
        ((CampaignAnalytics) this.instance).clearCampaignId();
        return this;
    }

    public b clearClientApp() {
        copyOnWrite();
        ((CampaignAnalytics) this.instance).clearClientApp();
        return this;
    }

    public b clearClientTimestampMillis() {
        copyOnWrite();
        ((CampaignAnalytics) this.instance).clearClientTimestampMillis();
        return this;
    }

    public b clearDismissType() {
        copyOnWrite();
        ((CampaignAnalytics) this.instance).clearDismissType();
        return this;
    }

    public b clearEngagementMetricsDeliveryRetryCount() {
        copyOnWrite();
        ((CampaignAnalytics) this.instance).clearEngagementMetricsDeliveryRetryCount();
        return this;
    }

    public b clearEvent() {
        copyOnWrite();
        ((CampaignAnalytics) this.instance).clearEvent();
        return this;
    }

    public b clearEventType() {
        copyOnWrite();
        ((CampaignAnalytics) this.instance).clearEventType();
        return this;
    }

    public b clearFetchErrorReason() {
        copyOnWrite();
        ((CampaignAnalytics) this.instance).clearFetchErrorReason();
        return this;
    }

    public b clearFiamSdkVersion() {
        copyOnWrite();
        ((CampaignAnalytics) this.instance).clearFiamSdkVersion();
        return this;
    }

    public b clearProjectNumber() {
        copyOnWrite();
        ((CampaignAnalytics) this.instance).clearProjectNumber();
        return this;
    }

    public b clearRenderErrorReason() {
        copyOnWrite();
        ((CampaignAnalytics) this.instance).clearRenderErrorReason();
        return this;
    }

    @Override // bj.d
    public String getCampaignId() {
        return ((CampaignAnalytics) this.instance).getCampaignId();
    }

    @Override // bj.d
    public ByteString getCampaignIdBytes() {
        return ((CampaignAnalytics) this.instance).getCampaignIdBytes();
    }

    @Override // bj.d
    public ClientAppInfo getClientApp() {
        return ((CampaignAnalytics) this.instance).getClientApp();
    }

    @Override // bj.d
    public long getClientTimestampMillis() {
        return ((CampaignAnalytics) this.instance).getClientTimestampMillis();
    }

    @Override // bj.d
    public g0 getDismissType() {
        return ((CampaignAnalytics) this.instance).getDismissType();
    }

    @Override // bj.d
    public int getEngagementMetricsDeliveryRetryCount() {
        return ((CampaignAnalytics) this.instance).getEngagementMetricsDeliveryRetryCount();
    }

    @Override // bj.d
    public c getEventCase() {
        return ((CampaignAnalytics) this.instance).getEventCase();
    }

    @Override // bj.d
    public j0 getEventType() {
        return ((CampaignAnalytics) this.instance).getEventType();
    }

    @Override // bj.d
    public u0 getFetchErrorReason() {
        return ((CampaignAnalytics) this.instance).getFetchErrorReason();
    }

    @Override // bj.d
    public String getFiamSdkVersion() {
        return ((CampaignAnalytics) this.instance).getFiamSdkVersion();
    }

    @Override // bj.d
    public ByteString getFiamSdkVersionBytes() {
        return ((CampaignAnalytics) this.instance).getFiamSdkVersionBytes();
    }

    @Override // bj.d
    public String getProjectNumber() {
        return ((CampaignAnalytics) this.instance).getProjectNumber();
    }

    @Override // bj.d
    public ByteString getProjectNumberBytes() {
        return ((CampaignAnalytics) this.instance).getProjectNumberBytes();
    }

    @Override // bj.d
    public z1 getRenderErrorReason() {
        return ((CampaignAnalytics) this.instance).getRenderErrorReason();
    }

    @Override // bj.d
    public boolean hasCampaignId() {
        return ((CampaignAnalytics) this.instance).hasCampaignId();
    }

    @Override // bj.d
    public boolean hasClientApp() {
        return ((CampaignAnalytics) this.instance).hasClientApp();
    }

    @Override // bj.d
    public boolean hasClientTimestampMillis() {
        return ((CampaignAnalytics) this.instance).hasClientTimestampMillis();
    }

    @Override // bj.d
    public boolean hasDismissType() {
        return ((CampaignAnalytics) this.instance).hasDismissType();
    }

    @Override // bj.d
    public boolean hasEngagementMetricsDeliveryRetryCount() {
        return ((CampaignAnalytics) this.instance).hasEngagementMetricsDeliveryRetryCount();
    }

    @Override // bj.d
    public boolean hasEventType() {
        return ((CampaignAnalytics) this.instance).hasEventType();
    }

    @Override // bj.d
    public boolean hasFetchErrorReason() {
        return ((CampaignAnalytics) this.instance).hasFetchErrorReason();
    }

    @Override // bj.d
    public boolean hasFiamSdkVersion() {
        return ((CampaignAnalytics) this.instance).hasFiamSdkVersion();
    }

    @Override // bj.d
    public boolean hasProjectNumber() {
        return ((CampaignAnalytics) this.instance).hasProjectNumber();
    }

    @Override // bj.d
    public boolean hasRenderErrorReason() {
        return ((CampaignAnalytics) this.instance).hasRenderErrorReason();
    }

    public b mergeClientApp(ClientAppInfo clientAppInfo) {
        copyOnWrite();
        ((CampaignAnalytics) this.instance).mergeClientApp(clientAppInfo);
        return this;
    }

    public b setCampaignId(String str) {
        copyOnWrite();
        ((CampaignAnalytics) this.instance).setCampaignId(str);
        return this;
    }

    public b setCampaignIdBytes(ByteString byteString) {
        copyOnWrite();
        ((CampaignAnalytics) this.instance).setCampaignIdBytes(byteString);
        return this;
    }

    public b setClientApp(ClientAppInfo clientAppInfo) {
        copyOnWrite();
        ((CampaignAnalytics) this.instance).setClientApp(clientAppInfo);
        return this;
    }

    public b setClientTimestampMillis(long j10) {
        copyOnWrite();
        ((CampaignAnalytics) this.instance).setClientTimestampMillis(j10);
        return this;
    }

    public b setDismissType(g0 g0Var) {
        copyOnWrite();
        ((CampaignAnalytics) this.instance).setDismissType(g0Var);
        return this;
    }

    public b setEngagementMetricsDeliveryRetryCount(int i10) {
        copyOnWrite();
        ((CampaignAnalytics) this.instance).setEngagementMetricsDeliveryRetryCount(i10);
        return this;
    }

    public b setEventType(j0 j0Var) {
        copyOnWrite();
        ((CampaignAnalytics) this.instance).setEventType(j0Var);
        return this;
    }

    public b setFetchErrorReason(u0 u0Var) {
        copyOnWrite();
        ((CampaignAnalytics) this.instance).setFetchErrorReason(u0Var);
        return this;
    }

    public b setFiamSdkVersion(String str) {
        copyOnWrite();
        ((CampaignAnalytics) this.instance).setFiamSdkVersion(str);
        return this;
    }

    public b setFiamSdkVersionBytes(ByteString byteString) {
        copyOnWrite();
        ((CampaignAnalytics) this.instance).setFiamSdkVersionBytes(byteString);
        return this;
    }

    public b setProjectNumber(String str) {
        copyOnWrite();
        ((CampaignAnalytics) this.instance).setProjectNumber(str);
        return this;
    }

    public b setProjectNumberBytes(ByteString byteString) {
        copyOnWrite();
        ((CampaignAnalytics) this.instance).setProjectNumberBytes(byteString);
        return this;
    }

    public b setRenderErrorReason(z1 z1Var) {
        copyOnWrite();
        ((CampaignAnalytics) this.instance).setRenderErrorReason(z1Var);
        return this;
    }

    public b setClientApp(f fVar) {
        copyOnWrite();
        ((CampaignAnalytics) this.instance).setClientApp((ClientAppInfo) fVar.build());
        return this;
    }
}
