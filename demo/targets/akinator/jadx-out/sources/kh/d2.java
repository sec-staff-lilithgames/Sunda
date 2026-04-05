package kh;

import com.google.api.LabelDescriptor;
import com.google.api.LogDescriptor;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d2 extends GeneratedMessageLite.Builder implements e2 {
    public d2 addAllLabels(Iterable<? extends LabelDescriptor> iterable) {
        copyOnWrite();
        ((LogDescriptor) this.instance).addAllLabels(iterable);
        return this;
    }

    public d2 addLabels(LabelDescriptor labelDescriptor) {
        copyOnWrite();
        ((LogDescriptor) this.instance).addLabels(labelDescriptor);
        return this;
    }

    public d2 clearDescription() {
        copyOnWrite();
        ((LogDescriptor) this.instance).clearDescription();
        return this;
    }

    public d2 clearDisplayName() {
        copyOnWrite();
        ((LogDescriptor) this.instance).clearDisplayName();
        return this;
    }

    public d2 clearLabels() {
        copyOnWrite();
        ((LogDescriptor) this.instance).clearLabels();
        return this;
    }

    public d2 clearName() {
        copyOnWrite();
        ((LogDescriptor) this.instance).clearName();
        return this;
    }

    @Override // kh.e2
    public String getDescription() {
        return ((LogDescriptor) this.instance).getDescription();
    }

    @Override // kh.e2
    public ByteString getDescriptionBytes() {
        return ((LogDescriptor) this.instance).getDescriptionBytes();
    }

    @Override // kh.e2
    public String getDisplayName() {
        return ((LogDescriptor) this.instance).getDisplayName();
    }

    @Override // kh.e2
    public ByteString getDisplayNameBytes() {
        return ((LogDescriptor) this.instance).getDisplayNameBytes();
    }

    @Override // kh.e2
    public LabelDescriptor getLabels(int i10) {
        return ((LogDescriptor) this.instance).getLabels(i10);
    }

    @Override // kh.e2
    public int getLabelsCount() {
        return ((LogDescriptor) this.instance).getLabelsCount();
    }

    @Override // kh.e2
    public List<LabelDescriptor> getLabelsList() {
        return Collections.unmodifiableList(((LogDescriptor) this.instance).getLabelsList());
    }

    @Override // kh.e2
    public String getName() {
        return ((LogDescriptor) this.instance).getName();
    }

    @Override // kh.e2
    public ByteString getNameBytes() {
        return ((LogDescriptor) this.instance).getNameBytes();
    }

    public d2 removeLabels(int i10) {
        copyOnWrite();
        ((LogDescriptor) this.instance).removeLabels(i10);
        return this;
    }

    public d2 setDescription(String str) {
        copyOnWrite();
        ((LogDescriptor) this.instance).setDescription(str);
        return this;
    }

    public d2 setDescriptionBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((LogDescriptor) this.instance).setDescriptionBytes(byteString);
        return this;
    }

    public d2 setDisplayName(String str) {
        copyOnWrite();
        ((LogDescriptor) this.instance).setDisplayName(str);
        return this;
    }

    public d2 setDisplayNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((LogDescriptor) this.instance).setDisplayNameBytes(byteString);
        return this;
    }

    public d2 setLabels(int i10, LabelDescriptor labelDescriptor) {
        copyOnWrite();
        ((LogDescriptor) this.instance).setLabels(i10, labelDescriptor);
        return this;
    }

    public d2 setName(String str) {
        copyOnWrite();
        ((LogDescriptor) this.instance).setName(str);
        return this;
    }

    public d2 setNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((LogDescriptor) this.instance).setNameBytes(byteString);
        return this;
    }

    public d2 addLabels(int i10, LabelDescriptor labelDescriptor) {
        copyOnWrite();
        ((LogDescriptor) this.instance).addLabels(i10, labelDescriptor);
        return this;
    }

    public d2 setLabels(int i10, u1 u1Var) {
        copyOnWrite();
        ((LogDescriptor) this.instance).setLabels(i10, (LabelDescriptor) u1Var.build());
        return this;
    }

    public d2 addLabels(u1 u1Var) {
        copyOnWrite();
        ((LogDescriptor) this.instance).addLabels((LabelDescriptor) u1Var.build());
        return this;
    }

    public d2 addLabels(int i10, u1 u1Var) {
        copyOnWrite();
        ((LogDescriptor) this.instance).addLabels(i10, (LabelDescriptor) u1Var.build());
        return this;
    }
}
