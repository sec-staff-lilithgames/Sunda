package kh;

import com.google.api.LabelDescriptor;
import com.google.api.MonitoredResourceDescriptor;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b3 extends GeneratedMessageLite.Builder implements c3 {
    public b3 addAllLabels(Iterable<? extends LabelDescriptor> iterable) {
        copyOnWrite();
        ((MonitoredResourceDescriptor) this.instance).addAllLabels(iterable);
        return this;
    }

    public b3 addLabels(LabelDescriptor labelDescriptor) {
        copyOnWrite();
        ((MonitoredResourceDescriptor) this.instance).addLabels(labelDescriptor);
        return this;
    }

    public b3 clearDescription() {
        copyOnWrite();
        ((MonitoredResourceDescriptor) this.instance).clearDescription();
        return this;
    }

    public b3 clearDisplayName() {
        copyOnWrite();
        ((MonitoredResourceDescriptor) this.instance).clearDisplayName();
        return this;
    }

    public b3 clearLabels() {
        copyOnWrite();
        ((MonitoredResourceDescriptor) this.instance).clearLabels();
        return this;
    }

    public b3 clearLaunchStage() {
        copyOnWrite();
        ((MonitoredResourceDescriptor) this.instance).clearLaunchStage();
        return this;
    }

    public b3 clearName() {
        copyOnWrite();
        ((MonitoredResourceDescriptor) this.instance).clearName();
        return this;
    }

    public b3 clearType() {
        copyOnWrite();
        ((MonitoredResourceDescriptor) this.instance).clearType();
        return this;
    }

    @Override // kh.c3
    public String getDescription() {
        return ((MonitoredResourceDescriptor) this.instance).getDescription();
    }

    @Override // kh.c3
    public ByteString getDescriptionBytes() {
        return ((MonitoredResourceDescriptor) this.instance).getDescriptionBytes();
    }

    @Override // kh.c3
    public String getDisplayName() {
        return ((MonitoredResourceDescriptor) this.instance).getDisplayName();
    }

    @Override // kh.c3
    public ByteString getDisplayNameBytes() {
        return ((MonitoredResourceDescriptor) this.instance).getDisplayNameBytes();
    }

    @Override // kh.c3
    public LabelDescriptor getLabels(int i10) {
        return ((MonitoredResourceDescriptor) this.instance).getLabels(i10);
    }

    @Override // kh.c3
    public int getLabelsCount() {
        return ((MonitoredResourceDescriptor) this.instance).getLabelsCount();
    }

    @Override // kh.c3
    public List<LabelDescriptor> getLabelsList() {
        return Collections.unmodifiableList(((MonitoredResourceDescriptor) this.instance).getLabelsList());
    }

    @Override // kh.c3
    public b2 getLaunchStage() {
        return ((MonitoredResourceDescriptor) this.instance).getLaunchStage();
    }

    @Override // kh.c3
    public int getLaunchStageValue() {
        return ((MonitoredResourceDescriptor) this.instance).getLaunchStageValue();
    }

    @Override // kh.c3
    public String getName() {
        return ((MonitoredResourceDescriptor) this.instance).getName();
    }

    @Override // kh.c3
    public ByteString getNameBytes() {
        return ((MonitoredResourceDescriptor) this.instance).getNameBytes();
    }

    @Override // kh.c3
    public String getType() {
        return ((MonitoredResourceDescriptor) this.instance).getType();
    }

    @Override // kh.c3
    public ByteString getTypeBytes() {
        return ((MonitoredResourceDescriptor) this.instance).getTypeBytes();
    }

    public b3 removeLabels(int i10) {
        copyOnWrite();
        ((MonitoredResourceDescriptor) this.instance).removeLabels(i10);
        return this;
    }

    public b3 setDescription(String str) {
        copyOnWrite();
        ((MonitoredResourceDescriptor) this.instance).setDescription(str);
        return this;
    }

    public b3 setDescriptionBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((MonitoredResourceDescriptor) this.instance).setDescriptionBytes(byteString);
        return this;
    }

    public b3 setDisplayName(String str) {
        copyOnWrite();
        ((MonitoredResourceDescriptor) this.instance).setDisplayName(str);
        return this;
    }

    public b3 setDisplayNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((MonitoredResourceDescriptor) this.instance).setDisplayNameBytes(byteString);
        return this;
    }

    public b3 setLabels(int i10, LabelDescriptor labelDescriptor) {
        copyOnWrite();
        ((MonitoredResourceDescriptor) this.instance).setLabels(i10, labelDescriptor);
        return this;
    }

    public b3 setLaunchStage(b2 b2Var) {
        copyOnWrite();
        ((MonitoredResourceDescriptor) this.instance).setLaunchStage(b2Var);
        return this;
    }

    public b3 setLaunchStageValue(int i10) {
        copyOnWrite();
        ((MonitoredResourceDescriptor) this.instance).setLaunchStageValue(i10);
        return this;
    }

    public b3 setName(String str) {
        copyOnWrite();
        ((MonitoredResourceDescriptor) this.instance).setName(str);
        return this;
    }

    public b3 setNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((MonitoredResourceDescriptor) this.instance).setNameBytes(byteString);
        return this;
    }

    public b3 setType(String str) {
        copyOnWrite();
        ((MonitoredResourceDescriptor) this.instance).setType(str);
        return this;
    }

    public b3 setTypeBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((MonitoredResourceDescriptor) this.instance).setTypeBytes(byteString);
        return this;
    }

    public b3 addLabels(int i10, LabelDescriptor labelDescriptor) {
        copyOnWrite();
        ((MonitoredResourceDescriptor) this.instance).addLabels(i10, labelDescriptor);
        return this;
    }

    public b3 setLabels(int i10, u1 u1Var) {
        copyOnWrite();
        ((MonitoredResourceDescriptor) this.instance).setLabels(i10, (LabelDescriptor) u1Var.build());
        return this;
    }

    public b3 addLabels(u1 u1Var) {
        copyOnWrite();
        ((MonitoredResourceDescriptor) this.instance).addLabels((LabelDescriptor) u1Var.build());
        return this;
    }

    public b3 addLabels(int i10, u1 u1Var) {
        copyOnWrite();
        ((MonitoredResourceDescriptor) this.instance).addLabels(i10, (LabelDescriptor) u1Var.build());
        return this;
    }
}
