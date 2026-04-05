package qk;

import bj.b0;
import bj.o1;
import bj.s;
import com.google.firebase.inappmessaging.CommonTypesProto$Priority;
import com.google.firebase.inappmessaging.CommonTypesProto$TriggeringCondition;
import com.google.firebase.inappmessaging.MessagesProto$Content;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ExperimentalCampaignPayload;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$VanillaCampaignPayload;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class f extends GeneratedMessageLite.Builder implements i {
    public f addAllTriggeringConditions(Iterable<? extends CommonTypesProto$TriggeringCondition> iterable) {
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).addAllTriggeringConditions(iterable);
        return this;
    }

    public f addTriggeringConditions(CommonTypesProto$TriggeringCondition commonTypesProto$TriggeringCondition) {
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).addTriggeringConditions(commonTypesProto$TriggeringCondition);
        return this;
    }

    public f clearContent() {
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).clearContent();
        return this;
    }

    public f clearDataBundle() {
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).getMutableDataBundleMap().clear();
        return this;
    }

    public f clearExperimentalPayload() {
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).clearExperimentalPayload();
        return this;
    }

    public f clearIsTestCampaign() {
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).clearIsTestCampaign();
        return this;
    }

    public f clearPayload() {
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).clearPayload();
        return this;
    }

    public f clearPriority() {
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).clearPriority();
        return this;
    }

    public f clearTriggeringConditions() {
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).clearTriggeringConditions();
        return this;
    }

    public f clearVanillaPayload() {
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).clearVanillaPayload();
        return this;
    }

    @Override // qk.i
    public boolean containsDataBundle(String str) {
        str.getClass();
        return ((CampaignProto$ThickContent) this.instance).getDataBundleMap().containsKey(str);
    }

    @Override // qk.i
    public MessagesProto$Content getContent() {
        return ((CampaignProto$ThickContent) this.instance).getContent();
    }

    @Override // qk.i
    @Deprecated
    public Map<String, String> getDataBundle() {
        return getDataBundleMap();
    }

    @Override // qk.i
    public int getDataBundleCount() {
        return ((CampaignProto$ThickContent) this.instance).getDataBundleMap().size();
    }

    @Override // qk.i
    public Map<String, String> getDataBundleMap() {
        return Collections.unmodifiableMap(((CampaignProto$ThickContent) this.instance).getDataBundleMap());
    }

    @Override // qk.i
    public String getDataBundleOrDefault(String str, String str2) {
        str.getClass();
        Map<String, String> dataBundleMap = ((CampaignProto$ThickContent) this.instance).getDataBundleMap();
        return dataBundleMap.containsKey(str) ? dataBundleMap.get(str) : str2;
    }

    @Override // qk.i
    public String getDataBundleOrThrow(String str) {
        str.getClass();
        Map<String, String> dataBundleMap = ((CampaignProto$ThickContent) this.instance).getDataBundleMap();
        if (dataBundleMap.containsKey(str)) {
            return dataBundleMap.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // qk.i
    public CampaignProto$ExperimentalCampaignPayload getExperimentalPayload() {
        return ((CampaignProto$ThickContent) this.instance).getExperimentalPayload();
    }

    @Override // qk.i
    public boolean getIsTestCampaign() {
        return ((CampaignProto$ThickContent) this.instance).getIsTestCampaign();
    }

    @Override // qk.i
    public h getPayloadCase() {
        return ((CampaignProto$ThickContent) this.instance).getPayloadCase();
    }

    @Override // qk.i
    public CommonTypesProto$Priority getPriority() {
        return ((CampaignProto$ThickContent) this.instance).getPriority();
    }

    @Override // qk.i
    public CommonTypesProto$TriggeringCondition getTriggeringConditions(int i10) {
        return ((CampaignProto$ThickContent) this.instance).getTriggeringConditions(i10);
    }

    @Override // qk.i
    public int getTriggeringConditionsCount() {
        return ((CampaignProto$ThickContent) this.instance).getTriggeringConditionsCount();
    }

    @Override // qk.i
    public List<CommonTypesProto$TriggeringCondition> getTriggeringConditionsList() {
        return Collections.unmodifiableList(((CampaignProto$ThickContent) this.instance).getTriggeringConditionsList());
    }

    @Override // qk.i
    public CampaignProto$VanillaCampaignPayload getVanillaPayload() {
        return ((CampaignProto$ThickContent) this.instance).getVanillaPayload();
    }

    @Override // qk.i
    public boolean hasContent() {
        return ((CampaignProto$ThickContent) this.instance).hasContent();
    }

    @Override // qk.i
    public boolean hasExperimentalPayload() {
        return ((CampaignProto$ThickContent) this.instance).hasExperimentalPayload();
    }

    @Override // qk.i
    public boolean hasPriority() {
        return ((CampaignProto$ThickContent) this.instance).hasPriority();
    }

    @Override // qk.i
    public boolean hasVanillaPayload() {
        return ((CampaignProto$ThickContent) this.instance).hasVanillaPayload();
    }

    public f mergeContent(MessagesProto$Content messagesProto$Content) {
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).mergeContent(messagesProto$Content);
        return this;
    }

    public f mergeExperimentalPayload(CampaignProto$ExperimentalCampaignPayload campaignProto$ExperimentalCampaignPayload) {
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).mergeExperimentalPayload(campaignProto$ExperimentalCampaignPayload);
        return this;
    }

    public f mergePriority(CommonTypesProto$Priority commonTypesProto$Priority) {
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).mergePriority(commonTypesProto$Priority);
        return this;
    }

    public f mergeVanillaPayload(CampaignProto$VanillaCampaignPayload campaignProto$VanillaCampaignPayload) {
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).mergeVanillaPayload(campaignProto$VanillaCampaignPayload);
        return this;
    }

    public f putAllDataBundle(Map<String, String> map) {
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).getMutableDataBundleMap().putAll(map);
        return this;
    }

    public f putDataBundle(String str, String str2) {
        str.getClass();
        str2.getClass();
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).getMutableDataBundleMap().put(str, str2);
        return this;
    }

    public f removeDataBundle(String str) {
        str.getClass();
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).getMutableDataBundleMap().remove(str);
        return this;
    }

    public f removeTriggeringConditions(int i10) {
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).removeTriggeringConditions(i10);
        return this;
    }

    public f setContent(MessagesProto$Content messagesProto$Content) {
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).setContent(messagesProto$Content);
        return this;
    }

    public f setExperimentalPayload(CampaignProto$ExperimentalCampaignPayload campaignProto$ExperimentalCampaignPayload) {
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).setExperimentalPayload(campaignProto$ExperimentalCampaignPayload);
        return this;
    }

    public f setIsTestCampaign(boolean z10) {
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).setIsTestCampaign(z10);
        return this;
    }

    public f setPriority(CommonTypesProto$Priority commonTypesProto$Priority) {
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).setPriority(commonTypesProto$Priority);
        return this;
    }

    public f setTriggeringConditions(int i10, CommonTypesProto$TriggeringCondition commonTypesProto$TriggeringCondition) {
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).setTriggeringConditions(i10, commonTypesProto$TriggeringCondition);
        return this;
    }

    public f setVanillaPayload(CampaignProto$VanillaCampaignPayload campaignProto$VanillaCampaignPayload) {
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).setVanillaPayload(campaignProto$VanillaCampaignPayload);
        return this;
    }

    public f addTriggeringConditions(int i10, CommonTypesProto$TriggeringCondition commonTypesProto$TriggeringCondition) {
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).addTriggeringConditions(i10, commonTypesProto$TriggeringCondition);
        return this;
    }

    public f setContent(o1 o1Var) {
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).setContent((MessagesProto$Content) o1Var.build());
        return this;
    }

    public f setExperimentalPayload(b bVar) {
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).setExperimentalPayload((CampaignProto$ExperimentalCampaignPayload) bVar.build());
        return this;
    }

    public f setPriority(s sVar) {
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).setPriority((CommonTypesProto$Priority) sVar.build());
        return this;
    }

    public f setTriggeringConditions(int i10, b0 b0Var) {
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).setTriggeringConditions(i10, (CommonTypesProto$TriggeringCondition) b0Var.build());
        return this;
    }

    public f setVanillaPayload(j jVar) {
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).setVanillaPayload((CampaignProto$VanillaCampaignPayload) jVar.build());
        return this;
    }

    public f addTriggeringConditions(b0 b0Var) {
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).addTriggeringConditions((CommonTypesProto$TriggeringCondition) b0Var.build());
        return this;
    }

    public f addTriggeringConditions(int i10, b0 b0Var) {
        copyOnWrite();
        ((CampaignProto$ThickContent) this.instance).addTriggeringConditions(i10, (CommonTypesProto$TriggeringCondition) b0Var.build());
        return this;
    }
}
