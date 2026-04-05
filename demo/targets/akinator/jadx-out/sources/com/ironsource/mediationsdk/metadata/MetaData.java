package com.ironsource.mediationsdk.metadata;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class MetaData {

    /* renamed from: a, reason: collision with root package name */
    private String f37591a;

    /* renamed from: b, reason: collision with root package name */
    private List<String> f37592b;

    /* renamed from: c, reason: collision with root package name */
    private List<MetaDataValueTypes> f37593c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum MetaDataValueTypes {
        META_DATA_VALUE_STRING,
        META_DATA_VALUE_BOOLEAN,
        META_DATA_VALUE_INT,
        META_DATA_VALUE_LONG,
        META_DATA_VALUE_DOUBLE,
        META_DATA_VALUE_FLOAT
    }

    public MetaData(String str, List<String> list, List<MetaDataValueTypes> list2) {
        this.f37591a = str;
        this.f37592b = list;
        this.f37593c = list2;
    }

    public String getMetaDataKey() {
        return this.f37591a;
    }

    public List<String> getMetaDataValue() {
        return this.f37592b;
    }

    public List<MetaDataValueTypes> getMetaDataValueType() {
        return this.f37593c;
    }

    public MetaData(String str, List<String> list) {
        this.f37591a = str;
        this.f37592b = list;
        this.f37593c = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f37593c.add(MetaDataValueTypes.META_DATA_VALUE_STRING);
        }
    }
}
