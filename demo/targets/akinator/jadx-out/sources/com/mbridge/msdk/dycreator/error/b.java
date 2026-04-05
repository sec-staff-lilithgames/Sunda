package com.mbridge.msdk.dycreator.error;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public enum b {
    NOT_FOUND_VIEWOPTION(-101, "ViewOption is null"),
    NOT_FOUND_CONTEXT(-102, "context is null"),
    FILE_CREATE_VIEW_FILE(-103, "file create view is null"),
    CAMPAIGNEX_IS_NULL(-104, "Campaign size only one"),
    NOT_FOUND_CAMPAIGN(-105, "campaign is null"),
    NOT_FOUND_DYNAMIC_FILE(-106, "dynamic file is not exits"),
    BIND_DATA_FILE_OR_DIR(-107, "data file or file dir is not exits "),
    NOT_FOUND_DYNAMIC_OPTION(-108, "dynamic_option is not exits");


    /* renamed from: a, reason: collision with root package name */
    private int f40259a;

    /* renamed from: b, reason: collision with root package name */
    private String f40260b;

    b(int i10, String str) {
        this.f40259a = i10;
        this.f40260b = str;
    }

    public int a() {
        return this.f40259a;
    }

    public String b() {
        return this.f40260b;
    }
}
