package kh;

import com.google.api.ResourceDescriptor;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h4 extends GeneratedMessageLite.Builder implements l4 {
    public h4 addAllPattern(Iterable<String> iterable) {
        copyOnWrite();
        ((ResourceDescriptor) this.instance).addAllPattern(iterable);
        return this;
    }

    public h4 addPattern(String str) {
        copyOnWrite();
        ((ResourceDescriptor) this.instance).addPattern(str);
        return this;
    }

    public h4 addPatternBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ResourceDescriptor) this.instance).addPatternBytes(byteString);
        return this;
    }

    public h4 clearHistory() {
        copyOnWrite();
        ((ResourceDescriptor) this.instance).clearHistory();
        return this;
    }

    public h4 clearNameField() {
        copyOnWrite();
        ((ResourceDescriptor) this.instance).clearNameField();
        return this;
    }

    public h4 clearPattern() {
        copyOnWrite();
        ((ResourceDescriptor) this.instance).clearPattern();
        return this;
    }

    public h4 clearPlural() {
        copyOnWrite();
        ((ResourceDescriptor) this.instance).clearPlural();
        return this;
    }

    public h4 clearSingular() {
        copyOnWrite();
        ((ResourceDescriptor) this.instance).clearSingular();
        return this;
    }

    public h4 clearType() {
        copyOnWrite();
        ((ResourceDescriptor) this.instance).clearType();
        return this;
    }

    @Override // kh.l4
    public k4 getHistory() {
        return ((ResourceDescriptor) this.instance).getHistory();
    }

    @Override // kh.l4
    public int getHistoryValue() {
        return ((ResourceDescriptor) this.instance).getHistoryValue();
    }

    @Override // kh.l4
    public String getNameField() {
        return ((ResourceDescriptor) this.instance).getNameField();
    }

    @Override // kh.l4
    public ByteString getNameFieldBytes() {
        return ((ResourceDescriptor) this.instance).getNameFieldBytes();
    }

    @Override // kh.l4
    public String getPattern(int i10) {
        return ((ResourceDescriptor) this.instance).getPattern(i10);
    }

    @Override // kh.l4
    public ByteString getPatternBytes(int i10) {
        return ((ResourceDescriptor) this.instance).getPatternBytes(i10);
    }

    @Override // kh.l4
    public int getPatternCount() {
        return ((ResourceDescriptor) this.instance).getPatternCount();
    }

    @Override // kh.l4
    public List<String> getPatternList() {
        return Collections.unmodifiableList(((ResourceDescriptor) this.instance).getPatternList());
    }

    @Override // kh.l4
    public String getPlural() {
        return ((ResourceDescriptor) this.instance).getPlural();
    }

    @Override // kh.l4
    public ByteString getPluralBytes() {
        return ((ResourceDescriptor) this.instance).getPluralBytes();
    }

    @Override // kh.l4
    public String getSingular() {
        return ((ResourceDescriptor) this.instance).getSingular();
    }

    @Override // kh.l4
    public ByteString getSingularBytes() {
        return ((ResourceDescriptor) this.instance).getSingularBytes();
    }

    @Override // kh.l4
    public String getType() {
        return ((ResourceDescriptor) this.instance).getType();
    }

    @Override // kh.l4
    public ByteString getTypeBytes() {
        return ((ResourceDescriptor) this.instance).getTypeBytes();
    }

    public h4 setHistory(k4 k4Var) {
        copyOnWrite();
        ((ResourceDescriptor) this.instance).setHistory(k4Var);
        return this;
    }

    public h4 setHistoryValue(int i10) {
        copyOnWrite();
        ((ResourceDescriptor) this.instance).setHistoryValue(i10);
        return this;
    }

    public h4 setNameField(String str) {
        copyOnWrite();
        ((ResourceDescriptor) this.instance).setNameField(str);
        return this;
    }

    public h4 setNameFieldBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ResourceDescriptor) this.instance).setNameFieldBytes(byteString);
        return this;
    }

    public h4 setPattern(int i10, String str) {
        copyOnWrite();
        ((ResourceDescriptor) this.instance).setPattern(i10, str);
        return this;
    }

    public h4 setPlural(String str) {
        copyOnWrite();
        ((ResourceDescriptor) this.instance).setPlural(str);
        return this;
    }

    public h4 setPluralBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ResourceDescriptor) this.instance).setPluralBytes(byteString);
        return this;
    }

    public h4 setSingular(String str) {
        copyOnWrite();
        ((ResourceDescriptor) this.instance).setSingular(str);
        return this;
    }

    public h4 setSingularBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ResourceDescriptor) this.instance).setSingularBytes(byteString);
        return this;
    }

    public h4 setType(String str) {
        copyOnWrite();
        ((ResourceDescriptor) this.instance).setType(str);
        return this;
    }

    public h4 setTypeBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ResourceDescriptor) this.instance).setTypeBytes(byteString);
        return this;
    }
}
