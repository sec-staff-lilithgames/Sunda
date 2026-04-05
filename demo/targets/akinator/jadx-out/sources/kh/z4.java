package kh;

import com.google.api.SystemParameter;
import com.google.api.SystemParameterRule;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class z4 extends GeneratedMessageLite.Builder implements a5 {
    public z4 addAllParameters(Iterable<? extends SystemParameter> iterable) {
        copyOnWrite();
        ((SystemParameterRule) this.instance).addAllParameters(iterable);
        return this;
    }

    public z4 addParameters(SystemParameter systemParameter) {
        copyOnWrite();
        ((SystemParameterRule) this.instance).addParameters(systemParameter);
        return this;
    }

    public z4 clearParameters() {
        copyOnWrite();
        ((SystemParameterRule) this.instance).clearParameters();
        return this;
    }

    public z4 clearSelector() {
        copyOnWrite();
        ((SystemParameterRule) this.instance).clearSelector();
        return this;
    }

    @Override // kh.a5
    public SystemParameter getParameters(int i10) {
        return ((SystemParameterRule) this.instance).getParameters(i10);
    }

    @Override // kh.a5
    public int getParametersCount() {
        return ((SystemParameterRule) this.instance).getParametersCount();
    }

    @Override // kh.a5
    public List<SystemParameter> getParametersList() {
        return Collections.unmodifiableList(((SystemParameterRule) this.instance).getParametersList());
    }

    @Override // kh.a5
    public String getSelector() {
        return ((SystemParameterRule) this.instance).getSelector();
    }

    @Override // kh.a5
    public ByteString getSelectorBytes() {
        return ((SystemParameterRule) this.instance).getSelectorBytes();
    }

    public z4 removeParameters(int i10) {
        copyOnWrite();
        ((SystemParameterRule) this.instance).removeParameters(i10);
        return this;
    }

    public z4 setParameters(int i10, SystemParameter systemParameter) {
        copyOnWrite();
        ((SystemParameterRule) this.instance).setParameters(i10, systemParameter);
        return this;
    }

    public z4 setSelector(String str) {
        copyOnWrite();
        ((SystemParameterRule) this.instance).setSelector(str);
        return this;
    }

    public z4 setSelectorBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((SystemParameterRule) this.instance).setSelectorBytes(byteString);
        return this;
    }

    public z4 addParameters(int i10, SystemParameter systemParameter) {
        copyOnWrite();
        ((SystemParameterRule) this.instance).addParameters(i10, systemParameter);
        return this;
    }

    public z4 setParameters(int i10, w4 w4Var) {
        copyOnWrite();
        ((SystemParameterRule) this.instance).setParameters(i10, (SystemParameter) w4Var.build());
        return this;
    }

    public z4 addParameters(w4 w4Var) {
        copyOnWrite();
        ((SystemParameterRule) this.instance).addParameters((SystemParameter) w4Var.build());
        return this;
    }

    public z4 addParameters(int i10, w4 w4Var) {
        copyOnWrite();
        ((SystemParameterRule) this.instance).addParameters(i10, (SystemParameter) w4Var.build());
        return this;
    }
}
