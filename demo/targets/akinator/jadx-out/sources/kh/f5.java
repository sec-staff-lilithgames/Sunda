package kh;

import com.google.api.Usage;
import com.google.api.UsageRule;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f5 extends GeneratedMessageLite.Builder implements g5 {
    public f5 addAllRequirements(Iterable<String> iterable) {
        copyOnWrite();
        ((Usage) this.instance).addAllRequirements(iterable);
        return this;
    }

    public f5 addAllRules(Iterable<? extends UsageRule> iterable) {
        copyOnWrite();
        ((Usage) this.instance).addAllRules(iterable);
        return this;
    }

    public f5 addRequirements(String str) {
        copyOnWrite();
        ((Usage) this.instance).addRequirements(str);
        return this;
    }

    public f5 addRequirementsBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Usage) this.instance).addRequirementsBytes(byteString);
        return this;
    }

    public f5 addRules(UsageRule usageRule) {
        copyOnWrite();
        ((Usage) this.instance).addRules(usageRule);
        return this;
    }

    public f5 clearProducerNotificationChannel() {
        copyOnWrite();
        ((Usage) this.instance).clearProducerNotificationChannel();
        return this;
    }

    public f5 clearRequirements() {
        copyOnWrite();
        ((Usage) this.instance).clearRequirements();
        return this;
    }

    public f5 clearRules() {
        copyOnWrite();
        ((Usage) this.instance).clearRules();
        return this;
    }

    @Override // kh.g5
    public String getProducerNotificationChannel() {
        return ((Usage) this.instance).getProducerNotificationChannel();
    }

    @Override // kh.g5
    public ByteString getProducerNotificationChannelBytes() {
        return ((Usage) this.instance).getProducerNotificationChannelBytes();
    }

    @Override // kh.g5
    public String getRequirements(int i10) {
        return ((Usage) this.instance).getRequirements(i10);
    }

    @Override // kh.g5
    public ByteString getRequirementsBytes(int i10) {
        return ((Usage) this.instance).getRequirementsBytes(i10);
    }

    @Override // kh.g5
    public int getRequirementsCount() {
        return ((Usage) this.instance).getRequirementsCount();
    }

    @Override // kh.g5
    public List<String> getRequirementsList() {
        return Collections.unmodifiableList(((Usage) this.instance).getRequirementsList());
    }

    @Override // kh.g5
    public UsageRule getRules(int i10) {
        return ((Usage) this.instance).getRules(i10);
    }

    @Override // kh.g5
    public int getRulesCount() {
        return ((Usage) this.instance).getRulesCount();
    }

    @Override // kh.g5
    public List<UsageRule> getRulesList() {
        return Collections.unmodifiableList(((Usage) this.instance).getRulesList());
    }

    public f5 removeRules(int i10) {
        copyOnWrite();
        ((Usage) this.instance).removeRules(i10);
        return this;
    }

    public f5 setProducerNotificationChannel(String str) {
        copyOnWrite();
        ((Usage) this.instance).setProducerNotificationChannel(str);
        return this;
    }

    public f5 setProducerNotificationChannelBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Usage) this.instance).setProducerNotificationChannelBytes(byteString);
        return this;
    }

    public f5 setRequirements(int i10, String str) {
        copyOnWrite();
        ((Usage) this.instance).setRequirements(i10, str);
        return this;
    }

    public f5 setRules(int i10, UsageRule usageRule) {
        copyOnWrite();
        ((Usage) this.instance).setRules(i10, usageRule);
        return this;
    }

    public f5 addRules(int i10, UsageRule usageRule) {
        copyOnWrite();
        ((Usage) this.instance).addRules(i10, usageRule);
        return this;
    }

    public f5 setRules(int i10, i5 i5Var) {
        copyOnWrite();
        ((Usage) this.instance).setRules(i10, (UsageRule) i5Var.build());
        return this;
    }

    public f5 addRules(i5 i5Var) {
        copyOnWrite();
        ((Usage) this.instance).addRules((UsageRule) i5Var.build());
        return this;
    }

    public f5 addRules(int i10, i5 i5Var) {
        copyOnWrite();
        ((Usage) this.instance).addRules(i10, (UsageRule) i5Var.build());
        return this;
    }
}
