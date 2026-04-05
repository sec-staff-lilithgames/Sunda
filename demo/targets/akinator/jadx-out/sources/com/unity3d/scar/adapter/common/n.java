package com.unity3d.scar.adapter.common;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class n implements j {
    protected String _description;
    protected Object[] _errorArguments;
    private Enum _errorCategory;

    public n(Enum<?> r12, String str, Object... objArr) {
        this._errorCategory = r12;
        this._description = str;
        this._errorArguments = objArr;
    }

    @Override // com.unity3d.scar.adapter.common.j
    public int getCode() {
        return -1;
    }

    @Override // com.unity3d.scar.adapter.common.j
    public String getDescription() {
        return this._description;
    }

    @Override // com.unity3d.scar.adapter.common.j
    public String getDomain() {
        return null;
    }

    public Object[] getErrorArguments() {
        return this._errorArguments;
    }

    public Enum<?> getErrorCategory() {
        return this._errorCategory;
    }
}
